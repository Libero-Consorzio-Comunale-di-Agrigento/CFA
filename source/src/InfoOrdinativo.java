// **********************************************
// Info Ordinativo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoOrdinativo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPORTO_IMPORTO = 0;
  private static int PFL_IMPORTO_IMPORTOLABEL = 1;

  private static int PPQRY_IMPORTO2 = 0;


  IDPanel PAN_IMPORTO;
  OTabView TAB_TABBEDVIEW;
  private static int GRP_ORDINATIVO_ORDINATIVO = 0;
  private static int GRP_ORDINATIVO_DISTINTA = 1;
  private static int GRP_ORDINATIVO_ACCERTAMENTO = 2;
  private static int GRP_ORDINATIVO_CAPITOLOART = 3;
  private static int GRP_ORDINATIVO_INSERIMENTO = 4;
  private static int GRP_ORDINATIVO_AGGIORNAMENT = 5;

  private static int PFL_ORDINATIVO_ORDINATIVO = 0;
  private static int PFL_ORDINATIVO_DEL1 = 1;
  private static int PFL_ORDINATIVO_DISTINTA = 2;
  private static int PFL_ORDINATIVO_DEL = 3;
  private static int PFL_ORDINATIVO_NUMERO1 = 4;
  private static int PFL_ORDINATIVO_BARRACCELABE = 5;
  private static int PFL_ORDINATIVO_ANNO = 6;
  private static int PFL_ORDINATIVO_ACCERTALABEL = 7;
  private static int PFL_ORDINATIVO_ACCDESCRIZIO = 8;
  private static int PFL_ORDINATIVO_INFOACC = 9;
  private static int PFL_ORDINATIVO_CAPITOLO1 = 10;
  private static int PFL_ORDINATIVO_ARTICOLO1 = 11;
  private static int PFL_ORDINATIVO_LABELVOCEPEG = 12;
  private static int PFL_ORDINATIVO_INFOVOCEPEG = 13;
  private static int PFL_ORDINATIVO_CAPITOLO2 = 14;
  private static int PFL_ORDINATIVO_BARRA = 15;
  private static int PFL_ORDINATIVO_ARTICOLO2 = 16;
  private static int PFL_ORDINATIVO_VOCEECONOMIC = 17;
  private static int PFL_ORDINATIVO_VOCIECONDESC = 18;
  private static int PFL_ORDINATIVO_UFFICIO = 19;
  private static int PFL_ORDINATIVO_TIPOVINCOLO1 = 20;
  private static int PFL_ORDINATIVO_BOLLO1 = 21;
  private static int PFL_ORDINATIVO_UTENTE1 = 22;
  private static int PFL_ORDINATIVO_DATA1 = 23;
  private static int PFL_ORDINATIVO_UTENTE = 24;
  private static int PFL_ORDINATIVO_DATA2 = 25;
  private static int PFL_ORDINATIVO_IMPORTO1 = 26;
  private static int PFL_ORDINATIVO_ANNOORD1 = 27;
  private static int PFL_ORDINATIVO_ANNOELENCO = 28;
  private static int PFL_ORDINATIVO_ANNOMANDCO = 29;
  private static int PFL_ORDINATIVO_NUMEROMANDCO = 30;
  private static int PFL_ORDINATIVO_CODICEFINANZ = 31;
  private static int PFL_ORDINATIVO_DATAELENCO = 32;
  private static int PFL_ORDINATIVO_E = 33;
  private static int PFL_ORDINATIVO_INCASSATO = 34;
  private static int PFL_ORDINATIVO_ANNOMANCOINP = 35;
  private static int PFL_ORDINATIVO_NUMEMANCOINP = 36;
  private static int PFL_ORDINATIVO_ANNOMANCOINA = 37;
  private static int PFL_ORDINATIVO_NUMEMANCOINA = 38;
  private static int PFL_ORDINATIVO_ANNMANCOADRE = 39;
  private static int PFL_ORDINATIVO_NUMMANCOADRE = 40;
  private static int PFL_ORDINATIVO_ANNMANCOADCO = 41;
  private static int PFL_ORDINATIVO_NUMMANCOADCO = 42;

  private static int PPQRY_ORD8 = 0;

  private static int PPQRY_RISCAPART = 1;
  private static int PPQRY_RICLASSIFICA = 2;
  private static int PPQRY_ACC = 3;

  private static int PPQRY_T53 = 4;
  private static int PPQRY_VINCOLI = 5;
  private static int PPQRY_T60 = 6;
  private static int PPQRY_DUAL1 = 7;
  private static int PPQRY_DUAL = 8;


  IDPanel PAN_ORDINATIVO;
  private static int GRP_DETTAGLI_CONTABTESORE = 0;
  private static int GRP_DETTAGLI_ORDINFORMATI = 1;

  private static int PFL_DETTAGLI_ANNOPRE = 0;
  private static int PFL_DETTAGLI_NUMEROPRE = 1;
  private static int PFL_DETTAGLI_DESCRIZIONE = 2;
  private static int PFL_DETTAGLI_IMPORTO2 = 3;
  private static int PFL_DETTAGLI_DOCUMENLABEL = 4;
  private static int PFL_DETTAGLI_NUMERODOC = 5;
  private static int PFL_DETTAGLI_BARRADOCUMEN = 6;
  private static int PFL_DETTAGLI_ANNODOC = 7;
  private static int PFL_DETTAGLI_CODICEDEBIT1 = 8;
  private static int PFL_DETTAGLI_QUIETANLABEL = 9;
  private static int PFL_DETTAGLI_NUMQUIETANZA = 10;
  private static int PFL_DETTAGLI_QUIETADESCRI = 11;
  private static int PFL_DETTAGLI_CGE = 12;
  private static int PFL_DETTAGLI_CGEDESCRIZIO = 13;
  private static int PFL_DETTAGLI_CAUSALE = 14;
  private static int PFL_DETTAGLI_NUMERO = 15;
  private static int PFL_DETTAGLI_DATA = 16;
  private static int PFL_DETTAGLI_INCCCP = 17;
  private static int PFL_DETTAGLI_ESTRCCP = 18;
  private static int PFL_DETTAGLI_FATTORE = 19;
  private static int PFL_DETTAGLI_FATTORDESCRI = 20;
  private static int PFL_DETTAGLI_CENTRO = 21;
  private static int PFL_DETTAGLI_CENTRODESCRI = 22;
  private static int PFL_DETTAGLI_COMPETENZDAL = 23;
  private static int PFL_DETTAGLI_AL = 24;
  private static int PFL_DETTAGLI_CONTROPAPATR = 25;
  private static int PFL_DETTAGLI_CONTPATRDESC = 26;
  private static int PFL_DETTAGLI_VEDICLASCONT = 27;
  private static int PFL_DETTAGLI_OPERA = 28;
  private static int PFL_DETTAGLI_INFOOPERA = 29;
  private static int PFL_DETTAGLI_SPESE = 30;
  private static int PFL_DETTAGLI_COMMISSIONI = 31;
  private static int PFL_DETTAGLI_ALLEGATI = 32;
  private static int PFL_DETTAGLI_INFOTESORIER = 33;
  private static int PFL_DETTAGLI_UTENTEINSERI = 34;
  private static int PFL_DETTAGLI_DATAINSERIME = 35;
  private static int PFL_DETTAGLI_UTENTULTIAGG = 36;
  private static int PFL_DETTAGLI_DATAULTIMAGG = 37;
  private static int PFL_DETTAGLI_DEBITORLABEL = 38;
  private static int PFL_DETTAGLI_BENRAGIOSOCI = 39;
  private static int PFL_DETTAGLI_FATANNOPROG = 40;
  private static int PFL_DETTAGLI_FATNUMERPROG = 41;
  private static int PFL_DETTAGLI_CAPITOLO = 42;
  private static int PFL_DETTAGLI_ARTICOLO = 43;
  private static int PFL_DETTAGLI_ANNOACC = 44;
  private static int PFL_DETTAGLI_NUMEROACC = 45;
  private static int PFL_DETTAGLI_ANNOORD = 46;
  private static int PFL_DETTAGLI_NUMEROORD = 47;

  private static int PPQRY_PRE4 = 0;

  private static int PPQRY_QUIETANZE = 1;
  private static int PPQRY_CGE = 2;
  private static int PPQRY_FATTORI = 3;
  private static int PPQRY_CENTRI = 4;
  private static int PPQRY_CONTROPAPATR = 5;
  private static int PPQRY_DEBITORE = 6;

  private static int PPQRY_T58 = 7;
  private static int PPQRY_ACCOPE = 8;
  private static int PPQRY_TIPISPESMINF = 9;


  IDPanel PAN_DETTAGLI;
  private static int PFL_DEBITORE_INFODEBITORE = 0;
  private static int PFL_DEBITORE_DEBITORE = 1;
  private static int PFL_DEBITORE_CODICEDEBITO = 2;

  private static int PPQRY_DEBITORE2 = 0;


  IDPanel PAN_DEBITORE;

  // Definition of Global Variables
  private IDVariant DEBITOREACC = new IDVariant(0,IDVariant.FLOAT);
  private IDVariant DESCRIZIOACC = new IDVariant(0,IDVariant.STRING);
  private IDVariant CGEACC = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant FATTOREACC = new IDVariant(0,IDVariant.STRING);
  private IDVariant CENTROACC = new IDVariant(0,IDVariant.STRING);
  private IDVariant COMPDALACC = new IDVariant(0,IDVariant.DATETIME);
  private IDVariant COMPALACC = new IDVariant(0,IDVariant.DATETIME);
  private IDVariant RILEVAECOACC = new IDVariant(0,IDVariant.STRING);
  private IDVariant VISIFATTECOM = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant VISIBICENTRO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant FASEESERCIZI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETINPU3(IMDB);
    Init_TBL_PARAMVOCEPE3(IMDB);
    Init_TBL_DEBITORE1(IMDB);
    Init_TBL_IMPORTO4(IMDB);
    //
    //
    Init_PQRY_ORD8(IMDB);
    Init_PQRY_PRE4(IMDB);
    Init_PQRY_DEBITORE2(IMDB);
    Init_PQRY_DEBITORE2_RS(IMDB);
    Init_PQRY_IMPORTO2(IMDB);
    Init_PQRY_IMPORTO2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETINPU3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETINPU3, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETINPU3, "TBL_PARAMETINPU3");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETINPU3,IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, "PARAMANNOORD");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETINPU3,IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETINPU3,IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, "PARAMNUMEORD");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETINPU3,IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETINPU3, 0);
  }

  private static void Init_TBL_PARAMVOCEPE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMVOCEPE3, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMVOCEPE3, "TBL_PARAMVOCEPE3");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGTIT, "PARVOCPEGTIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGTIT,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOIN, "PARVOCPECOIN");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOIN,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOTE, "PARVOCPECOTE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOTE,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGCAT, "PARVOCPEGCAT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMVOCEPE3,IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGCAT,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMVOCEPE3, 0);
  }

  private static void Init_TBL_DEBITORE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_DEBITORE1, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_DEBITORE1, "TBL_DEBITORE1");
    IMDB.set_FldCode(IMDBDef1.TBL_DEBITORE1,IMDBDef1.FLD_DEBITORE1_DEBIRAGISOCI, "DEBIRAGISOCI");
    IMDB.SetFldParams(IMDBDef1.TBL_DEBITORE1,IMDBDef1.FLD_DEBITORE1_DEBIRAGISOCI,5,60,0);
    IMDB.set_FldCode(IMDBDef1.TBL_DEBITORE1,IMDBDef1.FLD_DEBITORE1_DEBITOCODICE, "DEBITOCODICE");
    IMDB.SetFldParams(IMDBDef1.TBL_DEBITORE1,IMDBDef1.FLD_DEBITORE1_DEBITOCODICE,1,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_DEBITORE1, 0);
  }

  private static void Init_TBL_IMPORTO4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IMPORTO4, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_IMPORTO4, "TBL_IMPORTO4");
    IMDB.set_FldCode(IMDBDef1.TBL_IMPORTO4,IMDBDef1.FLD_IMPORTO4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef1.TBL_IMPORTO4,IMDBDef1.FLD_IMPORTO4_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef1.TBL_IMPORTO4, 0);
  }

  private static void Init_PQRY_ORD8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ORD8, 33);
    IMDB.set_TblCode(IMDBDef8.PQRY_ORD8, "PQRY_ORD8");
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO, "ANNO_MAND_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO, "NUMERO_MAND_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_CODICE_FINANZ, "CODICE_FINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_CODICE_FINANZ,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_D_DATA_ORD, "D_DATA_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_D_DATA_ORD,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_ELENCO, "ANNO_ELENCO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_ELENCO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_ELENCO, "NUMERO_ELENCO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_ELENCO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_DATA_ELENCO, "DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_DATA_ELENCO,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_E, "E");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_E,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_D_DATA_ELENCO, "D_DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_D_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_INCASSATO, "INCASSATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_INCASSATO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_INPS, "ANNO_MAND_CO_INPS");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_INPS,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_INPS, "NUMERO_MAND_CO_INPS");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_INPS,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_INAIL, "ANNO_MAND_CO_INAIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_INAIL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_INAIL, "NUMERO_MAND_CO_INAIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_INAIL,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_ADD_REG, "ANNO_MAND_CO_ADD_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_ADD_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_ADD_REG, "NUMERO_MAND_CO_ADD_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_ADD_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_ADD_COM, "ANNO_MAND_CO_ADD_COM");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_ANNO_MAND_CO_ADD_COM,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_ADD_COM, "NUMERO_MAND_CO_ADD_COM");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_NUMERO_MAND_CO_ADD_COM,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD8,IMDBDef8.PQSL_ORD8_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ORD8, 0);
  }

  private static void Init_PQRY_PRE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PRE4, 51);
    IMDB.set_TblCode(IMDBDef8.PQRY_PRE4, "PQRY_PRE4");
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_INC, "NUMERO_INC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_INC,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_INC, "DATA_INC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_INC,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_IMPORTO_INC, "IMPORTO_INC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_IMPORTO_INC,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_ESTRATTO_CCP, "DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_ESTRATTO_CCP,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_CCP, "DATA_CCP");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_CCP,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CODICE_FINANZ, "CODICE_FINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CODICE_FINANZ,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CODICE_PTC, "CODICE_PTC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CODICE_PTC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_E, "E");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_E,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_D_DATA_INC, "D_DATA_INC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_D_DATA_INC,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_D_DATA_ESTRATTO_CCP, "D_DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_D_DATA_ESTRATTO_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_D_DATA_CCP, "D_DATA_CCP");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_D_DATA_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COD_IMP_ECO, "COD_IMP_ECO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COD_IMP_ECO,5,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_PROGRESSIVO_CFA, "PROGRESSIVO_CFA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_PROGRESSIVO_CFA,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_TIPO_DISTINTA, "TIPO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_TIPO_DISTINTA,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE4,IMDBDef8.PQSL_PRE4_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PRE4, 0);
  }

  private static void Init_PQRY_DEBITORE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DEBITORE2, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_DEBITORE2, "PQRY_DEBITORE2");
    IMDB.set_FldCode(IMDBDef8.PQRY_DEBITORE2,IMDBDef8.PQSL_DEBITORE2_DEBIRAGISOCI, "DEBIRAGISOCI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEBITORE2,IMDBDef8.PQSL_DEBITORE2_DEBIRAGISOCI,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEBITORE2,IMDBDef8.PQSL_DEBITORE2_DEBITOCODICE, "DEBITOCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEBITORE2,IMDBDef8.PQSL_DEBITORE2_DEBITOCODICE,1,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DEBITORE2, 0);
  }

  private static void Init_PQRY_DEBITORE2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DEBITORE2_RS, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_DEBITORE2_RS, "PQRY_DEBITORE2_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_DEBITORE2_RS,IMDBDef8.PQSL_DEBITORE2_DEBIRAGISOCI, "DEBIRAGISOCI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEBITORE2_RS,IMDBDef8.PQSL_DEBITORE2_DEBIRAGISOCI,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEBITORE2_RS,IMDBDef8.PQSL_DEBITORE2_DEBITOCODICE, "DEBITOCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEBITORE2_RS,IMDBDef8.PQSL_DEBITORE2_DEBITOCODICE,1,10,0);
  }

  private static void Init_PQRY_IMPORTO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_IMPORTO2, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_IMPORTO2, "PQRY_IMPORTO2");
    IMDB.set_FldCode(IMDBDef8.PQRY_IMPORTO2,IMDBDef8.PQSL_IMPORTO2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_IMPORTO2,IMDBDef8.PQSL_IMPORTO2_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef8.PQRY_IMPORTO2, 0);
  }

  private static void Init_PQRY_IMPORTO2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_IMPORTO2_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_IMPORTO2_RS, "PQRY_IMPORTO2_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_IMPORTO2_RS,IMDBDef8.PQSL_IMPORTO2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_IMPORTO2_RS,IMDBDef8.PQSL_IMPORTO2_IMPORTO,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoOrdinativo(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoOrdinativo()
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
    FormIdx = MyGlb.FRM_INFOORDINATI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CC6E3C0D-C43C-4D04-953E-62517B40CF20";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 618;
    set_Caption(new IDVariant("Info Ordinativo"));
    //
    Frames = new AFrame[7];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 592;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0810811;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 784;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Importo";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_IMPORTO = new IDPanel(w, this, 2, "PAN_IMPORTO");
    Frames[2].Content = PAN_IMPORTO;
    PAN_IMPORTO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPORTO.VS = MainFrm.VisualStyleList;
    PAN_IMPORTO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPORTO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B95921C2-E4A8-4EC4-9200-83D4F445088F");
    PAN_IMPORTO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPORTO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPORTO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPORTO.InitStatus = 2;
    PAN_IMPORTO_Init();
    PAN_IMPORTO_InitFields();
    PAN_IMPORTO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 784;
    Frames[3].Height = 544;
    Frames[3].Caption = "Tabbed View";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 544;
    TAB_TABBEDVIEW = new OTabView(this);
    Frames[3].Content = TAB_TABBEDVIEW;
    TAB_TABBEDVIEW.iGuid = "E868197A-B99A-49FC-85FB-35D46AD02B07";
    TAB_TABBEDVIEW.SetItemCount(2);
    TAB_TABBEDVIEW.Placement = 1;
    TAB_TABBEDVIEW.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Ordinativo";
    Frames[4].Parent = this;
    PAN_ORDINATIVO = new IDPanel(w, this, 4, "PAN_ORDINATIVO");
    Frames[4].Content = PAN_ORDINATIVO;
    PAN_ORDINATIVO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINATIVO.VS = MainFrm.VisualStyleList;
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 544-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FCA1C4F5-848B-45CA-81A9-E7D4213C236B");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4384, 292, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINATIVO.InitStatus = 2;
    PAN_ORDINATIVO_Init();
    PAN_ORDINATIVO_InitFields();
    PAN_ORDINATIVO_InitQueries();
    TAB_TABBEDVIEW.SetItem(1, Frames[4], 0, "", "Ordinativo", "Ordinativi d'incasso");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Dettagli";
    Frames[5].Parent = this;
    PAN_DETTAGLI = new IDPanel(w, this, 5, "PAN_DETTAGLI");
    Frames[5].Content = PAN_DETTAGLI;
    PAN_DETTAGLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLI.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 544-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2A5CFA37-C466-4C53-B32F-01F412B8CA02");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3156, 1336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLI.InitStatus = 2;
    PAN_DETTAGLI_Init();
    PAN_DETTAGLI_InitFields();
    PAN_DETTAGLI_InitQueries();
    TAB_TABBEDVIEW.SetItem(2, Frames[5], 0, "", "Dettagli", "Preordini");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    PAN_DETTAGLI.SetSubFrame(PFL_DETTAGLI_DEBITORLABEL,6);
    Frames[6].set_SubFrame(true);
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Debitore";
    Frames[6].Parent = this;
    PAN_DEBITORE = new IDPanel(w, this, 6, "PAN_DEBITORE");
    Frames[6].Content = PAN_DEBITORE;
    PAN_DEBITORE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DEBITORE.VS = MainFrm.VisualStyleList;
    PAN_DEBITORE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "53799844-8912-4A89-8E06-D663D8C78A1A");
    PAN_DEBITORE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 368, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DEBITORE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DEBITORE.InitStatus = 2;
    PAN_DEBITORE_Init();
    PAN_DEBITORE_InitFields();
    PAN_DEBITORE_InitQueries();
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
    // Resetto il fuoco perchË le tabbed view lo possono modificare
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG140+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI92+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG140+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INCASSI1+BaseCmdLinIdx)
      {
        ApriIncassi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MANCOLPERCO1+BaseCmdLinIdx)
      {
        MandatiCollegatiperCompensazione();
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
      if (IMDB.TblModified(IMDBDef1.TBL_DEBITORE1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFOORDINATI_DEBITORE2();
      }
      if (IMDB.TblModified(IMDBDef1.TBL_IMPORTO4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFOORDINATI_IMPORTO2();
      }
      PAN_ORDINATIVO.UpdatePanel(MainFrm);
      PAN_DETTAGLI.UpdatePanel(MainFrm);
      PAN_DEBITORE.UpdatePanel(MainFrm);
      PAN_IMPORTO.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato Ë una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof InfoOrdinativo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoOrdinativo.class.getName() : (Glb.ClassWithPackage(InfoOrdinativo.class) ? InfoOrdinativo.class.getName().substring(InfoOrdinativo.class.getPackage().getName().length() + 1) : InfoOrdinativo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Debitore On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DEBITORE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DEBITORE);
      // 
      // Debitore On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DEBITORE.set_ToolTip(Glb.OBJ_FIELD,PFL_DEBITORE_DEBITORE,(new IDVariant(PAN_DEBITORE.FieldText(PFL_DEBITORE_DEBITORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "DebitoreOnDynamicPropertiesEvent", _e);
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
    IDVariant v_PERS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOTESOGGETTI1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOTESOGGETTI1 = (new IDVariant("note_soggetti", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Ordinativo ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0))), MainFrm.ESERCIZIO));
      PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      v_PERS = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_NOTESOGGETTI1);
      LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      FASEESERCIZI = IDL.NullValue(MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)),(new IDVariant(0)));
      VisibilitaMandatoInformatico();
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ORDINATIVO.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DETTAGLI.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "LoadEvent", _e);
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
      AnnullaParametriOrdinativi();
      AnnullaParametriDettagli();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Tabbed View Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: » un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_TABBEDVIEW_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tabbed View Change Page Event Body
      // Procedure Body
      // 
      Visibilit‡Economica();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "TabbedViewChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativo On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINATIVO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINATIVO);
      // 
      // Ordinativo On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaTooltip();
      Visibilit‡VocePeg();
      VisibilitaInfoOrd();
      if (PAN_ORDINATIVO.IsNewRow())
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if ((IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0).equals((new IDVariant(1.000000000000000e+016)), true) || IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0).equals((new IDVariant(1.000000000000000e+016)), true)))
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "OrdinativoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ORDINATIVO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativo After Find Event Body
      // Procedure Body
      // 
      SettaParametriOrdinativiOld();
      SettaValoriCap();
      SettaImporto();
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ACC, 0))))
      {
        ProponiDaAcc();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "OrdinativoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativo On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java Ë l'errore nativo del database mentre in C# Ë l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non Ë stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_ORDINATIVO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ORDINATIVO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Ordinativo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "OrdinativoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGLI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_DEBITORE1, IMDBDef1.FLD_DEBITORE1_DEBIRAGISOCI, 0, (new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_BENRAGIOSOCI))));
      IMDB.set_Value(IMDBDef1.TBL_DEBITORE1, IMDBDef1.FLD_DEBITORE1_DEBITOCODICE, 0, new IDVariant(IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_DEBITORE, 0),IDVariant.INTEGER));
      SettaParametriDettagliOld();
      SettaImporto();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "DettagliAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGLI);
      // 
      // Dettagli On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_QUIETADESCRI,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_QUIETADESCRI))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_CGEDESCRIZIO,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_CGEDESCRIZIO))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_DESCRIZIONE,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_DESCRIZIONE))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_FATTORDESCRI,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_FATTORDESCRI))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_CENTRODESCRI,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_CENTRODESCRI))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_CONTPATRDESC,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_CONTPATRDESC))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_OPERA,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_OPERA))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_ALLEGATI,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_ALLEGATI))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_INFOTESORIER,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_INFOTESORIER))).stringValue()); 
      VisibilitaInfoDett();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "DettagliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java Ë l'errore nativo del database mentre in C# Ë l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non Ë stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_DETTAGLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DETTAGLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Dettagli On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "DettagliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_DETTAGLI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_DEBITORE1, IMDBDef1.FLD_DEBITORE1_DEBIRAGISOCI, 0, (new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_BENRAGIOSOCI))));
      IMDB.set_Value(IMDBDef1.TBL_DEBITORE1, IMDBDef1.FLD_DEBITORE1_DEBITOCODICE, 0, new IDVariant(IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_DEBITORE, 0),IDVariant.INTEGER));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "DettagliOnChangeRowEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "InfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ARTICOLO, 0))))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_INFOSUVOCBIL, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI21, IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_INFOSULLOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "InfoOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Debitore
  // Explain which processing is carried out by this procedure
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
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_DEBITORE, 0));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "InfoDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Vedi Classe Contabile
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int VediClasseContabile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CODIMPECO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Classe Contabile del Soggetto:", IDVariant.STRING));
      // 
      // Vedi Classe Contabile Body
      // Procedure Body
      // 
      v_CODIMPECO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.COD_IMP_ECO as BENCODIMPECO ");
      SQL.append("from ");
      SQL.append("  BEN A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_DEBITORE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODIMPECO = QV.Get("BENCODIMPECO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.IsNull(v_CODIMPECO))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("nessuna", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_SMS, v_AVVISO)); 
        return 0;
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as IMPECOBENDES ");
      SQL.append("from ");
      SQL.append("  IMP_ECO_BEN A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(v_CODIMPECO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCRIZIONE = QV.Get("IMPECOBENDES", IDVariant.STRING) ;
      }
      QV.Close();
      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), v_CODIMPECO), (new IDVariant(" - "))), v_DESCRIZIONE)); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "VediClasseContabile", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Economica
  // **********************************************************************
  public int Visibilit‡Economica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Economica Body
      // Procedure Body
      // 
      if (RILEVAECOACC.equals((new IDVariant("SI")), true))
      {
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        VISIFATTECOM = (new IDVariant(0));
        VISIBICENTRO = (new IDVariant(0));
      }
      else
      {
        if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0 && ((MainFrm.MODAIMPUENTR.equals((new IDVariant("FA")), true) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_NUMERO_DOC, 0)) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_ANNO_DOC, 0))) || MainFrm.MODAIMPUENTR.equals((new IDVariant("LI")), true)))
        {
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            VISIBICENTRO = (new IDVariant(-1));
          }
          else
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            VISIBICENTRO = (new IDVariant(0));
          }
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          VISIFATTECOM = (new IDVariant(-1));
        }
        else
        {
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          VISIFATTECOM = (new IDVariant(0));
          VISIBICENTRO = (new IDVariant(0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "Visibilit‡Economica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Mandato Informatico
  // **********************************************************************
  public int VisibilitaMandatoInformatico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Mandato Informatico Body
      // Procedure Body
      // 
      // 
      // Visibilit‡ Mandato Informatico
      // 
      {
        if (LICENZAMIF.booleanValue())
        {
          if (MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true))
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          PAN_DETTAGLI.SetFlags (Glb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "VisibilitaMandatoInformatico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Voce Peg
  // **********************************************************************
  public int Visibilit‡VocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Voce Peg Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "Visibilit‡VocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Info Ord
  // **********************************************************************
  public int VisibilitaInfoOrd ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Info Ord Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ACC, 0))))
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ARTICOLO, 0))))
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVO.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "VisibilitaInfoOrd", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Info Dett
  // **********************************************************************
  public int VisibilitaInfoDett ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Info Dett Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_OPERA, 0))))
      {
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGLI.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "VisibilitaInfoDett", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Mandati Collegati per Compensazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int MandatiCollegatiperCompensazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati Collegati per Compensazione Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ORD, 0));
      IMDB.set_Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ORD, 0));
      IMDB.set_Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_PSOLAINFO, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_MANCOLPERCOM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "MandatiCollegatiperCompensazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tooltip
  // **********************************************************************
  public int SettaTooltip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tooltip Body
      // Procedure Body
      // 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_CAPITOLO1,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_CAPITOLO1))).stringValue()); 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_ARTICOLO1,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_ARTICOLO1))).stringValue()); 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_VOCIECONDESC,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_VOCIECONDESC))).stringValue()); 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_ACCDESCRIZIO,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_ACCDESCRIZIO))).stringValue()); 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_UFFICIO,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_UFFICIO))).stringValue()); 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_TIPOVINCOLO1,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_TIPOVINCOLO1))).stringValue()); 
      PAN_ORDINATIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINATIVO_BOLLO1,(new IDVariant(PAN_ORDINATIVO.FieldText(PFL_ORDINATIVO_BOLLO1))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_CAUSALE,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_CAUSALE))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_OPERA,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_OPERA))).stringValue()); 
      PAN_DETTAGLI.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLI_SPESE,(new IDVariant(PAN_DETTAGLI.FieldText(PFL_DETTAGLI_SPESE))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "SettaTooltip", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Parametri Ordinativi Old
  // **********************************************************************
  public int SettaParametriOrdinativiOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Parametri Ordinativi Old Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "SettaParametriOrdinativiOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Parametri Dettagli Old
  // **********************************************************************
  public int SettaParametriDettagliOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Parametri Dettagli Old Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "SettaParametriDettagliOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Parametri Ordinativi
  // **********************************************************************
  public int AnnullaParametriOrdinativi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Parametri Ordinativi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGTIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOIN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOTE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGCAT, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "AnnullaParametriOrdinativi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Parametri Dettagli
  // **********************************************************************
  public int AnnullaParametriDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Parametri Dettagli Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "AnnullaParametriDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Cap
  // **********************************************************************
  public int SettaValoriCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CATEGORIA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODINTERVENT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODTERZI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Cap Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TITOLO as CAPTITOLO, ");
      SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
      SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  A.COD_TERZI as CAPCODTERZI ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
        v_CATEGORIA = QV.Get("CAPCATEGORIA", IDVariant.INTEGER) ;
        v_CODINTERVENT = QV.Get("CAPCODINTERV", IDVariant.INTEGER) ;
        v_CODTERZI = QV.Get("CAPCODTERZI", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGTIT, 0, new IDVariant(v_TITOLO));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPEGCAT, 0, new IDVariant(v_CATEGORIA));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOIN, 0, new IDVariant(v_CODINTERVENT));
      IMDB.set_Value(IMDBDef1.TBL_PARAMVOCEPE3, IMDBDef1.FLD_PARAMVOCEPE3_PARVOCPECOTE, 0, new IDVariant(v_CODTERZI));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "SettaValoriCap", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Acc Body
      // Procedure Body
      // 
      DEBITOREACC = (new IDVariant());
      DESCRIZIOACC = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DEBITORE as ACCDEBITORE, ");
      SQL.append("  A.DESCRIZIONE as ACCDESCRIZIO, ");
      SQL.append("  A.CODICE_GESTIONALE as ACCCODICGEST, ");
      SQL.append("  A.FATTORE as ACCFATTORE, ");
      SQL.append("  A.CENTRO as ACCCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as ACCCOMPETDAL, ");
      SQL.append("  A.COMPETENZA_AL as ACCCOMPETEAL, ");
      SQL.append("  A.RILEVANTE_ECO as ACCRILEVAECO ");
      SQL.append("from ");
      SQL.append("  ACC A ");
      SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        DEBITOREACC = QV.Get("ACCDEBITORE", IDVariant.FLOAT) ;
        DESCRIZIOACC = QV.Get("ACCDESCRIZIO", IDVariant.STRING) ;
        CGEACC = QV.Get("ACCCODICGEST", IDVariant.INTEGER) ;
        FATTOREACC = QV.Get("ACCFATTORE", IDVariant.STRING) ;
        CENTROACC = QV.Get("ACCCENTRO", IDVariant.STRING) ;
        COMPDALACC = QV.Get("ACCCOMPETDAL", IDVariant.DATETIME) ;
        COMPALACC = QV.Get("ACCCOMPETEAL", IDVariant.DATETIME) ;
        RILEVAECOACC = QV.Get("ACCRILEVAECO", IDVariant.STRING) ;
      }
      QV.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "ProponiDaAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importo
  // **********************************************************************
  public int SettaImporto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_HEADER = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_HEADER = (new IDVariant("Importo: ", IDVariant.STRING));
      // 
      // Setta Importo Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_DETTAGLI.GetNumRows())).compareTo((new IDVariant(0)), true)<0)
      {
        IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(A.IMPORTO) as SUMPREIMPORT ");
        SQL.append("from ");
        SQL.append("  PRE A ");
        SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTO = QV.Get("SUMPREIMPORT", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef1.TBL_IMPORTO4, IMDBDef1.FLD_IMPORTO4_IMPORTO, 0, IDL.NullValue(v_IMPORTO,(new IDVariant(0))));
      }
      else
      {
        if (!(PAN_DETTAGLI.IsNewRow()))
        {
          IMDB.set_Value(IMDBDef1.TBL_IMPORTO4, IMDBDef1.FLD_IMPORTO4_IMPORTO, 0, IDL.NullValue(PAN_DETTAGLI.GetFieldSum(PFL_DETTAGLI_IMPORTO2),(new IDVariant(0))));
        }
        else
        {
          IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(A.IMPORTO) as SUMPREIMPORT ");
          SQL.append("from ");
          SQL.append("  PRE A ");
          SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTO = QV.Get("SUMPREIMPORT", IDVariant.DECIMAL) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef1.TBL_IMPORTO4, IMDBDef1.FLD_IMPORTO4_IMPORTO, 0, IDL.Add(IDL.NullValue(v_IMPORTO,(new IDVariant(0))), IMDB.Value(IMDBDef8.PQRY_PRE4, IMDBDef8.PQSL_PRE4_IMPORTO, 0)));
        }
      }
      PAN_IMPORTO.set_FieldText(PFL_IMPORTO_IMPORTOLABEL, IDL.Add(v_HEADER, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_IMPORTO4, IMDBDef1.FLD_IMPORTO4_IMPORTO, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "SettaImporto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Importo Old
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant ImportoOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Importo Old Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(A.IMPORTO) as SUMPREIMPORT ");
      SQL.append("from ");
      SQL.append("  PRE A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPORTO = QV.Get("SUMPREIMPORT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      return IDL.NullValue(v_IMPORTO,(new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "ImportoOld", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Apri Incassi
  // **********************************************************************
  public int ApriIncassi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Incassi Body
      // Procedure Body
      // 
      if (FASEESERCIZI.equals((new IDVariant(0)), true) || FASEESERCIZI.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non Ammessa per l'Esercizio Finanziario!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMANNOORD, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_ANNO_ORD, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMNUMEORD, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_NUMERO_ORD, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMDATAORD, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_D_DATA_ORD, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMIMPOORD, 0, IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_IMPORTO, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMINFO, 0, (new IDVariant("SI")));
        MainFrm.Show(MyGlb.FRM_INCASSI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOrdinativo", "ApriIncassi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Debitore
  // Primary record source for panel data
  // **********************************************************************
  private void INFOORDINATI_DEBITORE2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_DEBITORE2_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_DEBITORE1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_DEBITORE1, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_DEBITORE2_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_DEBITORE2_RS, 0, IMDBDef1.TBL_DEBITORE1, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_DEBITORE2_RS, 0, 0, IMDBDef1.TBL_DEBITORE1, IMDBDef1.FLD_DEBITORE1_DEBIRAGISOCI, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_DEBITORE2_RS, 1, 0, IMDBDef1.TBL_DEBITORE1, IMDBDef1.FLD_DEBITORE1_DEBITOCODICE, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_DEBITORE1, 0);
      if (IMDB.Eof(IMDBDef1.TBL_DEBITORE1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_DEBITORE1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_DEBITORE2_RS, 0);
  }

  // **********************************************************************
  // Importo
  // Primary record source for panel data
  // **********************************************************************
  private void INFOORDINATI_IMPORTO2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_IMPORTO2_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_IMPORTO4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_IMPORTO4, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_IMPORTO2_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_IMPORTO2_RS, 0, IMDBDef1.TBL_IMPORTO4, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_IMPORTO2_RS, 0, 0, IMDBDef1.TBL_IMPORTO4, IMDBDef1.FLD_IMPORTO4_IMPORTO, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_IMPORTO4, 0);
      if (IMDB.Eof(IMDBDef1.TBL_IMPORTO4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_IMPORTO4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_IMPORTO2_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioË quando viene portata in primo piano
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
  private void PAN_IMPORTO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPORTO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPORTO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPORTO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPORTO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPORTO);
    // Stub
  }

  private void PAN_IMPORTO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPORTO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPORTO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPORTO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_TABBEDVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_TABBEDVIEW_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINATIVO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINATIVO, Cancel);
    // Stub
  }

  private void PAN_ORDINATIVO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINATIVO_INFOACC)
    {
      this.IdxPanelActived = this.PAN_ORDINATIVO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINATIVO_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_ORDINATIVO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINATIVO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINATIVO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_D_DATA_ORD, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_D_DATA_ORD, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_E, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ORD8, IMDBDef8.PQSL_ORD8_E, 0, (new IDVariant("E")));
      }
      if (Cancel.isFalse())
      {
        PAN_ORDINATIVO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLI, Cancel);
    // Stub
  }

  private void PAN_DETTAGLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTAGLI_VEDICLASCONT)
    {
      this.IdxPanelActived = this.PAN_DETTAGLI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VediClasseContabile();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGLI_INFOOPERA)
    {
      this.IdxPanelActived = this.PAN_DETTAGLI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTAGLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DEBITORE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DEBITORE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DEBITORE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DEBITORE, Cancel);
    // Stub
  }

  private void PAN_DEBITORE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DEBITORE_INFODEBITORE)
    {
      this.IdxPanelActived = this.PAN_DEBITORE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDebitore();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DEBITORE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DEBITORE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DEBITORE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINATIVO_Init()
  {

    PAN_ORDINATIVO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINATIVO.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, "70EDB785-0F5A-4771-A1D9-64211D767D81");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, "Ordinativo");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_LIST, 280, -9999, 544, 16, 0, 0);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_FORM, 8, 3, 284, 49, 0, 0);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, 0, 59);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, 1, 13);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, 0, 4);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, 1, 4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, "AABA2A8E-9933-4027-871D-BE5F4C0C0EC5");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, "Distinta");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, MyGlb.PANEL_LIST, 864, -9999, 264, 16, 0, 0);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, MyGlb.PANEL_FORM, 296, 3, 284, 49, 0, 0);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, 0, 44);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, 1, 13);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, 0, 4);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, 1, 4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, "44EB93F4-42D6-4DA7-A301-0431807DE585");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, "Accertamento");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, -9999, 356, 16, 0, 0);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, MyGlb.PANEL_FORM, 8, 59, 572, 49, 0, 0);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, 0, 81);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, 1, 13);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, 0, 4);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, 1, 4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, "CF2F001C-9AE3-4261-8522-FFD8A6117B36");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, "Capitolo/Art.");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, MyGlb.PANEL_LIST, 0, -9999, 428, 16, 0, 0);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, MyGlb.PANEL_FORM, 8, 115, 572, 77, 0, 0);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, 0, 73);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, 1, 13);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, 0, 4);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, 1, 4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, "5DFBC724-23DE-43D6-A528-430F29FA93C4");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, "Inserimento");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, MyGlb.PANEL_LIST, 1576, -9999, 168, 16, 0, 0);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, MyGlb.PANEL_FORM, 12, 319, 248, 49, 0, 0);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, 0, 70);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, 1, 13);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, 0, 4);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, 1, 4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, "371B647D-17EC-40BF-BF12-CD2076DE0EEC");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, "Aggiornamento");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, MyGlb.PANEL_LIST, 1744, -9999, 168, 16, 0, 0);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, MyGlb.PANEL_FORM, 328, 319, 240, 49, 0, 0);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, 0, 88);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, 1, 13);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, 0, 4);
    PAN_ORDINATIVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, 1, 4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINATIVO_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINATIVO.SetSize(MyGlb.OBJ_FIELD, 43);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, "F500F101-FBC8-4409-B175-5C84CE466943");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, "Ordinativo");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, "C6DCCFC5-6E89-461B-94B8-89E593E613BF");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, "Del");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, "C7B71373-7D6A-4265-ABE1-BC1F2A5648B7");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, "Distinta");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, "09A56B79-A2BF-42F7-B4F9-4034CE86578D");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, "Del ");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, "6C140D47-59C5-4914-A1FB-C98278666690");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, "Numero");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, "4B96D445-247E-433F-A73C-05121060EACF");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, "/");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, "25E6E575-D40C-4718-BA18-519E78C0EF69");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, "Anno");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, "297DD914-99C5-4691-8A71-D8A579257A97");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, "51202B59-B7B1-4CCD-B315-C6D2918494C8");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, "ACC DESCRIZIONE");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, "41F9560A-B425-4B3C-816B-37B86BE850E3");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINATIVO.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, 0, "info.gif", false);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, "9A3531D2-B96C-4E78-A279-C3E79C45F253");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, "Capitolo");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, "2E6A05F9-E676-4663-A00D-D26EBB8117A2");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, "Articolo");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, "B73296A2-7EB0-4735-B2DA-AAA65E3AB57C");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, "E874E301-A4D7-456D-9C01-5A73CC42D423");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINATIVO.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, 0, "info.gif", false);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, "33AB865D-7600-4F51-9328-4C6217DBD960");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, "CAPITOLO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, "0BF396AD-015A-4058-916C-45831500E32C");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, "/");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, "89E6BD5B-D686-4288-A5AA-81D66CDACB28");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, "ARTICOLO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, "8DBE6CC7-7228-4462-B7D3-BD94C21E86D6");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, "Voce Economica");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, "0312D390-5663-410F-B426-758A8CDDBF15");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, "4E7A0D5E-B0B5-471A-BB34-83DB2EB3F207");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, "Ufficio");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, "7E92DAAD-76F0-4AB6-AD7C-BD4B0C074489");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, "28EB8460-38C9-4AD8-91C6-B67960161C35");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, "Bollo");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, "8EC47248-9CF3-4414-B6A4-950368382585");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, "Utente");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, "EF90DEAC-BF87-48D1-9812-27BC35F39198");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, "Data");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, "5BAE00C3-6113-456F-9C2D-4AE14BC18E5A");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, "Utente");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, "1E7C2A23-405E-48FE-B8D7-4A6515F47C5D");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, "Data");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, "2C70F7DA-DD26-4393-B556-10CACA643EE3");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, "IMPORTO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, "C036AB9A-23A6-4A17-9AE0-895EA000B7A5");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, "ANNO ORD");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, "3D36C684-8E15-4224-AC98-5B80B01A9BE1");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, "ANNO ELENCO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, "716BF053-1327-4AF2-8CE5-466E6F490109");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, "ANNO MAND CO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, "D1F4CD14-1F31-4BB3-A884-3CFCC6094D6E");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, "NUMERO MAND CO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, "E32F2673-A170-4C34-A94A-0175DCAF1F32");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, "CODICE FINANZ");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, "6FA27295-8401-4022-899D-1467670FBED9");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, "DATA ELENCO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, "20CAFD87-CDF9-4DE8-B91E-318349FCA343");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, "E");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, "22550A28-43D2-4E08-94AB-860841D7D819");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, "INCASSATO");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, "DF49BCB1-4624-421C-87F9-FA0DB035138D");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, "ANNO MAND CO INPS");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, "3471AEEA-0337-493F-9392-866B44AB0779");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, "NUMERO MAND CO INPS");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, "67A56331-DA67-4AFF-B9B6-E0B59C8A7781");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, "ANNO MAND CO INAIL");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, "2718D05A-EB7A-494A-BD8E-66E41B706A49");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, "NUMERO MAND CO INAIL");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, "5201F4C1-A53D-49C3-A9E4-06DA8FAF7B7A");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, "ANNO MAND CO ADD REG");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, "BD3988DD-E197-4472-B508-DCA0E1FF077A");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, "NUMERO MAND CO ADD REG");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, "285BD624-CF0B-4C73-BA6C-5A8F63CB284F");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, "ANNO MAND CO ADD COM");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, "343982CF-AEF1-4D2C-9B93-EA1B6FCB536A");
    PAN_ORDINATIVO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, "NUMERO MAND CO ADD COM");
    PAN_ORDINATIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, "");
    PAN_ORDINATIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINATIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDINATIVO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_LIST, 280, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_LIST, 76);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_LIST, "Ordin.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_FORM, 12, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_FORM, 92);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ORDINATIVO, MyGlb.PANEL_FORM, "Ordinativo");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ORDINATIVO, -1, GRP_ORDINATIVO_ORDINATIVO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ORDINATIVO, PPQRY_ORD8, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_LIST, 664, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_LIST, 72);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_LIST, "Del");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_FORM, 180, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_FORM, 28);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL1, MyGlb.PANEL_FORM, "Del");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_DEL1, -1, GRP_ORDINATIVO_ORDINATIVO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_DEL1, PPQRY_ORD8, "A.D_DATA_ORD", "D_DATA_ORD", 6, 19, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_LIST, 864, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_LIST, "Dist.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_FORM, 300, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_FORM, 92);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_DISTINTA, -1, GRP_ORDINATIVO_DISTINTA);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_DISTINTA, PPQRY_ORD8, "A.NUMERO_ELENCO", "NUMERO_ELENCO", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_LIST, 1016, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_LIST, 88);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_LIST, "Del ");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_FORM, 472, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_FORM, 28);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DEL, MyGlb.PANEL_FORM, "Del ");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_DEL, -1, GRP_ORDINATIVO_DISTINTA);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_DEL, PPQRY_ORD8, "A.D_DATA_ELENCO", "D_DATA_ELENCO", 6, 19, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_LIST, 76);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_LIST, "Num.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_FORM, 108, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_FORM, 96);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMERO1, MyGlb.PANEL_FORM, "Numero");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_NUMERO1, -1, GRP_ORDINATIVO_ACCERTAMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_NUMERO1, PPQRY_ORD8, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.PANEL_LIST, 168, 84, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.PANEL_FORM, 152, 84, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRACCELABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_BARRACCELABE, -1, GRP_ORDINATIVO_ACCERTAMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_BARRACCELABE, -1, "", "BARRACCELABE", 0, 0, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_LIST, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_FORM, 168, 84, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_FORM, 36);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNO, -1, GRP_ORDINATIVO_ACCERTAMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNO, PPQRY_ORD8, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.PANEL_LIST, 276, 100, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.PANEL_FORM, 12, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCERTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ACCERTALABEL, -1, GRP_ORDINATIVO_ACCERTAMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ACCERTALABEL, -1, "", "ACCERTALABEL", 0, 0, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_LIST, "ACC DESCRIZIONE");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_FORM, 208, 84, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ACCDESCRIZIO, MyGlb.PANEL_FORM, "ACC DESCR.");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ACCDESCRIZIO, -1, GRP_ORDINATIVO_ACCERTAMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ACCDESCRIZIO, PPQRY_ACC, "A.DESCRIZIONE", "ACCDESCRIZIO", 5, 140, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.PANEL_LIST, 568, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.PANEL_FORM, 560, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_INFOACC, -1, GRP_ORDINATIVO_ACCERTAMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_LIST, 128);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_FORM, 24, 144, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_FORM, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_CAPITOLO1, -1, GRP_ORDINATIVO_CAPITOLOART);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_CAPITOLO1, PPQRY_RISCAPART, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,0)", "DUALDESCCAPI", 5, 99, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_LIST, 128);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_FORM, 24, 168, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_FORM, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ARTICOLO1, -1, GRP_ORDINATIVO_CAPITOLOART);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ARTICOLO1, PPQRY_RISCAPART, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,~~ARTICOLO~~)", "DUALDESCARTI", 5, 99, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.PANEL_LIST, 264, 120, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.PANEL_FORM, 12, 140, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_LABELVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_LABELVOCEPEG, -1, GRP_ORDINATIVO_CAPITOLOART);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_LABELVOCEPEG, -1, "", "LABELVOCEPEG", 0, 0, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.PANEL_LIST, 576, 96, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.PANEL_FORM, 276, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_INFOVOCEPEG, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_LIST, 64, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_LIST, 60);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_FORM, 108, 120, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CAPITOLO2, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_CAPITOLO2, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_CAPITOLO2, PPQRY_ORD8, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.PANEL_LIST, 156, 128, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.PANEL_FORM, 232, 120, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_BARRA, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_LIST, 60);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_LIST, "ART.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_FORM, 252, 120, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ARTICOLO2, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ARTICOLO2, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ARTICOLO2, PPQRY_ORD8, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_LIST, 68);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_LIST, "Vc. Econ.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_FORM, 100);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_VOCEECONOMIC, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_VOCEECONOMIC, PPQRY_ORD8, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_LIST, 176);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_LIST, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_FORM, 172, 196, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_FORM, 176);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_VOCIECONDESC, MyGlb.PANEL_FORM, "VC. ECONOMICHE DESCRIZIONE");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_VOCIECONDESC, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_VOCIECONDESC, PPQRY_RICLASSIFICA, "B.DESCRIZIONE", "RICVOCECODES", 5, 140, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_FORM, 40, 220, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_UFFICIO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_UFFICIO, PPQRY_ORD8, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_LIST, 384, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_LIST, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tp. Vinc.");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_FORM, 8, 244, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_FORM, 96);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_TIPOVINCOLO1, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_TIPOVINCOLO1, PPQRY_ORD8, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_LIST, 424, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_LIST, 40);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_LIST, "Bollo");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_FORM, 24, 268, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_FORM, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_BOLLO1, MyGlb.PANEL_FORM, "Bollo");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_BOLLO1, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_BOLLO1, PPQRY_ORD8, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_LIST, 1576, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_FORM, 16, 344, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_FORM, 52);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_UTENTE1, -1, GRP_ORDINATIVO_INSERIMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_UTENTE1, PPQRY_ORD8, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_LIST, 1648, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_FORM, 144, 344, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_FORM, 44);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_DATA1, -1, GRP_ORDINATIVO_INSERIMENTO);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_DATA1, PPQRY_ORD8, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_LIST, 1744, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_FORM, 332, 344, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_UTENTE, -1, GRP_ORDINATIVO_AGGIORNAMENT);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_UTENTE, PPQRY_ORD8, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_LIST, 1816, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_LIST, 100);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_FORM, 460, 344, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_FORM, 36);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATA2, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_DATA2, -1, GRP_ORDINATIVO_AGGIORNAMENT);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_DATA2, PPQRY_ORD8, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_LIST, 1168, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_FORM, 412, 320, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_IMPORTO1, MyGlb.PANEL_FORM, "IMPORTO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_IMPORTO1, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_IMPORTO1, PPQRY_ORD8, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_LIST, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_FORM, 4, 392, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOORD1, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNOORD1, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNOORD1, PPQRY_ORD8, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_LIST, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_LIST, "ANNO ELENCO");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_FORM, 4, 392, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_FORM, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOELENCO, MyGlb.PANEL_FORM, "ANNO ELENCO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNOELENCO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNOELENCO, PPQRY_ORD8, "A.ANNO_ELENCO", "ANNO_ELENCO", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_LIST, 8, 44, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_LIST, 88);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_LIST, "ANNO MAND CO");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_FORM, 12, 400, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_FORM, 88);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANDCO, MyGlb.PANEL_FORM, "ANN. MAND CO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNOMANDCO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNOMANDCO, PPQRY_ORD8, "A.ANNO_MAND_CO", "ANNO_MAND_CO", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_LIST, 104);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_LIST, "NUMERO MAND CO");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_FORM, 4, 392, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_FORM, 104);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEROMANDCO, MyGlb.PANEL_FORM, "NUM. MAND CO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_NUMEROMANDCO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_NUMEROMANDCO, PPQRY_ORD8, "A.NUMERO_MAND_CO", "NUMERO_MAND_CO", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_LIST, 88);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_LIST, "CODICE FINANZ");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_FORM, 4, 392, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_FORM, 88);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_CODICEFINANZ, MyGlb.PANEL_FORM, "COD. FINANZ");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_CODICEFINANZ, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_CODICEFINANZ, PPQRY_ORD8, "A.CODICE_FINANZ", "CODICE_FINANZ", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_LIST, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_LIST, "DATA ELENCO");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_FORM, 4, 392, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_FORM, 80);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_DATAELENCO, MyGlb.PANEL_FORM, "DATA ELENCO");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_DATAELENCO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_DATAELENCO, PPQRY_ORD8, "A.DATA_ELENCO", "DATA_ELENCO", 1, 7, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_LIST, 16);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_LIST, "E");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_FORM, 4, 392, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_FORM, 16);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_E, MyGlb.PANEL_FORM, "E");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_E, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_E, PPQRY_ORD8, "A.E", "E", 5, 1, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_LIST, 68);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_LIST, "INCASSATO");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_FORM, 4, 392, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_FORM, 68);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_INCASSATO, MyGlb.PANEL_FORM, "INCAS.");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_INCASSATO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_INCASSATO, PPQRY_ORD8, "A.INCASSATO", "INCASSATO", 3, 14, 2, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_LIST, 116);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_LIST, "ANNO MAND CO INPS");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_FORM, 4, 392, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_FORM, 116);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINP, MyGlb.PANEL_FORM, "ANN. MAND CO INPS");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNOMANCOINP, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNOMANCOINP, PPQRY_ORD8, "A.ANNO_MAND_CO_INPS", "ANNO_MAND_CO_INPS", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_LIST, 128);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_LIST, "NUMERO MAND CO INPS");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_FORM, 4, 392, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_FORM, 128);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINP, MyGlb.PANEL_FORM, "NUM. MAND CO INPS");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_NUMEMANCOINP, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_NUMEMANCOINP, PPQRY_ORD8, "A.NUMERO_MAND_CO_INPS", "NUMERO_MAND_CO_INPS", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_LIST, 120);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_LIST, "ANNO MAND CO INAIL");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_FORM, 4, 392, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_FORM, 120);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNOMANCOINA, MyGlb.PANEL_FORM, "ANN. MAND CO INAIL");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNOMANCOINA, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNOMANCOINA, PPQRY_ORD8, "A.ANNO_MAND_CO_INAIL", "ANNO_MAND_CO_INAIL", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_LIST, 132);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_LIST, "NUMERO MAND CO INAIL");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_FORM, 4, 392, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_FORM, 132);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMEMANCOINA, MyGlb.PANEL_FORM, "NUM. MAND CO INAIL");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_NUMEMANCOINA, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_NUMEMANCOINA, PPQRY_ORD8, "A.NUMERO_MAND_CO_INAIL", "NUMERO_MAND_CO_INAIL", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_LIST, 136);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_LIST, "ANNO MAND CO ADD REG");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_FORM, 4, 392, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_FORM, 136);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADRE, MyGlb.PANEL_FORM, "ANN. MND. CO ADD REG");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNMANCOADRE, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNMANCOADRE, PPQRY_ORD8, "A.ANNO_MAND_CO_ADD_REG", "ANNO_MAND_CO_ADD_REG", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_LIST, 148);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_LIST, "NUMERO MAND CO ADD REG");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_FORM, 4, 392, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_FORM, 148);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADRE, MyGlb.PANEL_FORM, "NUM. MAND CO ADD REG");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_NUMMANCOADRE, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_NUMMANCOADRE, PPQRY_ORD8, "A.NUMERO_MAND_CO_ADD_REG", "NUMERO_MAND_CO_ADD_REG", 1, 5, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_LIST, 140);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_LIST, "ANNO MAND CO ADD COM");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_FORM, 4, 392, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_FORM, 140);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_ANNMANCOADCO, MyGlb.PANEL_FORM, "ANN. MAND CO ADD COM");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_ANNMANCOADCO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_ANNMANCOADCO, PPQRY_ORD8, "A.ANNO_MAND_CO_ADD_COM", "ANNO_MAND_CO_ADD_COM", 1, 4, 0, -13997);
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_LIST, 152);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_LIST, "NUMERO MAND CO ADD COM");
    PAN_ORDINATIVO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_FORM, 4, 392, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_FORM, 152);
    PAN_ORDINATIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVO_NUMMANCOADCO, MyGlb.PANEL_FORM, "NUM. MAND CO ADD COM");
    PAN_ORDINATIVO.SetFieldPage(PFL_ORDINATIVO_NUMMANCOADCO, -1, -1);
    PAN_ORDINATIVO.SetFieldPanel(PFL_ORDINATIVO_NUMMANCOADCO, PPQRY_ORD8, "A.NUMERO_MAND_CO_ADD_COM", "NUMERO_MAND_CO_ADD_COM", 1, 5, 0, -13997);
  }

  private void PAN_ORDINATIVO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINATIVO.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,0) as DUALDESCCAPI, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',~~CAPITOLO~~,~~ARTICOLO~~) as DUALDESCARTI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ORDINATIVO.SetQuery(PPQRY_RISCAPART, 0, SQL, -1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_RISCAPART, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINATIVO.SetMasterTable(PPQRY_RISCAPART, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as RICVOCECODES ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI A, ");
    SQL.append("  VOCI_ECONOMICHE B ");
    SQL.append("where (A.VOCE_ECON = ~~VOCE_ECON~~) ");
    SQL.append("and   (B.CODICE = A.VOCE_ECON) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (NVL(A.TITOLO, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPEGTIT~~, -1)) ");
    SQL.append("and   (NVL(A.CATEGORIA, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPEGCAT~~, -1)) ");
    SQL.append("and   (NVL(A.COD_INTERVENTO, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPECOIN~~, -1)) ");
    SQL.append("and   (NVL(A.COD_TERZI, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPECOTE~~, -1)) ");
    PAN_ORDINATIVO.SetQuery(PPQRY_RICLASSIFICA, 0, SQL, -1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_RICLASSIFICA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINATIVO.SetMasterTable(PPQRY_RICLASSIFICA, "RICLASSIFICAZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ACCDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.ANNO_ACC = ~~ANNO_ACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~NUMERO_ACC~~) ");
    PAN_ORDINATIVO.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINATIVO.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINATIVO.SetQuery(PPQRY_T53, 0, SQL, PFL_ORDINATIVO_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINATIVO.SetQuery(PPQRY_T53, 1, SQL, PFL_ORDINATIVO_UFFICIO, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > ~~D_DATA_ORD~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINATIVO.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_ORDINATIVO_TIPOVINCOLO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > ~~D_DATA_ORD~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINATIVO.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_ORDINATIVO_TIPOVINCOLO1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINATIVO.SetQuery(PPQRY_T60, 0, SQL, PFL_ORDINATIVO_BOLLO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINATIVO.SetQuery(PPQRY_T60, 1, SQL, PFL_ORDINATIVO_BOLLO1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_ORDINATIVO.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_ORDINATIVO_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ORDINATIVO.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_ORDINATIVO_UTENTE1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_ORDINATIVO.SetQuery(PPQRY_DUAL, 0, SQL, PFL_ORDINATIVO_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ORDINATIVO.SetQuery(PPQRY_DUAL, 1, SQL, PFL_ORDINATIVO_UTENTE, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINATIVO.SetIMDB(IMDB, "PQRY_ORD8", true);
    PAN_ORDINATIVO.set_SetString(MyGlb.MASTER_ROWNAME, "ORD");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  A.ANNO_MAND_CO as ANNO_MAND_CO, ");
    SQL.append("  A.NUMERO_MAND_CO as NUMERO_MAND_CO, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.CODICE_FINANZ as CODICE_FINANZ, ");
    SQL.append("  A.D_DATA_ORD as D_DATA_ORD, ");
    SQL.append("  A.ANNO_ELENCO as ANNO_ELENCO, ");
    SQL.append("  A.NUMERO_ELENCO as NUMERO_ELENCO, ");
    SQL.append("  A.DATA_ELENCO as DATA_ELENCO, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.D_DATA_ELENCO as D_DATA_ELENCO, ");
    SQL.append("  A.INCASSATO as INCASSATO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.ANNO_MAND_CO_INPS as ANNO_MAND_CO_INPS, ");
    SQL.append("  A.NUMERO_MAND_CO_INPS as NUMERO_MAND_CO_INPS, ");
    SQL.append("  A.ANNO_MAND_CO_INAIL as ANNO_MAND_CO_INAIL, ");
    SQL.append("  A.NUMERO_MAND_CO_INAIL as NUMERO_MAND_CO_INAIL, ");
    SQL.append("  A.ANNO_MAND_CO_ADD_REG as ANNO_MAND_CO_ADD_REG, ");
    SQL.append("  A.NUMERO_MAND_CO_ADD_REG as NUMERO_MAND_CO_ADD_REG, ");
    SQL.append("  A.ANNO_MAND_CO_ADD_COM as ANNO_MAND_CO_ADD_COM, ");
    SQL.append("  A.NUMERO_MAND_CO_ADD_COM as NUMERO_MAND_CO_ADD_COM, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_ORDINATIVO.SetQuery(PPQRY_ORD8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ORD A ");
    PAN_ORDINATIVO.SetQuery(PPQRY_ORD8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = ~~TBL_PARAMETINPU3.PARAMANNOORD~~) ");
    SQL.append("and   (A.NUMERO_ORD = ~~TBL_PARAMETINPU3.PARAMNUMEORD~~) ");
    PAN_ORDINATIVO.SetQuery(PPQRY_ORD8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINATIVO.SetQuery(PPQRY_ORD8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINATIVO.SetQuery(PPQRY_ORD8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINATIVO.SetQuery(PPQRY_ORD8, 5, SQL, -1, "");
    PAN_ORDINATIVO.SetQueryDB(PPQRY_ORD8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINATIVO.SetMasterTable(0, "ORD");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_ORDINATIVO.Status() == 2)
    {
      int oldListQBE = PAN_ORDINATIVO.iUseListQBE;
      PAN_ORDINATIVO.iUseListQBE = 0;
      PAN_ORDINATIVO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINATIVO.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINATIVO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTAGLI_Init()
  {

    PAN_DETTAGLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, "DDF85E1C-3526-4B54-B918-078F6439679E");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, "Contabile Tesoreria");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, MyGlb.PANEL_LIST, 1888, -9999, 200, 16, 0, 0);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, MyGlb.PANEL_FORM, 8, 167, 332, 49, 0, 0);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, 0, 110);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, 1, 13);
    PAN_DETTAGLI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, 0, 4);
    PAN_DETTAGLI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, 1, 4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGLI_CONTABTESORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, "863AB37D-EAA8-4A1A-9C9F-2F2C710B2EE9");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, "Ord. Informatico");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, MyGlb.PANEL_LIST, 2736, -9999, 80, 16, 0, 0);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, MyGlb.PANEL_FORM, 8, 339, 556, 97, 0, 0);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, 0, 93);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, 1, 13);
    PAN_DETTAGLI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, 0, 4);
    PAN_DETTAGLI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, 1, 4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGLI_ORDINFORMATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGLI.SetSize(MyGlb.OBJ_FIELD, 48);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, "71DDD43D-CD52-4940-9DCE-E0505BA5CC47");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, "ANNO PRE");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, "D44A3ACF-2F5A-46CB-8151-8B2940902356");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, "NUMERO PRE");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, "FFD13D42-B992-4DE1-A011-582F1BEDF53F");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, "Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, "229816D5-4F07-4328-B031-DC19BBC5C0A0");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, "Importo");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, "C8D76D21-DC96-4135-B12F-7256DA01A1F6");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, "Documento");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, "108BDB74-EF6F-4D10-B3C1-FFB7B7783684");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, "NUMERO DOC");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, "F1D45F53-EF32-40FC-AF50-9F1463871465");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, "/");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, "94782115-8E46-42FD-A32F-33774ECE1925");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, "ANNO DOC");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, "1633BE97-B6AB-41EA-957C-99811BE51F65");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, "Codice Debitore");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, "F848660E-950A-4D20-B372-EA47ACBFF543");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, "Quietanza");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, "AFB44C66-987E-4A60-98AB-0AFFE89E17BA");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, "89EE308B-DC15-437A-BBCB-14C9FBD5C1B4");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, "Quietanza Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, "09012BD2-8436-4734-99C6-230F90A7166F");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, "Cge");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, "81AA6E00-1292-40D0-98AD-8277B59C1C85");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, "Cge Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, "667C6D8E-5464-4B5C-AD01-8405DC4B48DE");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, "Causale");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, "67606D2F-7AEC-4842-A864-908630B99F3C");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, "Numero");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, "C393A659-5FA8-405A-B5F5-DA5973256B37");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, "Data");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, "AF8CC847-7635-4066-9251-A62031BE23C9");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, "Inc . C.C.P.");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, "831CCF94-799D-4BED-9FF2-3D0AB939327D");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, "Estr. C.C.P.");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, "FDB560EC-D10A-4415-9E37-17FB2BE08EAA");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, "Fattore");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, "A2767BC6-05DD-4674-8F00-2C5C7C4139D7");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, "Fattore Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, "D240F1D7-594D-48AF-AB95-A95764BA7ED1");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, "Centro");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, "26BA27F9-8F29-4592-9DE4-635B5F7F563E");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, "Centro Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, "8CB91999-384B-4C5D-B7FF-28C0F78F0446");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, "Competenza dal");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, "84262FC6-AB5F-402D-8ECD-2BCF7F3F2A23");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, "Al");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, "8F6D5987-473C-413B-99F4-6458A04E0A18");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, "Contropartita Patr.");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, "1B5257A4-AA4E-45B0-9541-E2B372515070");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, "Contropartita Patr Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, "C55BE36C-CBA7-45F0-A72D-6DF52A2A201A");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGLI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, 0, "wsearch1.gif", false);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, "8D22E77A-7293-45F4-B3A1-33EBA4D4666D");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, "Opera");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, "51C882B0-9C6D-47C8-A118-7ECF58687A22");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGLI.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, 0, "info.gif", false);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, "9BC0C431-DC68-435B-A45F-486B726E49E3");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, "Spese");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, "7EF3D83F-9334-4AC9-B5EB-E61CD436A977");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, "Commissioni");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, "7A8C9302-1611-42C1-8DE3-24360CBE07C2");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, "Allegati");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, "D922B1AD-B264-43B1-9036-6999F2AC5275");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, "Info Tesoriere");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, "4C76DC1F-BB47-4EDB-AA2A-891EF6C5DBD4");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, "E815C85E-1612-4F18-9A5C-D45B8E845D1D");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, "20C2196F-9712-4E03-BD79-0363AA2A6F48");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, "1053A2F8-FAF3-4591-9823-D29317C4EE4C");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, "02049CCD-38DC-43F4-9872-06E27D2CCC95");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, "0538A5B9-E511-4F4F-A7CF-CA7F8BBDE8B5");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, "BEN RAGIONE SOCIALE");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, "8FB42588-1861-490E-AEA0-888870089879");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, "FAT ANNO PROG");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, "7288539D-ABB5-41AA-8D3E-94CF6A8A089A");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, "5E22C289-4BAC-47FB-A755-B97B8E03F23A");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, "CAPITOLO");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, 0, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, "5875FDEB-E6DD-472F-A44A-AE7A7BDA629E");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, "ARTICOLO");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, 0, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, "C7D882F0-A647-41CA-A89D-32DB75B5B690");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, "ANNO ACC");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, 0, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, "2737035E-0A9B-4FBB-B325-DEA12D5D5C98");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, "NUMERO ACC");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, 0, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, "97EECDBB-2127-4008-80CD-E7F4D3A4ED15");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, "ANNO ORD");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, 0, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, "28693954-E736-4A9A-AE33-1AC093F7CA6A");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, "NUMERO ORD");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, 0, -1);
  }

  private void PAN_DETTAGLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_LIST, "ANNO PRE");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_FORM, 24, 624, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOPRE, MyGlb.PANEL_FORM, "ANNO PRE");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ANNOPRE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ANNOPRE, PPQRY_PRE4, "A.ANNO_PRE", "ANNO_PRE", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_LIST, "NUM. PRE");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_FORM, 24, 648, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROPRE, MyGlb.PANEL_FORM, "NUM. PRE");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NUMEROPRE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NUMEROPRE, PPQRY_PRE4, "A.NUMERO_PRE", "NUMERO_PRE", 1, 5, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 1344, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, 40, 48, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DESCRIZIONE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DESCRIZIONE, PPQRY_PRE4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_LIST, 368, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_FORM, 608, 8, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO2, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_IMPORTO2, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_IMPORTO2, PPQRY_PRE4, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.PANEL_LIST, 4, 96, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.PANEL_FORM, 44, 72, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DOCUMENLABEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DOCUMENLABEL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_LIST, 552, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_FORM, 124, 72, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NUMERODOC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NUMERODOC, PPQRY_PRE4, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.PANEL_LIST, 224, 92, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.PANEL_FORM, 276, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BARRADOCUMEN, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_BARRADOCUMEN, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_BARRADOCUMEN, -1, "", "BARRADOCUMEN", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_LIST, 512, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_FORM, 296, 72, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ANNODOC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ANNODOC, PPQRY_PRE4, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_LIST, 456, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_FORM, 92, 744, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODICEDEBIT1, MyGlb.PANEL_FORM, "Cod. Deb.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CODICEDEBIT1, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CODICEDEBIT1, PPQRY_PRE4, "A.DEBITORE", "DEBITORE", 2, 15, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.PANEL_LIST, 12, 104, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.PANEL_FORM, 48, 96, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETANLABEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_QUIETANLABEL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_QUIETANLABEL, -1, "", "QUIETANLABEL", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_LIST, 1280, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM Q.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_FORM, 124, 96, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM Q.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NUMQUIETANZA, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NUMQUIETANZA, PPQRY_PRE4, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_LIST, "Quietanza Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_FORM, 172, 96, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_QUIETADESCRI, MyGlb.PANEL_FORM, "Quiet. Descr.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_QUIETADESCRI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_QUIETADESCRI, PPQRY_QUIETANZE, "B.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_LIST, 2816, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_LIST, "Cge");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_FORM, 88, 120, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_FORM, 32);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGE, MyGlb.PANEL_FORM, "Cge");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CGE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CGE, PPQRY_PRE4, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_LIST, 180);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_LIST, "Cge Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_FORM, 172, 120, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_FORM, 180);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGEDESCRIZIO, MyGlb.PANEL_FORM, "Cge Descrizione");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CGEDESCRIZIO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CGEDESCRIZIO, PPQRY_CGE, "B.DESCRIZIONE", "RICGESCOGEDE", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_LIST, 648, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_FORM, 56, 144, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CAUSALE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CAUSALE, PPQRY_PRE4, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_LIST, 1888, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_FORM, 12, 192, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_FORM, 108);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NUMERO, -1, GRP_DETTAGLI_CONTABTESORE);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NUMERO, PPQRY_PRE4, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_LIST, 1976, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_LIST, 96);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_FORM, 216, 192, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_FORM, 36);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DATA, -1, GRP_DETTAGLI_CONTABTESORE);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DATA, PPQRY_PRE4, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_LIST, 1792, 36, 24, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_LIST, 20);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_LIST, "I. C C P");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_FORM, 384, 168, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_FORM, 20);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INCCCP, MyGlb.PANEL_FORM, "Inc . C.C.P.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_INCCCP, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_INCCCP, PPQRY_PRE4, "A.D_DATA_CCP", "D_DATA_CCP", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_LIST, 1696, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_LIST, 20);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_LIST, "E. C C P");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_FORM, 484, 168, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_FORM, 20);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ESTRCCP, MyGlb.PANEL_FORM, "Estr. C.C.P.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ESTRCCP, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ESTRCCP, PPQRY_PRE4, "A.D_DATA_ESTRATTO_CCP", "D_DATA_ESTRATTO_CCP", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, 2200, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, 68, 220, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_FATTORE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_FATTORE, PPQRY_PRE4, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, "Fattore Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, 252, 220, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, "Fattore Descrizione");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_FATTORDESCRI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, 2128, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, 72, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CENTRO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CENTRO, PPQRY_PRE4, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_LIST, 116);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_LIST, "Centro Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_FORM, 252, 244, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_FORM, 116);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRODESCRI, MyGlb.PANEL_FORM, "Centro Descrizione");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CENTRODESCRI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CENTRODESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_LIST, 2272, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_FORM, 20, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_COMPETENZDAL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_COMPETENZDAL, PPQRY_PRE4, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, 2368, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, 228, 268, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, 20);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_AL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_AL, PPQRY_PRE4, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_LIST, 2464, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_LIST, "Controp. Patr");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_FORM, 4, 292, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CONTROPAPATR, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CONTROPAPATR, PPQRY_PRE4, "A.COD_IMP_ECO", "COD_IMP_ECO", 5, 16, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_LIST, 124);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_LIST, "Contropartita Patr Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_FORM, 196, 292, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_FORM, 124);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CONTPATRDESC, MyGlb.PANEL_FORM, "Controp. Ptr. Descr.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CONTPATRDESC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CONTPATRDESC, PPQRY_CONTROPAPATR, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.PANEL_LIST, 320, 104, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.PANEL_FORM, 568, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VEDICLASCONT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_VEDICLASCONT, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_VEDICLASCONT, -1, "", "VEDICLASCONT", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_LIST, 2696, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_FORM, 76, 316, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_OPERA, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_OPERA, PPQRY_PRE4, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.PANEL_LIST, 588, 344, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.PANEL_FORM, 568, 320, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOOPERA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_INFOOPERA, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_INFOOPERA, -1, "", "INFOOPERA", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_LIST, 2736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_FORM, 76, 364, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_SPESE, -1, GRP_DETTAGLI_ORDINFORMATI);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_SPESE, PPQRY_PRE4, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_LIST, 2776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_LIST, "Cmm.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_FORM, 380, 364, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_COMMISSIONI, -1, GRP_DETTAGLI_ORDINFORMATI);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_COMMISSIONI, PPQRY_PRE4, "A.COMMISSIONI", "COMMISSIONI", 1, 1, 0, -13997);
    PAN_DETTAGLI.SetValueListItem(PFL_DETTAGLI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_DETTAGLI.SetValueListItem(PFL_DETTAGLI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_DETTAGLI.SetValueListItem(PFL_DETTAGLI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_DETTAGLI.SetValueListItem(PFL_DETTAGLI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_LIST, 4, 1368, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_LIST, 104);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_FORM, 68, 388, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ALLEGATI, -1, GRP_DETTAGLI_ORDINFORMATI);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ALLEGATI, PPQRY_PRE4, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_LIST, 4, 1392, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_LIST, 104);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_FORM, 12, 412, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_FORM, 108);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_INFOTESORIER, -1, GRP_DETTAGLI_ORDINFORMATI);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_INFOTESORIER, PPQRY_PRE4, "A.INFO_TESORIERE", "INFO_TESORIERE", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_LIST, 2856, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 1312, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_UTENTEINSERI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_UTENTEINSERI, PPQRY_PRE4, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_LIST, 2928, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 1336, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DATAINSERIME, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DATAINSERIME, PPQRY_PRE4, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_LIST, 3024, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 1360, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_UTENTULTIAGG, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_UTENTULTIAGG, PPQRY_PRE4, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_LIST, 3096, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 1384, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DATAULTIMAGG, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DATAULTIMAGG, PPQRY_PRE4, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.PANEL_LIST, 0, 4, 604, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.PANEL_LIST, 5);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.PANEL_FORM, 52, 4, 556, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DEBITORLABEL, MyGlb.PANEL_FORM, 3);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DEBITORLABEL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DEBITORLABEL, -1, "", "DEBITORLABEL", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_LIST, 124);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_LIST, "BEN RAGIONE SOCIALE");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_FORM, 4, 768, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_FORM, 124);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_BENRAGIOSOCI, MyGlb.PANEL_FORM, "BEN RAG. SOCIALE");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_BENRAGIOSOCI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_BENRAGIOSOCI, PPQRY_DEBITORE, "A.RAGIONE_SOCIALE_ESTESA", "DEBERASOESES", 5, 60, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_FORM, 4, 468, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANN. PROG");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_FATANNOPROG, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_FATANNOPROG, PPQRY_PRE4, "A.FAT_ANNO_PROG", "FAT_ANNO_PROG", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_LIST, 104);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 468, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_FORM, 104);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUM. PROG");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_FATNUMERPROG, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_FATNUMERPROG, PPQRY_PRE4, "A.FAT_NUMERO_PROG", "FAT_NUMERO_PROG", 1, 5, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_FORM, 12, 452, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CAPITOLO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CAPITOLO, PPQRY_PRE4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_FORM, 4, 444, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ARTICOLO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ARTICOLO, PPQRY_PRE4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_FORM, 4, 444, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ANNOACC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ANNOACC, PPQRY_PRE4, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_LIST, "NUMERO ACC");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_FORM, 4, 444, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NUMEROACC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NUMEROACC, PPQRY_PRE4, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_FORM, 4, 432, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ANNOORD, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ANNOORD, PPQRY_PRE4, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_LIST, "NUMERO ORD");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_FORM, 4, 432, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NUMEROORD, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NUMEROORD, PPQRY_PRE4, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
  }

  private void PAN_DETTAGLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLI.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.CODICE = ~~DEBITORE~~) ");
    SQL.append("and   (A.NUM_QUIETANZA = ~~NUM_QUIETANZA~~) ");
    SQL.append("and   (A.TIPO_QUIETANZA = B.CODICE(+)) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > ~~PQRY_ORD8.D_DATA_ORD~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_QUIETANZE, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_QUIETANZE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_QUIETANZE, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as RICGESCOGEDE ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST A, ");
    SQL.append("  CODICI_GESTIONALI B, ");
    SQL.append("  RICLASSIFICAZIONI C ");
    SQL.append("where (B.CODICE = ~~CODICE_GESTIONALE~~) ");
    SQL.append("and   (B.CODICE = A.CODICE_GESTIONALE) ");
    SQL.append("and   (A.PROGR_RICLASSIFICAZIONI = C.PROGRESSIVO) ");
    SQL.append("and   (B.E_S = C.E_S) ");
    SQL.append("and   (A.E_S = C.E_S) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (C.TITOLO = ~~TBL_PARAMVOCEPE3.PARVOCPEGTIT~~) ");
    SQL.append("and   (NVL(C.CATEGORIA, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPEGCAT~~, -1)) ");
    SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPECOIN~~, -1)) ");
    SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(~~TBL_PARAMVOCEPE3.PARVOCPECOTE~~, -1)) ");
    SQL.append("and   (C.VOCE_ECON = ~~PQRY_ORD8.VOCE_ECON~~) ");
    SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_CGE, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_CGE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_CGE, "RICLASSIFICAZIONI_GEST");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~PQRY_ORD8.D_DATA_ORD~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~PQRY_ORD8.D_DATA_ORD~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~COD_IMP_ECO~~) ");
    SQL.append("and   ((A.TIPO = 'A' OR A.TIPO = 'P')) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~PQRY_ORD8.D_DATA_ORD~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_CONTROPAPATR, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_CONTROPAPATR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_CONTROPAPATR, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as DEBERASOESES ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~DEBITORE~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_DEBITORE, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_DEBITORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_DEBITORE, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGLI.SetQuery(PPQRY_T58, 0, SQL, PFL_DETTAGLI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGLI.SetQuery(PPQRY_T58, 1, SQL, PFL_DETTAGLI_CAUSALE, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.OPERA as ACCOPEOPERA, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || C.DESCRIZIONE as ACCOPEDESCRI ");
    SQL.append("from ");
    SQL.append("  ACC_OPE A, ");
    SQL.append("  ESEA_OPE B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.OPERA = ~~OPERA~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~PQRY_ORD8.NUMERO_ACC~~) ");
    SQL.append("and   (A.ANNO_ACC = ~~PQRY_ORD8.ANNO_ACC~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (B.OPERA = A.OPERA) ");
    SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
    SQL.append("and   ((B.SALDO_INI + B.VARIAZIONI + B.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (C.CODICE(+) = A.OPERA) ");
    PAN_DETTAGLI.SetQuery(PPQRY_ACCOPE, 0, SQL, PFL_DETTAGLI_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.OPERA as ACCOPEOPERA, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || C.DESCRIZIONE as ACCOPEDESCRI ");
    SQL.append("from ");
    SQL.append("  ACC_OPE A, ");
    SQL.append("  ESEA_OPE B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.NUMERO_ACC = ~~PQRY_ORD8.NUMERO_ACC~~) ");
    SQL.append("and   (A.ANNO_ACC = ~~PQRY_ORD8.ANNO_ACC~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (B.OPERA = A.OPERA) ");
    SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
    SQL.append("and   ((B.SALDO_INI + B.VARIAZIONI + B.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (C.CODICE(+) = A.OPERA) ");
    PAN_DETTAGLI.SetQuery(PPQRY_ACCOPE, 1, SQL, PFL_DETTAGLI_OPERA, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_ACCOPE, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGLI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_DETTAGLI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGLI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_DETTAGLI_SPESE, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetIMDB(IMDB, "PQRY_PRE4", true);
    PAN_DETTAGLI.set_SetString(MyGlb.MASTER_ROWNAME, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE as NUMERO_PRE, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.NUMERO_INC as NUMERO_INC, ");
    SQL.append("  A.DATA_INC as DATA_INC, ");
    SQL.append("  A.IMPORTO_INC as IMPORTO_INC, ");
    SQL.append("  A.DATA_ESTRATTO_CCP as DATA_ESTRATTO_CCP, ");
    SQL.append("  A.DATA_CCP as DATA_CCP, ");
    SQL.append("  A.CODICE_FINANZ as CODICE_FINANZ, ");
    SQL.append("  A.CODICE_PTC as CODICE_PTC, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
    SQL.append("  A.D_DATA_INC as D_DATA_INC, ");
    SQL.append("  A.D_DATA_ESTRATTO_CCP as D_DATA_ESTRATTO_CCP, ");
    SQL.append("  A.D_DATA_CCP as D_DATA_CCP, ");
    SQL.append("  A.NUMERO_CONTABILE as NUMERO_CONTABILE, ");
    SQL.append("  A.DATA_CONTABILE as DATA_CONTABILE, ");
    SQL.append("  A.PROGRESSIVO_TESO as PROGRESSIVO_TESO, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.COD_IMP_ECO as COD_IMP_ECO, ");
    SQL.append("  A.PROGRESSIVO_CFA as PROGRESSIVO_CFA, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.TIPO_DISTINTA as TIPO_DISTINTA, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.SPESE as SPESE, ");
    SQL.append("  A.COMMISSIONI as COMMISSIONI, ");
    SQL.append("  A.ALLEGATI as ALLEGATI, ");
    SQL.append("  A.INFO_TESORIERE as INFO_TESORIERE, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_DETTAGLI.SetQuery(PPQRY_PRE4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PRE A ");
    PAN_DETTAGLI.SetQuery(PPQRY_PRE4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = ~~PQRY_ORD8.ANNO_ORD~~) ");
    SQL.append("and   (A.NUMERO_ORD = ~~PQRY_ORD8.NUMERO_ORD~~) ");
    PAN_DETTAGLI.SetQuery(PPQRY_PRE4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLI.SetQuery(PPQRY_PRE4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLI.SetQuery(PPQRY_PRE4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DEBITORE, ");
    SQL.append("  A.NUM_QUIETANZA ");
    PAN_DETTAGLI.SetQuery(PPQRY_PRE4, 5, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_PRE4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(0, "PRE");
    PAN_DETTAGLI.AddToSortList(PFL_DETTAGLI_CODICEDEBIT1, true);
    PAN_DETTAGLI.AddToSortList(PFL_DETTAGLI_NUMQUIETANZA, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_DETTAGLI.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLI.iUseListQBE;
      PAN_DETTAGLI.iUseListQBE = 0;
      PAN_DETTAGLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLI.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DEBITORE_Init()
  {

    PAN_DEBITORE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DEBITORE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DEBITORE.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_DEBITORE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, "83FF5601-E32C-4222-82FC-2080E2894E2C");
    PAN_DEBITORE.set_Header(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, "");
    PAN_DEBITORE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.VIS_STATICBUTTON);
    PAN_DEBITORE.SetImage(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, 0, "info.gif", false);
    PAN_DEBITORE.SetFlags(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DEBITORE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, "DFFD4B63-D50A-403B-99B8-22E16FF8FD63");
    PAN_DEBITORE.set_Header(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, "Debitore");
    PAN_DEBITORE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, "Debitore");
    PAN_DEBITORE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DEBITORE.SetFlags(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DEBITORE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, "2D867007-D42F-4FFE-B657-9DBBEEE7A5FE");
    PAN_DEBITORE.set_Header(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, "Codice Debitore");
    PAN_DEBITORE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, "");
    PAN_DEBITORE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_DEBITORE.SetFlags(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DEBITORE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.PANEL_LIST, 588, 60, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.PANEL_LIST, 0);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.PANEL_FORM, 511, 5, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.PANEL_FORM, 0);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_INFODEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DEBITORE.SetFieldPage(PFL_DEBITORE_INFODEBITORE, -1, -1);
    PAN_DEBITORE.SetFieldPanel(PFL_DEBITORE_INFODEBITORE, -1, "", "INFODEBITORE", 0, 0, 0, -13997);
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, 84);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DEBITORE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, 0, 0, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, 64);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DEBITORE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DEBITORE.SetFieldPage(PFL_DEBITORE_DEBITORE, -1, -1);
    PAN_DEBITORE.SetFieldPanel(PFL_DEBITORE_DEBITORE, PPQRY_DEBITORE2, "A.DEBIRAGISOCI", "DEBIRAGISOCI", 5, 60, 0, -13997);
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_DEBITORE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_FORM, 448, 0, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_DEBITORE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEBITORE_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_DEBITORE.SetFieldPage(PFL_DEBITORE_CODICEDEBITO, -1, -1);
    PAN_DEBITORE.SetFieldPanel(PFL_DEBITORE_CODICEDEBITO, PPQRY_DEBITORE2, "A.DEBITOCODICE", "DEBITOCODICE", 1, 10, 0, -13997);
  }

  private void PAN_DEBITORE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DEBITORE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DEBITORE.SetIMDB(IMDB, "PQRY_DEBITORE2", true);
    PAN_DEBITORE.set_SetString(MyGlb.MASTER_ROWNAME, "Debitore");
    PAN_DEBITORE.SetQueryIMDB(PPQRY_DEBITORE2, IMDBDef8.PQRY_DEBITORE2_RS, IMDBDef1.TBL_DEBITORE1);
    JustLoaded = true;
    PAN_DEBITORE.SetFieldPrimaryIndex(PFL_DEBITORE_DEBITORE, IMDBDef1.FLD_DEBITORE1_DEBIRAGISOCI);
    PAN_DEBITORE.SetFieldPrimaryIndex(PFL_DEBITORE_CODICEDEBITO, IMDBDef1.FLD_DEBITORE1_DEBITOCODICE);
    PAN_DEBITORE.SetMasterTable(0, "DEBITORE1");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_DEBITORE.Status() == 2)
    {
      int oldListQBE = PAN_DEBITORE.iUseListQBE;
      PAN_DEBITORE.iUseListQBE = 0;
      PAN_DEBITORE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DEBITORE.PanelCommand(Glb.PCM_FIND);
      PAN_DEBITORE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IMPORTO_Init()
  {

    PAN_IMPORTO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPORTO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPORTO.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_IMPORTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, "F6AFC4DE-CA3E-467D-B4E8-2B8CF34B8255");
    PAN_IMPORTO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, "Importo");
    PAN_IMPORTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, "");
    PAN_IMPORTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, "8A27C57B-5411-4611-AFDF-A3F85618F84E");
    PAN_IMPORTO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, "Importo");
    PAN_IMPORTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.VIS_ETICGRASRIGH);
    PAN_IMPORTO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_IMPORTO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPORTO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_IMPORTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPORTO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_FORM, 60);
    PAN_IMPORTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_IMPORTO.SetFieldPage(PFL_IMPORTO_IMPORTO, -1, -1);
    PAN_IMPORTO.SetFieldPanel(PFL_IMPORTO_IMPORTO, PPQRY_IMPORTO2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_IMPORTO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.PANEL_LIST, 496, 8, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.PANEL_FORM, 512, 4, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_IMPORTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTO_IMPORTOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTO.SetFieldPage(PFL_IMPORTO_IMPORTOLABEL, -1, -1);
    PAN_IMPORTO.SetFieldPanel(PFL_IMPORTO_IMPORTOLABEL, -1, "", "IMPORTOLABEL", 0, 0, 0, -13997);
  }

  private void PAN_IMPORTO_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPORTO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPORTO.SetIMDB(IMDB, "PQRY_IMPORTO2", true);
    PAN_IMPORTO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_IMPORTO.SetQueryIMDB(PPQRY_IMPORTO2, IMDBDef8.PQRY_IMPORTO2_RS, IMDBDef1.TBL_IMPORTO4);
    JustLoaded = true;
    PAN_IMPORTO.SetFieldPrimaryIndex(PFL_IMPORTO_IMPORTO, IMDBDef1.FLD_IMPORTO4_IMPORTO);
    PAN_IMPORTO.SetMasterTable(0, "IMPORTO4");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_IMPORTO.Status() == 2)
    {
      int oldListQBE = PAN_IMPORTO.iUseListQBE;
      PAN_IMPORTO.iUseListQBE = 0;
      PAN_IMPORTO.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPORTO.PanelCommand(Glb.PCM_FIND);
      PAN_IMPORTO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINATIVO) PAN_ORDINATIVO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPORTO) PAN_IMPORTO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINATIVO) PAN_ORDINATIVO_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_ValidateRow(Cancel);
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPORTO) PAN_IMPORTO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINATIVO) PAN_ORDINATIVO_DynamicProperties();
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_DynamicProperties();
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_DynamicProperties();
    if (SrcObj == PAN_IMPORTO) PAN_IMPORTO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINATIVO) PAN_ORDINATIVO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPORTO) PAN_IMPORTO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_OnChangeRow();
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
    if (SrcObj == PAN_ORDINATIVO) PAN_ORDINATIVO_AfterFind(CmdFind);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ORDINATIVO) PAN_ORDINATIVO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IMPORTO) PAN_IMPORTO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABBEDVIEW) TAB_TABBEDVIEW_Click(PreviousPage, Cancel);
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
