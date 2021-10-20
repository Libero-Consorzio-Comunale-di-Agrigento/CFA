// **********************************************
// Sostituzioni Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SostituzioniOrd extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTSCELMAND_ORDINATIVO = 0;
  private static int PFL_FILTSCELMAND_ANNOORD = 1;
  private static int PFL_FILTSCELMAND_DATADISOSTIT = 2;
  private static int PFL_FILTSCELMAND_DEL = 3;

  private static int PPQRY_FILTRITABLE6 = 0;


  IDPanel PAN_FILTSCELMAND;
  private static int PFL_SOSTITUZIONI_PROGRESSIVO1 = 0;
  private static int PFL_SOSTITUZIONI_PROGRESSIVO = 1;
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

  private static int PPQRY_IMDBSOSTITU2 = 0;


  IDPanel PAN_SOSTITUZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OLDVALFILTA6(IMDB);
    Init_TBL_FILTRITABLE(IMDB);
    Init_TBL_IMDBSOSTITUZ(IMDB);
    //
    //
    Init_PQRY_FILTRITABLE6(IMDB);
    Init_PQRY_FILTRITABLE6_RS(IMDB);
    Init_PQRY_IMDBSOSTITU2(IMDB);
    Init_PQRY_IMDBSOSTITU2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OLDVALFILTA6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_OLDVALFILTA6, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_OLDVALFILTA6, "TBL_OLDVALFILTA6");
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA6,IMDBDef6.FLD_OLDVALFILTA6_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA6,IMDBDef6.FLD_OLDVALFILTA6_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA6,IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA6,IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA6,IMDBDef6.FLD_OLDVALFILTA6_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA6,IMDBDef6.FLD_OLDVALFILTA6_DATA_MAND,6,7,0);
    IMDB.TblAddNew(IMDBDef6.TBL_OLDVALFILTA6, 0);
  }

  private static void Init_TBL_FILTRITABLE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_FILTRITABLE, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_FILTRITABLE, "TBL_FILTRITABLE");
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE,IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD,6,19,0);
    IMDB.TblAddNew(IMDBDef6.TBL_FILTRITABLE, 0);
  }

  private static void Init_TBL_IMDBSOSTITUZ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDBSOSTITUZ, 17);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDBSOSTITUZ, "TBL_IMDBSOSTITUZ");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND_SOST, "ANNO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND_SOST,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMEMODIF,5,49,0);
  }

  private static void Init_PQRY_FILTRITABLE6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABLE6, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABLE6, "PQRY_FILTRITABLE6");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABLE6, 0);
  }

  private static void Init_PQRY_FILTRITABLE6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABLE6_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABLE6_RS, "PQRY_FILTRITABLE6_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE6_RS,IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD,6,19,0);
  }

  private static void Init_PQRY_IMDBSOSTITU2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBSOSTITU2, 17);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBSOSTITU2, "PQRY_IMDBSOSTITU2");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, "ANNO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_IMDBSOSTITU2, 0);
  }

  private static void Init_PQRY_IMDBSOSTITU2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 17);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS, "PQRY_IMDBSOSTITU2_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, "ANNO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBSOSTITU2_RS,IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SostituzioniOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public SostituzioniOrd()
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
    FormIdx = MyGlb.FRM_SOSTITUZIORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "85236DF1-FE60-49E2-8D46-03396A5D0FEF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 576;
    DesignHeight = 362;
    set_Caption(new IDVariant("Sostituzioni Ord"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 576;
    Frames[1].Height = 336;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.178571;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 576;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Scelta Mandati";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTSCELMAND = new IDPanel(w, this, 2, "PAN_FILTSCELMAND");
    Frames[2].Content = PAN_FILTSCELMAND;
    PAN_FILTSCELMAND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTSCELMAND.VS = MainFrm.VisualStyleList;
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 576-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F619FB22-C60A-4825-982D-3251AE8D2630");
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
    Frames[3].Width = 576;
    Frames[3].Height = 276;
    Frames[3].Caption = "Sostituzioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 276;
    PAN_SOSTITUZIONI = new IDPanel(w, this, 3, "PAN_SOSTITUZIONI");
    Frames[3].Content = PAN_SOSTITUZIONI;
    PAN_SOSTITUZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOSTITUZIONI.VS = MainFrm.VisualStyleList;
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 576-MyGlb.PAN_OFFS_X, 276-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D2ACAB46-0A2B-49AF-9E1E-B080BA403526");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (CmdIdx==MyGlb.CMD_SALVA35+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef6.TBL_FILTRITABLE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOSTITUZIORD_FILTRITABLE6();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_IMDBSOSTITUZ, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOSTITUZIORD_IMDBSOSTITU2();
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
    return (obj instanceof SostituzioniOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SostituzioniOrd.class.getName() : (Glb.ClassWithPackage(SostituzioniOrd.class) ? SostituzioniOrd.class.getName().substring(SostituzioniOrd.class.getPackage().getName().length() + 1) : SostituzioniOrd.class.getName()));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0))))
      {
        // 
        // controllo se sono stati modificati i campi annoman
        // e numeroman
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_ANNO_MAND, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0), true)!=0)
        {
          if (ControllaEsistenzaOrdinativo(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0, new IDVariant(v_MYDATA));
            if (ControllaOrdinativoInviatoTesoriere1(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGC = new IDVariant(0,IDVariant.STRING);
              v_MSGC = (new IDVariant("Ordinativo già inviato al Tesoriere", IDVariant.STRING));
              if (ControllaOrdinativoInviatoTesoriere2(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
              {
                MainFrm.set_AlertMessage(v_MSGC); 
                IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0, (new IDVariant()));
                return;
              }
            }
            if (ControllaOrdinativoSosituzioneInviatoTesoriere(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);
              v_MSGA = (new IDVariant("Ordinativo di Sostituzione già inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGA); 
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0, (new IDVariant()));
              return;
            }
          }
          else
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Ordinativo Inesistente!", IDVariant.STRING));
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Indicarlo come Numero/Anno.", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2)); 
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0, (new IDVariant()));
            return;
          }
          // 
          // controllo se sulle liquidazioni del mandato il progressivo teseo è già valorizzato. Se non lo è richiamo la procedura progressivo teseo
          // 
          {
            if (!(ControllaProgressivoTeseoOrdinativi(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0))))
            {
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0, (new IDVariant()));
              return;
            }
          }
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, 0))))
      {
        // 
        // contrrollo se è stata modificata la data di sostituzione
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_DATA_MAND, 0), true)!=0)
        {
          // 
          // Controllo Data Sostituzione Pannello Filtri () = Uno
          // 
          if (ControlloDataSostituzionePannelloFiltri().equals((new IDVariant(1)), true))
          {
          }
        }
      }
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0));
      PAN_SOSTITUZIONI.PanelCommand(Glb.PCM_REQUERY);
      // 
      // Gestione old value. Questo folder deve essere sempre alla fine di questoo evento
      // 
      {
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_ANNO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_DATA_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, 0));
        // 
        // manca il del ma non è fondamentale
        // 
        {
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "FiltriSceltaMandatiOnValidateRowEvent", _e);
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
      RIEMPIIMDB_IMDSOSDELROW();
      RIEMPIIMDB_IMDSOSINSROW(AnnoOrdinativo, NumeroOrdinativo);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Sostituzioni: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDSOSDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBSOSTITUZ);
  }

  // **********************************************************************
  // IMDB Sostituzioni: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDSOSINSROW(IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as ORDINFSTAPRO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  SUM(B.IMPORTO) as SUMPREIMPORT, ");
    SQL.append("  A.DATA as ORDINFSTADA1, ");
    SQL.append("  A.ANNO_ORD as ORDINFSTANO1, ");
    SQL.append("  A.NUMERO_ORD as ORDINFSTNUO1, ");
    SQL.append("  A.VERSIONE as ORDINFSTAVER, ");
    SQL.append("  A.PROGRESSIVO_TESO as ORDINFSTPRT1, ");
    SQL.append("  A.TIPO as ORDINFSTATIP, ");
    SQL.append("  A.ANNO_ORD_SOST as ORINSTANORSO, ");
    SQL.append("  A.NUMERO_ORD_SOST as ORINSTNUORSO, ");
    SQL.append("  A.PROGRESSIVO_TESO_SOST as ORINSTPRTESO, ");
    SQL.append("  A.PROGRESSIVO_TESO as ORDINFSTPRTE, ");
    SQL.append("  A.DATA as ORDINFSTADAT, ");
    SQL.append("  A.NUMERO_ORD as ORDINFSTNUOR, ");
    SQL.append("  A.ANNO_ORD as ORDINFSTANOR ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO A, ");
    SQL.append("  PRE B, ");
    SQL.append("  BEN C ");
    SQL.append("where (C.CODICE = B.DEBITORE) ");
    SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.TIPO = 'S') ");
    SQL.append("and   (B.ANNO_ORD = A.ANNO_ORD AND B.NUMERO_ORD = A.NUMERO_ORD AND A.VERSIONE = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(D.VERSIONE) ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO D ");
    SQL.append("where (A.ANNO_ORD = D.ANNO_ORD AND A.NUMERO_ORD = D.NUMERO_ORD AND A.PROGRESSIVO_TESO = D.PROGRESSIVO_TESO) ");
    SQL.append(")) ");
    SQL.append("and   (A.PROGRESSIVO = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(E.PROGRESSIVO) ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO E ");
    SQL.append("where (A.ANNO_ORD = E.ANNO_ORD AND A.NUMERO_ORD = E.NUMERO_ORD AND A.PROGRESSIVO_TESO = E.PROGRESSIVO_TESO) ");
    SQL.append(")) ");
    SQL.append("and   (B.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.DATA, ");
    SQL.append("  A.ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD, ");
    SQL.append("  A.VERSIONE, ");
    SQL.append("  A.PROGRESSIVO_TESO, ");
    SQL.append("  A.TIPO, ");
    SQL.append("  A.ANNO_ORD_SOST, ");
    SQL.append("  A.NUMERO_ORD_SOST, ");
    SQL.append("  A.PROGRESSIVO_TESO_SOST, ");
    SQL.append("  A.PROGRESSIVO_TESO, ");
    SQL.append("  A.DATA, ");
    SQL.append("  A.NUMERO_ORD, ");
    SQL.append("  A.ANNO_ORD ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  SUM(F.IMPORTO), ");
    SQL.append("  to_date(NULL), ");
    SQL.append("  F.ANNO_ORD, ");
    SQL.append("  F.NUMERO_ORD, ");
    SQL.append("  1, ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  'N', ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  to_date(NULL), ");
    SQL.append("  F.NUMERO_ORD, ");
    SQL.append("  F.ANNO_ORD ");
    SQL.append("from ");
    SQL.append("  PRE F, ");
    SQL.append("  BEN G ");
    SQL.append("where (G.CODICE = F.DEBITORE) ");
    SQL.append("and   (F.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND F.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO H ");
    SQL.append("where (H.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND H.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND H.PROGRESSIVO_TESO = F.PROGRESSIVO_TESO) ");
    SQL.append("and   (H.TIPO = 'S') ");
    SQL.append(")))) ");
    SQL.append("group by ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  F.ANNO_ORD, ");
    SQL.append("  F.NUMERO_ORD, ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  F.PROGRESSIVO_TESO, ");
    SQL.append("  F.NUMERO_ORD, ");
    SQL.append("  F.ANNO_ORD ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_IMDBSOSTITUZ, 0);
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_RAGIONE_SOCIALE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_IMPORTO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_DATA,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND,0,RS.Get(5));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND,0,RS.Get(6));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_VERSIONE,0,RS.Get(7));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO,0,RS.Get(8));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_TIPO,0,RS.Get(9));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND_SOST,0,RS.Get(10));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND_SOST,0,RS.Get(11));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO_SOST,0,RS.Get(12));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLPRTE,0,RS.Get(13));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLDDAT,0,RS.Get(14));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLNUMA,0,RS.Get(15));
      IMDB.set_Value(IMDBDef6.TBL_IMDBSOSTITUZ,IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLANMA,0,RS.Get(16));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Controlla Progressivo Teseo Ordinativi
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  public boolean ControllaProgressivoTeseoOrdinativi (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
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
      // Controlla Progressivo Teseo Ordinativi Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  PRE A ");
      SQL.append("where (NOT ((A.PROGRESSIVO_TESO IS NULL))) ");
      SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
        MainFrm.Cf4armDBObject.PROGTESOORDINF(AnnoOrdinativo, NumeroOrdinativo);
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "ControllaProgressivoTeseoOrdinativi", _e);
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
      v_MSGA = (new IDVariant("La data indicata è inferiore alla data dell'Ordinativo", IDVariant.STRING));
      // 
      // Controllo Data Sostituzione Pannello Filtri Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0), true)<0)
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "ControlloDataSostituzionePannelloFiltri", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Ordinativo Sosituzione Inviato Tesoriere
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  private IDVariant ControllaOrdinativoSosituzioneInviatoTesoriere (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
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
      // Controlla Ordinativo Sosituzione Inviato Tesoriere Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = " + IDL.CSql(v_MYTIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NOT ((A.DATA_INVIO IS NULL)) AND A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO B ");
      SQL.append("where (A.ANNO_ORD = B.ANNO_ORD) ");
      SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
      SQL.append("and   (A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      SQL.append("and   (A.PROGRESSIVO = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.PROGRESSIVO) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO C ");
      SQL.append("where (C.ANNO_ORD = A.ANNO_ORD) ");
      SQL.append("and   (C.NUMERO_ORD = A.NUMERO_ORD) ");
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "ControllaOrdinativoSosituzioneInviatoTesoriere", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Ordinativo Inviato Tesoriere 2
  // Explain which processing is carried out by this procedure
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  private IDVariant ControllaOrdinativoInviatoTesoriere2 (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
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
      // Controlla Ordinativo Inviato Tesoriere 2 Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO <> " + IDL.CSql(v_MYTIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO B ");
      SQL.append("where (A.ANNO_ORD = B.ANNO_ORD) ");
      SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
      SQL.append("and   (A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      SQL.append("and   (A.PROGRESSIVO = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.PROGRESSIVO) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO C ");
      SQL.append("where (C.ANNO_ORD = A.ANNO_ORD) ");
      SQL.append("and   (C.NUMERO_ORD = A.NUMERO_ORD) ");
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "ControllaOrdinativoInviatoTesoriere2", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Esistenza Ordinativo
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // P Data: parametro per riferimento conterrà la data del mandato se questo esiste - Input/Output
  // **********************************************************************
  private IDVariant ControllaEsistenzaOrdinativo (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo, IDVariant PData)
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
      // Controlla Esistenza Ordinativo Body
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
        SQL.append("  ORD A ");
        SQL.append("where (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
        SQL.append("  A.D_DATA_ORD as DDATAORD ");
        SQL.append("from ");
        SQL.append("  ORD A ");
        SQL.append("where (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          PData.set(QV.Get("DDATAORD", IDVariant.DATETIME));
        }
        QV.Close();
      }
      return (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "ControllaEsistenzaOrdinativo", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Ordinativo Inviato Tesoriere 1
  // Explain which processing is carried out by this procedure
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  public IDVariant ControllaOrdinativoInviatoTesoriere1 (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
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
      // Controlla Ordinativo Inviato Tesoriere 1 Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO <> " + IDL.CSql(v_MYTIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO B ");
      SQL.append("where (A.ANNO_ORD = B.ANNO_ORD) ");
      SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
      SQL.append("and   (A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      SQL.append("and   (A.PROGRESSIVO = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.PROGRESSIVO) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO C ");
      SQL.append("where (C.ANNO_ORD = A.ANNO_ORD) ");
      SQL.append("and   (C.NUMERO_ORD = A.NUMERO_ORD) ");
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
        return (new IDVariant(1));
      }
      else
      {
        return (new IDVariant(-1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "ControllaOrdinativoInviatoTesoriere1", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Setta Old Value IMDB
  // **********************************************************************
  public int SettaOldValueIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Old Value IMDB Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "SettaOldValueIMDB", _e);
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
        IDVariant v_TOTRECORD = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_RECORDVUOTI = new IDVariant(0,IDVariant.INTEGER);
        // 
        // controllo se per ogni record sono stati opportunamente inseriti i dati del mandata sostituzione e della data sostituzione
        // 
        {
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0))
          {
            if (!(PAN_SOSTITUZIONI.IsNewRow()))
            {
              v_TOTRECORD = IDL.Add(v_TOTRECORD, (new IDVariant(1)));
              if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0)))
              {
                v_RECORDVUOTI = IDL.Add(v_RECORDVUOTI, (new IDVariant(1)));
              }
              else
              {
                if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0)))
                {
                  IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
                  v_MSG1 = (new IDVariant("Dati Ordinativo Sostituito Incompleti!", IDVariant.STRING));
                  MainFrm.set_AlertMessage(v_MSG1); 
                  return 0;
                }
                else
                {
                  IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
                  v_MSG2 = (new IDVariant("Sono stati indicati i dati dell' Ordinativo Sostitutivo indicare la Data Sostituzione!", IDVariant.STRING));
                  if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0)))
                  {
                    MainFrm.set_AlertMessage(v_MSG2); 
                    return 0;
                  }
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
          }
        }
        if (v_TOTRECORD.compareTo(v_RECORDVUOTI, true)!=0 && v_RECORDVUOTI.compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant v_MSG4 = new IDVariant(0,IDVariant.STRING);
          v_MSG4 = (new IDVariant("Gli estremi del Mandato Sostituito non sono stati indicati per tutti i record!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG4); 
          return 0;
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
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0))
          {
            // 
            // se l ordinativo non era esistente lo inserisco
            // 
            {
              if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0))))
              {
                IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  ORD_INF_STATO A ");
                SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
                  MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Ordinativo ")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0))), (new IDVariant(" non inviato, non può essere sostituito")))); 
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  return 0;
                }
              }
              if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_TIPO, 0).equals((new IDVariant("N")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0))))
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
                SQL.append("  ANNO_ORD_SOST, ");
                SQL.append("  NUMERO_ORD_SOST, ");
                SQL.append("  PROGRESSIVO_TESO_SOST, ");
                SQL.append("  UTENTE_INSERIMENTO, ");
                SQL.append("  DATA_INSERIMENTO ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  'S', ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  1, ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1, ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
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
                if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0)))
                {
                  SQL = new StringBuffer();
                  SQL.append("delete from ORD_INF_STATO ");
                  SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (TIPO = 'S') ");
                  SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                else
                {
                  // 
                  // il record era già presente ma è stato modificato
                  // 
                  if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF, 0).equals((new IDVariant("SI")), true))
                  {
                    SQL = new StringBuffer();
                    SQL.append("update ORD_INF_STATO set ");
                    SQL.append("  DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  ANNO_ORD_SOST = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  NUMERO_ORD_SOST = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  PROGRESSIVO_TESO_SOST = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                    SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (TIPO = 'S') ");
                    SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                  }
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
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
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_NUMERO_MAND, 0));
      PAN_SOSTITUZIONI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "Salva", _e);
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
        if (IDL.IsNull(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0)))
        {
          IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        else
        {
          if (ControllaEsistenzaOrdinativo(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0, new IDVariant(v_MYDATA));
            if (ControllaOrdinativoInviatoTesoriere1(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGC = new IDVariant(0,IDVariant.STRING);
              v_MSGC = (new IDVariant("Ordinativo già inviato al Tesoriere", IDVariant.STRING));
              if (ControllaOrdinativoInviatoTesoriere2(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
              {
                MainFrm.set_AlertMessage(v_MSGC); 
                IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0, (new IDVariant()));
              }
            }
            if (ControllaOrdinativoSosituzioneInviatoTesoriere(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);
              v_MSGA = (new IDVariant("Ordinativo di Sostituzione già inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGA); 
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0, (new IDVariant()));
            }
          }
          else
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Ordinativo Inesistente!", IDVariant.STRING));
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Indicarlo come Numero/Anno.", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2)); 
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0, (new IDVariant()));
          }
          // 
          // controllo se sulle liquidazioni del mandato il progressivo teseo è già valorizzato. Se non lo è richiamo la procedura progressivo teseo
          // 
          {
            if (!(ControllaProgressivoTeseoOrdinativi(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0))))
            {
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0, (new IDVariant()));
            }
          }
          RiempiIMDB(IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0));
        }
        IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR, 0, IDL.Today());
      }
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_ANNO_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_NUMERO_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA6, IMDBDef6.FLD_OLDVALFILTA6_DATA_MAND, 0, IMDB.Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR, 0));
      PAN_SOSTITUZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "Unload", _e);
    }
  }

  // **********************************************************************
  // Filtri Table: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FILTABDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0, new IDVariant());
  }

  // **********************************************************************
  // IMDB Sostituzioni: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDSOSDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBSOSTITUZ);
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
      IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF, 0, (new IDVariant("SI")));
      // 
      // controllo se è stato modificato il campo data 
      // 
      {
        if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT, 0), true)!=0)
        {
          // 
          // aggiorno old value
          // 
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0));
          }
          // 
          // controllo la data sostituzione
          // 
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0))))
          {
            if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATORD, 0), true)<0)
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
        if (IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLNUMA, 0), true)!=0 && IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLANMA, 0), true)!=0 && IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLPRTE, 0), true)!=0)
        {
          // 
          // aggiorno old value
          // 
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLNUMA, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLANMA, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND_SOST, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLPRTE, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ANNO_MAND, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO, 0)))
          {
            IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
            v_ERRORMESSAGE = (new IDVariant("Dati Mandato Sostituito Incompleti!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
          }
          else
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0)))
            {
              IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
              v_ERRORMESSAGE = (new IDVariant("Sono stati indicati i dati del Mandato Sostitutivo indicare la Data Sostituzione!", IDVariant.STRING));
              // 
              // aggiorno old value
              // 
              {
                IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0));
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "SostituzioniOnValidateRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "SostituzioniOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "SostituzioniOnDatabaseErrorEvent", _e);
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
      IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
      while (!IMDB.Eof(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST, 0)) && !(IMDB.Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMEMODIF, 0).equals((new IDVariant("SI")), true)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_DATA, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, 0));
          IMDB.set_Value(IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef15.PQSL_IMDBSOSTITU2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE6, IMDBDef15.PQSL_FILTRITABLE6_ROWNAMDATVAR, 0));
        }
        IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SostituzioniOrd", "SostituzioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Table
  // Primary record source for panel data
  // **********************************************************************
  private void SOSTITUZIORD_FILTRITABLE6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_FILTRITABLE6_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_FILTRITABLE, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABLE6_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_FILTRITABLE6_RS, 0, IMDBDef6.TBL_FILTRITABLE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE6_RS, 0, 0, IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE6_RS, 1, 0, IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE6_RS, 2, 0, IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE6_RS, 3, 0, IMDBDef6.TBL_FILTRITABLE, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_FILTRITABLE, 0);
      if (IMDB.Eof(IMDBDef6.TBL_FILTRITABLE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_FILTRITABLE6_RS, 0);
  }

  // **********************************************************************
  // IMDB Sostituzioni
  // Primary record source for panel data
  // **********************************************************************
  private void SOSTITUZIORD_IMDBSOSTITU2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_IMDBSOSTITU2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBSOSTITUZ, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDBSOSTITUZ, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0, IMDBDef6.TBL_IMDBSOSTITUZ, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 1, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_RAGIONE_SOCIALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 2, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 3, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 4, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 5, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 6, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_VERSIONE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 7, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_TIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 8, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_DATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 9, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND_SOST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 10, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND_SOST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 11, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO_SOST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 12, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLNUMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 13, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLANMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 14, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLPRTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 15, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLDDAT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 16, 0, IMDBDef6.TBL_IMDBSOSTITUZ, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMEMODIF, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDBSOSTITUZ, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDBSOSTITUZ, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBSOSTITUZ, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_IMDBSOSTITU2_RS, 0);
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
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "74BAF41F-DA24-4331-B658-4BFA735EBB05");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "Ordinativo");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "7349F66C-F654-49BC-8429-A5EA33D5CFE8");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "ANNO ORD");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, "5A1DD76E-63A8-4A60-9F8D-24AF883031F2");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, "Data di Sostituzione");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "732DB799-A9B0-4261-BCFB-0B0D1583243E");
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
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, 8, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, 68);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.PANEL_FORM, "Ordinativo");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_ORDINATIVO, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ORDINATIVO, PPQRY_FILTRITABLE6, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 124, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_ANNOORD, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ANNOORD, PPQRY_FILTRITABLE6, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, 84);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_LIST, "Data di Sostituzione");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, 344, 4, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, 124);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADISOSTIT, MyGlb.PANEL_FORM, "Data di Sostituzione");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DATADISOSTIT, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DATADISOSTIT, PPQRY_FILTRITABLE6, "A.ROWNAMDATVAR", "ROWNAMDATVAR", 6, 15, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 40);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, "del   ");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 200, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 28);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, "del");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DEL, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DEL, PPQRY_FILTRITABLE6, "A.ROWNAMDATORD", "ROWNAMDATORD", 6, 19, 0, -13997);
  }

  private void PAN_FILTSCELMAND_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTSCELMAND.SetIMDB(IMDB, "PQRY_FILTRITABLE6", true);
    PAN_FILTSCELMAND.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTSCELMAND.SetQueryIMDB(PPQRY_FILTRITABLE6, IMDBDef15.PQRY_FILTRITABLE6_RS, IMDBDef6.TBL_FILTRITABLE);
    JustLoaded = true;
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ORDINATIVO, IMDBDef6.FLD_FILTRITABLE_NUMERO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ANNOORD, IMDBDef6.FLD_FILTRITABLE_ANNO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DATADISOSTIT, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATVAR);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DEL, IMDBDef6.FLD_FILTRITABLE_ROWNAMDATORD);
    PAN_FILTSCELMAND.SetMasterTable(0, "FILTRITABLE");
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
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, "1BEF46DA-60E1-4589-98B1-19E785A1FFF1");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, "Progressivo");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, "B09B2DD2-6FC4-4279-BFBF-9D7C623F4952");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, "Progressivo ");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, "20A4E339-53E0-4B78-A989-668492271E3B");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, "Beneficiario");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, "7194C2DA-3608-41B7-9396-F75809986575");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, "Importo");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, "082A065A-998F-4781-BBE2-BF7ABAFF9711");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, "NUMERO MAND SOST");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, "CFEFC512-F299-4777-AE05-C620BBEDD5B6");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, "NUMERO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, "6A455EE5-9CCA-43A8-9468-15B39ECA2988");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, "ANNO MAND SOST");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, "DBB1EB0B-477E-4275-8C8E-6A9FB6DD1D8F");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, "ANNO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, "2F0761C4-0340-44ED-BD47-539F679B5F8F");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, "PROGRESSIVO TESO SOST");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, "C3D4AE8A-E38E-4A2E-9CA7-83118C981CA6");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, "VERSIONE");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, "F0BFC9CB-D438-4B2E-85A4-7168C4B93EC2");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, "TIPO");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, "316822FF-C044-4D87-AF80-C4BBDA269EC6");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, "Data Sost.");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.VIS_NORMALFIELDS);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, "86E1718D-7562-46DE-A993-5D3D140D3966");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, "Ordinativo Sostituito");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.VIS_LABEVISUSTYL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, "BD0110B3-1D5B-4565-810D-41C50D8F27ED");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, "OLD ANNO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, "10BE4DCA-0BAF-4CC8-8EE9-55D716C9668B");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, "OLD PROGRESSIVO TESO");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, "DDDBB095-9C09-4119-AD0C-DF728825B2A3");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, "OLD DATA");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.VIS_NORMFIELPADR);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, "38CD9A7A-F036-4C26-B525-1BFFEA839EB0");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, "OLD NUMERO MAND");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_SOSTITUZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, "A622374B-6616-4322-A7F5-35324403DCE2");
    PAN_SOSTITUZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, "MODIFICATO");
    PAN_SOSTITUZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, "");
    PAN_SOSTITUZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.VIS_NORMFIELPADR);
    PAN_SOSTITUZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SOSTITUZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_LIST, 80);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_LIST, "Prog.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_FORM, 80);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO1, MyGlb.PANEL_FORM, "Progressivo");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_PROGRESSIVO1, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_PROGRESSIVO1, PPQRY_IMDBSOSTITU2, "A.PROGRESSIVO", "PROGRESSIVO", 1, 2, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 132);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "Progr.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "Progressivo ");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_PROGRESSIVO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_PROGRESSIVO, PPQRY_IMDBSOSTITU2, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 64, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_BENEFICIARIO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_BENEFICIARIO, PPQRY_IMDBSOSTITU2, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 40, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_IMPORTO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_IMPORTO, PPQRY_IMDBSOSTITU2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, 344, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, 112);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_LIST, "NM. M. SS.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, 4, 244, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, 112);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEMANDSOST, MyGlb.PANEL_FORM, "NUM. MAND SOST");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_NUMEMANDSOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_NUMEMANDSOST, PPQRY_IMDBSOSTITU2, "A.NUMERO_MAND_SOST", "NUMERO_MAND_SOST", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_NUMEROMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_NUMEROMAND, PPQRY_IMDBSOSTITU2, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, 384, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_LIST, "A. M. S.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, 100);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMANDSOST, MyGlb.PANEL_FORM, "ANN. MAND SOST");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_ANNOMANDSOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_ANNOMANDSOST, PPQRY_IMDBSOSTITU2, "A.ANNO_MAND_SOST", "ANNO_MAND_SOST", 1, 4, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, 352, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_LIST, "AN. MN.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_ANNOMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_ANNOMAND, PPQRY_IMDBSOSTITU2, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, 416, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, 140);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_LIST, "PRG. T. SS.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, 140);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_PROGTESOSOST, MyGlb.PANEL_FORM, "PROGR. TESO SOST");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_PROGTESOSOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_PROGTESOSOST, PPQRY_IMDBSOSTITU2, "A.PROGRESSIVO_TESO_SOST", "PROGRESSIVO_TESO_SOST", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_LIST, "VERSIONE");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_VERSIONE, MyGlb.PANEL_FORM, "VERSIONE");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_VERSIONE, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_VERSIONE, PPQRY_IMDBSOSTITU2, "A.VERSIONE", "VERSIONE", 1, 2, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, 536, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, 4, 172, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_TIPO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_TIPO, PPQRY_IMDBSOSTITU2, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, 456, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, 36);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_LIST, "Data Sost.");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, 36);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_DATASOST, MyGlb.PANEL_FORM, "D. Ss.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_DATASOST, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_DATASOST, PPQRY_IMDBSOSTITU2, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MANDSOSTLAB1, MyGlb.PANEL_LIST, 344, 0, 112, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDANNOMAND, PPQRY_IMDBSOSTITU2, "A.ROWNAMOLANMA", "ROWNAMOLANMA", 1, 4, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 492, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 132);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, "OLD PROGRESSIVO TESO");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 132);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, "OLD PROGR. TESO");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDPROGRTESO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDPROGRTESO, PPQRY_IMDBSOSTITU2, "A.ROWNAMOLPRTE", "ROWNAMOLPRTE", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, 492, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_LIST, "OLD DATA");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, 4, 292, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, 60);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDDATA, MyGlb.PANEL_FORM, "OLD DT.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDDATA, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDDATA, PPQRY_IMDBSOSTITU2, "A.ROWNAMOLDDAT", "ROWNAMOLDDAT", 6, 19, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 492, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, "OLD NUMERO MAND");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 108);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, "OLD NUM. MAND");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_OLDNUMERMAND, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_OLDNUMERMAND, PPQRY_IMDBSOSTITU2, "A.ROWNAMOLNUMA", "ROWNAMOLNUMA", 1, 5, 0, -13997);
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, 76);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_LIST, "MODIFICATO");
    PAN_SOSTITUZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, 4, 292, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOSTITUZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, 76);
    PAN_SOSTITUZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, 1);
    PAN_SOSTITUZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOSTITUZIONI_MODIFICATO, MyGlb.PANEL_FORM, "MODIF.");
    PAN_SOSTITUZIONI.SetFieldPage(PFL_SOSTITUZIONI_MODIFICATO, -1, -1);
    PAN_SOSTITUZIONI.SetFieldPanel(PFL_SOSTITUZIONI_MODIFICATO, PPQRY_IMDBSOSTITU2, "A.ROWNAMEMODIF", "ROWNAMEMODIF", 5, 49, 0, -13997);
  }

  private void PAN_SOSTITUZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOSTITUZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SOSTITUZIONI.SetIMDB(IMDB, "PQRY_IMDBSOSTITU2", true);
    PAN_SOSTITUZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_SOSTITUZIONI.SetQueryIMDB(PPQRY_IMDBSOSTITU2, IMDBDef15.PQRY_IMDBSOSTITU2_RS, IMDBDef6.TBL_IMDBSOSTITUZ);
    JustLoaded = true;
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_PROGRESSIVO1, IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_PROGRESSIVO, IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_BENEFICIARIO, IMDBDef6.FLD_IMDBSOSTITUZ_RAGIONE_SOCIALE);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_IMPORTO, IMDBDef6.FLD_IMDBSOSTITUZ_IMPORTO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_NUMEMANDSOST, IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND_SOST);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_NUMEROMAND, IMDBDef6.FLD_IMDBSOSTITUZ_NUMERO_MAND);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_ANNOMANDSOST, IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND_SOST);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_ANNOMAND, IMDBDef6.FLD_IMDBSOSTITUZ_ANNO_MAND);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_PROGTESOSOST, IMDBDef6.FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO_SOST);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_VERSIONE, IMDBDef6.FLD_IMDBSOSTITUZ_VERSIONE);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_TIPO, IMDBDef6.FLD_IMDBSOSTITUZ_TIPO);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_DATASOST, IMDBDef6.FLD_IMDBSOSTITUZ_DATA);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDANNOMAND, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLANMA);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDPROGRTESO, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLPRTE);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDDATA, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLDDAT);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_OLDNUMERMAND, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMOLNUMA);
    PAN_SOSTITUZIONI.SetFieldPrimaryIndex(PFL_SOSTITUZIONI_MODIFICATO, IMDBDef6.FLD_IMDBSOSTITUZ_ROWNAMEMODIF);
    PAN_SOSTITUZIONI.SetMasterTable(0, "IMDBSOSTITUZ");
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
