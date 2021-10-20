// **********************************************
// Info Accertamenti Form
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoAccertamentiForm extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRVARI_IMPORTATTUAL = 0;
  private static int PFL_PARAMETRVARI_VISUALIMPORT = 1;

  private static int PPQRY_IMPORTTOTAL5 = 0;


  IDPanel PAN_PARAMETRVARI;
  private static int PAG_ACCERTAMENTO_ESTREMI = 0;
  private static int PAG_ACCERTAMENTO_ALTRIDATI = 1;

  private static int GRP_ACCERTAMENTO_PROVVEDIMENT = 0;
  private static int GRP_ACCERTAMENTO_VOCEPEG = 1;
  private static int GRP_ACCERTAMENTO_ACCEESERPREC = 2;
  private static int GRP_ACCERTAMENTO_INSERIMENTO = 3;
  private static int GRP_ACCERTAMENTO_AGGIORNAMENT = 4;

  private static int PFL_ACCERTAMENTO_DELIBERA1 = 0;
  private static int PFL_ACCERTAMENTO_NUMERODEL1 = 1;
  private static int PFL_ACCERTAMENTO_ANNODEL1 = 2;
  private static int PFL_ACCERTAMENTO_PROPOSTA1 = 3;
  private static int PFL_ACCERTAMENTO_NUMEROPROPO1 = 4;
  private static int PFL_ACCERTAMENTO_ANNOPROPOST1 = 5;
  private static int PFL_ACCERTAMENTO_TRATTINO4 = 6;
  private static int PFL_ACCERTAMENTO_SLASH = 7;
  private static int PFL_ACCERTAMENTO_SLASH1 = 8;
  private static int PFL_ACCERTAMENTO_TRATTINO3 = 9;
  private static int PFL_ACCERTAMENTO_INFODELIBERE = 10;
  private static int PFL_ACCERTAMENTO_INFOPROPOSTE = 11;
  private static int PFL_ACCERTAMENTO_SPAZIO2 = 12;
  private static int PFL_ACCERTAMENTO_SPAZIO1 = 13;
  private static int PFL_ACCERTAMENTO_ANNOINTROD1 = 14;
  private static int PFL_ACCERTAMENTO_CAPITOLO1 = 15;
  private static int PFL_ACCERTAMENTO_ARTICOLO1 = 16;
  private static int PFL_ACCERTAMENTO_SPAZIO = 17;
  private static int PFL_ACCERTAMENTO_ANNOACC1 = 18;
  private static int PFL_ACCERTAMENTO_NUMEROACC1 = 19;
  private static int PFL_ACCERTAMENTO_CAPITOLO = 20;
  private static int PFL_ACCERTAMENTO_ARTICOLO2 = 21;
  private static int PFL_ACCERTAMENTO_DESCRIZIONE1 = 22;
  private static int PFL_ACCERTAMENTO_CODICEDEBITO = 23;
  private static int PFL_ACCERTAMENTO_VOCEECON = 24;
  private static int PFL_ACCERTAMENTO_VOCEECONDESC = 25;
  private static int PFL_ACCERTAMENTO_CGE = 26;
  private static int PFL_ACCERTAMENTO_CGEDESCRIZIO = 27;
  private static int PFL_ACCERTAMENTO_DATAREG = 28;
  private static int PFL_ACCERTAMENTO_IMPORTO1 = 29;
  private static int PFL_ACCERTAMENTO_LABESOTTBENE = 30;
  private static int PFL_ACCERTAMENTO_SLASH2 = 31;
  private static int PFL_ACCERTAMENTO_INFOBILANCIO = 32;
  private static int PFL_ACCERTAMENTO_LABELACCERTA = 33;
  private static int PFL_ACCERTAMENTO_CODLIVELLO5 = 34;
  private static int PFL_ACCERTAMENTO_VISSTRRICDES = 35;
  private static int PFL_ACCERTAMENTO_CODICEEUROPE = 36;
  private static int PFL_ACCERTAMENTO_INFOSOGGETTO = 37;
  private static int PFL_ACCERTAMENTO_ANNOACCPROVE = 38;
  private static int PFL_ACCERTAMENTO_NUMERACCPROV = 39;
  private static int PFL_ACCERTAMENTO_FINANZILIGHT = 40;
  private static int PFL_ACCERTAMENTO_FINANZDESCRI = 41;
  private static int PFL_ACCERTAMENTO_OPERALIGHT = 42;
  private static int PFL_ACCERTAMENTO_OPEREDESCRIZ = 43;
  private static int PFL_ACCERTAMENTO_ANNOACCPREC = 44;
  private static int PFL_ACCERTAMENTO_NUMERACCPREC = 45;
  private static int PFL_ACCERTAMENTO_ETICHELBLGRP = 46;
  private static int PFL_ACCERTAMENTO_CAUSALE1 = 47;
  private static int PFL_ACCERTAMENTO_TIPOVINCOLO = 48;
  private static int PFL_ACCERTAMENTO_TIPOAVANZO = 49;
  private static int PFL_ACCERTAMENTO_UNITAORG = 50;
  private static int PFL_ACCERTAMENTO_OBIETTOPERAT = 51;
  private static int PFL_ACCERTAMENTO_SCHEDOBIETID = 52;
  private static int PFL_ACCERTAMENTO_TIPOSERVIZI1 = 53;
  private static int PFL_ACCERTAMENTO_OBIETTGESTIO = 54;
  private static int PFL_ACCERTAMENTO_FATTORE1 = 55;
  private static int PFL_ACCERTAMENTO_FATTORDESCRI = 56;
  private static int PFL_ACCERTAMENTO_CENTRO1 = 57;
  private static int PFL_ACCERTAMENTO_CENTRIDESCRI = 58;
  private static int PFL_ACCERTAMENTO_COMPETENZDAL = 59;
  private static int PFL_ACCERTAMENTO_AL = 60;
  private static int PFL_ACCERTAMENTO_IMPUTAECONOM = 61;
  private static int PFL_ACCERTAMENTO_CONTROPAPATR = 62;
  private static int PFL_ACCERTAMENTO_CONTRODESCRI = 63;
  private static int PFL_ACCERTAMENTO_RESPRESIDUI = 64;
  private static int PFL_ACCERTAMENTO_CODMONITORAG = 65;
  private static int PFL_ACCERTAMENTO_VOCIPSDESCRI = 66;
  private static int PFL_ACCERTAMENTO_UTENTE1 = 67;
  private static int PFL_ACCERTAMENTO_DATA1 = 68;
  private static int PFL_ACCERTAMENTO_UTENTE = 69;
  private static int PFL_ACCERTAMENTO_DATA2 = 70;
  private static int PFL_ACCERTAMENTO_NOTAVUOTA = 71;
  private static int PFL_ACCERTAMENTO_SELEZIONNOTE = 72;
  private static int PFL_ACCERTAMENTO_NOTE1 = 73;
  private static int PFL_ACCERTAMENTO_DATAREGECONO = 74;
  private static int PFL_ACCERTAMENTO_DATASCADENZA = 75;
  private static int PFL_ACCERTAMENTO_BENRAGIOSOCI = 76;
  private static int PFL_ACCERTAMENTO_NOTE2 = 77;
  private static int PFL_ACCERTAMENTO_FATTORITIPO = 78;
  private static int PFL_ACCERTAMENTO_NUMEROPLUR1 = 79;
  private static int PFL_ACCERTAMENTO_E1 = 80;
  private static int PFL_ACCERTAMENTO_FINANZIAMENT = 81;
  private static int PFL_ACCERTAMENTO_PROGUNITORGA = 82;

  private static int PPQRY_ACC5 = 0;

  private static int PPQRY_BEN = 1;
  private static int PPQRY_CAP = 2;
  private static int PPQRY_FATTORI1 = 3;
  private static int PPQRY_CENTRI = 4;
  private static int PPQRY_FATTORI2 = 5;
  private static int PPQRY_VOCIECONOMIC = 6;
  private static int PPQRY_RICLASSIGEST = 7;
  private static int PPQRY_VOCIPS = 8;
  private static int PPQRY_LIVELLOV = 9;
  private static int PPQRY_VISTABILANUO = 10;
  private static int PPQRY_FINANZIAMENT = 11;
  private static int PPQRY_OPERE = 12;

  private static int PPQRY_T58 = 13;
  private static int PPQRY_VINCOLI = 14;
  private static int PPQRY_TIPIAVANZO = 15;
  private static int PPQRY_T75 = 16;
  private static int PPQRY_DUAL1 = 17;
  private static int PPQRY_DUAL = 18;


  IDPanel PAN_ACCERTAMENTO;
  private static int PFL_DEBITORE_DEBITORE = 0;

  private static int PPQRY_DEBITORE4 = 0;


  IDPanel PAN_DEBITORE;

  // Definition of Global Variables
  private IDVariant CFPEGATTIVO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI82(IMDB);
    Init_TBL_DEBITORE8(IMDB);
    Init_TBL_VALORICAP6(IMDB);
    Init_TBL_PERSONALIZZ2(IMDB);
    Init_TBL_PARAMETRVARI(IMDB);
    //
    //
    Init_PQRY_DEBITORE4(IMDB);
    Init_PQRY_DEBITORE4_RS(IMDB);
    Init_PQRY_ACC5(IMDB);
    Init_PQRY_IMPORTTOTAL5(IMDB);
    Init_PQRY_IMPORTTOTAL5_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI82(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI82, 8);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI82, "TBL_PARAMETRI82");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAUNITORGA, "PARAUNITORGA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAUNITORGA,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, "PARAMNUMEACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, "PARAMANNOACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAVOCEECON, "PARAVOCEECON");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARAVOCEECON,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, "PARATIPOFORM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI82,IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI82, 0);
  }

  private static void Init_TBL_DEBITORE8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_DEBITORE8, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_DEBITORE8, "TBL_DEBITORE8");
    IMDB.set_FldCode(IMDBDef4.TBL_DEBITORE8,IMDBDef4.FLD_DEBITORE8_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef4.TBL_DEBITORE8,IMDBDef4.FLD_DEBITORE8_ROWNAMRAGSOC,5,60,0);
    IMDB.TblAddNew(IMDBDef4.TBL_DEBITORE8, 0);
  }

  private static void Init_TBL_VALORICAP6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VALORICAP6, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_VALORICAP6, "TBL_VALORICAP6");
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP6,IMDBDef4.FLD_VALORICAP6_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_VALORICAP6, 0);
  }

  private static void Init_TBL_PERSONALIZZ2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PERSONALIZZ2, 9);
    IMDB.set_TblCode(IMDBDef4.TBL_PERSONALIZZ2, "TBL_PERSONALIZZ2");
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMVISOBI, "ROWNAMVISOBI");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMVISOBI,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPROFIN, "ROWNAMPROFIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPROFIN,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMIMPOLD, "ROWNAMIMPOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMIMPOLD,3,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPRIDOL, "ROWNAMPRIDOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPRIDOL,5,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOBIOLD, "ROWNAMOBIOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOBIOLD,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLDCEN, "ROWNAMOLDCEN");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLDCEN,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLDFAT, "ROWNAMOLDFAT");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLDFAT,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLCOPA, "ROWNAMOLCOPA");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLCOPA,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLRIEC, "ROWNAMOLRIEC");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ2,IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLRIEC,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PERSONALIZZ2, 0);
  }

  private static void Init_TBL_PARAMETRVARI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRVARI, 9);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRVARI, "TBL_PARAMETRVARI");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT, "ROWNAMIMPATT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT,3,15,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPVAR, "ROWNAMIMPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPVAR,3,15,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMECONTI, "ROWNAMECONTI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMECONTI,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMLASYEA, "ROWNAMLASYEA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMLASYEA,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEFINAN,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEINDIC, "ROWNAMEINDIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEINDIC,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEBUDGE, "ROWNAMEBUDGE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMEBUDGE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMRPPATT, "ROWNAMRPPATT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVARI,IMDBDef4.FLD_PARAMETRVARI_ROWNAMRPPATT,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRVARI, 0);
  }

  private static void Init_PQRY_DEBITORE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_DEBITORE4, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_DEBITORE4, "PQRY_DEBITORE4");
    IMDB.set_FldCode(IMDBDef14.PQRY_DEBITORE4,IMDBDef14.PQSL_DEBITORE4_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_DEBITORE4,IMDBDef14.PQSL_DEBITORE4_ROWNAMRAGSOC,5,60,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_DEBITORE4, 0);
  }

  private static void Init_PQRY_DEBITORE4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_DEBITORE4_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_DEBITORE4_RS, "PQRY_DEBITORE4_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_DEBITORE4_RS,IMDBDef14.PQSL_DEBITORE4_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_DEBITORE4_RS,IMDBDef14.PQSL_DEBITORE4_ROWNAMRAGSOC,5,60,0);
  }

  private static void Init_PQRY_ACC5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_ACC5, 51);
    IMDB.set_TblCode(IMDBDef14.PQRY_ACC5, "PQRY_ACC5");
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_E, "E");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_E,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_INTROD, "ANNO_INTROD");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_INTROD,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCTIPOAVANZ, "ACCTIPOAVANZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCTIPOAVANZ,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_COD_IMP_ECO, "COD_IMP_ECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_COD_IMP_ECO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_OBIETTIVO, "OBIETTIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_OBIETTIVO,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_RESPONSABILE_RES, "RESPONSABILE_RES");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_RESPONSABILE_RES,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_RILEVANTE_ECO, "RILEVANTE_ECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_RILEVANTE_ECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_PLUR, "NUMERO_PLUR");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_PLUR,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_TIPO_SERVIZIO, "TIPO_SERVIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_TIPO_SERVIZIO,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCCODMONITO, "ACCCODMONITO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCCODMONITO,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCCODLIVEL5, "ACCCODLIVEL5");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCCODLIVEL5,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCCODICEURO, "ACCCODICEURO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCCODICEURO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCDATASCADE, "ACCDATASCADE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCDATASCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_ACC_PROVENIENZA, "ANNO_ACC_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNO_ACC_PROVENIENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_ACC_PROVENIENZA, "NUMERO_ACC_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERO_ACC_PROVENIENZA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCDATREGECO, "ACCDATREGECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCDATREGECO,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCFINANLIGH, "ACCFINANLIGH");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCFINANLIGH,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCOPERALIGH, "ACCOPERALIGH");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ACCOPERALIGH,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNOACCPREC, "ANNOACCPREC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_ANNOACCPREC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERACCPREC, "NUMERACCPREC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACC5,IMDBDef14.PQSL_ACC5_NUMERACCPREC,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_ACC5, 0);
  }

  private static void Init_PQRY_IMPORTTOTAL5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPORTTOTAL5, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPORTTOTAL5, "PQRY_IMPORTTOTAL5");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTTOTAL5,IMDBDef14.PQSL_IMPORTTOTAL5_ROWNAMIMPATT, "ROWNAMIMPATT");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTTOTAL5,IMDBDef14.PQSL_IMPORTTOTAL5_ROWNAMIMPATT,3,15,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPORTTOTAL5, 0);
  }

  private static void Init_PQRY_IMPORTTOTAL5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPORTTOTAL5_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPORTTOTAL5_RS, "PQRY_IMPORTTOTAL5_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTTOTAL5_RS,IMDBDef14.PQSL_IMPORTTOTAL5_ROWNAMIMPATT, "ROWNAMIMPATT");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTTOTAL5_RS,IMDBDef14.PQSL_IMPORTTOTAL5_ROWNAMIMPATT,3,15,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoAccertamentiForm(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoAccertamentiForm()
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
    FormIdx = MyGlb.FRM_INFOACCEFORM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "28AA7F65-FF12-4C5E-85C5-F6932607565E";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 876;
    DesignHeight = 582;
    set_Caption(new IDVariant("Info Accertamenti Form"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 876;
    Frames[1].Height = 556;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0647482;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 876;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Vari";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 876;
    Frames[2].FixedHeight = 36;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRVARI = new IDPanel(w, this, 2, "PAN_PARAMETRVARI");
    Frames[2].Content = PAN_PARAMETRVARI;
    PAN_PARAMETRVARI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRVARI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRVARI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5AD3DEC4-4F2F-4B49-8922-13BB4195527F");
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 72, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRVARI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRVARI.InitStatus = 2;
    PAN_PARAMETRVARI_Init();
    PAN_PARAMETRVARI_InitFields();
    PAN_PARAMETRVARI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 876;
    Frames[3].Height = 520;
    Frames[3].Caption = "Accertamento";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 520;
    PAN_ACCERTAMENTO = new IDPanel(w, this, 3, "PAN_ACCERTAMENTO");
    Frames[3].Content = PAN_ACCERTAMENTO;
    PAN_ACCERTAMENTO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCERTAMENTO.VS = MainFrm.VisualStyleList;
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 520-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "02C78092-AC90-4B34-83B7-7AC5F4FF5A7F");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5340, 1240, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCERTAMENTO.InitStatus = 2;
    PAN_ACCERTAMENTO_Init();
    PAN_ACCERTAMENTO_InitFields();
    PAN_ACCERTAMENTO_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_ACCERTAMENTO.SetSubFrame(PFL_ACCERTAMENTO_LABESOTTBENE,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Debitore";
    Frames[4].Parent = this;
    PAN_DEBITORE = new IDPanel(w, this, 4, "PAN_DEBITORE");
    Frames[4].Content = PAN_DEBITORE;
    PAN_DEBITORE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DEBITORE.VS = MainFrm.VisualStyleList;
    PAN_DEBITORE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B9D1EC8D-F743-44D2-9BD0-7EBF92F10BD3");
    PAN_DEBITORE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 440, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGIU8+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI47+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGIU8+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_OPERE+BaseCmdLinIdx)
      {
        ApriInfoOpere();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PLURIENNALI+BaseCmdLinIdx)
      {
        ApriInfoPluriennali();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VARIAZIONI9+BaseCmdLinIdx)
      {
        ApriInfoVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SITUAZVINCO4+BaseCmdLinIdx)
      {
        ApriSituazioneVincolo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MOVIMEVINCOL+BaseCmdLinIdx)
      {
        ApriMovimentiVincolo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MOVIMEDELIB1+BaseCmdLinIdx)
      {
        MovimentiDelibera();
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
      if (IMDB.TblModified(IMDBDef4.TBL_DEBITORE8, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFOACCEFORM_DEBITORE4();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRVARI, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFOACCEFORM_IMPORTTOTAL5();
      }
      PAN_DEBITORE.UpdatePanel(MainFrm);
      PAN_ACCERTAMENTO.UpdatePanel(MainFrm);
      PAN_PARAMETRVARI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_ACCERTAMENTO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCERTAMENTO_FATTORE1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_ACCERTAMENTO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCERTAMENTO_CENTRO1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_ACCERTAMENTO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCERTAMENTO_CONTROPAPATR) {
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
    return (obj instanceof InfoAccertamentiForm);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoAccertamentiForm.class.getName() : (Glb.ClassWithPackage(InfoAccertamentiForm.class) ? InfoAccertamentiForm.class.getName().substring(InfoAccertamentiForm.class.getPackage().getName().length() + 1) : InfoAccertamentiForm.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Differenze CF4FDWEB
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DifferenzeCF4FDWEB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Differenze CF4FDWEB Body
      // Procedure Body
      // 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "DifferenzeCF4FDWEB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accertamento After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ACCERTAMENTO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamento After Find Event Body
      // Procedure Body
      // 
      SettaCaption();
      SettaValoriCap();
      IMDB.set_Value(IMDBDef4.TBL_DEBITORE8, IMDBDef4.FLD_DEBITORE8_ROWNAMRAGSOC, 0, (new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_BENRAGIOSOCI))));
      if (MainFrm.RESPONSABRES.equals((new IDVariant("SI")), true))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMRPPATT, 0).equals((new IDVariant(0)), true) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_PROGETTO_ID, 0)))
      {
      }
      else
      {
      }
      VisibilitàCentroFattore();
      if (IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NOTE, 0))))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_RILEVANTE_ECO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_CAPITOLO, 0).equals((new IDVariant(1.000000000000000e+016)), true) || MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "AccertamentoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCERTAMENTO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCERTAMENTO);
      // 
      // Accertamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaToolTipInfoAcc();
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_DEL, 0))))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_PROPOSTA, 0))))
        {
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // 
      // 
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_DEBITORE, 0))))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "AccertamentoOnDynamicPropertiesEvent", _e);
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
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP = (new IDVariant("Informazioni su Voce di Bilancio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_INFOBILANCIO,v_TOOLTIP.stringValue()); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMEINDIC, 0, (new IDVariant(1)));
      AutoSaveType = (new IDVariant("DENY")).stringValue();
      PAN_ACCERTAMENTO.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ACCERTAMENTO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      Pers();
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        DifferenzeCF4FDWEB();
      }
      if (MainFrm.INTEMPOBIGES.compareTo((new IDVariant("SI")), true)!=0)
      {
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.INTEMPOBIGES.equals((new IDVariant("SI")), true))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(MainFrm.PROCEDPERSON,(new IDVariant(1))).equals((new IDVariant(0)), true))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMLASYEA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMECONTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPVAR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMVISOBI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPROFIN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMIMPOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOBIOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPRIDOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLDCEN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLDFAT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLCOPA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMOLRIEC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SelezioneDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SelezioneProposta", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SelezioneFattore", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SelezioneCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore Contropartita
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattoreContropartita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Contropartita Body
      // Procedure Body
      // 
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, );
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SelezioneFattoreContropartita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Debitore On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_DEBITORE_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Debitore On Change Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_DEBITORE4, IMDBDef14.PQSL_DEBITORE4_ROWNAMRAGSOC, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_DEBITORE, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "DebitoreOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Delibere
  // **********************************************************************
  public int ApriInfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Proposte
  // **********************************************************************
  public int ApriInfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Selezione Note
  // **********************************************************************
  public int ApriSelezioneNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNOTAZIONI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ANNOTAZIONI = (new IDVariant("Annotazioni", IDVariant.STRING));
      // 
      // Apri Selezione Note Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NOTE, 0), v_ANNOTAZIONI, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriSelezioneNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_E, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Opere
  //  
  // **********************************************************************
  public int ApriInfoOpere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Opere Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI76, IMDBDef4.FLD_PARAMETRI76_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI76, IMDBDef4.FLD_PARAMETRI76_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_FINANZIAMEN9, IMDBDef4.FLD_FINANZIAMEN9_PARAMFINANZI, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_INFOOPERE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOOPERE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoOpere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Pluriennali
  //  
  // **********************************************************************
  public int ApriInfoPluriennali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Pluriennali Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI77, IMDBDef4.FLD_PARAMETRI77_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI77, IMDBDef4.FLD_PARAMETRI77_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_ACC, 0));
      MainFrm.UnloadForm(MyGlb.FRM_INFOPLURIENN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOPLURIENN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoPluriennali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Variazioni
  //  
  // **********************************************************************
  public int ApriInfoVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Variazioni Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMDESACC, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMINFUPD, 0, (new IDVariant("INFO")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIAZIONACC,(new IDVariant(0)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIAZIONACC, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Caption
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaCaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ACCERTAMENTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RESIDUO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ACCERTAMENTO = (new IDVariant("Accertamento: ", IDVariant.STRING));
      v_RESIDUO = (new IDVariant("Residuo: ", IDVariant.STRING));
      // 
      // Setta Caption Body
      // Procedure Body
      // 
      IDVariant v_IMPORTATTUAL = new IDVariant(0,IDVariant.DECIMAL);
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(((IMDB.Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))?v_ACCERTAMENTO:v_RESIDUO), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0))), (new IDVariant(" "))), (new IDVariant(" / "))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0))), MainFrm.ESERCIZIO));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.SALDO_INI, 0) + NVL(A.VARIAZIONI, 0) + NVL(A.VARIAZIONI_RES, 0) as NVESI0NVEV0N ");
      SQL.append("from ");
      SQL.append("  ESEACC A ");
      SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPORTATTUAL = QV.Get("NVESI0NVEV0N", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT, 0, new IDVariant(v_IMPORTATTUAL));
      SettaImporto(IMDB.Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SettaCaption", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importo
  // Explain which processing is carried out by this procedure
  // Valore:  - Input
  // **********************************************************************
  public int SettaImporto (IDVariant Valore)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RESIDUO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPORTO = (new IDVariant("Importo : ", IDVariant.STRING));
      v_RESIDUO = (new IDVariant("Residuo : ", IDVariant.STRING));
      // 
      // Setta Importo Body
      // Procedure Body
      // 
      PAN_PARAMETRVARI.set_FieldText(PFL_PARAMETRVARI_VISUALIMPORT, IDL.Add(((IMDB.Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0).equals((new IDVariant("INFORES"))))?v_RESIDUO:v_IMPORTO), IDL.Format(IDL.NullValue(Valore,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SettaImporto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pers
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Pers ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOMECOMANDOP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Pers Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMRPPATT, 0, MainFrm.FunctionRppAttiva());
      CFPEGATTIVO = MainFrm.CfpegAttivo();
      // 
      // 
      // 
      // 
      v_NOMECOMANDOP = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("proposta_finope")));
      if (v_NOMECOMANDOP.equals((new IDVariant("proposta_finope_attiva")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPROFIN, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ2, IMDBDef4.FLD_PERSONALIZZ2_ROWNAMPROFIN, 0, (new IDVariant("NO")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "Pers", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Centro Fattore
  // **********************************************************************
  public int VisibilitàCentroFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_GE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilità Centro Fattore Body
      // Procedure Body
      // 
      v_GE = new IDVariant(MainFrm.GESTIOECONOM);
      if (MainFrm.RETVALT99.compareTo((new IDVariant(-1)), true)!=0)
      {
        if (v_GE.equals((new IDVariant(-1)), true))
        {
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_GE.equals((new IDVariant(1)), true))
        {
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_GE.equals((new IDVariant(2)), true))
        {
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "VisibilitàCentroFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Situazione Vincolo
  // **********************************************************************
  public int ApriSituazioneVincolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Situazione Vincolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI19, IMDBDef4.FLD_PARAMETRI19_ROWNAMEVINCO, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_TIPO_VINCOLO, 0));
      MainFrm.Show(MyGlb.FRM_SITUAZVINCOL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriSituazioneVincolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Movimenti Vincolo
  // **********************************************************************
  public int ApriMovimentiVincolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Movimenti Vincolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI233, IMDBDef4.FLD_PARAMETRI233_ROWNAMTIPVIN, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_TIPO_VINCOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI233, IMDBDef4.FLD_PARAMETRI233_ROWNAMECOMPE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI233, IMDBDef4.FLD_PARAMETRI233_ROWNAMDATREG, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_MOVIMVINCACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriMovimentiVincolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tool Tip Info Acc
  // **********************************************************************
  public int SettaToolTipInfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tool Tip Info Acc Body
      // Procedure Body
      // 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_CAPITOLO1,(new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_CAPITOLO1))).stringValue()); 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_ARTICOLO1,(new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_ARTICOLO1))).stringValue()); 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_VOCEECONDESC,(new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_VOCEECONDESC))).stringValue()); 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_CGEDESCRIZIO,(new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_CGEDESCRIZIO))).stringValue()); 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_FATTORDESCRI,(new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_FATTORDESCRI))).stringValue()); 
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_CENTRIDESCRI,(new IDVariant(PAN_ACCERTAMENTO.FieldText(PFL_ACCERTAMENTO_CENTRIDESCRI))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SettaToolTipInfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Obiettivo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoObiettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Obiettivo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI351, IMDBDef1.FLD_PARAMETRI351_ROWNAMEOBIID, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_SCHEDA_OBIETTIVO_ID, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI351, IMDBDef1.FLD_PARAMETRI351_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_STANSULLOBIE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "ApriInfoObiettivo", _e);
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
    IDVariant v_CAPTITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPCATEGORIA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPINTERVENT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPTERZI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Cap Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TITOLO as CAPTITOLO, ");
      SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
      SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  A.COD_TERZI as CAPCODTERZI, ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.CAPITOLO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.ARTICOLO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("group by ");
      SQL.append("  A.TITOLO, ");
      SQL.append("  A.CATEGORIA, ");
      SQL.append("  A.COD_INTERVENTO, ");
      SQL.append("  A.COD_TERZI ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPTITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
        v_CAPCATEGORIA = QV.Get("CAPCATEGORIA", IDVariant.INTEGER) ;
        v_CAPINTERVENT = QV.Get("CAPCODINTERV", IDVariant.INTEGER) ;
        v_CAPTERZI = QV.Get("CAPCODTERZI", IDVariant.INTEGER) ;
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true) || (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMETITOL, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMECATEG, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMCODINT, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMCODTER, 0, (new IDVariant(-1)));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMETITOL, 0, new IDVariant(v_CAPTITOLO));
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMECATEG, 0, new IDVariant(v_CAPCATEGORIA));
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMCODINT, 0, new IDVariant(v_CAPINTERVENT));
        IMDB.set_Value(IMDBDef4.TBL_VALORICAP6, IMDBDef4.FLD_VALORICAP6_ROWNAMCODTER, 0, new IDVariant(v_CAPTERZI));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "SettaValoriCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetto Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_DEBITORE, 0));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "InfoSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Movimenti Delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int MovimentiDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Movimenti Delibera Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_SEDE_DEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_DEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_DEL, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Delibera non indicata"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_SEDE_DEL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_NUMERO_DEL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL, 0, IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_ANNO_DEL, 0));
      MainFrm.Show(MyGlb.FRM_MOVIMEDELIBE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoAccertamentiForm", "MovimentiDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Debitore
  // **********************************************************************
  private void INFOACCEFORM_DEBITORE4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_DEBITORE4_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_DEBITORE8, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_DEBITORE8, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_DEBITORE4_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_DEBITORE4_RS, 0, IMDBDef4.TBL_DEBITORE8, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_DEBITORE4_RS, 0, 0, IMDBDef4.TBL_DEBITORE8, IMDBDef4.FLD_DEBITORE8_ROWNAMRAGSOC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_DEBITORE8, 0);
      if (IMDB.Eof(IMDBDef4.TBL_DEBITORE8, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_DEBITORE8, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_DEBITORE4_RS, 0);
  }

  // **********************************************************************
  // Importo Totale
  // Primary record source for panel data
  // **********************************************************************
  private void INFOACCEFORM_IMPORTTOTAL5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_IMPORTTOTAL5_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRVARI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRVARI, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_IMPORTTOTAL5_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_IMPORTTOTAL5_RS, 0, IMDBDef4.TBL_PARAMETRVARI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_IMPORTTOTAL5_RS, 0, 0, IMDBDef4.TBL_PARAMETRVARI, IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRVARI, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRVARI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRVARI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_IMPORTTOTAL5_RS, 0);
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
  private void PAN_PARAMETRVARI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRVARI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRVARI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRVARI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRVARI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRVARI);
    // Stub
  }

  private void PAN_PARAMETRVARI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRVARI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRVARI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRVARI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ACCERTAMENTO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCERTAMENTO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCERTAMENTO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCERTAMENTO, Cancel);
    // Stub
  }

  private void PAN_ACCERTAMENTO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_INFODELIBERE)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_INFOPROPOSTE)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_INFOBILANCIO)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_INFOSOGGETTO)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_FATTORE1)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_CENTRO1)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattoreContropartita();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_NOTAVUOTA)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSelezioneNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_SELEZIONNOTE)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSelezioneNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ACCERTAMENTO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCERTAMENTO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_E, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_ACC5, IMDBDef14.PQSL_ACC5_E, 0, (new IDVariant("E")));
      }
      if (Cancel.isFalse())
      {
        PAN_ACCERTAMENTO_IntValidateRow(Cancel);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DEBITORE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DEBITORE);
    // Stub
  }

  private void PAN_DEBITORE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
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
  private void PAN_DEBITORE_Init()
  {

    PAN_DEBITORE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DEBITORE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DEBITORE.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_DEBITORE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, "FE637E90-D51C-44EA-999D-258D6A063786");
    PAN_DEBITORE.set_Header(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, "Debitore");
    PAN_DEBITORE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, "Debitore");
    PAN_DEBITORE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DEBITORE.SetFlags(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DEBITORE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 440, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, 84);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DEBITORE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DEBITORE.SetRect(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, 8, 0, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEBITORE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, 64);
    PAN_DEBITORE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DEBITORE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEBITORE_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DEBITORE.SetFieldPage(PFL_DEBITORE_DEBITORE, -1, -1);
    PAN_DEBITORE.SetFieldPanel(PFL_DEBITORE_DEBITORE, PPQRY_DEBITORE4, "A.ROWNAMRAGSOC", "ROWNAMRAGSOC", 5, 60, 0, -13997);
  }

  private void PAN_DEBITORE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DEBITORE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DEBITORE.SetIMDB(IMDB, "PQRY_DEBITORE4", true);
    PAN_DEBITORE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_DEBITORE.SetQueryIMDB(PPQRY_DEBITORE4, IMDBDef14.PQRY_DEBITORE4_RS, IMDBDef4.TBL_DEBITORE8);
    JustLoaded = true;
    PAN_DEBITORE.SetFieldPrimaryIndex(PFL_DEBITORE_DEBITORE, IMDBDef4.FLD_DEBITORE8_ROWNAMRAGSOC);
    PAN_DEBITORE.SetMasterTable(0, "DEBITORE8");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DEBITORE.Status() == 2)
    {
      int oldListQBE = PAN_DEBITORE.iUseListQBE;
      PAN_DEBITORE.iUseListQBE = 0;
      PAN_DEBITORE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DEBITORE.PanelCommand(Glb.PCM_FIND);
      PAN_DEBITORE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ACCERTAMENTO_Init()
  {

    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_PAGE, 2);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ESTREMI, "933CE8C4-B4BC-459C-B965-5063EE715149");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ESTREMI, "Estremi");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ESTREMI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ESTREMI, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ESTREMI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ALTRIDATI, "CA27F1F7-3E55-4FC1-B90B-1E6CD5D9127D");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ALTRIDATI, "Altri Dati");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ALTRIDATI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ALTRIDATI, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_PAGE, PAG_ACCERTAMENTO_ALTRIDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, "1EC993C0-354F-4EAA-889C-F6E721DDE570");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, "Provvedimento");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, MyGlb.PANEL_FORM, 16, 100, 608, 36, 0, 0);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, 0, 87);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, 1, 13);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, 0, 4);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, 1, 1);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, "B5059BFE-8DF3-45C3-861A-AC23B7AAEF40");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, "Capitolo/Art.");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, MyGlb.PANEL_LIST, 0, -9999, 356, 16, 0, 0);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, MyGlb.PANEL_FORM, 16, 15, 608, 77, 0, 0);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, 0, 60);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, 1, 13);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, 0, 4);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, 1, 4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, "4C2DE566-B6D4-4939-AF01-92642A48A530");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, "Accertamento Esercizio Precedente");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, MyGlb.PANEL_FORM, 636, 171, 220, 49, 0, 0);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, 0, 201);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, 1, 13);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, 0, 4);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, 1, 4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_ACCEESERPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, "D9F2B669-0112-4213-B832-3800C7DD1C7E");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, "Inserimento");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, MyGlb.PANEL_FORM, 76, 383, 268, 49, 0, 0);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, 0, 70);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, 1, 13);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, 0, 4);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, 1, 4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, "5E382699-40DF-4786-96EC-81FA8CDC2102");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, "Aggiornamento");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, MyGlb.PANEL_FORM, 376, 383, 268, 49, 0, 0);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, 0, 88);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, 1, 13);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, 0, 4);
    PAN_ACCERTAMENTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, 1, 4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTO_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_FIELD, 83);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, "604D54A7-A181-4396-BFDD-C87F0BC50922");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, "Delibera");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, "Delibera - Sede del");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, "F916A0DB-94FC-4684-AD03-58A70AF7D885");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, "NUMERO DEL");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, "4CF0A9BA-B856-470A-96BD-CAD108B3DDBB");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, "ANNO DEL");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, "Anno delibera");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, "2730F1C8-2B3A-4EA5-ACBF-5F178DB2086A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, "Proposta");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, "Unita Proponente");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, "F591EA13-E5F4-43D4-864A-946A94E6CC76");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, "NUMERO PROPOSTA");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, "Numero Proposta");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, "29687D0A-63C2-4714-B8C0-80D7A020B9AB");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, "ANNO PROPOSTA");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, "Anno Proposta");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, "8876BDA3-F54B-45B4-94AB-13B9CEA61245");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, "-");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, "FF60A8B0-DE48-418E-AA35-3ADC8588280B");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, "/");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, "0663486B-8F73-46A5-A416-76BC8FD7659F");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, "/");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, "D61C58AC-E930-4564-8063-E553268D9123");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, "-");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, "49B09D16-472B-4B1B-95E4-364C36B06262");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERTAMENTO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, 0, "info.gif", false);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, "FD98CAA0-6DB6-432D-B29D-A8BFE3EF72C5");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERTAMENTO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, 0, "info.gif", false);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, "23B141C7-AFD4-4FEE-8867-C12164E14714");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.VIS_SFONEBORDTRA);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, "CDE8AC05-ED95-44C7-9085-67D0E0A1558C");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, "55327106-B0DB-4042-90AD-4E45D472EFE9");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, "ANNO INTROD");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, "Anno Introduzione");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, "BF9C1083-D499-4BB0-A7E2-749C63C3BB7A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, "Capitolo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, "Capitolo");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, "31952A77-7CA6-44B9-ACEE-7AF27980CC67");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, "Articolo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, "Articolo");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, "CDE525F0-E7F3-4143-93A2-8C784E297ECF");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.VIS_SFONEBORDTRA);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, "AA2E6717-D24C-474B-BFF6-B7A16B6401F7");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, "ANNO ACC");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, "BE102224-5B99-4BFF-8896-93344C585A35");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, "NUMERO ACC");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, "233F3869-63E7-4F11-9B3A-B6EBDC76CFC5");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, "CAPITOLO");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, "51B7D8EE-10B1-4C9F-8E87-3C24DAD5A808");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, "ARTICOLO");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, "4708D0EE-792D-4BF9-AF3E-7568B1FB65E1");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, "Descrizione");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, "Descrizione");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, "8C537631-1720-45E5-9A84-3F821ACCF545");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, "CODICE DEBITORE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, "551FC945-C457-4025-8458-4F3416DAB665");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, "Voce Econ.");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, "Voce Economale");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, "CE6DDE37-FBDD-431C-8297-1E9BBB33DC4E");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, "Voce Econ. Descrizione");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, "D9CFFD61-D9E0-44F9-8ED4-33633F7E2DE4");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, "Cge");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, "Codice gestionale");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, "A28F89C8-4E82-4F72-B9AB-E7765DF86C65");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, "Cge Descrizione");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, "238221AA-3FA8-42E5-8D79-9E46B5333392");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, "Data Reg.");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, "F98F358F-C4AB-4A3E-A2CA-41ACA6E79268");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, "Importo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, "Importo Iniziale dell'impegno");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, "90A38852-B656-4245-9D6C-AFF23E9CDA38");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, "Text to show here");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, "2136DDE1-C849-440E-AC1A-A92C762DA0A5");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, "/");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, "D71E3343-3A2E-4EE5-88DA-E8AFA734BB84");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERTAMENTO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, 0, "info.gif", false);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, "447CFBD0-7105-4B40-BFC1-3E031EE19213");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, "Accertamento");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INLIST, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, "B2787286-FD84-4B00-B21F-B5E3707A6351");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, "Cod. V livello");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, "58DFA3A6-28A6-480F-B28D-B7EB0972ABD2");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, "57EA00BD-CEF8-48A6-B08A-6F37203D9E38");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, "Cod. Europeo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, "Brief description of field content.");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, "FA2FF888-1409-46E7-B8FA-E293BD0B83CE");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ACCERTAMENTO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, 0, "info.gif", false);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, "C3A4B202-64D0-4560-963B-8C4FF78B304C");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, "/");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, "79420F82-7847-4293-B5A7-FD3CB7E1B37A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, "Acc. Provenienza");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, "9AAD284C-DB5A-4ED9-A063-9D319C598445");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, "Finanziamento");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, "5BB784B4-6ED4-436F-8CF5-8A5E6610C821");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, "BC68BE76-857B-449A-9006-EE57BA93C409");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, "Opera");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, "2D978305-4300-410B-BE58-0223C5F2B88F");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, "OPERE DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, "3003A4A5-369A-4A5A-AC62-CE3B0A6F8263");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, "/");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, "DCE9E375-1A77-41BB-8A85-04A762DDF2E3");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, " ");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, "3B2C6A55-1B3E-4383-B8B5-89F6598E574D");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, " ");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, "lblgrp");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.VIS_LABELFIELD);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, "A1CD3B64-B005-410F-B4BA-8B5C8E78452D");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, "Causale");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, "Causale");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, "8B9490C0-0D09-4298-8AE0-9566964B9FF9");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, "Tipo Vincolo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, "05F865DE-F2AA-46E9-B7D3-6184DC51C834");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, "Tipo Avanzo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, "AAEF60F5-4A25-436C-92DF-29455DDC4944");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, "Unità Org.");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, "EC4A8553-5979-4593-B650-74C8F6ABBE32");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, "Obiettivo Operativo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, "B2BFE433-2537-4FC8-B233-D52767F2BA59");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, "SCHEDA_OBIETTIVO_ID");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, "1C58EC77-D8B5-459F-BE72-C6301AF424AB");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, "Tipo Servizio");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, "62C8A341-2533-40AA-8F48-07D0C99B8C5A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, "Obiettivo Gestionale");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, "3B97E280-BE28-4EB2-BC13-467F98E1EC3D");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, "Fattore");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, "fattore");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, "F2EAECB1-BE41-4C1F-B6CA-41289FC3E7A2");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, "BA9F2D5E-08FF-46A2-902C-C7C83BC0A259");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, "Centro");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, "0E6FA967-AADD-4FE0-9C26-97F55DDFDF3D");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, "9E6E50E7-F8C4-4ECD-9974-4447BD295283");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, "Competenza dal");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, "5FE84495-EBEA-4F03-9FBD-4C1092DB1361");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, "al");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, "1357AE83-9CFC-4A95-86AF-4A52F84F8541");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, "Imputazione Economica");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, "E78ABA21-6148-4A7E-BCB6-AE7B68AE2886");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, "Contropartita Patr.");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, "00B97929-B10A-471D-8B33-33F4CAA8F838");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, "CONTROPARTITA DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, "165CACD2-68AF-458D-B36A-F8AC0295DE7D");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, "Resp. Residui");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, "C6B914C0-BF5F-4C62-A807-A759508E9D63");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, "Cod. Monitoraggio");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, "B5541FD3-37D4-4BC3-9532-BDB92DF0DF2E");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, "VOCI PS DESCRIZIONE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, "F64DA6F8-FC4B-444F-B809-6459E0F00C00");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, "Utente");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, "Utente");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, "495E696E-DB0C-4CBB-8C41-E05ABB564E69");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, "Data");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, "E55304DF-D4BA-41BD-8C3F-689CB71D70A3");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, "Utente");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, "Utente");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, "DBC8867C-DEB9-4087-AC9F-6AA27AF73A22");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, "Data");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, "Data");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, "9A20ECAF-75A1-4567-B44E-DFE6530E1EE0");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERTAMENTO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, 0, "nota bianca.gif", false);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, "9F855105-FED9-45A7-B2A0-A51A7088F540");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERTAMENTO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, 0, "nota scritta.gif", false);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, "9563979B-5F19-424F-A424-615B40CF13A3");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, "Note");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, "8AF10AA3-1BC7-4822-B772-7BE7F06EDD23");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, "Data Reg.");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, "45B9A378-A880-4DB5-84E0-4A07E2EFAB44");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, "Data Scadenza");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, "FD537E82-69D0-4BB0-8876-D2E14758380C");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, "BEN RAGIONE SOCIALE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, 0, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, "1B282A1D-1CC7-4156-B3CD-EE07C39B1D8B");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, "NOTE");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, "B2085A38-4A69-4519-B869-7FE1C80618F1");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, "FATTORI TIPO");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, "266896AB-09B7-46C3-861D-7C38DC2BB0E7");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, "NUMERO PLUR");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, "90114D55-3290-4110-8BAA-D2377EE9BD18");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, "E");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, "AC85C8E1-2348-4ACD-87F9-6F2EC6D2BBC0");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, "FINANZIAMENTO");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, "539422E8-5C6D-41F0-BF24-9C793A7F8998");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCERTAMENTO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_LIST, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_LIST, "Delib.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_FORM, 32, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_FORM, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DELIBERA1, MyGlb.PANEL_FORM, "Delibera");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DELIBERA1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DELIBERA1, PPQRY_ACC5, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_LIST, 72);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_FORM, 156, 104, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_FORM, 72);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERODEL1, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NUMERODEL1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NUMERODEL1, PPQRY_ACC5, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_LIST, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_FORM, 224, 104, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_FORM, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNODEL1, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ANNODEL1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ANNODEL1, PPQRY_ACC5, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_LIST, "Proposta");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_FORM, 300, 104, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_FORM, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROPOSTA1, MyGlb.PANEL_FORM, "Proposta");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_PROPOSTA1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_PROPOSTA1, PPQRY_ACC5, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_LIST, 108);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_LIST, "NUM. PROPOSTA");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_FORM, 496, 104, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_FORM, 108);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPROPO1, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NUMEROPROPO1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NUMEROPROPO1, PPQRY_ACC5, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_LIST, 96);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_LIST, "ANN. PROPOSTA");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_FORM, 560, 104, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_FORM, 96);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOPROPOST1, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ANNOPROPOST1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ANNOPROPOST1, PPQRY_ACC5, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.PANEL_LIST, 112, 120, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.PANEL_FORM, 476, 104, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO4, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_TRATTINO4, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_TRATTINO4, -1, "", "TRATTINO4", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.PANEL_LIST, 112, 120, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.PANEL_FORM, 204, 104, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SLASH, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.PANEL_LIST, 120, 128, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.PANEL_FORM, 540, 104, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SLASH1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.PANEL_LIST, 104, 112, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.PANEL_FORM, 136, 104, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TRATTINO3, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_TRATTINO3, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_TRATTINO3, -1, "", "TRATTINO3", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.PANEL_LIST, 252, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.PANEL_FORM, 260, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFODELIBERE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_INFODELIBERE, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_INFODELIBERE, -1, "", "INFODELIBERE", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.PANEL_FORM, 596, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOPROPOSTE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_INFOPROPOSTE, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_INFOPROPOSTE, -1, "", "INFOPROPOSTE", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.PANEL_LIST, 324, 128, 116, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.PANEL_FORM, 604, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO2, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SPAZIO2, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SPAZIO2, -1, "", "SPAZIO2", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.PANEL_LIST, 332, 136, 116, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.PANEL_FORM, 20, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SPAZIO1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_PROVVEDIMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SPAZIO1, -1, "", "SPAZIO1", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_LIST, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_LIST, "ANNO INTROD");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_FORM, 448, 80, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOINTROD1, MyGlb.PANEL_FORM, "ANN. INTROD");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ANNOINTROD1, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ANNOINTROD1, PPQRY_ACC5, "A.ANNO_INTROD", "ANNO_INTROD", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_LIST, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_FORM, 20, 44, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_FORM, 72);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CAPITOLO1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_VOCEPEG);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CAPITOLO1, PPQRY_CAP, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E~~,~~CAPITOLO~~,0)", "CAPDESCRCAPI", 5, 99, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_LIST, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_FORM, 36, 68, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_FORM, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ARTICOLO1, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_VOCEPEG);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ARTICOLO1, PPQRY_CAP, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E~~,~~CAPITOLO~~,~~ARTICOLO~~)", "CAPDESCRARTI", 5, 99, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.PANEL_LIST, 316, 120, 116, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.PANEL_FORM, 612, 40, 8, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SPAZIO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SPAZIO, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_VOCEPEG);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SPAZIO, -1, "", "SPAZIO", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_LIST, 64);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_FORM, 656, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_FORM, 64);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACC1, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ANNOACC1, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ANNOACC1, PPQRY_ACC5, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_LIST, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_LIST, "NUMERO ACC");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_FORM, 700, 76, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_FORM, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROACC1, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NUMEROACC1, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NUMEROACC1, PPQRY_ACC5, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_FORM, 96, 20, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CAPITOLO, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CAPITOLO, PPQRY_ACC5, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_LIST, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_FORM, 240, 20, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_FORM, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ARTICOLO2, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ARTICOLO2, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ARTICOLO2, PPQRY_ACC5, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_FORM, 16, 144, 576, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DESCRIZIONE1, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DESCRIZIONE1, PPQRY_ACC5, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_LIST, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_LIST, "COD. DEBIT.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_FORM, 488, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_FORM, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEDEBITO, MyGlb.PANEL_FORM, "COD. DEBITORE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CODICEDEBITO, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CODICEDEBITO, PPQRY_ACC5, "A.DEBITORE", "DEBITORE", 2, 15, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_LIST, "Voce Econ.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_FORM, 24, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECON, MyGlb.PANEL_FORM, "Voce Econ.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_VOCEECON, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_VOCEECON, PPQRY_ACC5, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_LIST, 164);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_LIST, "Voce Econ. Descrizione");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_FORM, 184, 232, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_FORM, 164);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCEECONDESC, MyGlb.PANEL_FORM, "Voce Econ. Descrizione");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_VOCEECONDESC, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_VOCEECONDESC, PPQRY_VOCIECONOMIC, "DECODE(A.DESCRIZIONE, '', '', A.DESCRIZIONE)", "VOCIECONDESC", 5, 99, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_LIST, "Cge");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_FORM, 56, 260, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_FORM, 36);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGE, MyGlb.PANEL_FORM, "Cge");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CGE, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CGE, PPQRY_ACC5, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_LIST, 192);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_LIST, "Cge Descrizione");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_FORM, 184, 260, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_FORM, 192);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CGEDESCRIZIO, MyGlb.PANEL_FORM, "Cge Descrizione");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CGEDESCRIZIO, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CGEDESCRIZIO, PPQRY_RICLASSIGEST, "C.DESCRIZIONE", "RICLGESTDESC", 5, 200, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_FORM, 440, 316, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATAREG, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATAREG, PPQRY_ACC5, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_FORM, 680, 16, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_FORM, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_IMPORTO1, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_IMPORTO1, PPQRY_ACC5, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.PANEL_LIST, 28, 48, 356, 80, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.PANEL_LIST, 6);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.PANEL_FORM, 16, 192, 468, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABESOTTBENE, MyGlb.PANEL_FORM, 2);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_LABESOTTBENE, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_LABESOTTBENE, -1, "", "LABESOTTBENE", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.PANEL_LIST, 120, 128, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.PANEL_FORM, 220, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SLASH2, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SLASH2, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SLASH2, -1, "", "SLASH2", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.PANEL_FORM, 268, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOBILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_INFOBILANCIO, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_INFOBILANCIO, -1, "", "INFOBILANCIO", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.PANEL_LIST, 628, 124, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.PANEL_FORM, 656, 56, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_LABELACCERTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_LABELACCERTA, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 288, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CODLIVELLO5, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CODLIVELLO5, PPQRY_ACC5, "A.COD_LIVELLO_5", "ACCCODLIVEL5", 3, 10, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_LIST, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_FORM, 184, 288, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VISSTRRICDES, MyGlb.PANEL_FORM, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_VISSTRRICDES, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_VISSTRRICDES, PPQRY_LIVELLOV, "A.DESCRIZIONE", "NOOGVISTRIDE", 5, 300, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_FORM, -12, 316, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CODICEEUROPE, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CODICEEUROPE, PPQRY_ACC5, "A.CODICE_EUROPEO", "ACCCODICEURO", 1, 1, 0, -13997);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_CODICEEUROPE, (new IDVariant(1)), "1 - entrate destinate al finanziamento dei progetti comunitari", "", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_CODICEEUROPE, (new IDVariant(2)), "2 - altre entrate", "", "", -1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.PANEL_LIST, 588, 196, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.PANEL_FORM, 596, 200, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_INFOSOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_INFOSOGGETTO, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_INFOSOGGETTO, -1, "", "INFOSOGGETTO", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_LIST, 144);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_LIST, "/");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_FORM, 792, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_FORM, 16);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPROVE, MyGlb.PANEL_FORM, "/");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ANNOACCPROVE, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ANNOACCPROVE, PPQRY_ACC5, "A.ANNO_ACC_PROVENIENZA", "ANNO_ACC_PROVENIENZA", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_LIST, 160);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_LIST, "Acc. Provenienza");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_FORM, 632, 44, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_FORM, 104);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPROV, MyGlb.PANEL_FORM, "Acc. Provenienza");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NUMERACCPROV, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NUMERACCPROV, PPQRY_ACC5, "A.NUMERO_ACC_PROVENIENZA", "NUMERO_ACC_PROVENIENZA", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_LIST, 136);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_FORM, 0, 344, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_FORM, 92);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZILIGHT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FINANZILIGHT, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FINANZILIGHT, PPQRY_ACC5, "A.FINANZIAMENTO_LIGHT", "ACCFINANLIGH", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_FORM, 156, 344, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZIAMENTI DESCRIZIONE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FINANZDESCRI, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_LIST, 84);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_LIST, "Opera");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_FORM, 12, 368, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPERALIGHT, MyGlb.PANEL_FORM, "Opera");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_OPERALIGHT, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_OPERALIGHT, PPQRY_ACC5, "A.OPERA_LIGHT", "ACCOPERALIGH", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_LIST, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_LIST, "OPERE DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_FORM, 156, 368, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OPEREDESCRIZ, MyGlb.PANEL_FORM, "OPERE DESCRIZIONE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_OPEREDESCRIZ, PAG_ACCERTAMENTO_ESTREMI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_OPEREDESCRIZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_LIST, 96);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_LIST, "/");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_FORM, 788, 196, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_FORM, 16);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ANNOACCPREC, MyGlb.PANEL_FORM, "/");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ANNOACCPREC, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_ACCEESERPREC);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ANNOACCPREC, PPQRY_ACC5, "A.ANNO_ACC_PREC", "ANNOACCPREC", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_LIST, " ");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_FORM, 716, 196, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_FORM, 20);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMERACCPREC, MyGlb.PANEL_FORM, " ");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NUMERACCPREC, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_ACCEESERPREC);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NUMERACCPREC, PPQRY_ACC5, "A.NUMERO_ACC_PREC", "NUMERACCPREC", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.PANEL_LIST, 664, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.PANEL_FORM, 640, 200, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_ETICHELBLGRP, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_ETICHELBLGRP, PAG_ACCERTAMENTO_ESTREMI, GRP_ACCERTAMENTO_ACCEESERPREC);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_ETICHELBLGRP, -1, "", "ETICHELBLGRP", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_LIST, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_LIST, "Causale");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_FORM, 72, 32, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_FORM, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CAUSALE1, MyGlb.PANEL_FORM, "Causale");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CAUSALE1, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CAUSALE1, PPQRY_ACC5, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_FORM, 52, 56, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_TIPOVINCOLO, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_TIPOVINCOLO, PPQRY_ACC5, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_FORM, 44, 80, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_TIPOAVANZO, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_TIPOAVANZO, PPQRY_ACC5, "A.TIPO_AVANZO", "ACCTIPOAVANZ", 3, 10, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_LIST, 176);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_LIST, "Unità Org.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_FORM, 64, 104, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_FORM, 64);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UNITAORG, MyGlb.PANEL_FORM, "Unità Org.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_UNITAORG, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_UNITAORG, PPQRY_VISTABILANUO, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "UNITAORG", 5, 117804, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_LIST, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_FORM, 8, 128, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTOPERAT, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_OBIETTOPERAT, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldUnbound(PFL_ACCERTAMENTO_OBIETTOPERAT, true);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_OBIETTOPERAT, PPQRY_ACC5, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_ACCERTAMENTO.set_Alignment(PFL_ACCERTAMENTO_OBIETTOPERAT, 2);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_FORM, 584, 104, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_FORM, 52);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SCHEDOBIETID, MyGlb.PANEL_FORM, "S. OB. I.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SCHEDOBIETID, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SCHEDOBIETID, PPQRY_ACC5, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_LIST, 84);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_LIST, "Tipo Servizio");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_FORM, 48, 176, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_TIPOSERVIZI1, MyGlb.PANEL_FORM, "Tipo Servizio");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_TIPOSERVIZI1, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_TIPOSERVIZI1, PPQRY_ACC5, "A.TIPO_SERVIZIO", "TIPO_SERVIZIO", 1, 3, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_LIST, 64);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_LIST, "Obiet. Gestion.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_FORM, 4, 152, 592, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_FORM, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_OBIETTGESTIO, MyGlb.PANEL_FORM, "Obiettivo Gestionale");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_OBIETTGESTIO, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldUnbound(PFL_ACCERTAMENTO_OBIETTGESTIO, true);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_OBIETTGESTIO, PPQRY_ACC5, "DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO')", "OBIETTIVO", 5, 99, 0, -13997);
    PAN_ACCERTAMENTO.set_Alignment(PFL_ACCERTAMENTO_OBIETTGESTIO, 2);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_LIST, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_LIST, "Fattore");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_FORM, 72, 224, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_FORM, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORE1, MyGlb.PANEL_FORM, "Fattore");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FATTORE1, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FATTORE1, PPQRY_ACC5, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_FORM, 256, 224, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FATTORDESCRI, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FATTORDESCRI, PPQRY_FATTORI1, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_LIST, 52);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_LIST, "Centro");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_FORM, 76, 248, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_FORM, 52);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRO1, MyGlb.PANEL_FORM, "Centro");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CENTRO1, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CENTRO1, PPQRY_ACC5, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_FORM, 256, 248, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CENTRIDESCRI, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_FORM, 28, 272, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_COMPETENZDAL, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_COMPETENZDAL, PPQRY_ACC5, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_LIST, 92);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_LIST, "al");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_FORM, 220, 272, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_FORM, 20);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_AL, MyGlb.PANEL_FORM, "al");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_AL, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_AL, PPQRY_ACC5, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_LIST, 88);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_LIST, "Imputazione Economica");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_FORM, 332, 272, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_FORM, 84);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imput. Econ.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_IMPUTAECONOM, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_IMPUTAECONOM, PPQRY_ACC5, "A.RILEVANTE_ECO", "RILEVANTE_ECO", 5, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_LIST, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_LIST, "Controp. Patr");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_FORM, 16, 296, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_FORM, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CONTROPAPATR, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CONTROPAPATR, PPQRY_ACC5, "A.COD_IMP_ECO", "COD_IMP_ECO", 5, 16, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_LIST, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_LIST, "CONTROPARTITA DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_FORM, 216, 296, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_FORM, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CONTRODESCRI, MyGlb.PANEL_FORM, "CONTROP. DESCR.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CONTRODESCRI, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CONTRODESCRI, PPQRY_FATTORI2, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_LIST, 104);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_LIST, "Resp. Residui");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_FORM, 16, 344, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_FORM, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RESPRESIDUI, MyGlb.PANEL_FORM, "Resp. Residui");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_RESPRESIDUI, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_RESPRESIDUI, PPQRY_ACC5, "A.RESPONSABILE_RES", "RESPONSABILE_RES", 5, 40, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_LIST, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_LIST, "Cod. Monitoraggio");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_FORM, 16, 320, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_FORM, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODMONITORAG, MyGlb.PANEL_FORM, "Cod. Monitoraggio");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CODMONITORAG, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CODMONITORAG, PPQRY_ACC5, "A.COD_MONITORAGGIO", "ACCCODMONITO", 5, 4, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_LIST, 132);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_LIST, "VOCI PS DESCRIZIONE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_FORM, 180, 320, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_FORM, 132);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VOCIPSDESCRI, MyGlb.PANEL_FORM, "VOCI PS DESCRIZIONE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_VOCIPSDESCRI, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_VOCIPSDESCRI, PPQRY_VOCIPS, "MIN(A.DESCRIZIONE)", "VOCIPSDESCRI", 5, 99, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_FORM, 80, 408, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_UTENTE1, PAG_ACCERTAMENTO_ALTRIDATI, GRP_ACCERTAMENTO_INSERIMENTO);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_UTENTE1, PPQRY_ACC5, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_FORM, 216, 408, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_FORM, 48);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATA1, PAG_ACCERTAMENTO_ALTRIDATI, GRP_ACCERTAMENTO_INSERIMENTO);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATA1, PPQRY_ACC5, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_FORM, 380, 408, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_UTENTE, PAG_ACCERTAMENTO_ALTRIDATI, GRP_ACCERTAMENTO_AGGIORNAMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_UTENTE, PPQRY_ACC5, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_LIST, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_LIST, "Data");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_FORM, 516, 408, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_FORM, 48);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATA2, MyGlb.PANEL_FORM, "Data");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATA2, PAG_ACCERTAMENTO_ALTRIDATI, GRP_ACCERTAMENTO_AGGIORNAMENT);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATA2, PPQRY_ACC5, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.PANEL_LIST, 572, 32, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.PANEL_FORM, 580, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTAVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NOTAVUOTA, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NOTAVUOTA, -1, "", "NOTAVUOTA", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.PANEL_FORM, 580, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_SELEZIONNOTE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_SELEZIONNOTE, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_SELEZIONNOTE, -1, "", "SELEZIONNOTE", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.PANEL_LIST, 612, 48, 64, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.PANEL_FORM, 536, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NOTE1, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_LIST, 136);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_FORM, 460, 272, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_FORM, 64);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAREGECONO, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATAREGECONO, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATAREGECONO, PPQRY_ACC5, "A.DATA_REG_ECONOMICA", "ACCDATREGECO", 6, 15, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_LIST, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_LIST, "Data Scadenza");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_FORM, 28, 200, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_FORM, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATASCADENZA, MyGlb.PANEL_FORM, "Data Scadenza");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATASCADENZA, PAG_ACCERTAMENTO_ALTRIDATI, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATASCADENZA, PPQRY_ACC5, "A.DATA_SCADENZA", "ACCDATASCADE", 6, 10, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_LIST, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_LIST, "BEN RAGIONE SOCIALE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_FORM, 4, 460, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_FORM, 124);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_BENRAGIOSOCI, MyGlb.PANEL_FORM, "BEN RAG. SOCIALE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_BENRAGIOSOCI, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_BENRAGIOSOCI, PPQRY_BEN, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_LIST, 36);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_LIST, "NOTE");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_FORM, 4, 460, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_FORM, 36);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_FORM, 2);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NOTE2, MyGlb.PANEL_FORM, "NOTE");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NOTE2, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NOTE2, PPQRY_ACC5, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_LIST, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_LIST, "FATTORI TIPO");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_FORM, 4, 460, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORITIPO, MyGlb.PANEL_FORM, "FATT. TIPO");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FATTORITIPO, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FATTORITIPO, PPQRY_FATTORI1, "A.TIPO", "FATTORITIPO", 5, 1, 0, -13997);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_FATTORITIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_FATTORITIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_FATTORITIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_LIST, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_LIST, "NUMERO PLUR");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_FORM, 4, 468, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_NUMEROPLUR1, MyGlb.PANEL_FORM, "NUM. PLUR");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_NUMEROPLUR1, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_NUMEROPLUR1, PPQRY_ACC5, "A.NUMERO_PLUR", "NUMERO_PLUR", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_LIST, 16);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_LIST, "E");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_FORM, 4, 400, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_FORM, 16);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_E1, MyGlb.PANEL_FORM, "E");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_E1, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_E1, PPQRY_ACC5, "A.E", "E", 5, 1, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_FORM, 556, 200, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FINANZIAMENT, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FINANZIAMENT, PPQRY_ACC5, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 368, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_PROGUNITORGA, MyGlb.PANEL_FORM, "PR. UNITA ORGANIZZATIVA");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_PROGUNITORGA, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_PROGUNITORGA, PPQRY_ACC5, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
  }

  private void PAN_ACCERTAMENTO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_QUERY, 19);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~DEBITORE~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E~~,~~CAPITOLO~~,0) as CAPDESCRCAPI, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E~~,~~CAPITOLO~~,~~ARTICOLO~~) as CAPDESCRARTI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_CAP, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
    SQL.append("  A.TIPO as FATTORITIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~D_DATA_REG~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_FATTORI1, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_FATTORI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_FATTORI1, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~D_DATA_REG~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~COD_IMP_ECO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~D_DATA_REG~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_FATTORI2, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_FATTORI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_FATTORI2, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.DESCRIZIONE, '', '', A.DESCRIZIONE) as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A, ");
    SQL.append("  RICLASSIFICAZIONI B ");
    SQL.append("where (A.CODICE = ~~VOCE_ECON~~) ");
    SQL.append("and   (A.CODICE = B.VOCE_ECON) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (B.E_S = ~~E~~) ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(~~TBL_VALORICAP6.ROWNAMETITOL~~, -1)) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(~~TBL_VALORICAP6.ROWNAMECATEG~~, -1)) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP6.ROWNAMCODINT~~, -1)) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(~~TBL_VALORICAP6.ROWNAMCODTER~~, -1)) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_VOCIECONOMIC, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.DESCRIZIONE as RICLGESTDESC ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST A, ");
    SQL.append("  RICLASSIFICAZIONI B, ");
    SQL.append("  CODICI_GESTIONALI C ");
    SQL.append("where (C.CODICE = ~~CODICE_GESTIONALE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE_GESTIONALE) ");
    SQL.append("and   (A.PROGR_RICLASSIFICAZIONI = B.PROGRESSIVO) ");
    SQL.append("and   (C.E_S = B.E_S) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (A.E_S = ~~E~~) ");
    SQL.append("and   (B.TITOLO = ~~TBL_VALORICAP6.ROWNAMETITOL~~) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(~~TBL_VALORICAP6.ROWNAMECATEG~~, -1)) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP6.ROWNAMCODINT~~, -1)) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(~~TBL_VALORICAP6.ROWNAMCODTER~~, -1)) ");
    SQL.append("and   (B.VOCE_ECON = ~~VOCE_ECON~~) ");
    SQL.append("and   ((C.SCADENZA IS NULL) OR C.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_RICLASSIGEST, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_RICLASSIGEST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_RICLASSIGEST, "RICLASSIFICAZIONI_GEST");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  MIN(A.DESCRIZIONE) as VOCIPSDESCRI ");
    SQL.append("from ");
    SQL.append("  VOCI_PS A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ OR A.ESERCIZIO = 0) ");
    SQL.append("and   (A.TIPO_STAMPA = 'PS1') ");
    SQL.append("and   (A.CODICE = ~~ACCCODMONITO~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_VOCIPS, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_VOCIPS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_VOCIPS, "VOCI_PS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~ACCCODLIVEL5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_LIVELLOV, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_LIVELLOV, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_LIVELLOV, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as UNITAORG ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '*** UO SCADUTA *** ' || SO4_UTIL.UNITA_GET_CODICE_VALIDO(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.E_S = 'E') ");
    SQL.append("and   (B.TIPO = 'O') ");
    SQL.append("and   (NVL(B.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) < TRUNC( SYSDATE ) AND B.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_VISTABILANUO, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_VISTABILANUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_VISTABILANUO, "VISTA_BILANCIO_UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~ACCFINANLIGH~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~ACCOPERALIGH~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T57DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T57 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T58, 0, SQL, PFL_ACCERTAMENTO_CAUSALE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T57DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T57 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T58, 1, SQL, PFL_ACCERTAMENTO_CAUSALE1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~D_DATA_REG~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  '*** VINCOLO SCADUTO *** ' || '(' || TO_CHAR ( B.CODICE ) || ')' ");
    SQL.append("from ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   (B.SCADENZA < ~~D_DATA_REG~~ AND B.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("order by 1 ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_ACCERTAMENTO_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~D_DATA_REG~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  '*** VINCOLO SCADUTO *** ' || '(' || TO_CHAR ( B.CODICE ) || ')' ");
    SQL.append("from ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.SCADENZA < ~~D_DATA_REG~~ AND B.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("order by 1 ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_ACCERTAMENTO_TIPOVINCOLO, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~ACCTIPOAVANZ~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_ACCERTAMENTO_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_ACCERTAMENTO_TIPOAVANZO, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T75DESCRSERV ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.CODICE = ~~TIPO_SERVIZIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T75, 0, SQL, PFL_ACCERTAMENTO_TIPOSERVIZI1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T75DESCRSERV ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T75, 1, SQL, PFL_ACCERTAMENTO_TIPOSERVIZI1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_T75, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as ACUTININACF1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as ACUTININACFA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_ACCERTAMENTO_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as ACUTININACF1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as ACUTININACFA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_ACCERTAMENTO_UTENTE1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as ACUTULAGIAF1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as ACUTULAGIAFA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_DUAL, 0, SQL, PFL_ACCERTAMENTO_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as ACUTULAGIAF1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as ACUTULAGIAFA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_DUAL, 1, SQL, PFL_ACCERTAMENTO_UTENTE, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetIMDB(IMDB, "PQRY_ACC5", true);
    PAN_ACCERTAMENTO.set_SetString(MyGlb.MASTER_ROWNAME, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_INTROD as ANNO_INTROD, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.TIPO_AVANZO as ACCTIPOAVANZ, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COD_IMP_ECO as COD_IMP_ECO, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO') as OBIETTIVO, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO') as PROGETTO_ID, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.RESPONSABILE_RES as RESPONSABILE_RES, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.RILEVANTE_ECO as RILEVANTE_ECO, ");
    SQL.append("  A.NUMERO_PLUR as NUMERO_PLUR, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  A.TIPO_SERVIZIO as TIPO_SERVIZIO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  A.COD_MONITORAGGIO as ACCCODMONITO, ");
    SQL.append("  A.COD_LIVELLO_5 as ACCCODLIVEL5, ");
    SQL.append("  A.CODICE_EUROPEO as ACCCODICEURO, ");
    SQL.append("  A.DATA_SCADENZA as ACCDATASCADE, ");
    SQL.append("  A.ANNO_ACC_PROVENIENZA as ANNO_ACC_PROVENIENZA, ");
    SQL.append("  A.NUMERO_ACC_PROVENIENZA as NUMERO_ACC_PROVENIENZA, ");
    SQL.append("  A.DATA_REG_ECONOMICA as ACCDATREGECO, ");
    SQL.append("  A.FINANZIAMENTO_LIGHT as ACCFINANLIGH, ");
    SQL.append("  A.OPERA_LIGHT as ACCOPERALIGH, ");
    SQL.append("  A.ANNO_ACC_PREC as ANNOACCPREC, ");
    SQL.append("  A.NUMERO_ACC_PREC as NUMERACCPREC ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_ACC5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC A ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_ACC5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.NUMERO_ACC = ~~TBL_PARAMETRI82.PARAMNUMEACC~~) ");
    SQL.append("and   (A.ANNO_ACC = ~~TBL_PARAMETRI82.PARAMANNOACC~~) ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_ACC5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetQuery(PPQRY_ACC5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetQuery(PPQRY_ACC5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetQuery(PPQRY_ACC5, 5, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_ACC5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(0, "ACC");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCERTAMENTO.Status() == 2)
    {
      int oldListQBE = PAN_ACCERTAMENTO.iUseListQBE;
      PAN_ACCERTAMENTO.iUseListQBE = 0;
      PAN_ACCERTAMENTO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCERTAMENTO.PanelCommand(Glb.PCM_FIND);
      PAN_ACCERTAMENTO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRVARI_Init()
  {

    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, "49B18A0E-A142-495B-879E-693BB06CBDEC");
    PAN_PARAMETRVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, "Importo Attuale");
    PAN_PARAMETRVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, "");
    PAN_PARAMETRVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, "D3D5AC9C-5EE4-4AC5-BD70-B7E62A6AC575");
    PAN_PARAMETRVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, "Importo");
    PAN_PARAMETRVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAMETRVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRVARI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_LIST, "Importo Attuale");
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_FORM, 24, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTATTUAL, MyGlb.PANEL_FORM, "Imp. Attuale");
    PAN_PARAMETRVARI.SetFieldPage(PFL_PARAMETRVARI_IMPORTATTUAL, -1, -1);
    PAN_PARAMETRVARI.SetFieldPanel(PFL_PARAMETRVARI_IMPORTATTUAL, PPQRY_IMPORTTOTAL5, "A.ROWNAMIMPATT", "ROWNAMIMPATT", 3, 15, 2, -13997);
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_LIST, 192, 8, 160, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_FORM, 528, 4, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRVARI.SetFieldPage(PFL_PARAMETRVARI_VISUALIMPORT, -1, -1);
    PAN_PARAMETRVARI.SetFieldPanel(PFL_PARAMETRVARI_VISUALIMPORT, -1, "", "VISUALIMPORT", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRVARI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRVARI.SetIMDB(IMDB, "PQRY_IMPORTTOTAL5", true);
    PAN_PARAMETRVARI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRVARI.SetQueryIMDB(PPQRY_IMPORTTOTAL5, IMDBDef14.PQRY_IMPORTTOTAL5_RS, IMDBDef4.TBL_PARAMETRVARI);
    JustLoaded = true;
    PAN_PARAMETRVARI.SetFieldPrimaryIndex(PFL_PARAMETRVARI_IMPORTATTUAL, IMDBDef4.FLD_PARAMETRVARI_ROWNAMIMPATT);
    PAN_PARAMETRVARI.SetMasterTable(0, "PARAMETRVARI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRVARI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRVARI.iUseListQBE;
      PAN_PARAMETRVARI.iUseListQBE = 0;
      PAN_PARAMETRVARI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRVARI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRVARI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_ValidateRow(Cancel);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_DynamicProperties();
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_DynamicProperties();
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_OnChangeRow();
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
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DEBITORE) PAN_DEBITORE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
