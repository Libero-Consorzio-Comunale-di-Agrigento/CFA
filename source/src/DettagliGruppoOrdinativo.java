// **********************************************
// Dettagli Gruppo Ordinativo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliGruppoOrdinativo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_GRUPPOLABEL = 0;
  private static int PFL_PARAMETRI_IMPOTOTALABE = 1;
  private static int PFL_PARAMETRI_ORDINAMENTO = 2;
  private static int PFL_PARAMETRI_ANCHDETTEMES = 3;

  private static int PPQRY_PARAMETRI279 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_DETTGRUPORDI_CAPITOLOART = 0;
  private static int GRP_DETTGRUPORDI_ACCERTAMENTO = 1;
  private static int GRP_DETTGRUPORDI_CONTABILE = 2;
  private static int GRP_DETTGRUPORDI_ECONOMICA = 3;
  private static int GRP_DETTGRUPORDI_ORDINAINFORM = 4;
  private static int GRP_DETTGRUPORDI_ORDINATIVO = 5;

  private static int PFL_DETTGRUPORDI_PROGRESSIVO = 0;
  private static int PFL_DETTGRUPORDI_GRUPPO = 1;
  private static int PFL_DETTGRUPORDI_CAPITOLOOLD = 2;
  private static int PFL_DETTGRUPORDI_ARTICOLOOLD = 3;
  private static int PFL_DETTGRUPORDI_ANNOACCOLD = 4;
  private static int PFL_DETTGRUPORDI_NUMEROACCOLD = 5;
  private static int PFL_DETTGRUPORDI_CODICDEBIOLD = 6;
  private static int PFL_DETTGRUPORDI_QUIETANZAOLD = 7;
  private static int PFL_DETTGRUPORDI_VOCEECONOOLD = 8;
  private static int PFL_DETTGRUPORDI_SPESEOLD = 9;
  private static int PFL_DETTGRUPORDI_CCF = 10;
  private static int PFL_DETTGRUPORDI_IMPORTO = 11;
  private static int PFL_DETTGRUPORDI_CAPITOLO = 12;
  private static int PFL_DETTGRUPORDI_ARTICOLO = 13;
  private static int PFL_DETTGRUPORDI_LABEVOCPEGSX = 14;
  private static int PFL_DETTGRUPORDI_LABEVOCPEGDX = 15;
  private static int PFL_DETTGRUPORDI_BARRAVOCEPEG = 16;
  private static int PFL_DETTGRUPORDI_APRICAPILIST = 17;
  private static int PFL_DETTGRUPORDI_SCEVOCPEGLAB = 18;
  private static int PFL_DETTGRUPORDI_INFOCAPILIST = 19;
  private static int PFL_DETTGRUPORDI_INFOCAPIDETT = 20;
  private static int PFL_DETTGRUPORDI_LABELACCSX = 21;
  private static int PFL_DETTGRUPORDI_LABELACCDX = 22;
  private static int PFL_DETTGRUPORDI_NUMEROACC = 23;
  private static int PFL_DETTGRUPORDI_ANNOACC = 24;
  private static int PFL_DETTGRUPORDI_BARRAIMPEGNO = 25;
  private static int PFL_DETTGRUPORDI_APRIACCLIST = 26;
  private static int PFL_DETTGRUPORDI_SCEGACCELABE = 27;
  private static int PFL_DETTGRUPORDI_INFOACCLIST = 28;
  private static int PFL_DETTGRUPORDI_INFOACCEDETT = 29;
  private static int PFL_DETTGRUPORDI_CODICEDEBITO = 30;
  private static int PFL_DETTGRUPORDI_DEBITORE = 31;
  private static int PFL_DETTGRUPORDI_APRIDEBILIST = 32;
  private static int PFL_DETTGRUPORDI_SELEZISOGGET = 33;
  private static int PFL_DETTGRUPORDI_INFODEBILIST = 34;
  private static int PFL_DETTGRUPORDI_INFODEBIDETT = 35;
  private static int PFL_DETTGRUPORDI_DESCRIZIONE = 36;
  private static int PFL_DETTGRUPORDI_QUIETANZA = 37;
  private static int PFL_DETTGRUPORDI_QUIETADESCRI = 38;
  private static int PFL_DETTGRUPORDI_VOCEECONOMIC = 39;
  private static int PFL_DETTGRUPORDI_VOCIECONDESC = 40;
  private static int PFL_DETTGRUPORDI_CGE = 41;
  private static int PFL_DETTGRUPORDI_CODIGESTDESC = 42;
  private static int PFL_DETTGRUPORDI_CONTALABELDX = 43;
  private static int PFL_DETTGRUPORDI_NUMERO = 44;
  private static int PFL_DETTGRUPORDI_DATA = 45;
  private static int PFL_DETTGRUPORDI_UFFICIO = 46;
  private static int PFL_DETTGRUPORDI_TIPOVINCOLO = 47;
  private static int PFL_DETTGRUPORDI_BOLLO = 48;
  private static int PFL_DETTGRUPORDI_CODLIVELLO5 = 49;
  private static int PFL_DETTGRUPORDI_VISSTRRICDES = 50;
  private static int PFL_DETTGRUPORDI_CODICEEUROPE = 51;
  private static int PFL_DETTGRUPORDI_FATTORE = 52;
  private static int PFL_DETTGRUPORDI_FATTORDESCRI = 53;
  private static int PFL_DETTGRUPORDI_CENTRO = 54;
  private static int PFL_DETTGRUPORDI_CENTRIDESCRI = 55;
  private static int PFL_DETTGRUPORDI_COMPETENZDAL = 56;
  private static int PFL_DETTGRUPORDI_AL = 57;
  private static int PFL_DETTGRUPORDI_FINANZIAMENT = 58;
  private static int PFL_DETTGRUPORDI_OPERA = 59;
  private static int PFL_DETTGRUPORDI_SPESE = 60;
  private static int PFL_DETTGRUPORDI_COMMISSIONI = 61;
  private static int PFL_DETTGRUPORDI_ALLEGATI = 62;
  private static int PFL_DETTGRUPORDI_INFOTESORIER = 63;
  private static int PFL_DETTGRUPORDI_LABELORDDX = 64;
  private static int PFL_DETTGRUPORDI_NUMEROORD = 65;
  private static int PFL_DETTGRUPORDI_BARRAORD = 66;
  private static int PFL_DETTGRUPORDI_ANNOORD = 67;
  private static int PFL_DETTGRUPORDI_INFOORDILIST = 68;
  private static int PFL_DETTGRUPORDI_INFOORDIDETT = 69;
  private static int PFL_DETTGRUPORDI_UTENTEINSERI = 70;
  private static int PFL_DETTGRUPORDI_DATAINSERIME = 71;
  private static int PFL_DETTGRUPORDI_UTENTULTIAGG = 72;
  private static int PFL_DETTGRUPORDI_DATAULTIMAGG = 73;
  private static int PFL_DETTGRUPORDI_CAPITARTLABE = 74;
  private static int PFL_DETTGRUPORDI_ACCERTALABEL = 75;
  private static int PFL_DETTGRUPORDI_CAPTITOLO = 76;
  private static int PFL_DETTGRUPORDI_CAPCATEGORIA = 77;
  private static int PFL_DETTGRUPORDI_CAPCODINTERV = 78;
  private static int PFL_DETTGRUPORDI_CAPCODTERZI = 79;
  private static int PFL_DETTGRUPORDI_FATTORITIPO = 80;
  private static int PFL_DETTGRUPORDI_ORDINAMEDAOP = 81;
  private static int PFL_DETTGRUPORDI_ANNOPRE = 82;
  private static int PFL_DETTGRUPORDI_IDOBIETGESTI = 83;

  private static int PPQRY_GRO1 = 0;

  private static int PPQRY_DEBITORE = 1;
  private static int PPQRY_QTNBEN = 2;
  private static int PPQRY_VOCEECONDESC = 3;
  private static int PPQRY_CGEDESCRIZIO = 4;
  private static int PPQRY_FATTORI = 5;
  private static int PPQRY_CENTRI = 6;
  private static int PPQRY_CAP = 7;
  private static int PPQRY_CODLIVELLO5 = 8;
  private static int PPQRY_APRIINFO = 9;

  private static int PPQRY_T53 = 10;
  private static int PPQRY_VINCOLI = 11;
  private static int PPQRY_T60 = 12;
  private static int PPQRY_BILFIN1 = 13;
  private static int PPQRY_BILFIN = 14;
  private static int PPQRY_TIPISPESMINF = 15;


  IDPanel PAN_DETTGRUPORDI;

  // Definition of Global Variables
  private IDVariant RPPATTIVA = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant SPESADAPROPO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant NUOVOPROGRES = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant CONTROLLOSUD = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant CONTRSUDISPO = new IDVariant(0,IDVariant.STRING);
  private IDVariant DUPLICA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI311(IMDB);
    Init_TBL_CHECKUP(IMDB);
    //
    //
    Init_PQRY_GRO1(IMDB);
    Init_PQRY_PARAMETRI279(IMDB);
    Init_PQRY_PARAMETRI279_RS(IMDB);
    Init_QRY_CHECKUP2(IMDB);
    Init_QRY_CHECKUP1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI311(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI311, 12);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI311, "TBL_PARAMETRI311");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMTIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAQUALNOTE, "PARAQUALNOTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAQUALNOTE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMRPPATTI, "PARAMRPPATTI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMRPPATTI,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAMORDINAM,5,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAIMPDAFIL, "PARAIMPDAFIL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARAIMPDAFIL,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARANCDETEME, "PARANCDETEME");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI311,IMDBDef5.FLD_PARAMETRI311_PARANCDETEME,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI311, 0);
  }

  private static void Init_TBL_CHECKUP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_CHECKUP, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_CHECKUP, "TBL_CHECKUP");
    IMDB.set_FldCode(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMOGGNUMACC, "NOMOGGNUMACC");
    IMDB.SetFldParams(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMOGGNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMOGGANNACC, "NOMOGGANNACC");
    IMDB.SetFldParams(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMOGGANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef5.TBL_CHECKUP,IMDBDef5.FLD_CHECKUP_NOMEOGGEIMPO,3,14,2);
  }

  private static void Init_PQRY_GRO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_GRO1, 47);
    IMDB.set_TblCode(IMDBDef15.PQRY_GRO1, "PQRY_GRO1");
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GRUPPO, "GRUPPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GRUPPO,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROCAPITOOLD, "GROCAPITOOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROCAPITOOLD,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROARTICOOLD, "GROARTICOOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROARTICOOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GRONUMACCOLD, "GRONUMACCOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GRONUMACCOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROANNACCOLD, "GROANNACCOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROANNACCOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DEBITORE,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROCODDEBOLD, "GROCODDEBOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROCODDEBOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROQUIETAOLD, "GROQUIETAOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROQUIETAOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROVOCECOOLD, "GROVOCECOOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROVOCECOOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COMPETENZA_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COMPETENZA_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CCF, "CCF");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CCF,5,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROSPESEOLD, "GROSPESEOLD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_GROSPESEOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DATA_CONTABILE,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ID_OBIETTIVO_GESTIONE, "ID_OBIETTIVO_GESTIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ID_OBIETTIVO_GESTIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ORDINAMEDAOP, "ORDINAMEDAOP");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ORDINAMEDAOP,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO1,IMDBDef15.PQSL_GRO1_ANNO_ORD,1,4,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_GRO1, 0);
  }

  private static void Init_PQRY_PARAMETRI279(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI279, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI279, "PQRY_PARAMETRI279");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARAMTIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARAMORDINAM,5,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARANCDETEME, "PARANCDETEME");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279,IMDBDef15.PQSL_PARAMETRI279_PARANCDETEME,5,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI279, 0);
  }

  private static void Init_PQRY_PARAMETRI279_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI279_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI279_RS, "PQRY_PARAMETRI279_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARAMTIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARAMORDINAM,5,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARANCDETEME, "PARANCDETEME");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI279_RS,IMDBDef15.PQSL_PARAMETRI279_PARANCDETEME,5,2,0);
  }

  private static void Init_QRY_CHECKUP2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.QRY_CHECKUP2, 3);
    IMDB.set_TblCode(IMDBDef15.QRY_CHECKUP2, "QRY_CHECKUP2");
    IMDB.set_FldCode(IMDBDef15.QRY_CHECKUP2,IMDBDef15.QSL_CHECKUP2_CAPITOLORW, "CAPITOLORW");
    IMDB.SetFldParams(IMDBDef15.QRY_CHECKUP2,IMDBDef15.QSL_CHECKUP2_CAPITOLORW,3,16,0);
    IMDB.set_FldCode(IMDBDef15.QRY_CHECKUP2,IMDBDef15.QSL_CHECKUP2_ARTICOLORW, "ARTICOLORW");
    IMDB.SetFldParams(IMDBDef15.QRY_CHECKUP2,IMDBDef15.QSL_CHECKUP2_ARTICOLORW,1,2,0);
    IMDB.set_FldCode(IMDBDef15.QRY_CHECKUP2,IMDBDef15.QSL_CHECKUP2_SOMMAIMPORTO, "SOMMAIMPORTO");
    IMDB.SetFldParams(IMDBDef15.QRY_CHECKUP2,IMDBDef15.QSL_CHECKUP2_SOMMAIMPORTO,3,28,6);
  }

  private static void Init_QRY_CHECKUP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.QRY_CHECKUP1, 3);
    IMDB.set_TblCode(IMDBDef15.QRY_CHECKUP1, "QRY_CHECKUP1");
    IMDB.set_FldCode(IMDBDef15.QRY_CHECKUP1,IMDBDef15.QSL_CHECKUP1_ANNOACCRW, "ANNOACCRW");
    IMDB.SetFldParams(IMDBDef15.QRY_CHECKUP1,IMDBDef15.QSL_CHECKUP1_ANNOACCRW,1,4,0);
    IMDB.set_FldCode(IMDBDef15.QRY_CHECKUP1,IMDBDef15.QSL_CHECKUP1_NUMEROACCRW, "NUMEROACCRW");
    IMDB.SetFldParams(IMDBDef15.QRY_CHECKUP1,IMDBDef15.QSL_CHECKUP1_NUMEROACCRW,1,5,0);
    IMDB.set_FldCode(IMDBDef15.QRY_CHECKUP1,IMDBDef15.QSL_CHECKUP1_SOMMAIMPORTO, "SOMMAIMPORTO");
    IMDB.SetFldParams(IMDBDef15.QRY_CHECKUP1,IMDBDef15.QSL_CHECKUP1_SOMMAIMPORTO,3,28,6);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliGruppoOrdinativo(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliGruppoOrdinativo()
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
    FormIdx = MyGlb.FRM_DETTGRUPORDI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1CCEA685-190C-4473-BA92-D80C4EDCA3A5";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 988;
    DesignHeight = 846;
    set_Caption(new IDVariant("Dettagli Gruppo Ordinativo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 988;
    Frames[1].Height = 820;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0731707;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 988;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 988-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AEDED773-8FCE-4D8D-BD29-07DE1DBE2283");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 988;
    Frames[3].Height = 760;
    Frames[3].Caption = "Dettagli Gruppo Ordinativi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 760;
    PAN_DETTGRUPORDI = new IDPanel(w, this, 3, "PAN_DETTGRUPORDI");
    Frames[3].Content = PAN_DETTGRUPORDI;
    PAN_DETTGRUPORDI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTGRUPORDI.VS = MainFrm.VisualStyleList;
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 988-MyGlb.PAN_OFFS_X, 760-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D716D672-41AF-482E-9149-9E9D2A5CED1C");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 12, 1072, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTGRUPORDI.InitStatus = 2;
    PAN_DETTGRUPORDI_Init();
    PAN_DETTGRUPORDI_InitFields();
    PAN_DETTGRUPORDI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA40+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPA14+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI45+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI51+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI45+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPORTDAFILE+BaseCmdLinIdx)
      {
        ImportdaFile();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVALOCOMU+BaseCmdLinIdx)
      {
        ApriAggiornamentoValoriComuni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMDETTGRUP+BaseCmdLinIdx)
      {
        ApriEliminaDettagliGruppo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTRODISPO1+BaseCmdLinIdx)
      {
        ApriControlloDisponibilità();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTDISPPURO+BaseCmdLinIdx)
      {
        ApriDisponibilitàPuro();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIORDINA+BaseCmdLinIdx)
      {
        ApriEmissioneOrdinativi();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI311, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DETTGRUPORDI_PARAMETRI279();
      }
      PAN_DETTGRUPORDI.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_APRICAPILIST) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_SCEVOCPEGLAB) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_APRIACCLIST) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_SCEGACCELABE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_APRIDEBILIST) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_SELEZISOGGET) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEQUIDELSOG && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_QUIETANZA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEVOCECCOFI && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_VOCEECONOMIC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECODGECOFI && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_CGE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_CODLIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_DETTGRUPORDI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTGRUPORDI_CENTRO) {
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
    return (obj instanceof DettagliGruppoOrdinativo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliGruppoOrdinativo.class.getName() : (Glb.ClassWithPackage(DettagliGruppoOrdinativo.class) ? DettagliGruppoOrdinativo.class.getName().substring(DettagliGruppoOrdinativo.class.getPackage().getName().length() + 1) : DettagliGruppoOrdinativo.class.getName()));
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
    IDVariant v_PERSONALIZZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOWPERS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_WINDOW = (new IDVariant("w_grl", IDVariant.STRING));
      v_WINDOWPERS = (new IDVariant("w_grl_riv", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Dettagli Gruppo Ordinativi ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0))));
      v_PERSONALIZZA = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_WINDOW);
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMORDINAM, 0, (new IDVariant("CAP")));
      CONTROLLOSUD = (new IDVariant(0));
      if (v_PERSONALIZZA.equals(v_WINDOWPERS, true))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_DETTGRUPORDI.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTGRUPORDI.ObjRect(Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_DETTGRUPORDI.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTGRUPORDI.ObjRect(Glb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      VisibilitàFinanziaria();
      VisibilitàEconomica();
      VisibilitàOrdinativoInformatico();
      VisibilitàComandi();
      if (MainFrm.FunctionRppAttiva().equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMRPPATTI, 0, (new IDVariant(1)));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMRPPATTI, 0, (new IDVariant(0)));
      }
      PAN_DETTGRUPORDI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_GRUPPOLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Gruppo")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0)).stringValue());
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Segnalazione Disponibilità Ordinativi a Gruppi"));
      IDVariant v_VREGISTVALOR = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/' || " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STRINGA = " + IDL.CSql(S, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VREGISTVALOR = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_VREGISTVALOR,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        CONTRSUDISPO = (new IDVariant("SI"));
      }
      else
      {
        CONTRSUDISPO = (new IDVariant("NO"));
      }
      if (MainFrm.INTEMPOBIGES.compareTo((new IDVariant("SI")), true)!=0)
      {
      }
      PAN_DETTGRUPORDI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTGRUPORDI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_DETTGRUPORDI.SetFieldValidation(PFL_DETTGRUPORDI_CAPITOLOOLD, (new IDVariant(-1)).booleanValue()); 
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAIMPDAFIL, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_IMPORTDAFILE+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_IMPORTDAFILE+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCAPITOOLD, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROARTICOOLD, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        ProponiDaVocePeg();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROANNACCOLD, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRONUMACCOLD, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        ProponiDaAcc();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0),IDVariant.INTEGER));
      }
      // 
      // 
      // 
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCODDEBOLD, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0),IDVariant.INTEGER));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCODDEBOLD, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOCECCOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0, IMDB.Value(IMDBDef7.PQRY_VOCIECONOMI4, IMDBDef7.PQSL_VOCIECONOMI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECODGECOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE, 0, IMDB.Value(IMDBDef7.PQRY_RICLASSIGEST, IMDBDef7.PQSL_RICLASSIGEST_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEQUIDELSOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAOBIETT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ID_OBIETTIVO_GESTIONE, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBF3, IMDBDef7.PQSL_POLELENCOBF3_SCHEDA_OBIETTIVO_ID, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEOBIDIGEDU)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ID_OBIETTIVO_GESTIONE, 0, IMDB.Value(IMDBDef8.PQRY_DUPOBIETGEST, IMDBDef8.PQSL_DUPOBIETGEST_DUOBDUOBIDOG, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGVALCOORLI)), true) && Result.booleanValue())
      {
        if (AggiornaValori())
        {
          PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_IMPDAFILSUGR)), true))
      {
        PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "EndModalEvent", _e);
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
      UNLOADEVENT_PARAMEDELETE();
      UNLOADEVENT_CHECKUDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARDATULTELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMALLEGAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAINFOTESO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAQUALNOTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMRPPATTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMORDINAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAIMPDAFIL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARANCDETEME, 0, new IDVariant());
  }

  // **********************************************************************
  // CHECKUP: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_CHECKUDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_CHECKUP);
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTGRUPORDI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTGRUPORDI);
      // 
      // Dettagli Gruppo Ordinativi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTGRUPORDI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTGRUPORDI_DEBITORE,(new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_DEBITORE))).stringValue()); 
      PAN_DETTGRUPORDI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTGRUPORDI_DESCRIZIONE,(new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_DESCRIZIONE))).stringValue()); 
      if ((new IDVariant(PAN_DETTGRUPORDI.Layout())).equals((new IDVariant(1)), true))
      {
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0)))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_PRE, 0)))
      {
        AbilitaCampi();
      }
      else
      {
        DisabilitaCampi();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTGRUPORDI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi After Find Event Body
      // Procedure Body
      // 
      SettaTotale();
      CONTROLLOSUD = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DETTGRUPORDI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
      if (Command.equals((new IDVariant(256)), true))
      {
        DUPLICA = (new IDVariant(-1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_DETTGRUPORDI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_SPESE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROSPESEOLD, 0)))
        {
          if (IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_SPESE, 0, new IDVariant(SPESADAPROPO));
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRUPPO, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRUPPO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DATA_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_UTENTE_INSERIMENTO, 0)) || DUPLICA.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DATA_INSERIMENTO, 0, IDL.Today());
        }
        if (DUPLICA.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCAPITOOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROARTICOOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROANNACCOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRONUMACCOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCODDEBOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROQUIETAOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROVOCECOOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROSPESEOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_SPESE, 0));
          DUPLICA = (new IDVariant(0));
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0 || IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_DETTGRUPORDI_ARTICOLO)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCAPITOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROARTICOOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0))))
          {
            ProponiDaVocePeg();
          }
          else
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCAPITOOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROARTICOOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_NUMEROACC)), true) || Column.equals((new IDVariant(PFL_DETTGRUPORDI_ANNOACC)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRONUMACCOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROANNACCOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0))))
          {
            if (MainFrm.ControlloAccertamentoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0)))
            {
              ProponiDaAcc();
            }
            else
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Accertamento non previsto in Bilancio!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROANNACCOLD, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRONUMACCOLD, 0, (new IDVariant()));
            }
          }
          else
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0)))
            {
              if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0))))
              {
                ProponiDaVocePeg();
              }
            }
          }
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROANNACCOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRONUMACCOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_CODICEDEBITO)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCODDEBOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0))))
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0, MainFrm.SettaQuietanzaBeneficiario(new IDVariant(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0),IDVariant.FLOAT), IDL.Today()));
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROQUIETAOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0));
            if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0))))
            {
              if (MainFrm.SPESE_DA_SOGGETTO.equals((new IDVariant("SI")), true))
              {
                SettaSpeseDaQuietanza(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0), new IDVariant(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0),IDVariant.FLOAT));
              }
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCODDEBOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_QUIETANZA)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROQUIETAOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0))))
          {
            if (MainFrm.SPESE_DA_SOGGETTO.equals((new IDVariant("SI")), true))
            {
              SettaSpeseDaQuietanza(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0), new IDVariant(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0),IDVariant.FLOAT));
            }
          }
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROQUIETAOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_VOCEECONOMIC)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROVOCECOOLD, 0), true)!=0)
        {
          ProponiCguUnico();
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROVOCECOOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_FINANZIAMENT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FINANZIAMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, (new IDVariant()));
        }
        else
        {
          ProponiOpera();
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_SPESE)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_SPESE, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROSPESEOLD, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROSPESEOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_SPESE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_IMPORTO)), true))
      {
        SettaTotale();
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_CODLIVELLO5)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VISTA_STRUTTURA_RICL A, ");
          SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
          SQL.append("where (B.ESERCIZIO(+) = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S(+) = 'E') ");
          SQL.append("and   (B.CAPITOLO(+) = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ARTICOLO(+) = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE_TIPO_RICL(+) = 'MACRO') ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(B.ESERCIZIO_INIZIO(+), 0) AND NVL(B.ESERCIZIO_SCADENZA(+), 9999))) ");
          SQL.append("and   (A.CODICE_PADRE = NVL(B.CODICE(+), A.CODICE_PADRE)) ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
          SQL.append("and   (A.LIVELLO = 2) ");
          SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Codice V Livello inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0, (new IDVariant()));
          }
          else
          {
            if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(0)), true)>0)
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0)))
              {
                IDVariant v_VGETCODLIVE4 = new IDVariant(0,IDVariant.DECIMAL);
                v_VGETCODLIVE4 = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  GET_COD_LIVELLO_4(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GCL4SESGCDGO ");
                SQL.append("from ");
                SQL.append("  DUAL A ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VGETCODLIVE4 = QV.Get("GCL4SESGCDGO", IDVariant.DECIMAL) ;
                }
                QV.Close();
                IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0, MainFrm.Getfattoreassociatoeconomica(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), new IDVariant(v_VGETCODLIVE4,IDVariant.INTEGER), new IDVariant(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0),IDVariant.INTEGER)));
              }
            }
          }
        }
      }
      if (Inserting.booleanValue() || ((Column.equals((new IDVariant(PFL_DETTGRUPORDI_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_DETTGRUPORDI_ARTICOLO)), true) || Column.equals((new IDVariant(PFL_DETTGRUPORDI_ANNOACC)), true) || Column.equals((new IDVariant(PFL_DETTGRUPORDI_NUMEROACC)), true) || Column.equals((new IDVariant(PFL_DETTGRUPORDI_IMPORTO)), true)) && FieldWasModified.booleanValue()))
      {
        CONTROLLOSUD = (new IDVariant(-1));
      }
      if (Column.equals((new IDVariant(PFL_DETTGRUPORDI_FATTORE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0))))
        {
          IDVariant v_VFATTORITIPO = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as FATTORITIPO ");
          SQL.append("from ");
          SQL.append("  FATTORI A ");
          SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VFATTORITIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VFATTORITIPO.compareTo((new IDVariant("E")), true)!=0)
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CENTRO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COMPETENZA_DAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COMPETENZA_AL, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CENTRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COMPETENZA_DAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COMPETENZA_AL, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Database Error Event
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
  private void PAN_DETTGRUPORDI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DETTGRUPORDI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Dettagli Gruppo Ordinativi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che può essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_DETTGRUPORDI_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi On Change Layout Event Body
      // Procedure Body
      // 
      VisibilitàComandi();
      if (NewLayout.equals((new IDVariant(1)), true))
      {
        PAN_DETTGRUPORDI.set_ShowMultipleSel((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_DETTGRUPORDI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_DETTGRUPORDI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi On Change Status Event Body
      // Procedure Body
      // 
      VisibilitàComandi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_DETTGRUPORDI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi Before Insert Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(MAX(A.PROGRESSIVO), 0) + 1 as NUVAMAGRPRZU ");
      SQL.append("from ");
      SQL.append("  GRO A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        NUOVOPROGRES = QV.Get("NUVAMAGRPRZU", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_PROGRESSIVO, 0, new IDVariant(new IDVariant(NUOVOPROGRES),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_DETTGRUPORDI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_DETTGRUPORDI_DEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_DEBITORE))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Ordinativi On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_DETTGRUPORDI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Ordinativi On Change Row Body
      // Corpo Procedura
      // 
      VisibilitàInfoDett();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DettagliGruppoOrdinativiOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Info Debitore
  // **********************************************************************
  public int InfoDebitore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Debitore Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, new IDVariant(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0),IDVariant.FLOAT));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "InfoDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
  // **********************************************************************
  public int InfoCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Capitolo Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Debitore
  // **********************************************************************
  public int SceltaDebitore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Debitore Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_PRE, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
        MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SceltaDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Quietanza
  // **********************************************************************
  public int SceltaQuietanza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Quietanza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCEQUIDELSOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SceltaQuietanza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Voce Peg
  // **********************************************************************
  public int ScegliVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Voce Peg Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_PRE, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0));
        MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ScegliVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Accertamento
  // **********************************************************************
  public int ScegliAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Accertamento Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_PRE, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ScegliAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Voce Economica
  // **********************************************************************
  public int SceltaVoceEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Voce Economica Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMES, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMTITOLO, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPTITOLO))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPTITOLO))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCATEGOR, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCATEGORIA))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCATEGORIA))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODINTE, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODINTERV))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODINTERV))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODTERZ, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODTERZI))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODTERZI))))));
      MainFrm.Show(MyGlb.FRM_SCEVOCECCOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SceltaVoceEconomica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Cgu
  // **********************************************************************
  public int SceltaCgu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Cgu Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMES, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMTITOLO, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPTITOLO))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPTITOLO))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCATEGOR, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCATEGORIA))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCATEGORIA))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCODINTE, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODINTERV))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODINTERV))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCODTERZ, 0, ((IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODTERZI))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_CAPCODTERZI))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAVOCEECON, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0));
      MainFrm.Show(MyGlb.FRM_SCECODGECOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SceltaCgu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Fattore
  // **********************************************************************
  public int SceltaFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      if (MainFrm.FILTRFATTPCF.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMFICOEC, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMCODQUA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0)));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMCODQUI, 0, new IDVariant(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0),IDVariant.INTEGER));
      }
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SceltaFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Centro
  // **********************************************************************
  public int SceltaCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SceltaCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Liv 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaLiv5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Liv 5 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0)),IDVariant.DECIMAL));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ApriSceltaLiv5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Ordinativo
  // **********************************************************************
  public int InfoOrdinativo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Ordinativo Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ORD, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ORD, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ORD, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ORD, 0));
        MainFrm.Show(MyGlb.FRM_INFOORDINATI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "InfoOrdinativo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Voce Peg
  // **********************************************************************
  public int ProponiDaVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Voce Peg Body
      // Procedure Body
      // 
      v_VOCEECONOMIC = (new IDVariant());
      v_VINCOLO = (new IDVariant());
      v_FATTORE = (new IDVariant());
      v_CENTRO = (new IDVariant());
      IDVariant v_VCAPCODIEURO = null;
      v_VCAPCODIEURO = (new IDVariant());
      IDVariant v_VCAPTOTFIN = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VOCE_ECON as CAPVOCEECON, ");
      SQL.append("  A.TIPO_VINCOLO as CAPTIPOVINCO, ");
      SQL.append("  A.CODICE_GESTIONALE as CAPCODICGEST, ");
      SQL.append("  A.FATTORE as CAPFATTORE, ");
      SQL.append("  A.CENTRO as CAPCENTRO, ");
      SQL.append("  A.CODICE_EUROPEO as CAPCODICEURO, ");
      SQL.append("  CHECK_CAP_TOT_FIN(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as CCTFCECESCCC ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VOCEECONOMIC = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
        v_VINCOLO = QV.Get("CAPTIPOVINCO", IDVariant.INTEGER) ;
        v_CGU = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
        v_FATTORE = QV.Get("CAPFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("CAPCENTRO", IDVariant.STRING) ;
        v_VCAPCODIEURO = QV.Get("CAPCODICEURO", IDVariant.INTEGER) ;
        v_VCAPTOTFIN = QV.Get("CCTFCECESCCC", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROANNACCOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GRONUMACCOLD, 0, (new IDVariant()));
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROVOCECOOLD, 0, new IDVariant(v_VOCEECONOMIC));
        if (!(IDL.IsNull(v_CGU)))
        {
          if (MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), v_CGU, (new IDVariant())))
          {
            v_CGU = (new IDVariant());
          }
        }
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE, 0, new IDVariant(v_CGU));
      }
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_EUROPEO, 0, new IDVariant(v_VCAPCODIEURO));
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_FATTORE)) && MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0, new IDVariant(v_FATTORE));
        }
      }
      if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
      {
        if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CENTRO, 0, new IDVariant(v_CENTRO));
        }
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
        v_FINANZIAMENT = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINBILFINFIN ");
        SQL.append("from ");
        SQL.append("  BIL_FIN A, ");
        SQL.append("  FINANZIAMENTI B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FINANZIAMENT = QV.Get("MINBILFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_FINANZIAMENT)) && v_VCAPTOTFIN.equals((new IDVariant("SI")), true))
        {
          IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
          v_OPERA = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(DISTINCT A.OPERA) as DISCOUBIFIOP, ");
          SQL.append("  MIN(A.OPERA) as MINBILFINOPE ");
          SQL.append("from ");
          SQL.append("  BIL_FIN A, ");
          SQL.append("  OPERE B ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE = A.OPERA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMREC = QV.Get("DISCOUBIFIOP", IDVariant.INTEGER) ;
            v_OPERA = QV.Get("MINBILFINOPE", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NUMREC.equals((new IDVariant(1)), true) || v_NUMREC.equals((new IDVariant(0)), true))
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, new IDVariant(v_OPERA));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FINANZIAMENTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, (new IDVariant()));
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0, new IDVariant(MainFrm.GetLiv5DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0)),IDVariant.DECIMAL));
        if (!(IDL.IsNull(v_VCAPCODIEURO)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_EUROPEO, 0, new IDVariant(v_VCAPCODIEURO));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ProponiDaVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Acc
  // **********************************************************************
  public int ProponiDaAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DEBITORE = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMPDAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_COMPAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUACC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUCAP = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Acc Body
      // Procedure Body
      // 
      IDVariant v_VACCCODLIVE5 = null;
      v_VACCCODLIVE5 = (new IDVariant());
      IDVariant v_VACCCODIEURO = null;
      v_VACCCODIEURO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as ACCCAPITOLO, ");
      SQL.append("  A.ARTICOLO as ACCARTICOLO, ");
      SQL.append("  A.VOCE_ECON as ACCVOCEECON, ");
      SQL.append("  A.DEBITORE as ACCDEBITORE, ");
      SQL.append("  A.FATTORE as ACCFATTORE, ");
      SQL.append("  A.CENTRO as ACCCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as ACCCOMPETDAL, ");
      SQL.append("  A.COMPETENZA_AL as ACCCOMPETEAL, ");
      SQL.append("  A.TIPO_VINCOLO as ACCTIPOVINCO, ");
      SQL.append("  A.CODICE_GESTIONALE as ACCCODICGEST, ");
      SQL.append("  A.COD_LIVELLO_5 as ACCCODLIVEL5, ");
      SQL.append("  A.CODICE_EUROPEO as ACCCODICEURO ");
      SQL.append("from ");
      SQL.append("  ACC A ");
      SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("ACCCAPITOLO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("ACCARTICOLO", IDVariant.INTEGER) ;
        v_VOCEECONOMIC = QV.Get("ACCVOCEECON", IDVariant.INTEGER) ;
        v_DEBITORE = QV.Get("ACCDEBITORE", IDVariant.FLOAT) ;
        v_FATTORE = QV.Get("ACCFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("ACCCENTRO", IDVariant.STRING) ;
        v_COMPDAL = QV.Get("ACCCOMPETDAL", IDVariant.DATETIME) ;
        v_COMPAL = QV.Get("ACCCOMPETEAL", IDVariant.DATETIME) ;
        v_VINCOLO = QV.Get("ACCTIPOVINCO", IDVariant.INTEGER) ;
        v_CGUACC = QV.Get("ACCCODICGEST", IDVariant.INTEGER) ;
        v_VACCCODLIVE5 = QV.Get("ACCCODLIVEL5", IDVariant.INTEGER) ;
        v_VACCCODIEURO = QV.Get("ACCCODICEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE_GESTIONALE as CAPCODICGEST ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(v_CAPITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(v_ARTICOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CGUCAP = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCAPITOOLD, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROARTICOOLD, 0, new IDVariant(v_ARTICOLO));
      if (!(IDL.IsNull(v_VACCCODIEURO)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_EUROPEO, 0, new IDVariant(v_VACCCODIEURO));
      }
      if (!(IDL.IsNull(v_VACCCODLIVE5)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VACCCODLIVE5),IDVariant.DECIMAL));
      }
      else
      {
        v_VACCCODLIVE5 = new IDVariant(MainFrm.GetCodLiv5DaCapOUnico(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO),IDVariant.INTEGER);
        if (!(IDL.IsNull(v_VACCCODLIVE5)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VACCCODLIVE5),IDVariant.DECIMAL));
        }
      }
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        if (IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0).compareTo(v_VOCEECONOMIC, true)!=0)
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROVOCECOOLD, 0, new IDVariant(v_VOCEECONOMIC));
        }
        if (IDL.IsNull(v_CGUACC) || MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), v_CGUACC, (new IDVariant())))
        {
          v_CGUACC = (new IDVariant());
          if (IDL.IsNull(v_CGUCAP) || MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), v_CGUCAP, (new IDVariant())))
          {
            v_CGUCAP = (new IDVariant());
          }
        }
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE, 0, IDL.NullValue(v_CGUACC,v_CGUCAP));
      }
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_DEBITORE)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0, new IDVariant(new IDVariant(v_DEBITORE),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROCODDEBOLD, 0, new IDVariant(new IDVariant(v_DEBITORE),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0, MainFrm.SettaQuietanzaBeneficiario(v_DEBITORE, IDL.Today()));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_GROQUIETAOLD, 0, IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUM_QUIETANZA, 0));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COMPETENZA_DAL, 0, new IDVariant(v_COMPDAL));
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_COMPETENZA_AL, 0, new IDVariant(v_COMPAL));
        if (!(IDL.IsNull(v_FATTORE)))
        {
          if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FATTORE, 0, new IDVariant(v_FATTORE));
          }
        }
        if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
          {
            IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CENTRO, 0, new IDVariant(v_CENTRO));
          }
        }
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FINANZIAMENTO, 0, (new IDVariant()));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(DISTINCT A.OPERA) as DISCOUACOPOP, ");
        SQL.append("  MIN(A.OPERA) as MINACCOPEOPE ");
        SQL.append("from ");
        SQL.append("  ACC_OPE A ");
        SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMREC = QV.Get("DISCOUACOPOP", IDVariant.INTEGER) ;
          v_OPERA = QV.Get("MINACCOPEOPE", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMREC.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, new IDVariant(v_OPERA));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, (new IDVariant()));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ProponiDaAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Cgu Unico
  // **********************************************************************
  public int ProponiCguUnico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Cgu Unico Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(C.CODICE) as MINCODGESCOD ");
      SQL.append("from ");
      SQL.append("  CAP A, ");
      SQL.append("  RICLASSIFICAZIONI_GEST B, ");
      SQL.append("  CODICI_GESTIONALI C, ");
      SQL.append("  RICLASSIFICAZIONI D ");
      SQL.append("where (D.VOCE_ECON = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_VOCE_ECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (C.CODICE = B.CODICE_GESTIONALE) ");
      SQL.append("and   (B.PROGR_RICLASSIFICAZIONI = D.PROGRESSIVO) ");
      SQL.append("and   (C.E_S = D.E_S) ");
      SQL.append("and   (B.E_S = D.E_S) ");
      SQL.append("and   (B.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (D.TITOLO = A.TITOLO) ");
      SQL.append("and   (NVL(D.CATEGORIA, -1) = NVL(A.CATEGORIA, -1)) ");
      SQL.append("and   (NVL(D.COD_INTERVENTO, -1) = NVL(A.COD_INTERVENTO, -1)) ");
      SQL.append("and   (NVL(D.COD_TERZI, -1) = NVL(A.COD_TERZI, -1)) ");
      SQL.append("and   ((C.SCADENZA IS NULL) OR C.SCADENZA >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_CGU = QV.Get("MINCODGESCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMREC.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE, 0, new IDVariant(v_CGU));
      }
      else
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CODICE_GESTIONALE, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ProponiCguUnico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Opera
  // **********************************************************************
  public int ProponiOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Opera Body
      // Procedure Body
      // 
      v_OPERA = (new IDVariant());
      IDVariant v_VCAPTOTFIN = new IDVariant(0,IDVariant.STRING);
      v_VCAPTOTFIN = (new IDVariant("NO"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(DISTINCT A.OPERA) as DISCOUBIFIOP, ");
      SQL.append("  MIN(A.OPERA) as MINBILFINOPE, ");
      SQL.append("  CHECK_CAP_TOT_FIN(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as CCTFBFEBFESB ");
      SQL.append("from ");
      SQL.append("  BIL_FIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("group by ");
      SQL.append("  CHECK_CAP_TOT_FIN(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("DISCOUBIFIOP", IDVariant.INTEGER) ;
        v_OPERA = QV.Get("MINBILFINOPE", IDVariant.INTEGER) ;
        v_VCAPTOTFIN = QV.Get("CCTFBFEBFESB", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_NUMREC.compareTo((new IDVariant(1)), true)<=0 && v_VCAPTOTFIN.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, new IDVariant(v_OPERA));
      }
      else
      {
        IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_OPERA, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ProponiOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Spese Da Quietanza
  // Num Quietanza:  - Input
  // Beneficiario:  - Input
  // **********************************************************************
  public int SettaSpeseDaQuietanza (IDVariant NumQuietanza, IDVariant Beneficiario)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Setta Spese Da Quietanza Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.SPESE as QTNSPESE ");
      SQL.append("from ");
      SQL.append("  QTN A ");
      SQL.append("where (A.NUM_QUIETANZA = " + IDL.CSql(NumQuietanza, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE = " + IDL.CSql(Beneficiario, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SPESE = QV.Get("QTNSPESE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_SPESE, 0, new IDVariant(v_SPESE));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SettaSpeseDaQuietanza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Totale
  // **********************************************************************
  public int SettaTotale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Totale Body
      // Procedure Body
      // 
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_IMPOTOTALABE, IDL.Add(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(":"))), (new IDVariant(" "))), IDL.Format(PAN_DETTGRUPORDI.GetFieldSum(PFL_DETTGRUPORDI_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant(".")))).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "SettaTotale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Getdisponibilitacapacc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // P CAPITOLO - Input
  // P ARTICOLO - Input
  // P NUMERO ACC:  - Input
  // P ANNO ACC - Input
  // **********************************************************************
  public IDVariant Getdisponibilitacapacc (IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PNUMEROACC, IDVariant PANNOACC)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Getdisponibilitacapacc Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(PANNOACC))
      {
        IDVariant v_VBILDISPONIB = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(A.DISPONIBILITA, 0) as NULVALBILDI0 ");
        SQL.append("from ");
        SQL.append("  BIL A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'E') ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(PCAPITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(PARTICOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VBILDISPONIB = QV.Get("NULVALBILDI0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        return IDL.NullValue(v_VBILDISPONIB,(new IDVariant(0)));
      }
      else
      {
        IDVariant v_VBILDISPONIB = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(A.DISPONIBILITA, 0) as NULVALESEDI0 ");
        SQL.append("from ");
        SQL.append("  ESEACC A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(PANNOACC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(PNUMEROACC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VBILDISPONIB = QV.Get("NULVALESEDI0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        return IDL.NullValue(v_VBILDISPONIB,(new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "Getdisponibilitacapacc", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Visibilità Info Dett
  // **********************************************************************
  public int VisibilitàInfoDett ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Info Dett Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ARTICOLO, 0))))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ACC, 0))))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_DEBITORE, 0))))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_NUMERO_ORD, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_GRO1, IMDBDef15.PQSL_GRO1_ANNO_ORD, 0))))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "VisibilitàInfoDett", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Economica
  // **********************************************************************
  public int VisibilitàEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Economica Body
      // Procedure Body
      // 
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "VisibilitàEconomica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Finanziaria
  // **********************************************************************
  public int VisibilitàFinanziaria ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Finanziaria Body
      // Procedure Body
      // 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "VisibilitàFinanziaria", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Ordinativo Informatico
  // **********************************************************************
  public int VisibilitàOrdinativoInformatico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilità Ordinativo Informatico Body
      // Procedure Body
      // 
      v_LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      if (IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as TIPSPEMINCOD ");
        SQL.append("from ");
        SQL.append("  TIPI_SPESA_MINF A ");
        SQL.append("where (A.DEFAULT_E = 'SI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          SPESADAPROPO = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if (v_LICENZAMIF.booleanValue() && IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0).compareTo((new IDVariant("EP")), true)!=0 && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_LICENZAMIF.booleanValue() && IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0).compareTo((new IDVariant("EP")), true)!=0 && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_LICENZAMIF.booleanValue() && IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0).compareTo((new IDVariant("EP")), true)!=0 && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_LICENZAMIF.booleanValue() && IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0).compareTo((new IDVariant("EP")), true)!=0 && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((!(v_LICENZAMIF.booleanValue()) || IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0).equals((new IDVariant("EP")), true)))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "VisibilitàOrdinativoInformatico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Comandi
  // **********************************************************************
  public int VisibilitàComandi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Comandi Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DETTGRUPORDI.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET6+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET6+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (new IDVariant(PAN_DETTGRUPORDI.Status()).equals((new IDVariant(2)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA14+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI45+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA14+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI45+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "VisibilitàComandi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUOVARIGA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DETTGRUPORDI.Status()).equals((new IDVariant(3)), true))
      {
        if (Controlli())
        {
          if (PAN_DETTGRUPORDI.IsNewRow())
          {
            v_NUOVARIGA = (new IDVariant(-1));
          }
          PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_UPDATE);
          if (new IDVariant(PAN_DETTGRUPORDI.Status()).equals((new IDVariant(2)), true) && v_NUOVARIGA.booleanValue())
          {
            CONTROLLOSUD = (new IDVariant(0));
            Riposiziona(NUOVOPROGRES);
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = (new IDVariant("Dettagli_GRO"));
      MainFrm.SetParametroStampaJasper((new IDVariant("GRUPPO")), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Emissione Ordinativi
  // **********************************************************************
  public int ApriEmissioneOrdinativi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Apri Emissione Ordinativi Body
      // Procedure Body
      // 
      v_NUMREC = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  GRO A ");
      SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_ACC > " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (IDL.NullValue(v_NUMREC,(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Sul gruppo sono presenti Accertamenti di esercizi successivi: non è possibile emettere Liquidazioni!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADESCGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARDATULTELA, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARDATULTELA, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAUNORDPER, 0, (new IDVariant("R")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADATAEMIS, 0, IDL.Today());
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARATIPOGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPDAFIL, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAIMPDAFIL, 0));
        MainFrm.Show(MyGlb.FRM_EMISSORDIORD, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ApriEmissioneOrdinativi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Controllo Disponibilità
  // **********************************************************************
  public int ApriControlloDisponibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Controllo Disponibilità Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI277, IMDBDef5.FLD_PARAMETRI277_PARAMGRUPPO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI277, IMDBDef5.FLD_PARAMETRI277_PARADESCGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI277, IMDBDef5.FLD_PARAMETRI277_PARAENTRSPES, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0));
      MainFrm.Show(MyGlb.FRM_CONTRDISPORD, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ApriControlloDisponibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Disponibilità Puro
  // **********************************************************************
  public int ApriDisponibilitàPuro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Disponibilità Puro Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKGROCONTROLLOPURO(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI508, IMDBDef5.FLD_PARAMETRI508_PARAMGRUPPO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI508, IMDBDef5.FLD_PARAMETRI508_PARADESCGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI508, IMDBDef5.FLD_PARAMETRI508_PARAENTRSPES, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0));
        MainFrm.Show(MyGlb.FRM_DISPOPUROORD, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ApriDisponibilitàPuro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elimina Dettagli Gruppo
  // **********************************************************************
  public int ApriEliminaDettagliGruppo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_AVVISO = (new IDVariant("La funzione elimina tutti i dettagli del Gruppo ", IDVariant.STRING));
      // 
      // Apri Elimina Dettagli Gruppo Body
      // Procedure Body
      // 
      v_AVVISO = IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0));
      if (MainFrm.MessageConfirm(v_AVVISO))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.ELIMINAGRLGRO(IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);
          v_CONFERMA = (new IDVariant("Eliminazione eseguita!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_CONFERMA); 
          PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ApriEliminaDettagliGruppo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riposiziona
  // Progressivo:  - Input
  // **********************************************************************
  public int Riposiziona (IDVariant Progressivo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_POSIZIONE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Riposiziona Body
      // Procedure Body
      // 
      C2 = PAN_DETTGRUPORDI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_DETTGRUPORDI.GotoFirst();
      while (!PAN_DETTGRUPORDI.RSEOF())
      {
        if (C2.Get("PROGRESSIVO").equals(Progressivo, true))
        {
          v_POSIZIONE = new IDVariant(I);
          break;
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_DETTGRUPORDI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_DETTGRUPORDI.set_ActualPosition(true, new IDVariant(v_POSIZIONE).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "Riposiziona", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Aggiornamento Valori Comuni
  // **********************************************************************
  public int ApriAggiornamentoValoriComuni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Aggiornamento Valori Comuni Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DETTGRUPORDI.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Ci sono modifiche in sospeso. Confermare o annullare.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      else
      {
        APRAGGVALCOM_VALCOMORLIDE();
        IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0, (new IDVariant("ORD")));
        MainFrm.Show(MyGlb.FRM_AGGVALCOORLI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ApriAggiornamentoValoriComuni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Valori Comuni Ord Liq: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void APRAGGVALCOM_VALCOMORLIDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKTIVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_TIPO_VINCOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKMAIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SCADENZA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ALLEGATI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COMMISSIONI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_INFO_TESORIERE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_FATTORE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CENTRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COMP_DAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COMP_AL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKTRA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_COFOG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_EUROPEO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COD_LIVELLO_5, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKCAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKIMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANIMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACOANIMACOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUIMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACONUIMACOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANNSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VOCE_ECON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_GESTIONALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_FINANZIAMENTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_OPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SE_SUBIMPEGNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_PROGR_UNITA_ORGANIZZATIVA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_BENEFICIARIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_NUM_QUIETANZA, 0, new IDVariant());
  }

  // **********************************************************************
  // Import da File
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ImportdaFile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Import da File Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARADESCGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0, (new IDVariant("ORD")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMFASE, 0, (new IDVariant("IMP_GRO")));
      MainFrm.Show(MyGlb.FRM_IMPDAFILSUGR, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "ImportdaFile", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Valori
  // **********************************************************************
  public boolean AggiornaValori ()
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
      // Aggiorna Valori Body
      // Procedure Body
      // 
      IDVariant v_PROPALTRCAMP = new IDVariant(0,IDVariant.INTEGER);
      try
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        C3 = PAN_DETTGRUPORDI.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_DETTGRUPORDI.GotoFirst();
        while (!PAN_DETTGRUPORDI.RSEOF())
        {
          if (PAN_DETTGRUPORDI.IsRowSelected(I.intValue()))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  DESCRIZIONE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_DESCRIZIONE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  TIPO_VINCOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  SPESE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SPESE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  ALLEGATI = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ALLEGATI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  COMMISSIONI = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMMISSIONI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  INFO_TESORIERE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_INFO_TESORIERE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  FATTORE = CASE WHEN NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ELSE GRO.FATTORE END, ");
              SQL.append("  CENTRO = CASE WHEN NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ELSE GRO.CENTRO END, ");
              SQL.append("  COMPETENZA_DAL = CASE WHEN NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN CASE WHEN NOT ((GRO.FATTORE IS NULL)) THEN " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ELSE GRO.COMPETENZA_DAL END ELSE CASE WHEN GRO.FATTORE <> " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " THEN to_date(NULL) ELSE GRO.COMPETENZA_DAL END END, ");
              SQL.append("  COMPETENZA_AL = CASE WHEN NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN CASE WHEN NOT ((GRO.FATTORE IS NULL)) THEN " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ELSE GRO.COMPETENZA_AL END ELSE CASE WHEN GRO.FATTORE <> " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " THEN to_date(NULL) ELSE GRO.COMPETENZA_AL END END ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  COD_LIVELLO_5 = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  CODICE_EUROPEO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  ANNO_ACC = to_number(NULL), ");
              SQL.append("  NUMERO_ACC = to_number(NULL) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              v_PROPALTRCAMP = (new IDVariant(-1));
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              v_PROPALTRCAMP = (new IDVariant(-1));
            }
            if (v_PROPALTRCAMP.booleanValue())
            {
              SQL = new StringBuffer();
              SQL.append("update GRO set ");
              SQL.append("  VOCE_ECON = DECODE(" + IDL.CSql(MainFrm.SIOPEATTIARM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0, " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", GRO.VOCE_ECON), ");
              SQL.append("  CODICE_GESTIONALE = DECODE(" + IDL.CSql(MainFrm.SIOPEATTIARM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0, " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", GRO.CODICE_GESTIONALE), ");
              SQL.append("  FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  OPERA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  DEBITORE = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", GRO.DEBITORE), ");
              SQL.append("  NUM_QUIETANZA = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", GRO.NUM_QUIETANZA) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_DETTGRUPORDI.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      catch (Exception e13)
      {
        MainFrm.set_AlertMessage(new IDVariant(e13.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return (new IDVariant(0)).booleanValue();
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "AggiornaValori", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli
  // **********************************************************************
  public boolean Controlli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Body
      // Corpo Procedura
      // 
      IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CODEU = new IDVariant(0,IDVariant.INTEGER);
      v_CODEU = (new IDVariant(0));
      IDVariant v_CODQUINTO = new IDVariant(0,IDVariant.INTEGER);
      v_CODQUINTO = (new IDVariant(0));
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      CONTROLLI_CHECKUDELETE();
      for (I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_DETTGRUPORDI.NumRows)), true)<=0; I = IDL.Add(I, (new IDVariant(1))))
      {
        if (!(IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_GRUPPO,I.intValue()))))
        {
          IDVariant v_CAP = null;
          v_CAP = ((IDL.NullValue(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CAPITOLO,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToCurrency(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CAPITOLO,I.intValue())):(new IDVariant()));
          IDVariant v_ART = null;
          v_ART = new IDVariant(((IDL.NullValue(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ARTICOLO,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToFloat(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ARTICOLO,I.intValue())):(new IDVariant())),IDVariant.INTEGER);
          IDVariant v_NUMEROACC = null;
          v_NUMEROACC = ((IDL.NullValue(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_NUMEROACC,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_NUMEROACC,I.intValue())):(new IDVariant()));
          IDVariant v_ANNOACC = null;
          v_ANNOACC = ((IDL.NullValue(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ANNOACC,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ANNOACC,I.intValue())):(new IDVariant()));
          IDVariant v_IMPORTO = null;
          v_IMPORTO = ((IDL.NullValue(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_IMPORTO,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToCurrency(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_IMPORTO,I.intValue())):(new IDVariant()));
          // 
          // inserisco su checkup le nuove righe
          // 
          MainFrm.DTTObj.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("inserisco")), (new IDVariant(" "))), IDL.ToString(v_CAP)), (new IDVariant("/"))), IDL.ToString(v_ART)), (new IDVariant(" "))), IDL.ToString(v_NUMEROACC)), (new IDVariant("/"))), IDL.ToString(v_ANNOACC)), (new IDVariant(" - "))), IDL.ToString(v_IMPORTO)).stringValue(), (new IDVariant(999)).intValue(), (new IDVariant(2)).intValue()); 
          CONTROLLI_CHECINSEINT1(v_CAP, v_ART, v_NUMEROACC, v_ANNOACC, v_IMPORTO);
          IDVariant v_RIGA = new IDVariant(0,IDVariant.STRING);
          v_RIGA = (new IDVariant("Riga "));
          if ((IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CAPITOLO,I.intValue())) && !(IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ARTICOLO,I.intValue())))) || (!(IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CAPITOLO,I.intValue()))) && IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ARTICOLO,I.intValue()))))
          {
            IDVariant v_AVVISOVOCEPE = new IDVariant(0,IDVariant.STRING);
            v_AVVISOVOCEPE = (new IDVariant(": Dati Capitolo incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_RIGA, IDL.ToString(I)), v_AVVISOVOCEPE)); 
            return (new IDVariant(0)).booleanValue();
          }
          if ((IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_NUMEROACC,I.intValue())) && !(IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ANNOACC,I.intValue())))) || (!(IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_NUMEROACC,I.intValue()))) && IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ANNOACC,I.intValue()))))
          {
            IDVariant v_AVVISOIMP = new IDVariant(0,IDVariant.STRING);
            v_AVVISOIMP = (new IDVariant(": Dati Accertamento incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_RIGA, IDL.ToString(I)), v_AVVISOIMP)); 
            return (new IDVariant(0)).booleanValue();
          }
          // 
          // commentato perché su CF4 non faceva questi controlli
          // per l'entrata
          // 
          // if (IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CODICEDEBITO,I.intValue())))
          // {
            // MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_RIGA, IDL.ToString(I)), v_AVVISOBEN)); 
            // return (new IDVariant(0)).booleanValue();
          // }
          else
          {
            // if (IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_QUIETANZA,I.intValue())))
            // {
              // MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_RIGA, IDL.ToString(I)), v_AVVISO)); 
              // return (new IDVariant(0)).booleanValue();
            // }
          }
          if (IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CODLIVELLO5,I.intValue())))
          {
            IDVariant v_VFOUND = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VCODICE = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_CAPITOLO = null;
            v_CAPITOLO = IDL.ToCurrency(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CAPITOLO,I.intValue()));
            IDVariant v_ARTICOLO = null;
            v_ARTICOLO = IDL.ToInteger(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_ARTICOLO,I.intValue()));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.CODICE as VISSTRRICCOD ");
            SQL.append("from ");
            SQL.append("  VISTA_STRUTTURA_RICL A, ");
            SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
            SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.E_S = 'E') ");
            SQL.append("and   (B.CAPITOLO = " + IDL.CSql(v_CAPITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.ARTICOLO = " + IDL.CSql(v_ARTICOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
            SQL.append("and   (A.E_S = 'E') ");
            SQL.append("and   (A.LIVELLO = 2) ");
            SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.CODICE_PADRE = B.CODICE)) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            v_VFOUND = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
            if (!QV.EOF())
            {
              v_VCODICE = QV.Get("VISSTRRICCOD", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VFOUND.booleanValue())
            {
              v_CODQUINTO = IDL.Add(v_CODQUINTO, (new IDVariant(1)));
            }
          }
          if (IDL.IsNull(PAN_DETTGRUPORDI.GetValueAt(PFL_DETTGRUPORDI_CODICEEUROPE,I.intValue())))
          {
            v_CODEU = IDL.Add(v_CODEU, (new IDVariant(1)));
          }
        }
        else
        {
          I = (new IDVariant(PAN_DETTGRUPORDI.NumRows));
        }
      }
      if (v_CODEU.compareTo((new IDVariant(0)), true)>0 || v_CODQUINTO.compareTo((new IDVariant(0)), true)>0)
      {
        v_ERRORE = IDL.Add((new IDVariant("Sono presenti dettagli ")), (new IDVariant("<br/>")));
      }
      if (v_CODQUINTO.compareTo((new IDVariant(0)), true)>0)
      {
        v_ERRORE = IDL.Add(IDL.Add(v_ERRORE, (new IDVariant("Senza codice V livello"))), (new IDVariant("<br/>")));
      }
      if (v_CODEU.compareTo((new IDVariant(0)), true)>0)
      {
        v_ERRORE = IDL.Add(v_ERRORE, (new IDVariant("Senza Codice Europeo")));
      }
      if (CONTROLLOSUD.booleanValue() && CONTRSUDISPO.equals((new IDVariant("SI")), true))
      {
        CONTROLLI_CHECKUP2();
        while (!IMDB.Eof(IMDBDef15.QRY_CHECKUP2, 0))
        {
          if (IMDB.Value(IMDBDef15.QRY_CHECKUP2, IMDBDef15.QSL_CHECKUP2_SOMMAIMPORTO, 0).compareTo(Getdisponibilitacapacc(IMDB.Value(IMDBDef15.QRY_CHECKUP2, IMDBDef15.QSL_CHECKUP2_CAPITOLORW, 0), IMDB.Value(IMDBDef15.QRY_CHECKUP2, IMDBDef15.QSL_CHECKUP2_ARTICOLORW, 0), (new IDVariant()), (new IDVariant())), true)>0)
          {
            if (IDL.NullValue(v_ERRORE,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              v_ERRORE = IDL.Add(v_ERRORE, (new IDVariant("<br/>")));
            }
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Dettagli Gruppo su Capitolo "));
            IDVariant C = new IDVariant(0,IDVariant.STRING);
            C = (new IDVariant(" superiori alla Disponibilità del Capitolo"));
            v_ERRORE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ERRORE, S), IDL.ToString(IMDB.Value(IMDBDef15.QRY_CHECKUP2, IMDBDef15.QSL_CHECKUP2_CAPITOLORW, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef15.QRY_CHECKUP2, IMDBDef15.QSL_CHECKUP2_ARTICOLORW, 0))), C);
          }
          IMDB.TblMoveNext(IMDBDef15.QRY_CHECKUP2, 0);
        }
        CONTROLLI_CHECKUP1();
        while (!IMDB.Eof(IMDBDef15.QRY_CHECKUP1, 0))
        {
          MainFrm.DTTObj.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_NUMEROACCRW, 0)), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_ANNOACCRW, 0))), (new IDVariant(" - "))), IDL.ToString(Getdisponibilitacapacc((new IDVariant()), (new IDVariant()), IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_NUMEROACCRW, 0), IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_ANNOACCRW, 0)))).stringValue(), (new IDVariant(999)).intValue(), (new IDVariant(2)).intValue()); 
          if (IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_SOMMAIMPORTO, 0).compareTo(Getdisponibilitacapacc((new IDVariant()), (new IDVariant()), IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_NUMEROACCRW, 0), IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_ANNOACCRW, 0)), true)>0)
          {
            if (IDL.NullValue(v_ERRORE,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              v_ERRORE = IDL.Add(v_ERRORE, (new IDVariant("<br/>")));
            }
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Dettagli Gruppo su Accertamento "));
            IDVariant C = new IDVariant(0,IDVariant.STRING);
            C = (new IDVariant(" superiori alla Disponibilità dell'Accertamento"));
            v_ERRORE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ERRORE, S), IDL.ToString(IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_NUMEROACCRW, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef15.QRY_CHECKUP1, IMDBDef15.QSL_CHECKUP1_ANNOACCRW, 0))), C);
          }
          IMDB.TblMoveNext(IMDBDef15.QRY_CHECKUP1, 0);
        }
      }
      if (IDL.NullValue(v_ERRORE,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        if (!(MainFrm.MessageConfirm(v_ERRORE)))
        {
          return (new IDVariant(0)).booleanValue();
        }
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "Controlli", _e);
      return false;
    }
  }

  // **********************************************************************
  // CHECKUP: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void CONTROLLI_CHECKUDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_CHECKUP);
  }

  // **********************************************************************
  // CHECKUP: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void CONTROLLI_CHECINSEINT1(IDVariant v_CAP, IDVariant v_ART, IDVariant v_NUMEROACC, IDVariant v_ANNOACC, IDVariant v_IMPORTO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef5.TBL_CHECKUP, 0);
    IMDB.set_Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGECAPI, 0, v_CAP);
    IMDB.set_Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGEARTI, 0, v_ART);
    IMDB.set_Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGNUMACC, 0, v_NUMEROACC);
    IMDB.set_Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGANNACC, 0, v_ANNOACC);
    IMDB.set_Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGEIMPO, 0, v_IMPORTO);
  }

  // **********************************************************************
  // CHECKUP
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void CONTROLLI_CHECKUP2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.QRY_CHECKUP2);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef5.TBL_CHECKUP, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_CHECKUP, 0))
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGNUMACC, 0)))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGANNACC, 0)))
        {
          IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
          IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef5.TBL_CHECKUP, 0);
          IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGECAPI, 0);
          IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 1, 0, IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGEARTI, 0);
          IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 2, 0, IMDB.Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGEIMPO, 0));
        }
      }
      IMDB.TblMoveNext(IMDBDef5.TBL_CHECKUP, 0);
      if (IMDB.Eof(IMDBDef5.TBL_CHECKUP, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_CHECKUP, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,0,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,1,true);
    IMDB.TblStartSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[3];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[3];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          AggrBuff[1] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0);
          AggrBuff[2] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0))) AggrRowCount[2] = 1; else AggrRowCount[2] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          AggrNewGroup = AggrNewGroup || !AggrBuff[0].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[1].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0));
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef15.QRY_CHECKUP2, 0);
              IMDB.set_Value(IMDBDef15.QRY_CHECKUP2, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef15.QRY_CHECKUP2, 1, 0, AggrBuff[1]);
              IMDB.set_Value(IMDBDef15.QRY_CHECKUP2, 2, 0, AggrBuff[2]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0)))
              {
                AggrBuff[2] = IDL.Add(AggrBuff[2], IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0));
                AggrRowCount[2]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef15.QRY_CHECKUP2, 0);
  }

  // **********************************************************************
  // CHECKUP
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void CONTROLLI_CHECKUP1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.QRY_CHECKUP1);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef5.TBL_CHECKUP, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_CHECKUP, 0))
    {
      if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGNUMACC, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGANNACC, 0))))
        {
          IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
          IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef5.TBL_CHECKUP, 0);
          IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGANNACC, 0);
          IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 1, 0, IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMOGGNUMACC, 0);
          IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 2, 0, IMDB.Value(IMDBDef5.TBL_CHECKUP, IMDBDef5.FLD_CHECKUP_NOMEOGGEIMPO, 0));
        }
      }
      IMDB.TblMoveNext(IMDBDef5.TBL_CHECKUP, 0);
      if (IMDB.Eof(IMDBDef5.TBL_CHECKUP, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_CHECKUP, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,0,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,1,true);
    IMDB.TblStartSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[3];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[3];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          AggrBuff[1] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0);
          AggrBuff[2] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0))) AggrRowCount[2] = 1; else AggrRowCount[2] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          AggrNewGroup = AggrNewGroup || !AggrBuff[0].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[1].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0));
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef15.QRY_CHECKUP1, 0);
              IMDB.set_Value(IMDBDef15.QRY_CHECKUP1, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef15.QRY_CHECKUP1, 1, 0, AggrBuff[1]);
              IMDB.set_Value(IMDBDef15.QRY_CHECKUP1, 2, 0, AggrBuff[2]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0)))
              {
                AggrBuff[2] = IDL.Add(AggrBuff[2], IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0));
                AggrRowCount[2]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef15.QRY_CHECKUP1, 0);
  }

  // **********************************************************************
  // Abilita Campi
  // **********************************************************************
  public int AbilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Campi Body
      // Procedure Body
      // 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      if (IDL.NullValue((new IDVariant(PAN_DETTGRUPORDI.FieldText(PFL_DETTGRUPORDI_FATTORITIPO))),(new IDVariant("E"))).equals((new IDVariant("E")), true))
      {
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "AbilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi
  // **********************************************************************
  public int DisabilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Campi Body
      // Procedure Body
      // 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTGRUPORDI.SetFlags (Glb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoOrdinativo", "DisabilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void DETTGRUPORDI_PARAMETRI279() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI279_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI311, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI311, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI279_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI279_RS, 0, IMDBDef5.TBL_PARAMETRI311, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 0, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 1, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 2, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 3, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 4, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARDATULTELA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 5, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMORDINAM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI279_RS, 6, 0, IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARANCDETEME, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI311, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI311, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI311, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI279_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTGRUPORDI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTGRUPORDI, Cancel);
    // Stub
  }

  private void PAN_DETTGRUPORDI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_APRICAPILIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_SCEVOCPEGLAB)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFOCAPILIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFOCAPIDETT)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_APRIACCLIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_SCEGACCELABE)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFOACCLIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFOACCEDETT)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_APRIDEBILIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_SELEZISOGGET)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFODEBILIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFODEBIDETT)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_QUIETANZA)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaQuietanza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_VOCEECONOMIC)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaVoceEconomica();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_CGE)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCgu();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_CODLIVELLO5)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaLiv5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_FATTORE)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_CENTRO)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFOORDILIST)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOrdinativo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTGRUPORDI_INFOORDIDETT)
    {
      this.IdxPanelActived = this.PAN_DETTGRUPORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOrdinativo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTGRUPORDI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DETTGRUPORDI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DETTGRUPORDI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTGRUPORDI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTGRUPORDI_Init()
  {

    PAN_DETTGRUPORDI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTGRUPORDI.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, "4BCF6B3C-BD4F-425A-A05D-9B7AFF51E936");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, "Capitolo/Art.");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, MyGlb.PANEL_LIST, 148, -9999, 184, 16, 0, 0);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, MyGlb.PANEL_FORM, 32, 7, 296, 49, 0, 0);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, 0, 73);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, 1, 13);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, 0, 4);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, 1, 4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, "B1A2BCFE-9C6F-41A7-BFBF-02EAABB5E715");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, "Accertamento");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, MyGlb.PANEL_LIST, 332, -9999, 136, 16, 0, 0);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, MyGlb.PANEL_FORM, 336, 7, 232, 49, 0, 0);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, 0, 81);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, 1, 13);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, 0, 4);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, 1, 4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, "7AE9A041-5A3E-4740-A603-732DCED36D96");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, "Contabile");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, MyGlb.PANEL_FORM, 36, 183, 536, 49, 0, 0);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, 0, 53);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, 1, 13);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, 0, 4);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, 1, 4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_CONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, "9B817B4B-E577-4009-B9DC-3C4389814C83");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, "Economica");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, MyGlb.PANEL_LIST, 0, 379, 648, 97, 0, 0);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, MyGlb.PANEL_FORM, 28, 367, 540, 97, 0, 0);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, 0, 60);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, 1, 13);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, 0, 4);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, 1, 4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, "EE58DB26-69E5-424E-AE0E-A65BDB5DDC33");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, "Ordinativo Informatico");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, MyGlb.PANEL_FORM, 28, 519, 544, 121, 0, 0);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, 0, 129);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, 1, 13);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, 0, 4);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, 1, 4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINAINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, "E42AA77B-D11E-4A16-8516-DAD6EE17545D");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, "Ordinativo");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, MyGlb.PANEL_LIST, 940, -9999, 132, 16, 0, 0);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, MyGlb.PANEL_FORM, 584, 591, 192, 49, 0, 0);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, 0, 59);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, 1, 13);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, 0, 4);
    PAN_DETTGRUPORDI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, 1, 4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTGRUPORDI_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTGRUPORDI.SetSize(MyGlb.OBJ_FIELD, 84);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, "21FBAE74-9769-4BEF-9E0F-4DE578485161");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, "PROGRESSIVO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, "8948A95C-616F-4E34-940A-3320DF184B3C");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, "GRUPPO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, 0, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, "4EE78EDA-1C8A-4C1F-A024-A1D9E094828E");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, "Capitolo Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, "2369AD79-8498-40BB-AD8A-10B141B99A36");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, "Articolo Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, "8C86996C-EB32-410B-8C28-13F282DD349E");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, "Anno Acc Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, "962A6D13-6E93-42F9-8453-5E5D00663E85");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, "Numero Acc Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, "D2A7833E-471F-46A0-AC25-4110FA75CC89");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, "Codice Debitore Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, "A1479B95-06A8-49E6-B5F3-6BC8AB282A4C");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, "Quietanza Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, "1CC464C5-2FFB-4FC3-808D-6ED1EA4391CC");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, "Voce Economica Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, "0C099155-0D73-409A-A6B7-76526D4B6EF5");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, "Spese Old");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, "AE349E02-85E0-4659-A601-2AFDE4582744");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, "CCF");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, "7F8EDE2C-26FC-4A67-A274-F679AD309C77");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, "Importo");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, "2CF8F93D-062C-4768-9D53-F0673D05B162");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, "CAPITOLO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, "453FC922-27A9-4441-B716-C716D6FA1124");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, "ARTICOLO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, "FCD478AF-295D-4486-8E57-8E5A8198129B");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, "8CBB24B9-5A92-4877-A511-82BC02681A61");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, "111BDBB3-919C-413A-AE6F-76DC4FE3ED9C");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, "/");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, "A251612C-9552-4847-B806-DF8EBD8A1306");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, "ED8220BC-7D74-441F-9D7C-CA52AB424393");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.VIS_STATICBUTTON);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, 0, "wsearch.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, "FF4B9999-E55B-4F8B-B5AB-F0657050FB5D");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, "8B27D7E2-39DF-4FA4-9A54-148D26B4F024");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.VIS_STATICBUTTON);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, 0, "info.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, "7A047670-4BCD-4440-9600-BF2C074E9391");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, "580CA217-7094-4635-A6EE-D10071D849DE");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, "FE1F31F2-3CD6-4B2C-ADE9-152803EE420F");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, "NUMERO ACC");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, "E7A3DD91-BF4C-4D91-AF19-5E86649B3613");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, "ANNO ACC");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, "92BE4822-5E35-4399-BAA6-7E963F08E9E8");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, "/");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, "9B030C9A-2EA7-42D4-B9B7-3D3F0EFA2A5D");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, "04395471-695B-4A76-8E8D-00A19A6021E6");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.VIS_STATICBUTTON);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, 0, "wsearch.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, "B5E7CCAF-F234-4359-A2C8-07C282468133");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, "691AD2DD-1C75-4568-881F-E32E182B72C8");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.VIS_STATICBUTTON);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, 0, "info.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, "2AC63939-64EB-4E34-BD8F-F857EDE2C0A4");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, "Codice Debitore");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, "1FBFA2F7-BBA9-4891-B80A-CA3121AF3F3C");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, "Debitore");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, "B91E2A14-D7EE-4797-BCF8-FAA1EB0AD68A");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.VIS_HYLIIMNOBOVH);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, "D0BD5C50-C01A-42D6-962A-567500D8FB50");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.VIS_STATICBUTTON);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, 0, "wsearch1.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, "ABC2B6BA-FB85-4748-B543-A7BD544727D4");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.VIS_HYLIIMNOBOVH);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, "EAAD1599-8EA6-424E-8C4C-87098189947C");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.VIS_STATICBUTTON);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, 0, "info.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, "0197F467-B148-4131-AC44-5370E1A5DAC9");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, "Descrizione");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, "A835A69D-29D2-4F0F-BB38-FF23493E1975");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, "Quietanza");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, "6F609FE0-419B-4891-BBB5-A9DF525CBA90");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, "Quietanza Descrizione");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, "19EDC0EC-EED4-403E-A893-E9AC91AE802C");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, "Voce Economica");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, "666D1811-A285-4279-BAF6-653CE6A728C6");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, "52259B6F-FE0E-47AC-A34E-A1EEB6FD5624");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, "Cge");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, "E8094588-876C-4373-A322-C60B604EBA07");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, "D8ABAB80-D2A4-4CB3-8C3A-B9F9A4C8D6A3");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, "F86A4EA7-24D1-42BA-9862-5C17986C4FDB");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, "Numero");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, "9E03489C-B23A-4771-A93C-76FEDEEF1652");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, "Data");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, "8372FB1A-C518-495B-BFCC-38996C1681B0");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, "Ufficio");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, "5C2FC2C0-94F6-44EE-BB7B-866A9F57496A");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, "469871FC-DCB8-455C-8C62-71E392F93E49");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, "Bollo");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, "71E563BD-6FE7-4801-8DA1-0B8824122A5E");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, "Cod. V Livello");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, "17830286-4976-49BC-B656-2231DB85BAD3");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, "Descrizione V Liv");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, "C568A27E-8015-484F-A0AB-BE7CCB66AB81");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, "Cod. Europeo");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, "9E21A009-42E8-4E81-9EF5-3FC7898283DF");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, "Fattore");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, "94773CAC-F24B-4989-9B1F-AD7791976176");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, "96E163D0-E987-4BB7-B39B-F9E6E9EE7AE5");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, "Centro");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, "07579268-CD39-4164-9738-9280EBAD997F");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, "3C25C25E-1C0C-42CD-930C-99D15596D30A");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, "Competenza Dal");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, "D838D539-BAD3-4278-B5C8-0C244E8B1989");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, "Al");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, "11E7B32F-7657-45DE-B195-7B0D5896FD2A");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, "Finanziamento");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, "752ACC2D-B916-4CF8-84E8-576682F585BB");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, "Opera");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, "9CD23004-C3C4-4FFE-9F1F-A637692AA820");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, "Spese");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, "22E89F6E-C33B-4D6F-A9C2-8984157CBD6D");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, "Commissioni");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, "A0E75944-31B2-4709-8B7F-E9FCE1DA5A63");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, "Allegati");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, "3A728A5C-DD8F-4110-B7B2-A89CD49E4B16");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, "Info Tesoriere");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, "56CFD020-CBE3-4761-A325-CA07229D5B71");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, "9330F9B2-01E8-431F-A8E6-5E06D4A94AEC");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, "Numero");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, "D662CBC7-0DC8-4F18-890A-F099AE92D04E");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, "/");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, "C2EB2C64-FDB9-4A6C-B2F7-DBF4E35BBA6F");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, "Anno");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, "81ADBFB0-1AA5-414D-91F0-9F3188111ED9");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, " ");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, "B2A4D219-760B-481F-9579-ABEBC2768E4E");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_DETTGRUPORDI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, 0, "info.gif", false);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, "D26FF6D0-1C85-49F3-92DB-15E655E39932");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, "5F472A13-5E78-45B6-88E9-C14F2ABF70A8");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, "BEEDA8C6-6460-4BEB-8A2D-818FFFE2C348");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, "286C01A9-8D20-4954-ABB1-E2FBA7165555");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, "ED287A5F-8A9E-4344-A9D9-68324B744301");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, "Capitolo/Art.");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, "Capitolo/Art.");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, "9512A78F-983E-4AB5-A4AC-70420E49F5AF");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, "Accertamento");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, "23B011D3-38BB-436C-B42B-FC1D46D7E272");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, "CAP TITOLO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, "5A5BC40D-3D86-449E-A81E-117A2579F2B6");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, "CAP CATEGORIA");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, "804CD553-5F46-4E37-A566-7E50331CFD26");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, "CAP COD INTERVENTO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, "D003EE32-0C39-4D78-93B6-9C8EBFBB03BD");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, "CAP COD TERZI");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, "E65FE593-3557-487B-A411-6AA6E4776072");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, "FATTORI TIPO");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, "0C641762-B762-4672-AF21-494858A6725A");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, "Ordinamento Da Op");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, "62FD87FF-BF37-49B8-9B33-7FB888CE1448");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, "ANNO PRE");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTGRUPORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, "C87D384E-0B33-4BF7-87D7-F97C701A48D1");
    PAN_DETTGRUPORDI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, "ID OBIETTIVO GESTIONE");
    PAN_DETTGRUPORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, "");
    PAN_DETTGRUPORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTGRUPORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DETTGRUPORDI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_FORM, 564, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_PROGRESSIVO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_PROGRESSIVO, PPQRY_GRO1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_LIST, 52);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_LIST, "GRUP.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_GRUPPO, MyGlb.PANEL_FORM, "GRUPPO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_GRUPPO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_GRUPPO, PPQRY_GRO1, "A.GRUPPO", "GRUPPO", 1, 3, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_LIST, 940, 48, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_LIST, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_LIST, "Capitolo Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_FORM, 600, 92, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_FORM, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLOOLD, MyGlb.PANEL_FORM, "Capitolo Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPITOLOOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_CAPITOLOOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPITOLOOLD, PPQRY_GRO1, "A.CAPITOLO", "GROCAPITOOLD", 3, 28, 6, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_LIST, 8, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_LIST, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_LIST, "Articolo Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_FORM, 12, 700, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_FORM, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLOOLD, MyGlb.PANEL_FORM, "Articolo Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ARTICOLOOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_ARTICOLOOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ARTICOLOOLD, PPQRY_GRO1, "A.ARTICOLO", "GROARTICOOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_LIST, 84);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_LIST, "Anno Acc Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_FORM, 4, 692, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_FORM, 84);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACCOLD, MyGlb.PANEL_FORM, "Anno Acc Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ANNOACCOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_ANNOACCOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ANNOACCOLD, PPQRY_GRO1, "A.ANNO_ACC", "GROANNACCOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_LIST, 96);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_LIST, "Numero Acc Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_FORM, 4, 692, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_FORM, 96);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACCOLD, MyGlb.PANEL_FORM, "Numero Acc Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_NUMEROACCOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_NUMEROACCOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_NUMEROACCOLD, PPQRY_GRO1, "A.NUMERO_ACC", "GRONUMACCOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_LIST, 120);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_LIST, "Codice Debitore Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_FORM, 4, 692, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_FORM, 120);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICDEBIOLD, MyGlb.PANEL_FORM, "Codice Debitore Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CODICDEBIOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_CODICDEBIOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CODICDEBIOLD, PPQRY_GRO1, "A.DEBITORE", "GROCODDEBOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_LIST, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_LIST, "Quietanza Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_FORM, 4, 692, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_FORM, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZAOLD, MyGlb.PANEL_FORM, "Quietanza Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_QUIETANZAOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_QUIETANZAOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_QUIETANZAOLD, PPQRY_GRO1, "A.NUM_QUIETANZA", "GROQUIETAOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_LIST, 8, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_LIST, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_LIST, "Voce Economica Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_FORM, 12, 700, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_FORM, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOOLD, MyGlb.PANEL_FORM, "Vc. Econ. Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_VOCEECONOOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_VOCEECONOOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_VOCEECONOOLD, PPQRY_GRO1, "A.VOCE_ECON", "GROVOCECOOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_LIST, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_LIST, "Spese Old");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_FORM, 4, 692, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESEOLD, MyGlb.PANEL_FORM, "Spese Old");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_SPESEOLD, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_SPESEOLD, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_SPESEOLD, PPQRY_GRO1, "A.SPESE", "GROSPESEOLD", 1, 19, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_LIST, 0, 48, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_LIST, 28);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_LIST, "CCF");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_FORM, 460, 208, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_FORM, 28);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CCF, MyGlb.PANEL_FORM, "CCF");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CCF, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CCF, PPQRY_GRO1, "A.CCF", "CCF", 5, 3, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_LIST, 40, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_FORM, 608, 24, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_IMPORTO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_IMPORTO, PPQRY_GRO1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_LIST, 148, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_FORM, 132, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPITOLO, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPITOLO, PPQRY_GRO1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_LIST, 260, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_FORM, 256, 32, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ARTICOLO, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ARTICOLO, PPQRY_GRO1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.PANEL_LIST, 260, 48, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.PANEL_FORM, 36, 36, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGSX, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_LABEVOCPEGSX, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_LABEVOCPEGSX, -1, "", "LABEVOCPEGSX", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.PANEL_LIST, 268, 56, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.PANEL_FORM, 312, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABEVOCPEGDX, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_LABEVOCPEGDX, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_LABEVOCPEGDX, -1, "", "LABEVOCPEGDX", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.PANEL_LIST, 236, 24, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.PANEL_FORM, 240, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_BARRAVOCEPEG, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_BARRAVOCEPEG, -1, "", "BARRAVOCEPEG", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_LIST, 284, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_LIST, 136);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_FORM, 4, 668, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_FORM, 136);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRICAPILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_APRICAPILIST, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_APRICAPILIST, PPQRY_APRIINFO, "DECODE(~~ANNO_PRE~~, to_number(NULL), 'A', NULL)", "APRICAPILIST", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRICAPILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.PANEL_LIST, 260, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.PANEL_FORM, 284, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEVOCPEGLAB, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_SCEVOCPEGLAB, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_SCEVOCPEGLAB, -1, "", "SCEVOCPEGLAB", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_LIST, 308, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_LIST, 136);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_FORM, 4, 692, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_FORM, 136);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOCAPILIST, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOCAPILIST, PPQRY_APRIINFO, "DECODE(~~CAPITOLO~~, to_number(NULL), NULL, DECODE(~~ARTICOLO~~, to_number(NULL), NULL, 'I'))", "INFOCAPILIST", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOCAPILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.PANEL_LIST, 268, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.PANEL_FORM, 304, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOCAPIDETT, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOCAPIDETT, -1, GRP_DETTGRUPORDI_CAPITOLOART);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOCAPIDETT, -1, "", "INFOCAPIDETT", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.PANEL_LIST, 252, 40, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.PANEL_FORM, 340, 32, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCSX, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_LABELACCSX, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_LABELACCSX, -1, "", "LABELACCSX", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.PANEL_LIST, 260, 48, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.PANEL_FORM, 552, 44, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELACCDX, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_LABELACCDX, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_LABELACCDX, -1, "", "LABELACCDX", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_LIST, 332, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_LIST, "NUM. A.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_FORM, 424, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_NUMEROACC, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_NUMEROACC, PPQRY_GRO1, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_LIST, 380, 48, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_LIST, "AN. A.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_FORM, 484, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ANNOACC, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ANNOACC, PPQRY_GRO1, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 244, 32, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 468, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_BARRAIMPEGNO, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_BARRAIMPEGNO, -1, "", "BARRAIMPEGNO", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_LIST, 424, 48, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_LIST, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_FORM, 4, 716, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_FORM, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIACCLIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_APRIACCLIST, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_APRIACCLIST, PPQRY_APRIINFO, "DECODE(~~ANNO_PRE~~, to_number(NULL), 'A', NULL)", "APRIACCLIST", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIACCLIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.PANEL_LIST, 268, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.PANEL_FORM, 524, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SCEGACCELABE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_SCEGACCELABE, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_SCEGACCELABE, -1, "", "SCEGACCELABE", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_LIST, 444, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_LIST, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_FORM, 4, 740, 620, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_FORM, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCLIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOACCLIST, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOACCLIST, PPQRY_APRIINFO, "DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, 'I'))", "INFOACCLIST", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOACCLIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.PANEL_LIST, 276, 28, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.PANEL_FORM, 544, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOACCEDETT, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOACCEDETT, -1, GRP_DETTGRUPORDI_ACCERTAMENTO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOACCEDETT, -1, "", "INFOACCEDETT", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_LIST, 732, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_LIST, 60);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_FORM, 4, 860, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_FORM, 60);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEDEBITO, MyGlb.PANEL_FORM, "Cod. Deb.");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CODICEDEBITO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CODICEDEBITO, PPQRY_GRO1, "A.DEBITORE", "DEBITORE", 1, 6, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_LIST, 468, 48, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_LIST, 124);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_FORM, 32, 60, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_FORM, 96);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_DEBITORE, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_DEBITORE, PPQRY_DEBITORE, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENDEBITORE", 5, 162, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_LIST, 656, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_LIST, 140);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_FORM, 4, 668, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_FORM, 140);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_APRIDEBILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_APRIDEBILIST, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_APRIDEBILIST, PPQRY_APRIINFO, "DECODE(~~ANNO_PRE~~, to_number(NULL), 'A', NULL)", "APRIDEBILIST", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_APRIDEBILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.PANEL_LIST, 580, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.PANEL_FORM, 576, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SELEZISOGGET, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_SELEZISOGGET, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_SELEZISOGGET, -1, "", "SELEZISOGGET", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_LIST, 680, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_LIST, 140);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_FORM, 4, 692, 648, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_FORM, 140);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFODEBILIST, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFODEBILIST, PPQRY_APRIINFO, "DECODE(~~DEBITORE~~, to_number(NULL), NULL, 'I')", "INFODEBILIST", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFODEBILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.PANEL_LIST, 588, 60, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.PANEL_FORM, 595, 65, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFODEBIDETT, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFODEBIDETT, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFODEBIDETT, -1, "", "INFODEBIDETT", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_LIST, 704, 48, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_FORM, 52, 108, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_DESCRIZIONE, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_DESCRIZIONE, PPQRY_GRO1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_LIST, 32, 260, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_LIST, 68);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_FORM, 60, 84, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_FORM, 68);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_QUIETANZA, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_QUIETANZA, PPQRY_GRO1, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_LIST, 148, 260, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_LIST, 136);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_LIST, "Quietanza Descrizione");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_FORM, 180, 84, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_FORM, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_QUIETADESCRI, MyGlb.PANEL_FORM, "Quiet. Descr.");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_QUIETADESCRI, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_QUIETADESCRI, PPQRY_QTNBEN, "B.DESCRIZIONE", "QTNBENT02DES", 5, 40, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_LIST, 0, 284, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_LIST, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_LIST, "Voce Economica");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_FORM, 28, 132, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_FORM, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_VOCEECONOMIC, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_VOCEECONOMIC, PPQRY_GRO1, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_LIST, 148, 284, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_LIST, 188);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_LIST, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_FORM, 184, 132, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_FORM, 176);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VOCIECONDESC, MyGlb.PANEL_FORM, "VC. ECONOMICHE DESCRIZIONE");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_VOCIECONDESC, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_VOCIECONDESC, PPQRY_VOCEECONDESC, "C.DESCRIZIONE", "CAPVOCECODES", 5, 140, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_LIST, -40, 308, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_LIST, 140);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_LIST, "Cge");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_FORM, 84, 156, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_FORM, 44);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CGE, MyGlb.PANEL_FORM, "Cge");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CGE, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CGE, PPQRY_GRO1, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_LIST, 160, 308, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_LIST, 140);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_LIST, "COD. GESTION. DESCR.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_FORM, 184, 156, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_FORM, 180);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODIGESTDESC, MyGlb.PANEL_FORM, "COD. GESTIONALI DESCRIZIONE");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CODIGESTDESC, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CODIGESTDESC, PPQRY_CGEDESCRIZIO, "C.DESCRIZIONE", "CAPCODGESDES", 5, 200, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.PANEL_LIST, 520, 240, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.PANEL_FORM, 556, 216, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CONTALABELDX, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CONTALABELDX, -1, GRP_DETTGRUPORDI_CONTABILE);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CONTALABELDX, -1, "", "CONTALABELDX", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_LIST, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_FORM, 40, 208, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_FORM, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_NUMERO, -1, GRP_DETTGRUPORDI_CONTABILE);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_NUMERO, PPQRY_GRO1, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_LIST, 96);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_FORM, 236, 208, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_FORM, 44);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_DATA, -1, GRP_DETTGRUPORDI_CONTABILE);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_DATA, PPQRY_GRO1, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_LIST, 56);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_FORM, 72, 240, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_FORM, 56);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_UFFICIO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_UFFICIO, PPQRY_GRO1, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1212, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tp. Vinc.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_FORM, 52, 264, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_TIPOVINCOLO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_TIPOVINCOLO, PPQRY_GRO1, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_LIST, 852, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_LIST, 40);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_FORM, 72, 288, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_FORM, 56);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_BOLLO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_BOLLO, PPQRY_GRO1, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_LIST, 12, 332, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V Livello");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_FORM, 40, 312, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V Livello");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CODLIVELLO5, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CODLIVELLO5, PPQRY_GRO1, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_LIST, 212, 332, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_LIST, "Descrizione V Liv");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_FORM, 220, 312, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_VISSTRRICDES, MyGlb.PANEL_FORM, "Descrizione V Liv");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_VISSTRRICDES, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_VISSTRRICDES, PPQRY_CODLIVELLO5, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_LIST, -4, 356, 648, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_FORM, 24, 336, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CODICEEUROPE, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CODICEEUROPE, PPQRY_GRO1, "A.CODICE_EUROPEO", "CODICE_EUROPEO", 1, 1, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_CODICEEUROPE, (new IDVariant(1)), "1 - entrate destinate al finanziamento dei progetti comunitari", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_CODICEEUROPE, (new IDVariant(2)), "2 - altre entrate", "", "", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_LIST, 52, 404, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_LIST, 52);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_FORM, 68, 392, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_FATTORE, -1, GRP_DETTGRUPORDI_ECONOMICA);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_FATTORE, PPQRY_GRO1, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_LIST, 248, 404, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_FORM, 272, 392, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_FATTORDESCRI, -1, GRP_DETTGRUPORDI_ECONOMICA);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_LIST, 56, 428, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_LIST, 48);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_FORM, 68, 416, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CENTRO, -1, GRP_DETTGRUPORDI_ECONOMICA);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CENTRO, PPQRY_GRO1, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_LIST, 248, 428, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_LIST, 128);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_FORM, 272, 416, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CENTRIDESCRI, -1, GRP_DETTGRUPORDI_ECONOMICA);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_LIST, 4, 452, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza Dal");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_FORM, 32, 440, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza Dal");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_COMPETENZDAL, -1, GRP_DETTGRUPORDI_ECONOMICA);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_COMPETENZDAL, PPQRY_GRO1, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_LIST, 224, 452, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_LIST, 20);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_FORM, 236, 440, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_FORM, 20);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_AL, -1, GRP_DETTGRUPORDI_ECONOMICA);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_AL, PPQRY_GRO1, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_LIST, 2132, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanz.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_FORM, 36, 468, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_FINANZIAMENT, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_FINANZIAMENT, PPQRY_GRO1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_LIST, 2132, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_FORM, 84, 492, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_OPERA, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_OPERA, PPQRY_GRO1, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_LIST, 2212, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_FORM, 84, 544, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_SPESE, -1, GRP_DETTGRUPORDI_ORDINAINFORM);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_SPESE, PPQRY_GRO1, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_LIST, 2744, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_LIST, "Cmm.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_FORM, 48, 568, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_COMMISSIONI, -1, GRP_DETTGRUPORDI_ORDINAINFORM);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_COMMISSIONI, PPQRY_GRO1, "A.COMMISSIONI", "COMMISSIONI", 1, 1, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_LIST, 2348, 32, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_LIST, 104);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_FORM, 72, 592, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ALLEGATI, -1, GRP_DETTGRUPORDI_ORDINAINFORM);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ALLEGATI, PPQRY_GRO1, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_LIST, 2784, 32, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_LIST, 104);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_FORM, 32, 616, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_FORM, 96);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOTESORIER, -1, GRP_DETTGRUPORDI_ORDINAINFORM);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOTESORIER, PPQRY_GRO1, "A.INFO_TESORIERE", "INFO_TESORIERE", 5, 200, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.PANEL_LIST, 276, 64, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.PANEL_FORM, 588, 624, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_LABELORDDX, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_LABELORDDX, -1, GRP_DETTGRUPORDI_ORDINATIVO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_LABELORDDX, -1, "", "LABELORDDX", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_LIST, 940, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_LIST, 84);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_LIST, "Numero");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_FORM, 644, 616, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_FORM, 84);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_NUMEROORD, MyGlb.PANEL_FORM, "Numero");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_NUMEROORD, -1, GRP_DETTGRUPORDI_ORDINATIVO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_NUMEROORD, PPQRY_GRO1, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.PANEL_LIST, 244, 32, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.PANEL_FORM, 688, 616, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_BARRAORD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_BARRAORD, -1, GRP_DETTGRUPORDI_ORDINATIVO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_BARRAORD, -1, "", "BARRAORD", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_LIST, 1000, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_LIST, 68);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_LIST, "Anno");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_FORM, 708, 616, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_FORM, 68);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOORD, MyGlb.PANEL_FORM, "Anno");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ANNOORD, -1, GRP_DETTGRUPORDI_ORDINATIVO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ANNOORD, PPQRY_GRO1, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_LIST, 1048, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_LIST, 128);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_FORM, 4, 692, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_FORM, 128);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOORDILIST, -1, GRP_DETTGRUPORDI_ORDINATIVO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOORDILIST, PPQRY_APRIINFO, "DECODE(~~ANNO_ORD~~, to_number(NULL), NULL, 'I')", "INFOORDINATI", 5, 99, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_INFOORDILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.PANEL_LIST, 556, 428, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.PANEL_FORM, 756, 620, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_INFOORDIDETT, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_INFOORDIDETT, -1, GRP_DETTGRUPORDI_ORDINATIVO);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_INFOORDIDETT, -1, "", "INFOORDIDETT", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_LIST, 3180, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 394, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_UTENTEINSERI, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_UTENTEINSERI, PPQRY_GRO1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_LIST, 3252, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 394, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_DATAINSERIME, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_DATAINSERIME, PPQRY_GRO1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_LIST, 3348, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 394, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_UTENTULTIAGG, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_UTENTULTIAGG, PPQRY_GRO1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_LIST, 3420, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 394, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_DATAULTIMAGG, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_DATAULTIMAGG, PPQRY_GRO1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.PANEL_LIST, 148, 12, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.PANEL_LIST, 2);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.PANEL_FORM, 124, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPITARTLABE, MyGlb.PANEL_FORM, 2);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPITARTLABE, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.PANEL_LIST, 332, 12, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.PANEL_LIST, 2);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.PANEL_FORM, 132, 8, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ACCERTALABEL, MyGlb.PANEL_FORM, 2);
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ACCERTALABEL, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ACCERTALABEL, -1, "", "ACCERTALABEL", 0, 0, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_LIST, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_LIST, "CAP TITOLO");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_FORM, 4, 640, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_FORM, 76);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPTITOLO, MyGlb.PANEL_FORM, "CAP TITOLO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPTITOLO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPTITOLO, PPQRY_CAP, "A.TITOLO", "CAPTITOLO", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_LIST, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_LIST, "CAP CATEGORIA");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_FORM, 4, 664, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_FORM, 100);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCATEGORIA, MyGlb.PANEL_FORM, "CAP CATEGORIA");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPCATEGORIA, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPCATEGORIA, PPQRY_CAP, "A.CATEGORIA", "CAPCATEGORIA", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_LIST, 128);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_LIST, "CAP COD INTERVENTO");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_FORM, 4, 688, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_FORM, 128);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODINTERV, MyGlb.PANEL_FORM, "CAP COD INTERVENTO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPCODINTERV, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPCODINTERV, PPQRY_CAP, "A.COD_INTERVENTO", "CAPCODINTERV", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_LIST, 92);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_LIST, "CAP COD TERZI");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_FORM, 4, 712, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_FORM, 92);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_CAPCODTERZI, MyGlb.PANEL_FORM, "CAP COD TERZI");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_CAPCODTERZI, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_CAPCODTERZI, PPQRY_CAP, "A.COD_TERZI", "CAPCODTERZI", 1, 2, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_LIST, 940, 48, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_LIST, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_LIST, "FATTORI TIPO");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_FORM, 4, 668, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_FORM, 88);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_FATTORITIPO, MyGlb.PANEL_FORM, "FATTORI TIPO");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_FATTORITIPO, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_FATTORITIPO, PPQRY_FATTORI, "A.TIPO", "FATTORITIPO", 5, 1, 0, -13997);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_FATTORITIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_FATTORITIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_DETTGRUPORDI.SetValueListItem(PFL_DETTGRUPORDI_FATTORITIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_LIST, 120);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_LIST, "Ordinamento Da Op");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_FORM, 4, 668, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_FORM, 120);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ORDINAMEDAOP, MyGlb.PANEL_FORM, "Ordinamento Da Op");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ORDINAMEDAOP, -1, -1);
    PAN_DETTGRUPORDI.SetFieldUnbound(PFL_DETTGRUPORDI_ORDINAMEDAOP, true);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ORDINAMEDAOP, PPQRY_GRO1, "DECODE(~~PQRY_PARAMETRI279.PARAMORDINAM~~, 'CAP', 1, A.PROGRESSIVO)", "ORDINAMEDAOP", 3, 28, 6, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_LIST, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_LIST, "ANNO PRE");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_FORM, 4, 692, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_FORM, 64);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_ANNOPRE, MyGlb.PANEL_FORM, "ANNO PRE");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_ANNOPRE, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_ANNOPRE, PPQRY_GRO1, "A.ANNO_PRE", "ANNO_PRE", 1, 4, 0, -13997);
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_LIST, 144);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_LIST, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_LIST, "ID OBIETTIVO GESTIONE");
    PAN_DETTGRUPORDI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_FORM, 4, 692, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTGRUPORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_FORM, 144);
    PAN_DETTGRUPORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_FORM, 1);
    PAN_DETTGRUPORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTGRUPORDI_IDOBIETGESTI, MyGlb.PANEL_FORM, "ID OBIETTIVO GESTIONE");
    PAN_DETTGRUPORDI.SetFieldPage(PFL_DETTGRUPORDI_IDOBIETGESTI, -1, -1);
    PAN_DETTGRUPORDI.SetFieldPanel(PFL_DETTGRUPORDI_IDOBIETGESTI, PPQRY_GRO1, "A.ID_OBIETTIVO_GESTIONE", "ID_OBIETTIVO_GESTIONE", 3, 10, 0, -13997);
  }

  private void PAN_DETTGRUPORDI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTGRUPORDI.SetSize(MyGlb.OBJ_QUERY, 16);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENDEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~DEBITORE~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_DEBITORE, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_DEBITORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_DEBITORE, "BEN");
    PAN_DETTGRUPORDI.SetQueryLKE(PPQRY_DEBITORE, PFL_DETTGRUPORDI_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENDEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_DEBITORE, 1, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryHeaderColumn(PPQRY_DEBITORE, "BENDEBITORE", "Debitore");
    PAN_DETTGRUPORDI.SetQueryHeaderColumn(PPQRY_DEBITORE, "CODICE_FISCALE", "Codice Fiscale");
    PAN_DETTGRUPORDI.SetQueryVisibleColumn(PPQRY_DEBITORE, "CODICE_FISCALE");
    PAN_DETTGRUPORDI.SetQueryHeaderColumn(PPQRY_DEBITORE, "PARTITA_IVA", "Partita IVA");
    PAN_DETTGRUPORDI.SetQueryVisibleColumn(PPQRY_DEBITORE, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNBENT02DES ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.NUM_QUIETANZA = ~~NUM_QUIETANZA~~) ");
    SQL.append("and   (A.CODICE = ~~DEBITORE~~) ");
    SQL.append("and   (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_QTNBEN, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_QTNBEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_QTNBEN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.DESCRIZIONE as CAPVOCECODES ");
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  RICLASSIFICAZIONI B, ");
    SQL.append("  VOCI_ECONOMICHE C ");
    SQL.append("where (B.VOCE_ECON = ~~VOCE_ECON~~) ");
    SQL.append("and   (C.CODICE = B.VOCE_ECON) ");
    SQL.append("and   (C.E_S = B.E_S) ");
    SQL.append("and   (B.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(A.TITOLO, NVL(B.TITOLO, -1))) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(A.CATEGORIA, NVL(B.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(A.COD_INTERVENTO, NVL(B.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(A.COD_TERZI, NVL(B.COD_TERZI, -1))) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_VOCEECONDESC, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_VOCEECONDESC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_VOCEECONDESC, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.DESCRIZIONE as CAPCODGESDES ");
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  RICLASSIFICAZIONI_GEST B, ");
    SQL.append("  CODICI_GESTIONALI C, ");
    SQL.append("  RICLASSIFICAZIONI D ");
    SQL.append("where (C.CODICE = ~~CODICE_GESTIONALE~~) ");
    SQL.append("and   (C.CODICE = B.CODICE_GESTIONALE) ");
    SQL.append("and   (B.PROGR_RICLASSIFICAZIONI = D.PROGRESSIVO) ");
    SQL.append("and   (C.E_S = D.E_S) ");
    SQL.append("and   (B.E_S = D.E_S) ");
    SQL.append("and   (B.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (NVL(D.TITOLO, -1) = NVL(A.TITOLO, NVL(D.TITOLO, -1))) ");
    SQL.append("and   (NVL(D.CATEGORIA, -1) = NVL(A.CATEGORIA, NVL(D.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(D.COD_INTERVENTO, -1) = NVL(A.COD_INTERVENTO, NVL(D.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(D.COD_TERZI, -1) = NVL(A.COD_TERZI, NVL(D.COD_TERZI, -1))) ");
    SQL.append("and   (D.VOCE_ECON = ~~VOCE_ECON~~) ");
    SQL.append("and   ((C.SCADENZA IS NULL) OR C.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_CGEDESCRIZIO, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_CGEDESCRIZIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_CGEDESCRIZIO, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
    SQL.append("  A.TIPO as FATTORITIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= TRUNC( SYSDATE ))) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= TRUNC( SYSDATE ))) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as CAPTITOLO, ");
    SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
    SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
    SQL.append("  A.COD_TERZI as CAPCODTERZI ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES, ");
    SQL.append("  A.STRUTTURA_RICL_ID as VISTSTRRICID, ");
    SQL.append("  A.TIPO_RICL_ID as VISTVISTTIRI, ");
    SQL.append("  A.DES_LIVELLO as VISSTRRIDELI, ");
    SQL.append("  A.CODICE_TIPO_RICL as VISTVISTCOTR, ");
    SQL.append("  A.MAX_LIVELLO_RICL as VISTVISTMALR, ");
    SQL.append("  A.CONTROPARTITA as VISSTRRICCON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A, ");
    SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
    SQL.append("where (B.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.E_S(+) = 'E') ");
    SQL.append("and   (B.CAPITOLO(+) = ~~CAPITOLO~~) ");
    SQL.append("and   (B.ARTICOLO(+) = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CODICE_TIPO_RICL(+) = 'MACRO') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(B.ESERCIZIO_INIZIO(+), 0) AND NVL(B.ESERCIZIO_SCADENZA(+), 9999))) ");
    SQL.append("and   (A.CODICE_PADRE = NVL(B.CODICE(+), A.CODICE_PADRE)) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
    SQL.append("and   (A.CODICE = ~~COD_LIVELLO_5~~) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_CODLIVELLO5, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_CODLIVELLO5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_CODLIVELLO5, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~ANNO_PRE~~, to_number(NULL), 'A', NULL) as APRICAPILIST, ");
    SQL.append("  DECODE(~~CAPITOLO~~, to_number(NULL), NULL, DECODE(~~ARTICOLO~~, to_number(NULL), NULL, 'I')) as INFOCAPILIST, ");
    SQL.append("  DECODE(~~ANNO_PRE~~, to_number(NULL), 'A', NULL) as APRIACCLIST, ");
    SQL.append("  DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, 'I')) as INFOACCLIST, ");
    SQL.append("  DECODE(~~ANNO_PRE~~, to_number(NULL), 'A', NULL) as APRIDEBILIST, ");
    SQL.append("  DECODE(~~DEBITORE~~, to_number(NULL), NULL, 'I') as INFODEBILIST, ");
    SQL.append("  DECODE(~~ANNO_ORD~~, to_number(NULL), NULL, 'I') as INFOORDINATI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~GRUPPO~~ IS NULL))) ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_APRIINFO, 0, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_APRIINFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(PPQRY_APRIINFO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_T53, 0, SQL, PFL_DETTGRUPORDI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_T53, 1, SQL, PFL_DETTGRUPORDI_UFFICIO, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_DETTGRUPORDI_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_DETTGRUPORDI_TIPOVINCOLO, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("and   ((A.TIPO IS NULL) OR A.TIPO = 'L') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_T60, 0, SQL, PFL_DETTGRUPORDI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where ((A.TIPO IS NULL) OR A.TIPO = 'L') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_T60, 1, SQL, PFL_DETTGRUPORDI_BOLLO, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_BILFIN1, 0, SQL, PFL_DETTGRUPORDI_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_BILFIN1, 1, SQL, PFL_DETTGRUPORDI_FINANZIAMENT, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_BILFIN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as BILFINOPERA, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  OPERE B ");
    SQL.append("where (A.OPERA = ~~OPERA~~) ");
    SQL.append("and   ((~~NUMERO_ACC~~ IS NULL)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (B.CODICE = A.OPERA) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  C.OPERA, ");
    SQL.append("  TO_CHAR ( C.OPERA ) || ' - ' || E.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  ESEA_OPE D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (C.OPERA = ~~OPERA~~) ");
    SQL.append("and   (NOT ((~~NUMERO_ACC~~ IS NULL))) ");
    SQL.append("and   (C.ANNO_ACC = ~~ANNO_ACC~~) ");
    SQL.append("and   (C.NUMERO_ACC = ~~NUMERO_ACC~~) ");
    SQL.append("and   (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("and   (D.OPERA = C.OPERA) ");
    SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
    SQL.append("and   ((D.SALDO_INI + D.VARIAZIONI + D.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (E.CODICE(+) = C.OPERA) ");
    SQL.append("order by 1 ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_BILFIN, 0, SQL, PFL_DETTGRUPORDI_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as BILFINOPERA, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  OPERE B ");
    SQL.append("where ((~~NUMERO_ACC~~ IS NULL)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (B.CODICE = A.OPERA) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  C.OPERA, ");
    SQL.append("  TO_CHAR ( C.OPERA ) || ' - ' || E.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  ESEA_OPE D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (NOT ((~~NUMERO_ACC~~ IS NULL))) ");
    SQL.append("and   (C.ANNO_ACC = ~~ANNO_ACC~~) ");
    SQL.append("and   (C.NUMERO_ACC = ~~NUMERO_ACC~~) ");
    SQL.append("and   (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("and   (D.OPERA = C.OPERA) ");
    SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
    SQL.append("and   ((D.SALDO_INI + D.VARIAZIONI + D.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (E.CODICE(+) = C.OPERA) ");
    SQL.append("order by 1 ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_BILFIN, 1, SQL, PFL_DETTGRUPORDI_OPERA, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_DETTGRUPORDI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_DETTGRUPORDI_SPESE, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetIMDB(IMDB, "PQRY_GRO1", true);
    PAN_DETTGRUPORDI.set_SetString(MyGlb.MASTER_ROWNAME, "GRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.GRUPPO as GRUPPO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.CAPITOLO as GROCAPITOOLD, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ARTICOLO as GROARTICOOLD, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.NUMERO_ACC as GRONUMACCOLD, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.ANNO_ACC as GROANNACCOLD, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  A.DEBITORE as GROCODDEBOLD, ");
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.NUM_QUIETANZA as GROQUIETAOLD, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.VOCE_ECON as GROVOCECOOLD, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.CCF as CCF, ");
    SQL.append("  A.SPESE as SPESE, ");
    SQL.append("  A.SPESE as GROSPESEOLD, ");
    SQL.append("  A.ALLEGATI as ALLEGATI, ");
    SQL.append("  A.COMMISSIONI as COMMISSIONI, ");
    SQL.append("  A.INFO_TESORIERE as INFO_TESORIERE, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.NUMERO_CONTABILE as NUMERO_CONTABILE, ");
    SQL.append("  A.DATA_CONTABILE as DATA_CONTABILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ID_OBIETTIVO_GESTIONE as ID_OBIETTIVO_GESTIONE, ");
    SQL.append("  A.COD_LIVELLO_5 as COD_LIVELLO_5, ");
    SQL.append("  A.CODICE_EUROPEO as CODICE_EUROPEO, ");
    SQL.append("  DECODE(~~PQRY_PARAMETRI279.PARAMORDINAM~~, 'CAP', 1, A.PROGRESSIVO) as ORDINAMEDAOP, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_GRO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  GRO A ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_GRO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.GRUPPO = ~~TBL_PARAMETRI311.PARACODIGRUP~~) ");
    SQL.append("and   (A.E = ~~TBL_PARAMETRI311.PARAENTRSPES~~) ");
    SQL.append("and   ((~~TBL_PARAMETRI311.PARAIMPDAFIL~~ IS NULL) OR (A.ANNO_PRE IS NULL) OR NVL(~~PQRY_PARAMETRI279.PARANCDETEME~~, 'NO') = 'SI') ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_GRO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTGRUPORDI.SetQuery(PPQRY_GRO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTGRUPORDI.SetQuery(PPQRY_GRO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 43, 3, 5, 9, 7, 1 ");
    PAN_DETTGRUPORDI.SetQuery(PPQRY_GRO1, 5, SQL, -1, "");
    PAN_DETTGRUPORDI.SetQueryDB(PPQRY_GRO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTGRUPORDI.SetMasterTable(0, "GRO");
    PAN_DETTGRUPORDI.AddToSortList(PFL_DETTGRUPORDI_ORDINAMEDAOP, true);
    PAN_DETTGRUPORDI.AddToSortList(PFL_DETTGRUPORDI_CAPITOLO, true);
    PAN_DETTGRUPORDI.AddToSortList(PFL_DETTGRUPORDI_ARTICOLO, true);
    PAN_DETTGRUPORDI.AddToSortList(PFL_DETTGRUPORDI_ANNOACC, true);
    PAN_DETTGRUPORDI.AddToSortList(PFL_DETTGRUPORDI_NUMEROACC, true);
    PAN_DETTGRUPORDI.AddToSortList(PFL_DETTGRUPORDI_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTGRUPORDI.Status() == 2)
    {
      int oldListQBE = PAN_DETTGRUPORDI.iUseListQBE;
      PAN_DETTGRUPORDI.iUseListQBE = 0;
      PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTGRUPORDI.PanelCommand(Glb.PCM_FIND);
      PAN_DETTGRUPORDI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, "172FBBB6-3CE8-40A6-A327-DBAFDF3FD021");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, "86EF7605-8511-4ACD-8B92-2C6996494946");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "1398B367-BAB3-4390-A72E-DCC68B7D7305");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, "1826EFCA-4734-43BC-AD74-501BB8E59430");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, "Anche Dettagli Emessi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_LIST, 4, 28, 432, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_FORM, 4, 4, 540, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_GRUPPOLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_GRUPPOLABEL, -1, "", "GRUPPOLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_LIST, 492, 28, 288, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_FORM, 608, 4, 168, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPOTOTALABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPOTOTALABE, -1, "", "IMPOTOTALABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 44, 32, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_PARAMETRI279, "A.PARAMORDINAM", "PARAMORDINAM", 5, 3, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("CAP")), "Capitolo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("PRO")), "Progressivo", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, "Anche Dettagli Emessi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, 300, 32, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, "Anche Dettagli Emessi");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCHDETTEMES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCHDETTEMES, PPQRY_PARAMETRI279, "A.PARANCDETEME", "PARANCDETEME", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHDETTEMES, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHDETTEMES, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI279", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI279, IMDBDef15.PQRY_PARAMETRI279_RS, IMDBDef5.TBL_PARAMETRI311);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef5.FLD_PARAMETRI311_PARAMORDINAM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCHDETTEMES, IMDBDef5.FLD_PARAMETRI311_PARANCDETEME);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI311");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_OnChangeRow();
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
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_DETTGRUPORDI) PAN_DETTGRUPORDI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
