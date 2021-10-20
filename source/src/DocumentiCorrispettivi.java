// **********************************************
// Documenti Corrispettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiCorrispettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_APARTIREDAL = 0;
  private static int PFL_PARAM_TIPOREGIBOLL = 1;

  private static int PPQRY_PARAM29 = 0;

  private static int PPQRY_T5 = 1;


  IDPanel PAN_PARAM;
  OTabView TAB_TAB;
  private static int GRP_CORRISPETTIV_CORRISPETTIV = 0;
  private static int GRP_CORRISPETTIV_CAPITOARTICO = 1;
  private static int GRP_CORRISPETTIV_ACCERTAMENTO = 2;
  private static int GRP_CORRISPETTIV_ECONOMICA = 3;
  private static int GRP_CORRISPETTIV_INSERIMENTO = 4;
  private static int GRP_CORRISPETTIV_AGGIORNAMENT = 5;

  private static int PFL_CORRISPETTIV_NEWPANELLAB1 = 0;
  private static int PFL_CORRISPETTIV_NEWPANELABE1 = 1;
  private static int PFL_CORRISPETTIV_T04TIPOBOLLA = 2;
  private static int PFL_CORRISPETTIV_TIPOBOLLATO1 = 3;
  private static int PFL_CORRISPETTIV_T04DESCRIZIO = 4;
  private static int PFL_CORRISPETTIV_TIPOBOLLLABE = 5;
  private static int PFL_CORRISPETTIV_NUM = 6;
  private static int PFL_CORRISPETTIV_DATAREG = 7;
  private static int PFL_CORRISPETTIV_DESCRIZIONE = 8;
  private static int PFL_CORRISPETTIV_IMPORTO1 = 9;
  private static int PFL_CORRISPETTIV_NEWPANELLAB2 = 10;
  private static int PFL_CORRISPETTIV_CAPITOLO1 = 11;
  private static int PFL_CORRISPETTIV_ARTICOLO1 = 12;
  private static int PFL_CORRISPETTIV_CAPITOLO = 13;
  private static int PFL_CORRISPETTIV_ARTICOLO = 14;
  private static int PFL_CORRISPETTIV_VOCEPEG = 15;
  private static int PFL_CORRISPETTIV_NEWPANELABE2 = 16;
  private static int PFL_CORRISPETTIV_NEWPANELABE3 = 17;
  private static int PFL_CORRISPETTIV_NUMEROACC = 18;
  private static int PFL_CORRISPETTIV_ANNOACC = 19;
  private static int PFL_CORRISPETTIV_ACCERTAMENTO = 20;
  private static int PFL_CORRISPETTIV_NUMEROORD = 21;
  private static int PFL_CORRISPETTIV_ANNOORD = 22;
  private static int PFL_CORRISPETTIV_ORDINATIVO = 23;
  private static int PFL_CORRISPETTIV_ANNOREG1 = 24;
  private static int PFL_CORRISPETTIV_TIPOREGISTR1 = 25;
  private static int PFL_CORRISPETTIV_LABEL = 26;
  private static int PFL_CORRISPETTIV_SELEZIONAACC = 27;
  private static int PFL_CORRISPETTIV_INFOACC = 28;
  private static int PFL_CORRISPETTIV_LABELSLASH = 29;
  private static int PFL_CORRISPETTIV_SELEZIONVOCE = 30;
  private static int PFL_CORRISPETTIV_INFOVOCE = 31;
  private static int PFL_CORRISPETTIV_ACCDESCRIZIO = 32;
  private static int PFL_CORRISPETTIV_NEWPANELLABE = 33;
  private static int PFL_CORRISPETTIV_CENTRO = 34;
  private static int PFL_CORRISPETTIV_CENTRIDESCRI = 35;
  private static int PFL_CORRISPETTIV_COMPETENZDAL = 36;
  private static int PFL_CORRISPETTIV_AL = 37;
  private static int PFL_CORRISPETTIV_FATTORE = 38;
  private static int PFL_CORRISPETTIV_FATTORDESCRI = 39;
  private static int PFL_CORRISPETTIV_UTENTE1 = 40;
  private static int PFL_CORRISPETTIV_DATA1 = 41;
  private static int PFL_CORRISPETTIV_UTENTE = 42;
  private static int PFL_CORRISPETTIV_DATA2 = 43;
  private static int PFL_CORRISPETTIV_CONTABILE = 44;
  private static int PFL_CORRISPETTIV_DATA = 45;
  private static int PFL_CORRISPETTIV_DATAINCASCCP = 46;
  private static int PFL_CORRISPETTIV_DATAESTRACCP = 47;
  private static int PFL_CORRISPETTIV_T04FLAIMPECO = 48;
  private static int PFL_CORRISPETTIV_T04VENTILIVA = 49;
  private static int PFL_CORRISPETTIV_IVADEF = 50;
  private static int PFL_CORRISPETTIV_FATTORITIPO = 51;
  private static int PFL_CORRISPETTIV_ESERCIZIO = 52;
  private static int PFL_CORRISPETTIV_ANNOPRE = 53;
  private static int PFL_CORRISPETTIV_NUMEROPRE = 54;
  private static int PFL_CORRISPETTIV_TIPOQUIETANZ = 55;
  private static int PFL_CORRISPETTIV_PASSATOCDR = 56;
  private static int PFL_CORRISPETTIV_E = 57;
  private static int PFL_CORRISPETTIV_CONTORICAVO = 58;
  private static int PFL_CORRISPETTIV_CENTROCOSTO = 59;
  private static int PFL_CORRISPETTIV_CODICERECORD = 60;
  private static int PFL_CORRISPETTIV_LABELSLASH1 = 61;

  private static int PPQRY_TCO2 = 0;

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

  private static int PPQRY_DCO1 = 0;

  private static int PPQRY_T06 = 1;


  IDPanel PAN_IVA;

  // Definition of Global Variables
  private IDVariant NUOVOCORRISP = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant DUPLICA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM38(IMDB);
    Init_TBL_CORRISPETTIV(IMDB);
    //
    //
    Init_PQRY_PARAM29(IMDB);
    Init_PQRY_PARAM29_RS(IMDB);
    Init_PQRY_TCO2(IMDB);
    Init_PQRY_DCO1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM38(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM38, 15);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM38, "TBL_PARAM38");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMAPARDA, "ROWNAMAPARDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMAPARDA,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMEBOLLA,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, "ROWNAMOLDARE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDARE,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO, "ROWNAMOLTIBO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, "ROWNAMOLVOPE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, "ROWNAMOLDACC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDACC,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, "ROWNAMOLDALI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDALI,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, "ROWNAMOLDESE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDESE,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, "ROWNAMOLDIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMEPERSO, "ROWNAMEPERSO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMEPERSO,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMEUPDAT, "ROWNAMEUPDAT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMEUPDAT,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMANNREG, "ROWNAMANNREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMANNREG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMNUMREG, "ROWNAMNUMREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM38,IMDBDef2.FLD_PARAM38_ROWNAMNUMREG,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM38, 0);
  }

  private static void Init_TBL_CORRISPETTIV(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_CORRISPETTIV, 35);
    IMDB.set_TblCode(IMDBDef2.TBL_CORRISPETTIV, "TBL_CORRISPETTIV");
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_REG, "ANNO_REG");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CONTO_RICAVO, "CONTO_RICAVO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CONTO_RICAVO,5,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CENTRO_COSTO, "CENTRO_COSTO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CENTRO_COSTO,5,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CODICE_RECORD, "CODICE_RECORD");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CODICE_RECORD,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_IVA_DEF, "IVA_DEF");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_IVA_DEF,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_PASSATO_CDR, "PASSATO_CDR");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_PASSATO_CDR,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_E, "E");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_E,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_ESTRATTO_CCP, "DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_ESTRATTO_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_CCP, "DATA_CCP");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_TIPO_QUIETANZA, "TIPO_QUIETANZA");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_TIPO_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_CORRISPETTIV,IMDBDef2.FLD_CORRISPETTIV_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef2.TBL_CORRISPETTIV, 0);
  }

  private static void Init_PQRY_PARAM29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM29, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM29, "PQRY_PARAM29");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM29,IMDBDef10.PQSL_PARAM29_ROWNAMAPARDA, "ROWNAMAPARDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM29,IMDBDef10.PQSL_PARAM29_ROWNAMAPARDA,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM29,IMDBDef10.PQSL_PARAM29_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM29,IMDBDef10.PQSL_PARAM29_ROWNAMEBOLLA,1,8,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM29, 0);
  }

  private static void Init_PQRY_PARAM29_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM29_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM29_RS, "PQRY_PARAM29_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM29_RS,IMDBDef10.PQSL_PARAM29_ROWNAMAPARDA, "ROWNAMAPARDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM29_RS,IMDBDef10.PQSL_PARAM29_ROWNAMAPARDA,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM29_RS,IMDBDef10.PQSL_PARAM29_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM29_RS,IMDBDef10.PQSL_PARAM29_ROWNAMEBOLLA,1,8,0);
  }

  private static void Init_PQRY_TCO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TCO2, 36);
    IMDB.set_TblCode(IMDBDef10.PQRY_TCO2, "PQRY_TCO2");
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_REG, "ANNO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CONTO_RICAVO, "CONTO_RICAVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CONTO_RICAVO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CENTRO_COSTO, "CENTRO_COSTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CENTRO_COSTO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CODICE_RECORD, "CODICE_RECORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CODICE_RECORD,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_IVA_DEF, "IVA_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_IVA_DEF,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_PASSATO_CDR, "PASSATO_CDR");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_PASSATO_CDR,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_E, "E");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_E,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_ESTRATTO_CCP, "DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_ESTRATTO_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_CCP, "DATA_CCP");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TIPO_QUIETANZA, "TIPO_QUIETANZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TIPO_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TCOIMPORTO, "TCOIMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO2,IMDBDef10.PQSL_TCO2_TCOIMPORTO,3,28,6);
    IMDB.TblAddNew(IMDBDef10.PQRY_TCO2, 0);
  }

  private static void Init_PQRY_DCO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DCO1, 14);
    IMDB.set_TblCode(IMDBDef10.PQRY_DCO1, "PQRY_DCO1");
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_ALIQUOTA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, "CODICE_ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_IMPONIBILE, "IMPONIBILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_IMPONIBILE,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_ANNO_REG, "ANNO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_ANNO_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DCO1,IMDBDef10.PQSL_DCO1_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DCO1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiCorrispettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiCorrispettivi()
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
    FormIdx = MyGlb.FRM_DOCUMECORRIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "994BE6EF-FAEF-48C2-83B0-581262702BA3";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 996;
    DesignHeight = 582;
    set_Caption(new IDVariant("Documenti Corrispettivi"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 996;
    Frames[1].Height = 556;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.057554;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 996;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1D3F5F85-A2EE-4C07-8455-C321514F13CF");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 184, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 996;
    Frames[3].Height = 524;
    Frames[3].Caption = "Tab";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 524;
    TAB_TAB = new OTabView(this);
    Frames[3].Content = TAB_TAB;
    TAB_TAB.iGuid = "B5B8AA8C-21F9-4EC4-9423-DECE19A56F79";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Corrispettivi";
    Frames[4].Parent = this;
    PAN_CORRISPETTIV = new IDPanel(w, this, 4, "PAN_CORRISPETTIV");
    Frames[4].Content = PAN_CORRISPETTIV;
    PAN_CORRISPETTIV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CORRISPETTIV.VS = MainFrm.VisualStyleList;
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 524-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "844891AB-4D41-4ACA-9D6D-508EAB96F1EF");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 952, 436, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CORRISPETTIV.InitStatus = 1;
    PAN_CORRISPETTIV_Init();
    PAN_CORRISPETTIV_InitFields();
    PAN_CORRISPETTIV_InitQueries();
    TAB_TAB.SetItem(1, Frames[4], 0, "", "Corrispettivi", "Testata Corrispettivi");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Iva";
    Frames[5].Parent = this;
    PAN_IVA = new IDPanel(w, this, 5, "PAN_IVA");
    Frames[5].Content = PAN_IVA;
    PAN_IVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IVA.VS = MainFrm.VisualStyleList;
    PAN_IVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 524-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "48B879F5-4143-4F3F-B31A-1142562430C7");
    PAN_IVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 512, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IVA.InitStatus = 2;
    PAN_IVA_Init();
    PAN_IVA_InitFields();
    PAN_IVA_InitQueries();
    TAB_TAB.SetItem(2, Frames[5], 0, "", "Iva", "Dettagli Corrispettivi");
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
      if (CmdIdx==MyGlb.CMD_SALVA44+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI97+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI98+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI97+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA47+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RETTIFBOLLAT+BaseCmdLinIdx)
      {
        RettificaBollato();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM38, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCUMECORRIS_PARAM29();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_CORRISPETTIV.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISPETTIV_SELEZIONAACC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_CORRISPETTIV.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISPETTIV_SELEZIONVOCE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_CORRISPETTIV.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISPETTIV_CENTRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_CORRISPETTIV.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISPETTIV_FATTORE) {
      }
    }
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
    return (obj instanceof DocumentiCorrispettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiCorrispettivi.class.getName() : (Glb.ClassWithPackage(DocumentiCorrispettivi.class) ? DocumentiCorrispettivi.class.getName().substring(DocumentiCorrispettivi.class.getPackage().getName().length() + 1) : DocumentiCorrispettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Corrispettivi Data Reg Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CORRISPETTIV_DATAREG_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi Data Reg Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), true)!=0)
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  TCO A ");
        SQL.append("where (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'mm' )) = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'mm' ))) ");
        SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'yyyy')) = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy'))) ");
        SQL.append("and   (A.IVA_DEF = 1) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Esiste già IVA definitiva per questo mese ed anno", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, 0, (new IDVariant()));
        }
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviDataRegValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi Tipo Bollato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CORRISPETTIV_TIPOBOLLATO1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi Tipo Bollato Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), true)!=0)
      {
        IDVariant v_FLAGIMPECO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
        v_FLAGIMPECO = (new IDVariant());
        v_CENTRO = (new IDVariant());
        v_FATTORE = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FLAG_IMP_ECO as T04FLAIMPECO, ");
        SQL.append("  A.CENTRO as T04CENTRO, ");
        SQL.append("  A.FATTORE as T04FATTORE ");
        SQL.append("from ");
        SQL.append("  T04 A ");
        SQL.append("where (A.TIPO_REGISTRO = 4) ");
        SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FLAGIMPECO = QV.Get("T04FLAIMPECO", IDVariant.STRING) ;
          v_CENTRO = QV.Get("T04CENTRO", IDVariant.STRING) ;
          v_FATTORE = QV.Get("T04FATTORE", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_FLAGIMPECO.equals((new IDVariant("SI")), true))
        {
          if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0)))
            {
              if (!(IDL.IsNull(v_FATTORE)))
              {
                IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  FATTORI A ");
                SQL.append("where (A.DATA_VALIDITA >= " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.FATTORE = " + IDL.CSql(v_FATTORE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_CONT.compareTo((new IDVariant(0)), true)>0)
                {
                  IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0, new IDVariant(v_FATTORE));
                }
              }
            }
            if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0)))
              {
                if (!(IDL.IsNull(v_CENTRO)))
                {
                  IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
                  SQL = new StringBuffer();
                  SQL.append("select ");
                  SQL.append("  COUNT(*) as COUNT1 ");
                  SQL.append("from ");
                  SQL.append("  CENTRI A ");
                  SQL.append("where (A.DATA_VALIDITA >= " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (A.CENTRO = " + IDL.CSql(v_CENTRO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                  if (!QV.EOF()) QV.MoveNext();
                  if (!QV.EOF())
                  {
                    v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                  }
                  QV.Close();
                  if (v_CONT.compareTo((new IDVariant(0)), true)>0)
                  {
                    IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0, new IDVariant(v_CENTRO));
                  }
                }
              }
            }
          }
        }
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviTipoBollatoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Iva On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IVA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IVA);
      // 
      // Iva On Dynamic Properties Event Body
      // Procedure Body
      // 
      DisabilitaCampiIVA();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Iva On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IVA_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_IVA, Cancel);
      // 
      // Iva On Validate Row Event Body
      // Procedure Body
      // 
      // SettaImporti();
      // if (IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0), true)!=0 || IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0), true)!=0 || IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0), true)!=0)
      // {
        // PAN_IVA.UpdatePanel(MainFrm);
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaOnValidateRowEvent", _e);
    }
  }

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
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Iva On Database Error Event
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
  private void PAN_IVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Iva On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Iva Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_IVA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ANNO_REG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_REG, 0));
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_NUMERO_REG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0));
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_TIPO_REGISTRO, 0, (new IDVariant(4)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Iva Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_IVA_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Iva After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_IVA_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0, (new IDVariant()));
        PAN_IVA.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Iva On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_IVA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva On Command Event Body
      // Procedure Body
      // 
      if (Command.compareTo((new IDVariant(1)), true)!=0 && Command.compareTo((new IDVariant(128)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0, (new IDVariant()));
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        SettaImporti();
        PAN_IVA.UpdatePanel(MainFrm);
      }
      if (Command.equals((new IDVariant(16)), true))
      {
        if ((new IDVariant(PAN_IVA.GetNumRows())).equals((new IDVariant(1)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Non è possibile eliminare l'ultimo dettaglio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Iva After Delete Event
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_IVA_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva After Delete Event Body
      // Procedure Body
      // 
      PAN_IVA.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaAfterDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // Iva On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_IVA_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0));
      SettaImporti();
      PAN_IVA.UpdatePanel(MainFrm);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaOnChangeRowEvent", _e);
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
      if (PreviousPage.equals((new IDVariant(PAN_CORRISPETTIV.FrIndex)), true))
      {
        PAN_IVA.set_FieldText(PFL_IVA_INTESTAZIONE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0))), v_DEL), MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DESCRIZIONE, 0)).stringValue());
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0)))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Specificare Tipo Bollato!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0)))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Specificare Data Registrazione!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        DisabilitaCampiIVA();
        AbilitazionePannelloFiltri((new IDVariant(0)));
      }
      else
      {
        if ((new IDVariant(PAN_CORRISPETTIV.Layout())).equals((new IDVariant(0)), true))
        {
          AbilitazionePannelloFiltri((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "TabChangePageEvent", _e);
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
      PAN_CORRISPETTIV.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISPETTIV_DESCRIZIONE,(new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_DESCRIZIONE))).stringValue()); 
      PAN_CORRISPETTIV.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISPETTIV_T04DESCRIZIO,(new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04DESCRIZIO))).stringValue()); 
      PAN_CORRISPETTIV.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISPETTIV_TIPOBOLLATO1,(new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_TIPOBOLLATO1))).stringValue()); 
      DisabilitaCampiCorrispettivi();
      AbilitazioneComandi();
      VisibilitàDescrizioniVocePeg();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CORRISPETTIV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_INSERIMENTO, 0, IDL.Today());
        if (DUPLICA.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ORD, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ORD, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_PRE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_PRE, 0, (new IDVariant()));
          DUPLICA = (new IDVariant(0));
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CORRISPETTIV_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_CORRISPETTIV, Cancel);
      // 
      // Corrispettivi On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0))) && IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0))).compareTo(IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0), true)!=0)
      {
        IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
        v_FATTORE = (new IDVariant());
        v_CENTRO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FATTORE as ACCFATTORE, ");
        SQL.append("  A.CENTRO as ACCCENTRO, ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  A.CAPITOLO as ACCCAPITOLO, ");
        SQL.append("  A.ARTICOLO as ACCARTICOLO ");
        SQL.append("from ");
        SQL.append("  ACC A ");
        SQL.append("where (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.FATTORE, ");
        SQL.append("  A.CENTRO, ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FATTORE = QV.Get("ACCFATTORE", IDVariant.STRING) ;
          v_CENTRO = QV.Get("ACCCENTRO", IDVariant.STRING) ;
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_CAPITOLO = QV.Get("ACCCAPITOLO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("ACCARTICOLO", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Accertamento inesistente!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0, (new IDVariant()));
          return;
        }
        if ((new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04FLAIMPECO))).equals((new IDVariant("SI")), true))
        {
          if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0)))
            {
              IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  FATTORI A ");
              SQL.append("where (A.FATTORE = " + IDL.CSql(v_FATTORE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.DATA_VALIDITA >= " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " OR (A.DATA_VALIDITA IS NULL)) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONT.compareTo((new IDVariant(0)), true)>0)
              {
                IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0, new IDVariant(v_FATTORE));
              }
            }
            if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0)))
              {
                IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  CENTRI A ");
                SQL.append("where (A.CENTRO = " + IDL.CSql(v_CENTRO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.DATA_VALIDITA >= " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " OR (A.DATA_VALIDITA IS NULL)) ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_CONT.compareTo((new IDVariant(0)), true)>0)
                {
                  IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0, new IDVariant(v_CENTRO));
                }
              }
            }
          }
        }
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, IDL.Add(IDL.ToString(v_CAPITOLO), IDL.ToString(v_ARTICOLO)));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0))));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0))) && IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0))).compareTo(IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0), true)!=0)
      {
        IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_FATTORE = (new IDVariant());
        v_CENTRO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FATTORE as CAPFATTORE, ");
        SQL.append("  A.CENTRO as CAPCENTRO, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.E_S = 'E') ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.FATTORE, ");
        SQL.append("  A.CENTRO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FATTORE = QV.Get("CAPFATTORE", IDVariant.STRING) ;
          v_CENTRO = QV.Get("CAPCENTRO", IDVariant.STRING) ;
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Voce P.e.g. inesistente!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0, (new IDVariant()));
          return;
        }
        if ((new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04FLAIMPECO))).equals((new IDVariant("SI")), true))
        {
          if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0)))
            {
              IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  FATTORI A ");
              SQL.append("where (A.FATTORE = " + IDL.CSql(v_FATTORE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.DATA_VALIDITA >= " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " OR (A.DATA_VALIDITA IS NULL)) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONT.compareTo((new IDVariant(0)), true)>0)
              {
                IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0, new IDVariant(v_FATTORE));
              }
            }
            if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0)))
              {
                IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  CENTRI A ");
                SQL.append("where (A.CENTRO = " + IDL.CSql(v_CENTRO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.DATA_VALIDITA >= " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " OR (A.DATA_VALIDITA IS NULL)) ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_CONT.compareTo((new IDVariant(0)), true)>0)
                {
                  IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0, new IDVariant(v_CENTRO));
                }
              }
            }
          }
        }
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0))));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Database Error Event
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
  private void PAN_CORRISPETTIV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CORRISPETTIV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Corrispettivi On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CORRISPETTIV_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ORD, 0))))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Registrazione non eliminabile: esiste un ordinativo!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(8)), true))
      {
        if (new IDVariant(PAN_CORRISPETTIV.Status()).equals((new IDVariant(1)), true))
        {
          PAN_CORRISPETTIV.PanelCommand(Glb.PCM_FIND);
        }
        if ((new IDVariant(PAN_CORRISPETTIV.Layout())).compareTo((new IDVariant(1)), true)!=0)
        {
          PAN_CORRISPETTIV.set_Layout((new IDVariant(1)).intValue());
        }
        // PAN_CORRISPETTIV.Freezed = (new IDVariant(0)).booleanValue();
        DUPLICA = (new IDVariant(0));
      }
      if (Command.compareTo((new IDVariant(1)), true)!=0 && Command.compareTo((new IDVariant(128)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, (new IDVariant()));
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_CORRISPETTIV.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_CORRISPETTIV.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(256)), true))
      {
        DUPLICA = (new IDVariant(1));
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        if (PAN_CORRISPETTIV.IsNewRow() && new IDVariant(PAN_IVA.Status()).equals((new IDVariant(3)), true))
        {
          PAN_IVA.PanelCommand(Glb.PCM_CANCEL);
        }
        DUPLICA = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_CORRISPETTIV_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0, new IDVariant(NUOVOCORRISP));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_REG, 0, IDL.Year(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0)));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_REGISTRO, 0, (new IDVariant(4)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che può essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_CORRISPETTIV_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(0)), true))
      {
        AbilitazionePannelloFiltri((new IDVariant(-1)));
      }
      else
      {
        AbilitazionePannelloFiltri((new IDVariant(0)));
        SettaOld();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_CORRISPETTIV_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi After Commit Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispettivi On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_CORRISPETTIV_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispettivi On Change Row Event Body
      // Procedure Body
      // 
      AbilitazioneComandi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "CorrispettiviOnChangeRowEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMAPARDA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMEBOLLA, 0, (new IDVariant(-1)));
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_CORRISPETTIV.Freezed = (new IDVariant(-1)).booleanValue();
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
      if (IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMEUPDAT, 0).equals((new IDVariant("U")), true))
      {
        PAN_CORRISPETTIV.set_Layout((new IDVariant(1)).intValue());
        PAN_CORRISPETTIV.PanelCommand(Glb.PCM_FIND);
        PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_PARAM.set_Visible((new IDVariant(0)).booleanValue());
      }
      MainFrm.CmdObj.set_CmdSetCaption(MyGlb.CMDS_FUNZIOAGGI98+BaseCmdSetIdx, (new IDVariant("")).stringValue());
      PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0))));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "EndModalEvent", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDARE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLTIBO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMEUPDAT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMTIPBOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMTIPREG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMANNREG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMNUMREG, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Iva Aliquota Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_IVA_ALIQUOTA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva Aliquota Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0, (new IDVariant()));
        SettaImponibileEIVA();
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0));
        SettaImporti();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaAliquotaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Iva Esenzione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_IVA_ESENZIONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva Esenzione Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0, (new IDVariant()));
        SettaImponibileEIVA();
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDALI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDESE, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0));
        SettaImporti();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaEsenzioneValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Iva Importo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_IVA_IMPORTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Iva Importo Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0), true)!=0)
      {
        SettaImponibileEIVA();
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDIMP, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0));
        SettaImporti();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "IvaImportoValidateEvent", _e);
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
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SettaImporti", _e);
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
      if ((new IDVariant(PAN_CORRISPETTIV.Layout())).equals((new IDVariant(0)), true))
      {
        // 
        // pannello Corrispettivi
        // 
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        if (PAN_CORRISPETTIV.IsNewRow())
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true))
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
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
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0))))
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0))))
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "DisabilitaCampiCorrispettivi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Acc
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezionaAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Acc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SelezionaAcc", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "InfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Voce
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezionaVoce ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Voce Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
      }
      else
      {
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SelezionaVoce", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "InfoVoce", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SelezioneFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SelezioneCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi IVA
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DisabilitaCampiIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Campi IVA Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_CORRISPETTIV.Layout())).equals((new IDVariant(0)), true))
      {
        // 
        // pannello Iva
        // 
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_ALIQUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_ESENZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IMPONIBILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_IVA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_IVA.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true) || (new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04VENTILIVA))).equals((new IDVariant("SI")), true))
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_ALIQUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_ALIQUOTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if ((new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04VENTILIVA))).equals((new IDVariant("SI")), true))
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_ESENZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_ESENZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true))
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true) || (new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04VENTILIVA))).equals((new IDVariant("SI")), true) || MainFrm.CORRISMODIFI.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IMPONIBILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IMPONIBILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IVA.SetFlags (Glb.OBJ_FIELD, PFL_IVA_IVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true))
        {
          PAN_IVA.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_IVA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_IVA.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_IVA.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_IVA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_IVA.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "DisabilitaCampiIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Imponibile E IVA
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaImponibileEIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Imponibile E IVA Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_CODICE_ESENZIONE, 0))))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPONIBILE, 0, IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0))))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPONIBILE, 0, IDL.Round(IDL.Div((IDL.Mul(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0), (new IDVariant(100)))), (IDL.Add((new IDVariant(100)), IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_ALIQUOTA, 0)))), (new IDVariant(2))));
      }
      IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IVA, 0, IDL.Sub(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPORTO, 0), IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_IMPONIBILE, 0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SettaImponibileEIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUOVOCORRISP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUOVOANNOREG = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUOVONUMEREG = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUOVTIPOBOLL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUOVTIPOREGI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      v_NUOVOCORRISP = (new IDVariant(0));
      if (!(PAN_CORRISPETTIV.IsPanelInError()) && !(PAN_IVA.IsPanelInError()))
      {
        if (ControlliBloccantiCorr())
        {
          if (ControlliBloccantiIVA())
          {
            MainFrm.Cf4armDBObject.BeginTrans();
            if (new IDVariant(PAN_CORRISPETTIV.Status()).compareTo((new IDVariant(2)), true)!=0)
            {
              if (PAN_CORRISPETTIV.IsNewRow())
              {
                v_NUOVOCORRISP = (new IDVariant(-1));
                // 
                // procedura numerazione
                // 
                {
                  IDVariant v_NUMERO = new IDVariant(0,IDVariant.INTEGER);
                  v_NUMERO = IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0);
                  MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
                  MainFrm.Cf4armDBObject.ACHKNUMERAZIONEIVA(IDL.Year(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0)), (new IDVariant(4)), IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), v_NUMERO);
                  if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
                  {
                    MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                    MainFrm.Cf4armDBObject.RollbackTrans();
                    return 0;
                  }
                  NUOVOCORRISP = new IDVariant(v_NUMERO);
                  IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0, new IDVariant(v_NUMERO));
                }
              }
              PAN_CORRISPETTIV.PanelCommand(Glb.PCM_UPDATE);
              if (new IDVariant(PAN_CORRISPETTIV.Status()).equals((new IDVariant(2)), true))
              {
                if (new IDVariant(PAN_IVA.Status()).equals((new IDVariant(3)), true))
                {
                  PAN_IVA.PanelCommand(Glb.PCM_UPDATE);
                  if (new IDVariant(PAN_IVA.Status()).compareTo((new IDVariant(2)), true)!=0)
                  {
                    PAN_IVA.SetModified(MainFrm);
                    PanelRollback(v_NUOVOCORRISP);
                    return 0;
                  }
                }
              }
              else
              {
                MainFrm.Cf4armDBObject.RollbackTrans();
                PanelRollback(v_NUOVOCORRISP);
                return 0;
              }
              MainFrm.Cf4armDBObject.CommitTrans();
              v_NUOVOANNOREG = IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_REG, 0);
              v_NUOVONUMEREG = IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0);
              v_NUOVTIPOBOLL = IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0);
              v_NUOVTIPOREGI = IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_REGISTRO, 0);
              PAN_CORRISPETTIV.PanelCommand(Glb.PCM_REQUERY);
              if (v_NUOVOCORRISP.booleanValue())
              {
                RiposizionaCorrispettivoInserito(v_NUOVOANNOREG, v_NUOVONUMEREG, v_NUOVTIPOBOLL, v_NUOVTIPOREGI);
              }
            }
            else
            {
              if (new IDVariant(PAN_IVA.Status()).equals((new IDVariant(3)), true))
              {
                PAN_IVA.PanelCommand(Glb.PCM_UPDATE);
                if (new IDVariant(PAN_IVA.Status()).compareTo((new IDVariant(2)), true)!=0)
                {
                  PAN_IVA.SetModified(MainFrm);
                  return 0;
                }
              }
              MainFrm.Cf4armDBObject.CommitTrans();
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Bloccanti Corr
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlliBloccantiCorr ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti Corr Body
      // Procedure Body
      // 
      v_SALVATO = (new IDVariant(0));
      if ((new IDVariant(PAN_IVA.GetNumRows())).compareTo((new IDVariant(0)), true)<0)
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  DCO A ");
        SQL.append("where (A.ANNO_REG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_REG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_REG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_REGISTRO = 4) ");
        SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("E' necessario inserire almeno una registrazione I.V.A.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          v_SALVATO = (new IDVariant(0));
          return v_SALVATO.booleanValue();
        }
      }
      else
      {
        if (((new IDVariant(PAN_IVA.GetNumRows())).equals((new IDVariant(0)), true) || PAN_CORRISPETTIV.IsNewRow()) && new IDVariant(PAN_IVA.Status()).compareTo((new IDVariant(3)), true)!=0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("E' necessario inserire almeno una registrazione I.V.A.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          v_SALVATO = (new IDVariant(0));
          return v_SALVATO.booleanValue();
        }
      }
      // 
      // Registrazione IVA
      // 
      {
        IDVariant v_CONTATORE1 = new IDVariant(0,IDVariant.INTEGER);
        if (!(PAN_CORRISPETTIV.IsNewRow()))
        {
          IDVariant v_DATAREG = new IDVariant(0,IDVariant.DATETIME);
          v_DATAREG = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.D_DATA_REG as TCODDATAREG ");
          SQL.append("from ");
          SQL.append("  TCO A ");
          SQL.append("where (A.TIPO_REGISTRO = 4) ");
          SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_REG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_REG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_REG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DATAREG = QV.Get("TCODDATAREG", IDVariant.DATETIME) ;
          }
          QV.Close();
          if (v_DATAREG.compareTo(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), true)!=0)
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  TCO A ");
            SQL.append("where (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'mm' )) = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'mm' ))) ");
            SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'yyyy')) = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy'))) ");
            SQL.append("and   (A.IVA_DEF = 1) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE1.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Registrazione I.V.A ", IDVariant.STRING));
              IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
              v_SMS1 = (new IDVariant(" già presente su registro definitivo!", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_SMS, MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0))), v_SMS1)); 
              v_SALVATO = (new IDVariant(0));
              return v_SALVATO.booleanValue();
            }
          }
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  TCO A ");
          SQL.append("where (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'mm' )) = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'mm' ))) ");
          SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'yyyy')) = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy'))) ");
          SQL.append("and   (A.IVA_DEF = 1) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE1.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Registrazione I.V.A ", IDVariant.STRING));
            IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
            v_SMS1 = (new IDVariant(" già presente su registro definitivo!", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_SMS, MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0))), v_SMS1)); 
            v_SALVATO = (new IDVariant(0));
            return v_SALVATO.booleanValue();
          }
        }
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        if ((new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_T04FLAIMPECO))).equals((new IDVariant("SI")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0)))
          {
            IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
            v_SMS1 = (new IDVariant("Fattore Obbligatorio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS1); 
            v_SALVATO = (new IDVariant(0));
            return v_SALVATO.booleanValue();
          }
          if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            if ((new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_FATTORITIPO))).equals((new IDVariant("E")), true))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0)))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Centro Obbligatorio", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_SMS); 
                v_SALVATO = (new IDVariant(0));
                return v_SALVATO.booleanValue();
              }
            }
          }
        }
      }
      v_SALVATO = (new IDVariant(-1));
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "ControlliBloccantiCorr", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli Bloccanti IVA
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlliBloccantiIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti IVA Body
      // Procedure Body
      // 
      v_SALVATO = (new IDVariant(0));
      C2 = PAN_IVA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_IVA.GotoFirst();
      while (!PAN_IVA.RSEOF())
      {
        if (IDL.IsNull(C2.Get("ALIQUOTA")) && IDL.IsNull(C2.Get("CODICE_ESENZIONE")))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Specificare Aliquota o Esenzione", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          v_SALVATO = (new IDVariant(0));
          return v_SALVATO.booleanValue();
        }
        PAN_IVA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      v_SALVATO = (new IDVariant(-1));
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "ControlliBloccantiIVA", _e);
      return false;
    }
  }

  // **********************************************************************
  // Panel Rollback
  // Explain which processing is carried out by this procedure
  // Nuovocorrispettivo:  - Input
  // **********************************************************************
  public int PanelRollback (IDVariant Nuovocorrispettivo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Panel Rollback Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_REG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_REG, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_REG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0));
      // IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_REG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CONTO_RICAVO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CONTO_RICAVO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CENTRO_COSTO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO_COSTO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CODICE_RECORD, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CODICE_RECORD, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ESERCIZIO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ESERCIZIO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CAPITOLO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ARTICOLO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_ACC, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_ACC, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DESCRIZIONE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_ORD, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ORD, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_ORD, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ORD, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_IVA_DEF, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_PASSATO_CDR, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_PASSATO_CDR, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_PRE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_PRE, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_PRE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_PRE, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_E, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_E, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_TIPO_REGISTRO, 0, (new IDVariant(4)));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_D_DATA_REG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CENTRO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_FATTORE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_DAL, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_COMPETENZA_DAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_AL, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_COMPETENZA_AL, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_ESTRATTO_CCP, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_ESTRATTO_CCP, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_CCP, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_CCP, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_CONTABILE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_CONTABILE, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_TIPO_QUIETANZA, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_QUIETANZA, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_CONTABILE, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_CONTABILE, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_UTENTE_INSERIMENTO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_INSERIMENTO, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_INSERIMENTO, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_UTENTE_ULTIMO_AGG, 0));
      IMDB.set_Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_ULTIMO_AGG, 0, IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_ULTIMO_AGG, 0));
      PAN_CORRISPETTIV.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_CORRISPETTIV.PanelCommand(Glb.PCM_REQUERY);
      if (Nuovocorrispettivo.booleanValue())
      {
        PAN_CORRISPETTIV.PanelCommand(Glb.PCM_INSERT);
      }
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_REG, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_REG, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_D_DATA_REG, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_D_DATA_REG, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DESCRIZIONE, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ORD, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_ORD, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ORD, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_ORD, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_FATTORE, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_FATTORE, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CENTRO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_COMPETENZA_DAL, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_DAL, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_COMPETENZA_AL, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_COMPETENZA_AL, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_UTENTE_INSERIMENTO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_INSERIMENTO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_INSERIMENTO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_UTENTE_ULTIMO_AGG, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_ULTIMO_AGG, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_ULTIMO_AGG, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_CONTABILE, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_CONTABILE, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_CONTABILE, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_CONTABILE, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_CCP, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_CCP, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_DATA_ESTRATTO_CCP, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_DATA_ESTRATTO_CCP, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ESERCIZIO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ESERCIZIO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_IVA_DEF, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_PRE, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_ANNO_PRE, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_PRE, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_NUMERO_PRE, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_QUIETANZA, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_TIPO_QUIETANZA, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_PASSATO_CDR, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_PASSATO_CDR, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_E, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_E, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CONTO_RICAVO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CONTO_RICAVO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CENTRO_COSTO, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CENTRO_COSTO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CODICE_RECORD, 0, IMDB.Value(IMDBDef2.TBL_CORRISPETTIV, IMDBDef2.FLD_CORRISPETTIV_CODICE_RECORD, 0));
      PAN_CORRISPETTIV.UpdatePanel(MainFrm);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "PanelRollback", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Pannello Filtri
  // Explain which processing is carried out by this procedure
  // Abilitato - Input
  // **********************************************************************
  public int AbilitazionePannelloFiltri (IDVariant Abilitato)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Pannello Filtri Body
      // Procedure Body
      // 
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, (Abilitato.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, (Abilitato.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "AbilitazionePannelloFiltri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Comandi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AbilitazioneComandi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Comandi Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_CORRISPETTIV.Layout())).equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true))
        {
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDIIVA1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA44+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI97+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_IVA_DEF, 0).equals((new IDVariant(1)), true))
        {
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
        PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_CORRISPETTIV.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDIIVA1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA44+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI97+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "AbilitazioneComandi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Old
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Old Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLDACC, 0, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_NUMERO_ACC, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ANNO_ACC, 0))));
      IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMOLVOPE, 0, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0)), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "SettaOld", _e);
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
      if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_ARTICOLO, 0).equals((new IDVariant(0)), true))
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
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "VisibilitàDescrizioniVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riposiziona Corrispettivo Inserito
  // Anno Reg:  - Input
  // Numero Reg:  - Input
  // Tipo Bollato:  - Input
  // Tipo Registro:  - Input
  // **********************************************************************
  public int RiposizionaCorrispettivoInserito (IDVariant AnnoReg, IDVariant NumeroReg, IDVariant TipoBollato, IDVariant TipoRegistro)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Riposiziona Corrispettivo Inserito Body
      // Procedure Body
      // 
      C2 = PAN_CORRISPETTIV.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_CORRISPETTIV.GotoFirst();
      while (!PAN_CORRISPETTIV.RSEOF())
      {
        if (C2.Get("ANNO_REG").equals(AnnoReg, true) && C2.Get("NUMERO_REG").equals(NumeroReg, true) && C2.Get("TIPO_BOLLATO").equals(TipoBollato, true) && C2.Get("TIPO_REGISTRO").equals(TipoRegistro, true))
        {
          PAN_CORRISPETTIV.set_ActualPosition(true, new IDVariant(I).intValue());
          break;
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_CORRISPETTIV.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "RiposizionaCorrispettivoInserito", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Rettifica Bollato
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RettificaBollato ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifica Bollato Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM105, IMDBDef2.FLD_PARAM105_NOMOGGTIPBOL, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_PARAM105, IMDBDef2.FLD_PARAM105_NOMOGGNUOBOL, 0, (new IDVariant(0)));
      MainFrm.Show(MyGlb.FRM_RETTIFBOLLAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiCorrispettivi", "RettificaBollato", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void DOCUMECORRIS_PARAM29() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM29_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM38, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM38, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM29_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM29_RS, 0, IMDBDef2.TBL_PARAM38, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM29_RS, 0, 0, IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMAPARDA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM29_RS, 1, 0, IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMEBOLLA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM38, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM38, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM38, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM29_RS, 0);
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
    TAB_TAB_IntClick(OldPage, Cancel);
  }

  private void PAN_CORRISPETTIV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CORRISPETTIV_SELEZIONAACC)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISPETTIV_INFOACC)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISPETTIV_SELEZIONVOCE)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaVoce();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISPETTIV_INFOVOCE)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVoce();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISPETTIV_CENTRO)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISPETTIV_FATTORE)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattore();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CORRISPETTIV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CORRISPETTIV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CORRISPETTIV_TIPOBOLLATO1)
      {
        PFL_CORRISPETTIV_TIPOBOLLATO1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CORRISPETTIV_DATAREG)
      {
        PFL_CORRISPETTIV_DATAREG_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CORRISPETTIV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_REGISTRO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_TIPO_REGISTRO, 0, (new IDVariant(4)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_E, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CODICE_RECORD, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO2, IMDBDef10.PQSL_TCO2_CODICE_RECORD, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_CORRISPETTIV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void PAN_IVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_IVA_ALIQUOTA)
      {
        PFL_IVA_ALIQUOTA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_IVA_ESENZIONE)
      {
        PFL_IVA_ESENZIONE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_IVA_IMPORTO)
      {
        PFL_IVA_IMPORTO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_IVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_TIPO_REGISTRO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DCO1, IMDBDef10.PQSL_DCO1_TIPO_REGISTRO, 0, (new IDVariant(4)));
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
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, "5690D6D4-FB29-4E74-97C9-9469F8144408");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, "A Partire dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "DD00E203-C03C-493D-89B6-F19AF483F6CF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_LIST, "A Partire dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_APARTIREDAL, MyGlb.PANEL_FORM, "A Partire dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_APARTIREDAL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_APARTIREDAL, PPQRY_PARAM29, "A.ROWNAMAPARDA", "ROWNAMAPARDA", 6, 19, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tp. Regis. Bollato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 200, 4, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGIBOLL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGIBOLL, PPQRY_PARAM29, "A.ROWNAMEBOLLA", "ROWNAMEBOLLA", 1, 8, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~ROWNAMEBOLLA~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLA~~ = -1) ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T5, 0, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T5, 1, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.SetQueryDB(PPQRY_T5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM29", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM29, IMDBDef10.PQRY_PARAM29_RS, IMDBDef2.TBL_PARAM38);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_APARTIREDAL, IMDBDef2.FLD_PARAM38_ROWNAMAPARDA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGIBOLL, IMDBDef2.FLD_PARAM38_ROWNAMEBOLLA);
    PAN_PARAM.SetMasterTable(0, "PARAM38");
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

  private void PAN_CORRISPETTIV_Init()
  {

    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CORRISPETTIV, "A5E3FFC0-F82C-4231-A852-C823A93D90C8");
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
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, "EBED6133-56DF-4522-AF82-941DAB2455B0");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, "Capitolo / Articolo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, MyGlb.PANEL_FORM, 16, 111, 556, 101, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, 0, 102);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_CAPITOARTICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, "310D3CCC-2410-481A-8C1D-1FAA8DF4D965");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, "Accertamento");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 16, 71, 556, 37, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 0, 81);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, "9444D934-A3A6-42D6-8F52-CCBEE5E22182");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, "Economica");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, MyGlb.PANEL_FORM, 16, 215, 556, 97, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 0, 60);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, "6BB18814-591B-454F-99A3-930F08CBCE98");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, "Inserimento");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, MyGlb.PANEL_FORM, 16, 327, 284, 49, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 0, 70);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, "739862CF-1928-4CC0-AFBE-366997763940");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, "Aggiornamento");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, MyGlb.PANEL_FORM, 392, 327, 300, 49, 0, 0);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 0, 88);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 1, 13);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 0, 4);
    PAN_CORRISPETTIV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 1, 4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_GROUP, GRP_CORRISPETTIV_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_FIELD, 62);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, "0289720B-61D9-4BA6-AAD6-E881BF2C9018");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, "F02A1C89-8650-4081-B4E6-C80E4E19A115");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, "39C102B4-A555-4C93-AEFA-DAAA0C4DE4F4");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, "T04 TIPO BOLLATO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, "977A5BC3-63B0-4041-9E49-8145E9A32947");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, "Tipo Bollato");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, "B0AFF01E-720A-4FB0-A063-2AA5F1188D31");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, "T04 DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, "892E40C5-979A-4D08-97CA-B684F1569D88");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, "Tipo Bollato");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, "D7C13D4A-C64A-41E9-B1E2-6116F50D76A3");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, "Num.");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, "C654442D-826C-4194-AAE3-2BBFE78E6711");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, "Data Reg");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "FB15B649-DEFF-4B86-8E94-CD088D7E41D4");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "Descrizione");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, "D40F0E88-E2A3-4F65-83F0-8D9F6D3408B5");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, "Importo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, "Importo Corrispettivo");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, "59C21E91-4B3E-412F-8FE2-55CB94C05F1D");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, "2B6398B5-A419-4120-B9FD-2A6B54A980AA");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, "Capitolo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, "B310289F-1F46-4531-89FA-016CFA802077");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, "Articolo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, "84BAE87B-C075-4D19-A389-1A91AC7B29EC");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, "CAPITOLO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, "4E727083-2489-41F3-833B-8F425230C33E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, "ARTICOLO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, "A0BF03CD-77C8-4766-8AD8-6B8DE4B9BC78");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, "Capitolo/Art");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, "Voce P.e.g.");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, "A26A60D5-9F99-44A5-A211-F8EF257C21E6");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, "E60046D0-5E3A-4400-96B5-24648226F3A1");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, "721D0C23-34C2-48F5-A044-008BBA99ED9E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, "NUMERO ACC");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, "54447FF7-7FD6-4F83-847D-B3270928CBD8");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, "ANNO ACC");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, "656C7997-C7B0-45E8-B9A8-DF3DB67C9616");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, "Accertamento");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, "C0CA79CB-E732-447C-A0FF-B582BC49F703");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, "NUMERO ORD");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, "3F7CA441-291B-4596-B039-9E821CF21165");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, "ANNO ORD");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, "5D4AFB90-1160-4D1A-9CE2-144BE17A192D");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, "Ordinativo");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, "DD53A744-5691-473E-8EC7-28504C8453FF");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, "ANNO REG");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, "B632CF5A-2AC0-4276-BA67-993FFC0CC32E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, "TIPO REGISTRO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, "441B1DA2-12B4-40F9-9EA4-E2F0F12CFD60");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, "- Del");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, "353EC048-002B-4231-95FE-218F2A86A297");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.VIS_STATICBUTTON);
    PAN_CORRISPETTIV.SetImage(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, 0, "wsearch1.gif", false);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, "930E9B7F-743A-4FF9-8D18-4FF95400C0E8");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.VIS_STATICBUTTON);
    PAN_CORRISPETTIV.SetImage(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, 0, "info.gif", false);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, "54F647BB-F068-4ED6-B34D-04BA18BDB668");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, "/");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, "0635AF7C-54D2-462A-9B51-4840C5306874");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.VIS_STATICBUTTON);
    PAN_CORRISPETTIV.SetImage(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, 0, "wsearch1.gif", false);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, "ED29AE50-5DC0-49DE-9530-1C0A3FC6B152");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.VIS_STATICBUTTON);
    PAN_CORRISPETTIV.SetImage(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, 0, "info.gif", false);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, "828BDFDB-41BD-4B4B-A39C-1E60211361E3");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, "ACC DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, "AAD4CBCB-873E-4874-B1BD-2E8017E94438");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, "4E25BD07-F6C6-4FA0-8796-5392125B7B34");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, "Centro");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, "45449565-8EC6-4F5F-9A1B-B2D6E01F1DC2");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, "8E0C8B71-84F0-4980-AD94-03C1D2AFEDB2");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, "Competenza dal");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, "376C6D26-68A4-4930-B122-C9CB94C0D92E");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, "al");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, "136D7990-F56B-4B31-AA25-85431C66DD8A");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, "Fattore");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, "61AD7E98-F6D3-4733-923D-E62B00341439");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, "37A95A69-8D4B-43F9-907F-FDFB1018EB82");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, "Utente");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, "700A25BC-A985-4EDF-8163-CD0A71C1A5BA");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, "Data");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, "97ADFEFF-A204-4822-914C-DFE6E33C2182");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, "Utente ");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, "237F6333-BE00-4055-932C-2EE9D909F7BE");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, "Data ");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, "E1F98271-8B9C-43DC-BA51-400471927CF5");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, "Contabile");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, "631B5BBF-EEDA-48E9-91C2-24D4F28D6DD7");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, "Data  ");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, "266ABC73-F20B-4AAC-89F4-03EDD6202E6A");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, "Data incasso c.c.p.");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, "347961ED-E1EE-4A72-95B2-0BD56935C17C");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, "Data estratto c.c.p.");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, "5DE30A28-F842-438B-A379-3C841E4F8CBA");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, "T04 FLAG IMP ECO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04FLAIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, "AD527687-B632-4416-8079-0BB0EC745069");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, "T04 VENTILAZIONE IVA");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04VENTILIVA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, "AB9C532F-96BA-4ED4-A9D5-A69DF5C14747");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, "IVA DEF");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IVADEF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, "28DE4487-1917-4924-A723-7BD05659787D");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, "FATTORI TIPO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, "44F5B2CC-D0CC-47DF-9F27-CCB4548E22EB");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, "ESERCIZIO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, "178FEB30-5FC4-4C0A-90B2-80FC87D56D47");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, "ANNO PRE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, "67E086F9-CE61-4765-AAC5-C64417C6F188");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, "NUMERO PRE");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, "506ECDA3-66CF-41BA-BF3A-A1A0B1C1B9B1");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, "Tipo Quietanza");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, "782DCBFF-9603-4346-A35E-23899C626D94");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, "PASSATO CDR");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, "402F79BB-F078-4AE5-9573-AB6E59930A40");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, "E");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, "A0AB8EF7-901D-488E-B8CE-9345EA842C88");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, "CONTO RICAVO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, "EA4BD78F-6E3A-4F33-8931-91532032FFD8");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, "CENTRO COSTO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.VIS_NORMFIELPADR);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, "34207630-8687-42BC-A1C1-32DA852B09A5");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, "CODICE RECORD");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.VIS_NONNULLAFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, "A88A52DC-86B9-40F8-B6F7-51BC57663161");
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
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, 0, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, 104);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_LIST, "T. T. B.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, 4, 420, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, 104);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04TIPOBOLLA, MyGlb.PANEL_FORM, "T04 TP. BOLLATO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_T04TIPOBOLLA, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_T04TIPOBOLLA, PPQRY_T04, "A.TIPO_BOLLATO", "T04TIPOBOLLA", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, 0, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, 292, 12, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO1, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOBOLLATO1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOBOLLATO1, PPQRY_TCO2, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, 24, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_LIST, "T04 DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, 4, 436, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_T04DESCRIZIO, MyGlb.PANEL_FORM, "T04 DESCR.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_T04DESCRIZIO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_T04DESCRIZIO, PPQRY_T04, "A.DESCRIZIONE", "T04DESCRIZIO", 5, 40, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_LIST, 0, 0, 216, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_FORM, 0, 0, 240, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLLABE, MyGlb.PANEL_FORM, 2);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOBOLLLABE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOBOLLLABE, -1, "", "TIPOBOLLLABE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, 216, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_LIST, "Num.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, 104, 12, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUM, MyGlb.PANEL_FORM, "Num.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUM, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUM, PPQRY_TCO2, "A.NUMERO_REG", "NUMERO_REG", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, 260, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_LIST, "Data Reg");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, 196, 12, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATAREG, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATAREG, PPQRY_TCO2, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 348, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 48, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DESCRIZIONE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DESCRIZIONE, PPQRY_TCO2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_IMPORTO1, MyGlb.PANEL_LIST, 528, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_IMPORTO1, PPQRY_TCO2, SQL.toString(), "TCOIMPORTO", 3, 28, 6, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_LIST, 192, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_FORM, 20, 136, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLAB2, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELLAB2, -1, GRP_CORRISPETTIV_CAPITOARTICO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELLAB2, -1, "", "NEWPANELLAB2", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, 72);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, 72, 164, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CAPITOLO1, -1, GRP_CORRISPETTIV_CAPITOARTICO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CAPITOLO1, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,0)", "CAPCAPITOLO", 5, 99, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, 76, 188, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, 56);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ARTICOLO1, -1, GRP_CORRISPETTIV_CAPITOARTICO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ARTICOLO1, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,~~ARTICOLO~~)", "CAPARTICOLO", 5, 99, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, 628, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, 132, 128, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CAPITOLO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CAPITOLO, PPQRY_TCO2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, 752, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, 280, 128, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ARTICOLO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ARTICOLO, PPQRY_TCO2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_LIST, 628, 0, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_FORM, 664, 0, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_VOCEPEG, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_VOCEPEG, -1, "", "VOCEPEG", 0, 0, 0, -13997);
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
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_FORM, 560, 96, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELABE3, -1, GRP_CORRISPETTIV_ACCERTAMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, 776, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, 136, 76, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROACC, PPQRY_TCO2, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, 828, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, 208, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOACC, PPQRY_TCO2, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 776, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 672, 8, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ACCERTAMENTO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, 876, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, 4, 386, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROORD, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROORD, PPQRY_TCO2, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, 916, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, 4, 410, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOORD, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOORD, PPQRY_TCO2, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ORDINATIVO, MyGlb.PANEL_LIST, 876, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOREG1, PPQRY_TCO2, "A.ANNO_REG", "ANNO_REG", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, 4, 436, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTR1, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOREGISTR1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOREGISTR1, PPQRY_TCO2, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 152, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 160, 12, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_LABEL, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.PANEL_LIST, 172, 160, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.PANEL_FORM, 532, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONAACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_SELEZIONAACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_SELEZIONAACC, -1, "", "SELEZIONAACC", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_LIST, 180, 168, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_FORM, 552, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_INFOACC, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_LIST, 168, 164, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_FORM, 260, 128, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_LABELSLASH, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_LABELSLASH, -1, "", "LABELSLASH", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.PANEL_LIST, 180, 168, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.PANEL_FORM, 312, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_SELEZIONVOCE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_SELEZIONVOCE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_SELEZIONVOCE, -1, "", "SELEZIONVOCE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_LIST, 188, 176, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_FORM, 332, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOVOCE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_INFOVOCE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_INFOVOCE, -1, "", "INFOVOCE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_LIST, "ACC DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, 252, 76, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ACCDESCRIZIO, MyGlb.PANEL_FORM, "ACC DESCR.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ACCDESCRIZIO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ACCDESCRIZIO, PPQRY_ACC, "A.DESCRIZIONE", "ACCDESCRIZIO", 5, 140, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_LIST, 192, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 240, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NEWPANELLABE, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, 80, 264, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CENTRO, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CENTRO, PPQRY_TCO2, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, 224, 264, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CENTRIDESCRI, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, 32, 288, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_COMPETENZDAL, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_COMPETENZDAL, PPQRY_TCO2, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, 92);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_LIST, "al");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, 224, 288, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, 20);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_AL, MyGlb.PANEL_FORM, "al");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_AL, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_AL, PPQRY_TCO2, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, 48, 240, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, 64);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_FATTORE, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_FATTORE, PPQRY_TCO2, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, 224, 240, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_FATTORDESCRI, -1, GRP_CORRISPETTIV_ECONOMICA);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, 20, 352, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_UTENTE1, -1, GRP_CORRISPETTIV_INSERIMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_UTENTE1, PPQRY_TCO2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, 188, 352, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATA1, -1, GRP_CORRISPETTIV_INSERIMENTO);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATA1, PPQRY_TCO2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, 396, 352, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_UTENTE, -1, GRP_CORRISPETTIV_AGGIORNAMENT);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_UTENTE, PPQRY_TCO2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_LIST, "Data ");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, 576, 352, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, 40);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA2, MyGlb.PANEL_FORM, "Data ");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATA2, -1, GRP_CORRISPETTIV_AGGIORNAMENT);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATA2, PPQRY_TCO2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, 112);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_LIST, "Contabile");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, 604, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTABILE, MyGlb.PANEL_FORM, "Contabile");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CONTABILE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CONTABILE, PPQRY_TCO2, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_LIST, "Data  ");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, 840, 220, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, 52);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATA, MyGlb.PANEL_FORM, "Data  ");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATA, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATA, PPQRY_TCO2, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_LIST, "Data incasso c.c.p.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, 568, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAINCASCCP, MyGlb.PANEL_FORM, "Data incasso c.c.p.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATAINCASCCP, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATAINCASCCP, PPQRY_TCO2, "A.DATA_CCP", "DATA_CCP", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, 116);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_LIST, "Data estratto c.c.p.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, 764, 244, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, 128);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DATAESTRACCP, MyGlb.PANEL_FORM, "Data estratto c.c.p.");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DATAESTRACCP, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DATAESTRACCP, PPQRY_TCO2, "A.DATA_ESTRATTO_CCP", "DATA_ESTRATTO_CCP", 6, 19, 0, -13997);
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
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_IVADEF, PPQRY_TCO2, "A.IVA_DEF", "IVA_DEF", 1, 1, 0, -13997);
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
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ESERCIZIO, PPQRY_TCO2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, 976, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_LIST, "ANNO PRE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, 4, 396, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOPRE, MyGlb.PANEL_FORM, "ANNO PRE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOPRE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOPRE, PPQRY_TCO2, "A.ANNO_PRE", "ANNO_PRE", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, 1036, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_LIST, "NUMERO PRE");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, 4, 420, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROPRE, MyGlb.PANEL_FORM, "NUM. PRE");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROPRE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROPRE, PPQRY_TCO2, "A.NUMERO_PRE", "NUMERO_PRE", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1112, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_LIST, "Tipo Quietanza");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, 584, 268, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, 100);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOQUIETANZ, MyGlb.PANEL_FORM, "Tipo Quietanza");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOQUIETANZ, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOQUIETANZ, PPQRY_TCO2, "A.TIPO_QUIETANZA", "TIPO_QUIETANZA", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, 1208, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_LIST, "PASSATO CDR");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, 4, 468, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_PASSATOCDR, MyGlb.PANEL_FORM, "PASS. CDR");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_PASSATOCDR, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_PASSATOCDR, PPQRY_TCO2, "A.PASSATO_CDR", "PASSATO_CDR", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, 1288, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, 16);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_LIST, "E");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, 4, 492, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, 16);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_E, MyGlb.PANEL_FORM, "E");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_E, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_E, PPQRY_TCO2, "A.E", "E", 5, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, 1328, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_LIST, "CONTO RICAVO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, 4, 516, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CONTORICAVO, MyGlb.PANEL_FORM, "CON. RICAVO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CONTORICAVO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CONTORICAVO, PPQRY_TCO2, "A.CONTO_RICAVO", "CONTO_RICAVO", 5, 6, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, 1416, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_LIST, "CENTRO COSTO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, 4, 540, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CENTROCOSTO, MyGlb.PANEL_FORM, "CENT. COSTO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CENTROCOSTO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CENTROCOSTO, PPQRY_TCO2, "A.CENTRO_COSTO", "CENTRO_COSTO", 5, 6, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, 1504, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, 92);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_LIST, "CODICE RECORD");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, 4, 564, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, 92);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CODICERECORD, MyGlb.PANEL_FORM, "COD. RECORD");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CODICERECORD, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CODICERECORD, PPQRY_TCO2, "A.CODICE_RECORD", "CODICE_RECORD", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_LIST, 176, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABELSLASH1, MyGlb.PANEL_FORM, 188, 76, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_CORRISPETTIV.SetIMDB(IMDB, "PQRY_TCO2", true);
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
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TCO A ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.TIPO_REGISTRO = 4 AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') <> 'U') OR (A.TIPO_REGISTRO = ~~TBL_PARAM38.ROWNAMTIPREG~~ AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') = 'U')) ");
    SQL.append("and   ((((A.D_DATA_REG IS NULL) OR A.D_DATA_REG >= ~~PQRY_PARAM29.ROWNAMAPARDA~~) AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') <> 'U') OR NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') = 'U') ");
    SQL.append("and   ((((~~PQRY_PARAM29.ROWNAMEBOLLA~~ = -1) OR A.TIPO_BOLLATO = ~~PQRY_PARAM29.ROWNAMEBOLLA~~) AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') <> 'U') OR (A.TIPO_BOLLATO = ~~TBL_PARAM38.ROWNAMTIPBOL~~ AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') = 'U')) ");
    SQL.append("and   ((A.ANNO_REG = ~~TBL_PARAM38.ROWNAMANNREG~~ AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') = 'U') OR NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') <> 'U') ");
    SQL.append("and   ((A.NUMERO_REG = ~~TBL_PARAM38.ROWNAMNUMREG~~ AND NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') = 'U') OR NVL(~~TBL_PARAM38.ROWNAMEUPDAT~~, 'O') <> 'U') ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO, ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.NUMERO_REG ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO2, 5, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_TCO2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(0, "TCO");
    PAN_CORRISPETTIV.AddToSortList(PFL_CORRISPETTIV_TIPOBOLLATO1, true);
    PAN_CORRISPETTIV.AddToSortList(PFL_CORRISPETTIV_DATAREG, true);
    PAN_CORRISPETTIV.AddToSortList(PFL_CORRISPETTIV_NUM, true);
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
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, "71755DD8-E2BD-4AF7-8FAA-613F780B29C0");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, "Aliquota");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_ALIQUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, "2E74B103-D97D-4CEA-B74F-460871FDA611");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, "Esenzione");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, "587E7DAF-5A3C-4CFE-948F-FD382370A270");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, "Importo");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, "9AB838AD-0C34-42B7-A9EB-4052B3BE8507");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, "Imponibile");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_IVA, "E7F7C50E-7045-48F9-BEC3-4EA46F30FEAF");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_IVA, "Iva");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_IVA, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.VIS_NORMALFIELDS);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_IVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, "19DBC4D7-4C76-4F87-AA5B-F9FAF535056E");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, MyGlb.VIS_CAMPTOTADISA);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, "F67C40AE-3D9F-4B45-BBAB-1BB2E63A9986");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, MyGlb.VIS_CAMPTOTADISA);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIMPONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, "4BD37AEF-1159-4AB0-A5DD-B9BF56173A3D");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, MyGlb.VIS_CAMPTOTADISA);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TOTALEIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, "A4B4B8CF-3A31-4FCB-8E29-E55E1F1A5F88");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, MyGlb.VIS_ETICGRASLEFT);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_INTESTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, "CBAD6D55-8AD5-4772-ABBD-88BA59039826");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, "4EA38416-7E07-4929-B40D-71D44B79911E");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, "0A37D530-77B0-4DD2-8E62-870B5FA0D643");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, "34EA8E93-97E4-4863-A040-DE681AF03E4B");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, "14C26FBC-7F7D-4882-9137-C07B52DFA892");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, "ANNO REG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, 0, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, "4CE37326-691E-4535-9781-3B7C1C37A57D");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, "NUMERO REG");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, 0, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, "FA432CE9-54A4-400E-ADF0-FA5685293D15");
    PAN_IVA.set_Header(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_IVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, "");
    PAN_IVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.VIS_NONNULLAFIEL);
    PAN_IVA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, 0, -1);
    PAN_IVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, "B6DFAD13-CDB4-41F9-9061-133B0B550624");
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
    PAN_IVA.SetFieldPanel(PFL_IVA_ALIQUOTA, PPQRY_DCO1, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, 40, 68, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, 108);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_LIST, "Esenzione");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, 136);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ESENZIONE, MyGlb.PANEL_FORM, "Esenzione");
    PAN_IVA.SetFieldPage(PFL_IVA_ESENZIONE, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_ESENZIONE, PPQRY_DCO1, "A.CODICE_ESENZIONE", "CODICE_ESENZIONE", 1, 2, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, 216, 68, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, 4, 172, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_IVA.SetFieldPage(PFL_IVA_IMPORTO, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_IMPORTO, PPQRY_DCO1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, 316, 68, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, 68);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, 68);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_IVA.SetFieldPage(PFL_IVA_IMPONIBILE, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_IMPONIBILE, PPQRY_DCO1, "A.IMPONIBILE", "IMPONIBILE", 3, 14, 2, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, 416, 68, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, 28);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_LIST, "Iva");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, 4, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, 136);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_IVA, MyGlb.PANEL_FORM, "Iva");
    PAN_IVA.SetFieldPage(PFL_IVA_IVA, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_IVA, PPQRY_DCO1, "A.IVA", "IVA", 3, 14, 2, -13997);
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
    PAN_IVA.SetFieldPanel(PFL_IVA_UTENTEINSERI, PPQRY_DCO1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_IVA.SetFieldPage(PFL_IVA_DATAINSERIME, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_DATAINSERIME, PPQRY_DCO1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_IVA.SetFieldPage(PFL_IVA_UTENTULTIAGG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_UTENTULTIAGG, PPQRY_DCO1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_IVA.SetFieldPage(PFL_IVA_DATAULTIMAGG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_DATAULTIMAGG, PPQRY_DCO1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, 512, 68, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, 60);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_LIST, "ANNO REG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, 4, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, 60);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_ANNOREG, MyGlb.PANEL_FORM, "ANN. REG");
    PAN_IVA.SetFieldPage(PFL_IVA_ANNOREG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_ANNOREG, PPQRY_DCO1, "A.ANNO_REG", "ANNO_REG", 1, 4, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, 572, 68, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, 76);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_LIST, "NUMERO REG");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, 4, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, 76);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_NUMEROREG, MyGlb.PANEL_FORM, "NUM. REG");
    PAN_IVA.SetFieldPage(PFL_IVA_NUMEROREG, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_NUMEROREG, PPQRY_DCO1, "A.NUMERO_REG", "NUMERO_REG", 1, 5, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 648, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 268, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOBOLLATO, MyGlb.PANEL_FORM, "TP. BOLLATO");
    PAN_IVA.SetFieldPage(PFL_IVA_TIPOBOLLATO, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TIPOBOLLATO, PPQRY_DCO1, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 728, 68, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_IVA.SetRect(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 88);
    PAN_IVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_IVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVA_TIPOREGISTRO, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_IVA.SetFieldPage(PFL_IVA_TIPOREGISTRO, -1, -1);
    PAN_IVA.SetFieldPanel(PFL_IVA_TIPOREGISTRO, PPQRY_DCO1, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
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
    PAN_IVA.SetIMDB(IMDB, "PQRY_DCO1", true);
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
    PAN_IVA.SetQuery(PPQRY_DCO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DCO A ");
    PAN_IVA.SetQuery(PPQRY_DCO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_REG = ~~PQRY_TCO2.ANNO_REG~~) ");
    SQL.append("and   (A.NUMERO_REG = ~~PQRY_TCO2.NUMERO_REG~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~PQRY_TCO2.TIPO_REGISTRO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_TCO2.TIPO_BOLLATO~~) ");
    PAN_IVA.SetQuery(PPQRY_DCO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVA.SetQuery(PPQRY_DCO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVA.SetQuery(PPQRY_DCO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_IVA.SetQuery(PPQRY_DCO1, 5, SQL, -1, "");
    PAN_IVA.SetQueryDB(PPQRY_DCO1, MainFrm.Cf4armDBObject.DB, 4);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IVA) PAN_IVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_ValidateRow(Cancel);
    if (SrcObj == PAN_IVA) PAN_IVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_DynamicProperties();
    if (SrcObj == PAN_IVA) PAN_IVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IVA) PAN_IVA_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_OnChangeRow();
    if (SrcObj == PAN_IVA) PAN_IVA_OnChangeRow();
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
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_IVA) PAN_IVA_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_BeforeInsert(Cancel);
    if (SrcObj == PAN_IVA) PAN_IVA_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IVA) PAN_IVA_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_IVA) PAN_IVA_AfterDelete();
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
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_AfterCommit(RowUpdated, RowError);
    if (SrcObj == PAN_IVA) PAN_IVA_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
