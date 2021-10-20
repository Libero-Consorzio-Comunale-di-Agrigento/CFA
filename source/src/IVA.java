// **********************************************
// I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class IVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ESERCIZIO = 0;
  private static int PFL_PARAMETRI_TIPOVISTMESE = 1;
  private static int PFL_PARAMETRI_PERIODO1 = 2;
  private static int PFL_PARAMETRI_PERIODO = 3;
  private static int PFL_PARAMETRI_LIQUIDAZION1 = 4;

  private static int PPQRY_PARAMETRI535 = 0;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_NEWTABBEVIEW;
  private static int PFL_BOLLATI_REGISTBOLLAT = 0;
  private static int PFL_BOLLATI_TIPOBOLLATO1 = 1;
  private static int PFL_BOLLATI_INTESTAZIONE = 2;
  private static int PFL_BOLLATI_DEFINITIVO = 3;
  private static int PFL_BOLLATI_ATTIVITA = 4;
  private static int PFL_BOLLATI_REGISTBOLLA1 = 5;

  private static int PPQRY_T16 = 0;

  private static int PPQRY_T09 = 1;


  IDPanel PAN_BOLLATI;
  private static int PFL_DOCUMENTI_BENEFICIARI1 = 0;
  private static int PFL_DOCUMENTI_DOCUMENTO1 = 1;
  private static int PFL_DOCUMENTI_DATA1 = 2;
  private static int PFL_DOCUMENTI_INFODOC1 = 3;
  private static int PFL_DOCUMENTI_CODICE1 = 4;
  private static int PFL_DOCUMENTI_ANNOPROG1 = 5;
  private static int PFL_DOCUMENTI_NUMEROPROG1 = 6;
  private static int PFL_DOCUMENTI_ANNODOC1 = 7;
  private static int PFL_DOCUMENTI_DATADOC1 = 8;
  private static int PFL_DOCUMENTI_NUMERODOC = 9;
  private static int PFL_DOCUMENTI_STORNO = 10;
  private static int PFL_DOCUMENTI_BUONI = 11;
  private static int PFL_DOCUMENTI_LABELDOCUME2 = 12;
  private static int PFL_DOCUMENTI_LABELDOCUME3 = 13;
  private static int PFL_DOCUMENTI_CODICEDOC1 = 14;
  private static int PFL_DOCUMENTI_MODDOC = 15;
  private static int PFL_DOCUMENTI_ETIDETIVADOC = 16;
  private static int PFL_DOCUMENTI_ETIREGBLABLA = 17;
  private static int PFL_DOCUMENTI_NUMEROREG4 = 18;
  private static int PFL_DOCUMENTI_DATAREG = 19;
  private static int PFL_DOCUMENTI_RIVENDITA = 20;
  private static int PFL_DOCUMENTI_ETICHEREGIST = 21;

  private static int PPQRY_FAT9 = 0;

  private static int PPQRY_BEN1 = 1;


  IDPanel PAN_DOCUMENTI;
  private static int PFL_DOCUMENTI1_NUMEROREG2 = 0;
  private static int PFL_DOCUMENTI1_DATADOC = 1;
  private static int PFL_DOCUMENTI1_LIQUIDAZION2 = 2;
  private static int PFL_DOCUMENTI1_BENEFICIARIO = 3;
  private static int PFL_DOCUMENTI1_DOCUMENTO = 4;
  private static int PFL_DOCUMENTI1_DATA = 5;
  private static int PFL_DOCUMENTI1_INFODOC = 6;
  private static int PFL_DOCUMENTI1_CONTAB = 7;
  private static int PFL_DOCUMENTI1_REGISTRAZIO1 = 8;
  private static int PFL_DOCUMENTI1_ANNOPROG = 9;
  private static int PFL_DOCUMENTI1_NUMEROPROG = 10;
  private static int PFL_DOCUMENTI1_ANNODOC = 11;
  private static int PFL_DOCUMENTI1_LABELDOCUMEN = 12;
  private static int PFL_DOCUMENTI1_LABELDOCUME1 = 13;
  private static int PFL_DOCUMENTI1_CODICEDOC = 14;
  private static int PFL_DOCUMENTI1_ETIDETIVADO2 = 15;

  private static int PPQRY_FAT2 = 0;


  IDPanel PAN_DOCUMENTI1;
  private static int PFL_CORRISPETTIV_NUMEROREG3 = 0;
  private static int PFL_CORRISPETTIV_DDATAREG2 = 1;
  private static int PFL_CORRISPETTIV_INFOCORRISPE = 2;
  private static int PFL_CORRISPETTIV_ANNOREG = 3;
  private static int PFL_CORRISPETTIV_TIPOREGISTRO = 4;
  private static int PFL_CORRISPETTIV_TIPOBOLLATO = 5;
  private static int PFL_CORRISPETTIV_DESCRIZIONE = 6;
  private static int PFL_CORRISPETTIV_CORRISPETTIV = 7;
  private static int PFL_CORRISPETTIV_LABEL = 8;
  private static int PFL_CORRISPETTIV_ETIDETIVADO1 = 9;

  private static int PPQRY_TCO = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_CORRISPETTIV;
  private static int PFL_DETTAGLIIVA2_NUMEROREGS = 0;
  private static int PFL_DETTAGLIIVA2_DDATAREGS = 1;
  private static int PFL_DETTAGLIIVA2_NUMEROREG = 2;
  private static int PFL_DETTAGLIIVA2_DDATAREG = 3;
  private static int PFL_DETTAGLIIVA2_SERVIZIO = 4;
  private static int PFL_DETTAGLIIVA2_NUMEROREG1 = 5;
  private static int PFL_DETTAGLIIVA2_DDATAREG1 = 6;
  private static int PFL_DETTAGLIIVA2_LIQUIDAZIONE = 7;
  private static int PFL_DETTAGLIIVA2_IMPONIBILE1 = 8;
  private static int PFL_DETTAGLIIVA2_IVA1 = 9;
  private static int PFL_DETTAGLIIVA2_ALIQUOTA1 = 10;
  private static int PFL_DETTAGLIIVA2_ESENZIONE1 = 11;
  private static int PFL_DETTAGLIIVA2_INDEDUCIBILE = 12;
  private static int PFL_DETTAGLIIVA2_TOT1 = 13;
  private static int PFL_DETTAGLIIVA2_TOT2 = 14;
  private static int PFL_DETTAGLIIVA2_REGISTRAZION = 15;
  private static int PFL_DETTAGLIIVA2_REGISTRAZDEF = 16;

  private static int PPQRY_IVA9 = 0;


  IDPanel PAN_DETTAGLIIVA2;
  private static int PFL_DETTAGLIIVA_IMPONIBILE2 = 0;
  private static int PFL_DETTAGLIIVA_IVA2 = 1;
  private static int PFL_DETTAGLIIVA_ALIQUOTA2 = 2;
  private static int PFL_DETTAGLIIVA_ESENZIONE2 = 3;
  private static int PFL_DETTAGLIIVA_SOMMA3 = 4;
  private static int PFL_DETTAGLIIVA_SOOMA2 = 5;

  private static int PPQRY_IVAPRI1 = 0;

  private static int PPQRY_T7 = 1;


  IDPanel PAN_DETTAGLIIVA;
  private static int PFL_DETTAGLIIVA1_IMPONIBILE = 0;
  private static int PFL_DETTAGLIIVA1_IVA = 1;
  private static int PFL_DETTAGLIIVA1_ALIQUOTA = 2;
  private static int PFL_DETTAGLIIVA1_ESENZIONE = 3;
  private static int PFL_DETTAGLIIVA1_SOMMA1L = 4;
  private static int PFL_DETTAGLIIVA1_SOMMA2L = 5;

  private static int PPQRY_IVAPRI = 0;


  IDPanel PAN_DETTAGLIIVA1;

  // Definition of Global Variables
  private IDVariant FIRSTTIME = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PERSIVAREGIS = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PERSLIQLIV = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI394(IMDB);
    //
    //
    Init_PQRY_T16(IMDB);
    Init_PQRY_FAT9(IMDB);
    Init_PQRY_FAT2(IMDB);
    Init_PQRY_TCO(IMDB);
    Init_PQRY_PARAMETRI535(IMDB);
    Init_PQRY_PARAMETRI535_RS(IMDB);
    Init_PQRY_IVA9(IMDB);
    Init_PQRY_IVAPRI1(IMDB);
    Init_PQRY_IVAPRI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI394(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI394, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI394, "TBL_PARAMETRI394");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMTIVIME, "ROWNAMTIVIME");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMTIVIME,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMPERMES, "ROWNAMPERMES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMPERMES,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMPERTRI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI394,IMDBDef2.FLD_PARAMETRI394_ROWNAMELIQUI,1,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI394, 0);
  }

  private static void Init_PQRY_T16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_T16, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_T16, "PQRY_T16");
    IMDB.set_FldCode(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_ATTIVITA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_T16,IMDBDef10.PQSL_T16_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_T16, 0);
  }

  private static void Init_PQRY_FAT9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT9, 16);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT9, "PQRY_FAT9");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_CODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMERO_RIF, "NUMERO_RIF");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMERO_RIF,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_DATA_DOC, "DATA_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_DATA_DOC,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECORINFODOC, "RECORINFODOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECORINFODOC,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_STORNO, "STORNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_STORNO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_BUONI, "BUONI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_BUONI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECFATCODDOC, "RECFATCODDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECFATCODDOC,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECORDMODDOC, "RECORDMODDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECORDMODDOC,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMEROREG, "NUMEROREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_NUMEROREG,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_DATAREG, "DATAREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_DATAREG,6,0,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECORFATRIVE, "RECORFATRIVE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT9,IMDBDef10.PQSL_FAT9_RECORFATRIVE,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT9, 0);
  }

  private static void Init_PQRY_FAT2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT2, 10);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT2, "PQRY_FAT2");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_DATA_DOC, "DATA_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_DATA_DOC,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RAGIONE_SOCIALE,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RECORDCONTAB, "RECORDCONTAB");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RECORDCONTAB,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RECORINFODOC, "RECORINFODOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RECORINFODOC,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RECFATCODDOC, "RECFATCODDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT2,IMDBDef10.PQSL_FAT2_RECFATCODDOC,1,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT2, 0);
  }

  private static void Init_PQRY_TCO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TCO, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_TCO, "PQRY_TCO");
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_ANNO_REG, "ANNO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_ANNO_REG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_RECOINFOCORR, "RECOINFOCORR");
    IMDB.SetFldParams(IMDBDef10.PQRY_TCO,IMDBDef10.PQSL_TCO_RECOINFOCORR,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_TCO, 0);
  }

  private static void Init_PQRY_PARAMETRI535(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI535, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI535, "PQRY_PARAMETRI535");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, "ROWNAMTIVIME");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES, "ROWNAMPERMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERTRI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535,IMDBDef10.PQSL_PARAMETRI535_ROWNAMELIQUI,1,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI535, 0);
  }

  private static void Init_PQRY_PARAMETRI535_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI535_RS, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI535_RS, "PQRY_PARAMETRI535_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, "ROWNAMTIVIME");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES, "ROWNAMPERMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERTRI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI535_RS,IMDBDef10.PQSL_PARAMETRI535_ROWNAMELIQUI,1,1,0);
  }

  private static void Init_PQRY_IVA9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_IVA9, 11);
    IMDB.set_TblCode(IMDBDef10.PQRY_IVA9, "PQRY_IVA9");
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECONUMEREG1, "RECONUMEREG1");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECONUMEREG1,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECODDATREG1, "RECODDATREG1");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECODDATREG1,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECIVANUMRES, "RECIVANUMRES");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECIVANUMRES,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECORIVASERV, "RECORIVASERV");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECORIVASERV,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECORDLIQUID, "RECORDLIQUID");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECORDLIQUID,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECIVADDARES, "RECIVADDARES");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECIVADDARES,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECORIVAIMPO, "RECORIVAIMPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_RECORIVAIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_IVA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_ALIQUOTA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_IVA_INDED, "IVA_INDED");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_IVA_INDED,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA9,IMDBDef10.PQSL_IVA9_DESCRIZIONE,5,30,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_IVA9, 0);
  }

  private static void Init_PQRY_IVAPRI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_IVAPRI1, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_IVAPRI1, "PQRY_IVAPRI1");
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_CODICE_DOC,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_IMPONIBILE, "IMPONIBILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_IMPONIBILE,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_IVA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_ALIQUOTA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_CODICE_ESENZIONE, "CODICE_ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI1,IMDBDef10.PQSL_IVAPRI1_CODICE_ESENZIONE,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_IVAPRI1, 0);
  }

  private static void Init_PQRY_IVAPRI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_IVAPRI, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_IVAPRI, "PQRY_IVAPRI");
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_IMPONIBILE, "IMPONIBILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_IMPONIBILE,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_ALIQUOTA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_CODICE_ESENZIONE, "CODICE_ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_CODICE_ESENZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAPRI,IMDBDef10.PQSL_IVAPRI_DESCRIZIONE,5,30,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_IVAPRI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public IVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public IVA()
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
    FormIdx = MyGlb.FRM_IVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2E3FD491-F763-477F-86B6-BBC10B94AD17";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 760;
    DesignHeight = 666;
    set_Caption(new IDVariant("I.v.a."));
    //
    Frames = new AFrame[11];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 760;
    Frames[1].Height = 640;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0625;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 760;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 760;
    Frames[2].FixedHeight = 40;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "98DCAE82-1D09-4ED2-8CCC-C5797591BE3F");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 520, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 760;
    Frames[3].Height = 600;
    Frames[3].Caption = "New Tabbed View";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 600;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[3].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "616CD943-C11D-4211-8AD8-A4FBA3B92F4B";
    TAB_NEWTABBEVIEW.SetItemCount(4);
    TAB_NEWTABBEVIEW.Placement = 1;
    TAB_NEWTABBEVIEW.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Bollati";
    Frames[4].Parent = this;
    PAN_BOLLATI = new IDPanel(w, this, 4, "PAN_BOLLATI");
    Frames[4].Content = PAN_BOLLATI;
    PAN_BOLLATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOLLATI.VS = MainFrm.VisualStyleList;
    PAN_BOLLATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B9AFC934-739F-4C56-AD89-61878DE463CC");
    PAN_BOLLATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 680, 456, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOLLATI.InitStatus = 2;
    PAN_BOLLATI_Init();
    PAN_BOLLATI_InitFields();
    PAN_BOLLATI_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(1, Frames[4], 0, "", "Bollati", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Documenti";
    Frames[5].Parent = this;
    PAN_DOCUMENTI = new IDPanel(w, this, 5, "PAN_DOCUMENTI");
    Frames[5].Content = PAN_DOCUMENTI;
    PAN_DOCUMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMENTI.VS = MainFrm.VisualStyleList;
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D180EB12-8F67-4A64-BD68-76A66B1E8AFF");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 36, 876, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMENTI.InitStatus = 2;
    PAN_DOCUMENTI_Init();
    PAN_DOCUMENTI_InitFields();
    PAN_DOCUMENTI_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[5], 0, "", "Documenti", "");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[6].InTabbed = true;
    Frames[6].Caption = "Documenti";
    Frames[6].Parent = this;
    PAN_DOCUMENTI1 = new IDPanel(w, this, 6, "PAN_DOCUMENTI1");
    Frames[6].Content = PAN_DOCUMENTI1;
    PAN_DOCUMENTI1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMENTI1.VS = MainFrm.VisualStyleList;
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D43B4C11-AA73-4768-842E-9A9C18A5711A");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMENTI1.InitStatus = 2;
    PAN_DOCUMENTI1_Init();
    PAN_DOCUMENTI1_InitFields();
    PAN_DOCUMENTI1_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(3, Frames[6], 0, "", "Documenti 1", "");
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[7].InTabbed = true;
    Frames[7].Caption = "Corrispettivi";
    Frames[7].Parent = this;
    PAN_CORRISPETTIV = new IDPanel(w, this, 7, "PAN_CORRISPETTIV");
    Frames[7].Content = PAN_CORRISPETTIV;
    PAN_CORRISPETTIV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CORRISPETTIV.VS = MainFrm.VisualStyleList;
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EB4FDFA5-771D-406E-9107-E30B2F4A7869");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 680, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CORRISPETTIV.InitStatus = 2;
    PAN_CORRISPETTIV_Init();
    PAN_CORRISPETTIV_InitFields();
    PAN_CORRISPETTIV_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(4, Frames[7], 0, "", "Corrispettivi", "");
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    PAN_DOCUMENTI.SetSubFrame(PFL_DOCUMENTI_ETIDETIVADOC,8);
    Frames[8].set_SubFrame(true);
    Frames[8].Caption = "Dettagli I.V.A.";
    Frames[8].Parent = this;
    Frames[8].MinWidth = Frames[8].Width;
    Frames[8].MaxWidth = Frames[8].Width;
    Frames[8].MinHeight = Frames[8].Height;
    Frames[8].MaxHeight = Frames[8].Height;
    PAN_DETTAGLIIVA2 = new IDPanel(w, this, 8, "PAN_DETTAGLIIVA2");
    Frames[8].Content = PAN_DETTAGLIIVA2;
    Frames[8].set_PUseSmallIcon(false);
    PAN_DETTAGLIIVA2.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLIIVA2.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DEA51CE3-6098-4A0C-8A3C-CE224CFDCBAE");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 8, 1072, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLIIVA2.InitStatus = 2;
    PAN_DETTAGLIIVA2_Init();
    PAN_DETTAGLIIVA2_InitFields();
    PAN_DETTAGLIIVA2_InitQueries();
    Frames[9] = new AFrame(9);
    Frames[9].Parent = this;
    PAN_DOCUMENTI1.SetSubFrame(PFL_DOCUMENTI1_ETIDETIVADO2,9);
    Frames[9].set_SubFrame(true);
    Frames[9].Caption = "Dettagli I.V.A.";
    Frames[9].Parent = this;
    Frames[9].MinWidth = Frames[9].Width;
    Frames[9].MaxWidth = Frames[9].Width;
    Frames[9].MinHeight = Frames[9].Height;
    Frames[9].MaxHeight = Frames[9].Height;
    PAN_DETTAGLIIVA = new IDPanel(w, this, 9, "PAN_DETTAGLIIVA");
    Frames[9].Content = PAN_DETTAGLIIVA;
    Frames[9].set_PUseSmallIcon(false);
    PAN_DETTAGLIIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLIIVA.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AD6635D8-5842-4C76-9F80-E02A46A3877E");
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 4, 444, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLIIVA.InitStatus = 2;
    PAN_DETTAGLIIVA_Init();
    PAN_DETTAGLIIVA_InitFields();
    PAN_DETTAGLIIVA_InitQueries();
    Frames[10] = new AFrame(10);
    Frames[10].Parent = this;
    PAN_CORRISPETTIV.SetSubFrame(PFL_CORRISPETTIV_ETIDETIVADO1,10);
    Frames[10].set_SubFrame(true);
    Frames[10].Caption = "Dettagli I.V.A.";
    Frames[10].Parent = this;
    Frames[10].MinWidth = Frames[10].Width;
    Frames[10].MaxWidth = Frames[10].Width;
    Frames[10].MinHeight = Frames[10].Height;
    Frames[10].MaxHeight = Frames[10].Height;
    PAN_DETTAGLIIVA1 = new IDPanel(w, this, 10, "PAN_DETTAGLIIVA1");
    Frames[10].Content = PAN_DETTAGLIIVA1;
    Frames[10].set_PUseSmallIcon(false);
    PAN_DETTAGLIIVA1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLIIVA1.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F0E1C03F-DA94-4D40-B4DB-2EC79B392F44");
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 416, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLIIVA1.InitStatus = 2;
    PAN_DETTAGLIIVA1_Init();
    PAN_DETTAGLIIVA1_InitFields();
    PAN_DETTAGLIIVA1_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_LISTMENU+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_MENU3+BaseCmdSetIdx, "M" + (MyGlb.CMD_LISTMENU+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SECOLISTMENU+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_SECONDOMENU+BaseCmdSetIdx, "M" + (MyGlb.CMD_SECOLISTMENU+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COLILMENDEPA+BaseCmdLinIdx)
      {
        CollassailmenudeiParametri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESTRAIVAEXCE+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_ESTRAIVAEXCE, 0, this);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIORESIGIB+BaseCmdLinIdx)
      {
        ApriAggiornamentoEsegibilità();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUMERAZIOIVA+BaseCmdLinIdx)
      {
        ApriNumerazioneIVA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONFERMAIVA+BaseCmdLinIdx)
      {
        ApriConfermaIVA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VENTILAZIIVA+BaseCmdLinIdx)
      {
        ApriVentilazioneIVA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VERIFICAIVA+BaseCmdLinIdx)
      {
        ApriVerificaIVA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VERIFIVASOSP+BaseCmdLinIdx)
      {
        ApriVerificaIVASospesi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COIVAINATDIE+BaseCmdLinIdx)
      {
        ApriControlloIVAInAttesaDiEsigibilità();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RIEPERCODSTA+BaseCmdLinIdx)
      {
        ApriRiepilogoPerCodiceStatistico();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RIEPERCOSTSO+BaseCmdLinIdx)
      {
        ApriRiepilogoPerCodiceStatisticoSospesi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RIEPIACQUCEE+BaseCmdLinIdx)
      {
        ApriRiepilogoAcquistiCee();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RIEACQCEESOS+BaseCmdLinIdx)
      {
        ApriRiepilogoAcquistiCeeSospesi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGIACQUVEND+BaseCmdLinIdx)
      {
        ApriRegistroAcquistiVendite();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGISTCORRIS+BaseCmdLinIdx)
      {
        ApriRegistroCorrispettivi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGRIEACQVEN+BaseCmdLinIdx)
      {
        ApriRegistroRiepilogativoAcquistiVendite();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGRIEACVESO+BaseCmdLinIdx)
      {
        ApriRegistroRiepilogativoAcquistiVenditeSospesi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGIRIEPCORR+BaseCmdLinIdx)
      {
        ApriRegistroRiepilogativoCorrispettivi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_LIQUIDAZIIVA+BaseCmdLinIdx)
      {
        ApriLiquidazioneIVA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMLIQPERIVA+BaseCmdLinIdx)
      {
        ComunicazioneLiquidazioniPeriodicheIVA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COLLEGCAPITO+BaseCmdLinIdx)
      {
        CollegamentoCapitoli();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESTPERCONIVA+BaseCmdLinIdx)
      {
        EstrazioneperControlliIVA();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI394, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IVA_PARAMETRI535();
      }
      PAN_BOLLATI.UpdatePanel(MainFrm);
      PAN_DOCUMENTI.UpdatePanel(MainFrm);
      PAN_DOCUMENTI1.UpdatePanel(MainFrm);
      PAN_CORRISPETTIV.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DETTAGLIIVA2.UpdatePanel(MainFrm);
      PAN_DETTAGLIIVA.UpdatePanel(MainFrm);
      PAN_DETTAGLIIVA1.UpdatePanel(MainFrm);
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
    return (obj instanceof IVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? IVA.class.getName() : (Glb.ClassWithPackage(IVA.class) ? IVA.class.getName().substring(IVA.class.getPackage().getName().length() + 1) : IVA.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Aggiornamento Esegibilità
  // **********************************************************************
  public int ApriAggiornamentoEsegibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Aggiornamento Esegibilità Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEESERC, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      MainFrm.Show(MyGlb.FRM_AGGIORESIGIB, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriAggiornamentoEsegibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Numerazione IVA
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriNumerazioneIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Numerazione IVA Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMDALMES, 0, IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0)));
      MainFrm.Show(MyGlb.FRM_NUMERAZIOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriNumerazioneIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Conferma IVA
  // **********************************************************************
  public int ApriConfermaIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Conferma IVA Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEESERC, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0, (new IDVariant("1 - Acquisti")));
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0, (new IDVariant("2 - Acquisti in Attesa di Esigibilità")));
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0, (new IDVariant("3 - Vendite")));
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0, (new IDVariant("4 - Corrispettivi")));
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0, (new IDVariant("5 - Vendite Esigibili al Pagamento")));
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0, (new IDVariant("6 - Vendite Debitori non Codificati")));
      }
      MainFrm.Show(MyGlb.FRM_CONFERMAIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriConfermaIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ventilazione IVA
  // **********************************************************************
  public int ApriVentilazioneIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ventilazione IVA Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      MainFrm.Show(MyGlb.FRM_VENTILAZIIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriVentilazioneIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Registro Acquisti Vendite
  // **********************************************************************
  public int ApriRegistroAcquistiVendite ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Registro Acquisti Vendite Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      MainFrm.Show(MyGlb.FRM_REGIACQUVEND, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRegistroAcquistiVendite", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Registro Corrispettivi
  // **********************************************************************
  public int ApriRegistroCorrispettivi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Registro Corrispettivi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PAR70, IMDBDef2.FLD_PAR70_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR70, IMDBDef2.FLD_PAR70_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR70, IMDBDef2.FLD_PAR70_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR70, IMDBDef2.FLD_PAR70_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR70, IMDBDef2.FLD_PAR70_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      MainFrm.Show(MyGlb.FRM_REGISTCORRIS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRegistroCorrispettivi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Registro Riepilogativo Acquisti Vendite
  // **********************************************************************
  public int ApriRegistroRiepilogativoAcquistiVendite ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Registro Riepilogativo Acquisti Vendite Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEANNO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0));
      MainFrm.Show(MyGlb.FRM_REGRIEACQVEN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRegistroRiepilogativoAcquistiVendite", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Registro Riepilogativo Acquisti Vendite Sospesi
  // **********************************************************************
  public int ApriRegistroRiepilogativoAcquistiVenditeSospesi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Registro Riepilogativo Acquisti Vendite Sospesi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVEN, IMDBDef2.FLD_REGRIEACQVEN_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVEN, IMDBDef2.FLD_REGRIEACQVEN_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVEN, IMDBDef2.FLD_REGRIEACQVEN_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVEN, IMDBDef2.FLD_REGRIEACQVEN_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVEN, IMDBDef2.FLD_REGRIEACQVEN_ROWNAMEANNO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0));
      MainFrm.Show(MyGlb.FRM_REGRIEACVESO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRegistroRiepilogativoAcquistiVenditeSospesi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Checkpers
  // **********************************************************************
  public int Checkpers ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_STAMPAIVA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STAMPAIVAPE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WIVALIQUIDAZ = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WIVALIQUIDLI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_STAMPAIVA = (new IDVariant("stampa_iva", IDVariant.STRING));
      v_STAMPAIVAPE = (new IDVariant("stampa_iva_pe", IDVariant.STRING));
      v_WIVALIQUIDAZ = (new IDVariant("w_iva_liquidazione", IDVariant.STRING));
      v_WIVALIQUIDLI = (new IDVariant("w_iva_liquidazione_li", IDVariant.STRING));
      // 
      // Checkpers Body
      // Procedure Body
      // 
      IDVariant v_DIVAREGISTRO = new IDVariant(0,IDVariant.STRING);
      v_DIVAREGISTRO = (new IDVariant("d_iva_registro"));
      IDVariant v_DIVAREGISTPE = new IDVariant(0,IDVariant.STRING);
      v_DIVAREGISTPE = (new IDVariant("d_iva_registro_pe"));
      // 
      // 
      // 
      // 
      if (MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_STAMPAIVA).equals(v_STAMPAIVAPE, true))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGRIEACVESO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_VERIFIVASOSP+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_RIEPERCOSTSO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_RIEACQCEESOS+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGRIEACVESO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_VERIFIVASOSP+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_RIEPERCOSTSO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_RIEACQCEESOS+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_WIVALIQUIDAZ).equals(v_WIVALIQUIDLI, true))
      {
        PERSLIQLIV = (new IDVariant(-1));
      }
      else
      {
        PERSLIQLIV = (new IDVariant(0));
      }
      if (MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_DIVAREGISTRO).equals(v_DIVAREGISTPE, true))
      {
        PERSIVAREGIS = (new IDVariant(-1));
      }
      else
      {
        PERSIVAREGIS = (new IDVariant(0));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "Checkpers", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Registro Riepilogativo Corrispettivi
  // **********************************************************************
  public int ApriRegistroRiepilogativoCorrispettivi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Registro Riepilogativo Corrispettivi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PAR108, IMDBDef2.FLD_PAR108_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR108, IMDBDef2.FLD_PAR108_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR108, IMDBDef2.FLD_PAR108_ROWNAMEANNO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR108, IMDBDef2.FLD_PAR108_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_PAR108, IMDBDef2.FLD_PAR108_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      MainFrm.Show(MyGlb.FRM_REGIRIEPCORR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRegistroRiepilogativoCorrispettivi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Verifica I V A
  // **********************************************************************
  public int ApriVerificaIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Verifica I V A Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE41, IMDBDef2.FLD_NEWTABLE41_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE41, IMDBDef2.FLD_NEWTABLE41_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE41, IMDBDef2.FLD_NEWTABLE41_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      MainFrm.Show(MyGlb.FRM_VERIFICAIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriVerificaIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Verifica I V A Sospesi
  // **********************************************************************
  public int ApriVerificaIVASospesi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Verifica I V A Sospesi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
      MainFrm.Show(MyGlb.FRM_VERIFIVASOSP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriVerificaIVASospesi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Controllo I V A In Attesa Di Esigibilità
  // **********************************************************************
  public int ApriControlloIVAInAttesaDiEsigibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Controllo I V A In Attesa Di Esigibilità Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEANNO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMETB, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      MainFrm.Show(MyGlb.FRM_COIVAINATDIE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriControlloIVAInAttesaDiEsigibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazione I V A
  // **********************************************************************
  public int ApriLiquidazioneIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazione I V A Body
      // Procedure Body
      // 
      if (PERSLIQLIV.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
        MainFrm.Show(MyGlb.FRM_LIQIVAPERLIV, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIIVA, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriLiquidazioneIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comunicazione Liquidazioni Periodiche IVA
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ComunicazioneLiquidazioniPeriodicheIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comunicazione Liquidazioni Periodiche IVA Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_COMLIQPERIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ComunicazioneLiquidazioniPeriodicheIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riepilogo Per Codice Statistico
  // **********************************************************************
  public int ApriRiepilogoPerCodiceStatistico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riepilogo Per Codice Statistico Body
      // Procedure Body
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("IVA_Riep_codstat"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0)));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRiepilogoPerCodiceStatistico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riepilogo Per Codice Statistico Sospesi
  // **********************************************************************
  public int ApriRiepilogoPerCodiceStatisticoSospesi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riepilogo Per Codice Statistico Sospesi Body
      // Procedure Body
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("IVA_Riep_codstat_pe"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0)));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRiepilogoPerCodiceStatisticoSospesi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riepilogo Acquisti Cee
  // **********************************************************************
  public int ApriRiepilogoAcquistiCee ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riepilogo Acquisti Cee Body
      // Procedure Body
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("IVA_Riep_codstatcee"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0)));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRiepilogoAcquistiCee", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riepilogo Acquisti Cee Sospesi
  // **********************************************************************
  public int ApriRiepilogoAcquistiCeeSospesi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riepilogo Acquisti Cee Sospesi Body
      // Procedure Body
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("IVA_Riep_codstatcee_pe"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0)));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ApriRiepilogoAcquistiCeeSospesi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc
  // **********************************************************************
  public int InfoDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT9, IMDBDef10.PQSL_FAT9_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT9, IMDBDef10.PQSL_FAT9_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Mod Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ModDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mod Doc Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_FATTURA, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_FATTURA,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT9, IMDBDef10.PQSL_FAT9_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT9, IMDBDef10.PQSL_FAT9_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ModDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc1
  // **********************************************************************
  public int InfoDoc1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT2, IMDBDef10.PQSL_FAT2_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT2, IMDBDef10.PQSL_FAT2_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "InfoDoc1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Corrispettivo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoCorrispettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Corrispettivo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM57, IMDBDef2.FLD_PARAM57_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM57, IMDBDef2.FLD_PARAM57_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM57, IMDBDef2.FLD_PARAM57_ROWNAMANNREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_ANNO_REG, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM57, IMDBDef2.FLD_PARAM57_ROWNAMNUMREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_NUMERO_REG, 0));
      MainFrm.Show(MyGlb.FRM_INFOCORRISPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "InfoCorrispettivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Collassa il menu dei Parametri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CollassailmenudeiParametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collassa il menu dei Parametri Body
      // Corpo Procedura
      // 
      MainFrm.Collapseexpandparampanel(new IDVariant(MainFrm.CmdObj.GetCmdCode(MyGlb.CMDS_MENU2+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLILMENDEPA+BaseCmdLinIdx].GetIndex()).intValue())), PAN_PARAMETRI);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "CollassailmenudeiParametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrazione per Controlli I V A
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EstrazioneperControlliIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione per Controlli I V A Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ESTDAPECOIVA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "EstrazioneperControlliIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Collegamento Capitoli
  // **********************************************************************
  public int CollegamentoCapitoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collegamento Capitoli Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, 0, ((IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, 0).equals((new IDVariant(1))))?(new IDVariant("S")):(new IDVariant("E"))));
      MainFrm.Show(MyGlb.FRM_COLLEGCAPITO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "CollegamentoCapitoli", _e);
      return -1;
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
      FIRSTTIME = (new IDVariant(0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMTIVIME, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMPERMES, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMPERTRI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMELIQUI, 0, (new IDVariant(0)));
      // PAN_DOCUMENTI1.set_Visible((new IDVariant(0)).booleanValue());
      // PAN_CORRISPETTIV.set_Visible((new IDVariant(0)).booleanValue());
      Checkpers();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "LoadEvent", _e);
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
      FIRSTTIME = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_FATTURA)), true))
        {
          PAN_DOCUMENTI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "EndModal", _e);
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
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, 0).equals((new IDVariant(1)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, 0).equals((new IDVariant(2)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_TIPOVISTMESE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_PERIODO)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_PERIODO1)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIO)), true)) && FieldModified.equals((new IDVariant(-1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0), (new IDVariant(1)), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0), (new IDVariant(12)), (new IDVariant(31))));
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0, MainFrm.Getdatainiziotrimestre(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERTRI, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0)));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0, MainFrm.Getdatatrimestre(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERTRI, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0)));
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMTIVIME, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES, 0),(new IDVariant(1))), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES, 0), MainFrm.Finemese(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMPERMES, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI535, IMDBDef10.PQSL_PARAMETRI535_ROWNAMEESERC, 0))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Bollati On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOLLATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BOLLATI);
      // 
      // Bollati On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_BOLLATI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOLLATI_INTESTAZIONE,(new IDVariant(PAN_BOLLATI.FieldText(PFL_BOLLATI_INTESTAZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "BollatiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Bollati On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_BOLLATI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bollati On Change Row Event Body
      // Procedure Body
      // 
      MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_ESTRAIVAEXCE+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_AGGIORESIGIB+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COIVAINATDIE+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_AGGIORESIGIB+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COIVAINATDIE+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true))
        {
          IDVariant v_VENT = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.VENTILAZIONE_IVA as T04VENTILIVA ");
          SQL.append("from ");
          SQL.append("  T04 A ");
          SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VENT = QV.Get("T04VENTILIVA", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VENT.equals((new IDVariant("SI")), true))
          {
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGISTCORRIS+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_VENTILAZIIVA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGISTCORRIS+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_VENTILAZIIVA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
        }
        else
        {
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGISTCORRIS+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_VENTILAZIIVA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_NUMERAZIOIVA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGISTCORRIS+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_NUMERAZIOIVA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_VENTILAZIIVA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_CONFERMAIVA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_CONFERMAIVA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGIACQUVEND+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_ESTRAIVAEXCE+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
        {
          if (PERSIVAREGIS.booleanValue())
          {
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGIACQUVEND+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGIACQUVEND+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
        }
        else
        {
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_REGIACQUVEND+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
      }
      if (FIRSTTIME.equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).compareTo((new IDVariant(4)), true)!=0)
        {
          if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).compareTo((new IDVariant(6)), true)!=0)
          {
            PAN_DOCUMENTI.set_Visible((new IDVariant(-1)).booleanValue());
            PAN_DOCUMENTI1.set_Visible((new IDVariant(0)).booleanValue());
          }
          else
          {
            PAN_DOCUMENTI.set_Visible((new IDVariant(0)).booleanValue());
            PAN_DOCUMENTI1.set_Visible((new IDVariant(-1)).booleanValue());
          }
          PAN_CORRISPETTIV.set_Visible((new IDVariant(0)).booleanValue());
        }
        else
        {
          PAN_DOCUMENTI.set_Visible((new IDVariant(0)).booleanValue());
          PAN_DOCUMENTI1.set_Visible((new IDVariant(0)).booleanValue());
          PAN_CORRISPETTIV.set_Visible((new IDVariant(-1)).booleanValue());
        }
      }
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_COLLEGCAPITO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_COLLEGCAPITO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "BollatiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Bollati After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BOLLATI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bollati After Find Event Body
      // Procedure Body
      // 
      FIRSTTIME = (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "BollatiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // New Tabbed View Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_NEWTABBEVIEW_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // New Tabbed View Change Page Event Body
      // Procedure Body
      // 
      if (new IDVariant(TAB_NEWTABBEVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_DOCUMENTI.FrIndex)), true))
      {
        IDVariant v_VT04DESCRIZI = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T04 A ");
        SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_BOLLATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VT04DESCRIZI = QV.Get("T04DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        PAN_DOCUMENTI.set_FieldText(PFL_DOCUMENTI_ETIREGBLABLA, IDL.Add(IDL.Add(IDL.Add(IDL.Add((IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()), (new IDVariant(" - "))), (new IDVariant(PAN_BOLLATI.FieldText(PFL_BOLLATI_TIPOBOLLATO1)))), (new IDVariant(" - "))), v_VT04DESCRIZI).stringValue());
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true))
        {
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_LABEL = new IDVariant(0,IDVariant.STRING);
          v_LABEL = (new IDVariant("Registraz. Def.", IDVariant.STRING));
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.set_FieldText(PFL_DETTAGLIIVA2_REGISTRAZDEF, new IDVariant(v_LABEL).stringValue());
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
          {
            PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
        {
          PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      UpdateScreen();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "NewTabbedViewChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_DOCUMENTI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
      {
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLIIVA2.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DocumentiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMENTI);
      // 
      // Documenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      IDVariant v_TOOLTIRIVEND = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIRIVEND = (new IDVariant("Bene Destinato a Rivendita"));
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_BENEFICIARI1,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_BENEFICIARI1))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_RIVENDITA,v_TOOLTIRIVEND.stringValue()); 
      PAN_DOCUMENTI.set_ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DOCUMENTI.ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_DOCUMENTI.set_ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DOCUMENTI.ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DocumentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DOCUMENTI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_DOCUMENTI.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DOCUMENTI.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DOCUMENTI.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DOCUMENTI.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT9, IMDBDef10.PQSL_FAT9_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT9, IMDBDef10.PQSL_FAT9_NUMERO_PROG, 0));
        MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DocumentiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Iva After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGLIIVA2_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Iva After Find Event Body
      // Procedure Body
      // 
      PAN_DETTAGLIIVA2.set_FieldText(PFL_DETTAGLIIVA2_TOT1, IDL.ToString(IDL.NullValue(PAN_DETTAGLIIVA2.GetFieldSum(PFL_DETTAGLIIVA2_IMPONIBILE1),(new IDVariant(0)))).stringValue());
      PAN_DETTAGLIIVA2.set_FieldText(PFL_DETTAGLIIVA2_TOT2, IDL.ToString(IDL.NullValue(PAN_DETTAGLIIVA2.GetFieldSum(PFL_DETTAGLIIVA2_IVA1),(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DettagliIvaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Iva On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLIIVA2_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGLIIVA2);
      // 
      // Dettagli Iva On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DETTAGLIIVA2.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTAGLIIVA2.ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_DETTAGLIIVA2.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTAGLIIVA2.ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DettagliIvaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Documenti 1 On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMENTI1_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMENTI1);
      // 
      // Documenti 1 On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DOCUMENTI1.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI1_BENEFICIARIO,(new IDVariant(PAN_DOCUMENTI1.FieldText(PFL_DOCUMENTI1_BENEFICIARIO))).stringValue()); 
      PAN_DOCUMENTI1.set_ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DOCUMENTI1.ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_DOCUMENTI1.set_ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DOCUMENTI1.ObjRect(Glb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "Documenti1OnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti 1 On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DOCUMENTI1_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti 1 On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_DOCUMENTI1.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DOCUMENTI1.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DOCUMENTI1.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DOCUMENTI1.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT2, IMDBDef10.PQSL_FAT2_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_FAT2, IMDBDef10.PQSL_FAT2_NUMERO_PROG, 0));
        MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "Documenti1OnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli IVA After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGLIIVA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli IVA After Find Event Body
      // Procedure Body
      // 
      PAN_DETTAGLIIVA.set_FieldText(PFL_DETTAGLIIVA_SOOMA2, IDL.ToString(IDL.NullValue(PAN_DETTAGLIIVA.GetFieldSum(PFL_DETTAGLIIVA_IMPONIBILE2),(new IDVariant(0)))).stringValue());
      PAN_DETTAGLIIVA.set_FieldText(PFL_DETTAGLIIVA_SOMMA3, IDL.ToString(IDL.NullValue(PAN_DETTAGLIIVA.GetFieldSum(PFL_DETTAGLIIVA_IVA2),(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DettagliIVAAfterFindEvent", _e);
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
      PAN_CORRISPETTIV.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISPETTIV_TIPOBOLLATO,(new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_TIPOBOLLATO))).stringValue()); 
      PAN_CORRISPETTIV.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISPETTIV_DESCRIZIONE,(new IDVariant(PAN_CORRISPETTIV.FieldText(PFL_CORRISPETTIV_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "CorrispettiviOnDynamicPropertiesEvent", _e);
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
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CORRISPETTIV.SetFlags (Glb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMEUPDAT, 0, (new IDVariant("U")));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_TIPO_BOLLATO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_TIPO_REGISTRO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMANNREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_ANNO_REG, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM38, IMDBDef2.FLD_PARAM38_ROWNAMNUMREG, 0, IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_NUMERO_REG, 0));
        MainFrm.Show(MyGlb.FRM_DOCUMECORRIS, (new IDVariant(0)).intValue(), this); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "CorrispettiviOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli IVA 1 After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGLIIVA1_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli IVA 1 After Find Event Body
      // Procedure Body
      // 
      PAN_DETTAGLIIVA1.set_FieldText(PFL_DETTAGLIIVA1_SOMMA1L, IDL.ToString(IDL.NullValue(PAN_DETTAGLIIVA1.GetFieldSum(PFL_DETTAGLIIVA1_IMPONIBILE),(new IDVariant(0)))).stringValue());
      PAN_DETTAGLIIVA1.set_FieldText(PFL_DETTAGLIIVA1_SOMMA2L, IDL.ToString(IDL.NullValue(PAN_DETTAGLIIVA1.GetFieldSum(PFL_DETTAGLIIVA1_IVA),(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IVA", "DettagliIVA1AfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void IVA_PARAMETRI535() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI535_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI394, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI394, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI535_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI535_RS, 0, IMDBDef2.TBL_PARAMETRI394, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI535_RS, 0, 0, IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI535_RS, 1, 0, IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMTIVIME, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI535_RS, 2, 0, IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMPERMES, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI535_RS, 3, 0, IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMPERTRI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI535_RS, 4, 0, IMDBDef2.TBL_PARAMETRI394, IMDBDef2.FLD_PARAMETRI394_ROWNAMELIQUI, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI394, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI394, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI394, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI535_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  private void TAB_NEWTABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_NEWTABBEVIEW_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BOLLATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BOLLATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BOLLATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BOLLATI, Cancel);
    // Stub
  }

  private void PAN_BOLLATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BOLLATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BOLLATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOLLATI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMENTI, Cancel);
    // Stub
  }

  private void PAN_DOCUMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCUMENTI_INFODOC1)
    {
      this.IdxPanelActived = this.PAN_DOCUMENTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DOCUMENTI_MODDOC)
    {
      this.IdxPanelActived = this.PAN_DOCUMENTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ModDoc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCUMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMENTI1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMENTI1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMENTI1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMENTI1, Cancel);
    // Stub
  }

  private void PAN_DOCUMENTI1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCUMENTI1_INFODOC)
    {
      this.IdxPanelActived = this.PAN_DOCUMENTI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCUMENTI1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMENTI1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMENTI1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
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
    if (ColIndex.intValue() == PFL_CORRISPETTIV_INFOCORRISPE)
    {
      this.IdxPanelActived = this.PAN_CORRISPETTIV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCorrispettivo();
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
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_TIPO_REGISTRO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_TCO, IMDBDef10.PQSL_TCO_TIPO_REGISTRO, 0, (new IDVariant(4)));
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
  private void PAN_DETTAGLIIVA2_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLIIVA2, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLIIVA2_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLIIVA2, Cancel);
    // Stub
  }

  private void PAN_DETTAGLIIVA2_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLIIVA2_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLIIVA2_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLIIVA2_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTAGLIIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLIIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLIIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLIIVA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLIIVA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DETTAGLIIVA);
    // Stub
  }

  private void PAN_DETTAGLIIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLIIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLIIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLIIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTAGLIIVA1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLIIVA1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLIIVA1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLIIVA1, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLIIVA1_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DETTAGLIIVA1);
    // Stub
  }

  private void PAN_DETTAGLIIVA1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLIIVA1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLIIVA1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLIIVA1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BOLLATI_Init()
  {

    PAN_BOLLATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOLLATI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BOLLATI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, "BC049568-ACDB-4426-80F0-079BE92F395E");
    PAN_BOLLATI.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, "Registro Bollato");
    PAN_BOLLATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, "");
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, "17339C3F-D091-4D98-A246-36904FA5FB37");
    PAN_BOLLATI.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, "TIPO BOLLATO");
    PAN_BOLLATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, "");
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, "2FB1E43F-60D8-4734-80DB-8CB1C601C523");
    PAN_BOLLATI.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, "Intestazione");
    PAN_BOLLATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, "");
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, "932E62BF-1762-4696-9082-0464D37519DD");
    PAN_BOLLATI.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, "Definitivo");
    PAN_BOLLATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, "");
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, "CAA73E03-32FE-41D8-89A1-CF7AEFE2EBA9");
    PAN_BOLLATI.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, "Attivita");
    PAN_BOLLATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, "");
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_BOLLATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, "E9FFB99B-EBFB-4362-A210-93AD3F9B07CA");
    PAN_BOLLATI.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, "Registro Bollato");
    PAN_BOLLATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOLLATI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_BOLLATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_LIST, 88);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_LIST, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_LIST, "Registro Bollato");
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_FORM, 88);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_FORM, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLAT, MyGlb.PANEL_FORM, "Regis. Bollato");
    PAN_BOLLATI.SetFieldPage(PFL_BOLLATI_REGISTBOLLAT, -1, -1);
    PAN_BOLLATI.SetFieldPanel(PFL_BOLLATI_REGISTBOLLAT, PPQRY_T16, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_BOLLATI.SetValueListItem(PFL_BOLLATI_REGISTBOLLAT, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_BOLLATI.SetValueListItem(PFL_BOLLATI_REGISTBOLLAT, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_BOLLATI.SetValueListItem(PFL_BOLLATI_REGISTBOLLAT, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_BOLLATI.SetValueListItem(PFL_BOLLATI_REGISTBOLLAT, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_BOLLATI.SetValueListItem(PFL_BOLLATI_REGISTBOLLAT, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_BOLLATI.SetValueListItem(PFL_BOLLATI_REGISTBOLLAT, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_LIST, 176, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_LIST, 80);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_LIST, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_LIST, "T. BL.");
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_FORM, 4, 124, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_FORM, 80);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_FORM, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_TIPOBOLLATO1, MyGlb.PANEL_FORM, "TP. BOLLATO");
    PAN_BOLLATI.SetFieldPage(PFL_BOLLATI_TIPOBOLLATO1, -1, -1);
    PAN_BOLLATI.SetFieldPanel(PFL_BOLLATI_TIPOBOLLATO1, PPQRY_T16, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_LIST, 200, 36, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_LIST, 76);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_LIST, "Intestazione");
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_FORM, 4, 52, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_FORM, 76);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_INTESTAZIONE, MyGlb.PANEL_FORM, "Intest.");
    PAN_BOLLATI.SetFieldPage(PFL_BOLLATI_INTESTAZIONE, -1, -1);
    PAN_BOLLATI.SetFieldPanel(PFL_BOLLATI_INTESTAZIONE, PPQRY_T16, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_LIST, 436, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_LIST, 104);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_LIST, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_LIST, "Definitivo");
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_FORM, 4, 100, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_FORM, 104);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_FORM, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_DEFINITIVO, MyGlb.PANEL_FORM, "Definitivo");
    PAN_BOLLATI.SetFieldPage(PFL_BOLLATI_DEFINITIVO, -1, -1);
    PAN_BOLLATI.SetFieldPanel(PFL_BOLLATI_DEFINITIVO, PPQRY_T16, "A.TIPO_BOLLATO_DEF", "TIPO_BOLLATO_DEF", 1, 2, 0, -13997);
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_LIST, 496, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_LIST, 56);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_LIST, "Attivita");
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_FORM, 4, 76, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_FORM, 56);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_BOLLATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLATI_ATTIVITA, MyGlb.PANEL_FORM, "Attivita");
    PAN_BOLLATI.SetFieldPage(PFL_BOLLATI_ATTIVITA, -1, -1);
    PAN_BOLLATI.SetFieldPanel(PFL_BOLLATI_ATTIVITA, PPQRY_T16, "A.ATTIVITA", "ATTIVITA", 1, 2, 0, -13997);
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.PANEL_LIST, 0, 0, 200, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.PANEL_LIST, 0);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.PANEL_LIST, 2);
    PAN_BOLLATI.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.PANEL_FORM, -8, 0, 204, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.PANEL_FORM, 0);
    PAN_BOLLATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLATI_REGISTBOLLA1, MyGlb.PANEL_FORM, 2);
    PAN_BOLLATI.SetFieldPage(PFL_BOLLATI_REGISTBOLLA1, -1, -1);
    PAN_BOLLATI.SetFieldPanel(PFL_BOLLATI_REGISTBOLLA1, -1, "", "REGISTBOLLA1", 0, 0, 0, -13997);
  }

  private void PAN_BOLLATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOLLATI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T09CODICE, ");
    SQL.append("  A.DESCRIZIONE as T09DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T09 A ");
    SQL.append("where (A.CODICE = ~~ATTIVITA~~) ");
    PAN_BOLLATI.SetQuery(PPQRY_T09, 0, SQL, PFL_BOLLATI_ATTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T09CODICE, ");
    SQL.append("  A.DESCRIZIONE as T09DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T09 A ");
    PAN_BOLLATI.SetQuery(PPQRY_T09, 1, SQL, PFL_BOLLATI_ATTIVITA, "");
    PAN_BOLLATI.SetQueryDB(PPQRY_T09, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOLLATI.SetIMDB(IMDB, "PQRY_T16", true);
    PAN_BOLLATI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ATTIVITA as ATTIVITA, ");
    SQL.append("  A.TIPO_BOLLATO_DEF as TIPO_BOLLATO_DEF ");
    PAN_BOLLATI.SetQuery(PPQRY_T16, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T04 A ");
    PAN_BOLLATI.SetQuery(PPQRY_T16, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOLLATI.SetQuery(PPQRY_T16, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOLLATI.SetQuery(PPQRY_T16, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOLLATI.SetQuery(PPQRY_T16, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_BOLLATI.SetQuery(PPQRY_T16, 5, SQL, -1, "");
    PAN_BOLLATI.SetQueryDB(PPQRY_T16, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOLLATI.SetMasterTable(0, "T04");
    PAN_BOLLATI.AddToSortList(PFL_BOLLATI_REGISTBOLLAT, true);
    PAN_BOLLATI.AddToSortList(PFL_BOLLATI_TIPOBOLLATO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOLLATI.Status() == 2)
    {
      int oldListQBE = PAN_BOLLATI.iUseListQBE;
      PAN_BOLLATI.iUseListQBE = 0;
      PAN_BOLLATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOLLATI.PanelCommand(Glb.PCM_FIND);
      PAN_BOLLATI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DOCUMENTI_Init()
  {

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, "AE210919-9F09-43A6-93DD-07BDD7D73FB1");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, "Beneficiario");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, "0C20C776-B043-41C2-8238-27F0F77112C4");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, "Documento");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, "87EEAFE8-9A6B-4E10-B962-E8C989E5821C");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, "Data");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, "86CBFD3D-54CA-41C3-AF85-7309A6EB5FAB");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, " ");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, "D9457707-AAE5-452B-B199-5B7079453441");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, "CODICE");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.VIS_NORFIEINTLUN);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, 0, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, "4144C212-8169-48D6-A59F-4ED862D7ADAE");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, "ANNO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, "7683DAD0-22DD-4F94-8270-A1737F3079F8");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, "NUMERO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, "36D3CDF3-1941-4412-80AA-2091427152F7");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, "ANNO DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, "3928839C-A4BC-452C-ADF6-26BC252A4E97");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, "DATA DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "5230C038-7B9F-410C-BBCB-955212E4E283");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "NUMERO DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, "E69690F8-A8E0-4E94-9A57-A3D21B5B77CA");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, "STORNO");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, "71AF6CB0-2E3E-491A-B95E-DFE12CD570E8");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, "BUONI");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, "51B1064F-7A71-4075-8F51-71988483997E");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, "Documento");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, "2519BCFE-8B95-415B-B6E6-B3972923DF48");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, "BAC73E4B-0D06-45A0-85CC-CAEEFD68BE7B");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, "CODICE DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, "397AF0D0-9D29-4C3D-97FB-8A50A4E7D04A");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, " ");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, "Apri");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, "E4080AA4-A27C-4662-80A1-BCDB70F03140");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.VIS_LABELFIELD);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, "58154464-F253-4319-B5BD-48F5637B5D61");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, "1 - Registro bla bla");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.VIS_ETICHEGRASSE);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, "CD28ACE9-3674-4C17-8EAA-9517F2478FAA");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, "Numero Reg.");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, "DB64397C-FBBC-439B-85B4-4DC989B67874");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, "Data Reg.");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, "5A867544-6E52-4DDC-B667-753E17AB6185");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, "Rivendita");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, "Bene Destinato a Rivendita");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.VIS_CHECKSTYLE);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, "E64533A8-7017-4799-85F7-4BB73C280F0B");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, "Registrazione");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DOCUMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_LIST, 0, 72, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_LIST, 124);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_FORM, 4, 220, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_FORM, 124);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BENEFICIARI1, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_BENEFICIARI1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_BENEFICIARI1, PPQRY_BEN1, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_LIST, 472, 72, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_LIST, "Documento");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DOCUMENTO1, MyGlb.PANEL_FORM, "Documento");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DOCUMENTO1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DOCUMENTO1, PPQRY_FAT9, "A.NUMERO_RIF", "NUMERO_RIF", 5, 20, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_LIST, 592, 72, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_FORM, 4, 196, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATA1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATA1, PPQRY_FAT9, "A.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_LIST, 656, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_LIST, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_LIST, " ");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_FORM, 4, 244, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_FORM, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFODOC1, MyGlb.PANEL_FORM, " ");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_INFODOC1, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_INFODOC1, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_INFODOC1, PPQRY_FAT9, "'I'", "RECORINFODOC", 5, 1, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFODOC1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_LIST, 564, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_LIST, "CODICE");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_FORM, 4, 148, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_FORM, 48);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE1, MyGlb.PANEL_FORM, "CODICE");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CODICE1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CODICE1, PPQRY_FAT9, "A.CODICE", "CODICE", 1, 6, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_FORM, 4, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG1, MyGlb.PANEL_FORM, "ANN. PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNOPROG1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNOPROG1, PPQRY_FAT9, "A.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_FORM, 4, 268, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG1, MyGlb.PANEL_FORM, "NUM. PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROPROG1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROPROG1, PPQRY_FAT9, "A.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_LIST, 900, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC1, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNODOC1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNODOC1, PPQRY_FAT9, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_LIST, 900, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC1, MyGlb.PANEL_FORM, "DT. DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATADOC1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATADOC1, PPQRY_FAT9, "A.DATA_DOC", "DATA_DOC", 1, 7, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 4, 292, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMERODOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMERODOC, PPQRY_FAT9, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, 52);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, "STORNO");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, 4, 292, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, 52);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, "STORNO");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_STORNO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_STORNO, PPQRY_FAT9, "A.STORNO", "STORNO", 1, 1, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_LIST, 40);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_LIST, "BUONI");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_FORM, 4, 292, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_FORM, 40);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_BUONI, MyGlb.PANEL_FORM, "BUON.");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_BUONI, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_BUONI, PPQRY_FAT9, "A.BUONI", "BUONI", 3, 14, 2, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.PANEL_LIST, 472, 36, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.PANEL_FORM, 776, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME2, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_LABELDOCUME2, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_LABELDOCUME2, -1, "", "LABELDOCUME2", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.PANEL_LIST, 656, 36, 20, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.PANEL_FORM, 784, 8, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUME3, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_LABELDOCUME3, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_LABELDOCUME3, -1, "", "LABELDOCUME3", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_LIST, "CODICE DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC1, MyGlb.PANEL_FORM, "CODICE DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CODICEDOC1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CODICEDOC1, PPQRY_FAT9, "A.CODICE_DOC", "RECFATCODDOC", 1, 2, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_LIST, 676, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_LIST, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_LIST, " ");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_FORM, 4, 4, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_FORM, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_MODDOC, MyGlb.PANEL_FORM, " ");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_MODDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_MODDOC, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_MODDOC, PPQRY_FAT9, "'A'", "RECORDMODDOC", 5, 1, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_MODDOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.PANEL_LIST, -12, 272, 1036, 200, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.PANEL_LIST, 14);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.PANEL_FORM, -12, 244, 736, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIDETIVADOC, MyGlb.PANEL_FORM, 16);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ETIDETIVADOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ETIDETIVADOC, -1, "", "ETIDETIVADOC", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.PANEL_LIST, 0, 4, 724, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.PANEL_FORM, 0, 4, 724, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETIREGBLABLA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ETIREGBLABLA, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ETIREGBLABLA, -1, "", "ETIREGBLABLA", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_LIST, 696, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_LIST, 80);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_LIST, "Numero Reg.");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_FORM, 4, 52, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_FORM, 80);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROREG4, MyGlb.PANEL_FORM, "Numero Reg.");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROREG4, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  MAX(CASE WHEN ~~PQRY_T16.TIPO_REGISTRO~~ <> 2 THEN C.NUMERO_REG ELSE C.NUMERO_REG_S END) ");
  SQL.append("from ");
  SQL.append("  IVA C ");
  SQL.append("where (C.ANNO_PROG = A.ANNO_PROG) ");
  SQL.append("and   (C.NUMERO_PROG = A.NUMERO_PROG) ");
  SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND C.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~ AND C.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND C.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND C.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~))) ");
  SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND (C.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND (C.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)))) ");
  SQL.append(")");
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_NUMEROREG4, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROREG4, PPQRY_FAT9, SQL.toString(), "NUMEROREG", 1, 19, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_LIST, 748, 72, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_FORM, 4, 28, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATAREG, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  MAX(CASE WHEN ~~PQRY_T16.TIPO_REGISTRO~~ <> 2 THEN D.D_DATA_REG ELSE D.D_DATA_REG_S END) ");
  SQL.append("from ");
  SQL.append("  IVA D ");
  SQL.append("where (D.ANNO_PROG = A.ANNO_PROG) ");
  SQL.append("and   (D.NUMERO_PROG = A.NUMERO_PROG) ");
  SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND D.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~ AND D.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND D.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND D.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~))) ");
  SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND (D.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND (D.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)))) ");
  SQL.append(")");
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_DATAREG, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATAREG, PPQRY_FAT9, SQL.toString(), "DATAREG", 6, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_LIST, 812, 72, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_LIST, "Rivendita");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_FORM, 4, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RIVENDITA, MyGlb.PANEL_FORM, "Rivendita");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_RIVENDITA, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_RIVENDITA, PPQRY_FAT9, "A.RIVENDITA", "RECORFATRIVE", 5, 2, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_RIVENDITA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_RIVENDITA, (new IDVariant()), "Null", "", "", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.PANEL_LIST, 696, 36, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.PANEL_FORM, 828, 40, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICHEREGIST, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ETICHEREGIST, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ETICHEREGIST, -1, "", "ETICHEREGIST", 0, 0, 0, -13997);
  }

  private void PAN_DOCUMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~CODICE~~) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_BEN1, 0, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_BEN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(PPQRY_BEN1, "BEN");
    PAN_DOCUMENTI.SetIMDB(IMDB, "PQRY_FAT9", true);
    PAN_DOCUMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.NUMERO_RIF as NUMERO_RIF, ");
    SQL.append("  A.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  A.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  A.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.DATA_DOC as DATA_DOC, ");
    SQL.append("  'I' as RECORINFODOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.STORNO as STORNO, ");
    SQL.append("  A.BUONI as BUONI, ");
    SQL.append("  A.CODICE_DOC as RECFATCODDOC, ");
    SQL.append("  'A' as RECORDMODDOC, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  MAX(CASE WHEN ~~PQRY_T16.TIPO_REGISTRO~~ <> 2 THEN C.NUMERO_REG ELSE C.NUMERO_REG_S END) ");
    SQL.append("from ");
    SQL.append("  IVA C ");
    SQL.append("where (C.ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (C.NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND C.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~ AND C.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND C.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND C.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~))) ");
    SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND (C.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND (C.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)))) ");
    SQL.append(") as NUMEROREG, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  MAX(CASE WHEN ~~PQRY_T16.TIPO_REGISTRO~~ <> 2 THEN D.D_DATA_REG ELSE D.D_DATA_REG_S END) ");
    SQL.append("from ");
    SQL.append("  IVA D ");
    SQL.append("where (D.ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (D.NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND D.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~ AND D.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND D.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND D.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~))) ");
    SQL.append("and   (((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND (D.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND (D.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)))) ");
    SQL.append(") as DATAREG, ");
    SQL.append("  A.RIVENDITA as RECORFATRIVE ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT A ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  IVA B ");
    SQL.append("where (B.ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   ((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND B.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~ AND B.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND B.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND B.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~)) ");
    SQL.append("and   ((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND (B.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND (B.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~) AND ~~PQRY_PARAMETRI535.ROWNAMELIQUI~~ = 0)) ");
    SQL.append("))) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 15, 14, 3, 9 ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT9, 5, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_FAT9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(0, "FAT");
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_DATAREG, true);
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_NUMEROREG4, true);
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_DATA1, true);
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_NUMERODOC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMENTI.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMENTI.iUseListQBE;
      PAN_DOCUMENTI.iUseListQBE = 0;
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMENTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DOCUMENTI1_Init()
  {

    PAN_DOCUMENTI1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMENTI1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMENTI1.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, "C5BEDAC2-E20A-4F87-8F98-555B60851CA1");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, "NUMERO REG");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, "B961BFEA-4610-498C-9884-8190C12E91F5");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, "DATA DOC");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, "1AE307AD-F225-4446-B5CF-0F38C4F1D3CC");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, "Liquidazione");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, "F5C63167-FE1E-4D78-8C11-9E7612FEC8E2");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, "Beneficiario");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, "5125507A-FD66-479E-A984-612C16189D30");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, "Documento");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, "A3B2050B-5031-405E-B520-0E8E02B6B62A");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, "Data");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, "8D9B40E4-6F78-4DFB-B667-1341C869F381");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, " ");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, "FF15B65F-D1CC-4725-91D0-049C56A5656D");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, "Contab");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.VIS_CHECKSTYLE);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, "86219613-5075-4593-BED9-8B5A9593D643");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, "Registrazione");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, "3B571CE2-4C05-4BBF-9CC6-C028134F7E9C");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, "ANNO PROG");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, "Brief description of field content.");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, "376BE9A0-AA04-4FCE-A60D-955F08A4E541");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, "NUMERO PROG");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, "Brief description of field content.");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, "44CA8F93-DF2D-4997-BFC0-ABE29AC8266E");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, "ANNO DOC");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, "Brief description of field content.");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, 0, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, "EC69D3D0-6BC0-435D-A586-54D163DF92B8");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, "Documento");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, "B97D0158-A6F4-4063-B29D-4E7A8E7DD1E1");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, "9038A9FF-B69B-46CE-A01C-6EED244705D2");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, "CODICE DOC");
    PAN_DOCUMENTI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, "Codice documento");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, "78ED920E-5DEF-4F06-8FFC-5CC99F2C8EBD");
    PAN_DOCUMENTI1.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, "");
    PAN_DOCUMENTI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.VIS_LABELFIELD);
    PAN_DOCUMENTI1.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DOCUMENTI1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_LIST, "NUM. REG");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROREG2, MyGlb.PANEL_FORM, "NUM. REG");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_NUMEROREG2, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_NUMEROREG2, PPQRY_FAT2, "A.NUMERO_REG", "NUMERO_REG", 1, 5, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_LIST, 52, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATADOC, MyGlb.PANEL_FORM, "DT. DOC");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_DATADOC, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_DATADOC, PPQRY_FAT2, "A.DATA_DOC", "DATA_DOC", 6, 19, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_LIST, 124, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_FORM, 12, 252, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LIQUIDAZION2, MyGlb.PANEL_FORM, "Liquid.");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_LIQUIDAZION2, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_LIQUIDAZION2, PPQRY_FAT2, "A.DATA_DOC", "DATA_DOC", 6, 19, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_LIST, 204, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 300, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_BENEFICIARIO, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_BENEFICIARIO, PPQRY_FAT2, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 50, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_LIST, 464, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_FORM, 4, 276, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DOCUMENTO, MyGlb.PANEL_FORM, "Documento");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_DOCUMENTO, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_DOCUMENTO, PPQRY_FAT2, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_LIST, 572, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_FORM, 12, 252, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_DATA, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_DATA, PPQRY_FAT2, "A.DATA_DOC", "DATA_DOC", 6, 19, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_LIST, 644, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_LIST, 56);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_LIST, " ");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_FORM, 4, 372, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_FORM, 56);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_INFODOC, MyGlb.PANEL_FORM, " ");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_INFODOC, -1, -1);
    PAN_DOCUMENTI1.SetFieldUnbound(PFL_DOCUMENTI1_INFODOC, true);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_INFODOC, PPQRY_FAT2, "'I'", "RECORINFODOC", 5, 1, 0, -13997);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_INFODOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_LIST, 664, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_LIST, "Contab");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_FORM, 4, 324, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CONTAB, MyGlb.PANEL_FORM, "Contab");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_CONTAB, -1, -1);
    PAN_DOCUMENTI1.SetFieldUnbound(PFL_DOCUMENTI1_CONTAB, true);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_CONTAB, PPQRY_FAT2, "DECODE(A.FAT_ANNO_PROG, NULL, NULL, 'SI')", "RECORDCONTAB", 5, 99, 0, -13997);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_CONTAB, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DOCUMENTI1.SetValueListItem(PFL_DOCUMENTI1_CONTAB, (new IDVariant()), "Null", "", "", -1);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.PANEL_LIST, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.PANEL_FORM, 0, 0, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_REGISTRAZIO1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_REGISTRAZIO1, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_REGISTRAZIO1, -1, "", "REGISTRAZIO1", 0, 0, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_FORM, 4, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNOPROG, MyGlb.PANEL_FORM, "ANN. PROG");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_ANNOPROG, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_ANNOPROG, PPQRY_FAT2, "A.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_FORM, 4, 268, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_NUMEROPROG, MyGlb.PANEL_FORM, "NUM. PROG");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_NUMEROPROG, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_NUMEROPROG, PPQRY_FAT2, "A.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_LIST, 900, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_ANNODOC, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_ANNODOC, PPQRY_FAT2, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.PANEL_LIST, 464, 0, 180, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.PANEL_FORM, 776, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUMEN, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_LABELDOCUMEN, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_LABELDOCUMEN, -1, "", "LABELDOCUMEN", 0, 0, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.PANEL_LIST, 644, 0, 20, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.PANEL_FORM, 784, 8, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_LABELDOCUME1, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_LABELDOCUME1, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_LABELDOCUME1, -1, "", "LABELDOCUME1", 0, 0, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_LIST, "CODICE DOC");
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_FORM, 4, 420, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_CODICEDOC, MyGlb.PANEL_FORM, "CODICE DOC");
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_CODICEDOC, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_CODICEDOC, PPQRY_FAT2, "A.CODICE_DOC", "RECFATCODDOC", 1, 1, 0, -13997);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.PANEL_LIST, -12, 244, 736, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.PANEL_LIST, 14);
    PAN_DOCUMENTI1.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.PANEL_FORM, -12, 244, 736, 216, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI1_ETIDETIVADO2, MyGlb.PANEL_FORM, 16);
    PAN_DOCUMENTI1.SetFieldPage(PFL_DOCUMENTI1_ETIDETIVADO2, -1, -1);
    PAN_DOCUMENTI1.SetFieldPanel(PFL_DOCUMENTI1_ETIDETIVADO2, -1, "", "ETIDETIVADO2", 0, 0, 0, -13997);
  }

  private void PAN_DOCUMENTI1_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMENTI1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DOCUMENTI1.SetIMDB(IMDB, "PQRY_FAT2", true);
    PAN_DOCUMENTI1.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_REG as NUMERO_REG, ");
    SQL.append("  A.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  A.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.DATA_DOC as DATA_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
    SQL.append("  DECODE(A.FAT_ANNO_PROG, NULL, NULL, 'SI') as RECORDCONTAB, ");
    SQL.append("  'I' as RECORINFODOC, ");
    SQL.append("  A.CODICE_DOC as RECFATCODDOC ");
    PAN_DOCUMENTI1.SetQuery(PPQRY_FAT2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATPRI A ");
    PAN_DOCUMENTI1.SetQuery(PPQRY_FAT2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND A.TIPO_BOLLATO = ~~PQRY_T16.TIPO_BOLLATO~~) ");
    SQL.append("and   (((A.DATA_DOC BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~))) ");
    SQL.append("and   (A.ANNO_DOC = ~~PQRY_PARAMETRI535.ROWNAMEESERC~~) ");
    PAN_DOCUMENTI1.SetQuery(PPQRY_FAT2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI1.SetQuery(PPQRY_FAT2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI1.SetQuery(PPQRY_FAT2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DATA_DOC, ");
    SQL.append("  A.NUMERO_REG ");
    PAN_DOCUMENTI1.SetQuery(PPQRY_FAT2, 5, SQL, -1, "");
    PAN_DOCUMENTI1.SetQueryDB(PPQRY_FAT2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI1.SetMasterTable(0, "FATPRI");
    PAN_DOCUMENTI1.AddToSortList(PFL_DOCUMENTI1_DATADOC, true);
    PAN_DOCUMENTI1.AddToSortList(PFL_DOCUMENTI1_NUMEROREG2, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMENTI1.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMENTI1.iUseListQBE;
      PAN_DOCUMENTI1.iUseListQBE = 0;
      PAN_DOCUMENTI1.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMENTI1.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMENTI1.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CORRISPETTIV_Init()
  {

    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, "2522354D-31DC-469F-8C9C-58CBF64DBFF1");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, "NUMERO REG");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, "288C73E5-36E6-4B75-8E2D-C04E979C7354");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, "D DATA REG");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, "657622B9-F887-4694-B056-1105AB795F62");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, "Info Corrispettivo");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, "Info");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.VIS_HYPELINKIMMA);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, "6ACF280A-F44C-40D4-A0C9-F29AFCD832AC");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, "ANNO REG");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, "32920F5F-61A6-44D8-98E3-03A71D3170AE");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, "9D1A4E7C-74E2-41A5-8D5B-E07B3B494401");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, "Tipo Bollato");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "557BDADC-6A9C-4345-8518-F8CC60EB8BB2");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "Descrizione");
    PAN_CORRISPETTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, "EF8B589D-405B-4A7E-831E-69788FCB8068");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, "Corrispettivo");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, "96329C21-2694-4C26-A0A6-D65D9CE675F0");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISPETTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, "C41690FE-90F8-4C09-B0B9-9707906B83FC");
    PAN_CORRISPETTIV.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, "");
    PAN_CORRISPETTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.VIS_LABELFIELD);
    PAN_CORRISPETTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CORRISPETTIV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_LIST, "NUMERO REG");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_FORM, 4, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_NUMEROREG3, MyGlb.PANEL_FORM, "NUM. REG");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_NUMEROREG3, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_NUMEROREG3, PPQRY_TCO, "A.NUMERO_REG", "NUMERO_REG", 1, 5, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_LIST, 76, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_LIST, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_LIST, "D DATA REG");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_FORM, 68);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DDATAREG2, MyGlb.PANEL_FORM, "D DT. REG");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DDATAREG2, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DDATAREG2, PPQRY_TCO, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_LIST, 144, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_LIST, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_LIST, "I. Cr.");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_FORM, 4, 124, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_FORM, 96);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_FORM, 2);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_INFOCORRISPE, MyGlb.PANEL_FORM, "Info Corrispettivo");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_INFOCORRISPE, -1, -1);
    PAN_CORRISPETTIV.SetFieldUnbound(PFL_CORRISPETTIV_INFOCORRISPE, true);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_INFOCORRISPE, PPQRY_TCO, "'I'", "RECOINFOCORR", 5, 1, 0, -13997);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CORRISPETTIV.SetValueListItem(PFL_CORRISPETTIV_INFOCORRISPE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_LIST, 180, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_LIST, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_LIST, "ANNO REG");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_FORM, 60);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ANNOREG, MyGlb.PANEL_FORM, "ANN. REG");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ANNOREG, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ANNOREG, PPQRY_TCO, "A.ANNO_REG", "ANNO_REG", 1, 4, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 76, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_FORM, 88);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOREGISTRO, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOREGISTRO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOREGISTRO, PPQRY_TCO, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_LIST, 168, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 100, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_TIPOBOLLATO, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_TIPOBOLLATO, PPQRY_TCO, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 420, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISPETTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_DESCRIZIONE, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_DESCRIZIONE, PPQRY_TCO, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_FORM, 0, 0, 180, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_CORRISPETTIV, MyGlb.PANEL_FORM, 2);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_CORRISPETTIV, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_CORRISPETTIV, -1, "", "CORRISPETTIV", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 144, 0, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_LIST, 2);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 144, 0, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_LABEL, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.PANEL_LIST, -12, 244, 736, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.PANEL_LIST, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.PANEL_LIST, 14);
    PAN_CORRISPETTIV.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.PANEL_FORM, -12, 244, 736, 216, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CORRISPETTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.PANEL_FORM, 0);
    PAN_CORRISPETTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISPETTIV_ETIDETIVADO1, MyGlb.PANEL_FORM, 16);
    PAN_CORRISPETTIV.SetFieldPage(PFL_CORRISPETTIV_ETIDETIVADO1, -1, -1);
    PAN_CORRISPETTIV.SetFieldPanel(PFL_CORRISPETTIV_ETIDETIVADO1, -1, "", "ETIDETIVADO1", 0, 0, 0, -13997);
  }

  private void PAN_CORRISPETTIV_InitQueries()
  {
    StringBuffer SQL;

    PAN_CORRISPETTIV.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T04, 0, SQL, PFL_CORRISPETTIV_TIPOBOLLATO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_T04, 1, SQL, PFL_CORRISPETTIV_TIPOBOLLATO, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetIMDB(IMDB, "PQRY_TCO", true);
    PAN_CORRISPETTIV.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.ANNO_REG as ANNO_REG, ");
    SQL.append("  A.NUMERO_REG as NUMERO_REG, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  'I' as RECOINFOCORR ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TCO A ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_T16.TIPO_BOLLATO~~) ");
    SQL.append("and   (A.ANNO_REG = ~~PQRY_PARAMETRI535.ROWNAMEESERC~~) ");
    SQL.append("and   ((A.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.ANNO_REG, ");
    SQL.append("  A.NUMERO_REG ");
    PAN_CORRISPETTIV.SetQuery(PPQRY_TCO, 5, SQL, -1, "");
    PAN_CORRISPETTIV.SetQueryDB(PPQRY_TCO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISPETTIV.SetMasterTable(0, "TCO");
    PAN_CORRISPETTIV.AddToSortList(PFL_CORRISPETTIV_DDATAREG2, true);
    PAN_CORRISPETTIV.AddToSortList(PFL_CORRISPETTIV_ANNOREG, true);
    PAN_CORRISPETTIV.AddToSortList(PFL_CORRISPETTIV_NUMEROREG3, true);
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

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "A04C2D6E-CA66-4E9E-A87A-A04221C9F045");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, "4CB42258-2726-4BB0-A0B6-EF8420560216");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, "Tipo Vista Mese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, "FF493CE9-919A-4592-AB84-1D1838581E8E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, "Periodo ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "87319E98-A2CD-419B-9CF4-4E1B3D8CE6C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, "4A2C0ED0-6F52-4DAF-BADD-EA3D49B3B195");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, "Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, -4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMETRI535, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, 80, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, "Tipo Vista Mese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, 108, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, "Tipo Vista Mese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVISTMESE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVISTMESE, PPQRY_PARAMETRI535, "A.ROWNAMTIVIME", "ROWNAMTIVIME", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVISTMESE, (new IDVariant(0)), "Anno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVISTMESE, (new IDVariant(1)), "Trimestre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVISTMESE, (new IDVariant(2)), "Mese", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, 312, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, "Periodo ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, 304, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, "Periodo ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODO1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODO1, PPQRY_PARAMETRI535, "A.ROWNAMPERTRI", "ROWNAMPERTRI", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(1)), "Gennaio - Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(2)), "Aprile - Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(3)), "Luglio - Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(4)), "Ottobre - Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 208, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, "Periodo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 300, 4, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, "Periodo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODO, PPQRY_PARAMETRI535, "A.ROWNAMPERMES", "ROWNAMPERMES", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_LIST, "Liquid.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_FORM, 496, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZION1, MyGlb.PANEL_FORM, "Liquidazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LIQUIDAZION1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LIQUIDAZION1, PPQRY_PARAMETRI535, "A.ROWNAMELIQUI", "ROWNAMELIQUI", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_LIQUIDAZION1, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_LIQUIDAZION1, (new IDVariant(0)), "Zero", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI535", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI535, IMDBDef10.PQRY_PARAMETRI535_RS, IMDBDef2.TBL_PARAMETRI394);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef2.FLD_PARAMETRI394_ROWNAMEESERC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVISTMESE, IMDBDef2.FLD_PARAMETRI394_ROWNAMTIVIME);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODO1, IMDBDef2.FLD_PARAMETRI394_ROWNAMPERTRI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODO, IMDBDef2.FLD_PARAMETRI394_ROWNAMPERMES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_LIQUIDAZION1, IMDBDef2.FLD_PARAMETRI394_ROWNAMELIQUI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI394");
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

  private void PAN_DETTAGLIIVA2_Init()
  {

    PAN_DETTAGLIIVA2.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLIIVA2.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLIIVA2.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, "9DE460FC-F697-4443-BC44-643AD2ECED10");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, "NUMERO REG S");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, "F75656F8-42D5-49DB-8C14-1D2A08E8240F");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, "D DATA REG S");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, "3FC66315-5103-4612-A391-144F2DD28895");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, "NUMERO REG");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, "BEDC8CA3-D1DD-41D4-8F11-F1521C174937");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, "D DATA REG");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, "53AEE160-E9B7-42EF-B1A9-A9C68E59B8AC");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, "SERVIZIO");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, "68715650-3A97-41F1-8DE7-311FAE739FA3");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, "NUMERO REG 1");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, "3F9BECEF-A85E-4981-B2CC-59790540FEBB");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, "D DATA REG 1");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, "38048B6C-E9DA-4050-8678-134F668279E2");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, "Liquidazione");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, "6FFC5912-97D8-45D0-A5AF-48333A6C71F8");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, "Imponibile");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, "1FEB7C05-B5CA-4BBA-BFC3-64A40089EB4C");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, "I.V.A.");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, "41947EAB-09E5-40BE-AACD-5A865EFA48C7");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, "%");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, "BD3F8175-C597-4212-B636-B7974884F176");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, "Esenzione");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, "CC73206D-0796-4A13-878A-DE5917F13A8B");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, "Indeducibile");
    PAN_DETTAGLIIVA2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, "CB9FED9C-1AEA-434F-8C63-0D8279BEE46E");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, "D6FC30FF-1ECF-49C6-8B64-F0CAA9043705");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, "");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, "982A25BC-2BFC-4EB2-A3D0-9A15CBC1AECD");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, "Registrazione");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLIIVA2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, "96F21BB9-A331-426A-9709-E53D04A61B0F");
    PAN_DETTAGLIIVA2.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, "Registraz. Def.");
    PAN_DETTAGLIIVA2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLIIVA2.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGLIIVA2_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_LIST, 0, 44, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_LIST, "NUM. REG S");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_FORM, 4, 172, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREGS, MyGlb.PANEL_FORM, "NUMERO REG S");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_NUMEROREGS, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_NUMEROREGS, PPQRY_IVA9, "A.NUMERO_REG_S", "RECIVANUMRES", 1, 5, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_LIST, 52, 44, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_LIST, 88);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_LIST, "D DATA REG S");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_FORM, 88);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREGS, MyGlb.PANEL_FORM, "D DATA REG S");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_DDATAREGS, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_DDATAREGS, PPQRY_IVA9, "A.D_DATA_REG_S", "RECIVADDARES", 6, 10, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_LIST, 124, 44, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_LIST, "NUM. REG");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_FORM, 4, 124, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG, MyGlb.PANEL_FORM, "NUMERO REG");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_NUMEROREG, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_NUMEROREG, PPQRY_IVA9, "A.NUMERO_REG", "RECONUMEREG1", 1, 5, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_LIST, 176, 44, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_LIST, "D DATA REG");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_FORM, 4, 148, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG, MyGlb.PANEL_FORM, "D DATA REG");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_DDATAREG, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_DDATAREG, PPQRY_IVA9, "A.D_DATA_REG", "RECODDATREG1", 6, 10, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_LIST, 248, 44, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_LIST, "SERV.");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_FORM, 4, 220, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_SERVIZIO, MyGlb.PANEL_FORM, "SERVIZIO");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_SERVIZIO, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_SERVIZIO, PPQRY_IVA9, "A.SERVIZIO", "RECORIVASERV", 1, 2, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_LIST, 304, 44, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_LIST, "NUM. REG 1");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_FORM, 12, 132, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_NUMEROREG1, MyGlb.PANEL_FORM, "NUM. REG 1");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_NUMEROREG1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_NUMEROREG1, PPQRY_IVA9, "A.NUMERO_REG", "RECONUMEREG1", 1, 5, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_LIST, 356, 44, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_LIST, "D DATA REG 1");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_FORM, 12, 156, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_DDATAREG1, MyGlb.PANEL_FORM, "D DT. REG 1");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_DDATAREG1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_DDATAREG1, PPQRY_IVA9, "A.D_DATA_REG", "RECODDATREG1", 6, 10, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_LIST, 428, 44, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_FORM, 72);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_LIQUIDAZIONE, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_LIQUIDAZIONE, PPQRY_IVA9, "A.D_DATA_LIQ", "RECORDLIQUID", 6, 10, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_LIST, 516, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_LIST, "Imponibile");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IMPONIBILE1, MyGlb.PANEL_FORM, "Imponibile");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_IMPONIBILE1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldUnbound(PFL_DETTAGLIIVA2_IMPONIBILE1, true);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_IMPONIBILE1, PPQRY_IVA9, "SEGNO_IVA(~~PQRY_FAT9.RECFATCODDOC~~,A.CODICE_DOC) * A.IMPONIBILE", "RECORIVAIMPO", 3, 28, 6, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_LIST, 624, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_LIST, 28);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_LIST, "I.V.A.");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_FORM, 28);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_IVA1, MyGlb.PANEL_FORM, "I V A");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_IVA1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldUnbound(PFL_DETTAGLIIVA2_IVA1, true);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_IVA1, PPQRY_IVA9, "SEGNO_IVA(~~PQRY_FAT9.RECFATCODDOC~~,A.CODICE_DOC) * A.IVA", "IVA", 3, 28, 6, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_LIST, 732, 44, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_LIST, "%");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ALIQUOTA1, MyGlb.PANEL_FORM, "%");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_ALIQUOTA1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_ALIQUOTA1, PPQRY_IVA9, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_LIST, 788, 44, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_LIST, "Esenzione");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_FORM, 4, 100, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_ESENZIONE1, MyGlb.PANEL_FORM, "Esenzione");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_ESENZIONE1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_ESENZIONE1, PPQRY_IVA9, "B.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_LIST, 1004, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_LIST, "Indeduc.");
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_INDEDUCIBILE, MyGlb.PANEL_FORM, "Indeduc.");
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_INDEDUCIBILE, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_INDEDUCIBILE, PPQRY_IVA9, "A.IVA_INDED", "IVA_INDED", 1, 1, 0, -13997);
    PAN_DETTAGLIIVA2.SetValueListItem(PFL_DETTAGLIIVA2_INDEDUCIBILE, (new IDVariant(1)), "1", "", "", -1);
    PAN_DETTAGLIIVA2.SetValueListItem(PFL_DETTAGLIIVA2_INDEDUCIBILE, (new IDVariant()), "null", "", "", -1);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.PANEL_LIST, 516, 108, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.PANEL_FORM, 0, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_TOT1, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_TOT1, -1, "", "TOT1", 0, 0, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.PANEL_LIST, 624, 108, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.PANEL_FORM, 8, 108, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_TOT2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_TOT2, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_TOT2, -1, "", "TOT2", 0, 0, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.PANEL_LIST, 0, 8, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.PANEL_FORM, 0, 0, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZION, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_REGISTRAZION, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_REGISTRAZION, -1, "", "REGISTRAZION", 0, 0, 0, -13997);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.PANEL_LIST, 124, 8, 180, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLIIVA2.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.PANEL_FORM, 8, 8, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA2.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA2_REGISTRAZDEF, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA2.SetFieldPage(PFL_DETTAGLIIVA2_REGISTRAZDEF, -1, -1);
    PAN_DETTAGLIIVA2.SetFieldPanel(PFL_DETTAGLIIVA2_REGISTRAZDEF, -1, "", "REGISTRAZDEF", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGLIIVA2_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLIIVA2.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGLIIVA2.SetIMDB(IMDB, "PQRY_IVA9", true);
    PAN_DETTAGLIIVA2.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_REG as RECONUMEREG1, ");
    SQL.append("  A.D_DATA_REG as RECODDATREG1, ");
    SQL.append("  A.NUMERO_REG_S as RECIVANUMRES, ");
    SQL.append("  A.SERVIZIO as RECORIVASERV, ");
    SQL.append("  A.D_DATA_LIQ as RECORDLIQUID, ");
    SQL.append("  A.D_DATA_REG_S as RECIVADDARES, ");
    SQL.append("  SEGNO_IVA(~~PQRY_FAT9.RECFATCODDOC~~,A.CODICE_DOC) * A.IMPONIBILE as RECORIVAIMPO, ");
    SQL.append("  SEGNO_IVA(~~PQRY_FAT9.RECFATCODDOC~~,A.CODICE_DOC) * A.IVA as IVA, ");
    SQL.append("  A.ALIQUOTA as ALIQUOTA, ");
    SQL.append("  A.IVA_INDED as IVA_INDED, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE ");
    PAN_DETTAGLIIVA2.SetQuery(PPQRY_IVA9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IVA A, ");
    SQL.append("  T06 B ");
    PAN_DETTAGLIIVA2.SetQuery(PPQRY_IVA9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~PQRY_FAT9.ANNO_PROG~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~PQRY_FAT9.NUMERO_PROG~~) ");
    SQL.append("and   (A.CODICE_ESENZIONE = B.CODICE(+)) ");
    SQL.append("and   ((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND A.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~ AND A.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND A.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~ AND A.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~)) ");
    SQL.append("and   ((~~PQRY_T16.TIPO_REGISTRO~~ = 2 AND (A.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) OR (~~PQRY_T16.TIPO_REGISTRO~~ <> 2 AND (A.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~) AND ~~PQRY_PARAMETRI535.ROWNAMELIQUI~~ = 0)) ");
    PAN_DETTAGLIIVA2.SetQuery(PPQRY_IVA9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA2.SetQuery(PPQRY_IVA9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA2.SetQuery(PPQRY_IVA9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA2.SetQuery(PPQRY_IVA9, 5, SQL, -1, "");
    PAN_DETTAGLIIVA2.SetQueryDB(PPQRY_IVA9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLIIVA2.SetMasterTable(0, "IVA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLIIVA2.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLIIVA2.iUseListQBE;
      PAN_DETTAGLIIVA2.iUseListQBE = 0;
      PAN_DETTAGLIIVA2.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLIIVA2.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLIIVA2.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTAGLIIVA_Init()
  {

    PAN_DETTAGLIIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLIIVA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLIIVA.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, "DAC2E350-C52C-4712-891E-EEAF4CE375DD");
    PAN_DETTAGLIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, "Imponibile");
    PAN_DETTAGLIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, "");
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, "C507C471-E687-4DE0-8031-CCD76F0D4FA7");
    PAN_DETTAGLIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, "I.V.A.");
    PAN_DETTAGLIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, "");
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, "0DA09B57-43FF-407D-947E-11B377F191E5");
    PAN_DETTAGLIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, "%");
    PAN_DETTAGLIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, "");
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, "54E82467-B8DB-45CA-88C9-1EAFCB22AC2B");
    PAN_DETTAGLIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, "Esenzione");
    PAN_DETTAGLIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, "");
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, "04A2E915-8380-497A-8ED2-2070AE84F153");
    PAN_DETTAGLIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, "");
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, "B91BD8BA-6C3B-480A-B44D-ECB7A077578A");
    PAN_DETTAGLIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, "");
    PAN_DETTAGLIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGLIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGLIIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_LIST, 12, 40, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_LIST, "Imponibile");
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_FORM, 4, 100, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IMPONIBILE2, MyGlb.PANEL_FORM, "Imponibile");
    PAN_DETTAGLIIVA.SetFieldPage(PFL_DETTAGLIIVA_IMPONIBILE2, -1, -1);
    PAN_DETTAGLIIVA.SetFieldUnbound(PFL_DETTAGLIIVA_IMPONIBILE2, true);
    PAN_DETTAGLIIVA.SetFieldPanel(PFL_DETTAGLIIVA_IMPONIBILE2, PPQRY_IVAPRI1, "SEGNO_IVA(~~PQRY_FAT2.RECFATCODDOC~~,A.CODICE_DOC) * A.IMPONIBILE", "IMPONIBILE", 3, 28, 6, -13997);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_LIST, 108, 40, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_LIST, 28);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_LIST, "I.V.A.");
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_IVA2, MyGlb.PANEL_FORM, "I.V.A.");
    PAN_DETTAGLIIVA.SetFieldPage(PFL_DETTAGLIIVA_IVA2, -1, -1);
    PAN_DETTAGLIIVA.SetFieldUnbound(PFL_DETTAGLIIVA_IVA2, true);
    PAN_DETTAGLIIVA.SetFieldPanel(PFL_DETTAGLIIVA_IVA2, PPQRY_IVAPRI1, "SEGNO_IVA(~~PQRY_FAT2.RECFATCODDOC~~,A.CODICE_DOC) * A.IVA", "IVA", 3, 28, 6, -13997);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_LIST, 204, 40, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_LIST, "%");
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_FORM, 4, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ALIQUOTA2, MyGlb.PANEL_FORM, "%");
    PAN_DETTAGLIIVA.SetFieldPage(PFL_DETTAGLIIVA_ALIQUOTA2, -1, -1);
    PAN_DETTAGLIIVA.SetFieldPanel(PFL_DETTAGLIIVA_ALIQUOTA2, PPQRY_IVAPRI1, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_LIST, 260, 40, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_LIST, 108);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_LIST, "Esenzione");
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_FORM, 4, 172, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_ESENZIONE2, MyGlb.PANEL_FORM, "Esenzione");
    PAN_DETTAGLIIVA.SetFieldPage(PFL_DETTAGLIIVA_ESENZIONE2, -1, -1);
    PAN_DETTAGLIIVA.SetFieldPanel(PFL_DETTAGLIIVA_ESENZIONE2, PPQRY_IVAPRI1, "A.CODICE_ESENZIONE", "CODICE_ESENZIONE", 1, 2, 0, -13997);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.PANEL_LIST, 108, 104, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.PANEL_FORM, -4, 108, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOMMA3, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA.SetFieldPage(PFL_DETTAGLIIVA_SOMMA3, -1, -1);
    PAN_DETTAGLIIVA.SetFieldPanel(PFL_DETTAGLIIVA_SOMMA3, -1, "", "SOMMA3", 0, 0, 0, -13997);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.PANEL_LIST, 12, 104, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.PANEL_FORM, 4, 116, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA_SOOMA2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA.SetFieldPage(PFL_DETTAGLIIVA_SOOMA2, -1, -1);
    PAN_DETTAGLIIVA.SetFieldPanel(PFL_DETTAGLIIVA_SOOMA2, -1, "", "SOOMA2", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGLIIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLIIVA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T06CODICE, ");
    SQL.append("  A.DESCRIZIONE as T06DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T06 A ");
    SQL.append("where (A.CODICE = ~~CODICE_ESENZIONE~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_DETTAGLIIVA.SetQuery(PPQRY_T7, 0, SQL, PFL_DETTAGLIIVA_ESENZIONE2, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T06CODICE, ");
    SQL.append("  A.DESCRIZIONE as T06DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T06 A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_DETTAGLIIVA.SetQuery(PPQRY_T7, 1, SQL, PFL_DETTAGLIIVA_ESENZIONE2, "");
    PAN_DETTAGLIIVA.SetQueryDB(PPQRY_T7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLIIVA.SetIMDB(IMDB, "PQRY_IVAPRI1", true);
    PAN_DETTAGLIIVA.set_SetString(MyGlb.MASTER_ROWNAME, "IVAPRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  A.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.CODICE_DOC as CODICE_DOC, ");
    SQL.append("  SEGNO_IVA(~~PQRY_FAT2.RECFATCODDOC~~,A.CODICE_DOC) * A.IMPONIBILE as IMPONIBILE, ");
    SQL.append("  SEGNO_IVA(~~PQRY_FAT2.RECFATCODDOC~~,A.CODICE_DOC) * A.IVA as IVA, ");
    SQL.append("  A.ALIQUOTA as ALIQUOTA, ");
    SQL.append("  A.CODICE_ESENZIONE as CODICE_ESENZIONE ");
    PAN_DETTAGLIIVA.SetQuery(PPQRY_IVAPRI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IVAPRI A ");
    PAN_DETTAGLIIVA.SetQuery(PPQRY_IVAPRI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~PQRY_FAT2.ANNO_PROG~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~PQRY_FAT2.NUMERO_PROG~~) ");
    PAN_DETTAGLIIVA.SetQuery(PPQRY_IVAPRI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA.SetQuery(PPQRY_IVAPRI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA.SetQuery(PPQRY_IVAPRI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA.SetQuery(PPQRY_IVAPRI1, 5, SQL, -1, "");
    PAN_DETTAGLIIVA.SetQueryDB(PPQRY_IVAPRI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLIIVA.SetMasterTable(0, "IVAPRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLIIVA.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLIIVA.iUseListQBE;
      PAN_DETTAGLIIVA.iUseListQBE = 0;
      PAN_DETTAGLIIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLIIVA.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLIIVA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTAGLIIVA1_Init()
  {

    PAN_DETTAGLIIVA1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLIIVA1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLIIVA1.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, "9C8A9127-D484-4954-ABA0-29698D1BF3B5");
    PAN_DETTAGLIIVA1.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, "Imponibile");
    PAN_DETTAGLIIVA1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, "");
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, "13C3C337-9B08-449E-AA8F-B5EE444B424C");
    PAN_DETTAGLIIVA1.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, "I.V.A.");
    PAN_DETTAGLIIVA1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, "");
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, "850A1428-321A-4503-9440-3AD990C65434");
    PAN_DETTAGLIIVA1.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, "%");
    PAN_DETTAGLIIVA1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, "");
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, "3E766D49-3B91-4FFC-B573-06ED9CD6D46C");
    PAN_DETTAGLIIVA1.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, "Esenzione");
    PAN_DETTAGLIIVA1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, "");
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, "56F82BB7-1498-43F2-B55A-33CAEB226EFC");
    PAN_DETTAGLIIVA1.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, "");
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLIIVA1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, "ACFF56BC-0889-4971-96FC-FBD9A9BD7277");
    PAN_DETTAGLIIVA1.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, "");
    PAN_DETTAGLIIVA1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGLIIVA1.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGLIIVA1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_LIST, 0, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_DETTAGLIIVA1.SetFieldPage(PFL_DETTAGLIIVA1_IMPONIBILE, -1, -1);
    PAN_DETTAGLIIVA1.SetFieldPanel(PFL_DETTAGLIIVA1_IMPONIBILE, PPQRY_IVAPRI, "A.IMPONIBILE", "IMPONIBILE", 3, 14, 2, -13997);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_LIST, 100, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_LIST, 28);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_LIST, "I.V.A.");
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_FORM, 28);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_IVA, MyGlb.PANEL_FORM, "I V A");
    PAN_DETTAGLIIVA1.SetFieldPage(PFL_DETTAGLIIVA1_IVA, -1, -1);
    PAN_DETTAGLIIVA1.SetFieldPanel(PFL_DETTAGLIIVA1_IVA, PPQRY_IVAPRI, "A.IVA", "IVA", 3, 14, 2, -13997);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_LIST, 200, 40, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_LIST, "%");
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ALIQUOTA, MyGlb.PANEL_FORM, "%");
    PAN_DETTAGLIIVA1.SetFieldPage(PFL_DETTAGLIIVA1_ALIQUOTA, -1, -1);
    PAN_DETTAGLIIVA1.SetFieldPanel(PFL_DETTAGLIIVA1_ALIQUOTA, PPQRY_IVAPRI, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_LIST, 256, 40, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_LIST, "Esenzione");
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_FORM, 4, 100, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_ESENZIONE, MyGlb.PANEL_FORM, "Esenzione");
    PAN_DETTAGLIIVA1.SetFieldPage(PFL_DETTAGLIIVA1_ESENZIONE, -1, -1);
    PAN_DETTAGLIIVA1.SetFieldPanel(PFL_DETTAGLIIVA1_ESENZIONE, PPQRY_IVAPRI, "B.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.PANEL_LIST, 0, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.PANEL_FORM, 88, 104, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA1L, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA1.SetFieldPage(PFL_DETTAGLIIVA1_SOMMA1L, -1, -1);
    PAN_DETTAGLIIVA1.SetFieldPanel(PFL_DETTAGLIIVA1_SOMMA1L, -1, "", "SOMMA1L", 0, 0, 0, -13997);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.PANEL_LIST, 100, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIIVA1.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.PANEL_FORM, 96, 112, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIIVA1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIIVA1.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIIVA1_SOMMA2L, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIIVA1.SetFieldPage(PFL_DETTAGLIIVA1_SOMMA2L, -1, -1);
    PAN_DETTAGLIIVA1.SetFieldPanel(PFL_DETTAGLIIVA1_SOMMA2L, -1, "", "SOMMA2L", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGLIIVA1_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLIIVA1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGLIIVA1.SetIMDB(IMDB, "PQRY_IVAPRI", true);
    PAN_DETTAGLIIVA1.set_SetString(MyGlb.MASTER_ROWNAME, "IVAPRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPONIBILE as IMPONIBILE, ");
    SQL.append("  A.IVA as IVA, ");
    SQL.append("  A.ALIQUOTA as ALIQUOTA, ");
    SQL.append("  A.CODICE_ESENZIONE as CODICE_ESENZIONE, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE ");
    PAN_DETTAGLIIVA1.SetQuery(PPQRY_IVAPRI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DCO A, ");
    SQL.append("  T06 B ");
    PAN_DETTAGLIIVA1.SetQuery(PPQRY_IVAPRI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_REG = ~~PQRY_TCO.ANNO_REG~~) ");
    SQL.append("and   (A.NUMERO_REG = ~~PQRY_TCO.NUMERO_REG~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~PQRY_TCO.TIPO_REGISTRO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_TCO.TIPO_BOLLATO~~) ");
    SQL.append("and   (B.CODICE(+) = A.CODICE_ESENZIONE) ");
    PAN_DETTAGLIIVA1.SetQuery(PPQRY_IVAPRI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA1.SetQuery(PPQRY_IVAPRI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA1.SetQuery(PPQRY_IVAPRI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIIVA1.SetQuery(PPQRY_IVAPRI, 5, SQL, -1, "");
    PAN_DETTAGLIIVA1.SetQueryDB(PPQRY_IVAPRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLIIVA1.SetMasterTable(0, "DCO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLIIVA1.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLIIVA1.iUseListQBE;
      PAN_DETTAGLIIVA1.iUseListQBE = 0;
      PAN_DETTAGLIIVA1.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLIIVA1.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLIIVA1.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCUMENTI1) PAN_DOCUMENTI1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLIIVA2) PAN_DETTAGLIIVA2_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLIIVA) PAN_DETTAGLIIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLIIVA1) PAN_DETTAGLIIVA1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCUMENTI1) PAN_DOCUMENTI1_ValidateRow(Cancel);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLIIVA2) PAN_DETTAGLIIVA2_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLIIVA) PAN_DETTAGLIIVA_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLIIVA1) PAN_DETTAGLIIVA1_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_DynamicProperties();
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_DynamicProperties();
    if (SrcObj == PAN_DOCUMENTI1) PAN_DOCUMENTI1_DynamicProperties();
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DETTAGLIIVA2) PAN_DETTAGLIIVA2_DynamicProperties();
    if (SrcObj == PAN_DETTAGLIIVA) PAN_DETTAGLIIVA_DynamicProperties();
    if (SrcObj == PAN_DETTAGLIIVA1) PAN_DETTAGLIIVA1_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCUMENTI1) PAN_DOCUMENTI1_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLIIVA2) PAN_DETTAGLIIVA2_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLIIVA) PAN_DETTAGLIIVA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLIIVA1) PAN_DETTAGLIIVA1_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_OnChangeRow();
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnChangeRow();
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
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_DOCUMENTI1) PAN_DOCUMENTI1_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_AfterFind(CmdFind);
    if (SrcObj == PAN_DETTAGLIIVA2) PAN_DETTAGLIIVA2_AfterFind(CmdFind);
    if (SrcObj == PAN_DETTAGLIIVA) PAN_DETTAGLIIVA_AfterFind(CmdFind);
    if (SrcObj == PAN_DETTAGLIIVA1) PAN_DETTAGLIIVA1_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BOLLATI) PAN_BOLLATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DOCUMENTI1) PAN_DOCUMENTI1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CORRISPETTIV) PAN_CORRISPETTIV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLIIVA2) PAN_DETTAGLIIVA2_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLIIVA) PAN_DETTAGLIIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLIIVA1) PAN_DETTAGLIIVA1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_NEWTABBEVIEW) TAB_NEWTABBEVIEW_Click(PreviousPage, Cancel);
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
