// **********************************************
// Sostituzioni Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SostituzioniMandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTSCELMAND_MANDATO = 0;
  private static int PFL_FILTSCELMAND_ANNOMAND1 = 1;
  private static int PFL_FILTSCELMAND_DATADISOSTIT = 2;
  private static int PFL_FILTSCELMAND_DEL = 3;

  private static int PPQRY_FILTRITABL18 = 0;


  IDPanel PAN_FILTSCELMAND;
  private static int PFL_SOSTITUZIONI_PROGRESSIVO = 0;
  private static int PFL_SOSTITUZIONI_PROG = 1;
  private static int PFL_SOSTITUZIONI_BENEFICIARIO = 2;
  private static int PFL_SOSTITUZIONI_IMPORTO = 3;
  private static int PFL_SOSTITUZIONI_NUMEMANDSOST = 4;
  private static int PFL_SOSTITUZIONI_NUMEROMAND = 5;
  private static int PFL_SOSTITUZIONI_ANNOMANDSOST = 6;
  private static int PFL_SOSTITUZIONI_ANNOMAND = 7;
  private static int PFL_SOSTITUZIONI_PROGTESOSOST = 8;
  private static int PFL_SOSTITUZIONI_VERSIONE = 9;
  private static int PFL_SOSTITUZIONI_TIPO = 10;
  private static int PFL_SOSTITUZIONI_DATASOST = 11;
  private static int PFL_SOSTITUZIONI_MANDSOSTLAB1 = 12;
  private static int PFL_SOSTITUZIONI_OLDANNOMAND = 13;
  private static int PFL_SOSTITUZIONI_OLDPROGRTESO = 14;
  private static int PFL_SOSTITUZIONI_OLDDATA = 15;
  private static int PFL_SOSTITUZIONI_OLDNUMERMAND = 16;
  private static int PFL_SOSTITUZIONI_MODIFICATO = 17;

  private static int PPQRY_IMDBSOSTITU4 = 0;


  IDPanel PAN_SOSTITUZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OLDVALFILTA3(IMDB);
    Init_TBL_FILTRITABLE4(IMDB);
    Init_TBL_IMDBSOSTITU1(IMDB);
    //
    //
    Init_PQRY_FILTRITABL18(IMDB);
    Init_PQRY_FILTRITABL18_RS(IMDB);
    Init_PQRY_IMDBSOSTITU4(IMDB);
    Init_PQRY_IMDBSOSTITU4_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OLDVALFILTA3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_OLDVALFILTA3, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_OLDVALFILTA3, "TBL_OLDVALFILTA3");
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA3,IMDBDef6.FLD_OLDVALFILTA3_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA3,IMDBDef6.FLD_OLDVALFILTA3_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA3,IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA3,IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA3,IMDBDef6.FLD_OLDVALFILTA3_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA3,IMDBDef6.FLD_OLDVALFILTA3_DATA_MAND,6,7,0);
    IMDB.TblAddNew(IMDBDef6.TBL_OLDVALFILTA3, 0);
  }

  private static void Init_TBL_FILTRITABLE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_FILTRITABLE4, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_FILTRITABLE4, "TBL_FILTRITABLE4");
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS, "ROWNAMDATSOS");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS,6,15,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, "ROWNAMDATMAN");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE4,IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN,6,19,0);
    IMDB.TblAddNew(IMDBDef6.TBL_FILTRITABLE4, 0);
  }

  private static void Init_TBL_IMDBSOSTITU1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDBSOSTITU1, 17);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDBSOSTITU1, "TBL_IMDBSOSTITU1");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND_SOST, "ANNO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND_SOST,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMEMODIF,5,49,0);
  }

  private static void Init_PQRY_FILTRITABL18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABL18, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABL18, "PQRY_FILTRITABL18");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, "ROWNAMDATSOS");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, "ROWNAMDATMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABL18, 0);
  }

  private static void Init_PQRY_FILTRITABL18_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABL18_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABL18_RS, "PQRY_FILTRITABL18_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, "ROWNAMDATSOS");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, "ROWNAMDATMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABL18_RS,IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN,6,19,0);
  }

  private static void Init_PQRY_IMDBSOSTITU4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBSOSTITU4, 17);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBSOSTITU4, "PQRY_IMDBSOSTITU4");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, "ANNO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_IMDBSOSTITU4, 0);
  }

  private static void Init_PQRY_IMDBSOSTITU4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 17);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS, "PQRY_IMDBSOSTITU4_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, "ANNO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU4_RS,IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SostituzioniMandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public SostituzioniMandati()
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
    FormIdx = MyGlb.FRM_SOSTITMANDAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "04492916-D259-4CCB-A2A6-BC0F7448A338";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 568;
    DesignHeight = 362;
    set_Caption(new IDVariant("Sostituzioni Mandati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 568;
    Frames[1].Height = 336;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.178571;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 568;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Scelta Mandati";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTSCELMAND = new IDPanel(w, this, 2, "PAN_FILTSCELMAND");
    Frames[2].Content = PAN_FILTSCELMAND;
    PAN_FILTSCELMAND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTSCELMAND.VS = MainFrm.VisualStyleList;
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 568-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "96569F15-303F-415F-A6C4-34D5816C4245");
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
    Frames[3].Width = 568;
    Frames[3].Height = 276;
    Frames[3].Caption = "Sostituzioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 276;
    PAN_SOSTITUZIONI = new IDPanel(w, this, 3, "PAN_SOSTITUZIONI");
    Frames[3].Content = PAN_SOSTITUZIONI;
    PAN_SOSTITUZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOSTITUZIONI.VS = MainFrm.VisualStyleList;
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 568-MyGlb.PAN_OFFS_X, 276-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FFDCB3F7-C8E0-477B-8E0C-75A976E7D383");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SOSTITUZIONI.InitStatus = 2;
    PAN_SOSTITUZIONI_Init();
    PAN_SOSTITUZIONI_InitFields();
    PAN_SOSTITUZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA20+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef6.TBL_FILTRITABLE4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOSTITMANDAT_FILTRITABL18();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_IMDBSOSTITU1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOSTITMANDAT_IMDBSOSTITU4();
      }
      PAN_FILTSCELMAND.UpdatePanel(MainFrm);
      PAN_SOSTITUZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof SostituzioniMandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SostituzioniMandati.class.getName() : (Glb.ClassWithPackage(SostituzioniMandati.class) ? SostituzioniMandati.class.getName().substring(SostituzioniMandati.class.getPackage().getName().length() + 1) : SostituzioniMandati.class.getName()));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0))))
      {
        // 
        // controllo se sono stati modificati i campi annoman
        // e numeroman
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_ANNO_MAND, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0), true)!=0)
        {
          if (ControllaEsistenzaMandato(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0, new IDVariant(v_MYDATA));
            if (ControllaMandatoInviatoTesoriere2(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGC = new IDVariant(0,IDVariant.STRING);
              v_MSGC = (new IDVariant("Mandato già inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGC); 
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0, (new IDVariant()));
              return;
            }
            if (ControllaMandatoSosituzioneInviatoTesoriere(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);
              v_MSGA = (new IDVariant("Mandato di Sostituzione già inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGA); 
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0, (new IDVariant()));
              return;
            }
          }
          else
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Mandato Inesistente!", IDVariant.STRING));
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Indicarlo come Numero/Anno.", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2)); 
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0, (new IDVariant()));
            return;
          }
          // 
          // controllo se sulle liquidazioni del mandato il progressivo teseo è già valorizzato. Se non lo è richiamo la procedura progressivo teseo
          // 
          {
            if (!(ControllaProgressivoTeseo(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0))))
            {
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0, (new IDVariant()));
              return;
            }
          }
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, 0))))
      {
        // 
        // contrrollo se è stata modificata la data di sostituzione
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_DATA_MAND, 0), true)!=0)
        {
          // 
          // Controllo Data Sostituzione Pannello Filtri () = Uno
          // 
          if (ControlloDataSostituzionePannelloFiltri().equals((new IDVariant(1)), true))
          {
          }
        }
      }
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0));
      PAN_SOSTITUZIONI.PanelCommand(Glb.PCM_REQUERY);
      // 
      // Gestione old value. Questo folder deve essere sempre alla fine di questoo evento
      // 
      {
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_ANNO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_DATA_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, 0));
        // 
        // manca il del ma non è fondamentale
        // 
        {
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "FiltriSceltaMandatiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Anno Mandato:  - Input
  // Numero Mandato:  - Input
  // **********************************************************************
  public int RiempiIMDB (IDVariant AnnoMandato, IDVariant NumeroMandato)
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
      RIEMPIIMDB_IMDSOSDELROW();
      RIEMPIIMDB_IMDSOSINSRO1(AnnoMandato, NumeroMandato);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Sostituzioni: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDSOSDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBSOSTITU1);
  }

  // **********************************************************************
  // IMDB Sostituzioni: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDSOSINSRO1(IDVariant AnnoMandato, IDVariant NumeroMandato) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as MANINFSTAPRO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  SUM(B.IMPORTO) as SUMLIQIMPORT, ");
    SQL.append("  A.DATA as MANINFSTADA1, ");
    SQL.append("  A.ANNO_MAND as MANINFSTANM1, ");
    SQL.append("  A.NUMERO_MAND as MANINFSTNUM1, ");
    SQL.append("  A.VERSIONE as MANINFSTAVER, ");
    SQL.append("  A.PROGRESSIVO_TESO as MANINFSTPRT1, ");
    SQL.append("  A.TIPO as MANINFSTATIP, ");
    SQL.append("  A.ANNO_MAND_SOST as MAINSTANMASO, ");
    SQL.append("  A.NUMERO_MAND_SOST as MAINSTNUMASO, ");
    SQL.append("  A.PROGRESSIVO_TESO_SOST as MAINSTPRTESO, ");
    SQL.append("  A.NUMERO_MAND as MANINFSTNUMA, ");
    SQL.append("  A.ANNO_MAND as MANINFSTANMA, ");
    SQL.append("  A.PROGRESSIVO_TESO as MANINFSTPRTE, ");
    SQL.append("  A.DATA as MANINFSTADAT ");
    SQL.append("from ");
    SQL.append("  MAN_INF_STATO A, ");
    SQL.append("  LIQ B, ");
    SQL.append("  BEN C ");
    SQL.append("where (C.CODICE = DECODE(B.DIVERSO_BEN, to_number(NULL), B.BENEFICIARIO, B.DIVERSO_BEN)) ");
    SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.TIPO = 'S') ");
    SQL.append("and   (B.ANNO_MAND = A.ANNO_MAND AND A.NUMERO_MAND = B.NUMERO_MAND AND A.VERSIONE = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(D.VERSIONE) ");
    SQL.append("from ");
    SQL.append("  MAN_INF_STATO D ");
    SQL.append("where (D.ANNO_MAND = A.ANNO_MAND AND D.NUMERO_MAND = A.NUMERO_MAND AND D.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
    SQL.append(") AND A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.PROGRESSIVO = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(E.PROGRESSIVO) ");
    SQL.append("from ");
    SQL.append("  MAN_INF_STATO E ");
    SQL.append("where (E.ANNO_MAND = A.ANNO_MAND AND E.NUMERO_MAND = A.NUMERO_MAND AND A.PROGRESSIVO_TESO = E.PROGRESSIVO_TESO) ");
    SQL.append(")) ");
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.DATA, ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND, ");
    SQL.append("  A.VERSIONE, ");
    SQL.append("  A.PROGRESSIVO_TESO, ");
    SQL.append("  A.TIPO, ");
    SQL.append("  A.ANNO_MAND_SOST, ");
    SQL.append("  A.NUMERO_MAND_SOST, ");
    SQL.append("  A.PROGRESSIVO_TESO_SOST, ");
    SQL.append("  A.NUMERO_MAND, ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.PROGRESSIVO_TESO, ");
    SQL.append("  A.DATA ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  SUM(F.IMPORTO), ");
    SQL.append("  to_date(NULL), ");
    SQL.append("  F.ANNO_MAND, ");
    SQL.append("  F.NUMERO_MAND, ");
    SQL.append("  1, ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  'N', ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  F.NUMERO_MAND, ");
    SQL.append("  F.ANNO_MAND, ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  to_date(NULL) ");
    SQL.append("from ");
    SQL.append("  LIQ F, ");
    SQL.append("  BEN G ");
    SQL.append("where (G.CODICE = DECODE(F.DIVERSO_BEN, to_number(NULL), F.BENEFICIARIO, F.DIVERSO_BEN)) ");
    SQL.append("and   (F.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND F.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  MAN_INF_STATO H ");
    SQL.append("where (H.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND H.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND H.PROGRESSIVO_TESO = F.PROGRESSIVO_TESO) ");
    SQL.append("and   (H.TIPO = 'S') ");
    SQL.append(")))) ");
    SQL.append("group by ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  F.ANNO_MAND, ");
    SQL.append("  F.NUMERO_MAND, ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  F.NUMERO_MAND, ");
    SQL.append("  F.ANNO_MAND, ");
    SQL.append("  F.PROGRESSIVO_TESO ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_IMDBSOSTITU1, 0);
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_RAGIONE_SOCIALE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_IMPORTO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_DATA,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND,0,RS.Get(5));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND,0,RS.Get(6));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_VERSIONE,0,RS.Get(7));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO,0,RS.Get(8));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_TIPO,0,RS.Get(9));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND_SOST,0,RS.Get(10));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND_SOST,0,RS.Get(11));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO_SOST,0,RS.Get(12));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLNUMA,0,RS.Get(13));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLANMA,0,RS.Get(14));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLPRTE,0,RS.Get(15));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITU1,IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLDDAT,0,RS.Get(16));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Controlla Progressivo Teseo
  // Anno Mandato:  - Input
  // Numero Mandato:  - Input
  // **********************************************************************
  public boolean ControllaProgressivoTeseo (IDVariant AnnoMandato, IDVariant NumeroMandato)
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
      // Controlla Progressivo Teseo Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (NOT ((A.PROGRESSIVO_TESO IS NULL))) ");
      SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.PROGTESOMANINF(AnnoMandato, NumeroMandato);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return (new IDVariant(0)).booleanValue();
        }
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "ControllaProgressivoTeseo", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controllo Data Sostituzione Pannello Filtri
  // **********************************************************************
  public IDVariant ControlloDataSostituzionePannelloFiltri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSGA = (new IDVariant("La data indicata è inferiore alla data del Mandato.", IDVariant.STRING));
      // 
      // Controllo Data Sostituzione Pannello Filtri Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_MSGA); 
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "ControlloDataSostituzionePannelloFiltri", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Mandato Sosituzione Inviato Tesoriere
  // Anno Mandato:  - Input
  // Numero Mandato:  - Input
  // **********************************************************************
  private IDVariant ControllaMandatoSosituzioneInviatoTesoriere (IDVariant AnnoMandato, IDVariant NumeroMandato)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYTIPO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MYTIPO = (new IDVariant("S", IDVariant.STRING));
      // 
      // Controlla Mandato Sosituzione Inviato Tesoriere Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = " + IDL.CSql(v_MYTIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NOT ((A.DATA_INVIO IS NULL)) AND A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO B ");
      SQL.append("where (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   (A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      SQL.append("and   (A.PROGRESSIVO = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.PROGRESSIVO) ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO C ");
      SQL.append("where (C.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (C.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("and   (C.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
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
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "ControllaMandatoSosituzioneInviatoTesoriere", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Mandato Inviato Tesoriere 2
  // Explain which processing is carried out by this procedure
  // Anno Mandato:  - Input
  // Numero Mandato:  - Input
  // **********************************************************************
  private IDVariant ControllaMandatoInviatoTesoriere2 (IDVariant AnnoMandato, IDVariant NumeroMandato)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYTIPO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MYTIPO = (new IDVariant("S", IDVariant.STRING));
      // 
      // Controlla Mandato Inviato Tesoriere 2 Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO <> " + IDL.CSql(v_MYTIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO B ");
      SQL.append("where (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   (A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      SQL.append("and   (A.PROGRESSIVO = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.PROGRESSIVO) ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO C ");
      SQL.append("where (C.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (C.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("and   (C.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
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
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "ControllaMandatoInviatoTesoriere2", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Esistenza Mandato
  // Anno Mandato:  - Input
  // Numero Mandato:  - Input
  // P Data: parametro per riferimento conterrà la data del mandato se questo esiste - Input/Output
  // **********************************************************************
  private IDVariant ControllaEsistenzaMandato (IDVariant AnnoMandato, IDVariant NumeroMandato, IDVariant PData)
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
      // Controlla Esistenza Mandato Body
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
        SQL.append("  MAN A ");
        SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
        SQL.append("  A.D_DATA_MAND as MANDDATAMAND ");
        SQL.append("from ");
        SQL.append("  MAN A ");
        SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          PData.set(QV.Get("MANDDATAMAND", IDVariant.DATETIME));
        }
        QV.Close();
      }
      return (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "ControllaEsistenzaMandato", _e);
      return new IDVariant();
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
    IDCachedRowSet C17;

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
        // controllo se per ogni record sono stati opportunamente inseriti i dati del mandata sostituzione e della data sostituzione
        // 
        {
          IDVariant v_TOTRECORD = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_RECORDVUOTI = new IDVariant(0,IDVariant.INTEGER);
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0))
          {
            if (!(PAN_SOSTITUZIONI.IsNewRow()))
            {
              v_TOTRECORD = IDL.Add(v_TOTRECORD, (new IDVariant(1)));
              if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0)))
              {
                v_RECORDVUOTI = IDL.Add(v_RECORDVUOTI, (new IDVariant(1)));
              }
              else
              {
                if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0)))
                {
                  IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
                  v_MSG1 = (new IDVariant("Dati Mandato Sostituito Incompleti!", IDVariant.STRING));
                  MainFrm.set_AlertMessage(v_MSG1); 
                  return 0;
                }
                else
                {
                  IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
                  v_MSG2 = (new IDVariant("Sono stati indicati i dati del Mandato Sostitutivo indicare la Data Sostituzione!", IDVariant.STRING));
                  if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0)))
                  {
                    MainFrm.set_AlertMessage(v_MSG2); 
                    return 0;
                  }
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
          }
          if (v_TOTRECORD.compareTo(v_RECORDVUOTI, true)!=0 && v_RECORDVUOTI.compareTo((new IDVariant(0)), true)!=0)
          {
            IDVariant v_MSG4 = new IDVariant(0,IDVariant.STRING);
            v_MSG4 = (new IDVariant("Gli estremi del Mandato Sostituito non sono stati indicati per tutti i record!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG4); 
            return 0;
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
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0))
          {
            // 
            // se il mandato non era esistente lo inserisco
            // 
            {
              if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0))))
              {
                IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  MAN_INF_STATO A ");
                SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NOT ((A.DATA_INVIO IS NULL))) ");
                SQL.append("and   (A.TIPO = 'I') ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_COUNT.equals((new IDVariant(0)), true))
                {
                  MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Mandato ")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0))), (new IDVariant(" non inviato, non può essere sostituito")))); 
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  return 0;
                }
              }
              if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_TIPO, 0).equals((new IDVariant("N")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0))))
              {
                SQL = new StringBuffer();
                SQL.append("insert into MAN_INF_STATO ");
                SQL.append("( ");
                SQL.append("  ANNO_MAND, ");
                SQL.append("  NUMERO_MAND, ");
                SQL.append("  TIPO, ");
                SQL.append("  DATA, ");
                SQL.append("  PROGRESSIVO_TESO, ");
                SQL.append("  VERSIONE, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  ANNO_MAND_SOST, ");
                SQL.append("  NUMERO_MAND_SOST, ");
                SQL.append("  PROGRESSIVO_TESO_SOST, ");
                SQL.append("  UTENTE_INSERIMENTO, ");
                SQL.append("  DATA_INSERIMENTO ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  'S', ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  1, ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1, ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ) ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else
              {
                // 
                // se il record era  presente e la data viene annullata
                // 
                if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0)))
                {
                  SQL = new StringBuffer();
                  SQL.append("delete from MAN_INF_STATO ");
                  SQL.append("where (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (TIPO = 'S') ");
                  SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                else
                {
                  // 
                  // il record era già presente ma è stato modificato
                  // 
                  if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF, 0).equals((new IDVariant("SI")), true))
                  {
                    SQL = new StringBuffer();
                    SQL.append("update MAN_INF_STATO set ");
                    SQL.append("  DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  ANNO_MAND_SOST = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  NUMERO_MAND_SOST = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  PROGRESSIVO_TESO_SOST = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                    SQL.append("where (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (TIPO = 'S') ");
                    SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                  }
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
          }
        }
        catch (Exception e27)
        {
          MainFrm.set_AlertMessage(new IDVariant(e27.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_NUMERO_MAND, 0));
      PAN_SOSTITUZIONI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "Salva", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Modifica Stato Mandati Trasmessi", IDVariant.STRING));
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
        if (IDL.IsNull(IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0)))
        {
          IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        else
        {
          if (ControllaEsistenzaMandato(IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0, new IDVariant(v_MYDATA));
            if (ControllaMandatoInviatoTesoriere2(IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGC = new IDVariant(0,IDVariant.STRING);
              v_MSGC = (new IDVariant("Mandato già inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGC); 
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0, (new IDVariant()));
            }
            if (ControllaMandatoSosituzioneInviatoTesoriere(IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);
              v_MSGA = (new IDVariant("Mandato di Sostituzione già inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGA); 
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0, (new IDVariant()));
            }
          }
          else
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Mandato Inesistente!", IDVariant.STRING));
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Indicarlo come Numero/Anno.", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2)); 
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0, (new IDVariant()));
          }
          // 
          // controllo se sulle liquidazioni del mandato il progressivo teseo è già valorizzato. Se non lo è richiamo la procedura progressivo teseo
          // 
          {
            if (!(ControllaProgressivoTeseo(IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0))))
            {
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0, (new IDVariant()));
            }
          }
          RiempiIMDB(IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0));
        }
        IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS, 0, IDL.Today());
      }
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_ANNO_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_NUMERO_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA3, IMDBDef6.FLD_OLDVALFILTA3_DATA_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS, 0));
      PAN_SOSTITUZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "LoadEvent", _e);
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
      UNLOAD_IMDSOSDELROW();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "Unload", _e);
    }
  }

  // **********************************************************************
  // Filtri Table: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FILTABDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0, new IDVariant());
  }

  // **********************************************************************
  // IMDB Sostituzioni: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDSOSDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBSOSTITU1);
  }

  // **********************************************************************
  // Sostituzioni On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SOSTITUZIONI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_SOSTITUZIONI, Cancel);
      // 
      // Sostituzioni On Validate Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF, 0, (new IDVariant("SI")));
      // 
      // controllo se è stato modificato il campo data 
      // 
      {
        if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT, 0), true)!=0)
        {
          // 
          // aggiorno old value
          // 
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0));
          }
          // 
          // controllo la data sostituzione
          // 
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0))))
          {
            if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATMAN, 0), true)<0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Data Sostituzione inferiore alla Data del Mandato.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
            }
          }
        }
      }
      // 
      // controllo se è stato modificato i campi relativi al mandato
      // 
      {
        if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLNUMA, 0), true)!=0 && IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLANMA, 0), true)!=0 && IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLPRTE, 0), true)!=0)
        {
          // 
          // aggiorno old value
          // 
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLNUMA, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLANMA, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND_SOST, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLPRTE, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ANNO_MAND, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO, 0)))
          {
            IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
            v_ERRORMESSAGE = (new IDVariant("Dati Mandato Sostituito Incompleti!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
          }
          else
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0)))
            {
              IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
              v_ERRORMESSAGE = (new IDVariant("Sono stati indicati i dati del Mandato Sostitutivo indicare la Data Sostituzione!", IDVariant.STRING));
              // 
              // aggiorno old value
              // 
              {
                IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0));
              }
              MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
              return;
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "SostituzioniOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Sostituzioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SOSTITUZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SOSTITUZIONI);
      // 
      // Sostituzioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione tooltip
      // 
      {
        PAN_SOSTITUZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_SOSTITUZIONI_BENEFICIARIO,(new IDVariant(PAN_SOSTITUZIONI.FieldText(PFL_SOSTITUZIONI_BENEFICIARIO))).stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "SostituzioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Sostituzioni On Database Error Event
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
  private void PAN_SOSTITUZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SOSTITUZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Sostituzioni On Database Error Event Body
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
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "SostituzioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Sostituzioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SOSTITUZIONI_AfterFind(IDVariant Command)
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
      // Sostituzioni After Find Event Body
      // Procedure Body
      // 
      IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
      while (!IMDB.Eof(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST, 0)) && !(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMEMODIF, 0).equals((new IDVariant("SI")), true)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_DATA, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, 0));
          IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef15.PQSL_IMDBSOSTITU4_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABL18, IMDBDef15.PQSL_FILTRITABL18_ROWNAMDATSOS, 0));
        }
        IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniMandati", "SostituzioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Table
  // Primary record source for panel data
  // **********************************************************************
  private void SOSTITMANDAT_FILTRITABL18() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_FILTRITABL18_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_FILTRITABLE4, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABL18_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_FILTRITABL18_RS, 0, IMDBDef6.TBL_FILTRITABLE4, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL18_RS, 0, 0, IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL18_RS, 1, 0, IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL18_RS, 2, 0, IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABL18_RS, 3, 0, IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_FILTRITABLE4, 0);
      if (IMDB.Eof(IMDBDef6.TBL_FILTRITABLE4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_FILTRITABL18_RS, 0);
  }

  // **********************************************************************
  // IMDB Sostituzioni
  // Primary record source for panel data
  // **********************************************************************
  private void SOSTITMANDAT_IMDBSOSTITU4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_IMDBSOSTITU4_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBSOSTITU1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDBSOSTITU1, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0, IMDBDef6.TBL_IMDBSOSTITU1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 1, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_RAGIONE_SOCIALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 2, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 3, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 4, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 5, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 6, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_VERSIONE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 7, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_TIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 8, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_DATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 9, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND_SOST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 10, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND_SOST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 11, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO_SOST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 12, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLNUMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 13, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLANMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 14, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLPRTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 15, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLDDAT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 16, 0, IMDBDef6.TBL_IMDBSOSTITU1, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMEMODIF, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDBSOSTITU1, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDBSOSTITU1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBSOSTITU1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_IMDBSOSTITU4_RS, 0);
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

  private void PAN_SOSTITUZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SOSTITUZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SOSTITUZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SOSTITUZIONI_IntValidateRow(Cancel);
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
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, "99CF3BA1-B15C-46D2-B728-FBC02CEEB550");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, "Mandato");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, "E8E3AA38-1D49-40B2-BAE4-121B4D58FC3F");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, "ANNO MAND");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, "F17E4BE2-090C-4006-9D73-48CA58854C6C");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, "Data di Sostituzione");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "81A070BE-081E-45B6-8E64-EE6335214236");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "del   ");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.VIS_VISULOOUPCF4);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTSCELMAND_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_LIST, 84);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_FORM, 4, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_FORM, 60);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_MANDATO, MyGlb.PANEL_FORM, "Mandato");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_MANDATO, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_MANDATO, PPQRY_FILTRITABL18, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_LIST, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_FORM, 112, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_FORM, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOMAND1, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_ANNOMAND1, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ANNOMAND1, PPQRY_FILTRITABL18, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, 84);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, "Data di Sostituzione");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, 292, 4, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, 124);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, "Data di Sostituzione");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DATADISOSTIT, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DATADISOSTIT, PPQRY_FILTRITABL18, "A.ROWNAMDATSOS", "ROWNAMDATSOS", 6, 15, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 40);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, "del   ");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 168, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 28);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, "del");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DEL, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DEL, PPQRY_FILTRITABL18, "A.ROWNAMDATMAN", "ROWNAMDATMAN", 6, 19, 0, -13997);
  }

  private void PAN_FILTSCELMAND_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTSCELMAND.SetIMDB(IMDB, "PQRY_FILTRITABL18", true);
    PAN_FILTSCELMAND.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTSCELMAND.SetQueryIMDB(PPQRY_FILTRITABL18, IMDBDef15.PQRY_FILTRITABL18_RS, IMDBDef6.TBL_FILTRITABLE4);
    JustLoaded = true;
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_MANDATO, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ANNOMAND1, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DATADISOSTIT, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATSOS);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DEL, IMDBDef6.FLD_FILTRITABLE4_ROWNAMDATMAN);
    PAN_FILTSCELMAND.SetMasterTable(0, "FILTRITABLE4");
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

  private void PAN_SOSTITUZIONI_Init()
  {

    PAN_SOSTITUZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SOSTITUZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SOSTITUZIONI.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, "1F5699A6-1740-4F87-A814-3ABBE618DFBA");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, "Progressivo");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, "A042C9AD-AFB6-45D7-AF61-AE9BC04C43A6");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, "Prog.");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, "5A961CDD-904B-451F-B6B9-97CCE4440EA2");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, "Beneficiario");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, "7C03820F-74CB-4070-AA88-6E259B63971C");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, "Importo");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, "B23AC08A-1556-488B-9A04-5EAACE2164D5");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, "NUMERO MAND SOST");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, "3BF6F5AC-F934-4331-81ED-6E8235A2CACF");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, "NUMERO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, "D3DB6C0C-A9BA-451C-ABBC-EEA048D703B1");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, "ANNO MAND SOST");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, "3FEA08DA-54A5-43EB-9E50-E8F57E7C950E");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, "ANNO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, "406E8B65-A400-4F3E-8C45-C68E2616D60F");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, "PROGRESSIVO TESO SOST");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, "0BFEA741-E51D-4D11-AB3A-CFC11EF6C6CE");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, "VERSIONE");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, "6EC5C32F-F706-474D-AA1E-A45BCC12E3AF");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, "TIPO");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, "C68496E3-8491-4432-9327-37D1D25651B2");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, "Data Sost.");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, "1AD30ADE-43F2-4587-B59B-B810FA7D4D8A");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, "Mandato Sostituito");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.VIS_LABEVISUSTYL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, "F500B640-956B-413D-9CD4-F8F1B92FA9EB");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, "OLD ANNO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, "CBD39CED-E85D-4FCF-BC04-A725D47B0B5E");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, "OLD PROGRESSIVO TESO");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, "A97A704F-F603-47E0-88F2-255BF8A7AADF");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, "OLD DATA");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.VIS_NORMFIELPADR);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, "F89DADA1-D2DA-4D60-B660-8948A361ABB2");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, "OLD NUMERO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, "CC84E2F5-C1DB-4DA5-AA86-FE64024C6B27");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, "MODIFICATO");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.VIS_NORMFIELPADR);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SOSTITUZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "Prog.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "Progressivo");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_PROGRESSIVO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_PROGRESSIVO, PPQRY_IMDBSOSTITU4, "A.PROGRESSIVO", "PROGRESSIVO", 1, 2, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_LIST, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_LIST, "Prog.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_FORM, 4, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_FORM, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROG, MyGlb.PANEL_FORM, "Prog.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_PROG, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_PROG, PPQRY_IMDBSOSTITU4, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 40, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_BENEFICIARIO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_BENEFICIARIO, PPQRY_IMDBSOSTITU4, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 40, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, 240, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_IMPORTO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_IMPORTO, PPQRY_IMDBSOSTITU4, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, 112);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, "NM. M. SS.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, 4, 244, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, 112);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, "NUM. MAND SOST");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_NUMEMANDSOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_NUMEMANDSOST, PPQRY_IMDBSOSTITU4, "A.NUMERO_MAND_SOST", "NUMERO_MAND_SOST", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_NUMEROMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_NUMEROMAND, PPQRY_IMDBSOSTITU4, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, 360, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, "A. M. S.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, "ANN. MAND SOST");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_ANNOMANDSOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_ANNOMANDSOST, PPQRY_IMDBSOSTITU4, "A.ANNO_MAND_SOST", "ANNO_MAND_SOST", 1, 4, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, 352, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, "AN. MN.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_ANNOMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_ANNOMAND, PPQRY_IMDBSOSTITU4, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, 140);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, "PRG. T. SS.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, 140);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, "PROGR. TESO SOST");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_PROGTESOSOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_PROGTESOSOST, PPQRY_IMDBSOSTITU4, "A.PROGRESSIVO_TESO_SOST", "PROGRESSIVO_TESO_SOST", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, "VERSIONE");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, "VERSIONE");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_VERSIONE, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_VERSIONE, PPQRY_IMDBSOSTITU4, "A.VERSIONE", "VERSIONE", 1, 2, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, 536, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, 4, 172, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_TIPO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_TIPO, PPQRY_IMDBSOSTITU4, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, 432, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, 36);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, "Data Sost.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, 36);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, "D. Ss.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_DATASOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_DATASOST, PPQRY_IMDBSOSTITU4, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_LIST, 320, 0, 112, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_LIST, 0);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_LIST, 2);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_FORM, 280, 4, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_FORM, 0);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_MANDSOSTLAB1, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_MANDSOSTLAB1, -1, "", "MANDSOSTLAB1", 0, 0, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, 492, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, 92);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, "OLD ANNO MAND");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, 92);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, "OLD ANN. MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDANNOMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDANNOMAND, PPQRY_IMDBSOSTITU4, "A.ROWNAMOLANMA", "ROWNAMOLANMA", 1, 4, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 492, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 132);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, "OLD PROGRESSIVO TESO");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 132);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, "OLD PROGR. TESO");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDPROGRTESO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDPROGRTESO, PPQRY_IMDBSOSTITU4, "A.ROWNAMOLPRTE", "ROWNAMOLPRTE", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, 492, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, "OLD DATA");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, 4, 292, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, "OLD DT.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDDATA, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDDATA, PPQRY_IMDBSOSTITU4, "A.ROWNAMOLDDAT", "ROWNAMOLDDAT", 6, 19, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 492, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, "OLD NUMERO MAND");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, "OLD NUM. MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDNUMERMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDNUMERMAND, PPQRY_IMDBSOSTITU4, "A.ROWNAMOLNUMA", "ROWNAMOLNUMA", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, 76);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, "MODIFICATO");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, 4, 292, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, 76);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, "MODIF.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_MODIFICATO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_MODIFICATO, PPQRY_IMDBSOSTITU4, "A.ROWNAMEMODIF", "ROWNAMEMODIF", 5, 49, 0, -13997);
  }

  private void PAN_SOSTITUZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOSTITUZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SOSTITUZIONI.SetIMDB(IMDB, "PQRY_IMDBSOSTITU4", true);
    PAN_SOSTITUZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_SOSTITUZIONI.SetQueryIMDB(PPQRY_IMDBSOSTITU4, IMDBDef15.PQRY_IMDBSOSTITU4_RS, IMDBDef6.TBL_IMDBSOSTITU1);
    JustLoaded = true;
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_PROGRESSIVO, IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_PROG, IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_BENEFICIARIO, IMDBDef6.FLD_IMDBSOSTITU1_RAGIONE_SOCIALE);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_IMPORTO, IMDBDef6.FLD_IMDBSOSTITU1_IMPORTO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_NUMEMANDSOST, IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND_SOST);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_NUMEROMAND, IMDBDef6.FLD_IMDBSOSTITU1_NUMERO_MAND);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_ANNOMANDSOST, IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND_SOST);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_ANNOMAND, IMDBDef6.FLD_IMDBSOSTITU1_ANNO_MAND);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_PROGTESOSOST, IMDBDef6.FLD_IMDBSOSTITU1_PROGRESSIVO_TESO_SOST);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_VERSIONE, IMDBDef6.FLD_IMDBSOSTITU1_VERSIONE);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_TIPO, IMDBDef6.FLD_IMDBSOSTITU1_TIPO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_DATASOST, IMDBDef6.FLD_IMDBSOSTITU1_DATA);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDANNOMAND, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLANMA);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDPROGRTESO, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLPRTE);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDDATA, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLDDAT);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDNUMERMAND, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMOLNUMA);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_MODIFICATO, IMDBDef6.FLD_IMDBSOSTITU1_ROWNAMEMODIF);
    PAN_SOSTITUZIONI.SetMasterTable(0, "IMDBSOSTITU1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SOSTITUZIONI.Status() == 2)
    {
      int oldListQBE = PAN_SOSTITUZIONI.iUseListQBE;
      PAN_SOSTITUZIONI.iUseListQBE = 0;
      PAN_SOSTITUZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SOSTITUZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_SOSTITUZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SOSTITUZIONI) PAN_SOSTITUZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_ValidateRow(Cancel);
    if (SrcObj == PAN_SOSTITUZIONI) PAN_SOSTITUZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_DynamicProperties();
    if (SrcObj == PAN_SOSTITUZIONI) PAN_SOSTITUZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SOSTITUZIONI) PAN_SOSTITUZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SOSTITUZIONI) PAN_SOSTITUZIONI_AfterFind(CmdFind);
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
    if (SrcObj == PAN_SOSTITUZIONI) PAN_SOSTITUZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
