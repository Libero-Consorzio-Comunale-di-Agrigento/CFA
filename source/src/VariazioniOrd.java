// **********************************************
// Variazioni Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniOrd extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTSCELMAND_ORDINATIVO = 0;
  private static int PFL_FILTSCELMAND_ANNOORD = 1;
  private static int PFL_FILTSCELMAND_DATADIVARIAZ = 2;
  private static int PFL_FILTSCELMAND_DEL = 3;

  private static int PPQRY_FILTRITABLE7 = 0;


  IDPanel PAN_FILTSCELMAND;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 0;
  private static int PFL_VARIAZIONI_PROG = 1;
  private static int PFL_VARIAZIONI_BENEFICIARIO = 2;
  private static int PFL_VARIAZIONI_IMPORTO = 3;
  private static int PFL_VARIAZIONI_TIPO = 4;
  private static int PFL_VARIAZIONI_DATAVARIAZIO = 5;
  private static int PFL_VARIAZIONI_OLDANNOMAND = 6;
  private static int PFL_VARIAZIONI_OLDNUMERMAND = 7;
  private static int PFL_VARIAZIONI_OLDPROGRTESO = 8;
  private static int PFL_VARIAZIONI_OLDDATAVARIA = 9;
  private static int PFL_VARIAZIONI_DATAINVIO = 10;
  private static int PFL_VARIAZIONI_ANNOMAND = 11;
  private static int PFL_VARIAZIONI_NUMEROMAND = 12;
  private static int PFL_VARIAZIONI_VERSIONE = 13;
  private static int PFL_VARIAZIONI_NUOVAVARIAZI = 14;
  private static int PFL_VARIAZIONI_NEWPANELLABE = 15;
  private static int PFL_VARIAZIONI_MODIFICATO = 16;

  private static int PPQRY_IMDBVARIAZI2 = 0;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OLDVALFILTA5(IMDB);
    Init_TBL_FILTRITABLE9(IMDB);
    Init_TBL_IMDBVARIAZIO(IMDB);
    //
    //
    Init_PQRY_FILTRITABLE7(IMDB);
    Init_PQRY_FILTRITABLE7_RS(IMDB);
    Init_PQRY_IMDBVARIAZI2(IMDB);
    Init_PQRY_IMDBVARIAZI2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OLDVALFILTA5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_OLDVALFILTA5, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_OLDVALFILTA5, "TBL_OLDVALFILTA5");
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA5,IMDBDef6.FLD_OLDVALFILTA5_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA5,IMDBDef6.FLD_OLDVALFILTA5_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA5,IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA5,IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTA5,IMDBDef6.FLD_OLDVALFILTA5_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTA5,IMDBDef6.FLD_OLDVALFILTA5_DATA_MAND,6,7,0);
    IMDB.TblAddNew(IMDBDef6.TBL_OLDVALFILTA5, 0);
  }

  private static void Init_TBL_FILTRITABLE9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_FILTRITABLE9, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_FILTRITABLE9, "TBL_FILTRITABLE9");
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef6.TBL_FILTRITABLE9,IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD,6,19,0);
    IMDB.TblAddNew(IMDBDef6.TBL_FILTRITABLE9, 0);
  }

  private static void Init_TBL_IMDBVARIAZIO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDBVARIAZIO, 16);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDBVARIAZIO, "TBL_IMDBVARIAZIO");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_DATA_INVIO, "DATA_INVIO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_DATA_INVIO,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMNUOVAR, "ROWNAMNUOVAR");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMNUOVAR,5,50,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMEMODIF,5,49,0);
  }

  private static void Init_PQRY_FILTRITABLE7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABLE7, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABLE7, "PQRY_FILTRITABLE7");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABLE7, 0);
  }

  private static void Init_PQRY_FILTRITABLE7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FILTRITABLE7_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_FILTRITABLE7_RS, "PQRY_FILTRITABLE7_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, "ROWNAMDATORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_FILTRITABLE7_RS,IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD,6,19,0);
  }

  private static void Init_PQRY_IMDBVARIAZI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBVARIAZI2, 16);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBVARIAZI2, "PQRY_IMDBVARIAZI2");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO, "DATA_INVIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMNUOVAR, "ROWNAMNUOVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMNUOVAR,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_IMDBVARIAZI2, 0);
  }

  private static void Init_PQRY_IMDBVARIAZI2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 16);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS, "PQRY_IMDBVARIAZI2_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE, "VERSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLNUMA, "ROWNAMOLNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLANMA, "ROWNAMOLANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLPRTE, "ROWNAMOLPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLPRTE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT, "ROWNAMOLDDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO, "DATA_INVIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMNUOVAR, "ROWNAMNUOVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMNUOVAR,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMDBVARIAZI2_RS,IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniOrd()
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
    FormIdx = MyGlb.FRM_VARIAZIONORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "855F8064-0268-4819-BD64-38F2489F3085";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 548;
    DesignHeight = 370;
    set_Caption(new IDVariant("Variazioni Ord"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 548;
    Frames[1].Height = 344;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.174419;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 548;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Scelta Mandati";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTSCELMAND = new IDPanel(w, this, 2, "PAN_FILTSCELMAND");
    Frames[2].Content = PAN_FILTSCELMAND;
    PAN_FILTSCELMAND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTSCELMAND.VS = MainFrm.VisualStyleList;
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 548-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CB0C8515-171B-42E4-A745-93CE28201AA7");
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
    Frames[3].Width = 548;
    Frames[3].Height = 284;
    Frames[3].Caption = "Variazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 284;
    PAN_VARIAZIONI = new IDPanel(w, this, 3, "PAN_VARIAZIONI");
    Frames[3].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 548-MyGlb.PAN_OFFS_X, 284-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7830E7B7-EB07-430C-9F24-2B4172AAA40A");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 488, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA34+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef6.TBL_FILTRITABLE9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZIONORD_FILTRITABLE7();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_IMDBVARIAZIO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZIONORD_IMDBVARIAZI2();
      }
      PAN_FILTSCELMAND.UpdatePanel(MainFrm);
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniOrd.class.getName() : (Glb.ClassWithPackage(VariazioniOrd.class) ? VariazioniOrd.class.getName().substring(VariazioniOrd.class.getPackage().getName().length() + 1) : VariazioniOrd.class.getName()));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0))))
      {
        // 
        // controllo se sono stati modificati i campi annoman
        // e numeroman
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_ANNO_MAND, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0), true)!=0)
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0)))
          {
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0, (new IDVariant()));
          }
          else
          {
            if (ControllaEsistenzaOrdinativo(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(1)), true))
            {
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0, new IDVariant(v_MYDATA));
              if (ControllaOrdinativoInviatoTesoriere2(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0)).equals((new IDVariant(-1)), true))
              {
                IDVariant v_MSGC = new IDVariant(0,IDVariant.STRING);
                v_MSGC = (new IDVariant("Ordinativo non inviato al Tesoriere", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSGC); 
                IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0, (new IDVariant()));
                return;
              }
              if (ControllaOrdinativiAnnullamenti(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Ordinativo con Annullamenti sospesi non modificabile.", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSG); 
                IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0, (new IDVariant()));
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
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0, (new IDVariant()));
              return;
            }
          }
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, 0))))
      {
        // 
        // contrrollo se è stata modificata la data di sostituzione
        // 
        if (IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, 0).compareTo(IMDB.Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_DATA_MAND, 0), true)!=0)
        {
          ControlloDataVariazioniPannelloFiltri();
        }
      }
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0));
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      // 
      // Gestione old value. Questo folder deve essere sempre alla fine di questoo evento
      // 
      {
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_ANNO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0));
        IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_DATA_MAND, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, 0));
        // 
        // manca il del ma non è fondamentale
        // 
        {
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "FiltriSceltaMandatiOnValidateRowEvent", _e);
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
      RIEMPIIMDB_IMDVARDELROW();
      RIEMPIIMDB_IMDVARINSROW(AnnoOrdinativo, NumeroOrdinativo);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Variazione: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDVARDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBVARIAZIO);
  }

  // **********************************************************************
  // IMDB Variazione: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDVARINSROW(IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo) throws SQLException
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
    SQL.append("  A.ANNO_ORD as ORDINFSTANOR, ");
    SQL.append("  A.NUMERO_ORD as ORDINFSTNUOR ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO A, ");
    SQL.append("  ORD_INF_TESTATA B, ");
    SQL.append("  ORD_INF_SUB C ");
    SQL.append("where (C.IDENTIFICATIVO_TESTATA = B.IDENTIFICATIVO_RECORD) ");
    SQL.append("and   (C.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
    SQL.append("and   (A.ANNO_ORD = B.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
    SQL.append("and   (A.VERSIONE = B.VERSIONE) ");
    SQL.append("and   (A.TIPO <> 'A') ");
    SQL.append("and   (A.VERSIONE = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(D.VERSIONE) ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO D ");
    SQL.append("where (A.ANNO_ORD = D.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = D.NUMERO_ORD) ");
    SQL.append("and   (A.PROGRESSIVO_TESO = D.PROGRESSIVO_TESO) ");
    SQL.append(")) ");
    SQL.append("and   (A.PROGRESSIVO = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MAX(E.PROGRESSIVO) ");
    SQL.append("from ");
    SQL.append("  ORD_INF_STATO E ");
    SQL.append("where (E.ANNO_ORD = A.ANNO_ORD) ");
    SQL.append("and   (E.NUMERO_ORD = A.NUMERO_ORD) ");
    SQL.append("and   (E.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
    SQL.append("and   (E.VERSIONE = A.VERSIONE) ");
    SQL.append(")) ");
    SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(AnnoOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrdinativo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_IMDBVARIAZIO, 0);
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_IMPORTO,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_DATA,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_VERSIONE,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO_TESO,0,RS.Get(5));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_TIPO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_DATA_INVIO,0,RS.Get(7));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_RAGIONE_SOCIALE,0,RS.Get(8));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ANNO_MAND,0,RS.Get(9));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_NUMERO_MAND,0,RS.Get(10));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLANMA,0,RS.Get(11));
      IMDB.set_Value(IMDBDef6.TBL_IMDBVARIAZIO,IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLNUMA,0,RS.Get(12));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Controllo Data Variazioni Pannello Filtri
  // **********************************************************************
  public int ControlloDataVariazioniPannelloFiltri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MSGA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSGA = (new IDVariant("La data indicata è inferiore alla data dell' Ordinativo.", IDVariant.STRING));
      // 
      // Controllo Data Variazioni Pannello Filtri Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_MSGA); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "ControlloDataVariazioniPannelloFiltri", _e);
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
        // controllo se ci sono record con date nulle
        // 
        {
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0))
          {
            // 
            // per i record di tipo V con data invio not null faccio
            // una nuova variazione
            // 
            // per i record con tipo <> V non faccio nulla
            // 
            // 
            // 
            if (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, 0).compareTo((new IDVariant("V")), true)!=0 || (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, 0).equals((new IDVariant("V")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO, 0)))))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0)))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Sono presenti righe di Nuova Variazione senza indicazione della Data Variazione. Si desidera proseguire la registrazione?", IDVariant.STRING));
                if (!(MainFrm.MessageConfirm(v_MSG)))
                {
                  MainFrm.set_AlertMessage(v_MSG); 
                  return 0;
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
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
          IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
          while (!IMDB.Eof(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0))
          {
            // 
            // per i record di tipo V con data invio not null faccio
            // una nuova variazione
            // 
            // per i record con tipo <> V non faccio nulla
            // 
            // 
            // 
            if (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, 0).compareTo((new IDVariant("V")), true)!=0 || (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, 0).equals((new IDVariant("V")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO, 0)))))
            {
              // 
              // caso1
              // 
              if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0))))
              {
                IDVariant v_NPROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
                v_NPROGRESSIVO = IDL.Add(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO, 0), (new IDVariant(1)));
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
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  'V', ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_NPROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ) ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            else
            {
              // 
              // se invece è stata annullata la data variazione di una
              // variazione già esistente cancello ilr ecord 
              // 
              if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0)))
              {
                SQL = new StringBuffer();
                SQL.append("delete from ORD_INF_STATO ");
                SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (TIPO = 'V') ");
                SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else
              {
                // 
                // per le variazioni già esistente dove è stata modificata
                // la data faccio un'update, per le altre non faccio nulla
                // 
                if (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF, 0).equals((new IDVariant("SI")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0))))
                {
                  SQL = new StringBuffer();
                  SQL.append("update ORD_INF_STATO set ");
                  SQL.append("  DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                  SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (TIPO = 'V') ");
                  SQL.append("and   (VERSIONE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_VERSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
            }
            IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
          }
        }
        catch (Exception e18)
        {
          MainFrm.set_AlertMessage(new IDVariant(e18.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      RiempiIMDB(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ANNO_MAND, 0), IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_NUMERO_MAND, 0));
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "Salva", _e);
      return -1;
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
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "ControllaEsistenzaOrdinativo", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Ordinativo Inviato Tesoriere 2
  // Explain which processing is carried out by this procedure
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  public IDVariant ControllaOrdinativoInviatoTesoriere2 (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
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
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "ControllaOrdinativoInviatoTesoriere2", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controlla Ordinativi Annullamenti
  // Anno Ordinativo:  - Input
  // Numero Ordinativo:  - Input
  // **********************************************************************
  private IDVariant ControllaOrdinativiAnnullamenti (IDVariant AnnoOrdinativo, IDVariant NumeroOrdinativo)
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
      v_MYTIPO = (new IDVariant("A", IDVariant.STRING));
      // 
      // Controlla Ordinativi Annullamenti Body
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
      SQL.append("and   ((A.DATA_INVIO IS NULL)) ");
      SQL.append("and   (A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO B ");
      SQL.append("where (A.NUMERO_ORD = B.NUMERO_ORD) ");
      SQL.append("and   (A.ANNO_ORD = B.ANNO_ORD) ");
      SQL.append("and   (A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
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
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "ControllaOrdinativiAnnullamenti", _e);
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
        if (IDL.IsNull(IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0)))
        {
          IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        else
        {
          if (ControllaEsistenzaOrdinativo(IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0), v_MYDATA).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, 0, new IDVariant(v_MYDATA));
            if (ControllaOrdinativoInviatoTesoriere2(IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0)).equals((new IDVariant(-1)), true))
            {
              IDVariant v_MSGC = new IDVariant(0,IDVariant.STRING);
              v_MSGC = (new IDVariant("Ordinativo non inviato al Tesoriere", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSGC); 
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, 0, (new IDVariant()));
            }
            if (ControllaOrdinativiAnnullamenti(IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Ordinativo con Annullamenti sospesi non modificabile.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, 0, (new IDVariant()));
            }
          }
          else
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Ordinativo Inesistente!", IDVariant.STRING));
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Indicarlo come Numero/Anno.", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2)); 
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, 0, (new IDVariant()));
          }
          RiempiIMDB(IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0), IMDB.Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0));
        }
        IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATVAR, 0, IDL.Today());
      }
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_ANNO_MAND, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_NUMERO_MAND, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_OLDVALFILTA5, IMDBDef6.FLD_OLDVALFILTA5_DATA_MAND, 0, (new IDVariant()));
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      PAN_VARIAZIONI.set_Header(Glb.OBJ_FIELD,PFL_VARIAZIONI_NUOVAVARIAZI, (new IDVariant()).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "LoadEvent", _e);
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
      UNLOAD_IMDVARDELROW();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "Unload", _e);
    }
  }

  // **********************************************************************
  // Filtri Table: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FILTABDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, 0, new IDVariant());
  }

  // **********************************************************************
  // IMDB Variazione: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDVARDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDBVARIAZIO);
  }

  // **********************************************************************
  // Variazioni On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
      // 
      // Variazioni On Validate Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF, 0, (new IDVariant("SI")));
      // 
      // controllo se è stato modificato il campo data 
      // 
      {
        if (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT, 0), true)!=0)
        {
          // 
          // aggiorno old value
          // 
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0));
          }
          // 
          // controllo la data variazione
          // 
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0))))
          {
            if (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATORD, 0), true)<0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Data Variazione inferiore alla Data del Mandato.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return;
            }
          }
          else
          {
            // PAN_VARIAZIONI.PanelCommand(Glb.PCM_UPDATE);
          }
        }
      }
      IMDB.set_Value(IMDBDef15.PQRY_IMDBVARIAZI2, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "VariazioniOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione tooltip
      // 
      {
        PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_BENEFICIARIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_BENEFICIARIO))).stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "VariazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Database Error Event
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Variazioni On Database Error Event Body
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
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "VariazioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterFind(IDVariant Command)
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
      // Variazioni After Find Event Body
      // Procedure Body
      // 
      IMDB.TblMoveFirst (IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
      while (!IMDB.Eof(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0))
      {
        if ((IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, 0).equals((new IDVariant("V")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA_INVIO, 0)))) || (IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_TIPO, 0).compareTo((new IDVariant("V")), true)!=0))
        {
          IDVariant v_NUOVAVARIAZI = new IDVariant(0,IDVariant.STRING);
          v_NUOVAVARIAZI = (new IDVariant("Nuova Variazione", IDVariant.STRING));
          if (!(IMDB.Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMEMODIF, 0).equals((new IDVariant("SI")), true)))
          {
            IMDB.set_Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_DATA, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMOLDDAT, 0, IMDB.Value(IMDBDef15.PQRY_FILTRITABLE7, IMDBDef15.PQSL_FILTRITABLE7_ROWNAMDATVAR, 0));
            IMDB.set_Value(IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef15.PQSL_IMDBVARIAZI2_ROWNAMNUOVAR, 0, new IDVariant(v_NUOVAVARIAZI));
          }
        }
        IMDB.TblMoveNext(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOrd", "VariazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Table
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAZIONORD_FILTRITABLE7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_FILTRITABLE7_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_FILTRITABLE9, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_FILTRITABLE7_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_FILTRITABLE7_RS, 0, IMDBDef6.TBL_FILTRITABLE9, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE7_RS, 0, 0, IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE7_RS, 1, 0, IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE7_RS, 2, 0, IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATVAR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_FILTRITABLE7_RS, 3, 0, IMDBDef6.TBL_FILTRITABLE9, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_FILTRITABLE9, 0);
      if (IMDB.Eof(IMDBDef6.TBL_FILTRITABLE9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_FILTRITABLE9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_FILTRITABLE7_RS, 0);
  }

  // **********************************************************************
  // IMDB Variazione
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAZIONORD_IMDBVARIAZI2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_IMDBVARIAZI2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBVARIAZIO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDBVARIAZIO, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0, IMDBDef6.TBL_IMDBVARIAZIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 1, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_RAGIONE_SOCIALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 2, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 3, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_VERSIONE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 4, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_TIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 5, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_DATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 6, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLNUMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 7, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLANMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 8, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLPRTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 9, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLDDAT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 10, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_DATA_INVIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 11, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO_TESO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 12, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 13, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ANNO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 14, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMNUOVAR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 15, 0, IMDBDef6.TBL_IMDBVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMEMODIF, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDBVARIAZIO, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDBVARIAZIO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBVARIAZIO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_IMDBVARIAZI2_RS, 0);
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

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
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
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "BDB286B6-2D8F-4369-8F75-95E95F4432A9");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "Ordinativo");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "58729AE1-A6F4-41AD-AA24-6FC97EE9D5EB");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "ANNO ORD");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, "18F7FBDC-5041-4CAF-8947-D4D2AAA04AA9");
    PAN_FILTSCELMAND.set_Header(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, "Data di Variazione");
    PAN_FILTSCELMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, "");
    PAN_FILTSCELMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTSCELMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTSCELMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, "90195921-CFD2-4CD0-B93C-84333251D428");
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
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ORDINATIVO, PPQRY_FILTRITABLE7, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 124, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 72);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_ANNOORD, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_ANNOORD, PPQRY_FILTRITABLE7, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_LIST, 84);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_LIST, "Data di Variazione");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_FORM, 308, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_FORM, 116);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DATADIVARIAZ, MyGlb.PANEL_FORM, "Data di Variazione");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DATADIVARIAZ, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DATADIVARIAZ, PPQRY_FILTRITABLE7, "A.ROWNAMDATVAR", "ROWNAMDATVAR", 6, 15, 0, -13997);
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 40);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_LIST, "del   ");
    PAN_FILTSCELMAND.SetRect(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 180, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTSCELMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 28);
    PAN_FILTSCELMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, 1);
    PAN_FILTSCELMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTSCELMAND_DEL, MyGlb.PANEL_FORM, "del");
    PAN_FILTSCELMAND.SetFieldPage(PFL_FILTSCELMAND_DEL, -1, -1);
    PAN_FILTSCELMAND.SetFieldPanel(PFL_FILTSCELMAND_DEL, PPQRY_FILTRITABLE7, "A.ROWNAMDATORD", "ROWNAMDATORD", 6, 19, 0, -13997);
  }

  private void PAN_FILTSCELMAND_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTSCELMAND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTSCELMAND.SetIMDB(IMDB, "PQRY_FILTRITABLE7", true);
    PAN_FILTSCELMAND.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTSCELMAND.SetQueryIMDB(PPQRY_FILTRITABLE7, IMDBDef15.PQRY_FILTRITABLE7_RS, IMDBDef6.TBL_FILTRITABLE9);
    JustLoaded = true;
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ORDINATIVO, IMDBDef6.FLD_FILTRITABLE9_NUMERO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_ANNOORD, IMDBDef6.FLD_FILTRITABLE9_ANNO_MAND);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DATADIVARIAZ, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATVAR);
    PAN_FILTSCELMAND.SetFieldPrimaryIndex(PFL_FILTSCELMAND_DEL, IMDBDef6.FLD_FILTRITABLE9_ROWNAMDATORD);
    PAN_FILTSCELMAND.SetMasterTable(0, "FILTRITABLE9");
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

  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "1254E3B9-DEB4-4913-BA63-CA45527E04AF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "Progressivo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, "AAED9DA0-DF0E-480F-82C8-2B22AD700C73");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, "Prog.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, "413BAD28-18F0-4209-8EE4-29A8DDEE205E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, "Beneficiario");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "4D13477B-9756-4B30-B96E-5A1D6530EEDE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, "D925ADB6-4CA7-4A80-B526-A55468E34A1E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, "TIPO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, "9F1B593C-4CA2-45FD-BC73-84CDBF6E5A5B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, "Data Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, "94E68FB9-C10B-4210-B451-025687121E97");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, "OLD ANNO MAND");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, "B0CE1974-2457-4A13-AF94-8ADDA652AC5B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, "OLD NUMERO MAND");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, "ACC4C456-A0CC-49E5-8E64-A3CEF225C186");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, "OLD PROGRESSIVO TESO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, "F0BCD744-005C-4D29-B1C9-4F05BA579A58");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, "OLD DATA VARIAZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, "54056745-6BFB-4AF4-8784-D6C77D6F568D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, "DATA INVIO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, "8404B9BC-A9B2-41C1-B336-50189C573005");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, "ANNO MAND");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, "983072BA-9554-4744-A7C7-CBA9ADDB1488");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, "NUMERO MAND");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, "45AAB0C5-32FB-42E5-BED3-96DFBE238DFF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, "VERSIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, "6BC88AFB-BC65-4C4B-8AF4-A2A49B1E464E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, "NUOVA VARIAZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, "CE9DFFCF-8905-47D1-AD76-1ECA0FE65ABE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, 0 | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, "08E7F54B-0111-43FD-9FE5-2562D6245F76");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, "MODIFICATO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "Prog.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "Progressivo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_IMDBVARIAZI2, "A.PROGRESSIVO", "PROGRESSIVO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_LIST, "Prog.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_FORM, 4, 244, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROG, MyGlb.PANEL_FORM, "Prog.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROG, PPQRY_IMDBVARIAZI2, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 40, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BENEFICIARIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BENEFICIARIO, PPQRY_IMDBVARIAZI2, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 40, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 184, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_IMDBVARIAZI2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_LIST, 536, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_FORM, 4, 172, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPO, PPQRY_IMDBVARIAZI2, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_LIST, 36);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_FORM, 36);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAVARIAZIO, MyGlb.PANEL_FORM, "D. Vr.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAVARIAZIO, PPQRY_IMDBVARIAZI2, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, 492, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_LIST, "OLD ANNO MAND");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDANNOMAND, MyGlb.PANEL_FORM, "OLD ANN. MAND");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OLDANNOMAND, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OLDANNOMAND, PPQRY_IMDBVARIAZI2, "A.ROWNAMOLANMA", "ROWNAMOLANMA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 492, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_LIST, "OLD NUMERO MAND");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDNUMERMAND, MyGlb.PANEL_FORM, "OLD NUM. MAND");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OLDNUMERMAND, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OLDNUMERMAND, PPQRY_IMDBVARIAZI2, "A.ROWNAMOLNUMA", "ROWNAMOLNUMA", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 492, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 132);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_LIST, "OLD PROGRESSIVO TESO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 132);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDPROGRTESO, MyGlb.PANEL_FORM, "OLD PROGR. TESO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OLDPROGRTESO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OLDPROGRTESO, PPQRY_IMDBVARIAZI2, "A.ROWNAMOLPRTE", "ROWNAMOLPRTE", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_LIST, 492, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_LIST, "OLD DATA VARIAZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_FORM, 4, 292, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OLDDATAVARIA, MyGlb.PANEL_FORM, "O. D. VAR.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OLDDATAVARIA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OLDDATAVARIA, PPQRY_IMDBVARIAZI2, "A.ROWNAMOLDDAT", "ROWNAMOLDDAT", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_LIST, 396, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_LIST, "DATA INVIO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_FORM, 4, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINVIO, MyGlb.PANEL_FORM, "DT. INVIO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAINVIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAINVIO, PPQRY_IMDBVARIAZI2, "A.DATA_INVIO", "DATA_INVIO", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_LIST, 396, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_FORM, 4, 244, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOMAND, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOMAND, PPQRY_IMDBVARIAZI2, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 396, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, "NUMERO MAND");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 220, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROMAND, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROMAND, PPQRY_IMDBVARIAZI2, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_LIST, "VERSIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VERSIONE, MyGlb.PANEL_FORM, "VERSIONE");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_VERSIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_VERSIONE, PPQRY_IMDBVARIAZI2, "A.VERSIONE", "VERSIONE", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_LIST, 344, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_LIST, "NUOVA VARIAZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_FORM, 4, 220, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUOVAVARIAZI, MyGlb.PANEL_FORM, "NUOV. VARIAZ.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUOVAVARIAZI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUOVAVARIAZI, PPQRY_IMDBVARIAZI2, "A.ROWNAMNUOVAR", "ROWNAMNUOVAR", 5, 50, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.PANEL_LIST, 344, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.PANEL_FORM, 340, 4, 176, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NEWPANELLABE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_LIST, 488, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_LIST, "MODIFICATO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_FORM, 4, 268, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MODIFICATO, MyGlb.PANEL_FORM, "MODIF.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_MODIFICATO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_MODIFICATO, PPQRY_IMDBVARIAZI2, "A.ROWNAMEMODIF", "ROWNAMEMODIF", 5, 49, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_MODIFICATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_MODIFICATO, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_IMDBVARIAZI2", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_VARIAZIONI.SetQueryIMDB(PPQRY_IMDBVARIAZI2, IMDBDef15.PQRY_IMDBVARIAZI2_RS, IMDBDef6.TBL_IMDBVARIAZIO);
    JustLoaded = true;
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_PROGRESSIVO, IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_PROG, IMDBDef6.FLD_IMDBVARIAZIO_PROGRESSIVO_TESO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_BENEFICIARIO, IMDBDef6.FLD_IMDBVARIAZIO_RAGIONE_SOCIALE);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_IMPORTO, IMDBDef6.FLD_IMDBVARIAZIO_IMPORTO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_TIPO, IMDBDef6.FLD_IMDBVARIAZIO_TIPO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_DATAVARIAZIO, IMDBDef6.FLD_IMDBVARIAZIO_DATA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_OLDANNOMAND, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLANMA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_OLDNUMERMAND, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLNUMA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_OLDPROGRTESO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLPRTE);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_OLDDATAVARIA, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMOLDDAT);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_DATAINVIO, IMDBDef6.FLD_IMDBVARIAZIO_DATA_INVIO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ANNOMAND, IMDBDef6.FLD_IMDBVARIAZIO_ANNO_MAND);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_NUMEROMAND, IMDBDef6.FLD_IMDBVARIAZIO_NUMERO_MAND);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_VERSIONE, IMDBDef6.FLD_IMDBVARIAZIO_VERSIONE);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_NUOVAVARIAZI, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMNUOVAR);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_MODIFICATO, IMDBDef6.FLD_IMDBVARIAZIO_ROWNAMEMODIF);
    PAN_VARIAZIONI.SetMasterTable(0, "IMDBVARIAZIO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_DynamicProperties();
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTSCELMAND) PAN_FILTSCELMAND_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterFind(CmdFind);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
