// **********************************************
// Estrazione Dati Per Controllo I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioneDatiPerControlloIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ESERCIZIO = 0;
  private static int PFL_PARAMETRI_TIPOVISTMESE = 1;
  private static int PFL_PARAMETRI_PERIODO1 = 2;
  private static int PFL_PARAMETRI_PERIODO = 3;
  private static int PFL_PARAMETRI_CODICE1 = 4;
  private static int PFL_PARAMETRI_BENEFIDEBITO = 5;
  private static int PFL_PARAMETRI_SELEZISOGGET = 6;
  private static int PFL_PARAMETRI_TIPOREGISTRO = 7;
  private static int PFL_PARAMETRI_ATTIVITA = 8;
  private static int PFL_PARAMETRI_ETICHETTROVA = 9;

  private static int PPQRY_PARAMETRI238 = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_ESTDATPECOIV_RAGIONSOCIAL = 0;
  private static int PFL_ESTDATPECOIV_CODICE = 1;
  private static int PFL_ESTDATPECOIV_NUMERODOC = 2;
  private static int PFL_ESTDATPECOIV_DATADOC = 3;
  private static int PFL_ESTDATPECOIV_DESCRDOC = 4;
  private static int PFL_ESTDATPECOIV_BOLLATO = 5;
  private static int PFL_ESTDATPECOIV_DESCRBOLLATO = 6;
  private static int PFL_ESTDATPECOIV_IST = 7;
  private static int PFL_ESTDATPECOIV_NUMEROREG = 8;
  private static int PFL_ESTDATPECOIV_DATAREG = 9;
  private static int PFL_ESTDATPECOIV_IMPONIBILE = 10;
  private static int PFL_ESTDATPECOIV_IVA = 11;
  private static int PFL_ESTDATPECOIV_PERC = 12;
  private static int PFL_ESTDATPECOIV_ESENZIONE = 13;
  private static int PFL_ESTDATPECOIV_INDEDUC = 14;
  private static int PFL_ESTDATPECOIV_SPRC = 15;
  private static int PFL_ESTDATPECOIV_PRORATA = 16;
  private static int PFL_ESTDATPECOIV_CREDITO = 17;
  private static int PFL_ESTDATPECOIV_DEBITO = 18;
  private static int PFL_ESTDATPECOIV_DIFFERENZA = 19;
  private static int PFL_ESTDATPECOIV_ATTIVITATRIM = 20;

  private static int PPQRY_TABELLA = 0;


  IDPanel PAN_ESTDATPECOIV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI536(IMDB);
    Init_TBL_ESTDATPECOIV(IMDB);
    //
    //
    Init_PQRY_PARAMETRI238(IMDB);
    Init_PQRY_PARAMETRI238_RS(IMDB);
    Init_PQRY_TABELLA(IMDB);
    Init_PQRY_TABELLA_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI536(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI536, 9);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI536, "TBL_PARAMETRI536");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMTIVIME, "ROWNAMTIVIME");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMTIVIME,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMPERMES, "ROWNAMPERMES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMPERMES,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMPERTRI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMECODIC,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMTIPREG,1,9,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI536,IMDBDef2.FLD_PARAMETRI536_ROWNAMEATTIV,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI536, 0);
  }

  private static void Init_TBL_ESTDATPECOIV(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_ESTDATPECOIV, 21);
    IMDB.set_TblCode(IMDBDef2.TBL_ESTDATPECOIV, "TBL_ESTDATPECOIV");
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGRAGSOC, "NOMOGGRAGSOC");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGRAGSOC,5,255,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECODI,1,9,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMDOC, "NOMOGGNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMDOC,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATDOC, "NOMOGGDATDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATDOC,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESDOC, "NOMOGGDESDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESDOC,5,255,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEBOLL,1,9,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESBOL, "NOMOGGDESBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESBOL,5,255,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIST, "NOMEOGGETIST");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIST,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMREG, "NOMOGGNUMREG");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATREG,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIVA, "NOMEOGGETIVA");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIVA,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPERC, "NOMEOGGEPERC");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPERC,3,5,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEESEN, "NOMEOGGEESEN");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEESEN,5,255,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEINDE, "NOMEOGGEINDE");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEINDE,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGESPRC, "NOMEOGGESPRC");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGESPRC,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPROR, "NOMEOGGEPROR");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPROR,3,5,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECRED, "NOMEOGGECRED");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECRED,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDEBI, "NOMEOGGEDEBI");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDEBI,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDIFF, "NOMEOGGEDIFF");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDIFF,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGATTTRI, "NOMOGGATTTRI");
    IMDB.SetFldParams(IMDBDef2.TBL_ESTDATPECOIV,IMDBDef2.FLD_ESTDATPECOIV_NOMOGGATTTRI,5,2,0);
  }

  private static void Init_PQRY_PARAMETRI238(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI238, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI238, "PQRY_PARAMETRI238");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, "ROWNAMTIVIME");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES, "ROWNAMPERMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERTRI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG,1,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEATTIV,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI238, 0);
  }

  private static void Init_PQRY_PARAMETRI238_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI238_RS, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI238_RS, "PQRY_PARAMETRI238_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, "ROWNAMTIVIME");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES, "ROWNAMPERMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERTRI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG,1,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI238_RS,IMDBDef10.PQSL_PARAMETRI238_ROWNAMEATTIV,5,1,0);
  }

  private static void Init_PQRY_TABELLA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TABELLA, 21);
    IMDB.set_TblCode(IMDBDef10.PQRY_TABELLA, "PQRY_TABELLA");
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGRAGSOC, "NOMOGGRAGSOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGRAGSOC,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGECODI,1,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGNUMDOC, "NOMOGGNUMDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGNUMDOC,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDATDOC, "NOMOGGDATDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDATDOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDESDOC, "NOMOGGDESDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDESDOC,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEBOLL,1,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDESBOL, "NOMOGGDESBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDESBOL,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGETIST, "NOMEOGGETIST");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGETIST,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGNUMREG, "NOMOGGNUMREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGNUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGDATREG,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGETIVA, "NOMEOGGETIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGETIVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEPERC, "NOMEOGGEPERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEPERC,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEESEN, "NOMEOGGEESEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEESEN,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEINDE, "NOMEOGGEINDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEINDE,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGESPRC, "NOMEOGGESPRC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGESPRC,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEPROR, "NOMEOGGEPROR");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEPROR,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGECRED, "NOMEOGGECRED");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGECRED,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEDEBI, "NOMEOGGEDEBI");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEDEBI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEDIFF, "NOMEOGGEDIFF");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMEOGGEDIFF,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGATTTRI, "NOMOGGATTTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA,IMDBDef10.PQSL_TABELLA_NOMOGGATTTRI,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_TABELLA, 0);
  }

  private static void Init_PQRY_TABELLA_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TABELLA_RS, 21);
    IMDB.set_TblCode(IMDBDef10.PQRY_TABELLA_RS, "PQRY_TABELLA_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGRAGSOC, "NOMOGGRAGSOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGRAGSOC,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGECODI,1,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGNUMDOC, "NOMOGGNUMDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGNUMDOC,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDATDOC, "NOMOGGDATDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDATDOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDESDOC, "NOMOGGDESDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDESDOC,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEBOLL,1,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDESBOL, "NOMOGGDESBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDESBOL,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGETIST, "NOMEOGGETIST");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGETIST,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGNUMREG, "NOMOGGNUMREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGNUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGDATREG,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGETIVA, "NOMEOGGETIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGETIVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEPERC, "NOMEOGGEPERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEPERC,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEESEN, "NOMEOGGEESEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEESEN,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEINDE, "NOMEOGGEINDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEINDE,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGESPRC, "NOMEOGGESPRC");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGESPRC,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEPROR, "NOMEOGGEPROR");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEPROR,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGECRED, "NOMEOGGECRED");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGECRED,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEDEBI, "NOMEOGGEDEBI");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEDEBI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEDIFF, "NOMEOGGEDIFF");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMEOGGEDIFF,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGATTTRI, "NOMOGGATTTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_TABELLA_RS,IMDBDef10.PQSL_TABELLA_NOMOGGATTTRI,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioneDatiPerControlloIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioneDatiPerControlloIVA()
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
    FormIdx = MyGlb.FRM_ESTDAPECOIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EF4F5996-B6B2-45A1-B53F-56123D051242";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 566;
    set_Caption(new IDVariant("Estrazione dati per controllo I.V.A."));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 760;
    Frames[1].Height = 540;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.207407;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 760;
    Frames[2].Height = 112;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 760;
    Frames[2].FixedHeight = 112;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 112-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "821BE544-3775-4DB3-967F-6DD9D1F19FCF");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 996, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Height = 428;
    Frames[3].Caption = "Estrazione dati per controllo I.V.A.";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 428;
    PAN_ESTDATPECOIV = new IDPanel(w, this, 3, "PAN_ESTDATPECOIV");
    Frames[3].Content = PAN_ESTDATPECOIV;
    PAN_ESTDATPECOIV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTDATPECOIV.VS = MainFrm.VisualStyleList;
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D1331D9A-5047-47CF-8DB2-98E210C13658");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2216, 356, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTDATPECOIV.InitStatus = 2;
    PAN_ESTDATPECOIV_Init();
    PAN_ESTDATPECOIV_InitFields();
    PAN_ESTDATPECOIV_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI536, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTDAPECOIVA_PARAMETRI238();
      }
      if (IMDB.TblModified(IMDBDef2.TBL_ESTDATPECOIV, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTDAPECOIVA_TABELLA();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_ESTDATPECOIV.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SELEZISOGGET) {
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
    return (obj instanceof EstrazioneDatiPerControlloIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioneDatiPerControlloIVA.class.getName() : (Glb.ClassWithPackage(EstrazioneDatiPerControlloIVA.class) ? EstrazioneDatiPerControlloIVA.class.getName().substring(EstrazioneDatiPerControlloIVA.class.getPackage().getName().length() + 1) : EstrazioneDatiPerControlloIVA.class.getName()));
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIVIME, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERMES, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERTRI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIPREG, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEATTIV, 0, (new IDVariant("I")));
      // RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "LoadEvent", _e);
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
      UNLOADEVENT_ESDAPECOIVDE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIVIME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERMES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERTRI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMECODIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIPREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEATTIV, 0, new IDVariant());
  }

  // **********************************************************************
  // Estrazione Dati Per Controllo Iva: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_ESDAPECOIVDE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_ESTDATPECOIV);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "EndModal", _e);
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
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, 0).equals((new IDVariant(1)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, 0).equals((new IDVariant(2)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG, 0).equals((new IDVariant(4)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTDATPECOIV.SetFlags (Glb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "ParametriOnDynamicPropertiesEvent", _e);
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
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0), (new IDVariant(1)), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0), (new IDVariant(12)), (new IDVariant(31))));
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0, MainFrm.Getdatainiziotrimestre(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERTRI, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0)));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0, MainFrm.Getdatatrimestre(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERTRI, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0)));
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIVIME, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES, 0),(new IDVariant(1))), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES, 0), MainFrm.Finemese(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMPERMES, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEESERC, 0))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Body
      // Corpo Procedura
      // 
      RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "ParametriOnValidateRow", _e);
    }
  }

  // **********************************************************************
  // Parametri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAMETRI_BENEFIDEBITO)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENEFIDEBITO))), IDL.Today(), (new IDVariant("DOC")), (new IDVariant(-1)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "ParametriOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Selezione Soggetti
  // **********************************************************************
  public int SelezioneSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Soggetti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "SelezioneSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrazione Dati Per Controllo Iva On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTDATPECOIV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESTDATPECOIV);
      // 
      // Estrazione Dati Per Controllo Iva On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ESTDATPECOIV.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTDATPECOIV_RAGIONSOCIAL,IMDB.Value(IMDBDef10.PQRY_TABELLA, IMDBDef10.PQSL_TABELLA_NOMOGGRAGSOC, 0).stringValue()); 
      PAN_ESTDATPECOIV.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTDATPECOIV_DESCRDOC,IMDB.Value(IMDBDef10.PQRY_TABELLA, IMDBDef10.PQSL_TABELLA_NOMOGGDESDOC, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "EstrazioneDatiPerControlloIvaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Estrazione Dati Per Controllo Iva After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_ESTDATPECOIV_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione Dati Per Controllo Iva After Find Body
      // Corpo Procedura
      // 
      // RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "EstrazioneDatiPerControlloIvaAfterFind", _e);
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_ESDAPECOIVDE();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as IVAPROGRESSI, ");
      SQL.append("  C.RAGIONE_SOCIALE_ESTESA as BENRAGSOCEST, ");
      SQL.append("  B.CODICE as FATCODICE, ");
      SQL.append("  B.NUMERO_DOC as FATNUMERODOC, ");
      SQL.append("  B.D_DATA_DOC as FATDDATADOC, ");
      SQL.append("  B.DESCRIZIONE as FATDESCRIZIO, ");
      SQL.append("  A.TIPO_REGISTRO as IVATIPOREGIS, ");
      SQL.append("  A.SERVIZIO as IVASERVIZIO, ");
      SQL.append("  A.NUMERO_REG as IVANUMEROREG, ");
      SQL.append("  A.D_DATA_REG as IVADDATAREG, ");
      SQL.append("  DECODE(A.CODICE_DOC, B.CODICE_DOC, A.IMPONIBILE, A.IMPONIBILE * -1) as IVAIMPONIBIL, ");
      SQL.append("  DECODE(A.CODICE_DOC, B.CODICE_DOC, A.IVA, A.IVA * -1) as IVA, ");
      SQL.append("  A.ALIQUOTA as IVAALIQUOTA, ");
      SQL.append("  A.IVA_INDED as IVAINDED, ");
      SQL.append("  A.CODICE_ESENZIONE as IVACODICESEN, ");
      SQL.append("  B.TRATTAMENTO_IVA as FATTRATTAIVA ");
      SQL.append("from ");
      SQL.append("  IVA A, ");
      SQL.append("  FAT B, ");
      SQL.append("  BEN C ");
      SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ANNO_PROG = A.ANNO_PROG) ");
      SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
      SQL.append("and   (NVL(B.CODICE, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMECODIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(B.CODICE, -1))) ");
      SQL.append("and   (C.CODICE = B.CODICE) ");
      SQL.append("and   (((SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.SERVIZIO) = 'SI') AND " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEATTIV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'I') OR ((SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.SERVIZIO) IS NULL) AND " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMEATTIV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'C')) ");
      SQL.append("and   ((A.TIPO_REGISTRO = 1) OR (A.TIPO_REGISTRO = 3)) ");
      SQL.append("and   ((A.D_DATA_REG BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (((A.TIPO_REGISTRO = 1) AND (B.CODICE_DOC IN (1, 2, 5, 7))) OR ((A.TIPO_REGISTRO = 3) AND (B.CODICE_DOC IN (3, 4, 6, 8)))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  D.PROGRESSIVO, ");
      SQL.append("  '', ");
      SQL.append("  0, ");
      SQL.append("  TO_CHAR ( D.NUMERO_REG ), ");
      SQL.append("  E.D_DATA_REG, ");
      SQL.append("  E.DESCRIZIONE, ");
      SQL.append("  D.TIPO_REGISTRO, ");
      SQL.append("  D.TIPO_BOLLATO, ");
      SQL.append("  E.NUMERO_REG, ");
      SQL.append("  E.D_DATA_REG, ");
      SQL.append("  D.IMPONIBILE, ");
      SQL.append("  D.IVA, ");
      SQL.append("  D.ALIQUOTA, ");
      SQL.append("  0, ");
      SQL.append("  D.CODICE_ESENZIONE, ");
      SQL.append("  '' ");
      SQL.append("from ");
      SQL.append("  DCO D, ");
      SQL.append("  TCO E ");
      SQL.append("where (D.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (D.ANNO_REG = E.ANNO_REG) ");
      SQL.append("and   (D.NUMERO_REG = E.NUMERO_REG) ");
      SQL.append("and   (D.TIPO_REGISTRO = E.TIPO_REGISTRO) ");
      SQL.append("and   (D.TIPO_BOLLATO = E.TIPO_BOLLATO) ");
      SQL.append("and   ((E.D_DATA_REG BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("order by 2, 8, 10, 9 ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      C2.setColUnbound(11,true);
      C2.setColUnbound(12,true);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IDVariant v_ATTIVITA = null;
        v_ATTIVITA = (new IDVariant());
        IDVariant v_DESCRBOLL = null;
        v_DESCRBOLL = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ATTIVITA as T04ATTIVITA, ");
        SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T04 A ");
        SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI238, IMDBDef10.PQSL_PARAMETRI238_ROWNAMTIPREG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(C2.Get("IVASERVIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ATTIVITA = QV.Get("T04ATTIVITA", IDVariant.INTEGER) ;
          v_DESCRBOLL = QV.Get("T04DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        IDVariant v_PRORATA = null;
        v_PRORATA = (new IDVariant());
        IDVariant v_IST = new IDVariant(0,IDVariant.STRING);
        IDVariant v_TIPOLIQ = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PRORATA as T09PRORATA, ");
        SQL.append("  A.ISTITUZIONALE as T09ISTITUZIO, ");
        SQL.append("  A.TIPO_LIQUIDAZIONE as T09TIPOLIQUI ");
        SQL.append("from ");
        SQL.append("  T09 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(v_ATTIVITA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PRORATA = QV.Get("T09PRORATA", IDVariant.DECIMAL) ;
          v_IST = QV.Get("T09ISTITUZIO", IDVariant.STRING) ;
          v_TIPOLIQ = QV.Get("T09TIPOLIQUI", IDVariant.STRING) ;
        }
        QV.Close();
        IDVariant v_INDEDUCIBILE = null;
        v_INDEDUCIBILE = (new IDVariant());
        if (C2.Get("IVAINDED").equals((new IDVariant(1)), true))
        {
          v_INDEDUCIBILE = (new IDVariant("SI"));
        }
        IDVariant v_DEBITO = null;
        v_DEBITO = (new IDVariant());
        if (C2.Get("IVATIPOREGIS").equals((new IDVariant(1)), true))
        {
          if (IDL.IsNull(v_IST) || IDL.IsNull(v_INDEDUCIBILE))
          {
            v_DEBITO = new IDVariant(C2.Get("IVA"));
          }
        }
        else
        {
          if (IDL.IsNull(C2.Get("IVACODICESEN")))
          {
            v_DEBITO = new IDVariant(C2.Get("IVA"));
          }
          else
          {
            v_DEBITO = (new IDVariant(0, IDVariant.DECIMAL));
          }
        }
        IDVariant v_CREDITO = new IDVariant(0,IDVariant.DECIMAL);
        if (C2.Get("IVATIPOREGIS").equals((new IDVariant(1)), true))
        {
          v_CREDITO = IDL.Div(IDL.Mul(C2.Get("IVA"), v_PRORATA), (new IDVariant(100)));
        }
        IDVariant v_DESCRESENZ = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as T06DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T06 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(C2.Get("IVACODICESEN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRESENZ = QV.Get("T06DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        RIEMPIIMDB_ESDAPECOIVII(C2.Get("BENRAGSOCEST"), C2.Get("FATCODICE"), C2.Get("FATNUMERODOC"), C2.Get("FATDDATADOC"), C2.Get("FATDESCRIZIO"), C2.Get("IVASERVIZIO"), v_DESCRBOLL, v_IST, C2.Get("IVANUMEROREG"), C2.Get("IVADDATAREG"), C2.Get("FATTRATTAIVA"), C2.Get("IVAIMPONIBIL"), C2.Get("IVA"), C2.Get("IVAALIQUOTA"), v_DESCRESENZ, v_INDEDUCIBILE, v_PRORATA, v_CREDITO, v_DEBITO, v_TIPOLIQ);
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerControlloIVA", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrazione Dati Per Controllo Iva: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_ESDAPECOIVDE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_ESTDATPECOIV);
  }

  // **********************************************************************
  // Estrazione Dati Per Controllo Iva: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void RIEMPIIMDB_ESDAPECOIVII(IDVariant C2_BENRAGSOCEST, IDVariant C2_FATCODICE, IDVariant C2_FATNUMERODOC, IDVariant C2_FATDDATADOC, IDVariant C2_FATDESCRIZIO, IDVariant C2_IVASERVIZIO, IDVariant v_DESCRBOLL, IDVariant v_IST, IDVariant C2_IVANUMEROREG, IDVariant C2_IVADDATAREG, IDVariant C2_FATTRATTAIVA, IDVariant C2_IVAIMPONIBIL, IDVariant C2_IVA, IDVariant C2_IVAALIQUOTA, IDVariant v_DESCRESENZ, IDVariant v_INDEDUCIBILE, IDVariant v_PRORATA, IDVariant v_CREDITO, IDVariant v_DEBITO, IDVariant v_TIPOLIQ) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_ESTDATPECOIV, 0);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGRAGSOC, 0, C2_BENRAGSOCEST);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECODI, 0, C2_FATCODICE);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMDOC, 0, C2_FATNUMERODOC);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATDOC, 0, C2_FATDDATADOC);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESDOC, 0, C2_FATDESCRIZIO);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEBOLL, 0, C2_IVASERVIZIO);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESBOL, 0, v_DESCRBOLL);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIST, 0, v_IST);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMREG, 0, C2_IVANUMEROREG);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATREG, 0, C2_IVADDATAREG);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGESPRC, 0, C2_FATTRATTAIVA);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEIMPO, 0, C2_IVAIMPONIBIL);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIVA, 0, C2_IVA);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPERC, 0, C2_IVAALIQUOTA);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEESEN, 0, v_DESCRESENZ);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEINDE, 0, v_INDEDUCIBILE);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPROR, 0, v_PRORATA);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECRED, 0, v_CREDITO);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDEBI, 0, v_DEBITO);
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDIFF, 0, IDL.Sub(v_DEBITO, v_CREDITO));
    IMDB.set_Value(IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGATTTRI, 0, ((v_TIPOLIQ.equals((new IDVariant("T"))))?(new IDVariant("SI")):(new IDVariant())));
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ESTDAPECOIVA_PARAMETRI238() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI238_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI536, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI536, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI238_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI238_RS, 0, IMDBDef2.TBL_PARAMETRI536, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 0, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 1, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIVIME, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 2, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERMES, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 3, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERTRI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 4, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMECODIC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 5, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI238_RS, 6, 0, IMDBDef2.TBL_PARAMETRI536, IMDBDef2.FLD_PARAMETRI536_ROWNAMEATTIV, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI536, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI536, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI536, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI238_RS, 0);
  }

  // **********************************************************************
  // Tabella
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ESTDAPECOIVA_TABELLA() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_TABELLA_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_ESTDATPECOIV, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_ESTDATPECOIV, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_TABELLA_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_TABELLA_RS, 0, IMDBDef2.TBL_ESTDATPECOIV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 0, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGRAGSOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 1, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECODI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 2, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMDOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 3, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATDOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 4, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESDOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 5, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEBOLL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 6, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESBOL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 7, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIST, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 8, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 9, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 10, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEIMPO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 11, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIVA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 12, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPERC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 13, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEESEN, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 14, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEINDE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 15, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGESPRC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 16, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPROR, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 17, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECRED, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 18, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDEBI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 19, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDIFF, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TABELLA_RS, 20, 0, IMDBDef2.TBL_ESTDATPECOIV, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGATTTRI, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_ESTDATPECOIV, 0);
      if (IMDB.Eof(IMDBDef2.TBL_ESTDATPECOIV, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_ESTDATPECOIV, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_TABELLA_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_SELEZISOGGET)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHETTROVA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RiempiIMDB();
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
  private void PAN_ESTDATPECOIV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTDATPECOIV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTDATPECOIV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTDATPECOIV, Cancel);
    // Stub
  }

  private void PAN_ESTDATPECOIV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTDATPECOIV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTDATPECOIV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTDATPECOIV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "03022EC3-2A35-43E0-A630-CAF617960E88");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, "09C7482F-A24F-49CA-88BF-BC5FA15A1638");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, "Tipo Vista Mese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, "235F1BAA-7932-4E67-B848-19EB8C128283");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, "Periodo ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "39C5C2DC-8337-456B-AA9D-BC1C2FA95A27");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, "35B5CE01-6821-4229-A373-3909C6C025CF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, "Codice");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, "AD571E76-E357-4FE3-97A3-10F131B47B4D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, "Beneficiario/Debitore");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, "Beneficiario/Debitore");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, "D56FA549-8A63-4D9F-8E94-CF9FBCA806FD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, "9B6162C0-D959-4F46-8C80-72FB78F434B4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, "Tipo Registro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, "5059A096-3B4C-4B29-8537-DACB3AC9CD87");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, "Attività");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, "58847767-1C42-4ADF-9F6E-6522C10F7AAA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, "Trova");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 76, 8, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMETRI238, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, 80, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_LIST, "Tipo Vista Mese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, 188, 8, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVISTMESE, MyGlb.PANEL_FORM, "Tipo Vista Mese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVISTMESE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVISTMESE, PPQRY_PARAMETRI238, "A.ROWNAMTIVIME", "ROWNAMTIVIME", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVISTMESE, (new IDVariant(0)), "Anno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVISTMESE, (new IDVariant(1)), "Trimestre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVISTMESE, (new IDVariant(2)), "Mese", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, 312, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_LIST, "Periodo ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, 384, 8, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO1, MyGlb.PANEL_FORM, "Periodo ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODO1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODO1, PPQRY_PARAMETRI238, "A.ROWNAMPERTRI", "ROWNAMPERTRI", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(1)), "Gennaio - Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(2)), "Aprile - Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(3)), "Luglio - Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PERIODO1, (new IDVariant(4)), "Ottobre - Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 208, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, "Periodo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 380, 8, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, "Periodo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODO, PPQRY_PARAMETRI238, "A.ROWNAMPERMES", "ROWNAMPERMES", 1, 2, 0, -13997);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_FORM, 556, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICE1, PPQRY_PARAMETRI238, "A.ROWNAMECODIC", "ROWNAMECODIC", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_LIST, "Beneficiario/Debitore");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_FORM, 4, 32, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_FORM, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFIDEBITO, MyGlb.PANEL_FORM, "Beneficiario/Debitore");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENEFIDEBITO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENEFIDEBITO, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "SOGGETTO", 5, 160, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.PANEL_LIST, 520, 16, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.PANEL_FORM, 572, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZISOGGET, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SELEZISOGGET, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SELEZISOGGET, -1, "", "SELEZISOGGET", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tipo Registro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_FORM, 52, 56, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOREGISTRO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOREGISTRO, PPQRY_PARAMETRI238, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 9, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOREGISTRO, (new IDVariant(1)), "Acquisti", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOREGISTRO, (new IDVariant(3)), "Vendite", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOREGISTRO, (new IDVariant(4)), "Corrispettivi", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_LIST, "Attività");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_FORM, 320, 56, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ATTIVITA, MyGlb.PANEL_FORM, "Attività");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ATTIVITA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ATTIVITA, PPQRY_PARAMETRI238, "A.ROWNAMEATTIV", "ROWNAMEATTIV", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ATTIVITA, (new IDVariant("I")), "Istituzionale", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ATTIVITA, (new IDVariant("C")), "Commerciale", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.PANEL_LIST, 604, 60, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.PANEL_FORM, 616, 48, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTROVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTROVA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTROVA, -1, "", "ETICHETTROVA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as SOGGETTO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECODIC~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BEN, PFL_PARAMETRI_CODICE1, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as SOGGETTO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "SOGGETTO", "Soggetto");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI238", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI238, IMDBDef10.PQRY_PARAMETRI238_RS, IMDBDef2.TBL_PARAMETRI536);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef2.FLD_PARAMETRI536_ROWNAMEESERC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVISTMESE, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIVIME);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODO1, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERTRI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODO, IMDBDef2.FLD_PARAMETRI536_ROWNAMPERMES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICE1, IMDBDef2.FLD_PARAMETRI536_ROWNAMECODIC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOREGISTRO, IMDBDef2.FLD_PARAMETRI536_ROWNAMTIPREG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ATTIVITA, IMDBDef2.FLD_PARAMETRI536_ROWNAMEATTIV);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI536");
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

  private void PAN_ESTDATPECOIV_Init()
  {

    PAN_ESTDATPECOIV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTDATPECOIV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTDATPECOIV.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, "1092960A-A194-42DA-8709-F13416C4B9A5");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, "Ragione Sociale");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, "BA5B4EB4-04BA-4B8C-A10F-53EE98950739");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, "Codice");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, "7986AC2C-1887-4D04-B009-33E2B1134C15");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, "Numero Doc");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, "3A2CFD00-F82A-4058-B329-16370E88B8FB");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, "Data Doc");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, "90C8C73A-0C58-4BCA-8993-11D02E353E94");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, "Descr Doc");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, "B5073637-595B-4E21-A93E-CEA19A59371D");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, "Bollato");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, "D97F8DAE-DE97-4750-B677-74DF8511E3B6");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, "Descr Bollato");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, "228DB181-FF0C-4B86-AF32-0A365E2DFEB9");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, "IST");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, "1E4F62F2-BF91-4D4E-BE98-AB15908E59F8");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, "Numero Reg");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, "5D54A84E-4459-4636-8236-44A79C6FB0AF");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, "Data Reg");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, "FF8D5C24-3B79-44FB-835F-19A5968E9D1C");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, "Imponibile");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, "26EB4529-59DE-4E64-B87E-14B8C2545D0C");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, "Iva");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, "40D058C6-9C20-46C8-AB5A-FA5F53FC1947");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, "%");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, "E96F6CF2-455D-46F4-A300-917C81B4FBEA");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, "Esenzione");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, "2732220C-D129-4541-B04A-2B350D048378");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, "Indeduc");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, "174864E7-BCCB-43F7-A0CC-BE268F02B521");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, "SP/RC");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, "F562345A-2D5F-4608-9047-4E512521CEDE");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, "Prorata");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, "03F968D4-50EF-45D1-8325-D1BF8B9B8275");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, "Credito");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, "EC05DF31-78D9-480C-8271-9141946EA891");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, "Debito");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, "7C3F5E9A-0DC1-4B4A-916C-BD0ED4DD5E51");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, "Differenza");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTDATPECOIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, "C26B4F49-1812-4F45-8D7B-56A34B1AD614");
    PAN_ESTDATPECOIV.set_Header(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, "Attività TRIM");
    PAN_ESTDATPECOIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, "");
    PAN_ESTDATPECOIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTDATPECOIV.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESTDATPECOIV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 4, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_RAGIONSOCIAL, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_RAGIONSOCIAL, PPQRY_TABELLA, "A.NOMOGGRAGSOC", "NOMOGGRAGSOC", 5, 255, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_LIST, 252, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_CODICE, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_CODICE, PPQRY_TABELLA, "A.NOMEOGGECODI", "NOMEOGGECODI", 1, 9, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_LIST, 300, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_FORM, 4, 52, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMERODOC, MyGlb.PANEL_FORM, "Num. Doc");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_NUMERODOC, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_NUMERODOC, PPQRY_TABELLA, "A.NOMOGGNUMDOC", "NOMOGGNUMDOC", 5, 50, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_LIST, 412, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_LIST, 60);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_LIST, "Data Doc");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATADOC, MyGlb.PANEL_FORM, "Data Doc");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_DATADOC, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_DATADOC, PPQRY_TABELLA, "A.NOMOGGDATDOC", "NOMOGGDATDOC", 6, 10, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_LIST, 484, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_LIST, "Descr Doc");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_FORM, 4, 100, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_FORM, 2);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRDOC, MyGlb.PANEL_FORM, "Descr Doc");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_DESCRDOC, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_DESCRDOC, PPQRY_TABELLA, "A.NOMOGGDESDOC", "NOMOGGDESDOC", 5, 255, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_LIST, 736, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_LIST, 48);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_LIST, "Bollato");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_FORM, 4, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_BOLLATO, MyGlb.PANEL_FORM, "Bollato");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_BOLLATO, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_BOLLATO, PPQRY_TABELLA, "A.NOMEOGGEBOLL", "NOMEOGGEBOLL", 1, 9, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_LIST, 784, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_LIST, "Descr Bollato");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_FORM, 4, 148, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_FORM, 2);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DESCRBOLLATO, MyGlb.PANEL_FORM, "Descr Bollato");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_DESCRBOLLATO, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_DESCRBOLLATO, PPQRY_TABELLA, "A.NOMOGGDESBOL", "NOMOGGDESBOL", 5, 255, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_LIST, 1036, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_LIST, "IST");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_FORM, 4, 172, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IST, MyGlb.PANEL_FORM, "IST");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_IST, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_IST, PPQRY_TABELLA, "A.NOMEOGGETIST", "NOMEOGGETIST", 5, 50, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_LIST, 1064, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_LIST, "Numero Reg");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_FORM, 4, 196, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_NUMEROREG, MyGlb.PANEL_FORM, "Num. Reg");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_NUMEROREG, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_NUMEROREG, PPQRY_TABELLA, "A.NOMOGGNUMREG", "NOMOGGNUMREG", 1, 5, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_LIST, 1176, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_LIST, 60);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_LIST, "Data Reg");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_DATAREG, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_DATAREG, PPQRY_TABELLA, "A.NOMOGGDATREG", "NOMOGGDATREG", 6, 10, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_LIST, 1244, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_LIST, 68);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_FORM, 180, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_FORM, 80);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_IMPONIBILE, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_IMPONIBILE, PPQRY_TABELLA, "A.NOMEOGGEIMPO", "NOMEOGGEIMPO", 3, 14, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_LIST, 1312, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_LIST, 28);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_LIST, "Iva");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_FORM, 340, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_FORM, 40);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_IVA, MyGlb.PANEL_FORM, "Iva");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_IVA, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_IVA, PPQRY_TABELLA, "A.NOMEOGGETIVA", "NOMEOGGETIVA", 3, 14, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_LIST, 1376, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_LIST, 36);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_LIST, "%");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_FORM, 4, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PERC, MyGlb.PANEL_FORM, "%");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_PERC, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_PERC, PPQRY_TABELLA, "A.NOMEOGGEPERC", "NOMEOGGEPERC", 3, 5, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_LIST, 1420, 36, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_LIST, "Esenzione");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_FORM, 4, 268, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ESENZIONE, MyGlb.PANEL_FORM, "Esenzione");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_ESENZIONE, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_ESENZIONE, PPQRY_TABELLA, "A.NOMEOGGEESEN", "NOMEOGGEESEN", 5, 255, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_LIST, 1668, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_LIST, "Indeduc");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_FORM, 4, 292, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_FORM, 72);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_INDEDUC, MyGlb.PANEL_FORM, "Indeduc");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_INDEDUC, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_INDEDUC, PPQRY_TABELLA, "A.NOMEOGGEINDE", "NOMEOGGEINDE", 5, 50, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_LIST, 1724, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_LIST, 112);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_LIST, "SP/RC");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_FORM, 4, 316, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_FORM, 56);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_SPRC, MyGlb.PANEL_FORM, "SP/RC");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_SPRC, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_SPRC, PPQRY_TABELLA, "A.NOMEOGGESPRC", "NOMEOGGESPRC", 5, 50, 0, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_LIST, 1768, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_LIST, 52);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_LIST, "Prorata");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_FORM, 132, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_FORM, 64);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_PRORATA, MyGlb.PANEL_FORM, "Prorata");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_PRORATA, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_PRORATA, PPQRY_TABELLA, "A.NOMEOGGEPROR", "NOMEOGGEPROR", 3, 5, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_LIST, 1828, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_LIST, 52);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_LIST, "Credito");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_FORM, 252, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_FORM, 64);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_CREDITO, MyGlb.PANEL_FORM, "Credito");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_CREDITO, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_CREDITO, PPQRY_TABELLA, "A.NOMEOGGECRED", "NOMEOGGECRED", 3, 14, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_LIST, 1940, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_LIST, 48);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_LIST, "Debito");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_FORM, 396, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_FORM, 64);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DEBITO, MyGlb.PANEL_FORM, "Debito");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_DEBITO, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_DEBITO, PPQRY_TABELLA, "A.NOMEOGGEDEBI", "NOMEOGGEDEBI", 3, 14, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_LIST, 2052, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_LIST, 68);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_LIST, "Differenza");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_FORM, 140, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_FORM, 80);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_DIFFERENZA, MyGlb.PANEL_FORM, "Differenza");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_DIFFERENZA, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_DIFFERENZA, PPQRY_TABELLA, "A.NOMEOGGEDIFF", "NOMEOGGEDIFF", 3, 14, 2, -13997);
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_LIST, 2164, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_LIST, 120);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_LIST, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_LIST, "Attività TRIM");
    PAN_ESTDATPECOIV.SetRect(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_FORM, 4, 340, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTDATPECOIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_FORM, 120);
    PAN_ESTDATPECOIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_FORM, 1);
    PAN_ESTDATPECOIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTDATPECOIV_ATTIVITATRIM, MyGlb.PANEL_FORM, "Attività TRIM");
    PAN_ESTDATPECOIV.SetFieldPage(PFL_ESTDATPECOIV_ATTIVITATRIM, -1, -1);
    PAN_ESTDATPECOIV.SetFieldPanel(PFL_ESTDATPECOIV_ATTIVITATRIM, PPQRY_TABELLA, "A.NOMOGGATTTRI", "NOMOGGATTTRI", 5, 2, 0, -13997);
  }

  private void PAN_ESTDATPECOIV_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTDATPECOIV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTDATPECOIV.SetIMDB(IMDB, "PQRY_TABELLA", true);
    PAN_ESTDATPECOIV.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_ESTDATPECOIV.SetQueryIMDB(PPQRY_TABELLA, IMDBDef10.PQRY_TABELLA_RS, IMDBDef2.TBL_ESTDATPECOIV);
    JustLoaded = true;
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_RAGIONSOCIAL, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGRAGSOC);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_CODICE, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECODI);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_NUMERODOC, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMDOC);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_DATADOC, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATDOC);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_DESCRDOC, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESDOC);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_BOLLATO, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEBOLL);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_DESCRBOLLATO, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDESBOL);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_IST, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIST);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_NUMEROREG, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGNUMREG);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_DATAREG, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGDATREG);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_IMPONIBILE, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEIMPO);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_IVA, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGETIVA);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_PERC, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPERC);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_ESENZIONE, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEESEN);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_INDEDUC, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEINDE);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_SPRC, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGESPRC);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_PRORATA, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEPROR);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_CREDITO, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGECRED);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_DEBITO, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDEBI);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_DIFFERENZA, IMDBDef2.FLD_ESTDATPECOIV_NOMEOGGEDIFF);
    PAN_ESTDATPECOIV.SetFieldPrimaryIndex(PFL_ESTDATPECOIV_ATTIVITATRIM, IMDBDef2.FLD_ESTDATPECOIV_NOMOGGATTTRI);
    PAN_ESTDATPECOIV.SetMasterTable(0, "ESTDATPECOIV");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTDATPECOIV.Status() == 2)
    {
      int oldListQBE = PAN_ESTDATPECOIV.iUseListQBE;
      PAN_ESTDATPECOIV.iUseListQBE = 0;
      PAN_ESTDATPECOIV.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTDATPECOIV.PanelCommand(Glb.PCM_FIND);
      PAN_ESTDATPECOIV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ESTDATPECOIV) PAN_ESTDATPECOIV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_ESTDATPECOIV) PAN_ESTDATPECOIV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_ESTDATPECOIV) PAN_ESTDATPECOIV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ESTDATPECOIV) PAN_ESTDATPECOIV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESTDATPECOIV) PAN_ESTDATPECOIV_AfterFind(CmdFind);
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
    if (SrcObj == PAN_ESTDATPECOIV) PAN_ESTDATPECOIV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
