// **********************************************
// Annulli Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AnnulliOrd extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTSCELMAND_ORDINATIVO = 0;
  private static int PFL_FILTSCELMAND_ANNOORD = 1;
  private static int PFL_FILTSCELMAND_DATADIANNULL = 2;
  private static int PFL_FILTSCELMAND_DEL = 3;

  private static int PPQRY_FILTRITABL12 = 0;


  IDPanel PAN_FILTSCELMAND;
  private static int PFL_ANNULLI_PROGRESSIVO = 0;
  private static int PFL_ANNULLI_PROG = 1;
  private static int PFL_ANNULLI_BENEFICIARIO = 2;
  private static int PFL_ANNULLI_IMPORTO = 3;
  private static int PFL_ANNULLI_VERSIONE = 4;
  private static int PFL_ANNULLI_TIPO = 5;
  private static int PFL_ANNULLI_DATAANNULLO = 6;
  private static int PFL_ANNULLI_OLDANNOMAND = 7;
  private static int PFL_ANNULLI_OLDPROGRTESO = 8;
  private static int PFL_ANNULLI_OLDDATAANNUL = 9;
  private static int PFL_ANNULLI_OLDNUMERMAND = 10;
  private static int PFL_ANNULLI_DATAINVIO = 11;
  private static int PFL_ANNULLI_NUOVOANNULLO = 12;
  private static int PFL_ANNULLI_NEWPANELLABE = 13;
  private static int PFL_ANNULLI_DATAMODIFICA = 14;

  private static int PPQRY_IMDBANNULLI2 = 0;


  IDPanel PAN_ANNULLI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OLDVALFILTA4(IMDB);
    Init_TBL_FILTRITABLE5(IMDB);
    Init_TBL_IMDBANNULLI(IMDB);
    //
    //
    Init_PQRY_FILTRITABL12(IMDB);
    Init_PQRY_FILTRITABL12_RS(IMDB);
    Init_PQRY_IMDBANNULLI2(IMDB);
    Init_PQRY_IMDBANNULLI2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OLDVALFILTA4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_OLDVALFILTA4, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_OLDVALFILTA4, "TBL_OLDVALFILTA4");
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA4,IMDBDef6.FLD_OLDVALFILTA4_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA4,IMDBDef6.FLD_OLDVALFILTA4_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA4,IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA4,IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA4,IMDBDef6.FLD_OLDVALFILTA4_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA4,IMDBDef6.FLD_OLDVALFILTA4_DATA_MAND,6,7,0);
    IMDB.TblAddNew(IMDBDef6.TBL_OLDVALFILTA4, 0);
  }

  private static void Init_TBL_FILTRITABLE5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_FILTRITABLE5, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_FILTRITABLE5, "TBL_FILTRITABLE5");
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE5,IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD,6,19,0);
    IMDB.TblAddNew(IMDBDef6.TBL_FILTRITABLE5, 0);
  }

  private static void Init_TBL_IMDBANNULLI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDBANNULLI, 16);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDBANNULLI, "TBL_IMDBANNULLI");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_DATA_INVIO, "DATA_INVIO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_DATA_INVIO,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMNUOANN, "ROWNAMNUOANN");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMNUOANN,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMDATMOD, "ROWNAMDATMOD");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMDATMOD,5,49,0);
  }

  private static void Init_PQRY_FILTRITABL12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABL12, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABL12, "PQRY_FILTRITABL12");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABL12, 0);
  }

  private static void Init_PQRY_FILTRITABL12_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABL12_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABL12_RS, "PQRY_FILTRITABL12_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL12_RS,IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD,6,19,0);
  }

  private static void Init_PQRY_IMDBANNULLI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBANNULLI2, 14);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBANNULLI2, "PQRY_IMDBANNULLI2");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_DATA_INVIO, "DATA_INVIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_DATA_INVIO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMNUOANN, "ROWNAMNUOANN");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMNUOANN,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD, "ROWNAMDATMOD");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_IMDBANNULLI2, 0);
  }

  private static void Init_PQRY_IMDBANNULLI2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 14);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBANNULLI2_RS, "PQRY_IMDBANNULLI2_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_DATA_INVIO, "DATA_INVIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_DATA_INVIO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMNUOANN, "ROWNAMNUOANN");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMNUOANN,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD, "ROWNAMDATMOD");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBANNULLI2_RS,IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AnnulliOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public AnnulliOrd()
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
    FormIdx = MyGlb.FRM_ANNULLIORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FFACBD54-D5A5-46AC-BE35-92BFB7A42259";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 608;
    DesignHeight = 366;
    set_Caption(new IDVariant("Annulli Ord"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 608;
    Frames[1].Height = 340;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.176471;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 608;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Scelta Mandati";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTSCELMAND = new IDPanel(w, this, 2, "PAN_FILTSCELMAND");
    Frames[2].Content = PAN_FILTSCELMAND;
    PAN_FILTSCELMAND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTSCELMAND.VS = MainFrm.VisualStyleList;
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2BB53FB5-0005-49EE-8B5A-FB7444A14F94");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 496, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTSCELMAND.InitStatus = 2;
    PAN_FILTSCELMAND_Init();
    PAN_FILTSCELMAND_InitFields();
    PAN_FILTSCELMAND_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 608;
    Frames[3].Height = 280;
    Frames[3].Caption = "Annulli";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 280;
    PAN_ANNULLI = new IDPanel(w, this, 3, "PAN_ANNULLI");
    Frames[3].Content = PAN_ANNULLI;
    PAN_ANNULLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ANNULLI.VS = MainFrm.VisualStyleList;
    PAN_ANNULLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 280-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4213BC5A-7F0D-40B6-9918-DBD228CB6DDD");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 532, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ANNULLI.InitStatus = 2;
    PAN_ANNULLI_Init();
    PAN_ANNULLI_InitFields();
    PAN_ANNULLI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA33+BaseCmdLinIdx)
      {
        Salva();
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
      if (IMDB.TblModified(IMDBDef6.TBL_FILTRITABLE5, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ANNULLIORD_FILTRITABL12();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_IMDBANNULLI, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ANNULLIORD_IMDBANNULLI2();
      }
      PAN_FILTSCELMAND.UpdatePanel(MainFrm);
      PAN_ANNULLI.UpdatePanel(MainFrm);
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
    return (obj instanceof AnnulliOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AnnulliOrd.class.getName() : (Glb.ClassWithPackage(AnnulliOrd.class) ? AnnulliOrd.class.getName().substring(AnnulliOrd.class.getPackage().getName().length() + 1) : AnnulliOrd.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Filtri Scelta Mandati On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FILTSCELMAND_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYDATA = new IDVariant(0,IDVariant.DATETIME);

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_FILTSCELMAND, Cancel);
      // 
      // Filtri Scelta Mandati On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0))))
      {
        // 
        // controllo se sono stati modificati i campi annoman
        // e numeroman
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_ANNO_MAND, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND, 0), true)!=0)
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0)))
          {
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0, (new IDVariant()));
          }
          else
          {
            if (ControlliSuOrdinativo(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(-1)), true))
            {
              IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
              v_MSG1 = (new IDVariant("Ordinativo non inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG1); 
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD, 0, (new IDVariant()));
              return;
            }
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD, 0, new IDVariant(v_MYDATA));
          }
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0))))
      {
        // 
        // contrrollo se è stata modificata la data di sostituzione
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_DATA_MAND, 0), true)!=0)
        {
          ControlloDataAnnulloPannelloFiltri();
        }
      }
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0));
      PAN_ANNULLI.PanelCommand(Glb.PCM_REQUERY);
      // 
      // Gestione old value. Questo folder deve essere sempre alla fine di questoo evento
      // 
      {
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_ANNO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_DATA_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0));
        // 
        // manca il del ma non è fondamentale
        // 
        {
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "FiltriSceltaMandatiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  public int RiempiIMDB (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Procedure Body
      // 
      RIEMPIIMDB_IMDANNDELROW();
      RIEMPIIMDB_IMDANNINSROW(AnnoOrdinativo, NumeroOrdinativo);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Annulli: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDANNDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBANNULLI);
  }

  // **********************************************************************
  // IMDB Annulli: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDANNINSROW(IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as ORDINFSTAPRO, ");
    SQL.append("  C.IMPORTO as ORDINFSUBIMP, ");
    SQL.append("  A.DATA as ORDINFSTADA1, ");
    SQL.append("  A.VERSIONE as ORDINFSTAVER, ");
    SQL.append("  A.PROGRESSIVO_TESO as ORDINFSTPRT1, ");
    SQL.append("  A.TIPO as ORDINFSTATIP, ");
    SQL.append("  A.DATA_INVIO as ORDINFSTDAIN, ");
    SQL.append("  C.RAGIONE_SOCIALE as ORDINFSURASO, ");
    SQL.append("  A.ANNO_ORD as ORDINFSTANO1, ");
    SQL.append("  A.NUMERO_ORD as ORDINFSTNUO1, ");
    SQL.append("  A.NUMERO_ORD as ORDINFSTNUOR, ");
    SQL.append("  A.ANNO_ORD as ORDINFSTANOR ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO A, ");
    SQL.append("  ORD_INF_TESTATA B, ");
    SQL.append("  ORD_INF_SUB C ");
    SQL.append("where (C.IDENTIFICATIVO_TESTATA = B.IDENTIFICATIVO_RECORD) ");
    SQL.append("and   (C.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.ANNO_ORD = B.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
    SQL.append("and   (A.VERSIONE = B.VERSIONE) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO D ");
    SQL.append("where (B.ANNO_ORD = D.ANNO_ORD) ");
    SQL.append("and   (B.NUMERO_ORD = D.NUMERO_ORD) ");
    SQL.append("and   (D.TIPO = 'V') ");
    SQL.append("and   ((D.DATA_INVIO IS NULL)) ");
    SQL.append("and   (A.PROGRESSIVO_TESO = D.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.VERSIONE = D.VERSIONE) ");
    SQL.append(")))) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO E ");
    SQL.append("where (A.ANNO_ORD = E.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = E.NUMERO_ORD) ");
    SQL.append("and   (E.TIPO = 'A') ");
    SQL.append("and   (A.PROGRESSIVO_TESO = E.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.VERSIONE = E.VERSIONE) ");
    SQL.append("))) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO F ");
    SQL.append("where (A.ANNO_ORD = F.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = F.NUMERO_ORD) ");
    SQL.append("and   (F.TIPO = 'A') ");
    SQL.append("and   ((F.DATA_INVIO IS NULL)) ");
    SQL.append("and   (A.PROGRESSIVO_TESO = F.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.VERSIONE = F.VERSIONE) ");
    SQL.append("))) ");
    SQL.append("and   (A.VERSIONE = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(G.VERSIONE) ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO G ");
    SQL.append("where (A.ANNO_ORD = G.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = G.NUMERO_ORD) ");
    SQL.append("and   (A.PROGRESSIVO_TESO = G.PROGRESSIVO_TESO) ");
    SQL.append(")) ");
    SQL.append("and   (A.PROGRESSIVO = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(H.PROGRESSIVO) ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO H ");
    SQL.append("where (A.ANNO_ORD = H.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = H.NUMERO_ORD) ");
    SQL.append("and   (A.PROGRESSIVO_TESO = H.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.VERSIONE = H.VERSIONE) ");
    SQL.append(")) ");
    SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_IMDBANNULLI, 0);
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_IMPORTO,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_DATA,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_VERSIONE,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO_TESO,0,RS.Get(5));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_TIPO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_DATA_INVIO,0,RS.Get(7));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_RAGIONE_SOCIALE,0,RS.Get(8));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ANNO_MAND,0,RS.Get(9));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_NUMERO_MAND,0,RS.Get(10));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLNUMA,0,RS.Get(11));
      IMDB.set_Value(IMDBDef6.TBL_IMDBANNULLI,IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLANMA,0,RS.Get(12));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Controllo Data Annullo Pannello Filtri
  // **********************************************************************
  public int ControlloDataAnnulloPannelloFiltri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSGA = (new IDVariant("La data indicata è inferiore alla data dell'Ordinativo.", IDVariant.STRING));
      // 
      // Controllo Data Annullo Pannello Filtri Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_MSGA); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "ControlloDataAnnulloPannelloFiltri", _e);
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
    int CurPos=0;
    IDCachedRowSet C4;
    IDCachedRowSet C11;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      // 
      // controllo preliminari prima degli inserimenti
      // 
      {
        // 
        // per i record con data annullo <> A (cioè per i nuovi annulli)) controllo se ci sono date nulle ed emetto messaggio di conferma
        // 
        {
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0))
          {
            // 
            // per i record con data annullo <> A (cioè per i nuovi
            // annulli)) controllo se ci sono date nulle ed emetto
            // messaggio di conferma
            // 
            if (IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_TIPO, 0).compareTo((new IDVariant("A")), true)!=0)
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0)))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Sono presenti righe di Nuovo Annullo senza indicazione della Data Annullo. Si desidera proseguire la registrazione?", IDVariant.STRING));
                if (!(MainFrm.MessageConfirm(v_MSG)))
                {
                  return 0;
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
          }
        }
      }
      // 
      // procedo con gli inserimenti
      // 
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BeginTrans();
        try
        {
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0))
          {
            // 
            // per i nuovi annulli senza indicazione della datanon
            // faccio nulla, per quelli con la data procedo con l
            // inserimento di un nuovo record di tipo A
            // 
            // 
            if (IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_TIPO, 0).compareTo((new IDVariant("A")), true)!=0)
            {
              if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0))))
              {
                SQL = new StringBuffer();
                SQL.append("insert into ORD_INF_STATO ");
                SQL.append("( ");
                SQL.append("  ANNO_ORD, ");
                SQL.append("  NUMERO_ORD, ");
                SQL.append("  TIPO, ");
                SQL.append("  DATA, ");
                SQL.append("  PROGRESSIVO_TESO, ");
                SQL.append("  VERSIONE, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  UTENTE_INSERIMENTO, ");
                SQL.append("  DATA_INSERIMENTO ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  'A', ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1, ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ) ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else
              {
                // 
                // per un nuovo annullo con data annullata non faccio
                // nulla
                // 
              }
            }
            else
            {
              // 
              // per un annullo già esistente
              // 
              // 
              // a
              // 
              {
                // 
                // se la data è stata annullata cancello il record
                // 
                if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0)))
                {
                  SQL = new StringBuffer();
                  SQL.append("delete from ORD_INF_STATO ");
                  SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (TIPO = 'A') ");
                  SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                else
                {
                  // 
                  // se la data è stata modificata
                  // 
                  // 
                  if (IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD, 0).equals((new IDVariant("SI")), true))
                  {
                    SQL = new StringBuffer();
                    SQL.append("update ORD_INF_STATO set ");
                    SQL.append("  DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                    SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (TIPO = 'A') ");
                    SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (DATA_ULTIMO_AGG = TRUNC( SYSDATE )) ");
                    MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                  }
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
          }
        }
        catch (Exception e20)
        {
          MainFrm.set_AlertMessage(new IDVariant(e20.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_NUMERO_MAND, 0));
      PAN_ANNULLI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Su Ordinativo
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // P Data: parametro per riferimento conterrà la data del mandato se questo esiste - Input/Output
  // **********************************************************************
  private IDVariant ControlliSuOrdinativo (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo, IDVariant PData)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlli Su Ordinativo Body
      // Procedure Body
      // 
      // 
      // primo controllo
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  ORD_INF_STATO A ");
        SQL.append("where ((A.TIPO = 'I') OR A.TIPO = 'S' AND NOT ((A.DATA_INVIO IS NULL))) ");
        SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_COUNT.equals((new IDVariant(0)), true))
        {
          return (new IDVariant(-1));
        }
      }
      // 
      // secondo controllo, dove setto la data del mandato
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MAX(A.DATA) as MAXORDINSTDA ");
        SQL.append("from ");
        SQL.append("  ORD_INF_STATO A ");
        SQL.append("where (A.TIPO = 'I' OR (A.TIPO = 'S' AND NOT ((A.DATA_INVIO IS NULL)))) ");
        SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.VERSIONE = ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  MAX(B.VERSIONE) ");
        SQL.append("from ");
        SQL.append("  ORD_INF_STATO B ");
        SQL.append("where (B.TIPO = 'I' OR (B.TIPO = 'S' AND NOT ((B.DATA_INVIO IS NULL)))) ");
        SQL.append("and   (B.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append(")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          PData.set(QV.Get("MAXORDINSTDA", IDVariant.DATETIME));
        }
        QV.Close();
      }
      return (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "ControlliSuOrdinativo", _e);
      return new IDVariant();
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Modifica Stato Ordinativi Trasmessi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_MYDATA = new IDVariant(0,IDVariant.DATETIME);
      // 
      // parametri di default
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0)))
        {
          IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        else
        {
          if (ControlliSuOrdinativo(IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(-1)), true))
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Ordinativo non inviato al Tesoriere", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG1); 
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD, 0, new IDVariant(v_MYDATA));
          RiempiIMDB(IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, 0));
        }
        IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR, 0, IDL.Today());
      }
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_ANNO_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_NUMERO_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA4, IMDBDef6.FLD_OLDVALFILTA4_DATA_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR, 0));
      PAN_ANNULLI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      PAN_ANNULLI.set_Header(Glb.OBJ_FIELD,PFL_ANNULLI_NUOVOANNULLO, (new IDVariant()).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "LoadEvent", _e);
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
      UNLOAD_FILTABDELROW();
      UNLOAD_IMDANNDELROW();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "Unload", _e);
    }
  }

  // **********************************************************************
  // Filtri Table: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FILTABDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD, 0, new IDVariant());
  }

  // **********************************************************************
  // IMDB Annulli: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDANNDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBANNULLI);
  }

  // **********************************************************************
  // Annulli On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ANNULLI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_ANNULLI, Cancel);
      // 
      // Annulli On Validate Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD, 0, (new IDVariant("SI")));
      // 
      // controllo se è stato modificato il campo data 
      // 
      {
        if (IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT, 0), true)!=0)
        {
          // 
          // aggiorno old value
          // 
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0));
          }
          // 
          // controllo la data annullo
          // 
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0))))
          {
            if (IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATORD, 0), true)<0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Data Annullo inferiore alla Data dell'Ordinativo", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return;
            }
          }
        }
      }
      IMDB.set_Value(IMDBDef15.PQRY_IMDBANNULLI2, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "AnnulliOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Annulli On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ANNULLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ANNULLI);
      // 
      // Annulli On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione tooltip
      // 
      {
        PAN_ANNULLI.set_ToolTip(Glb.OBJ_FIELD,PFL_ANNULLI_BENEFICIARIO,(new IDVariant(PAN_ANNULLI.FieldText(PFL_ANNULLI_BENEFICIARIO))).stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "AnnulliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Annulli On Database Error Event
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
  private void PAN_ANNULLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ANNULLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Annulli On Database Error Event Body
      // Procedure Body
      // 
      if (ErrorMessage.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(ErrorMessage); 
      }
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "AnnulliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Annulli After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ANNULLI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Annulli After Find Event Body
      // Procedure Body
      // 
      IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
      while (!IMDB.Eof(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0))
      {
        if (IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_TIPO, 0).compareTo((new IDVariant("A")), true)!=0)
        {
          IDVariant v_NUOVOANNULLO = new IDVariant(0,IDVariant.STRING);
          v_NUOVOANNULLO = (new IDVariant("Nuovo Annullo", IDVariant.STRING));
          if (!(IMDB.Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMDATMOD, 0).equals((new IDVariant("SI")), true)))
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_DATA, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL12, IMDBDef15.PQSL_FILTRITABL12_ROWNAMDATVAR, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef15.PQSL_IMDBANNULLI2_ROWNAMNUOANN, 0, new IDVariant(v_NUOVOANNULLO));
          }
        }
        IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnulliOrd", "AnnulliAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Table
  // Primary record source for panel data
  // **********************************************************************
  private void ANNULLIORD_FILTRITABL12() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_FILTRITABL12_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE5, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_FILTRITABLE5, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABL12_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_FILTRITABL12_RS, 0, IMDBDef6.TBL_FILTRITABLE5, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL12_RS, 0, 0, IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL12_RS, 1, 0, IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL12_RS, 2, 0, IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL12_RS, 3, 0, IMDBDef6.TBL_FILTRITABLE5, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_FILTRITABLE5, 0);
      if (IMDB.Eof(IMDBDef6.TBL_FILTRITABLE5, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE5, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_FILTRITABL12_RS, 0);
  }

  // **********************************************************************
  // IMDB Annulli
  // Primary record source for panel data
  // **********************************************************************
  private void ANNULLIORD_IMDBANNULLI2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_IMDBANNULLI2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBANNULLI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDBANNULLI, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0, IMDBDef6.TBL_IMDBANNULLI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 1, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_RAGIONE_SOCIALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 2, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 3, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_VERSIONE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 4, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_TIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 5, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_DATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 6, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLNUMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 7, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLANMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 8, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLPRTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 9, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLDDAT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 10, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_DATA_INVIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 11, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO_TESO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 12, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_ROWNAMNUOANN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBANNULLI2_RS, 13, 0, IMDBDef6.TBL_IMDBANNULLI, IMDBDef6.FLD_IMDBANNULLI_ROWNAMDATMOD, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDBANNULLI, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDBANNULLI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBANNULLI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_IMDBANNULLI2_RS, 0);
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
  private void PAN_FILTSCELMAND_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTSCELMAND, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTSCELMAND_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTSCELMAND);
    // Stub
  }

  private void PAN_FILTSCELMAND_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTSCELMAND_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILTSCELMAND_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTSCELMAND_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void PAN_ANNULLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ANNULLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ANNULLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ANNULLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FILTSCELMAND_Init()
  {

    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "14B40B6C-94FD-4A98-AC5E-8F7E6B8A7D4C");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "Ordinativo");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "FF8BE94A-05E3-4EF6-B356-4F40B36E54A5");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "ANNO ORD");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, "67363414-3B10-4712-B78E-DCD17DA95EAA");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, "Data di Annullo");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "4A10F1D6-9846-46D5-BEC9-2BDD8E7B0EB6");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "del   ");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.VIS_VISULOOUPCF4);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTSCELMAND_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_LIST, 84);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, 4, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, 68);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, "Ordinativo");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_ORDINATIVO, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ORDINATIVO, PPQRY_FILTRITABL12, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 120, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_ANNOORD, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ANNOORD, PPQRY_FILTRITABL12, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_LIST, 84);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_LIST, "Data di Annullo");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_FORM, 304, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_FORM, 104);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIANNULL, MyGlb.PANEL_FORM, "Data di Annullo");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DATADIANNULL, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DATADIANNULL, PPQRY_FILTRITABL12, "A.ROWNAMDATVAR", "ROWNAMDATVAR", 6, 15, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 40);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, "del   ");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 180, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 28);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, "del");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DEL, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DEL, PPQRY_FILTRITABL12, "A.ROWNAMDATORD", "ROWNAMDATORD", 6, 19, 0, -13997);
  }

  private void PAN_FILTSCELMAND_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTSCELMAND.SetIMDB(IMDB, "PQRY_FILTRITABL12", true);
    PAN_FILTSCELMAND.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTSCELMAND.SetQueryIMDB(PPQRY_FILTRITABL12, IMDBDef15.PQRY_FILTRITABL12_RS, IMDBDef6.TBL_FILTRITABLE5);
    JustLoaded = true;
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ORDINATIVO, IMDBDef6.FLD_FILTRITABLE5_NUMERO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ANNOORD, IMDBDef6.FLD_FILTRITABLE5_ANNO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DATADIANNULL, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATVAR);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DEL, IMDBDef6.FLD_FILTRITABLE5_ROWNAMDATORD);
    PAN_FILTSCELMAND.SetMasterTable(0, "FILTRITABLE5");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTSCELMAND.Status() == 2)
    {
      int oldListQBE = PAN_FILTSCELMAND.iUseListQBE;
      PAN_FILTSCELMAND.iUseListQBE = 0;
      PAN_FILTSCELMAND.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTSCELMAND.PanelCommand(Glb.PCM_FIND);
      PAN_FILTSCELMAND.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ANNULLI_Init()
  {

    PAN_ANNULLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ANNULLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ANNULLI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, "A03D2231-DFDB-4254-A33A-28D7A658C935");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, "Progressivo");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, "90C93E2F-B540-489C-ADD5-6C4546A5F68C");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, "Prog.");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, "FD88DA86-92C7-4A2E-A812-09CD3F29E689");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, "Beneficiario");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, "452DD9C6-9F00-4068-A48E-FEE0924308B7");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, "Importo");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, "9D04E1AE-02FA-4C1C-9EC0-D60ACD611C64");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, "VERSIONE");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, "9ACF66E3-1D8F-4F1F-A214-B5DBA5EB42AD");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, "TIPO");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, "B9FA7046-49F4-48AD-A70D-C7827674D6A0");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, "Data Annullo");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, "2CE72EB6-DB94-4E3C-8625-427EA3ADD6A9");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, "OLD ANNO MAND");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, "A6E642B3-567F-4637-8A0E-238B1235A3DF");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, "OLD PROGRESSIVO TESO");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, "03D082F8-8B66-470D-B551-496A443E49EC");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, "OLD DATA Annullo");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.VIS_NORMFIELPADR);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, "165AD7E4-7321-4BC6-8DFB-FC32222D4862");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, "OLD NUMERO MAND");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, "4C7D497E-C552-4800-B803-2706CE0ED113");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, "DATA INVIO");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, "82D7B42B-E97B-4A0D-992F-12469DF6828A");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, "NUOVO ANNULLO");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, "EF2A1B89-7B00-40A0-B00B-E695D128987B");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, 0 | MyGlb.FLD_INLIST, -1);
    PAN_ANNULLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, "0294D78A-CAB1-4EDB-A641-D4B116751BBF");
    PAN_ANNULLI.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, "DATA MODIFICATA");
    PAN_ANNULLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, "");
    PAN_ANNULLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.VIS_NORMFIELPADR);
    PAN_ANNULLI.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ANNULLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_LIST, "Prog.");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROGRESSIVO, MyGlb.PANEL_FORM, "Progressivo");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_PROGRESSIVO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_PROGRESSIVO, PPQRY_IMDBANNULLI2, "A.PROGRESSIVO", "PROGRESSIVO", 1, 2, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_LIST, 108);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_LIST, "Prog.");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_FORM, 4, 244, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_FORM, 108);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_PROG, MyGlb.PANEL_FORM, "Prog.");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_PROG, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_PROG, PPQRY_IMDBANNULLI2, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_LIST, 40, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_BENEFICIARIO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_BENEFICIARIO, PPQRY_IMDBANNULLI2, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 40, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_LIST, 240, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_IMPORTO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_IMPORTO, PPQRY_IMDBANNULLI2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_LIST, 60);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_LIST, "VERSIONE");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_FORM, 60);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_VERSIONE, MyGlb.PANEL_FORM, "VERSIONE");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_VERSIONE, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_VERSIONE, PPQRY_IMDBANNULLI2, "A.VERSIONE", "VERSIONE", 1, 2, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_LIST, 536, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_FORM, 4, 172, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_TIPO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_TIPO, PPQRY_IMDBANNULLI2, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_LIST, 320, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_LIST, 36);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_LIST, "Data Annullo");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_FORM, 36);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAANNULLO, MyGlb.PANEL_FORM, "D. A.");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_DATAANNULLO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_DATAANNULLO, PPQRY_IMDBANNULLI2, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_LIST, 492, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_LIST, 92);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_LIST, "OLD ANNO MAND");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_FORM, 92);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDANNOMAND, MyGlb.PANEL_FORM, "OLD ANN. MAND");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_OLDANNOMAND, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_OLDANNOMAND, PPQRY_IMDBANNULLI2, "A.ROWNAMOLANMA", "ROWNAMOLANMA", 1, 4, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_LIST, 492, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_LIST, 132);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_LIST, "OLD PROGRESSIVO TESO");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_FORM, 132);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDPROGRTESO, MyGlb.PANEL_FORM, "OLD PROGR. TESO");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_OLDPROGRTESO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_OLDPROGRTESO, PPQRY_IMDBANNULLI2, "A.ROWNAMOLPRTE", "ROWNAMOLPRTE", 1, 5, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_LIST, 492, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_LIST, 60);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_LIST, "OLD DATA Annullo");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_FORM, 4, 292, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_FORM, 60);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDDATAANNUL, MyGlb.PANEL_FORM, "O. D. Ann.");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_OLDDATAANNUL, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_OLDDATAANNUL, PPQRY_IMDBANNULLI2, "A.ROWNAMOLDDAT", "ROWNAMOLDDAT", 6, 19, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_LIST, 492, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_LIST, 108);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_LIST, "OLD NUMERO MAND");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_FORM, 108);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_OLDNUMERMAND, MyGlb.PANEL_FORM, "OLD NUM. MAND");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_OLDNUMERMAND, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_OLDNUMERMAND, PPQRY_IMDBANNULLI2, "A.ROWNAMOLNUMA", "ROWNAMOLNUMA", 1, 5, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_LIST, 396, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_LIST, 68);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_LIST, "DATA INVIO");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_FORM, 4, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_FORM, 68);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAINVIO, MyGlb.PANEL_FORM, "DT. INVIO");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_DATAINVIO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_DATAINVIO, PPQRY_IMDBANNULLI2, "A.DATA_INVIO", "DATA_INVIO", 6, 19, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_LIST, 400, 36, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_LIST, 96);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_LIST, "NUOVO ANNULLO");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_FORM, 4, 220, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_FORM, 96);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_NUOVOANNULLO, MyGlb.PANEL_FORM, "NUOV. ANNULLO");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_NUOVOANNULLO, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_NUOVOANNULLO, PPQRY_IMDBANNULLI2, "A.ROWNAMNUOANN", "ROWNAMNUOANN", 5, 49, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.PANEL_LIST, 400, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.PANEL_LIST, 2);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.PANEL_FORM, 424, 64, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_NEWPANELLABE, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_LIST, 76);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_LIST, "DATA MODIFICATA");
    PAN_ANNULLI.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_FORM, 4, 268, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_FORM, 76);
    PAN_ANNULLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLI_DATAMODIFICA, MyGlb.PANEL_FORM, "DT. MODIF.");
    PAN_ANNULLI.SetFieldPage(PFL_ANNULLI_DATAMODIFICA, -1, -1);
    PAN_ANNULLI.SetFieldPanel(PFL_ANNULLI_DATAMODIFICA, PPQRY_IMDBANNULLI2, "A.ROWNAMDATMOD", "ROWNAMDATMOD", 5, 49, 0, -13997);
  }

  private void PAN_ANNULLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ANNULLI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ANNULLI.SetIMDB(IMDB, "PQRY_IMDBANNULLI2", true);
    PAN_ANNULLI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_ANNULLI.SetQueryIMDB(PPQRY_IMDBANNULLI2, IMDBDef15.PQRY_IMDBANNULLI2_RS, IMDBDef6.TBL_IMDBANNULLI);
    JustLoaded = true;
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_PROGRESSIVO, IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_PROG, IMDBDef6.FLD_IMDBANNULLI_PROGRESSIVO_TESO);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_BENEFICIARIO, IMDBDef6.FLD_IMDBANNULLI_RAGIONE_SOCIALE);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_IMPORTO, IMDBDef6.FLD_IMDBANNULLI_IMPORTO);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_VERSIONE, IMDBDef6.FLD_IMDBANNULLI_VERSIONE);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_TIPO, IMDBDef6.FLD_IMDBANNULLI_TIPO);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_DATAANNULLO, IMDBDef6.FLD_IMDBANNULLI_DATA);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_OLDANNOMAND, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLANMA);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_OLDPROGRTESO, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLPRTE);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_OLDDATAANNUL, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLDDAT);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_OLDNUMERMAND, IMDBDef6.FLD_IMDBANNULLI_ROWNAMOLNUMA);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_DATAINVIO, IMDBDef6.FLD_IMDBANNULLI_DATA_INVIO);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_NUOVOANNULLO, IMDBDef6.FLD_IMDBANNULLI_ROWNAMNUOANN);
    PAN_ANNULLI.SetFieldPrimaryIndex(PFL_ANNULLI_DATAMODIFICA, IMDBDef6.FLD_IMDBANNULLI_ROWNAMDATMOD);
    PAN_ANNULLI.SetMasterTable(0, "IMDBANNULLI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ANNULLI.Status() == 2)
    {
      int oldListQBE = PAN_ANNULLI.iUseListQBE;
      PAN_ANNULLI.iUseListQBE = 0;
      PAN_ANNULLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ANNULLI.PanelCommand(Glb.PCM_FIND);
      PAN_ANNULLI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ANNULLI) PAN_ANNULLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_ValidateRow(Cancel);
    if (SrcObj == PAN_ANNULLI) PAN_ANNULLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_DynamicProperties();
    if (SrcObj == PAN_ANNULLI) PAN_ANNULLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ANNULLI) PAN_ANNULLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ANNULLI) PAN_ANNULLI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ANNULLI) PAN_ANNULLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
