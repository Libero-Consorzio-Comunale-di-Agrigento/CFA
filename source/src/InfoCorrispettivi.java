// **********************************************
// Info Corrispettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoCorrispettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_CORRISPETTIV_CORRISPETTIV = 0;
  private static int GRP_CORRISPETTIV_ACCERTAMENTO = 1;
  private static int GRP_CORRISPETTIV_CAPITOLOART = 2;
  private static int GRP_CORRISPETTIV_ECONOMICA = 3;
  private static int GRP_CORRISPETTIV_INSERIMENTO = 4;
  private static int GRP_CORRISPETTIV_AGGIORNAMENT = 5;

  private static int PFL_CORRISPETTIV_NEWPANELLAB1 = 0;
  private static int PFL_CORRISPETTIV_NEWPANELABE1 = 1;
  private static int PFL_CORRISPETTIV_T04TIPOBOLLA = 2;
  private static int PFL_CORRISPETTIV_T04DESCRIZIO = 3;
  private static int PFL_CORRISPETTIV_TIPOBOLLLABE = 4;
  private static int PFL_CORRISPETTIV_NUM = 5;
  private static int PFL_CORRISPETTIV_DATAREG = 6;
  private static int PFL_CORRISPETTIV_TIPOBOLLATO1 = 7;
  private static int PFL_CORRISPETTIV_DESCRIZIONE = 8;
  private static int PFL_CORRISPETTIV_IMPORTO1 = 9;
  private static int PFL_CORRISPETTIV_NEWPANELABE2 = 10;
  private static int PFL_CORRISPETTIV_NEWPANELABE3 = 11;
  private static int PFL_CORRISPETTIV_ACCERTAMENTO = 12;
  private static int PFL_CORRISPETTIV_NUMEROACC = 13;
  private static int PFL_CORRISPETTIV_ANNOACC = 14;
  private static int PFL_CORRISPETTIV_ACCDESCRIZIO = 15;
  private static int PFL_CORRISPETTIV_NEWPANELLAB2 = 16;
  private static int PFL_CORRISPETTIV_CAPITOLO1 = 17;
  private static int PFL_CORRISPETTIV_ARTICOLO1 = 18;
  private static int PFL_CORRISPETTIV_CAPITOLO = 19;
  private static int PFL_CORRISPETTIV_ARTICOLO = 20;
  private static int PFL_CORRISPETTIV_VOCEPEG = 21;
  private static int PFL_CORRISPETTIV_NUMEROORD = 22;
  private static int PFL_CORRISPETTIV_ANNOORD = 23;
  private static int PFL_CORRISPETTIV_ORDINATIVO = 24;
  private static int PFL_CORRISPETTIV_ANNOREG1 = 25;
  private static int PFL_CORRISPETTIV_TIPOREGISTR1 = 26;
  private static int PFL_CORRISPETTIV_LABEL = 27;
  private static int PFL_CORRISPETTIV_INFOACC = 28;
  private static int PFL_CORRISPETTIV_LABELSLASH = 29;
  private static int PFL_CORRISPETTIV_INFOVOCE = 30;
  private static int PFL_CORRISPETTIV_NEWPANELLABE = 31;
  private static int PFL_CORRISPETTIV_CENTRO = 32;
  private static int PFL_CORRISPETTIV_CENTRIDESCRI = 33;
  private static int PFL_CORRISPETTIV_COMPETENZDAL = 34;
  private static int PFL_CORRISPETTIV_AL = 35;
  private static int PFL_CORRISPETTIV_FATTORE = 36;
  private static int PFL_CORRISPETTIV_FATTORDESCRI = 37;
  private static int PFL_CORRISPETTIV_UTENTE1 = 38;
  private static int PFL_CORRISPETTIV_DATA1 = 39;
  private static int PFL_CORRISPETTIV_UTENTE = 40;
  private static int PFL_CORRISPETTIV_DATA2 = 41;
  private static int PFL_CORRISPETTIV_CONTABILE = 42;
  private static int PFL_CORRISPETTIV_DATA = 43;
  private static int PFL_CORRISPETTIV_DATAINCASCCP = 44;
  private static int PFL_CORRISPETTIV_DATAESTRACCP = 45;
  private static int PFL_CORRISPETTIV_TIPOQUIETANZ = 46;
  private static int PFL_CORRISPETTIV_T04FLAIMPECO = 47;
  private static int PFL_CORRISPETTIV_T04VENTILIVA = 48;
  private static int PFL_CORRISPETTIV_IVADEF = 49;
  private static int PFL_CORRISPETTIV_FATTORITIPO = 50;
  private static int PFL_CORRISPETTIV_ESERCIZIO = 51;
  private static int PFL_CORRISPETTIV_ANNOPRE = 52;
  private static int PFL_CORRISPETTIV_NUMEROPRE = 53;
  private static int PFL_CORRISPETTIV_PASSATOCDR = 54;
  private static int PFL_CORRISPETTIV_E = 55;
  private static int PFL_CORRISPETTIV_CONTORICAVO = 56;
  private static int PFL_CORRISPETTIV_CENTROCOSTO = 57;
  private static int PFL_CORRISPETTIV_CODICERECORD = 58;
  private static int PFL_CORRISPETTIV_LABELSLASH1 = 59;

  private static int PPQRY_TCO1 = 0;

  private static int PPQRY_T04 = 1;
  private static int PPQRY_ACC = 2;
  private static int PPQRY_DUAL1 = 3;
  private static int PPQRY_FATTORI = 4;
  private static int PPQRY_CENTRI = 5;

  private static int PPQRY_T6 = 6;
  private static int PPQRY_DUAL2 = 7;
  private static int PPQRY_DUAL = 8;
  private static int PPQRY_T02 = 9;


  IDPanel PAN_CORRISPETTIV;
  private static int PFL_IVA_ALIQUOTA = 0;
  private static int PFL_IVA_ESENZIONE = 1;
  private static int PFL_IVA_IMPORTO = 2;
  private static int PFL_IVA_IMPONIBILE = 3;
  private static int PFL_IVA_IVA = 4;
  private static int PFL_IVA_TOTALEIMPORT = 5;
  private static int PFL_IVA_TOTALEIMPONI = 6;
  private static int PFL_IVA_TOTALEIVA = 7;
  private static int PFL_IVA_INTESTAZIONE = 8;
  private static int PFL_IVA_UTENTEINSERI = 9;
  private static int PFL_IVA_DATAINSERIME = 10;
  private static int PFL_IVA_UTENTULTIAGG = 11;
  private static int PFL_IVA_DATAULTIMAGG = 12;
  private static int PFL_IVA_ANNOREG = 13;
  private static int PFL_IVA_NUMEROREG = 14;
  private static int PFL_IVA_TIPOBOLLATO = 15;
  private static int PFL_IVA_TIPOREGISTRO = 16;

  private static int PPQRY_DCO = 0;

  private static int PPQRY_T06 = 1;


  IDPanel PAN_IVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM57(IMDB);
    //
    //
    Init_PQRY_TCO1(IMDB);
    Init_PQRY_DCO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM57(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM57, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM57, "TBL_PARAM57");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMANNREG, "ROWNAMANNREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMANNREG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMNUMREG, "ROWNAMNUMREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMNUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMEPERSO, "ROWNAMEPERSO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM57,IMDBDef2.FLD_PARAM57_ROWNAMEPERSO,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM57, 0);
  }

  private static void Init_PQRY_TCO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TCO1, 36);
    IMDB.set_TblCode(IMDBDef10.PQRY_TCO1, "PQRY_TCO1");
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_REG, "ANNO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CONTO_RICAVO, "CONTO_RICAVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CONTO_RICAVO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CENTRO_COSTO, "CENTRO_COSTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CENTRO_COSTO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CODICE_RECORD, "CODICE_RECORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CODICE_RECORD,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_IVA_DEF, "IVA_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_IVA_DEF,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_PASSATO_CDR, "PASSATO_CDR");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_PASSATO_CDR,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_E, "E");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_E,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_ESTRATTO_CCP, "DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_ESTRATTO_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_CCP, "DATA_CCP");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TIPO_QUIETANZA, "TIPO_QUIETANZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TIPO_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TCOIMPORTO, "TCOIMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO1,IMDBDef10.PQSL_TCO1_TCOIMPORTO,3,28,6);
    IMDB.TblAddNew(IMDBDef10.PQRY_TCO1, 0);
  }

  private static void Init_PQRY_DCO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DCO, 14);
    IMDB.set_TblCode(IMDBDef10.PQRY_DCO, "PQRY_DCO");
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_ALIQUOTA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_CODICE_ESENZIONE, "CODICE_ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_CODICE_ESENZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_IMPONIBILE, "IMPONIBILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_IMPONIBILE,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_ANNO_REG, "ANNO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_ANNO_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO,IMDBDef10.PQSL_DCO_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DCO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoCorrispettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoCorrispettivi()
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
    FormIdx = MyGlb.FRM_INFOCORRISPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "68A90DCA-7AAE-4BAF-B397-8E868229C197";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 640;
    DesignHeight = 582;
    set_Caption(new IDVariant("Info Corrispettivi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 640;
    Frames[1].Height = 556;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 556;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "89C78BEE-6303-40FC-A883-CE53551A8961";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Corrispettivi";
    Frames[2].Parent = this;
    PAN_CORRISPETTIV = new IDPanel(w, this, 2, "PAN_CORRISPETTIV");
    Frames[2].Content = PAN_CORRISPETTIV;
    PAN_CORRISPETTIV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CORRISPETTIV.VS = MainFrm.VisualStyleList;
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 640-MyGlb.PAN_OFFS_X, 556-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6610CED2-B643-4884-9F29-EB5F88CFF81B");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 920, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CORRISPETTIV.InitStatus = 2;
    PAN_CORRISPETTIV_Init();
    PAN_CORRISPETTIV_InitFields();
    PAN_CORRISPETTIV_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Corrispettivi", "Testata Corrispettivi");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Iva";
    Frames[3].Parent = this;
    PAN_IVA = new IDPanel(w, this, 3, "PAN_IVA");
    Frames[3].Content = PAN_IVA;
    PAN_IVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IVA.VS = MainFrm.VisualStyleList;
    PAN_IVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 640-MyGlb.PAN_OFFS_X, 556-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "24A09EC5-E68F-432C-A256-2320161DE04E");
    PAN_IVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 512, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IVA.InitStatus = 2;
    PAN_IVA_Init();
    PAN_IVA_InitFields();
    PAN_IVA_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Iva", "Dettagli Corrispettivi");
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
      PAN_CORRISPETTIV.UpdatePanel(MainFrm);
      PAN_IVA.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoCorrispettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoCorrispettivi.class.getName() : (Glb.ClassWithPackage(InfoCorrispettivi.class) ? InfoCorrispettivi.class.getName().substring(InfoCorrispettivi.class.getPackage().getName().length() + 1) : InfoCorrispettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Iva After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_IVA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva After Find Event Body
      // Procedure Body
      // 
      SettaImporti();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "IvaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Tab Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_TAB_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DEL = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Corrispettivo n. ", IDVariant.STRING));
      v_DEL = (new IDVariant(" del ", IDVariant.STRING));
      // 
      // Tab Change Page Event Body
      // Procedure Body
      // 
      PAN_IVA.set_FieldText(PFL_IVA_INTESTAZIONE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_NUMERO_REG, 0))), v_DEL), MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_D_DATA_REG, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_DESCRIZIONE, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "TabChangePageEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PERSONALIZZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Corrispettivi", IDVariant.STRING));
      v_DW = (new IDVariant("w_dco_tco_apri", IDVariant.STRING));
      v_DW1 = (new IDVariant("w_dco_tco_apri_bi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_IVA.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      v_PERSONALIZZA = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_DW);
      if (v_PERSONALIZZA.compareTo(v_DW1, true)!=0)
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CORRISPETTIV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CORRISPETTIV);
      // 
      // Corrispettivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      DisabilitaCampiCorrispettivi();
      VisibilitàDescrizioniVocePeg();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "CorrispettiviOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Setta Importi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaImporti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Importi Body
      // Procedure Body
      // 
      PAN_IVA.set_FieldText(PFL_IVA_TOTALEIMPORT, IDL.ToString(IDL.NullValue(PAN_IVA.GetFieldSum(PFL_IVA_IMPORTO),(new IDVariant(0)))).stringValue());
      PAN_IVA.set_FieldText(PFL_IVA_TOTALEIMPONI, IDL.ToString(IDL.NullValue(PAN_IVA.GetFieldSum(PFL_IVA_IMPONIBILE),(new IDVariant(0)))).stringValue());
      PAN_IVA.set_FieldText(PFL_IVA_TOTALEIVA, IDL.ToString(IDL.NullValue(PAN_IVA.GetFieldSum(PFL_IVA_IVA),(new IDVariant(0)))).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "SettaImporti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi Corrispettivi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DisabilitaCampiCorrispettivi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Campi Corrispettivi Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04FLAIMPECO))).equals((new IDVariant("SI")), true))
      {
        if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_ANNO_ACC, 0))))
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_ARTICOLO, 0))))
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "DisabilitaCampiCorrispettivi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Acc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "InfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVoce ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "InfoVoce", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Descrizioni Voce Peg
  // **********************************************************************
  public int VisibilitàDescrizioniVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Descrizioni Voce Peg Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoCorrispettivi", "VisibilitàDescrizioniVocePeg", _e);
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
    TAB_TAB_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CORRISPETTIV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CORRISPETTIV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CORRISPETTIV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CORRISPETTIV, Cancel);
    // Stub
  }

  private void PAN_CORRISPETTIV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CORRISPETTIV_INFOACC)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISPETTIV_INFOVOCE)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVoce();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CORRISPETTIV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CORRISPETTIV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_TIPO_REGISTRO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_TIPO_REGISTRO, 0, (new IDVariant(4)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_E, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_CODICE_RECORD, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO1, IMDBDef10.PQSL_TCO1_CODICE_RECORD, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_CORRISPETTIV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IVA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IVA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IVA);
    // Stub
  }

  private void PAN_IVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO, IMDBDef10.PQSL_DCO_TIPO_REGISTRO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DCO, IMDBDef10.PQSL_DCO_TIPO_REGISTRO, 0, (new IDVariant(4)));
      }
      if (Cancel.isFalse())
      {
        PAN_IVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CORRISPETTIV_Init()
  {

    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, "AA5D7D36-1152-4586-9D84-D62EDC80BDB1");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, "Corrispettivo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_FORM, 16, 7, 276, 37, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, 0, 74);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, "2188941B-F2AB-4FA4-9FC6-04959686E359");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, "Accertamento");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 16, 71, 560, 37, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 0, 81);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, "B7BD0BAB-AE97-4B1A-AE46-BB3B88ACF853");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, "Capitolo/Art");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, MyGlb.PANEL_FORM, 16, 111, 560, 81, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, 0, 70);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, "148E157D-09A8-4544-88E4-5A6A192C66F6");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, "Economica");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, MyGlb.PANEL_FORM, 16, 203, 560, 77, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 0, 60);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, "F51E6251-2D7C-4C30-9D81-5D9C6D490CBE");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, "Inserimento");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, MyGlb.PANEL_FORM, 24, 383, 256, 49, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 0, 70);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, "0328F35F-D3B7-4DEA-B89D-243488824E3E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, "Aggiornamento");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, MyGlb.PANEL_FORM, 300, 383, 256, 49, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 0, 88);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_FIELD, 60);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, "D25ECA0E-D592-424E-841D-A058EB85A2D2");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, "1E6502B6-9C45-463B-B321-B457DF9B6EC0");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, "9072AAD4-160C-48AE-8252-59E72171D880");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, "T04 TIPO BOLLATO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, "E30E86D4-2FC3-4B82-AA06-916DE45D635B");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, "T04 DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, "F5990E25-8969-463D-9BB5-84FE3195EF91");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, "Tipo Bollato");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, 0 | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, "EE5FACA3-F96A-457F-A70E-51059F4C52A5");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, "Num.");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, "ADF7D10A-43F3-4B55-96A5-6A1B93DDB190");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, "Data Reg");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, "8D58F6A9-A00D-4B2A-BB55-FF273B018240");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, "Tipo Bollato");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "5A806A15-B6B2-4AFB-8987-BFAEDC759972");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "Descrizione");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, "69D0F859-FF3F-4D38-8A9B-2C3AF5360600");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, "Importo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, "Importo Corrispettivo");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, "5FE4F278-9651-4A1D-BC94-82744B1220F9");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, "329C565D-E21A-4D88-A7FD-FB0B15624152");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, "E31DAF17-A6EC-4DBF-BE38-79A8FDF2BC76");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, "Accertamento");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, 0 | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, "DA79FF02-4CFB-4C8D-99ED-876CC026C692");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, "NUMERO ACC");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, "E49AA996-ED4F-42E9-8139-0768B567851E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, "ANNO ACC");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, "80660A55-7F4E-4AB2-8E86-B7DE086B6ECC");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, "ACC DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, "5A392EFA-E37C-4EAC-B7AA-33D5A14EF45E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, "Text to show here");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, "CC705BE5-066B-4FBA-998E-E530E4702DF8");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, "Capitolo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, "90641CA1-4717-4A0E-BDE3-794C72AAD3BE");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, "Articolo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, "86705C9C-3DFE-49CF-AB51-18E147860F36");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, "CAPITOLO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, "FED085EF-1A33-4CFA-8FC3-B1B36A578345");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, "ARTICOLO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, "C5654B15-CC18-4994-A3A9-833B775C72A5");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, "Voce P.e.g.");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, 0 | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, "0A0D501B-47A1-4958-BDD8-A3763AF7CB37");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, "NUMERO ORD");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, "06D56073-A424-484B-8396-D5BE68908941");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, "ANNO ORD");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, "B5EA78B7-0459-4BEF-8325-FB98DC3C2D3B");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, "Ordinativo");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, 0 | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, "41DF3F5B-1ADB-4269-A74C-7907468A2EFB");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, "ANNO REG");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, "448B6CD1-3557-4D0D-AB68-CC4B9213BD7F");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, "TIPO REGISTRO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, "7717C0C9-5067-4294-A9A2-3BEEBE8DF82B");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, "- Del");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, "9AED9C57-8C47-49A8-8FAD-C3313CEF718C");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_CORRISPETTIV.SetImage(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, 0, "info.gif", false);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, "E7AF16CD-5499-4F83-9747-9AA81614DE12");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, "/");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, "56BA32D1-ECF5-4AD4-9182-BBA5FF06507E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_CORRISPETTIV.SetImage(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, 0, "info.gif", false);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, "0F1D6121-56C3-47BB-AB74-73B7C2A3B7CC");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, "BEBBCC98-D9F6-41C3-ADA7-01C12205F78B");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, "Centro");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, "784008F7-DEB7-4FCC-AD57-C12999D0F284");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, "D3F66E7A-8C6A-4C82-A101-D5C8AE06368C");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, "Competenza dal");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, "61CB0C95-02EA-46FC-A97E-E6035B137FCF");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, "al");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, "95B57B20-2A89-40DE-9543-0C473ED14B04");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, "Fattore");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, "DE08DE19-4861-483F-A36E-E55046B4790F");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, "8873C58C-1F5E-4B7E-AD7C-32985BC96494");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, "Utente");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, "06BA1EDD-D129-4A86-9D0F-41359E8B1BCA");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, "Data");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, "533B197C-FAC7-4674-B04F-5E2BD01F6008");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, "Utente ");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, "8A35C699-4996-45F5-B48B-68A622753A43");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, "Data ");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, "771393BF-0830-4E85-B19C-9BD7187EF7EB");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, "Contabile");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, "131D8A31-599D-44A0-8055-FC0B5FD52949");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, "Data  ");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, "FFAFF6FB-D1B3-4E00-9685-499B81B471C9");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, "Data incasso c.c.p.");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, "6CC5D62E-B14B-4182-99EA-F4A09F4F739A");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, "Data estratto c.c.p.");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, "7D3A78BB-0E32-4B99-BC7B-9FCD4D196C00");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, "Tipo Quietanza");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, "E086F362-4F2A-48D7-8786-65C1A48204CA");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, "T04 FLAG IMP ECO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, "AFACE3CB-1F32-44BF-8919-20C130E96A74");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, "T04 VENTILAZIONE IVA");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, "2ED6B0BC-0650-43A0-B659-2533ABBBF536");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, "IVA DEF");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, "0019396A-1518-4AA2-8620-2E5E93A7461F");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, "FATTORI TIPO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, "25AE2E65-18BC-4A7E-BCBE-1F38A0BD49A0");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, "ESERCIZIO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, "EBF8BB53-34D9-4B1A-A2F7-B72BD27A4D95");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, "ANNO PRE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, "FFAA4EC0-046D-4362-A826-4ACF68FB5423");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, "NUMERO PRE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, "98B50B5B-8334-473A-A818-5FF28B8DB070");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, "PASSATO CDR");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, "0D43C63F-31E8-4CA0-B288-532FCE5DE022");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, "E");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, "1251AF80-8302-4CF0-BE7D-AA611A6ABE69");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, "CONTO RICAVO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, "E2557164-3674-4380-AEA7-AF81BE38FC4B");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, "CENTRO COSTO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, "6DBE9718-7E0C-4212-A401-4CB918BABAFD");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, "CODICE RECORD");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.VIS_NONNULLAFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, "478A2AC8-A9B3-4706-A795-86ABFCB5BF9A");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, "/");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_CORRISPETTIV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.PANEL_LIST, 192, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.PANEL_FORM, 20, 32, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELLAB1, -1, GRP_CORRISPETTIV_CORRISPETTIV);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.PANEL_LIST, 200, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.PANEL_FORM, 264, 32, 24, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELABE1, -1, GRP_CORRISPETTIV_CORRISPETTIV);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, 0, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, 104);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, "T. T. B.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, 4, 420, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, 104);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, "T04 TP. BOLLATO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_T04TIPOBOLLA, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_T04TIPOBOLLA, PPQRY_T04, "A.TIPO_BOLLATO", "T04TIPOBOLLA", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, 28, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, "T04 DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, 4, 436, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, "T04 DESCR.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_T04DESCRIZIO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_T04DESCRIZIO, PPQRY_T04, "A.DESCRIZIONE", "T04DESCRIZIO", 5, 40, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_LIST, 0, 0, 220, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_FORM, 0, 0, 240, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_FORM, 2);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOBOLLLABE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOBOLLLABE, -1, "", "TIPOBOLLLABE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, 220, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, "Num.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, 104, 12, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, "Num.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUM, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUM, PPQRY_TCO1, "A.NUMERO_REG", "NUMERO_REG", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, 276, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, "Data Reg");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, 200, 12, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATAREG, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATAREG, PPQRY_TCO1, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, 0, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, 292, 12, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOBOLLATO1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOBOLLATO1, PPQRY_TCO1, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 356, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 16, 48, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DESCRIZIONE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DESCRIZIONE, PPQRY_TCO1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_LIST, 564, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_LIST, 48);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_FORM, 372, 116, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_FORM, 48);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_FORM, "Imp.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_IMPORTO1, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  SUM(B.IMPORTO) ");
  SQL.append("from ");
  SQL.append("  DCO B ");
  SQL.append("where (B.ANNO_REG = A.ANNO_REG) ");
  SQL.append("and   (B.NUMERO_REG = A.NUMERO_REG) ");
  SQL.append("and   (B.TIPO_BOLLATO = A.TIPO_BOLLATO) ");
  SQL.append("and   (B.TIPO_REGISTRO = A.TIPO_REGISTRO) ");
  SQL.append(")");
    PAN_CORRISPETTIV.SetFieldUnbound(PFL_CORRISPETTIV_IMPORTO1, true);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_IMPORTO1, PPQRY_TCO1, SQL.toString(), "TCOIMPORTO", 3, 28, 6, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.PANEL_LIST, 200, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.PANEL_FORM, 20, 96, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELABE2, -1, GRP_CORRISPETTIV_ACCERTAMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_LIST, 208, 88, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_FORM, 564, 96, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELABE3, -1, GRP_CORRISPETTIV_ACCERTAMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 800, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 672, 8, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ACCERTAMENTO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, 800, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, 144, 76, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROACC, PPQRY_TCO1, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, 852, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, 212, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOACC, PPQRY_TCO1, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, "ACC DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, 256, 76, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, "ACC DESCR.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ACCDESCRIZIO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ACCDESCRIZIO, PPQRY_ACC, "A.DESCRIZIONE", "ACCDESCRIZIO", 5, 140, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_LIST, 192, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_FORM, 20, 136, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELLAB2, -1, GRP_CORRISPETTIV_CAPITOLOART);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELLAB2, -1, "", "NEWPANELLAB2", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, 72);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, 80, 144, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CAPITOLO1, -1, GRP_CORRISPETTIV_CAPITOLOART);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CAPITOLO1, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,0)", "CAPCAPITOLO", 5, 99, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, 84, 168, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, 56);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ARTICOLO1, -1, GRP_CORRISPETTIV_CAPITOLOART);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ARTICOLO1, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,~~ARTICOLO~~)", "CAPARTICOLO", 5, 99, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, 720, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, 144, 116, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CAPITOLO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CAPITOLO, PPQRY_TCO1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, 772, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, 280, 116, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ARTICOLO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ARTICOLO, PPQRY_TCO1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_LIST, 664, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_FORM, 664, 0, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_VOCEPEG, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_VOCEPEG, -1, "", "VOCEPEG", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, 888, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, 4, 386, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROORD, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROORD, PPQRY_TCO1, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, 940, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, 4, 410, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOORD, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOORD, PPQRY_TCO1, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_LIST, 888, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_FORM, 680, 16, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ORDINATIVO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ORDINATIVO, -1, "", "ORDINATIVO", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_LIST, "ANNO REG");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_FORM, 4, 436, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.PANEL_FORM, "ANN. REG");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOREG1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOREG1, PPQRY_TCO1, "A.ANNO_REG", "ANNO_REG", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, 4, 436, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOREGISTR1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOREGISTR1, PPQRY_TCO1, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 152, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 160, 12, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_LABEL, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_LIST, 180, 168, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_FORM, 540, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_INFOACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_LIST, 168, 164, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_FORM, 264, 116, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_LABELSLASH, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_LABELSLASH, -1, "", "LABELSLASH", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_LIST, 188, 176, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_FORM, 316, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_INFOVOCE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_INFOVOCE, -1, "", "INFOVOCE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_LIST, 192, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 228, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELLABE, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, 88, 232, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CENTRO, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CENTRO, PPQRY_TCO1, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, 232, 232, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CENTRIDESCRI, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, 40, 256, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_COMPETENZDAL, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_COMPETENZDAL, PPQRY_TCO1, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, 92);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, "al");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, 224, 256, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, 24);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, "al");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_AL, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_AL, PPQRY_TCO1, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, 88, 208, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_FATTORE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_FATTORE, PPQRY_TCO1, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, 232, 208, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_FATTORDESCRI, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, 28, 408, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, 56);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_UTENTE1, -1, GRP_CORRISPETTIV_INSERIMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_UTENTE1, PPQRY_TCO1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, 160, 408, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, 44);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATA1, -1, GRP_CORRISPETTIV_INSERIMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATA1, PPQRY_TCO1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, 304, 408, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, 56);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_UTENTE, -1, GRP_CORRISPETTIV_AGGIORNAMENT);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_UTENTE, PPQRY_TCO1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, "Data ");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, 436, 408, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, 44);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, "Data ");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATA2, -1, GRP_CORRISPETTIV_AGGIORNAMENT);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATA2, PPQRY_TCO1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, 112);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, "Contabile");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, 72, 284, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, "Contabile");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CONTABILE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CONTABILE, PPQRY_TCO1, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, "Data  ");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, 320, 284, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, 36);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, "Data  ");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATA, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATA, PPQRY_TCO1, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, "Data incasso c.c.p.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, 16, 308, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, "Data incasso c.c.p.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATAINCASCCP, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATAINCASCCP, PPQRY_TCO1, "A.DATA_CCP", "DATA_CCP", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, "Data estratto c.c.p.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, 232, 308, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, "Data estratto c.c.p.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATAESTRACCP, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATAESTRACCP, PPQRY_TCO1, "A.DATA_ESTRATTO_CCP", "DATA_ESTRATTO_CCP", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1112, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, "Tipo Quietanza");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, 44, 332, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, "Tipo Quietanza");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOQUIETANZ, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOQUIETANZ, PPQRY_TCO1, "A.TIPO_QUIETANZA", "TIPO_QUIETANZA", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_LIST, "T04 FLAG IMP ECO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_FORM, 4, 396, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.PANEL_FORM, "T0. FLG. IMP ECO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_T04FLAIMPECO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_T04FLAIMPECO, PPQRY_T04, "A.FLAG_IMP_ECO", "T04FLAIMPECO", 5, 2, 0, -13997);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_T04FLAIMPECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_T04FLAIMPECO, (new IDVariant()), "Null", "", "", -1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_LIST, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_LIST, "T04 VENTILAZIONE IVA");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_FORM, 4, 396, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_FORM, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.PANEL_FORM, "T04 VENTIL. IVA");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_T04VENTILIVA, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_T04VENTILIVA, PPQRY_T04, "A.VENTILAZIONE_IVA", "T04VENTILIVA", 5, 2, 0, -13997);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_T04VENTILIVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_T04VENTILIVA, (new IDVariant()), "Null", "", "", -1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_LIST, 48);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_LIST, "IVA DEF");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_FORM, 4, 396, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_FORM, 48);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.PANEL_FORM, "IV. DEF");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_IVADEF, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_IVADEF, PPQRY_TCO1, "A.IVA_DEF", "IVA_DEF", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_LIST, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_LIST, "FATTORI TIPO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_FORM, 4, 396, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_FORM, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.PANEL_FORM, "FATT. TIPO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_FATTORITIPO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_FATTORITIPO, PPQRY_FATTORI, "A.TIPO", "FATTORITIPO", 5, 1, 0, -13997);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_FATTORITIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_FATTORITIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_FATTORITIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_FORM, 4, 396, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ESERCIZIO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ESERCIZIO, PPQRY_TCO1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, 976, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, "ANNO PRE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, 4, 396, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, "ANNO PRE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOPRE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOPRE, PPQRY_TCO1, "A.ANNO_PRE", "ANNO_PRE", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, 1036, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, "NUMERO PRE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, 4, 420, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, "NUM. PRE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROPRE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROPRE, PPQRY_TCO1, "A.NUMERO_PRE", "NUMERO_PRE", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, 1208, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, "PASSATO CDR");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, 4, 468, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, "PASS. CDR");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_PASSATOCDR, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_PASSATOCDR, PPQRY_TCO1, "A.PASSATO_CDR", "PASSATO_CDR", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, 1288, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, 16);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, "E");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, 4, 492, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, 16);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, "E");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_E, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_E, PPQRY_TCO1, "A.E", "E", 5, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, 1328, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, "CONTO RICAVO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, 4, 516, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, "CON. RICAVO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CONTORICAVO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CONTORICAVO, PPQRY_TCO1, "A.CONTO_RICAVO", "CONTO_RICAVO", 5, 6, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, 1416, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, "CENTRO COSTO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, 4, 540, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, "CENT. COSTO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CENTROCOSTO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CENTROCOSTO, PPQRY_TCO1, "A.CENTRO_COSTO", "CENTRO_COSTO", 5, 6, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, 1504, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, 92);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, "CODICE RECORD");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, 4, 564, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, 92);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, "COD. RECORD");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CODICERECORD, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CODICERECORD, PPQRY_TCO1, "A.CODICE_RECORD", "CODICE_RECORD", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_LIST, 176, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_FORM, 196, 76, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_LABELSLASH1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_LABELSLASH1, -1, "", "LABELSLASH1", 0, 0, 0, -13997);
  }

  private void PAN_CORRISPETTIV_InitQueries()
  {
    StringBuffer SQL;

    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T04DESCRIZIO, ");
    SQL.append("  A.FLAG_IMP_ECO as T04FLAIMPECO, ");
    SQL.append("  A.VENTILAZIONE_IVA as T04VENTILIVA, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 4) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(PPQRY_T04, "T04");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ACCDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.NUMERO_ACC = ~~NUMERO_ACC~~) ");
    SQL.append("and   (A.ANNO_ACC = ~~ANNO_ACC~~) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,0) as CAPCAPITOLO, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,~~ARTICOLO~~) as CAPARTICOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
    SQL.append("  A.TIPO as FATTORITIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   (A.DATA_VALIDITA >= ~~D_DATA_REG~~ OR (A.DATA_VALIDITA IS NULL)) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   (A.DATA_VALIDITA >= ~~D_DATA_REG~~ OR (A.DATA_VALIDITA IS NULL)) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~TIPO_BOLLATO~~ = to_number(NULL)) ");
    SQL.append("order by 1, 2 ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T6, 0, SQL, PFL_CORRISPETTIV_TIPOBOLLATO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T6, 1, SQL, PFL_CORRISPETTIV_TIPOBOLLATO1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_T6, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_CORRISPETTIV_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_CORRISPETTIV_UTENTE1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_DUAL, 0, SQL, PFL_CORRISPETTIV_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_DUAL, 1, SQL, PFL_CORRISPETTIV_UTENTE, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~TIPO_QUIETANZA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T02, 0, SQL, PFL_CORRISPETTIV_TIPOQUIETANZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T02, 1, SQL, PFL_CORRISPETTIV_TIPOQUIETANZ, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetIMDB(IMDB, "PQRY_TCO1", true);
    PAN_CORRISPETTIV.set_SetString(MyGlb.MASTER_ROWNAME, "TCO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.ANNO_REG as ANNO_REG, ");
    SQL.append("  A.NUMERO_REG as NUMERO_REG, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.CONTO_RICAVO as CONTO_RICAVO, ");
    SQL.append("  A.CENTRO_COSTO as CENTRO_COSTO, ");
    SQL.append("  A.CODICE_RECORD as CODICE_RECORD, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.IVA_DEF as IVA_DEF, ");
    SQL.append("  A.PASSATO_CDR as PASSATO_CDR, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE as NUMERO_PRE, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.DATA_ESTRATTO_CCP as DATA_ESTRATTO_CCP, ");
    SQL.append("  A.DATA_CCP as DATA_CCP, ");
    SQL.append("  A.NUMERO_CONTABILE as NUMERO_CONTABILE, ");
    SQL.append("  A.TIPO_QUIETANZA as TIPO_QUIETANZA, ");
    SQL.append("  A.DATA_CONTABILE as DATA_CONTABILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  SUM(B.IMPORTO) ");
    SQL.append("from ");
    SQL.append("  DCO B ");
    SQL.append("where (B.ANNO_REG = A.ANNO_REG) ");
    SQL.append("and   (B.NUMERO_REG = A.NUMERO_REG) ");
    SQL.append("and   (B.TIPO_BOLLATO = A.TIPO_BOLLATO) ");
    SQL.append("and   (B.TIPO_REGISTRO = A.TIPO_REGISTRO) ");
    SQL.append(") as TCOIMPORTO ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TCO A ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_REG = ~~TBL_PARAM57.ROWNAMANNREG~~) ");
    SQL.append("and   (A.NUMERO_REG = ~~TBL_PARAM57.ROWNAMNUMREG~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TBL_PARAM57.ROWNAMTIPBOL~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~TBL_PARAM57.ROWNAMTIPREG~~) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO1, 5, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_TCO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(0, "TCO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CORRISPETTIV.Status() == 2)
    {
      int oldListQBE = PAN_CORRISPETTIV.iUseListQBE;
      PAN_CORRISPETTIV.iUseListQBE = 0;
      PAN_CORRISPETTIV.PanelCommand(Glb.PCM_SEARCH);
      PAN_CORRISPETTIV.PanelCommand(Glb.PCM_FIND);
      PAN_CORRISPETTIV.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IVA_Init()
  {

    PAN_IVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IVA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IVA.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, "BD87A3E9-E333-4E62-AD26-6FF80D5D0E72");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, "Aliquota");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, "9543B6C7-92F0-43B9-940E-08FA74B9CEB5");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, "Esenzione");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, "FB811FB9-80D0-4905-9191-8223B98A8CA3");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, "Importo");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, "86F48E1B-C9D6-4EC0-A1CC-5CF8038ADFB3");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, "Imponibile");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_IVA, "CE7EF8E8-8929-429A-8A59-33A2A8D02B3D");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_IVA, "Iva");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_IVA, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, "C719FB91-4A14-4712-B8E0-D1487FCD9D7D");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.VIS_CAMPTOTADISA);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, "6D52D302-1030-4ADF-BE15-37030B65EC7F");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.VIS_CAMPTOTADISA);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, "23FBF1B9-447B-42E3-867A-1915C25D8357");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.VIS_CAMPTOTADISA);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, "4B4BBDD1-8E6F-42C2-9F1E-A535167EB96A");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.VIS_ETICGRASLEFT);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, "8A14BC27-4CB9-450D-926E-09092F1F9EC3");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, "92EC947F-7939-45CC-9D6A-743AC6919BDB");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, "EE18D965-3EE4-40BE-92B4-1EB1C72C1B29");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, "7045B531-22DE-4B6C-BDB5-7A9A4BB4C3CD");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, "E02C828B-4A2E-485F-A255-B13C29B358CE");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, "ANNO REG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, 0, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, "A3E02C16-8682-4AA0-9EF8-C50170A306C0");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, "NUMERO REG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, 0, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, "C44B9BC9-3035-4813-96B5-E3EE6E8758CD");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, 0, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, "62CBA9A1-FE3A-4125-8FBB-79235C9B2BEB");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_LIST, 0, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_LIST, 60);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_LIST, "Aliq.");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_FORM, 4, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_FORM, 136);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.PANEL_FORM, "Aliquota");
    PAN_IVA.SetFieldPage(PFL_IVA_ALIQUOTA, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_ALIQUOTA, PPQRY_DCO, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, 40, 68, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, 108);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, "Esenzione");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, 136);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, "Esenzione");
    PAN_IVA.SetFieldPage(PFL_IVA_ESENZIONE, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_ESENZIONE, PPQRY_DCO, "A.CODICE_ESENZIONE", "CODICE_ESENZIONE", 1, 2, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, 216, 68, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, 4, 172, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_IVA.SetFieldPage(PFL_IVA_IMPORTO, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_IMPORTO, PPQRY_DCO, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, 316, 68, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, 68);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, 68);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_IVA.SetFieldPage(PFL_IVA_IMPONIBILE, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_IMPONIBILE, PPQRY_DCO, "A.IMPONIBILE", "IMPONIBILE", 3, 14, 2, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, 416, 68, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, 28);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, "Iva");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, 4, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, 136);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, "Iva");
    PAN_IVA.SetFieldPage(PFL_IVA_IVA, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_IVA, PPQRY_DCO, "A.IVA", "IVA", 3, 14, 2, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.PANEL_LIST, 216, 284, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.PANEL_FORM, 216, 248, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetFieldPage(PFL_IVA_TOTALEIMPORT, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TOTALEIMPORT, -1, "", "TOTALEIMPORT", 0, 0, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.PANEL_LIST, 316, 284, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.PANEL_LIST, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.PANEL_FORM, 224, 256, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.PANEL_FORM, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetFieldPage(PFL_IVA_TOTALEIMPONI, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TOTALEIMPONI, -1, "", "TOTALEIMPONI", 0, 0, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.PANEL_LIST, 416, 284, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.PANEL_LIST, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.PANEL_FORM, 232, 264, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.PANEL_FORM, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetFieldPage(PFL_IVA_TOTALEIVA, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TOTALEIVA, -1, "", "TOTALEIVA", 0, 0, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.PANEL_LIST, 0, 4, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.PANEL_LIST, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.PANEL_FORM, 0, 4, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.PANEL_FORM, 0);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetFieldPage(PFL_IVA_INTESTAZIONE, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_INTESTAZIONE, -1, "", "INTESTAZIONE", 0, 0, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_IVA.SetFieldPage(PFL_IVA_UTENTEINSERI, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_UTENTEINSERI, PPQRY_DCO, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_IVA.SetFieldPage(PFL_IVA_DATAINSERIME, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_DATAINSERIME, PPQRY_DCO, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_IVA.SetFieldPage(PFL_IVA_UTENTULTIAGG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_UTENTULTIAGG, PPQRY_DCO, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_IVA.SetFieldPage(PFL_IVA_DATAULTIMAGG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_DATAULTIMAGG, PPQRY_DCO, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, 512, 68, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, 60);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, "ANNO REG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, 4, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, 60);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, "ANN. REG");
    PAN_IVA.SetFieldPage(PFL_IVA_ANNOREG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_ANNOREG, PPQRY_DCO, "A.ANNO_REG", "ANNO_REG", 1, 4, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, 572, 68, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, 76);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, "NUMERO REG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, 4, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, 76);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, "NUM. REG");
    PAN_IVA.SetFieldPage(PFL_IVA_NUMEROREG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_NUMEROREG, PPQRY_DCO, "A.NUMERO_REG", "NUMERO_REG", 1, 5, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 648, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 268, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, "TP. BOLLATO");
    PAN_IVA.SetFieldPage(PFL_IVA_TIPOBOLLATO, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TIPOBOLLATO, PPQRY_DCO, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 728, 68, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 88);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_IVA.SetFieldPage(PFL_IVA_TIPOREGISTRO, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TIPOREGISTRO, PPQRY_DCO, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
  }

  private void PAN_IVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_IVA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T06CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T06DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T06 A ");
    SQL.append("where (A.CODICE = ~~CODICE_ESENZIONE~~) ");
    SQL.append("order by 1, 2 ");
    PAN_IVA.SetQuery(PPQRY_T06, 0, SQL, PFL_IVA_ESENZIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T06CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T06DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T06 A ");
    SQL.append("order by 1, 2 ");
    PAN_IVA.SetQuery(PPQRY_T06, 1, SQL, PFL_IVA_ESENZIONE, "");
    PAN_IVA.SetQueryDB(PPQRY_T06, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVA.SetIMDB(IMDB, "PQRY_DCO", true);
    PAN_IVA.set_SetString(MyGlb.MASTER_ROWNAME, "DCO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IVA as IVA, ");
    SQL.append("  A.ALIQUOTA as ALIQUOTA, ");
    SQL.append("  A.CODICE_ESENZIONE as CODICE_ESENZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPONIBILE as IMPONIBILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ANNO_REG as ANNO_REG, ");
    SQL.append("  A.NUMERO_REG as NUMERO_REG, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_IVA.SetQuery(PPQRY_DCO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DCO A ");
    PAN_IVA.SetQuery(PPQRY_DCO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_REG = ~~PQRY_TCO1.ANNO_REG~~) ");
    SQL.append("and   (A.NUMERO_REG = ~~PQRY_TCO1.NUMERO_REG~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~PQRY_TCO1.TIPO_REGISTRO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_TCO1.TIPO_BOLLATO~~) ");
    PAN_IVA.SetQuery(PPQRY_DCO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVA.SetQuery(PPQRY_DCO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVA.SetQuery(PPQRY_DCO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_IVA.SetQuery(PPQRY_DCO, 5, SQL, -1, "");
    PAN_IVA.SetQueryDB(PPQRY_DCO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVA.SetMasterTable(0, "DCO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IVA.Status() == 2)
    {
      int oldListQBE = PAN_IVA.iUseListQBE;
      PAN_IVA.iUseListQBE = 0;
      PAN_IVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_IVA.PanelCommand(Glb.PCM_FIND);
      PAN_IVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IVA) PAN_IVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_ValidateRow(Cancel);
    if (SrcObj == PAN_IVA) PAN_IVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_DynamicProperties();
    if (SrcObj == PAN_IVA) PAN_IVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IVA) PAN_IVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IVA) PAN_IVA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IVA) PAN_IVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
