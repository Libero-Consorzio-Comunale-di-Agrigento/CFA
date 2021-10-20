// **********************************************
// Accetta Nota Di Credito
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccettaNotaDiCredito extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NOTA_IDDOCUMENTO = 0;
  private static int PFL_NOTA_VISUALIZZDOC = 1;
  private static int PFL_NOTA_RAGIONSOCIAL = 2;
  private static int PFL_NOTA_CODICEFISCAL = 3;
  private static int PFL_NOTA_DOCUMENTO = 4;
  private static int PFL_NOTA_DATADOCUMENT = 5;
  private static int PFL_NOTA_TIPODOCUMENT = 6;
  private static int PFL_NOTA_IMPORTO1 = 7;
  private static int PFL_NOTA_NUMEROPROT = 8;
  private static int PFL_NOTA_DDATAPROT = 9;
  private static int PFL_NOTA_DATAARRIVO = 10;
  private static int PFL_NOTA_ETICHEDOCUM1 = 11;
  private static int PFL_NOTA_ETICHEPROTOC = 12;

  private static int PPQRY_FEDOCUMENTAL = 0;


  IDPanel PAN_NOTA;
  private static int PFL_FATTUDARETTI_FATANNODOC = 0;
  private static int PFL_FATTUDARETTI_FATNUMERODOC = 1;
  private static int PFL_FATTUDARETTI_INFOFATTURA = 2;
  private static int PFL_FATTUDARETTI_RIEPILOGOIVA = 3;
  private static int PFL_FATTUDARETTI_IMPORTO = 4;
  private static int PFL_FATTUDARETTI_DESCRIZIONE1 = 5;
  private static int PFL_FATTUDARETTI_RETFATANPRFA = 6;
  private static int PFL_FATTUDARETTI_RETFATNUPRFA = 7;
  private static int PFL_FATTUDARETTI_ETICHEDOCUME = 8;

  private static int PPQRY_FATTURECOLL1 = 0;


  IDPanel PAN_FATTUDARETTI;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZION9 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables
  private IDVariant DAENDMODAL = new IDVariant(0,IDVariant.INTEGER);
  public IDVariant SEINVIOESITO = new IDVariant(0,IDVariant.STRING);
  private IDVariant SEINSERITQTN = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARPERACCNAC(IMDB);
    Init_TBL_FATTURECOLL(IMDB);
    //
    //
    Init_PQRY_FEDOCUMENTAL(IMDB);
    Init_PQRY_FATTURECOLL1(IMDB);
    Init_PQRY_FATTURECOLL1_RS(IMDB);
    Init_PQRY_NOTEFUNZION9(IMDB);
    Init_QRY_CFASELINTV11(IMDB);
    Init_QRY_FATTBUONIMD3(IMDB);
    Init_QRY_FATTURECOLL2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARPERACCNAC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARPERACCNAC, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_PARPERACCNAC, "TBL_PARPERACCNAC");
    IMDB.set_FldCode(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_ID_DOCUMENTO, "ID_DOCUMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_ID_DOCUMENTO,3,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, "NOMOGGTICODO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO,5,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, "NOMOGGCODBEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN,1,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEAPRI, "NOMEOGGEAPRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARPERACCNAC,IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEAPRI,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARPERACCNAC, 0);
  }

  private static void Init_TBL_FATTURECOLL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FATTURECOLL, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_FATTURECOLL, "TBL_FATTURECOLL");
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_FAT_ANNO_PROG_FAT, "FAT_ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_FAT_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT, "FAT_NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_COD_REC,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_PROVENIENZA, "PROVENIENZA");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_PROVENIENZA,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_TIPO_REGISTRO_DEF, "TIPO_REGISTRO_DEF");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_TIPO_REGISTRO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURECOLL,IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC,5,20,0);
  }

  private static void Init_PQRY_FEDOCUMENTAL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FEDOCUMENTAL, 11);
    IMDB.set_TblCode(IMDBDef10.PQRY_FEDOCUMENTAL, "PQRY_FEDOCUMENTAL");
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCRASO, "RECFEDOCRASO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCRASO,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCCOFI, "RECFEDOCCOFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCCOFI,5,35,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECORDDOCUME, "RECORDDOCUME");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECORDDOCUME,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCDADO, "RECFEDOCDADO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCDADO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCTIDO, "RECFEDOCTIDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCTIDO,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECOFEDOCIMP, "RECOFEDOCIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECOFEDOCIMP,3,12,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCNUPR, "RECFEDOCNUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCNUPR,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDODDAPR, "RECFEDODDAPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDODDAPR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCDAAR, "RECFEDOCDAAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCDAAR,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_VISUALIZZDOC, "VISUALIZZDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_VISUALIZZDOC,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCIDDO, "RECFEDOCIDDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTAL,IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCIDDO,3,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FEDOCUMENTAL, 0);
  }

  private static void Init_PQRY_FATTURECOLL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FATTURECOLL1, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_FATTURECOLL1, "PQRY_FATTURECOLL1");
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, "FAT_ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, "FAT_NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_RECOINFOFATT, "RECOINFOFATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_RECOINFOFATT,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_RECORRIEPIVA, "RECORRIEPIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1,IMDBDef10.PQSL_FATTURECOLL1_RECORRIEPIVA,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FATTURECOLL1, 0);
  }

  private static void Init_PQRY_FATTURECOLL1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FATTURECOLL1_RS, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_FATTURECOLL1_RS, "PQRY_FATTURECOLL1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, "FAT_ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, "FAT_NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_RECOINFOFATT, "RECOINFOFATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_RECOINFOFATT,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_RECORRIEPIVA, "RECORRIEPIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTURECOLL1_RS,IMDBDef10.PQSL_FATTURECOLL1_RECORRIEPIVA,5,99,0);
  }

  private static void Init_PQRY_NOTEFUNZION9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NOTEFUNZION9, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_NOTEFUNZION9, "PQRY_NOTEFUNZION9");
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTEFUNZION9,IMDBDef10.PQSL_NOTEFUNZION9_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NOTEFUNZION9, 0);
  }

  private static void Init_QRY_CFASELINTV11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTV11, 2);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTV11, "QRY_CFASELINTV11");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTV11,IMDBDef10.QSL_CFASELINTV11_SUMNOMOGREIM, "SUMNOMOGREIM");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTV11,IMDBDef10.QSL_CFASELINTV11_SUMNOMOGREIM,3,28,6);
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTV11,IMDBDef10.QSL_CFASELINTV11_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTV11,IMDBDef10.QSL_CFASELINTV11_COUNT,1,19,0);
  }

  private static void Init_QRY_FATTBUONIMD3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_FATTBUONIMD3, 4);
    IMDB.set_TblCode(IMDBDef10.QRY_FATTBUONIMD3, "QRY_FATTBUONIMD3");
    IMDB.set_FldCode(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWIMPORTO, "ROWIMPORTO");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWANNOPROG, "ROWANNOPROG");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWANNOPROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWNUMERPROG, "ROWNUMERPROG");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWNUMERPROG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWDESCRIZIO, "ROWDESCRIZIO");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTBUONIMD3,IMDBDef10.QSL_FATTBUONIMD3_ROWDESCRIZIO,5,40,0);
  }

  private static void Init_QRY_FATTURECOLL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_FATTURECOLL2, 13);
    IMDB.set_TblCode(IMDBDef10.QRY_FATTURECOLL2, "QRY_FATTURECOLL2");
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGRETDES, "NOMOGGRETDES");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGRETDES,5,40,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, "ROWIMPORTO");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWANNPROFAT, "ROWANNPROFAT");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWANNPROFAT,1,4,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWNUMPROFAT, "ROWNUMPROFAT");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWNUMPROFAT,1,5,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGRECORE, "NOMOGGRECORE");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGRECORE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGREDAULAG, "NOOGREDAULAG");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGREDAULAG,8,19,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGRETPRO, "NOMOGGRETPRO");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGRETPRO,5,10,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGREIMIV, "NOMOGGREIMIV");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOMOGGREIMIV,3,14,2);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGREIMIVIS, "NOOGREIMIVIS");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGREIMIVIS,3,14,2);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGRETIREDE, "NOOGRETIREDE");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGRETIREDE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGRETIBODE, "NOOGRETIBODE");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_NOOGRETIBODE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC, "ROWANNODOC");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC, "ROWNUMERODOC");
    IMDB.SetFldParams(IMDBDef10.QRY_FATTURECOLL2,IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC,5,20,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccettaNotaDiCredito(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccettaNotaDiCredito()
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
    FormIdx = MyGlb.FRM_ACCENOTDICRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4F91F4CB-3086-4953-AA0B-A19743B41444";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2113;
    DesignWidth = 1052;
    DesignHeight = 602;
    set_Caption(new IDVariant("Accetta Nota di Credito"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1052;
    Frames[1].Height = 576;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.729167;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1052;
    Frames[2].Height = 420;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.219048;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 1052;
    Frames[3].Height = 92;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Nota";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 92;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_NOTA = new IDPanel(w, this, 3, "PAN_NOTA");
    Frames[3].Content = PAN_NOTA;
    PAN_NOTA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTA.VS = MainFrm.VisualStyleList;
    PAN_NOTA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2CA03242-C62B-46E8-97BD-2253937C7FE9");
    PAN_NOTA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1004, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTA.InitStatus = 2;
    PAN_NOTA_Init();
    PAN_NOTA_InitFields();
    PAN_NOTA_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 1052;
    Frames[4].Height = 328;
    Frames[4].Caption = "Fatture da Rettificare";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 328;
    PAN_FATTUDARETTI = new IDPanel(w, this, 4, "PAN_FATTUDARETTI");
    Frames[4].Content = PAN_FATTUDARETTI;
    PAN_FATTUDARETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTUDARETTI.VS = MainFrm.VisualStyleList;
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BDF8F62D-48F6-449E-B1C0-537B50CE0197");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 648, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTUDARETTI.InitStatus = 2;
    PAN_FATTUDARETTI_Init();
    PAN_FATTUDARETTI_InitFields();
    PAN_FATTUDARETTI_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 1052;
    Frames[5].Height = 156;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "NOTE FUNZIONALITA";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 156;
    Frames[5].MinHeight = Frames[5].Height;
    Frames[5].MaxHeight = Frames[5].Height;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 5, "PAN_NOTEFUNZIONA");
    Frames[5].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 156-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ECAB1658-59C6-464A-8E4D-EE5DEDC10197");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ACCETTLANOTA+BaseCmdLinIdx)
      {
        AccettaLaNota();
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
      if (IMDB.TblModified(IMDBDef2.TBL_FATTURECOLL, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ACCENOTDICRE_FATTURECOLL1();
      }
      PAN_NOTA.UpdatePanel(MainFrm);
      PAN_FATTUDARETTI.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
    return (obj instanceof AccettaNotaDiCredito);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccettaNotaDiCredito.class.getName() : (Glb.ClassWithPackage(AccettaNotaDiCredito.class) ? AccettaNotaDiCredito.class.getName().substring(AccettaNotaDiCredito.class.getPackage().getName().length() + 1) : AccettaNotaDiCredito.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      LOAD_FATTCOLLDELE();
      PAN_FATTUDARETTI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      DAENDMODAL = (new IDVariant(0));
      PAN_FATTUDARETTI.SetFlags (Glb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_FATTUDARETTI.SetFlags (Glb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_FATTUDARETTI.SetFlags (Glb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "Load", _e);
    }
  }

  // **********************************************************************
  // FATTURE COLL: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_FATTCOLLDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_FATTURECOLL);
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
      if (!(Confirm.booleanValue()))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Attenzione, uscendo senza confermare la Nota non verrà accettata. Si desire proseguire?"));
        IDVariant B = new IDVariant(0,IDVariant.INTEGER);
        B = (new IDVariant(MainFrm.MessageConfirmEx(v_MSG)));
        if (IDL.IsNull(B))
        {
          Cancel.set((new IDVariant(-1)));
          return;
        }
        if (!(B.booleanValue()))
        {
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      UNLOAD_FATTCOLLDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "Unload", _e);
    }
  }

  // **********************************************************************
  // FATTURE COLL: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FATTCOLLDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_FATTURECOLL);
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_DODACOAREFEV)), true))
        {
          DAENDMODAL = (new IDVariant(-1));
          IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, 0, IMDB.Value(IMDBDef10.PQRY_FAT4, IMDBDef10.PQSL_FAT4_ANNO_DOC, 0));
          IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, 0, IMDB.Value(IMDBDef10.PQRY_FAT4, IMDBDef10.PQSL_FAT4_NUMERO_DOC, 0));
          IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef10.PQRY_FAT4, IMDBDef10.PQSL_FAT4_ANNO_PROG, 0));
          IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef10.PQRY_FAT4, IMDBDef10.PQSL_FAT4_NUMERO_PROG, 0));
          DAENDMODAL = (new IDVariant(0));
        }
      }
      else
      {
        DAENDMODAL = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Fatture da Rettificare On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FATTUDARETTI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fatture da Rettificare On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_FATTUDARETTI_FATANNODOC)), true) || Column.equals((new IDVariant(PFL_FATTUDARETTI_FATNUMERODOC)), true)) && FieldWasModified.booleanValue() && !(DAENDMODAL.booleanValue()))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, 0))))
        {
          IDVariant v_VFATANNOPROG = null;
          v_VFATANNOPROG = (new IDVariant());
          IDVariant v_VFATNUMEPROG = null;
          v_VFATNUMEPROG = (new IDVariant());
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.ANNO_PROG) as MINFATANNPRO, ");
          SQL.append("  MIN(A.NUMERO_PROG) as MINFATNUMPRO, ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  FAT A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DOC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DOC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CODICE_DOC IN ");
          SQL.append("( ");
          SQL.append("select ");
          SQL.append("  1 ");
          SQL.append("from ");
          SQL.append("  DUAL B ");
          SQL.append("where (" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'TD04' OR " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'TD05') ");
          SQL.append("UNION ALL ");
          SQL.append("select ");
          SQL.append("  3 ");
          SQL.append("from ");
          SQL.append("  DUAL C ");
          SQL.append("where (" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'TD05') ");
          SQL.append(")) ");
          SQL.append("and   (A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0) > 0) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VFATANNOPROG = QV.Get("MINFATANNPRO", IDVariant.INTEGER) ;
            v_VFATNUMEPROG = QV.Get("MINFATNUMPRO", IDVariant.INTEGER) ;
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(1)), true)>0 && (v_VFATANNOPROG).compareTo(IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0), true)!=0 && v_VFATNUMEPROG.compareTo(IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0), true)!=0)
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAM189, IMDBDef2.FLD_PARAM189_ROWNAMCODBEN, 0, new IDVariant(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0),IDVariant.FLOAT));
            IMDB.set_Value(IMDBDef2.TBL_PARAM189, IMDBDef2.FLD_PARAM189_ROWNAMTICODO, 0, IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, 0));
            IMDB.set_Value(IMDBDef2.TBL_PARAM189, IMDBDef2.FLD_PARAM189_ROWNAMANNDOC, 0, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, 0));
            IMDB.set_Value(IMDBDef2.TBL_PARAM189, IMDBDef2.FLD_PARAM189_ROWNAMNUMDOC, 0, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, 0));
            MainFrm.Show(MyGlb.FRM_DODACOAREFEV, (new IDVariant(-1)).intValue(), this); 
          }
          else if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Nessuna fattura trovata |1/|2 trovata per il beneficiario |3"));
            MainFrm.set_AlertMessage(IDL.FormatMessage(S, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_NUMERO_DOC, 0), IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_ANNO_DOC, 0), IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0))); 
            IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0, new IDVariant(v_VFATANNOPROG));
            IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0, new IDVariant(v_VFATNUMEPROG));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "FatturedaRettificareOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Nota On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_NOTA);
      // 
      // Nota On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_NOTA.set_ToolTip(Glb.OBJ_FIELD,PFL_NOTA_RAGIONSOCIAL,(new IDVariant(PAN_NOTA.FieldText(PFL_NOTA_RAGIONSOCIAL))).stringValue()); 
      PAN_NOTA.set_ToolTip(Glb.OBJ_FIELD,PFL_NOTA_DOCUMENTO,(new IDVariant(PAN_NOTA.FieldText(PFL_NOTA_DOCUMENTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "NotaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Visualizza Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisualizzaDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Doc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTAL, IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCIDDO, 0))))
      {
        IDVariant v_URL = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  INDE_FE_PASSIVA.FE_URL_FATTURA(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTAL, IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCIDDO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as UFRFDIDANDCN ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_URL = QV.Get("UFRFDIDANDCN", IDVariant.STRING) ;
        }
        QV.Close();
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.set_RedirectTo(v_URL);
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "VisualizzaDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // FAT NUMERO DOC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int FATNUMERODOC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FAT NUMERO DOC Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM189, IMDBDef2.FLD_PARAM189_ROWNAMCODBEN, 0, new IDVariant(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0),IDVariant.FLOAT));
      IMDB.set_Value(IMDBDef2.TBL_PARAM189, IMDBDef2.FLD_PARAM189_ROWNAMTICODO, 0, IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, 0));
      MainFrm.Show(MyGlb.FRM_DODACOAREFEV, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "FATNUMERODOC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Fattura Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "InfoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riepilogo Iva
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiepilogoIva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riepilogo Iva Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, IMDB.Value(IMDBDef10.PQRY_FATTURECOLL1, IMDBDef10.PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT, 0));
      MainFrm.Show(MyGlb.FRM_RIEPILOGOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "RiepilogoIva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accetta La Nota
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AccettaLaNota ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accetta La Nota Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_FATTUDARETTI.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Salvare prima tutti i record, quindi accettare la Nota"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (PAN_FATTUDARETTI.IsPanelInError())
      {
        return 0;
      }
      IDVariant v_VSUMTOTCOLLE = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      ACCETTLANOTA_CFASELINTV11();
      if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTV11, 0))
      {
        v_VSUMTOTCOLLE = IMDB.Value(IMDBDef10.QRY_CFASELINTV11, IMDBDef10.QSL_CFASELINTV11_SUMNOMOGREIM, 0, IDVariant.DECIMAL) ;
        v_VCOUNT = IMDB.Value(IMDBDef10.QRY_CFASELINTV11, IMDBDef10.QSL_CFASELINTV11_COUNT, 0, IDVariant.INTEGER) ;
      }
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("La nota non è stata collegata a nessuna fattura"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (v_VSUMTOTCOLLE.compareTo(IDL.Abs(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEIMPO, 0)), true)>0)
      {
        IDVariant v_MSGB = new IDVariant(0,IDVariant.STRING);
        v_MSGB = (new IDVariant("La somma degli importi è superiore all'importo della Nota stessa"));
        MainFrm.set_AlertMessage(v_MSGB); 
        return 0;
      }
      // 
      // warning
      // 
      if (IDL.Abs(v_VSUMTOTCOLLE).compareTo(IDL.Abs(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEIMPO, 0)), true)!=0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("La nota non è stata collegata per l'interno importo.<BR/>Continuare?"));
        IDVariant B = new IDVariant(0,IDVariant.INTEGER);
        B = (new IDVariant(MainFrm.MessageConfirmEx(S)));
        if (IDL.IsNull(B))
        {
          return 0;
        }
        if (!(B.booleanValue()))
        {
          return 0;
        }
      }
      // 
      //  -- check --
      // 
      IDVariant v_ERRORIBLOCCA = new IDVariant(0,IDVariant.STRING);
      if (!(Check(v_ERRORIBLOCCA)))
      {
        if (IDL.Length(v_ERRORIBLOCCA).compareTo((new IDVariant(0)), true)>0)
        {
          MainFrm.set_AlertMessage(v_ERRORIBLOCCA); 
        }
        return 0;
      }
      // 
      // fine check
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      // 
      // accetto
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = new IDVariant(MainFrm.MESSEGINSSOG);
      IDVariant v_ANNOPROGR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMEROPROGR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VMSGINSCONT = new IDVariant(0,IDVariant.STRING);
      v_MESSAGGIO = (new IDVariant(""));
      if (IDL.NullValue(MainFrm.MESSEGINSSOG,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        v_MESSAGGIO = new IDVariant(MainFrm.MESSEGINSSOG);
      }
      MainFrm.Cf4armDBObject.InserisciinContabilita(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTAL, IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCIDDO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.NullValue(SEINVIOESITO,(new IDVariant("SI"))), MainFrm.MESSEGINSSOG, SEINSERITQTN, v_ANNOPROGR, v_NUMEROPROGR, v_SEERRORE, v_VMSGINSCONT);
      if (!(IDL.IsNull(v_VMSGINSCONT)))
      {
        // MainFrm.set_AlertMessage(v_MESSAGGIO); 
        v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_VMSGINSCONT);
        MainFrm.MESSEGINSSOG = (new IDVariant());
      }
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTAL, IMDBDef10.PQSL_FEDOCUMENTAL_RECFEDOCIDDO, 0), (new IDVariant("DOD")), (new IDVariant()), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROGUO, 0), (new IDVariant("Da completare la fattura proveniente da ")));
      }
      else
      {
        MainFrm.set_AlertMessage(((IDL.NullValue(v_MESSAGGIO,(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())):IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(" </br>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      // 
      // --
      // 
      IDVariant v_VFATANNOPROG = null;
      v_VFATANNOPROG = (new IDVariant());
      IDVariant v_VFATNUMEPROG = null;
      v_VFATNUMEPROG = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_PROG as FATANNOPROG, ");
      SQL.append("  A.NUMERO_PROG as FATNUMERPROG ");
      SQL.append("from ");
      SQL.append("  FAT A ");
      SQL.append("where (A.ID_FE_DOCUMENTALE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_ID_DOCUMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VFATANNOPROG = QV.Get("FATANNOPROG", IDVariant.INTEGER) ;
        v_VFATNUMEPROG = QV.Get("FATNUMERPROG", IDVariant.INTEGER) ;
      }
      QV.Close();
      ACCETTLANOTA_FATTBUONIMD3();
      while (!IMDB.Eof(IMDBDef10.QRY_FATTBUONIMD3, 0))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("insert into RETFAT ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO, ");
          SQL.append("  IMPORTO, ");
          SQL.append("  FAT_ANNO_PROG_FAT, ");
          SQL.append("  FAT_NUMERO_PROG_FAT, ");
          SQL.append("  UTENTE_INSERIMENTO, ");
          SQL.append("  DATA_INSERIMENTO, ");
          SQL.append("  D_DATA_REG, ");
          SQL.append("  FAT_ANNO_PROG_NAC, ");
          SQL.append("  FAT_NUMERO_PROG_NAC, ");
          SQL.append("  DESCRIZIONE ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  to_number(NULL), ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_FATTBUONIMD3, IMDBDef10.QSL_FATTBUONIMD3_ROWIMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_FATTBUONIMD3, IMDBDef10.QSL_FATTBUONIMD3_ROWANNOPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_FATTBUONIMD3, IMDBDef10.QSL_FATTBUONIMD3_ROWNUMERPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  TRUNC( SYSDATE ), ");
          SQL.append("  TRUNC( SYSDATE ), ");
          SQL.append("  " + IDL.CSql(v_VFATANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(v_VFATNUMEPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_FATTBUONIMD3, IMDBDef10.QSL_FATTBUONIMD3_ROWDESCRIZIO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e25)
        {
          // 
          // se esco ma la fattura è stata inserita (c'è un commit
          // dentro la procedure di insert su fat) con delle segnalazioni
          // le mostro
          // 
          MainFrm.set_AlertMessage(((IDL.NullValue(v_MESSAGGIO,(new IDVariant(""))).equals((new IDVariant(""))))?new IDVariant(e25.getMessage()):IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(" </br>"))), new IDVariant(e25.getMessage())))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        IMDB.TblMoveNext(IMDBDef10.QRY_FATTBUONIMD3, 0);
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      // 
      // mostro messaggi caricati nelle elaborazione precedenti
      // 
      if (IDL.NullValue(v_MESSAGGIO,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEAPRI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_FATTURA, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_FATTURA,(new IDVariant(0)).booleanValue()); 
        }
        IDVariant v_VFEDOCPROANN = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VFEDOCPRONUM = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PROGRESSIVO_ANNO as FEDOCUPROANN, ");
        SQL.append("  A.PROGRESSIVO_NUMERO as FEDOCUPRONUM ");
        SQL.append("from ");
        SQL.append("  FE_DOCUMENTALE A ");
        SQL.append("where (A.ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_ID_DOCUMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFEDOCPROANN = QV.Get("FEDOCUPROANN", IDVariant.DECIMAL) ;
          v_VFEDOCPRONUM = QV.Get("FEDOCUPRONUM", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, new IDVariant(new IDVariant(v_VFEDOCPROANN),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, new IDVariant(new IDVariant(v_VFEDOCPRONUM),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "AccettaLaNota", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void ACCETTLANOTA_CFASELINTV11() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTV11);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, IMDB.Value(IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_IMPORTO, 0));
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 1, 0, new IDVariant(1));
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTURECOLL, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[2];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[2];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrBuff[1] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0))) AggrRowCount[1] = 1; else AggrRowCount[1] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTV11, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTV11, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTV11, 1, 0, new IDVariant(AggrBuff[1]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
                AggrRowCount[0]++;
              }
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0)))
              {
                AggrBuff[1] = IDL.Add(AggrBuff[1], new IDVariant(1));
                AggrRowCount[1]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTV11, 0);
  }

  // **********************************************************************
  // Fatture Buoni IMDB
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void ACCETTLANOTA_FATTBUONIMD3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_FATTBUONIMD3);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
    {
      IMDB.TblAddNew(IMDBDef10.QRY_FATTBUONIMD3, 0);
      IMDB.TblLinkRow(IMDBDef10.QRY_FATTBUONIMD3, 0, IMDBDef2.TBL_FATTURECOLL, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTBUONIMD3, 0, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTBUONIMD3, 1, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_FAT_ANNO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTBUONIMD3, 2, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTBUONIMD3, 3, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_DESCRIZIONE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTURECOLL, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_FATTBUONIMD3, 0);
  }

  // **********************************************************************
  // Check
  // P ERRORE BLOCC - Input/Output
  // **********************************************************************
  public boolean Check (IDVariant PERROREBLOCC)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Check Body
      // Corpo Procedura
      // 
      IDVariant v_RET = null;
      v_RET = (new IDVariant(-1));
      IDVariant I = null;
      I = (new IDVariant(1));
      CHECK_FATTURECOLL2();
      while (!IMDB.Eof(IMDBDef10.QRY_FATTURECOLL2, 0))
      {
        if (IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("L'importo da collegare deve essere maggiore o uguale a  zero"));
          PERROREBLOCC.set(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(PERROREBLOCC, (new IDVariant("<BR/\">"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC, 0))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0))), (new IDVariant(" "))), S));
          v_RET = (new IDVariant(0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Riga |1 incompleta"));
          PERROREBLOCC.set(IDL.Add(IDL.Add(PERROREBLOCC, (new IDVariant(" "))), IDL.FormatMessage(S, I)));
          v_RET = (new IDVariant(0));
        }
        IDVariant v_VFATIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VFATVARIAZIO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VFATIMPUTATO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VFATBUONI = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VFATLIQNOBUO = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO as FATIMPORTO, ");
        SQL.append("  NVL(A.VARIAZIONI, 0) as NULVALFATVA0, ");
        SQL.append("  NVL(A.IMPUTATO, 0) as NULVALFATIM0, ");
        SQL.append("  NVL(A.BUONI, 0) as NULVALFATBU0, ");
        SQL.append("  NVL(A.LIQ_NO_BUONI, 0) as NUVAFALINOB0 ");
        SQL.append("from ");
        SQL.append("  FAT A ");
        SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWANNPROFAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWNUMPROFAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFATIMPORTO = QV.Get("FATIMPORTO", IDVariant.DECIMAL) ;
          v_VFATVARIAZIO = QV.Get("NULVALFATVA0", IDVariant.DECIMAL) ;
          v_VFATIMPUTATO = QV.Get("NULVALFATIM0", IDVariant.DECIMAL) ;
          v_VFATBUONI = QV.Get("NULVALFATBU0", IDVariant.DECIMAL) ;
          v_VFATLIQNOBUO = QV.Get("NUVAFALINOB0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IDVariant v_VSIMPORTRETT = new IDVariant(0,IDVariant.STRING);
        v_VSIMPORTRETT = (new IDVariant("Importo rettificato: "));
        if (IDL.Sub(IDL.Add(v_VFATIMPORTO, v_VFATVARIAZIO), IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0)).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Importo documento inferiore al totale delle Rettifiche. Documento non modificabile."));
          PERROREBLOCC.set(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(PERROREBLOCC, (new IDVariant("<BR/\">"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0))), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC, 0))), (new IDVariant(" "))), v_VSIMPORTRETT), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0))), (new IDVariant(" "))), S));
          v_RET = (new IDVariant(0));
        }
        if (IDL.Sub(IDL.Sub(IDL.Add(v_VFATIMPORTO, v_VFATVARIAZIO), IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0)), v_VFATIMPUTATO).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Importo documento inferiore al totale imputato in Distinte di Liquidazione."));
          PERROREBLOCC.set(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(PERROREBLOCC, (new IDVariant("<BR/\">"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0))), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC, 0))), (new IDVariant(" "))), v_VSIMPORTRETT), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0))), (new IDVariant(" "))), S));
          v_RET = (new IDVariant(0));
        }
        if (IDL.Sub(IDL.Sub(IDL.Sub(IDL.Add(v_VFATIMPORTO, v_VFATVARIAZIO), IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0)), v_VFATBUONI), v_VFATLIQNOBUO).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Importo documento inferiore al totale imputato in Distinte di Liquidazione."));
          PERROREBLOCC.set(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(PERROREBLOCC, (new IDVariant("<BR/\">"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0))), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWNUMERODOC, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWANNODOC, 0))), (new IDVariant(" "))), v_VSIMPORTRETT), IDL.ToString(IMDB.Value(IMDBDef10.QRY_FATTURECOLL2, IMDBDef10.QSL_FATTURECOLL2_ROWIMPORTO, 0))), (new IDVariant(" "))), S));
          v_RET = (new IDVariant(0));
        }
        // 
        // --
        // 
        I = IDL.Add(I, (new IDVariant(1)));
        IMDB.TblMoveNext(IMDBDef10.QRY_FATTURECOLL2, 0);
      }
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccettaNotaDiCredito", "Check", _e);
      return false;
    }
  }

  // **********************************************************************
  // FATTURE COLL
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void CHECK_FATTURECOLL2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_FATTURECOLL2);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
    {
      IMDB.TblAddNew(IMDBDef10.QRY_FATTURECOLL2, 0);
      IMDB.TblLinkRow(IMDBDef10.QRY_FATTURECOLL2, 0, IMDBDef2.TBL_FATTURECOLL, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 0, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 1, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 2, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_FAT_ANNO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 3, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 4, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_COD_REC, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 5, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_DATA_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 6, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_PROVENIENZA, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 7, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_IMPORTO_IVA, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 8, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_IMPORTO_IVA_IST, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 9, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_TIPO_REGISTRO_DEF, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 10, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_TIPO_BOLLATO_DEF, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 11, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_ANNO_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_FATTURECOLL2, 12, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTURECOLL, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_FATTURECOLL2, 0);
  }

  // **********************************************************************
  // FATTURE COLL
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ACCENOTDICRE_FATTURECOLL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_FATTURECOLL1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_FATTURECOLL1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_FATTURECOLL1_RS, 0, IMDBDef2.TBL_FATTURECOLL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTURECOLL1_RS, 0, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTURECOLL1_RS, 1, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTURECOLL1_RS, 2, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_ANNO_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTURECOLL1_RS, 3, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTURECOLL1_RS, 4, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_FAT_ANNO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTURECOLL1_RS, 5, 0, IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT, 0);
      IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1_RS, 6, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC, 0))))?(new IDVariant("I")):(new IDVariant())));
      IMDB.set_Value(IMDBDef10.PQRY_FATTURECOLL1_RS, 7, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_FATTURECOLL, IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC, 0))))?(new IDVariant("F")):(new IDVariant())));
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTURECOLL, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTURECOLL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURECOLL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_FATTURECOLL1_RS, 0);
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
  private void PAN_NOTA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTA, Cancel);
    // Stub
  }

  private void PAN_NOTA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_NOTA_VISUALIZZDOC)
    {
      this.IdxPanelActived = this.PAN_NOTA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VisualizzaDoc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_NOTA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FATTUDARETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FATTUDARETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FATTUDARETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTUDARETTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTUDARETTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FATTUDARETTI);
    // Stub
  }

  private void PAN_FATTUDARETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FATTUDARETTI_FATNUMERODOC)
    {
      this.IdxPanelActived = this.PAN_FATTUDARETTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      FATNUMERODOC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FATTUDARETTI_INFOFATTURA)
    {
      this.IdxPanelActived = this.PAN_FATTUDARETTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FATTUDARETTI_RIEPILOGOIVA)
    {
      this.IdxPanelActived = this.PAN_FATTUDARETTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RiepilogoIva();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FATTUDARETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FATTUDARETTI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FATTUDARETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTUDARETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NOTA_Init()
  {

    PAN_NOTA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTA.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, "AD790A3F-0B55-4779-A359-8141A3D19466");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, "ID DOCUMENTO");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, "B57387AC-5178-4B66-B80A-BFD5FD5D5D98");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, " ");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, "8F9CC9A1-B2CE-499F-8F5F-FB716C795032");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, "Fornitore");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, "0D5BDC6A-1E67-4D4A-88AB-ED4037DB1415");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, "Codice Fiscale Partita IVA");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, "352A7C07-CB2F-40B7-9E95-1279CF5C54A6");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, "Numero");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, "5C10A896-80C2-4266-976F-BC8951ECCA3D");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, "Data");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, "42F57134-CDB2-4466-BA54-6E89AF020737");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, "Tipo");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, "256C3721-074C-4EB1-83D2-7579629C147F");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, "Importo");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, "988FFEC1-0B7C-437A-8A33-32130D8791EA");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, "Numero");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, "79FFA8F5-2874-433C-B6B0-9F729EF8F3BA");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, "Data");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, "5E640A0F-67C0-4E09-801B-1575B1D3DA42");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, "Data Arrivo");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, "86975E8A-76B3-4CC3-8EB5-8AECDCA907A6");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, "Documento");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.VIS_LABEVISUSTYL);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_NOTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, "CDE7D8DF-2295-4222-962A-3A9E3F76AA86");
    PAN_NOTA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, "Protocollo");
    PAN_NOTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, "");
    PAN_NOTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.VIS_LABEVISUSTYL);
    PAN_NOTA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_NOTA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_LIST, 1056, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_LIST, 96);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_LIST, "ID DOCUMENTO");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_FORM, 4, 244, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_FORM, 96);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_IDDOCUMENTO, MyGlb.PANEL_FORM, "ID DOCUMENTO");
    PAN_NOTA.SetFieldPage(PFL_NOTA_IDDOCUMENTO, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_IDDOCUMENTO, PPQRY_FEDOCUMENTAL, "A.ID_DOCUMENTO", "RECFEDOCIDDO", 3, 10, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_LIST, 0, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_LIST, 32);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_LIST, " ");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_FORM, 4, 220, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_FORM, 32);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_VISUALIZZDOC, MyGlb.PANEL_FORM, " ");
    PAN_NOTA.SetFieldPage(PFL_NOTA_VISUALIZZDOC, -1, -1);
    PAN_NOTA.SetFieldUnbound(PFL_NOTA_VISUALIZZDOC, true);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_VISUALIZZDOC, PPQRY_FEDOCUMENTAL, "CASE WHEN (A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI') THEN -1 ELSE 1 END", "VISUALIZZDOC", 1, 19, 0, -13997);
    PAN_NOTA.SetValueListItem(PFL_NOTA_VISUALIZZDOC, (new IDVariant()), " ", "", "", -1);
    PAN_NOTA.SetValueListItem(PFL_NOTA_VISUALIZZDOC, (new IDVariant(1)), "Pieno", "", "at_grey1.png", -1);
    PAN_NOTA.SetValueListItem(PFL_NOTA_VISUALIZZDOC, (new IDVariant(0)), "Warning", "Trascorsi 15 giorni dalla data di arrivo", "at_grey_alert1.png", -1);
    PAN_NOTA.SetValueListItem(PFL_NOTA_VISUALIZZDOC, (new IDVariant(-1)), "Late", "Trascorsi più di 15 giorni dalla data di arrivo", "at_grey_alert1.png", -1);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, 24, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Fornitore");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 4, 620, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, 108);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Fornitore");
    PAN_NOTA.SetFieldPage(PFL_NOTA_RAGIONSOCIAL, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_RAGIONSOCIAL, PPQRY_FEDOCUMENTAL, "A.RAGIONE_SOCIALE", "RECFEDOCRASO", 5, 100, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_LIST, 256, 36, 108, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_LIST, 100);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale Partita IVA");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 28, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_FORM, 100);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_CODICEFISCAL, MyGlb.PANEL_FORM, "Cod. Fsc. Prt. IVA");
    PAN_NOTA.SetFieldPage(PFL_NOTA_CODICEFISCAL, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_CODICEFISCAL, PPQRY_FEDOCUMENTAL, "A.CODICE_FISCALE", "RECFEDOCCOFI", 5, 35, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_LIST, 364, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_LIST, 128);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_LIST, "Numero");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_FORM, 4, 52, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_FORM, 128);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DOCUMENTO, MyGlb.PANEL_FORM, "Numero");
    PAN_NOTA.SetFieldPage(PFL_NOTA_DOCUMENTO, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_DOCUMENTO, PPQRY_FEDOCUMENTAL, "A.NUMERO_DOCUMENTO", "RECORDDOCUME", 5, 20, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_LIST, 492, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_LIST, 112);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_LIST, "Data");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_FORM, 4, 76, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_FORM, 112);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DATADOCUMENT, MyGlb.PANEL_FORM, "Data");
    PAN_NOTA.SetFieldPage(PFL_NOTA_DATADOCUMENT, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_DATADOCUMENT, PPQRY_FEDOCUMENTAL, "A.DATA_DOCUMENTO", "RECFEDOCDADO", 6, 19, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_LIST, 560, 36, 88, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_LIST, 108);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_LIST, "Tipo");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_FORM, 4, 100, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_FORM, 108);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_TIPODOCUMENT, MyGlb.PANEL_FORM, "Tipo");
    PAN_NOTA.SetFieldPage(PFL_NOTA_TIPODOCUMENT, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_TIPODOCUMENT, PPQRY_FEDOCUMENTAL, "A.TIPO_DOCUMENTO", "RECFEDOCTIDO", 5, 60, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_LIST, 648, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_NOTA.SetFieldPage(PFL_NOTA_IMPORTO1, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_IMPORTO1, PPQRY_FEDOCUMENTAL, "A.IMPORTO", "RECOFEDOCIMP", 3, 12, 2, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_LIST, 760, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_LIST, 88);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_LIST, "Numero");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_FORM, 4, 148, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_FORM, 88);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_NUMEROPROT, MyGlb.PANEL_FORM, "Numero");
    PAN_NOTA.SetFieldPage(PFL_NOTA_NUMEROPROT, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_NUMEROPROT, PPQRY_FEDOCUMENTAL, "A.NUMERO_PROT", "RECFEDOCNUPR", 1, 7, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_LIST, 836, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_LIST, 84);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_LIST, "Data");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_FORM, 4, 172, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_FORM, 84);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DDATAPROT, MyGlb.PANEL_FORM, "Data");
    PAN_NOTA.SetFieldPage(PFL_NOTA_DDATAPROT, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_DDATAPROT, PPQRY_FEDOCUMENTAL, "A.D_DATA_PROT", "RECFEDODDAPR", 6, 10, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_LIST, 920, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_LIST, 88);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_LIST, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_LIST, "Data Arrivo");
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_FORM, 4, 196, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_FORM, 88);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTA_DATAARRIVO, MyGlb.PANEL_FORM, "Data Arrivo");
    PAN_NOTA.SetFieldPage(PFL_NOTA_DATAARRIVO, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_DATAARRIVO, PPQRY_FEDOCUMENTAL, "A.DATA_ARRIVO", "RECFEDOCDAAR", 6, 19, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.PANEL_LIST, 364, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.PANEL_LIST, 0);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.PANEL_LIST, 2);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.PANEL_FORM, 360, 64, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.PANEL_FORM, 0);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEDOCUM1, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetFieldPage(PFL_NOTA_ETICHEDOCUM1, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_ETICHEDOCUM1, -1, "", "ETICHEDOCUM1", 0, 0, 0, -13997);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.PANEL_LIST, 760, 0, 160, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.PANEL_LIST, 0);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.PANEL_LIST, 2);
    PAN_NOTA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.PANEL_FORM, 808, 64, 164, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.PANEL_FORM, 0);
    PAN_NOTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTA_ETICHEPROTOC, MyGlb.PANEL_FORM, 1);
    PAN_NOTA.SetFieldPage(PFL_NOTA_ETICHEPROTOC, -1, -1);
    PAN_NOTA.SetFieldPanel(PFL_NOTA_ETICHEPROTOC, -1, "", "ETICHEPROTOC", 0, 0, 0, -13997);
  }

  private void PAN_NOTA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTA.SetIMDB(IMDB, "PQRY_FEDOCUMENTAL", true);
    PAN_NOTA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE as RECFEDOCRASO, ");
    SQL.append("  A.CODICE_FISCALE as RECFEDOCCOFI, ");
    SQL.append("  A.NUMERO_DOCUMENTO as RECORDDOCUME, ");
    SQL.append("  A.DATA_DOCUMENTO as RECFEDOCDADO, ");
    SQL.append("  A.TIPO_DOCUMENTO as RECFEDOCTIDO, ");
    SQL.append("  A.IMPORTO as RECOFEDOCIMP, ");
    SQL.append("  A.NUMERO_PROT as RECFEDOCNUPR, ");
    SQL.append("  A.D_DATA_PROT as RECFEDODDAPR, ");
    SQL.append("  A.DATA_ARRIVO as RECFEDOCDAAR, ");
    SQL.append("  CASE WHEN (A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI') THEN -1 ELSE 1 END as VISUALIZZDOC, ");
    SQL.append("  A.ID_DOCUMENTO as RECFEDOCIDDO ");
    PAN_NOTA.SetQuery(PPQRY_FEDOCUMENTAL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FE_DOCUMENTALE A ");
    PAN_NOTA.SetQuery(PPQRY_FEDOCUMENTAL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID_DOCUMENTO = ~~TBL_PARPERACCNAC.ID_DOCUMENTO~~) ");
    PAN_NOTA.SetQuery(PPQRY_FEDOCUMENTAL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTA.SetQuery(PPQRY_FEDOCUMENTAL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTA.SetQuery(PPQRY_FEDOCUMENTAL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTA.SetQuery(PPQRY_FEDOCUMENTAL, 5, SQL, -1, "");
    PAN_NOTA.SetQueryDB(PPQRY_FEDOCUMENTAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTA.SetMasterTable(0, "FE_DOCUMENTALE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTA.Status() == 2)
    {
      int oldListQBE = PAN_NOTA.iUseListQBE;
      PAN_NOTA.iUseListQBE = 0;
      PAN_NOTA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FATTUDARETTI_Init()
  {

    PAN_FATTUDARETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTUDARETTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FATTUDARETTI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, "1E28572F-1BDF-4228-BC55-F477D36D01AA");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, "Anno Doc");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, "80839FED-C6C2-4D49-B27B-8F638CFC4206");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, "Numero Documento");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, "1C4BC312-1185-4036-885B-9C7439CCEE40");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, " ");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.VIS_HYPELINKIMMA);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, "1DFC489B-B8C4-44A3-AB1F-B42A1EE8F3BB");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, "Riepilogo Iva");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.VIS_HYPELINKIMMA);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, "0AF13B62-5916-4BB6-9B0B-8396C06FDD7A");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, "Importo");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, "7CA30FF3-3F01-444E-940D-8790089B593D");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, "Descrizione");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.VIS_NORMFIELPADR);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, "7550DD78-AA98-4F14-AC28-1A27CD5EF4E0");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, "RETFAT FAT ANNO PROG FAT");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.VIS_NORMFIELPADR);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, "C0809E2B-5B78-491F-8CD6-73880520E034");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, "RETFAT FAT NUMERO PROG FAT");
    PAN_FATTUDARETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, "");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.VIS_NORMFIELPADR);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FATTUDARETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, "F424241D-409C-4644-B3E1-1DB6D40C78AC");
    PAN_FATTUDARETTI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, "Documento");
    PAN_FATTUDARETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.VIS_LABEVISUSTYL);
    PAN_FATTUDARETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_FATTUDARETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_LIST, 0, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_LIST, 88);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_LIST, "Ann. Doc");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_FORM, 88);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATANNODOC, MyGlb.PANEL_FORM, "Anno Doc");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_FATANNODOC, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_FATANNODOC, PPQRY_FATTURECOLL1, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_LIST, 32, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_LIST, 108);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_LIST, "Numero Documento");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 76, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_FORM, 108);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_FATNUMERODOC, MyGlb.PANEL_FORM, "Num. Documento");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_FATNUMERODOC, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_FATNUMERODOC, PPQRY_FATTURECOLL1, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_LIST, 140, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_LIST, 76);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_LIST, " ");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_FORM, 4, 100, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_FORM, 76);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_INFOFATTURA, MyGlb.PANEL_FORM, " ");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_INFOFATTURA, -1, -1);
    PAN_FATTUDARETTI.SetFieldUnbound(PFL_FATTUDARETTI_INFOFATTURA, true);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_INFOFATTURA, PPQRY_FATTURECOLL1, "", "RECOINFOFATT", 5, 99, 0, -13997);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_INFOFATTURA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_LIST, 160, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_LIST, 84);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_LIST, "R. I.");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_FORM, 4, 124, 592, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_FORM, 84);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RIEPILOGOIVA, MyGlb.PANEL_FORM, "Riepilogo Iva");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_RIEPILOGOIVA, -1, -1);
    PAN_FATTUDARETTI.SetFieldUnbound(PFL_FATTUDARETTI_RIEPILOGOIVA, true);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_RIEPILOGOIVA, PPQRY_FATTURECOLL1, "", "RECORRIEPIVA", 5, 99, 0, -13997);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FATTUDARETTI.SetValueListItem(PFL_FATTUDARETTI_RIEPILOGOIVA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_LIST, 180, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_LIST, 108);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_FORM, 108);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_IMPORTO, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_IMPORTO, PPQRY_FATTURECOLL1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_LIST, 288, 36, 360, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_LIST, 128);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_FORM, 128);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_DESCRIZIONE1, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_DESCRIZIONE1, PPQRY_FATTURECOLL1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_LIST, 608, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_LIST, 168);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_LIST, "RETFAT FAT ANNO PROG FAT");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_FORM, 4, 100, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_FORM, 168);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATANPRFA, MyGlb.PANEL_FORM, "RETFAT FAT ANNO PROG FAT");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_RETFATANPRFA, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_RETFATANPRFA, PPQRY_FATTURECOLL1, "A.FAT_ANNO_PROG_FAT", "FAT_ANNO_PROG_FAT", 1, 4, 0, -13997);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_LIST, 608, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_LIST, 184);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_LIST, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_LIST, "RETFAT FAT NUMERO PROG FAT");
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_FORM, 4, 124, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_FORM, 184);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_RETFATNUPRFA, MyGlb.PANEL_FORM, "RETFAT FAT NUMERO PROG FAT");
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_RETFATNUPRFA, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_RETFATNUPRFA, PPQRY_FATTURECOLL1, "A.FAT_NUMERO_PROG_FAT", "FAT_NUMERO_PROG_FAT", 1, 5, 0, -13997);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.PANEL_LIST, 0, 0, 180, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.PANEL_LIST, 2);
    PAN_FATTUDARETTI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.PANEL_FORM, 200, 236, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTUDARETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_FATTUDARETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTUDARETTI_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_FATTUDARETTI.SetFieldPage(PFL_FATTUDARETTI_ETICHEDOCUME, -1, -1);
    PAN_FATTUDARETTI.SetFieldPanel(PFL_FATTUDARETTI_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
  }

  private void PAN_FATTUDARETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTUDARETTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTUDARETTI.SetIMDB(IMDB, "PQRY_FATTURECOLL1", true);
    PAN_FATTUDARETTI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FATTUDARETTI.SetQueryIMDB(PPQRY_FATTURECOLL1, IMDBDef10.PQRY_FATTURECOLL1_RS, IMDBDef2.TBL_FATTURECOLL);
    JustLoaded = true;
    PAN_FATTUDARETTI.SetFieldPrimaryIndex(PFL_FATTUDARETTI_FATANNODOC, IMDBDef2.FLD_FATTURECOLL_ANNO_DOC);
    PAN_FATTUDARETTI.SetFieldPrimaryIndex(PFL_FATTUDARETTI_FATNUMERODOC, IMDBDef2.FLD_FATTURECOLL_NUMERO_DOC);
    PAN_FATTUDARETTI.SetFieldPrimaryIndex(PFL_FATTUDARETTI_IMPORTO, IMDBDef2.FLD_FATTURECOLL_IMPORTO);
    PAN_FATTUDARETTI.SetFieldPrimaryIndex(PFL_FATTUDARETTI_DESCRIZIONE1, IMDBDef2.FLD_FATTURECOLL_DESCRIZIONE);
    PAN_FATTUDARETTI.SetFieldPrimaryIndex(PFL_FATTUDARETTI_RETFATANPRFA, IMDBDef2.FLD_FATTURECOLL_FAT_ANNO_PROG_FAT);
    PAN_FATTUDARETTI.SetFieldPrimaryIndex(PFL_FATTUDARETTI_RETFATNUPRFA, IMDBDef2.FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT);
    PAN_FATTUDARETTI.SetMasterTable(0, "FATTURECOLL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTUDARETTI.Status() == 2)
    {
      int oldListQBE = PAN_FATTUDARETTI.iUseListQBE;
      PAN_FATTUDARETTI.iUseListQBE = 0;
      PAN_FATTUDARETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTUDARETTI.PanelCommand(Glb.PCM_FIND);
      PAN_FATTUDARETTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "653CD4EC-3C4D-4AF1-80A8-4495D3B408FA");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "2ED16CDD-6DB2-4B36-A3F4-D1DE59EC15A1");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "9059CD3F-0941-4B28-8533-D0E4D7F695DF");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "D6CB1198-C88B-429F-9D79-BFDCA3A48721");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZION9, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZION9, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZION9, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 4, 836, 80, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 6);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZION9, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZION9", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (UPPER(A.PAGINA) = UPPER(" + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_ACCENOTDICRE,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   (A.FUNZIONE = 'AccettaNotaFE') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION9, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZION9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NOTA) PAN_NOTA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FATTUDARETTI) PAN_FATTUDARETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NOTA) PAN_NOTA_ValidateRow(Cancel);
    if (SrcObj == PAN_FATTUDARETTI) PAN_FATTUDARETTI_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NOTA) PAN_NOTA_DynamicProperties();
    if (SrcObj == PAN_FATTUDARETTI) PAN_FATTUDARETTI_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NOTA) PAN_NOTA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FATTUDARETTI) PAN_FATTUDARETTI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
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
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_NOTA) PAN_NOTA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FATTUDARETTI) PAN_FATTUDARETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
