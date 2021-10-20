// **********************************************
// Aggiornamento Automatico Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoAutomaticoBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_AGGIAUTOBILA_AGGIORNAMEDA = 0;

  private static int PFL_AGGIAUTOBILA_PADAPLABIDIE = 0;
  private static int PFL_AGGIAUTOBILA_PASBILSISUEF = 1;
  private static int PFL_AGGIAUTOBILA_RESIDUPRESUN = 2;
  private static int PFL_AGGIAUTOBILA_PREDEFESEPRE = 3;
  private static int PFL_AGGIAUTOBILA_STANCOMPEREI = 4;
  private static int PFL_AGGIAUTOBILA_GIAIMPEGNATO = 5;
  private static int PFL_AGGIAUTOBILA_AGBIDIRIPEFI = 6;
  private static int PFL_AGGIAUTOBILA_RIIMACTIULEC = 7;
  private static int PFL_AGGIAUTOBILA_SUBILAEFFSIM = 8;
  private static int PFL_AGGIAUTOBILA_RICPREDEESPR = 9;
  private static int PFL_AGGIAUTOBILA_SUBILEFFSIM1 = 10;
  private static int PFL_AGGIAUTOBILA_RICASTANINIZ = 11;
  private static int PFL_AGGIAUTOBILA_SUBILEFFSIM2 = 12;
  private static int PFL_AGGIAUTOBILA_RICSTASUBIPL = 13;
  private static int PFL_AGGIAUTOBILA_SUBILEFFSIM3 = 14;
  private static int PFL_AGGIAUTOBILA_SUBILEFFSIM4 = 15;
  private static int PFL_AGGIAUTOBILA_FAKE = 16;
  private static int PFL_AGGIAUTOBILA_STANZDICASSA = 17;
  private static int PFL_AGGIAUTOBILA_RICARESIPRES = 18;
  private static int PFL_AGGIAUTOBILA_RESPREEFFSIM = 19;
  private static int PFL_AGGIAUTOBILA_RESPREPAENSP = 20;
  private static int PFL_AGGIAUTOBILA_RESPRERE31AT = 21;
  private static int PFL_AGGIAUTOBILA_RICASTANCASS = 22;
  private static int PFL_AGGIAUTOBILA_STCASUBIEFSI = 23;
  private static int PFL_AGGIAUTOBILA_STACASPAENSP = 24;
  private static int PFL_AGGIAUTOBILA_RICALGIAIMPE = 25;
  private static int PFL_AGGIAUTOBILA_GIIMSUBIEFSI = 26;
  private static int PFL_AGGIAUTOBILA_OK = 27;
  private static int PFL_AGGIAUTOBILA_ANNULLA = 28;
  private static int PFL_AGGIAUTOBILA_LABELESERCIZ = 29;

  private static int PPQRY_OUT4 = 0;


  IDPanel PAN_AGGIAUTOBILA;

  // Definition of Global Variables
  private IDVariant PASSADAPLURI = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PASSAGBILANC = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICALCIMPEGN = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICALCPREVIS = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICASTANINIZ = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICASTASUBIL = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RETVAL = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICARESIPRES = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICASTANCASS = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RICALGIAIMPE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI458(IMDB);
    Init_TBL_OUT7(IMDB);
    //
    //
    Init_PQRY_OUT4(IMDB);
    Init_PQRY_OUT4_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI458(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI458, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI458, "TBL_PARAMETRI458");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI458,IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, "ROWNAMEESEIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI458,IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI458,IMDBDef3.FLD_PARAMETRI458_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI458,IMDBDef3.FLD_PARAMETRI458_ROWNAMETIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI458, 0);
  }

  private static void Init_TBL_OUT7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT7, 25);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT7, "TBL_OUT7");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAIMACULEC, "RONAIMACULEC");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAIMACULEC,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAPRDEESPR, "RONAPRDEESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAPRDEESPR,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMSTAINI, "ROWNAMSTAINI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMSTAINI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMEIMPEG,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAAGBIDRPF, "RONAAGBIDRPF");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAAGBIDRPF,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAPADPABDE, "RONAPADPABDE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAPADPABDE,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAPABISISE, "RONAPABISISE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAPABISISE,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONARIIATUEC, "RONARIIATUEC");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONARIIATUEC,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONARIPRDEEP, "RONARIPRDEEP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONARIPRDEEP,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRISTIN, "ROWNAMRISTIN");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRISTIN,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONARISTSUBP, "RONARISTSUBP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONARISTSUBP,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFSI, "RONASUBIEFSI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS1, "RONASUBIEFS1");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS1,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS2, "RONASUBIEFS2");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS2,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS3, "RONASUBIEFS3");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS3,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS4, "RONASUBIEFS4");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASUBIEFS4,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRIREPR, "ROWNAMRIREPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAREPREFSI, "RONAREPREFSI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAREPREFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAREPRPAES, "RONAREPRPAES");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAREPRPAES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAREPRRE3A, "RONAREPRRE3A");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAREPRRE3A,1,52,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRISTCA, "ROWNAMRISTCA");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRISTCA,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASTCASBES, "RONASTCASBES");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASTCASBES,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASTCAPAES, "RONASTCAPAES");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONASTCAPAES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRIGIIM, "ROWNAMRIGIIM");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_ROWNAMRIGIIM,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAGIIMSBES, "RONAGIIMSBES");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT7,IMDBDef3.FLD_OUT7_RONAGIIMSBES,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT7, 0);
  }

  private static void Init_PQRY_OUT4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT4, 25);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT4, "PQRY_OUT4");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAIMACULEC, "RONAIMACULEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAIMACULEC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAPRDEESPR, "RONAPRDEESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAPRDEESPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMSTAINI, "ROWNAMSTAINI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMSTAINI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMEIMPEG,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAAGBIDRPF, "RONAAGBIDRPF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAAGBIDRPF,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAPADPABDE, "RONAPADPABDE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAPADPABDE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAPABISISE, "RONAPABISISE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAPABISISE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONARIIATUEC, "RONARIIATUEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONARIIATUEC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONARIPRDEEP, "RONARIPRDEEP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONARIPRDEEP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, "ROWNAMRISTIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRISTIN,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONARISTSUBP, "RONARISTSUBP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONARISTSUBP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFSI, "RONASUBIEFSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS1, "RONASUBIEFS1");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS1,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS2, "RONASUBIEFS2");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS2,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS3, "RONASUBIEFS3");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS3,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS4, "RONASUBIEFS4");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASUBIEFS4,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, "ROWNAMRIREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAREPREFSI, "RONAREPREFSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAREPREFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAREPRPAES, "RONAREPRPAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAREPRPAES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAREPRRE3A, "RONAREPRRE3A");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAREPRRE3A,1,52,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, "ROWNAMRISTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRISTCA,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASTCASBES, "RONASTCASBES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASTCASBES,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASTCAPAES, "RONASTCAPAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONASTCAPAES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, "ROWNAMRIGIIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAGIIMSBES, "RONAGIIMSBES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4,IMDBDef11.PQSL_OUT4_RONAGIIMSBES,1,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT4, 0);
  }

  private static void Init_PQRY_OUT4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT4_RS, 25);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT4_RS, "PQRY_OUT4_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAIMACULEC, "RONAIMACULEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAIMACULEC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAPRDEESPR, "RONAPRDEESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAPRDEESPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMSTAINI, "ROWNAMSTAINI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMSTAINI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMEIMPEG,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAAGBIDRPF, "RONAAGBIDRPF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAAGBIDRPF,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAPADPABDE, "RONAPADPABDE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAPADPABDE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAPABISISE, "RONAPABISISE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAPABISISE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONARIIATUEC, "RONARIIATUEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONARIIATUEC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONARIPRDEEP, "RONARIPRDEEP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONARIPRDEEP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, "ROWNAMRISTIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRISTIN,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONARISTSUBP, "RONARISTSUBP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONARISTSUBP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFSI, "RONASUBIEFSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS1, "RONASUBIEFS1");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS1,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS2, "RONASUBIEFS2");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS2,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS3, "RONASUBIEFS3");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS3,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS4, "RONASUBIEFS4");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASUBIEFS4,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, "ROWNAMRIREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAREPREFSI, "RONAREPREFSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAREPREFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAREPRPAES, "RONAREPRPAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAREPRPAES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAREPRRE3A, "RONAREPRRE3A");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAREPRRE3A,1,52,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, "ROWNAMRISTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRISTCA,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASTCASBES, "RONASTCASBES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASTCASBES,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASTCAPAES, "RONASTCAPAES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONASTCAPAES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, "ROWNAMRIGIIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAGIIMSBES, "RONAGIIMSBES");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT4_RS,IMDBDef11.PQSL_OUT4_RONAGIIMSBES,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoAutomaticoBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoAutomaticoBilancio()
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
    FormIdx = MyGlb.FRM_AGGIAUTOBILA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "795D33B9-FBE3-416E-87BC-17691843AA77";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 594;
    set_Caption(new IDVariant("Aggiornamento Automatico Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 568;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Aggiornamento Automatico Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 568;
    PAN_AGGIAUTOBILA = new IDPanel(w, this, 1, "PAN_AGGIAUTOBILA");
    Frames[1].Content = PAN_AGGIAUTOBILA;
    PAN_AGGIAUTOBILA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AGGIAUTOBILA.VS = MainFrm.VisualStyleList;
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 568-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3664076A-ECFA-4B74-AFF2-1AADF65511BA");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4384, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AGGIAUTOBILA.InitStatus = 2;
    PAN_AGGIAUTOBILA_Init();
    PAN_AGGIAUTOBILA_InitFields();
    PAN_AGGIAUTOBILA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT7, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIAUTOBILA_OUT4();
      }
      PAN_AGGIAUTOBILA.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoAutomaticoBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoAutomaticoBilancio.class.getName() : (Glb.ClassWithPackage(AggiornamentoAutomaticoBilancio.class) ? AggiornamentoAutomaticoBilancio.class.getName().substring(AggiornamentoAutomaticoBilancio.class.getPackage().getName().length() + 1) : AggiornamentoAutomaticoBilancio.class.getName()));
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
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_INTESTAZIONE = (new IDVariant("Aggiornamento Automatico Bilancio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_INTESTAZIONE, (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0))));
      PAN_AGGIAUTOBILA.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      Visibilit‡Varie();
      AbilitazioniVarie();
      Settalabel();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "LoadEvent", _e);
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
      UNLOADEVENT_OUTDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // PerchË stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMETIPO, 0, new IDVariant());
  }

  // **********************************************************************
  // OUT: Delete
  // PerchË stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_OUTDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAIMACULEC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPRDEESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMSTAINI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMEIMPEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAAGBIDRPF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPADPABDE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPABISISE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARIIATUEC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARIPRDEEP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRISTIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARISTSUBP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFSI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS2, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS3, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS4, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRIREPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAREPREFSI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAREPRPAES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAREPRRE3A, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRISTCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASTCASBES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASTCAPAES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRIGIIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAGIIMSBES, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: » un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercher‡ di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ENDMESSAGE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ENDMESSAGE = (new IDVariant("Operazione Terminata", IDVariant.STRING));
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_VODEBISCSIAI)), true) && Result.equals((new IDVariant(-1)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Passaggio Bilancio Simulato su Effettivo", IDVariant.STRING));
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento Passaggio Da Pluriennale A Bilancio Di Esercizio  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_PADAPLABIDIE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento Passaggio Da Pluriennale A Bilancio Di Esercizio  Validate Event Body
      // Procedure Body
      // 
      if (PASSADAPLURI.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        PASSADAPLURI = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
        // PASSAGBILANC = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
        // RICALCIMPEGN = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
        // RICASTANINIZ = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
        // RICASTASUBIL = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentoPassaggioDaPluriennaleABilancioDiEsercizioValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Passaggio Bilancio Simulato Su Effettivo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_PASBILSISUEF_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Passaggio Bilancio Simulato Su Effettivo Validate Event Body
      // Procedure Body
      // 
      if (PASSAGBILANC.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        PASSAGBILANC = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(1)));
        Visibilit‡Varie();
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
        // RICALCIMPEGN = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
        // RICASTANINIZ = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
        // RICASTASUBIL = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
        // PASSADAPLURI = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaPassaggioBilancioSimulatoSuEffettivoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Ricalcolo Impegni Acc Ti Ultimo Esercizio Chiuso Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RIIMACTIULEC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Ricalcolo Impegni Acc Ti Ultimo Esercizio Chiuso Validate Event Body
      // Procedure Body
      // 
      if (RICALCIMPEGN.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICALCIMPEGN = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
        // PASSADAPLURI = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
        // PASSAGBILANC = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
        // RICASTANINIZ = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
        // RICASTASUBIL = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, 0, (new IDVariant(0)));
        // RICARESIPRES = (new IDVariant(0));
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFSI, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaRicalcoloImpegniAccTiUltimoEsercizioChiusoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Ricalcolo Previsione Definitiva Esercizio Precedente Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RICPREDEESPR_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Ricalcolo Previsione Definitiva Esercizio Precedente Validate Event Body
      // Procedure Body
      // 
      if (RICALCPREVIS.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICALCPREVIS = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
        // PASSADAPLURI = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
        // PASSAGBILANC = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
        // RICASTANINIZ = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
        // RICASTASUBIL = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
        // RICALCIMPEGN = (new IDVariant(0));
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS1, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaRicalcoloPrevisioneDefinitivaEsercizioPrecedenteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Ricalcolo Stanziamento Iniziale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RICASTANINIZ_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Ricalcolo Stanziamento Iniziale Validate Event Body
      // Procedure Body
      // 
      if (RICASTANINIZ.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICASTANINIZ = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
        // PASSAGBILANC = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
        // RICALCIMPEGN = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
        // RICASTASUBIL = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
        // PASSADAPLURI = (new IDVariant(0));
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS2, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaRicalcoloStanziamentoInizialeValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Ricalcolo Stanziamento Su Bilancio Pluriennale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RICSTASUBIPL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Ricalcolo Stanziamento Su Bilancio Pluriennale Validate Event Body
      // Procedure Body
      // 
      if (RICASTASUBIL.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICASTASUBIL = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
        // PASSAGBILANC = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
        // RICALCIMPEGN = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
        // RICASTANINIZ = (new IDVariant(0));
        // PASSADAPLURI = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS3, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS4, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaRicalcoloStanziamentoSuBilancioPluriennaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AGGIAUTOBILA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_AGGIAUTOBILA);
      // 
      // On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PASSAGBILANC.compareTo((new IDVariant(1)), true)!=0)
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        Visibilit‡Varie();
      }
      if (PASSADAPLURI.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (PASSAGBILANC.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RICALCIMPEGN.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RICALCPREVIS.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RICASTANINIZ.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RICASTASUBIL.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // r... aggiunto qui per ggiungere altri option button
      // DELIRIOOO!!!
      // 
      DisabilitaNuoviCampi();
      if (RICARESIPRES.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        // 
        // ....
        // 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RICASTANCASS.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RICALGIAIMPE.equals((new IDVariant(1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "OnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento Automatico Bilancio Ricalcolo Residui Presunti Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RICARESIPRES_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento Automatico Bilancio Ricalcolo Residui Presunti Validate Body
      // Corpo Procedura
      // 
      if (RICARESIPRES.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICARESIPRES = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAREPREFSI, 0, (new IDVariant(0)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAREPRPAES, 0, (new IDVariant("E")));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAREPRRE3A, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
        // PASSADAPLURI = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
        // PASSAGBILANC = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
        // RICALCPREVIS = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
        // RICASTANINIZ = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
        // RICASTASUBIL = (new IDVariant(0));
        // 
        // r...
        // 
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, 0, (new IDVariant(0)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, 0, (new IDVariant(0)));
        // RICASTANCASS = (new IDVariant(0));
        // RICALGIAIMPE = (new IDVariant(0));
        // RICALCIMPEGN = (new IDVariant(0));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentoAutomaticoBilancioRicalcoloResiduiPresuntiValidate", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Ricalcolo Stanziamento Cassa Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RICASTANCASS_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Ricalcolo Stanziamento Cassa Validate Body
      // Corpo Procedura
      // 
      if (RICASTANCASS.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICASTANCASS = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASTCASBES, 0, (new IDVariant(0)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASTCAPAES, 0, (new IDVariant("E")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaRicalcoloStanziamentoCassaValidate", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento da Ricalcolo Gia Impegnato Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_AGGIAUTOBILA_RICALGIAIMPE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento da Ricalcolo Gia Impegnato Validate Body
      // Corpo Procedura
      // 
      if (RICALGIAIMPE.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, 0).equals((new IDVariant(1)), true))
      {
        DisabilitaTutto();
        RICALGIAIMPE = (new IDVariant(1));
        IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, 0, (new IDVariant(1)));
        // IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAGIIMSBES, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AggiornamentodaRicalcoloGiaImpegnatoValidate", _e);
    }
  }

  // **********************************************************************
  // Annulla Procedura
  // **********************************************************************
  public int AnnullaProcedura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Procedura Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AnnullaProcedura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Su Bpr
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlloSuBpr ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Su Bpr Body
      // Procedure Body
      // 
      v_CONTATORE = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BPR A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "ControlloSuBpr", _e);
      return false;
    }
  }

  // **********************************************************************
  // Visibilit‡ Varie
  // **********************************************************************
  public int Visibilit‡Varie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RESP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Varie Body
      // Procedure Body
      // 
      // 
      // IMPEGNABILE
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.GESTIONE_IMPEGNABILE as T99GESTIIMPE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RESP = QV.Get("T99GESTIIMPE", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_RESP.equals((new IDVariant("SI")), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.FINANZIAMENT.equals((new IDVariant(-1)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "Visibilit‡Varie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settalabel
  // **********************************************************************
  public int Settalabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Settalabel Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.ESERCIZIO) as MAXESEFIESER ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.FASE_BILANCIO = 8 OR A.FASE_BILANCIO = 9) ");
      SQL.append("and   (A.ESERCIZIO < " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RETVALUE = QV.Get("MAXESEFIESER", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_RETVALUE.compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_AGGIAUTOBILA.set_FieldText(PFL_AGGIAUTOBILA_LABELESERCIZ, IDL.ToString(v_RETVALUE).stringValue());
        RETVAL = new IDVariant(v_RETVALUE);
      }
      else
      {
        PASSAGBILANC = (new IDVariant(0));
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPABISISE, 0, (new IDVariant(0)));
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "Settalabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazioni Varie
  // **********************************************************************
  public int AbilitazioniVarie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Abilitazioni Varie Body
      // Procedure Body
      // 
      v_CONTATORE = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // ALTRE DISABILITAZIONI
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMETIPO, 0).compareTo((new IDVariant("P")), true)!=0)
      {
        if ((new IDVariant(ControlloSuBpr())).equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPABISISE, 0, (new IDVariant(1)));
          PASSAGBILANC = (new IDVariant(1));
        }
        else
        {
          RICALCIMPEGN = (new IDVariant(1));
          IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARIIATUEC, 0, (new IDVariant(1)));
        }
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPADPABDE, 0, (new IDVariant(1)));
        PASSADAPLURI = (new IDVariant(1));
      }
      if ((new IDVariant(ControlloSuBpr())).equals((new IDVariant(0)), true))
      {
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "AbilitazioniVarie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco
  // **********************************************************************
  public int ApriElenco ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PAR1, IMDBDef3.FLD_PAR1_ROWNAMEESEIN, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0));
      MainFrm.Show(MyGlb.FRM_VODEBISCSIAI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "ApriElenco", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OK Procedura
  // **********************************************************************
  public int OKProcedura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ENDMESSAGE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ENDMESSAGE = (new IDVariant("Operazione Terminata", IDVariant.STRING));
      // 
      // OK Procedura Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILPREVENTIVO(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Passaggio da Pluriennale a Bilancio di Esercizio", IDVariant.STRING));
          MainFrm.Cf4armDBObject.CommitTrans();
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
        v_CONT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  BIL A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.VARIAZIONI_CO <> 0) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONT.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_ERRMESS = new IDVariant(0,IDVariant.STRING);
          v_ERRMESS = (new IDVariant("Sul bilancio effettivo sono presenti variazioni: eseguire il Passaggio da Pluriennali  a Preventivo", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERRMESS); 
        }
        else
        {
          if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMSTAINI, 0).equals((new IDVariant(1)), true))
          {
            IDVariant v_CONT1 = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_IMPEGNATO = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_STANZIAMENTO = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
            v_CONT1 = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1, ");
            SQL.append("  SUM(A.SALDO_INI + A.VARIAZIONI) as SUESSAINESVA, ");
            SQL.append("  MAX(B.STN_INI_CO) as MAXBPRSTINCO, ");
            SQL.append("  A.CAPITOLO as ESEIMPCAPITO, ");
            SQL.append("  A.ARTICOLO as ESEIMPARTICO ");
            SQL.append("from ");
            SQL.append("  ESEIMP A, ");
            SQL.append("  BPR B ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.E_S = 'S') ");
            SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
            SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
            SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("group by ");
            SQL.append("  A.CAPITOLO, ");
            SQL.append("  A.ARTICOLO ");
            SQL.append("having (SUM(A.SALDO_INI + A.VARIAZIONI) > MAX(B.STN_INI_CO)) ");
            SQL.append("order by ");
            SQL.append("  A.CAPITOLO, ");
            SQL.append("  A.ARTICOLO ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONT1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
              v_IMPEGNATO = QV.Get("SUESSAINESVA", IDVariant.DECIMAL) ;
              v_STANZIAMENTO = QV.Get("MAXBPRSTINCO", IDVariant.DECIMAL) ;
              v_CAPITOLO = QV.Get("ESEIMPCAPITO", IDVariant.DECIMAL) ;
              v_ARTICOLO = QV.Get("ESEIMPARTICO", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONT1.compareTo((new IDVariant(0)), true)>0)
            {
              ApriElenco();
            }
            else
            {
              MainFrm.Cf4armDBObject.BeginTrans();
              MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                MainFrm.Cf4armDBObject.RollbackTrans();
              }
              else
              {
                IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
                v_FINALMESSAGE = (new IDVariant("Passaggio Bilancio Simulato su Effettivo", IDVariant.STRING));
                MainFrm.Cf4armDBObject.CommitTrans();
                v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
                MainFrm.set_AlertMessage(v_FINALMESSAGE); 
                MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
              }
            }
          }
          else
          {
            MainFrm.Cf4armDBObject.BeginTrans();
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              MainFrm.Cf4armDBObject.RollbackTrans();
            }
            else
            {
              IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
              v_FINALMESSAGE = (new IDVariant("Passaggio Bilancio Simulato su Effettivo", IDVariant.STRING));
              MainFrm.Cf4armDBObject.CommitTrans();
              v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
              MainFrm.set_AlertMessage(v_FINALMESSAGE); 
              MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
            }
          }
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILULTIMOCHIUSO(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASUBIEFSI, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo Impegni/Acc.ti Ultimo Esercizio Chiuso", IDVariant.STRING));
          MainFrm.Cf4armDBObject.CommitTrans();
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILPREVISIONE(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASUBIEFS1, 0), (new IDVariant(0)));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo Previsione Definitiva Esercizio Precedente", IDVariant.STRING));
          MainFrm.Cf4armDBObject.CommitTrans();
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILPREVISIONE(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASUBIEFS2, 0), (new IDVariant(1)));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo Stanziamento Iniziale ", IDVariant.STRING));
          MainFrm.Cf4armDBObject.CommitTrans();
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_RIF = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ESERCIZIO_RIF_PL as T99ESERRIFPL ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_RIF = QV.Get("T99ESERRIFPL", IDVariant.INTEGER) ;
        }
        QV.Close();
        MainFrm.Cf4armDBObject.BeginTrans();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILRICALCOLOPLURIENNALE(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASUBIEFS3, 0), v_RIF, IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASUBIEFS4, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo Stanziamento su Bilancio Pluriennale", IDVariant.STRING));
          MainFrm.Cf4armDBObject.CommitTrans();
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_DDATARESIDUI = new IDVariant(0,IDVariant.DATETIME);
        if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAREPRRE3A, 0).equals((new IDVariant(1)), true))
        {
          v_DDATARESIDUI = IDL.ToDate(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), (new IDVariant(12)), (new IDVariant(31)));
        }
        else
        {
          v_DDATARESIDUI = (new IDVariant());
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CALCOLARESPRES(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAREPREFSI, 0).equals((new IDVariant(0))))?(new IDVariant("BIL")):(new IDVariant("BPR"))), IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAREPRPAES, 0), v_DDATARESIDUI, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo Residui Presunti", IDVariant.STRING));
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CALCOLACASSA(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASTCAPAES, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONASTCASBES, 0).equals((new IDVariant(0))))?(new IDVariant("BIL")):(new IDVariant("BPR"))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo Stanziamento di Cassa (Residui Presunti + Competenze) ", IDVariant.STRING));
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CALCOLAGIAIMP(IMDB.Value(IMDBDef3.TBL_PARAMETRI458, IMDBDef3.FLD_PARAMETRI458_ROWNAMEESEIN, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAGIIMSBES, 0).equals((new IDVariant(0))))?(new IDVariant("BIL")):(new IDVariant("BPR"))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_FINALMESSAGE = new IDVariant(0,IDVariant.STRING);
          v_FINALMESSAGE = (new IDVariant("Ricalcolo gi‡ Impegnato (impegni pluriennali presi nell'esercizio precedente)", IDVariant.STRING));
          v_FINALMESSAGE = IDL.Add(IDL.Add(v_FINALMESSAGE, (new IDVariant("<BR/>"))), v_ENDMESSAGE);
          MainFrm.set_AlertMessage(v_FINALMESSAGE); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "OKProcedura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Nuovi Campi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DisabilitaNuoviCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Nuovi Campi Body
      // Corpo Procedura
      // 
      PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_AGGIAUTOBILA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "DisabilitaNuoviCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Tutto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DisabilitaTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Tutto Body
      // Corpo Procedura
      // 
      PASSADAPLURI = (new IDVariant(0));
      RICALCIMPEGN = (new IDVariant(0));
      PASSAGBILANC = (new IDVariant(0));
      RICALCPREVIS = (new IDVariant(0));
      RICASTANINIZ = (new IDVariant(0));
      RICASTASUBIL = (new IDVariant(0));
      // 
      // nuovi campi
      // 
      RICARESIPRES = (new IDVariant(0));
      RICASTANCASS = (new IDVariant(0));
      RICALGIAIMPE = (new IDVariant(0));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPADPABDE, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONAPABISISE, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIIATUEC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARIPRDEEP, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTIN, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_RONARISTSUBP, 0, (new IDVariant(0)));
      // 
      // nuovi campi
      // 
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIREPR, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRISTCA, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT4, IMDBDef11.PQSL_OUT4_ROWNAMRIGIIM, 0, (new IDVariant(0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoBilancio", "DisabilitaTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void AGGIAUTOBILA_OUT4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT4_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT7, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT7, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT4_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT4_RS, 0, IMDBDef3.TBL_OUT7, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 0, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAIMACULEC, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 1, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPRDEESPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 2, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMSTAINI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 3, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMEIMPEG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 4, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAAGBIDRPF, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 5, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPADPABDE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 6, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAPABISISE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 7, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARIIATUEC, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 8, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARIPRDEEP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 9, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRISTIN, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 10, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONARISTSUBP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 11, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFSI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 12, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS1, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 13, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS2, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 14, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS3, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 15, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASUBIEFS4, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 16, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRIREPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 17, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAREPREFSI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 18, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAREPRPAES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 19, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAREPRRE3A, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 20, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRISTCA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 21, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASTCASBES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 22, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONASTCAPAES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 23, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_ROWNAMRIGIIM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT4_RS, 24, 0, IMDBDef3.TBL_OUT7, IMDBDef3.FLD_OUT7_RONAGIIMSBES, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT7, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT7, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT7, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT4_RS, 0);
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
  private void PAN_AGGIAUTOBILA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AGGIAUTOBILA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AGGIAUTOBILA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AGGIAUTOBILA, Cancel);
    // Stub
  }

  private void PAN_AGGIAUTOBILA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_AGGIAUTOBILA_OK)
    {
      this.IdxPanelActived = this.PAN_AGGIAUTOBILA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OKProcedura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIAUTOBILA_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_AGGIAUTOBILA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProcedura();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_AGGIAUTOBILA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_PADAPLABIDIE)
      {
        PFL_AGGIAUTOBILA_PADAPLABIDIE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_PASBILSISUEF)
      {
        PFL_AGGIAUTOBILA_PASBILSISUEF_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RIIMACTIULEC)
      {
        PFL_AGGIAUTOBILA_RIIMACTIULEC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RICPREDEESPR)
      {
        PFL_AGGIAUTOBILA_RICPREDEESPR_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RICASTANINIZ)
      {
        PFL_AGGIAUTOBILA_RICASTANINIZ_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RICSTASUBIPL)
      {
        PFL_AGGIAUTOBILA_RICSTASUBIPL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RICARESIPRES)
      {
        PFL_AGGIAUTOBILA_RICARESIPRES_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RICASTANCASS)
      {
        PFL_AGGIAUTOBILA_RICASTANCASS_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_AGGIAUTOBILA_RICALGIAIMPE)
      {
        PFL_AGGIAUTOBILA_RICALGIAIMPE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_AGGIAUTOBILA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AGGIAUTOBILA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_AGGIAUTOBILA_Init()
  {

    PAN_AGGIAUTOBILA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AGGIAUTOBILA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, "FC023CE2-AB65-454F-AF83-88B36C724D8C");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, "Aggiornamento da");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, MyGlb.VIS_GROUPSTYLE);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, MyGlb.PANEL_LIST, 0, -9999, 912, 16, 0, 0);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, MyGlb.PANEL_FORM, 8, 11, 428, 467, 0, 0);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, 0, 105);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, 1, 13);
    PAN_AGGIAUTOBILA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, 0, 4);
    PAN_AGGIAUTOBILA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, 1, 4);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_GROUP, GRP_AGGIAUTOBILA_AGGIORNAMEDA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_AGGIAUTOBILA.SetSize(MyGlb.OBJ_FIELD, 30);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, "A3403B81-61FE-44B8-B3C8-C9F50A926921");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, "Passaggio Da Pluriennale A Bilancio Di Esercizio ");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_VERTICAL | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, "AB67AD09-47F4-449A-A500-240C25575FB1");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, "Passaggio Bilancio Simulato Su Effettivo");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, "4C827F2D-0466-434F-A214-F4EEB96C81E9");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, "Residui Presunti");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, "888626CA-9568-4684-AD85-2C366C84741B");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, "Previsione Definitiva Esercizio Precedente");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, "7F132DB3-0A6A-40C9-96EE-698639A4E225");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, "Stanziamento Competenza e Reiscrirzioni");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, "741847E7-0CFF-4A4F-BDF8-52247EC644B4");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, "Gi‡ Impegnato");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, "9189FC1C-37EB-484A-A763-80EF71B43935");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, "Aggiornamento Bilancio di Riferimento per Finanziamenti");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, "3322A04C-B48B-49F0-8012-69B3BF19F42F");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, "Ricalcolo Impegni Acc Ti Ultimo Esercizio Chiuso");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, "60CCFAD2-E2C2-42E5-AA32-5A9E120511EB");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, "Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, "84095968-1506-44CC-8FC2-C2F6B2F47206");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, "Ricalcolo Previsione Definitiva Esercizio Precedente");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, "D43E7554-B012-4DEB-BA11-C680C417159C");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, "Su Bilancio Effettivo Simulato 1");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, "9250B06F-AACA-4686-B699-55897701D9FB");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, "Ricalcolo Stanziamento Iniziale");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, "382BADA3-2697-4C18-B771-158AAB98B803");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, "Su Bilancio Effettivo Simulato 2");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, "1204D381-2C83-47D0-80A1-1EAD03FD4C15");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, "Ricalcolo Stanziamento Su Bilancio Pluriennale");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, "F6165A61-C694-4307-8035-A1EC03D13DA0");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, "Su Bilancio Effettivo Simulato 3");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, "B48FFAC4-B8DC-48DD-8F10-A93616D1C949");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, "Su Bilancio Effettivo Simulato 4");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, "C6A510CC-C8F7-4BD6-8C9A-01F28C7DBA9E");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.VIS_SFONEBORDTRA);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, "2A087C92-3B79-483B-BE31-9C6658720B2B");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, "Stanziamento di Cassa");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, "3FAC9D48-9A67-4F08-AC55-DC84B6E3C999");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, "Ricalcolo Residui Presunti");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, "2415C8D1-E208-4C7B-B4FA-0CA1BD7F3238");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, "Res Pres Effettivo Simulato");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, "DBE05D9D-F967-47A9-BACD-849CA8C51228");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, "Res Pres Parte Entrata Spesa");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, "FB283CA4-7A20-4401-A895-4D9A9AE02057");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, "Res Pres Residui 3112 Attuali");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, "46F23600-02D6-4914-A8C9-5E47F7AECB51");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, "Ricalcolo Stanziamento Cassa ");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, "8E723B6F-3C52-4AF5-9610-599684E46758");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, "Stanz Cas Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, "Descrivi il contenuto del campo");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, "03279723-266A-4FAF-804B-09049EEBD6D5");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, "Stanz Cas Parte Entrata Spesa");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, "413C7631-6A13-4672-AE84-87C5BC154DB9");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, "Ricalcolo Gia Impegnato");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, "C7134839-1DD3-4DC0-B1A4-C626E49D653D");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, "Gia Imp Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, "");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, "7E95D6EB-B838-4A8D-B07A-AACDD0B08059");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, "OK");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.VIS_STATICBUTTON);
    PAN_AGGIAUTOBILA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, 0, "button1.gif", false);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, "58A6334F-035E-4B1D-BBCD-A5EF2AAEE2E0");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, "Annulla");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_AGGIAUTOBILA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, 0, "button1.gif", false);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIAUTOBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, "EDDED43D-A438-4C67-850A-641F446A3153");
    PAN_AGGIAUTOBILA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, "2009");
    PAN_AGGIAUTOBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.VIS_VUONORTESPIC);
    PAN_AGGIAUTOBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, 0, -1);
  }

  private void PAN_AGGIAUTOBILA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_LIST, 56);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_LIST, "P. D. P. A B. D. E.");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_FORM, 12, 36, 244, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_FORM, 72);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PADAPLABIDIE, MyGlb.PANEL_FORM, "P. D. P. A B. D. E.");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_PADAPLABIDIE, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_PADAPLABIDIE, PPQRY_OUT4, "A.RONAPADPABDE", "RONAPADPABDE", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_PADAPLABIDIE, (new IDVariant(1)), "Passaggio da Pluriennale a Bilancio di Esercizio", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_PADAPLABIDIE, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_LIST, 0, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_LIST, 200);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_LIST, "Pass. Bilan. Simulato Su Effettivo");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_FORM, 12, 64, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_FORM, 200);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PASBILSISUEF, MyGlb.PANEL_FORM, "Pass. Bilan. Simulato Su Effettivo");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_PASBILSISUEF, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_PASBILSISUEF, PPQRY_OUT4, "A.RONAPABISISE", "RONAPABISISE", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_PASBILSISUEF, (new IDVariant(1)), "Passaggio Bilancio Simulato su Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_PASBILSISUEF, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_LIST, 80, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_LIST, 180);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_LIST, "Residui Presunti");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_FORM, 92, 88, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_FORM, 264);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESIDUPRESUN, MyGlb.PANEL_FORM, "Residui Presunti");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RESIDUPRESUN, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RESIDUPRESUN, PPQRY_OUT4, "A.RONAIMACULEC", "RONAIMACULEC", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESIDUPRESUN, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESIDUPRESUN, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_LIST, 260, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_LIST, 208);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_LIST, "Previs. Defin. Esercizio Precedente");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_FORM, 92, 116, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_FORM, 264);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_PREDEFESEPRE, MyGlb.PANEL_FORM, "Previsione Definitiva Esercizio Precedente");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_PREDEFESEPRE, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_PREDEFESEPRE, PPQRY_OUT4, "A.RONAPRDEESPR", "RONAPRDEESPR", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_PREDEFESEPRE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_PREDEFESEPRE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_LIST, 468, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_LIST, 112);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_LIST, "Stan. Cmp. e Reisc.");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_FORM, 92, 140, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_FORM, 264);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANCOMPEREI, MyGlb.PANEL_FORM, "Stanziamento Competenza e Reiscrirzioni");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_STANCOMPEREI, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_STANCOMPEREI, PPQRY_OUT4, "A.ROWNAMSTAINI", "ROWNAMSTAINI", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STANCOMPEREI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STANCOMPEREI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_LIST, 580, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_LIST, 68);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Gi‡ Impeg.");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_FORM, 92, 164, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_FORM, 264);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Gi‡ Impegnato");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_GIAIMPEGNATO, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_GIAIMPEGNATO, PPQRY_OUT4, "A.ROWNAMEIMPEG", "ROWNAMEIMPEG", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_GIAIMPEGNATO, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_GIAIMPEGNATO, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_LIST, 648, 36, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_LIST, 264);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_LIST, "Aggiorn. Bilan. di Rifer. per Finanziamenti");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_FORM, 16, 212, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_FORM, 340);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_AGBIDIRIPEFI, MyGlb.PANEL_FORM, "Aggiornamento Bilancio di Riferimento per Finanziamenti");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_AGBIDIRIPEFI, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_AGBIDIRIPEFI, PPQRY_OUT4, "A.RONAAGBIDRPF", "RONAAGBIDRPF", 5, 2, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_AGBIDIRIPEFI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_AGBIDIRIPEFI, (new IDVariant()), "Null", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_LIST, 0, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_LIST, 232);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_LIST, "Rical. Imp. Acc Ti Ult. Esercizio Chiuso");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_FORM, 16, 488, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_FORM, 232);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RIIMACTIULEC, MyGlb.PANEL_FORM, "Rical. Imp. Acc Ti Ult. Esercizio Chiuso");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RIIMACTIULEC, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RIIMACTIULEC, PPQRY_OUT4, "A.RONARIIATUEC", "RONARIIATUEC", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RIIMACTIULEC, (new IDVariant(1)), "Ricalcolo Impegni/Acc.ti Ultimo Esercizio Chiuso", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RIIMACTIULEC, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_LIST, 148);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_LIST, "Su Bilan. Effet. Simulato");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_FORM, 28, 512, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_FORM, 148);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILAEFFSIM, MyGlb.PANEL_FORM, "Su Bilan. Effet. Simulato");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_SUBILAEFFSIM, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_SUBILAEFFSIM, PPQRY_OUT4, "A.RONASUBIEFSI", "RONASUBIEFSI", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILAEFFSIM, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILAEFFSIM, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.set_Alignment(PFL_AGGIAUTOBILA_SUBILAEFFSIM, 5);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_LIST, 0, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_LIST, 252);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_LIST, "Rical. Previs. Defin. Esercizio Precedente");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_FORM, 12, 544, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_FORM, 252);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICPREDEESPR, MyGlb.PANEL_FORM, "Rical. Previs. Defin. Esercizio Precedente");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RICPREDEESPR, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RICPREDEESPR, PPQRY_OUT4, "A.RONARIPRDEEP", "RONARIPRDEEP", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICPREDEESPR, (new IDVariant(1)), "Ricalcolo Previsione Definitiva Esercizio Precedente", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICPREDEESPR, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_LIST, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_LIST, "Su Bilan. Effet. Simulato 1");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_FORM, 28, 568, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_FORM, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM1, MyGlb.PANEL_FORM, "Su Bilan. Effet. Simulato 1");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_SUBILEFFSIM1, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_SUBILEFFSIM1, PPQRY_OUT4, "A.RONASUBIEFS1", "RONASUBIEFS1", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM1, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM1, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_LIST, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_LIST, "Rical. Stanziam. Iniziale");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_FORM, 12, 596, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_FORM, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANINIZ, MyGlb.PANEL_FORM, "Rical. Stanziam. Iniziale");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RICASTANINIZ, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RICASTANINIZ, PPQRY_OUT4, "A.ROWNAMRISTIN", "ROWNAMRISTIN", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICASTANINIZ, (new IDVariant(1)), "Ricalcolo Stanziamento Iniziale", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICASTANINIZ, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_LIST, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_LIST, "Su Bilan. Effet. Simulato 2");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_FORM, 28, 620, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_FORM, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM2, MyGlb.PANEL_FORM, "Su Bilan. Effet. Simulato 2");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_SUBILEFFSIM2, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_SUBILEFFSIM2, PPQRY_OUT4, "A.RONASUBIEFS2", "RONASUBIEFS2", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM2, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM2, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_LIST, 0, 36, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_LIST, 228);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_LIST, "Rical. Stanziam. Su Bilancio Pluriennale");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_FORM, 12, 646, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_FORM, 228);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICSTASUBIPL, MyGlb.PANEL_FORM, "Rical. Stanziam. Su Bilancio Pluriennale");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RICSTASUBIPL, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RICSTASUBIPL, PPQRY_OUT4, "A.RONARISTSUBP", "RONARISTSUBP", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICSTASUBIPL, (new IDVariant(1)), "Ricalcolo Stanziamento su Bilancio Pluriennale", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICSTASUBIPL, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_LIST, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_LIST, "Su Bilan. Effet. Simulato 3");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_FORM, 28, 664, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_FORM, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM3, MyGlb.PANEL_FORM, "Su Bilan. Effet. Simulato 3");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_SUBILEFFSIM3, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_SUBILEFFSIM3, PPQRY_OUT4, "A.RONASUBIEFS3", "RONASUBIEFS3", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM3, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM3, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_LIST, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_LIST, "Su Bilan. Effet. Simulato 4");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_FORM, 28, 692, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_FORM, 156);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_SUBILEFFSIM4, MyGlb.PANEL_FORM, "Su Bilan. Effet. Simulato 4");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_SUBILEFFSIM4, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_SUBILEFFSIM4, PPQRY_OUT4, "A.RONASUBIEFS4", "RONASUBIEFS4", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM4, (new IDVariant(0)), "da Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_SUBILEFFSIM4, (new IDVariant(1)), "da Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.PANEL_LIST, 308, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.PANEL_FORM, 420, 396, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_FAKE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_FAKE, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_FAKE, -1, "", "FAKE", 0, 0, 0, -13997);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_LIST, 588, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_LIST, 68);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_LIST, "Stn. di Cas.");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_FORM, 92, 188, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_FORM, 264);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STANZDICASSA, MyGlb.PANEL_FORM, "Stanziamento di Cassa");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_STANZDICASSA, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_STANZDICASSA, PPQRY_OUT4, "A.ROWNAMEIMPEG", "ROWNAMEIMPEG", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STANZDICASSA, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STANZDICASSA, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_LIST, 152);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_LIST, "Ricalcolo Residui Presunti");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_FORM, 16, 252, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_FORM, 152);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICARESIPRES, MyGlb.PANEL_FORM, "Ricalcolo Residui Presunti");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RICARESIPRES, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RICARESIPRES, PPQRY_OUT4, "A.ROWNAMRIREPR", "ROWNAMRIREPR", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICARESIPRES, (new IDVariant(1)), "Ricalcolo Residui Presunti", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICARESIPRES, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_LIST, 164);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_LIST, "Res Pres Effettivo Simulato");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_FORM, 32, 276, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_FORM, 164);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREEFFSIM, MyGlb.PANEL_FORM, "Res Pres Effettivo Simulato");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RESPREEFFSIM, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RESPREEFFSIM, PPQRY_OUT4, "A.RONAREPREFSI", "RONAREPREFSI", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESPREEFFSIM, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESPREEFFSIM, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_LIST, 176);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_LIST, "Res Pres Parte Entrata Spesa");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_FORM, 32, 300, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_FORM, 176);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPREPAENSP, MyGlb.PANEL_FORM, "Res Pres Parte Entrata Spesa");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RESPREPAENSP, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RESPREPAENSP, PPQRY_OUT4, "A.RONAREPRPAES", "RONAREPRPAES", 5, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESPREPAENSP, (new IDVariant("E")), "Parte Entrata", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESPREPAENSP, (new IDVariant("S")), "Parte Spesa", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_LIST, 0, 36, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_LIST, 176);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_LIST, "Res Pres Residui 3112 Attuali");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_FORM, 32, 324, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_FORM, 176);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RESPRERE31AT, MyGlb.PANEL_FORM, "Res Pres Residui 3112 Attuali");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RESPRERE31AT, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RESPRERE31AT, PPQRY_OUT4, "A.RONAREPRRE3A", "RONAREPRRE3A", 1, 52, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESPRERE31AT, (new IDVariant(1)), "Residui al 31/12", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RESPRERE31AT, (new IDVariant(0)), "Residui Attuali", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_LIST, 176);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_LIST, "Ricalcolo Stanziamento Cassa ");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_FORM, 12, 346, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_FORM, 176);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICASTANCASS, MyGlb.PANEL_FORM, "Ricalcolo Stanziamento Cassa ");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RICASTANCASS, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RICASTANCASS, PPQRY_OUT4, "A.ROWNAMRISTCA", "ROWNAMRISTCA", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICASTANCASS, (new IDVariant(1)), "Ricalcolo Stanziamento Cassa( Residui Presunti + Competenze)", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICASTANCASS, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_LIST, 0, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_LIST, 232);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_LIST, "Stanz Cas Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_FORM, 32, 374, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_FORM, 232);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STCASUBIEFSI, MyGlb.PANEL_FORM, "Stanz Cas Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_STCASUBIEFSI, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_STCASUBIEFSI, PPQRY_OUT4, "A.RONASTCASBES", "RONASTCASBES", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STCASUBIEFSI, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STCASUBIEFSI, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_LIST, 180);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_LIST, "Stanz Cas Parte Entrata Spesa");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_FORM, 32, 398, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_FORM, 180);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_STACASPAENSP, MyGlb.PANEL_FORM, "Stanz Cas Parte Entrata Spesa");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_STACASPAENSP, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_STACASPAENSP, PPQRY_OUT4, "A.RONASTCAPAES", "RONASTCAPAES", 5, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STACASPAENSP, (new IDVariant("E")), "Parte Entrata", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_STACASPAENSP, (new IDVariant("S")), "Parte Spesa", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_LIST, 148);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_LIST, "Ricalcolo Gia Impegnato");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_FORM, 12, 430, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_FORM, 148);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_RICALGIAIMPE, MyGlb.PANEL_FORM, "Ricalcolo Gia Impegnato");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_RICALGIAIMPE, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_RICALGIAIMPE, PPQRY_OUT4, "A.ROWNAMRIGIIM", "ROWNAMRIGIIM", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICALGIAIMPE, (new IDVariant(1)), "Ricalcolo Gi‡ impegnato (impegni pluriennali presi nellíesercizio precedente)", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_RICALGIAIMPE, (new IDVariant(0)), "fake", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_LIST, 0, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_LIST, 220);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_LIST, "Gia Imp Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_FORM, 32, 454, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_FORM, 220);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_GIIMSUBIEFSI, MyGlb.PANEL_FORM, "Gia Imp Su Bilancio Effettivo Simulato");
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_GIIMSUBIEFSI, -1, GRP_AGGIAUTOBILA_AGGIORNAMEDA);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_GIIMSUBIEFSI, PPQRY_OUT4, "A.RONAGIIMSBES", "RONAGIIMSBES", 1, 1, 0, -13997);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_GIIMSUBIEFSI, (new IDVariant(0)), "su Bilancio Effettivo", "", "", -1);
    PAN_AGGIAUTOBILA.SetValueListItem(PFL_AGGIAUTOBILA_GIIMSUBIEFSI, (new IDVariant(1)), "su Bilancio Simulato", "", "", -1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.PANEL_LIST, 160, 276, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.PANEL_FORM, 260, 504, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_OK, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_OK, -1, -1);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.PANEL_LIST, 168, 284, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.PANEL_FORM, 348, 504, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_ANNULLA, -1, -1);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.PANEL_LIST, 276, 248, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOBILA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.PANEL_FORM, 264, 488, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOBILA_LABELESERCIZ, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOBILA.SetFieldPage(PFL_AGGIAUTOBILA_LABELESERCIZ, -1, -1);
    PAN_AGGIAUTOBILA.SetFieldPanel(PFL_AGGIAUTOBILA_LABELESERCIZ, -1, "", "LABELESERCIZ", 0, 0, 0, -13997);
  }

  private void PAN_AGGIAUTOBILA_InitQueries()
  {
    StringBuffer SQL;

    PAN_AGGIAUTOBILA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_AGGIAUTOBILA.SetIMDB(IMDB, "PQRY_OUT4", true);
    PAN_AGGIAUTOBILA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_AGGIAUTOBILA.SetQueryIMDB(PPQRY_OUT4, IMDBDef11.PQRY_OUT4_RS, IMDBDef3.TBL_OUT7);
    JustLoaded = true;
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_PADAPLABIDIE, IMDBDef3.FLD_OUT7_RONAPADPABDE);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_PASBILSISUEF, IMDBDef3.FLD_OUT7_RONAPABISISE);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RESIDUPRESUN, IMDBDef3.FLD_OUT7_RONAIMACULEC);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_PREDEFESEPRE, IMDBDef3.FLD_OUT7_RONAPRDEESPR);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_STANCOMPEREI, IMDBDef3.FLD_OUT7_ROWNAMSTAINI);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_GIAIMPEGNATO, IMDBDef3.FLD_OUT7_ROWNAMEIMPEG);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_AGBIDIRIPEFI, IMDBDef3.FLD_OUT7_RONAAGBIDRPF);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RIIMACTIULEC, IMDBDef3.FLD_OUT7_RONARIIATUEC);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_SUBILAEFFSIM, IMDBDef3.FLD_OUT7_RONASUBIEFSI);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RICPREDEESPR, IMDBDef3.FLD_OUT7_RONARIPRDEEP);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_SUBILEFFSIM1, IMDBDef3.FLD_OUT7_RONASUBIEFS1);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RICASTANINIZ, IMDBDef3.FLD_OUT7_ROWNAMRISTIN);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_SUBILEFFSIM2, IMDBDef3.FLD_OUT7_RONASUBIEFS2);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RICSTASUBIPL, IMDBDef3.FLD_OUT7_RONARISTSUBP);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_SUBILEFFSIM3, IMDBDef3.FLD_OUT7_RONASUBIEFS3);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_SUBILEFFSIM4, IMDBDef3.FLD_OUT7_RONASUBIEFS4);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_STANZDICASSA, IMDBDef3.FLD_OUT7_ROWNAMEIMPEG);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RICARESIPRES, IMDBDef3.FLD_OUT7_ROWNAMRIREPR);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RESPREEFFSIM, IMDBDef3.FLD_OUT7_RONAREPREFSI);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RESPREPAENSP, IMDBDef3.FLD_OUT7_RONAREPRPAES);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RESPRERE31AT, IMDBDef3.FLD_OUT7_RONAREPRRE3A);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RICASTANCASS, IMDBDef3.FLD_OUT7_ROWNAMRISTCA);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_STCASUBIEFSI, IMDBDef3.FLD_OUT7_RONASTCASBES);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_STACASPAENSP, IMDBDef3.FLD_OUT7_RONASTCAPAES);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_RICALGIAIMPE, IMDBDef3.FLD_OUT7_ROWNAMRIGIIM);
    PAN_AGGIAUTOBILA.SetFieldPrimaryIndex(PFL_AGGIAUTOBILA_GIIMSUBIEFSI, IMDBDef3.FLD_OUT7_RONAGIIMSBES);
    PAN_AGGIAUTOBILA.SetMasterTable(0, "OUT7");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_AGGIAUTOBILA.Status() == 2)
    {
      int oldListQBE = PAN_AGGIAUTOBILA.iUseListQBE;
      PAN_AGGIAUTOBILA.iUseListQBE = 0;
      PAN_AGGIAUTOBILA.PanelCommand(Glb.PCM_SEARCH);
      PAN_AGGIAUTOBILA.PanelCommand(Glb.PCM_FIND);
      PAN_AGGIAUTOBILA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_AGGIAUTOBILA) PAN_AGGIAUTOBILA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIAUTOBILA) PAN_AGGIAUTOBILA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_AGGIAUTOBILA) PAN_AGGIAUTOBILA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIAUTOBILA) PAN_AGGIAUTOBILA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_AGGIAUTOBILA) PAN_AGGIAUTOBILA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
