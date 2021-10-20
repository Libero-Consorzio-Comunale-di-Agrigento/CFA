// **********************************************
// Calcoli Importi Bilancio Simulato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CalcoliImportiBilancioSimulato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_ESERCDACALCO = 0;
  private static int GRP_PARAMETRI_PLURIENNALE = 1;

  private static int PFL_PARAMETRI_ESERCDAGENER = 0;
  private static int PFL_PARAMETRI_ESERCIZIO = 1;
  private static int PFL_PARAMETRI_ESERCIRIFERI = 2;
  private static int PFL_PARAMETRI_STANZIAMPURO = 3;
  private static int PFL_PARAMETRI_ETICSTANPURO = 4;
  private static int PFL_PARAMETRI_PARTSTANPURO = 5;
  private static int PFL_PARAMETRI_RESIDUPRESUN = 6;
  private static int PFL_PARAMETRI_ETICRESIPRES = 7;
  private static int PFL_PARAMETRI_PARTRESIPRES = 8;
  private static int PFL_PARAMETRI_TIPORESIPRES = 9;
  private static int PFL_PARAMETRI_STANZIACASSA = 10;
  private static int PFL_PARAMETRI_ETICSTANCASS = 11;
  private static int PFL_PARAMETRI_PARTSTANCASS = 12;
  private static int PFL_PARAMETRI_STANZDAESIGI = 13;
  private static int PFL_PARAMETRI_ETICSTADAESI = 14;
  private static int PFL_PARAMETRI_PARTSTADAESI = 15;
  private static int PFL_PARAMETRI_STANZDACRONO = 16;
  private static int PFL_PARAMETRI_ETICSTADACRO = 17;
  private static int PFL_PARAMETRI_FONDPLURVINC = 18;
  private static int PFL_PARAMETRI_ETIFONPLUVIN = 19;
  private static int PFL_PARAMETRI_GIAIMPEGNATO = 20;
  private static int PFL_PARAMETRI_ETICHGIAIMPE = 21;
  private static int PFL_PARAMETRI_PREVESERPREC = 22;
  private static int PFL_PARAMETRI_ETIPREESEPRE = 23;
  private static int PFL_PARAMETRI_PARPREESEPRE = 24;
  private static int PFL_PARAMETRI_PRECASESEPRE = 25;
  private static int PFL_PARAMETRI_ETIPRECAESPR = 26;
  private static int PFL_PARAMETRI_PARPRECAESPR = 27;
  private static int PFL_PARAMETRI_OK = 28;
  private static int PFL_PARAMETRI_ANNULLA = 29;

  private static int PPQRY_OUT14 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO18 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OUT13(IMDB);
    //
    //
    Init_PQRY_OUT14(IMDB);
    Init_PQRY_OUT14_RS(IMDB);
    Init_PQRY_NOTEFUNZIO18(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OUT13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT13, 20);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT13, "TBL_OUT13");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, "ROWNAMSTAPUR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTAPUR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPASTPU, "ROWNAMPASTPU");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPASTPU,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPAREPR, "ROWNAMPAREPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPAREPR,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMTIREPR, "ROWNAMTIREPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMTIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPASTCA, "ROWNAMPASTCA");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPASTCA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTDAES, "ROWNAMSTDAES");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTDAES,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPASTDAES, "RONAPASTDAES");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPASTDAES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTDACR, "ROWNAMSTDACR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMSTDACR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, "ROWNAMFOPLVI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMFOPLVI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMGIAIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPRESPR, "ROWNAMPRESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMPRESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPAPRESPR, "RONAPAPRESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPAPRESPR,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPRCAESPR, "RONAPRCAESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPRCAESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPAPRCAEP, "RONAPAPRCAEP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_RONAPAPRCAEP,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT13,IMDBDef3.FLD_OUT13_ROWNAMEFUNZI,5,100,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT13, 0);
  }

  private static void Init_PQRY_OUT14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT14, 19);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT14, "PQRY_OUT14");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR, "ROWNAMSTAPUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPASTPU, "ROWNAMPASTPU");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPASTPU,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPAREPR, "ROWNAMPAREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPAREPR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMTIREPR, "ROWNAMTIREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMTIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPASTCA, "ROWNAMPASTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPASTCA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, "ROWNAMSTDAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTDAES,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPASTDAES, "RONAPASTDAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPASTDAES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, "ROWNAMSTDACR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMSTDACR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI, "ROWNAMFOPLVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPRESPR, "ROWNAMPRESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_ROWNAMPRESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPAPRESPR, "RONAPAPRESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPAPRESPR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPRCAESPR, "RONAPRCAESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPRCAESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPAPRCAEP, "RONAPAPRCAEP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14,IMDBDef11.PQSL_OUT14_RONAPAPRCAEP,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT14, 0);
  }

  private static void Init_PQRY_OUT14_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT14_RS, 19);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT14_RS, "PQRY_OUT14_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR, "ROWNAMSTAPUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPASTPU, "ROWNAMPASTPU");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPASTPU,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPAREPR, "ROWNAMPAREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPAREPR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMTIREPR, "ROWNAMTIREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMTIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPASTCA, "ROWNAMPASTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPASTCA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, "ROWNAMSTDAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTDAES,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPASTDAES, "RONAPASTDAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPASTDAES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, "ROWNAMSTDACR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMSTDACR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI, "ROWNAMFOPLVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPRESPR, "ROWNAMPRESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_ROWNAMPRESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPAPRESPR, "RONAPAPRESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPAPRESPR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPRCAESPR, "RONAPRCAESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPRCAESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPAPRCAEP, "RONAPAPRCAEP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT14_RS,IMDBDef11.PQSL_OUT14_RONAPAPRCAEP,5,1,0);
  }

  private static void Init_PQRY_NOTEFUNZIO18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_NOTEFUNZIO18, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_NOTEFUNZIO18, "PQRY_NOTEFUNZIO18");
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO18,IMDBDef11.PQSL_NOTEFUNZIO18_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_NOTEFUNZIO18, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CalcoliImportiBilancioSimulato(MyWebEntryPoint w, IMDBObj imdb)
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
  public CalcoliImportiBilancioSimulato()
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
    FormIdx = MyGlb.FRM_CALIMPBILSIM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "232D83E8-CFA8-4A1F-8B91-97BC16995772";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 872;
    DesignHeight = 610;
    set_Caption(new IDVariant("Calcoli Importi Bilancio Simulato"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 872;
    Frames[1].Height = 584;
    Frames[1].FormFactor = 0.46789;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 408;
    Frames[2].Height = 584;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 408;
    Frames[2].FixedHeight = 584;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 584-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E3A6E4EA-648C-45DB-B1D1-7FA22E8A5640");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 628, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 464;
    Frames[3].Height = 584;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 584;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 464-MyGlb.PAN_OFFS_X, 584-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "21E87E2C-9884-4112-9504-E73ED67B8F26");
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT13, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CALIMPBILSIM_OUT14();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof CalcoliImportiBilancioSimulato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CalcoliImportiBilancioSimulato.class.getName() : (Glb.ClassWithPackage(CalcoliImportiBilancioSimulato.class) ? CalcoliImportiBilancioSimulato.class.getName().substring(CalcoliImportiBilancioSimulato.class.getPackage().getName().length() + 1) : CalcoliImportiBilancioSimulato.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_STANZIAMPURO = new IDVariant(0,IDVariant.STRING);
      v_STANZIAMPURO = (new IDVariant("Stanziamento Puro"));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0, (new IDVariant("PE")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTPU, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPAREPR, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMTIREPR, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTCA, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPASTDAES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRESPR, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRCAEP, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_STANZIAMPURO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "LoadEvent", _e);
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
      PAN_PARAMETRI.PanelCommand(Glb.PCM_CANCEL);
      UNLOADEVENT_OUTDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // OUT: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_OUTDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESERCIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTPU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPAREPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMTIREPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPASTDAES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRCAEP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri On Database Error Event
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Parametri On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "ParametriOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
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
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP, 0).equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMRESPRE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTACAS, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPRESPR, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPRCAESPR, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
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
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESERCIZIO, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0))) && IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, 0).compareTo((new IDVariant("SI")), true)!=0 && IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI, 0).compareTo((new IDVariant("SI")), true)!=0 && IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIRIFERI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_RIF, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCDAGENER)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0));
        if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESERCIZIO, 0, (new IDVariant()));
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0))))
          {
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, (new IDVariant()));
          }
          // IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESERCIZIO, 0, (new IDVariant()));
          if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP, 0).equals((new IDVariant("SI")), true))
          {
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          }
          else
          {
            IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_STANZIAMPURO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_STANZIAMPURO = new IDVariant(0,IDVariant.STRING);
        v_STANZIAMPURO = (new IDVariant("Stanziamento Puro"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_STANZIAMPURO));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTSTANPURO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTPU, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPASTPU, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_RESIDUPRESUN)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_RESIDUPRESUN = new IDVariant(0,IDVariant.STRING);
        v_RESIDUPRESUN = (new IDVariant("Residui Presunti"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_RESIDUPRESUN));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTRESIPRES)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPAREPR, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPAREPR, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TIPORESIPRES)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMTIREPR, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMTIREPR, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_STANZIACASSA)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_STANZDICASSA = new IDVariant(0,IDVariant.STRING);
        v_STANZDICASSA = (new IDVariant("Stanziamento di Cassa"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_STANZDICASSA));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTSTANCASS)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTCA, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPASTCA, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_STANZDAESIGI)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_STANZDAESIGI = new IDVariant(0,IDVariant.STRING);
        v_STANZDAESIGI = (new IDVariant("Stanziamento da Esigibilita"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_STANZDAESIGI));
        if (IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTSTADAESI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPASTDAES, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPASTDAES, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_STANZDACRONO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_STANZDACRONO = new IDVariant(0,IDVariant.STRING);
        v_STANZDACRONO = (new IDVariant("Stanziamento da Cronoprogramma"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_STANZDACRONO));
        if (IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_FONDPLURVINC)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_FONDPLURVINC = new IDVariant(0,IDVariant.STRING);
        v_FONDPLURVINC = (new IDVariant("Fondo Pluriennale Vincolato"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_FONDPLURVINC));
        if (IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_GIAIMPEGNATO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_GIAIMPEGNATO = new IDVariant(0,IDVariant.STRING);
        v_GIAIMPEGNATO = (new IDVariant("Gia Impegnato"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_GIAIMPEGNATO));
        if (IMDB.Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PREVESERPREC)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_PREVESERPREC = new IDVariant(0,IDVariant.STRING);
        v_PREVESERPREC = (new IDVariant("Previsione Esercizio precedente"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_PREVESERPREC));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARPREESEPRE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRESPR, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPAPRESPR, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PRECASESEPRE)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_PRECASESEPRE = new IDVariant(0,IDVariant.STRING);
        v_PRECASESEPRE = (new IDVariant("Previsione Cassa Esercizio precedente"));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMEFUNZI, 0, new IDVariant(v_PRECASESEPRE));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARPRECAESPR)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRCAEP, 0, IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPAPRCAEP, 0));
      }
      PAN_PARAMETRI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Ok Proc
  // **********************************************************************
  public int OkProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Elaborazione eseguita", IDVariant.STRING));
      // 
      // Ok Proc Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_RIF, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Indicare l'esercizio pluriennale e l'esercizio di riferimento"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<=0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("L'Esercizio di Pluriennale deve essere superiore all'Esercizio Corrente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_RIF, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0), true)>0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("L'Esercizio di Riferimento non può essere superiore all'Esercizio Pluriennale", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        IDVariant v_VESEFINTIPO = null;
        v_VESEFINTIPO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TIPO as ESEFINTIPO ");
        SQL.append("from ");
        SQL.append("  ESEFIN A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FASE_BILANCIO <= 7) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VESEFINTIPO = QV.Get("ESEFINTIPO", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.IsNull(v_VESEFINTIPO))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Esercizio Pluriennale non presente o non abilitato per la Generazione del Bilancio"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      else
      {
        if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Generazione non ammessa nell'attuale fase di bilancio dell'esercizio "));
          MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMRESPRE, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione. Lo stanziamento di cassa dovrà essere ricalcolato per l'esercizio "));
          IDVariant v_CONTINUARE = new IDVariant(0,IDVariant.STRING);
          v_CONTINUARE = (new IDVariant(". Si vuole continuare?"));
          if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)))), v_CONTINUARE))))
          {
            return 0;
          }
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTAPUR, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOSTNPUROARM(((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)), ((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_RIF, 0)), IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPASTPU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMRESPRE, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLORESPRESUNTIARM(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPAREPR, 0), IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMTIREPR, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTACAS, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOSTNCASSAARM(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPASTCA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDAES, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPASTDAES, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.BILCALCOLOSTNESIGACC(((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_RIF, 0)), ((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)));
        }
        else
        {
          MainFrm.Cf4armDBObject.BILCALCOLOSTNESIGIMP(((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_RIF, 0)), ((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)));
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMSTDACR, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOSTNESIGCRONO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMFOPLVI, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOAGGFPV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMGIAIMP, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOGIAIMPEGNATO(((IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ESERCIZIO, 0)));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_ROWNAMPRESPR, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOPREVISIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPAPRESPR, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPRCAESPR, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BPRCALCPREVISIONECASSA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_OUT14, IMDBDef11.PQSL_OUT14_RONAPAPRCAEP, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "OkProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Proc
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AnnullaProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Proc Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioSimulato", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void CALIMPBILSIM_OUT14() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT14_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT13, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT13, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT14_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT14_RS, 0, IMDBDef3.TBL_OUT13, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 0, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_DA_GEN, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 1, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESE_RIF, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 2, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 3, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 4, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTPU, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 5, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMRESPRE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 6, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPAREPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 7, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMTIREPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 8, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTACAS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 9, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPASTCA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 10, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDAES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 11, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPASTDAES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 12, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMSTDACR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 13, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 14, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 15, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_ROWNAMPRESPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 16, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRESPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 17, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPRCAESPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT14_RS, 18, 0, IMDBDef3.TBL_OUT13, IMDBDef3.FLD_OUT13_RONAPAPRCAEP, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT13, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT13, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT13, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT14_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_OK)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OkProc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProc();
      Cancel.set(IDVariant.TRUE);
    }
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
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, "9328A204-ADBE-47B4-B033-217AF0294488");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, "Esercizio da calcolare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, MyGlb.PANEL_FORM, 44, 15, 328, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 0, 120);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, "1F2928F7-3006-4ADF-AFFC-B567DCBB832F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, "Pluriennale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, MyGlb.PANEL_LIST, 0, -9999, 160, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, MyGlb.PANEL_FORM, 44, 71, 328, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 0, 63);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 30);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, "B3A931ED-F151-40CA-A71B-7ED9C1732291");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, "Esercizio Da Generare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "6C3BE090-AE1B-4942-8E3D-31E08B1853AF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, "ABE51DB2-C559-497D-BFB7-2CFBF2AC87A9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, "Esercizio Riferimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, "52D117B8-42DE-4772-AACA-216B28D11A30");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, "Stanziamento Puro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, "B86BFF82-19EF-4E85-8268-DB3C38166B6D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, "Stanziamento Puro");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, "9EBDA84E-D988-4C7C-8D6A-F7B4D8CD5215");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, "Parte Stanz Puro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "54620532-FFCC-4C95-A202-568BBE01EE06");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, "AB36F143-91B3-4927-BBD0-31D8D9A0C6C7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, "Residui Presunti");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, "DD58F849-8AD3-4BC7-9D5B-1A656ABCFDE5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, "Parte Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, "2539FEA0-1B38-4FE2-B3E5-8677691D6A1A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, "Tipo Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "BC89132D-D834-49E4-B49F-3D132ED4A2B5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "Stanziamento Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, "0CB0352C-9C05-448D-9934-F4E85BCAAFD1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, "Stanziamento Cassa");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, "CB948086-AF9F-433D-BFB1-578962301DD1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, "Parte Stanz Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, "9ADE2620-DE8C-477C-8AAB-876F58D2CA8C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, "Stanziamento Da Esigibilita");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, "5B34DEF7-096B-441E-8158-218B8DE4C48E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, "Stanziamento da Esigibilità");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, "AC87268D-D157-447E-800E-A9C1E245DB9B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, "Parte Stanz Da Esig");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, "82CFDDFE-8A47-470E-AAB0-42BB62E722B0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, "Stanziamento Da Cronoprogrammi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, "AA2B8BDC-7110-426D-8595-C1C56F50D071");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, "Stanziamento da Cronoprogramma");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, "3399E01F-2DC6-43D9-8E4C-A29C80F50568");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, "Fondo Pluriennale Vincolato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, "B2D73534-1680-4A4E-A73F-29D90C90F789");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, "Fondo Pluriennale Vincolato");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "7C948502-97BF-49E6-856C-82D88755D4F0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "Gia Impegnato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "C5ACDD50-C526-4250-9A4F-ABD5FFA77CC3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "Già Impegnato");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, "782592CD-0DD2-4901-BBC9-3AE9E4136048");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, "CCCD2A9A-AA50-4F8B-B336-55235CD92CF0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, "12259D26-1B6C-443B-A3DD-DF73FF644BD7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, "Parte Prev Esercizio Prec");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, "9134E112-7462-4784-98B1-4FFA6B5C5937");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, "Previsione Cassa Esercizio Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, "5A490C39-FDFB-41E2-ABC8-B929B48D99AC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, "Previsione Esercizio Cassa Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, "627862E9-0170-4342-B82B-8186B238E2B4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, "Parte Prev Cassa Esercizio Prec");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "B5863A96-468B-4D85-B2E7-1A9CBDBEF06B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "OK");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "E0D85DB7-6A45-4DC5-89AF-7E41988A5A14");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "Annulla");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, "Eserc. Da Generare");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, 48, 40, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, "Esercizio Da Generare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCDAGENER, -1, GRP_PARAMETRI_ESERCDACALCO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCDAGENER, PPQRY_OUT14, "A.ESE_DA_GEN", "ESE_DA_GEN", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 48, 96, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, GRP_PARAMETRI_PLURIENNALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_OUT14, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, "Es. Rf.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, 192, 96, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, "Esercizio Riferimento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIRIFERI, -1, GRP_PARAMETRI_PLURIENNALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIRIFERI, PPQRY_OUT14, "A.ESE_RIF", "ESE_RIF", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, "Stanziamento Puro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, 48, 128, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, "Stanziamento Puro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZIAMPURO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZIAMPURO, PPQRY_OUT14, "A.ROWNAMSTAPUR", "ROWNAMSTAPUR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIAMPURO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIAMPURO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_LIST, 80, 132, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_FORM, 72, 128, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTANPURO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTANPURO, -1, "", "ETICSTANPURO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, "Parte Stanz Puro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, 72, 152, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, "Parte Stanz Puro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTSTANPURO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTSTANPURO, PPQRY_OUT14, "A.ROWNAMPASTPU", "ROWNAMPASTPU", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANPURO, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANPURO, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, "Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 48, 176, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, "Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIDUPRESUN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIDUPRESUN, PPQRY_OUT14, "A.ROWNAMRESPRE", "ROWNAMRESPRE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUPRESUN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUPRESUN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 88, 140, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 72, 176, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICRESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICRESIPRES, -1, "", "ETICRESIPRES", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, "Parte Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, 72, 200, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, "Parte Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTRESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTRESIPRES, PPQRY_OUT14, "A.ROWNAMPAREPR", "ROWNAMPAREPR", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTRESIPRES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTRESIPRES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, "Tipo Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, 72, 224, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, "Tipo Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPORESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPORESIPRES, PPQRY_OUT14, "A.ROWNAMTIREPR", "ROWNAMTIREPR", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORESIPRES, (new IDVariant(1)), "Residui al 31/12", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORESIPRES, (new IDVariant(2)), "Residui Attuali", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, "Stanziamento Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 48, 252, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, "Stanziamento Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZIACASSA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZIACASSA, PPQRY_OUT14, "A.ROWNAMSTACAS", "ROWNAMSTACAS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIACASSA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIACASSA, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 96, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 72, 252, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTANCASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTANCASS, -1, "", "ETICSTANCASS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, "Parte Stanz Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, 72, 276, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, "Parte Stanz Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTSTANCASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTSTANCASS, PPQRY_OUT14, "A.ROWNAMPASTCA", "ROWNAMPASTCA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANCASS, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANCASS, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_LIST, "Stanziamento Da Esigibilita");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_FORM, 48, 304, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_FORM, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDAESIGI, MyGlb.PANEL_FORM, "Stanziamento Da Esigibilita");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZDAESIGI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZDAESIGI, PPQRY_OUT14, "A.ROWNAMSTDAES", "ROWNAMSTDAES", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZDAESIGI, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZDAESIGI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.PANEL_LIST, 104, 156, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.PANEL_FORM, 72, 304, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADAESI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTADAESI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTADAESI, -1, "", "ETICSTADAESI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_LIST, "Parte Stanz Da Esig");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_FORM, 72, 328, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTADAESI, MyGlb.PANEL_FORM, "Parte Stanz Da Esig");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTSTADAESI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTSTADAESI, PPQRY_OUT14, "A.RONAPASTDAES", "RONAPASTDAES", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTADAESI, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTADAESI, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_LIST, 0, 36, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_LIST, 204);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_LIST, "Stanziamento Da Cronoprogrammi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_FORM, 48, 352, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_FORM, 204);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZDACRONO, MyGlb.PANEL_FORM, "Stanziamento Da Cronoprogrammi");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZDACRONO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZDACRONO, PPQRY_OUT14, "A.ROWNAMSTDACR", "ROWNAMSTDACR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZDACRONO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZDACRONO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.PANEL_LIST, 104, 156, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.PANEL_FORM, 72, 352, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTADACRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTADACRO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTADACRO, -1, "", "ETICSTADACRO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_LIST, "Fondo Pluriennale Vincolato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_FORM, 48, 376, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_FORM, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FONDPLURVINC, MyGlb.PANEL_FORM, "Fondo Pluriennale Vincolato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FONDPLURVINC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FONDPLURVINC, PPQRY_OUT14, "A.ROWNAMFOPLVI", "ROWNAMFOPLVI", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_FONDPLURVINC, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_FONDPLURVINC, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.PANEL_LIST, 112, 164, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.PANEL_FORM, 72, 376, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIFONPLUVIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETIFONPLUVIN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETIFONPLUVIN, -1, "", "ETIFONPLUVIN", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Gia Impegnato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 48, 400, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Gia Impegnato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_GIAIMPEGNATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_GIAIMPEGNATO, PPQRY_OUT14, "A.ROWNAMGIAIMP", "ROWNAMGIAIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_GIAIMPEGNATO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_GIAIMPEGNATO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 120, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 72, 400, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHGIAIMPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHGIAIMPE, -1, "", "ETICHGIAIMPE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, 48, 424, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PREVESERPREC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PREVESERPREC, PPQRY_OUT14, "A.ROWNAMPRESPR", "ROWNAMPRESPR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PREVESERPREC, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PREVESERPREC, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_LIST, 128, 180, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_FORM, 72, 424, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETIPREESEPRE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETIPREESEPRE, -1, "", "ETIPREESEPRE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_LIST, 148);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_LIST, "Parte Prev Esercizio Prec");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_FORM, 72, 448, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_FORM, 148);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPREESEPRE, MyGlb.PANEL_FORM, "Parte Prev Esercizio Prec");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARPREESEPRE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARPREESEPRE, PPQRY_OUT14, "A.RONAPAPRESPR", "RONAPAPRESPR", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARPREESEPRE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARPREESEPRE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, 0, 36, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, 224);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, "Previsione Cassa Esercizio Precedente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, 48, 472, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, 224);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, "Previsione Cassa Esercizio Precedente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PRECASESEPRE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PRECASESEPRE, PPQRY_OUT14, "A.RONAPRCAESPR", "RONAPRCAESPR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PRECASESEPRE, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PRECASESEPRE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_LIST, 136, 188, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_FORM, 72, 472, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETIPRECAESPR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETIPRECAESPR, -1, "", "ETIPRECAESPR", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_LIST, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_LIST, "Parte Prev Cassa Esercizio Prec");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_FORM, 72, 496, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARPRECAESPR, MyGlb.PANEL_FORM, "Parte Prev Cassa Esercizio Prec");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARPRECAESPR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARPRECAESPR, PPQRY_OUT14, "A.RONAPAPRCAEP", "RONAPAPRCAEP", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARPRECAESPR, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARPRECAESPR, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 184, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 204, 536, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OK, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 192, 268, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 292, 536, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNULLA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'PE' as NUOVAESPRESS, ");
    SQL.append("  1 as ORDINAMENTO, ");
    SQL.append("  DECODE('PE', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') || ' (' || TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) || ')' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'PE') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'EP', ");
    SQL.append("  2, ");
    SQL.append("  DECODE('EP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'EP') ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARAMETRI_ESERCDAGENER, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'PE' as NUOVAESPRESS, ");
    SQL.append("  1 as ORDINAMENTO, ");
    SQL.append("  DECODE('PE', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') || ' (' || TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) || ')' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'EP', ");
    SQL.append("  2, ");
    SQL.append("  DECODE('EP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_PARAMETRI_ESERCDAGENER, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_OUT14", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_OUT14, IMDBDef11.PQRY_OUT14_RS, IMDBDef3.TBL_OUT13);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCDAGENER, IMDBDef3.FLD_OUT13_ESE_DA_GEN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef3.FLD_OUT13_ESERCIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIRIFERI, IMDBDef3.FLD_OUT13_ESE_RIF);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZIAMPURO, IMDBDef3.FLD_OUT13_ROWNAMSTAPUR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTSTANPURO, IMDBDef3.FLD_OUT13_ROWNAMPASTPU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESIDUPRESUN, IMDBDef3.FLD_OUT13_ROWNAMRESPRE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTRESIPRES, IMDBDef3.FLD_OUT13_ROWNAMPAREPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPORESIPRES, IMDBDef3.FLD_OUT13_ROWNAMTIREPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZIACASSA, IMDBDef3.FLD_OUT13_ROWNAMSTACAS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTSTANCASS, IMDBDef3.FLD_OUT13_ROWNAMPASTCA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZDAESIGI, IMDBDef3.FLD_OUT13_ROWNAMSTDAES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTSTADAESI, IMDBDef3.FLD_OUT13_RONAPASTDAES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZDACRONO, IMDBDef3.FLD_OUT13_ROWNAMSTDACR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FONDPLURVINC, IMDBDef3.FLD_OUT13_ROWNAMFOPLVI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_GIAIMPEGNATO, IMDBDef3.FLD_OUT13_ROWNAMGIAIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PREVESERPREC, IMDBDef3.FLD_OUT13_ROWNAMPRESPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARPREESEPRE, IMDBDef3.FLD_OUT13_RONAPAPRESPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PRECASESEPRE, IMDBDef3.FLD_OUT13_RONAPRCAESPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARPRECAESPR, IMDBDef3.FLD_OUT13_RONAPAPRCAEP);
    PAN_PARAMETRI.SetMasterTable(0, "OUT13");
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

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "0BA607DC-CC64-4468-9695-48D6C7790B29");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "9C467349-1EFC-4492-AE46-3F73E6661A5B");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "4FF7E723-6428-404B-98E8-50D9B91B59A3");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "70AB82A4-653A-4737-9934-A4A3D9FE9BF1");
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
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO18, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO18, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO18, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 16, 440, 556, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 42);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO18, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO18", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO18, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO18, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_CALIMPBILSIM,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = ~~TBL_OUT13.ROWNAMEFUNZI~~) ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO18, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO18, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO18, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO18, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO18, MainFrm.Cf4armDBObject.DB, 4);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
