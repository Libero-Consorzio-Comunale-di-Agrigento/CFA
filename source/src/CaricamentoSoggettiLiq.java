// **********************************************
// Caricamento Soggetti Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CaricamentoSoggettiLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPORTFILE_PROGRESSIVO = 0;
  private static int PFL_IMPORTFILE_SESSIONE = 1;
  private static int PFL_IMPORTFILE_FASE = 2;
  private static int PFL_IMPORTFILE_FILEDATI = 3;

  private static int PPQRY_IMPORTFILE1 = 0;


  IDPanel PAN_IMPORTFILE;
  private static int GRP_PARAMETRI_PROVVEDIMENT = 0;
  private static int GRP_PARAMETRI_MANDATINFORM = 1;

  private static int PFL_PARAMETRI_NUMEROIMP = 0;
  private static int PFL_PARAMETRI_ANNOIMP = 1;
  private static int PFL_PARAMETRI_SCEGLIIMPEGN = 2;
  private static int PFL_PARAMETRI_INFOIMPEGNO = 3;
  private static int PFL_PARAMETRI_NUMEROSUBIMP = 4;
  private static int PFL_PARAMETRI_ANNOSUBIMP = 5;
  private static int PFL_PARAMETRI_SCEGLSUBIMPE = 6;
  private static int PFL_PARAMETRI_INFOSUBIMPEG = 7;
  private static int PFL_PARAMETRI_INEMISSIONE = 8;
  private static int PFL_PARAMETRI_DELIBERLABEL = 9;
  private static int PFL_PARAMETRI_SEDEDEL = 10;
  private static int PFL_PARAMETRI_TRATDELILABE = 11;
  private static int PFL_PARAMETRI_NUMERODEL = 12;
  private static int PFL_PARAMETRI_BARRDELILABE = 13;
  private static int PFL_PARAMETRI_ANNODEL = 14;
  private static int PFL_PARAMETRI_SCEGDELILABE = 15;
  private static int PFL_PARAMETRI_INFODELILABE = 16;
  private static int PFL_PARAMETRI_UNITAPROPONE = 17;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 18;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 19;
  private static int PFL_PARAMETRI_SCEGPROPLABE = 20;
  private static int PFL_PARAMETRI_INFOPROPLABE = 21;
  private static int PFL_PARAMETRI_VOCEECONOMIC = 22;
  private static int PFL_PARAMETRI_CODICEGESTIO = 23;
  private static int PFL_PARAMETRI_TIPOVINCOLO = 24;
  private static int PFL_PARAMETRI_DESCRIZIONE = 25;
  private static int PFL_PARAMETRI_CAUSALE = 26;
  private static int PFL_PARAMETRI_TIPPAGPERCAS = 27;
  private static int PFL_PARAMETRI_BOLLO = 28;
  private static int PFL_PARAMETRI_UFFICIO = 29;
  private static int PFL_PARAMETRI_FINANZIAMENT = 30;
  private static int PFL_PARAMETRI_SCADENZA = 31;
  private static int PFL_PARAMETRI_SPESE = 32;
  private static int PFL_PARAMETRI_COMMISSIONI = 33;
  private static int PFL_PARAMETRI_ALLEGATI = 34;
  private static int PFL_PARAMETRI_INFOTESORIER = 35;
  private static int PFL_PARAMETRI_ELABORALABEL = 36;

  private static int PPQRY_PARAMETRI551 = 0;

  private static int PPQRY_VOCIECONOMIC = 1;
  private static int PPQRY_RICLASSIGEST = 2;
  private static int PPQRY_VINCOLI = 3;
  private static int PPQRY_T58 = 4;
  private static int PPQRY_T02 = 5;
  private static int PPQRY_T60 = 6;
  private static int PPQRY_T53 = 7;
  private static int PPQRY_FINANZIAMENT = 8;
  private static int PPQRY_TIPISPESMINF = 9;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRFILE(IMDB);
    Init_TBL_PARAMETRI553(IMDB);
    Init_TBL_VALORICAP(IMDB);
    //
    //
    Init_PQRY_IMPORTFILE1(IMDB);
    Init_PQRY_PARAMETRI551(IMDB);
    Init_PQRY_PARAMETRI551_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRFILE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRFILE, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRFILE, "TBL_PARAMETRFILE");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMPEFIBL, "ROWNAMPEFIBL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMPEFIBL,9,8000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMBLOINS,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMEPROGR,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRFILE,IMDBDef5.FLD_PARAMETRFILE_RONATIPAPECA,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRFILE, 0);
  }

  private static void Init_TBL_PARAMETRI553(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI553, 29);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI553, "TBL_PARAMETRI553");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMNUMEIMP, "PARAMNUMEIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARNUMIMPOLD, "PARNUMIMPOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARNUMIMPOLD,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMANNOIMP, "PARAMANNOIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARANNIMPOLD, "PARANNIMPOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARANNIMPOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARNUMSUBOLD, "PARNUMSUBOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARNUMSUBOLD,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAANNOSUBI,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARANNSUBOLD, "PARANNSUBOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARANNSUBOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAVOCEECON, "PARAVOCEECON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAVOCEECON,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARACODIGEST, "PARACODIGEST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARACODIGEST,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_UNITA_PROPONENTE,5,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARTIPPAPECA, "PARTIPPAPECA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARTIPPAPECA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI553,IMDBDef5.FLD_PARAMETRI553_INFO_TESORIERE,5,200,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI553, 0);
  }

  private static void Init_TBL_VALORICAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_VALORICAP, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_VALORICAP, "TBL_VALORICAP");
    IMDB.set_FldCode(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORICAP,IMDBDef5.FLD_VALORICAP_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_VALORICAP, 0);
  }

  private static void Init_PQRY_IMPORTFILE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPORTFILE1, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPORTFILE1, "PQRY_IMPORTFILE1");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE1,IMDBDef14.PQSL_IMPORTFILE1_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPORTFILE1, 0);
  }

  private static void Init_PQRY_PARAMETRI551(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI551, 25);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI551, "PQRY_PARAMETRI551");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, "PARAMNUMEIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, "PARAMANNOIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE,5,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON, "PARAVOCEECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST, "PARACODIGEST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARTIPPAPECA, "PARTIPPAPECA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARTIPPAPECA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551,IMDBDef14.PQSL_PARAMETRI551_INFO_TESORIERE,5,200,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI551, 0);
  }

  private static void Init_PQRY_PARAMETRI551_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI551_RS, 25);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI551_RS, "PQRY_PARAMETRI551_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, "PARAMNUMEIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, "PARAMANNOIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE,5,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON, "PARAVOCEECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST, "PARACODIGEST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARTIPPAPECA, "PARTIPPAPECA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARTIPPAPECA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI551_RS,IMDBDef14.PQSL_PARAMETRI551_INFO_TESORIERE,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CaricamentoSoggettiLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public CaricamentoSoggettiLiq()
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
    FormIdx = MyGlb.FRM_CARICSOGGLIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "792E5706-3934-4A85-8853-FFB852C5C659";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 688;
    DesignHeight = 698;
    set_Caption(new IDVariant("Caricamento Soggetti/Liquidazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 688;
    Frames[1].Height = 672;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.130952;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 688;
    Frames[2].Height = 88;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Import File";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 88;
    PAN_IMPORTFILE = new IDPanel(w, this, 2, "PAN_IMPORTFILE");
    Frames[2].Content = PAN_IMPORTFILE;
    PAN_IMPORTFILE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPORTFILE.VS = MainFrm.VisualStyleList;
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 688-MyGlb.PAN_OFFS_X, 88-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DA70A02D-DAAA-4A44-A489-42016CD2D5E7");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPORTFILE.InitStatus = 2;
    PAN_IMPORTFILE_Init();
    PAN_IMPORTFILE_InitFields();
    PAN_IMPORTFILE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 688;
    Frames[3].Height = 584;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 584;
    PAN_PARAMETRI = new IDPanel(w, this, 3, "PAN_PARAMETRI");
    Frames[3].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 688-MyGlb.PAN_OFFS_X, 584-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7D681590-4CF1-45F2-97F8-9FFE164B7427");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1612, 256, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI553, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CARICSOGGLIQ_PARAMETRI551();
      }
      PAN_IMPORTFILE.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGLIIMPEGN) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGLSUBIMPE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGDELILABE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGPROPLABE) {
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
    return (obj instanceof CaricamentoSoggettiLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CaricamentoSoggettiLiq.class.getName() : (Glb.ClassWithPackage(CaricamentoSoggettiLiq.class) ? CaricamentoSoggettiLiq.class.getName().substring(CaricamentoSoggettiLiq.class.getPackage().getName().length() + 1) : CaricamentoSoggettiLiq.class.getName()));
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_RONATIPAPECA, 0, (new IDVariant()));
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEPROGR, 0, PredisposizioneWORDEXPORTID());
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0, (new IDVariant("AUSO")));
      }
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      VisibilitaMandatoInformatico();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "EndModal", _e);
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
      UNLOAD_PARAFILEDELE();
      UNLOAD_PARAMEDELETE();
      UNLOAD_VALORCAPDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri File: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAFILEDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMPEFIBL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMBLOINS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_RONATIPAPECA, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMNUMEIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMIMPOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMANNOIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNIMPOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANUMESUBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMSUBOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAANNOSUBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNSUBOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMINEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAVOCEECON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARACODIGEST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARATIPOVINC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARTIPPAPECA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_BOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_FINANZIAMENTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMSCADENZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_SPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_COMMISSIONI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_ALLEGATI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_INFO_TESORIERE, 0, new IDVariant());
  }

  // **********************************************************************
  // Valori Cap: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_VALORCAPDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMETITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMECATEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMCODINT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMCODTER, 0, new IDVariant());
  }

  // **********************************************************************
  // Import File After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_IMPORTFILE_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Import File After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_IMPORTFILE.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_IMPORTFILE.GotoFirst();
      while (!PAN_IMPORTFILE.RSEOF())
      {
        if (IMDB.Value(IMDBDef14.PQRY_IMPORTFILE1, IMDBDef14.PQSL_IMPORTFILE1_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))),IDL.Add(IDL.Add((new IDVariant("Soggetti_chek")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEPROGR, 0))));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMPEFIBL, 0, new IDVariant(v_PERCORSO));
        }
        PAN_IMPORTFILE.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMBLOINS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMBLOINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ImportFileAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Import File On Database Error Event
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
  private void PAN_IMPORTFILE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMPORTFILE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Import File On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ImportFileOnDatabaseErrorEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ParametriOnDynamicProperties", _e);
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
      IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROIMP)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOIMP)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMIMPOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNIMPOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0))))
          {
            if (!(MainFrm.ImpEseimp(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0), v_CAPITOLO, v_ARTICOLO)))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0, (new IDVariant()));
            }
            else
            {
              ProponiDaImpSubimp(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0), (new IDVariant()), (new IDVariant()));
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO, 0, (new IDVariant()));
          }
          CampiCap(new IDVariant(v_CAPITOLO,IDVariant.DECIMAL), v_ARTICOLO);
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMIMPOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNIMPOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROSUBIMP)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOSUBIMP)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMSUBOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNSUBOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0))))
          {
            IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
            if (!(MainFrm.SubEsesub(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0), v_CAPITOLO, v_ARTICOLO, v_ANNOIMP, v_NUMEROIMP)))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0, (new IDVariant()));
            }
            else
            {
              ProponiDaImpSubimp((new IDVariant()), (new IDVariant()), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0));
            }
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMIMPOLD, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0, new IDVariant(v_ANNOIMP));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNIMPOLD, 0, new IDVariant(v_ANNOIMP));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO, 0, (new IDVariant()));
          }
          CampiCap(new IDVariant(v_CAPITOLO,IDVariant.DECIMAL), v_ARTICOLO);
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARNUMSUBOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANNSUBOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODEL)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_UNITAPROPONE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOPROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0))))
        {
          IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
          v_UNITAPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0);
          v_NUMEROPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0);
          v_ANNOPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0);
          MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROP));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // la procedura funziona solo se è stato selezionato un file attraverso il campo blob
      // 
      {
        if (!(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMBLOINS, 0).equals((new IDVariant("SI")), true)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Selezionare un file"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare Impegno e/o Subimpegno"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      // 
      // apro il file gestendo un'eventuale eccezione
      // 
      {
        try
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMPEFIBL, 0), v_FD); 
        }
        catch (Exception e9)
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Errore nella lettura file!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      // 
      // copio i caratteri del file nella tabella selezionata in maniera ordinata utilizzando come supporto buffer1 e buffer2
      // 
      {
        IDVariant v_CURRNUMBERCH = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CONTROLLASEF = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_PROG = new IDVariant(0,IDVariant.INTEGER);
        v_CONTROLLASEF = (new IDVariant(-1));
        // 
        // inserisco ogni riga del file in WORK EXPORT TESO
        // 
        {
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            // 
            // pulisco la tabella workesportteso prima di effettuare
            // l'inserimento
            // 
            SQL = new StringBuffer();
            SQL.append("delete from WORK_EXPORT_TESO ");
            SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
            SQL.append("and   (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e14)
          {
            MainFrm.set_AlertMessage(new IDVariant(e14.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          while (!(MainFrm.VBFile.EOF(v_FD)))
          {
            v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
            v_CURRNUMBERCH = IDL.Length(v_CURRLINE);
            // 
            // controllo se il file è vuoto ed eventualmente lo gestisco
            // 
            {
              if (v_CONTROLLASEF.booleanValue())
              {
                v_CONTROLLASEF = (new IDVariant(0));
                if (v_CURRNUMBERCH.equals((new IDVariant(0)), true))
                {
                  IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                  v_MSG = (new IDVariant("Il file è vuoto!", IDVariant.STRING));
                  MainFrm.set_AlertMessage(v_MSG); 
                  return 0;
                }
              }
            }
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into WORK_EXPORT_TESO ");
              SQL.append("( ");
              SQL.append("  SESSIONE, ");
              SQL.append("  DATI, ");
              SQL.append("  DATI2, ");
              SQL.append("  FASE, ");
              SQL.append("  PROGRESSIVO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
              SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, 4000), ");
              SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 4001, 4000), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_PROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              v_PROG = IDL.Add(v_PROG, (new IDVariant(1)));
            }
            catch (Exception e22)
            {
              MainFrm.set_AlertMessage(new IDVariant(e22.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
          MainFrm.Cf4armDBObject.CommitTrans();
          MainFrm.VBFile.Close(v_FD); 
        }
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      IDVariant v_ERRORE = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.SOGLIQCONTROLLO(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARTIPPAPECA, 0), (new IDVariant("NO")), v_ERRORE);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        SQL = new StringBuffer();
        SQL.append("delete from WORK_EXPORT_TESO ");
        SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        return 0;
      }
      if (v_ERRORE.compareTo((new IDVariant(0)), true)!=0)
      {
        IDVariant v_STAMPACAPTIO = new IDVariant(0,IDVariant.STRING);
        v_STAMPACAPTIO = (new IDVariant("Stampa Anomalie Caricamen"));
        MainFrm.LanciaErrorReport(v_STAMPACAPTIO, (new IDVariant()));
      }
      else
      {
        IDVariant v_SOGINSDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SOGINSA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_LIQINSDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_LIQINSA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_RISULTATO = new IDVariant(0,IDVariant.STRING);
        v_RISULTATO = (new IDVariant("Procedura Terminata"));
        IDVariant v_DALNUMERO = new IDVariant(0,IDVariant.STRING);
        v_DALNUMERO = (new IDVariant("Dal numero "));
        IDVariant v_ALNUMERO = new IDVariant(0,IDVariant.STRING);
        v_ALNUMERO = (new IDVariant(" al numero "));
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.SOGLIQCARICA(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_DESCRIZIONE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_CAUSALE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARTIPPAPECA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_BOLLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UFFICIO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SPESE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_COMMISSIONI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMSCADENZ, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ALLEGATI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_INFO_TESORIERE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMINEMISS, 0), v_SOGINSDA, v_SOGINSA, v_LIQINSDA, v_LIQINSA);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          SQL = new StringBuffer();
          SQL.append("delete from WORK_EXPORT_TESO ");
          SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          return 0;
        }
        if (v_SOGINSDA.equals((new IDVariant(0)), true) && v_SOGINSA.equals((new IDVariant(0)), true))
        {
          IDVariant v_NESSUNSOGGET = new IDVariant(0,IDVariant.STRING);
          v_NESSUNSOGGET = (new IDVariant("Nessun soggetto inserito"));
          v_RISULTATO = IDL.Add(IDL.Add(v_RISULTATO, (new IDVariant("<BR/>"))), v_NESSUNSOGGET);
        }
        else
        {
          IDVariant v_INSERITI = null;
          v_INSERITI = (new IDVariant("Inseriti "));
          IDVariant v_SOGGETTI = new IDVariant(0,IDVariant.STRING);
          v_SOGGETTI = (new IDVariant(" soggetti"));
          IDVariant v_TOTSOG = null;
          v_TOTSOG = IDL.Add(IDL.Sub(v_SOGINSA, v_SOGINSDA), (new IDVariant(1)));
          v_RISULTATO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_RISULTATO, (new IDVariant("<BR/>"))), v_INSERITI), IDL.ToString(v_TOTSOG)), v_SOGGETTI), (new IDVariant("<BR/>"))), v_DALNUMERO), IDL.ToString(v_SOGINSDA)), v_ALNUMERO), IDL.ToString(v_SOGINSA));
        }
        if (v_LIQINSDA.equals((new IDVariant(0)), true) && v_LIQINSA.equals((new IDVariant(0)), true))
        {
          IDVariant v_NESSUNLIQUID = new IDVariant(0,IDVariant.STRING);
          v_NESSUNLIQUID = (new IDVariant("Nessuna liquidazione inserita"));
          v_RISULTATO = IDL.Add(IDL.Add(v_RISULTATO, (new IDVariant("<BR/>"))), v_NESSUNLIQUID);
        }
        else
        {
          IDVariant v_INSERITE = null;
          v_INSERITE = (new IDVariant("Inserite "));
          IDVariant v_LIQUIDAZIONI = new IDVariant(0,IDVariant.STRING);
          v_LIQUIDAZIONI = (new IDVariant(" liquidazioni"));
          IDVariant v_TOTLIQ = null;
          v_TOTLIQ = IDL.Add(IDL.Sub(v_LIQINSA, v_LIQINSDA), (new IDVariant(1)));
          v_RISULTATO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_RISULTATO, (new IDVariant("<BR/>"))), v_INSERITE), IDL.ToString(v_TOTLIQ)), v_LIQUIDAZIONI), (new IDVariant("<BR/>"))), v_DALNUMERO), IDL.ToString(v_LIQINSDA)), v_ALNUMERO), IDL.ToString(v_LIQINSA));
        }
        MainFrm.set_AlertMessage(v_RISULTATO); 
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      // 
      // ripulisco la tabella workexportteso
      // 
      {
        PulisciWorkExportTeso();
      }
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ERRORI ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Predisposizione WORDEXPORTID
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant PredisposizioneWORDEXPORTID ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione WORDEXPORTID Body
      // Procedure Body
      // 
      v_IFASE = IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0);
      v_ISESSIONE = new IDVariant(MainFrm.PROGRESESSIO);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(NVL(A.PROGRESSIVO, 0) + 1) as MANUVAWEIP0U ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MANUVAWEIP0U", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  FASE, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_ISESSIONE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return new IDVariant(v_DARESTITUIRE,IDVariant.INTEGER);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "PredisposizioneWORDEXPORTID", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Pulisci Work Export Teso
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int PulisciWorkExportTeso ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pulisci Work Export Teso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRFILE, IMDBDef5.FLD_PARAMETRFILE_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "PulisciWorkExportTeso", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scegli Impegno
  // **********************************************************************
  public int ApriScegliImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Impegno Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ApriScegliImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scegli Sub Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriScegliSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Sub Impegno Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ApriScegliSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMANNOIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAMNUMEIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAANNOSUBI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARANUMESUBI, 0));
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Delibera Label
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScegliDeliberaLabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Delibera Label Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ScegliDeliberaLabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Propopste Label
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScegliPropopsteLabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Propopste Label Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ScegliPropopsteLabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Mandato Informatico
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisibilitaMandatoInformatico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Mandato Informatico Body
      // Corpo Procedura
      // 
      IDVariant v_LICENZAMIF = null;
      v_LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      // 
      // Visibilità Mandato Informatico
      // 
      {
        if (MainFrm.LIQMO.equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF.booleanValue())
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_LICENZAMIF.booleanValue() && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(v_LICENZAMIF.booleanValue()) && MainFrm.LIQMO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "VisibilitaMandatoInformatico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte Label
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoProposteLabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Label Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "InfoProposteLabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera Label
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDeliberaLabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Label Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "InfoDeliberaLabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Campi Cap
  // Explain which processing is carried out by this procedure
  // Capitolo:  - Input
  // Articolo:  - Input
  // **********************************************************************
  public int CampiCap (IDVariant Capitolo, IDVariant Articolo)
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
      // Campi Cap Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TITOLO as CAPTITOLO, ");
      SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
      SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  A.COD_TERZI as CAPCODTERZI, ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
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
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMETITOL, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMECATEG, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMCODINT, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMCODTER, 0, (new IDVariant(-1)));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMETITOL, 0, new IDVariant(v_CAPTITOLO));
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMECATEG, 0, new IDVariant(v_CAPCATEGORIA));
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMCODINT, 0, new IDVariant(v_CAPINTERVENT));
        IMDB.set_Value(IMDBDef5.TBL_VALORICAP, IMDBDef5.FLD_VALORICAP_ROWNAMCODTER, 0, new IDVariant(v_CAPTERZI));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "CampiCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Imp Subimp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // Anno Imp:  - Input
  // Numero Imp:  - Input
  // Anno Subimp:  - Input
  // Numero Subimp:  - Input
  // **********************************************************************
  public int ProponiDaImpSubimp (IDVariant AnnoImp, IDVariant NumeroImp, IDVariant AnnoSubimp, IDVariant NumeroSubimp)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Imp Subimp Body
      // Corpo Procedura
      // 
      IDVariant v_VVOCEECON = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCODICEGESTI = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VTIPOVINCOLO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VUNITAPROPON = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VNUMEROPROPO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VANNOPROPOST = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VSEDEDEL = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VNUMERODEL = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VANNODEL = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VFINANZIAMEN = new IDVariant(0,IDVariant.INTEGER);
      if (!(IDL.IsNull(AnnoSubimp)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  B.VOCE_ECON as IMPVOCEECON, ");
        SQL.append("  A.CODICE_GESTIONALE as SUBICODIGEST, ");
        SQL.append("  B.TIPO_VINCOLO as IMPTIPOVINCO, ");
        SQL.append("  A.UNITA_PROPONENTE as SUBIUNITPROP, ");
        SQL.append("  A.NUMERO_PROPOSTA as SUBINUMEPROP, ");
        SQL.append("  A.ANNO_PROPOSTA as SUBIANNOPROP, ");
        SQL.append("  A.SEDE_DEL as SUBIMSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as SUBIMNUMEDEL, ");
        SQL.append("  A.ANNO_DEL as SUBIMANNODEL ");
        SQL.append("from ");
        SQL.append("  SUBIMP A, ");
        SQL.append("  IMP B ");
        SQL.append("where (B.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubimp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubimp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVOCEECON = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
          v_VCODICEGESTI = QV.Get("SUBICODIGEST", IDVariant.INTEGER) ;
          v_VTIPOVINCOLO = QV.Get("IMPTIPOVINCO", IDVariant.INTEGER) ;
          v_VUNITAPROPON = QV.Get("SUBIUNITPROP", IDVariant.STRING) ;
          v_VNUMEROPROPO = QV.Get("SUBINUMEPROP", IDVariant.INTEGER) ;
          v_VANNOPROPOST = QV.Get("SUBIANNOPROP", IDVariant.INTEGER) ;
          v_VSEDEDEL = QV.Get("SUBIMSEDEDEL", IDVariant.STRING) ;
          v_VNUMERODEL = QV.Get("SUBIMNUMEDEL", IDVariant.INTEGER) ;
          v_VANNODEL = QV.Get("SUBIMANNODEL", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINSUBFINFIN ");
        SQL.append("from ");
        SQL.append("  SUBIMP_FIN A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubimp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubimp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VFINANZIAMEN = QV.Get("MINSUBFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(1)), true)!=0)
        {
          v_VFINANZIAMEN = (new IDVariant());
        }
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VOCE_ECON as IMPVOCEECON, ");
        SQL.append("  A.CODICE_GESTIONALE as IMPCODICGEST, ");
        SQL.append("  A.TIPO_VINCOLO as IMPTIPOVINCO, ");
        SQL.append("  A.UNITA_PROPONENTE as IMPUNITAPROP, ");
        SQL.append("  A.NUMERO_PROPOSTA as IMPNUMERPROP, ");
        SQL.append("  A.ANNO_PROPOSTA as IMPANNOPROPO, ");
        SQL.append("  A.SEDE_DEL as IMPSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as IMPNUMERODEL, ");
        SQL.append("  A.ANNO_DEL as IMPANNODEL ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVOCEECON = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
          v_VCODICEGESTI = QV.Get("IMPCODICGEST", IDVariant.INTEGER) ;
          v_VTIPOVINCOLO = QV.Get("IMPTIPOVINCO", IDVariant.INTEGER) ;
          v_VUNITAPROPON = QV.Get("IMPUNITAPROP", IDVariant.STRING) ;
          v_VNUMEROPROPO = QV.Get("IMPNUMERPROP", IDVariant.INTEGER) ;
          v_VANNOPROPOST = QV.Get("IMPANNOPROPO", IDVariant.INTEGER) ;
          v_VSEDEDEL = QV.Get("IMPSEDEDEL", IDVariant.STRING) ;
          v_VNUMERODEL = QV.Get("IMPNUMERODEL", IDVariant.INTEGER) ;
          v_VANNODEL = QV.Get("IMPANNODEL", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINIMPFINFIN ");
        SQL.append("from ");
        SQL.append("  IMP_FIN A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VFINANZIAMEN = QV.Get("MINIMPFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(1)), true)!=0)
        {
          v_VFINANZIAMEN = (new IDVariant());
        }
      }
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARAVOCEECON, 0, new IDVariant(v_VVOCEECON));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARACODIGEST, 0, new IDVariant(v_VCODICEGESTI));
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_PARATIPOVINC, 0, new IDVariant(v_VTIPOVINCOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_SEDE_DEL, 0, new IDVariant(v_VSEDEDEL));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_DEL, 0, new IDVariant(v_VNUMERODEL));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_DEL, 0, new IDVariant(v_VANNODEL));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_UNITA_PROPONENTE, 0, new IDVariant(v_VUNITAPROPON));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_NUMERO_PROPOSTA, 0, new IDVariant(v_VNUMEROPROPO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_ANNO_PROPOSTA, 0, new IDVariant(v_VANNOPROPOST));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI551, IMDBDef14.PQSL_PARAMETRI551_FINANZIAMENTO, 0, new IDVariant(v_VFINANZIAMEN));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoSoggettiLiq", "ProponiDaImpSubimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void CARICSOGGLIQ_PARAMETRI551() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI551_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI553, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI553, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI551_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI551_RS, 0, IMDBDef5.TBL_PARAMETRI553, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 0, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMNUMEIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 1, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMANNOIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 2, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARANUMESUBI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 3, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAANNOSUBI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 4, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 5, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 6, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 7, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 8, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 9, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 10, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 11, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAVOCEECON, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 12, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARACODIGEST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 13, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARATIPOVINC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 14, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 15, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 16, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARTIPPAPECA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 17, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_BOLLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 18, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 19, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 20, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_PARAMSCADENZ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 21, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_SPESE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 22, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_COMMISSIONI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 23, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_ALLEGATI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI551_RS, 24, 0, IMDBDef5.TBL_PARAMETRI553, IMDBDef5.FLD_PARAMETRI553_INFO_TESORIERE, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI553, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI553, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI553, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI551_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPORTFILE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPORTFILE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPORTFILE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPORTFILE);
    // Stub
  }

  private void PAN_IMPORTFILE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPORTFILE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPORTFILE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPORTFILE1, IMDBDef14.PQSL_IMPORTFILE1_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_IMPORTFILE1, IMDBDef14.PQSL_IMPORTFILE1_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_IMPORTFILE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGLIIMPEGN)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGLSUBIMPE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGDELILABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliDeliberaLabel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELILABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDeliberaLabel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGPROPLABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliPropopsteLabel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOPROPLABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposteLabel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORALABEL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPORTFILE_Init()
  {

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "1069D4FD-A173-4369-BDC4-3544F89F6865");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "PROGRESSIVO");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "60EB8845-394F-4F9C-ABDE-51024815DB76");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "SESSIONE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, 0, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "B51E9718-0BCC-4F45-926A-52910B920180");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "FASE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "E738634F-B59D-48D3-BB25-5D1E3AB7D077");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "FILE DATI");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPORTFILE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 92, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_PROGRESSIVO, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_PROGRESSIVO, PPQRY_IMPORTFILE1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 4, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_SESSIONE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_SESSIONE, PPQRY_IMPORTFILE1, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, "FASE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 4, 140, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, "FASE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FASE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FASE, PPQRY_IMPORTFILE1, "A.FASE", "FASE", 5, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 2);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, "FILE DATI");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 8, 8, 568, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 100);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 4);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, "FILE DATI");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FILEDATI, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FILEDATI, PPQRY_IMPORTFILE1, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
  }

  private void PAN_IMPORTFILE_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPORTFILE.SetIMDB(IMDB, "PQRY_IMPORTFILE1", true);
    PAN_IMPORTFILE.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT TESO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMETRFILE.ROWNAMEPROGR~~) ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE1, 5, SQL, -1, "");
    PAN_IMPORTFILE.SetQueryDB(PPQRY_IMPORTFILE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPORTFILE.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPORTFILE.Status() == 2)
    {
      int oldListQBE = PAN_IMPORTFILE.iUseListQBE;
      PAN_IMPORTFILE.iUseListQBE = 0;
      PAN_IMPORTFILE.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPORTFILE.PanelCommand(Glb.PCM_FIND);
      PAN_IMPORTFILE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "46E54278-6B45-48DA-B793-3B96AD4716E4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 32, 59, 600, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, "C3D39133-1B7D-4462-B4B1-B64F75800238");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, "Mandato Informatico");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, MyGlb.PANEL_LIST, 0, -9999, 976, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, MyGlb.PANEL_FORM, 32, 335, 560, 121, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, 0, 120);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 37);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, "A6C894AE-6875-4B76-948B-849019B01814");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, "Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, "625C80F4-F572-4380-8B5D-054E4142F76F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, "A176F994-55F4-4589-BA2A-369FA75C040D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, "FA325AB8-6402-49C6-A5F8-0CCCAE921765");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, "26EA1C2C-3C2D-4F2F-9D82-C019632224D4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, "Subimpegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, "41215DEE-4E3F-4EDA-871A-23F52889E2DC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, "2A06AED5-655E-4979-8E1F-48037F45D2CD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, "85A1FA30-0D45-4D10-80E7-34ADCAEB002A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "F99C0670-DF6F-4A91-9A85-9C90975318D4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "In Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "DDA21F19-D52A-4561-A6CD-4C947C8B15D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "Delibera");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "E1CA9D16-6822-4943-8626-EE50E95A5747");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "Sede Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, "26A618CD-27A3-402D-8F9E-EC96F19DCBD6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "128038A0-2D80-40E3-917B-1BB6F1BF230D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "Numero Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, "72A27B34-B1B1-4E0F-B521-66E7F1786C44");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "7DA33893-B784-41F2-AF07-82307AD3E9DE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "Anno Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, "9871F1A2-B57C-470F-BF02-3C662FB4EFA0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, "E11AB968-43B0-4B1D-9269-8F0DA4205459");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "DDB61702-BCAF-40DD-BE67-D6C83E58CF5B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "4B2373B3-2406-4650-B3AC-81956925B550");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "F39360ED-F5D9-4C10-9946-BD04E1873134");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, "714F9DEE-9FB1-4100-83AA-2E87EC46F9C9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, "669AC50E-4DE7-4BF2-9E7E-EA36A5F588C7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, "0E8FA8ED-FAAD-4359-B9DF-5EFC53F4D048");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, "Voce Economica");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, "0D1DBF60-3F6E-4C7B-A745-48DCBDF6754F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, "Codice Gestionale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "1D988BB4-184D-45B1-AE81-F22815F0A473");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "3DB552EB-9E96-4360-B01F-B1585371E93E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "5CE0623D-54CE-4605-9258-08001124986C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "Causale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "464CD4D7-1EB4-46C4-8930-813ED324E344");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "CD6A9303-87B8-4257-8A76-8CA79D947A48");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "Bollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "E715EE1E-99B8-4ED4-88F3-A6577A46BE0D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "DB98ACB1-FDDD-4E4D-A4E3-1ED2B04D7BBD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "48288DEE-F3EC-4DEF-B446-EA47F9EADE88");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "Scadenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "0460699D-6C0A-4C62-87F6-B9F0A86FC131");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "Spese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "F6BA6450-1455-45AE-95B5-AF6A101E9CE9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "Commissioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "BB75FD7C-9D2F-4F8E-B6F3-D690CA2D3369");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "Allegati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "0B1BDE04-7471-49D3-A7C9-63C59C798ED3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "Info Tesoriere");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "C0C3C89E-B735-4919-945E-82AD4C77CD4E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_LIST, "Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_FORM, 48, 8, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP, MyGlb.PANEL_FORM, "Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROIMP, PPQRY_PARAMETRI551, "A.PARAMNUMEIMP", "PARAMNUMEIMP", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_FORM, 160, 8, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOIMP, PPQRY_PARAMETRI551, "A.PARAMANNOIMP", "PARAMANNOIMP", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.PANEL_LIST, 272, 52, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.PANEL_FORM, 220, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLIIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGLIIMPEGN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGLIIMPEGN, -1, "", "SCEGLIIMPEGN", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.PANEL_LIST, 280, 60, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.PANEL_FORM, 240, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOIMPEGNO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Subimpegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 28, 32, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Subimpegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROSUBIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROSUBIMP, PPQRY_PARAMETRI551, "A.PARANUMESUBI", "PARANUMESUBI", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_FORM, 160, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOSUBIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOSUBIMP, PPQRY_PARAMETRI551, "A.PARAANNOSUBI", "PARAANNOSUBI", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.PANEL_LIST, 280, 60, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.PANEL_FORM, 220, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGLSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGLSUBIMPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGLSUBIMPE, -1, "", "SCEGLSUBIMPE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 288, 68, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 240, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOSUBIMPEG, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOSUBIMPEG, -1, "", "INFOSUBIMPEG", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 544, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 484, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INEMISSIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INEMISSIONE, PPQRY_PARAMETRI551, "A.PARAMINEMISS", "PARAMINEMISS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 20, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 36, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERLABEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, "Sd. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 112, 84, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, "Sd. Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDEL, PPQRY_PARAMETRI551, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 36, 24, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 164, 84, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "N. D.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 184, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI551, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 28, 16, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 232, 84, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "An. D.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 252, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "Ann. Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI551, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 264, 44, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 300, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGDELILABE, -1, "", "SCEGDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_LIST, 272, 52, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_FORM, 320, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELILABE, -1, "", "INFODELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 8, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 352, 84, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROPONE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROPONE, PPQRY_PARAMETRI551, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 3, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 464, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI551, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 528, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI551, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_LIST, 272, 52, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_FORM, 592, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGPROPLABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGPROPLABE, -1, "", "SCEGPROPLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.PANEL_LIST, 280, 60, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.PANEL_FORM, 612, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOPROPLABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOPROPLABE, -1, "", "INFOPROPLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_LIST, "Vc. Econ.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_FORM, 64, 116, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VOCEECONOMIC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VOCEECONOMIC, PPQRY_PARAMETRI551, "A.PARAVOCEECON", "PARAVOCEECON", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_LIST, "Codice Gestionale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_FORM, 48, 140, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEGESTIO, MyGlb.PANEL_FORM, "Codice Gestionale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEGESTIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEGESTIO, PPQRY_PARAMETRI551, "A.PARACODIGEST", "PARACODIGEST", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 88, 164, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVINCOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVINCOLO, PPQRY_PARAMETRI551, "A.PARATIPOVINC", "PARATIPOVINC", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 240, 36, 112, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 88, 188, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIZIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIZIONE, PPQRY_PARAMETRI551, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 104, 212, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAUSALE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAUSALE, PPQRY_PARAMETRI551, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 4, 236, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPPAGPERCAS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPPAGPERCAS, PPQRY_PARAMETRI551, "A.PARTIPPAPECA", "PARTIPPAPECA", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 120, 260, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLO, PPQRY_PARAMETRI551, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 112, 284, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI551, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 72, 308, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINANZIAMENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINANZIAMENT, PPQRY_PARAMETRI551, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 856, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 36, 360, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCADENZA, -1, GRP_PARAMETRI_MANDATINFORM);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCADENZA, PPQRY_PARAMETRI551, "A.PARAMSCADENZ", "PARAMSCADENZ", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 712, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 108, 384, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SPESE, -1, GRP_PARAMETRI_MANDATINFORM);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SPESE, PPQRY_PARAMETRI551, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 388, 384, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_COMMISSIONI, -1, GRP_PARAMETRI_MANDATINFORM);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_COMMISSIONI, PPQRY_PARAMETRI551, "A.COMMISSIONI", "COMMISSIONI", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 4, 264, 472, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 108, 408, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ALLEGATI, -1, GRP_PARAMETRI_MANDATINFORM);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ALLEGATI, PPQRY_PARAMETRI551, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 76, 432, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOTESORIER, -1, GRP_PARAMETRI_MANDATINFORM);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOTESORIER, PPQRY_PARAMETRI551, "A.INFO_TESORIERE", "INFO_TESORIERE", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 468, 332, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 508, 464, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.VOCE_ECON as VOCECORIVOEC, ");
    SQL.append("  TO_CHAR ( B.VOCE_ECON ) || ' - ' || A.DESCRIZIONE as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A, ");
    SQL.append("  RICLASSIFICAZIONI B ");
    SQL.append("where (B.VOCE_ECON = ~~PARAVOCEECON~~) ");
    SQL.append("and   (A.CODICE = B.VOCE_ECON) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(~~TBL_VALORICAP.ROWNAMETITOL~~, NVL(B.TITOLO, -1))) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(~~TBL_VALORICAP.ROWNAMECATEG~~, NVL(B.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODINT~~, NVL(B.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODTER~~, NVL(B.COD_TERZI, -1))) ");
    SQL.append("order by ");
    SQL.append("  B.VOCE_ECON ");
    PAN_PARAMETRI.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, PFL_PARAMETRI_VOCEECONOMIC, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.VOCE_ECON as VOCECORIVOEC, ");
    SQL.append("  TO_CHAR ( B.VOCE_ECON ) || ' - ' || A.DESCRIZIONE as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A, ");
    SQL.append("  RICLASSIFICAZIONI B ");
    SQL.append("where (A.CODICE = B.VOCE_ECON) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(~~TBL_VALORICAP.ROWNAMETITOL~~, NVL(B.TITOLO, -1))) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(~~TBL_VALORICAP.ROWNAMECATEG~~, NVL(B.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODINT~~, NVL(B.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODTER~~, NVL(B.COD_TERZI, -1))) ");
    SQL.append("order by ");
    SQL.append("  B.VOCE_ECON ");
    PAN_PARAMETRI.SetQuery(PPQRY_VOCIECONOMIC, 1, SQL, PFL_PARAMETRI_VOCEECONOMIC, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE_GESTIONALE as RICGESCODGES, ");
    SQL.append("  TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || C.DESCRIZIONE as RICGESCODGE1 ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST A, ");
    SQL.append("  RICLASSIFICAZIONI B, ");
    SQL.append("  CODICI_GESTIONALI C ");
    SQL.append("where (A.CODICE_GESTIONALE = ~~PARACODIGEST~~) ");
    SQL.append("and   (C.CODICE = A.CODICE_GESTIONALE) ");
    SQL.append("and   (A.PROGR_RICLASSIFICAZIONI = B.PROGRESSIVO) ");
    SQL.append("and   (C.E_S = B.E_S) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(~~TBL_VALORICAP.ROWNAMETITOL~~, NVL(B.TITOLO, -1))) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(~~TBL_VALORICAP.ROWNAMECATEG~~, NVL(B.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODINT~~, NVL(B.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODTER~~, NVL(B.COD_TERZI, -1))) ");
    SQL.append("and   (B.VOCE_ECON = ~~PARAVOCEECON~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE_GESTIONALE ");
    PAN_PARAMETRI.SetQuery(PPQRY_RICLASSIGEST, 0, SQL, PFL_PARAMETRI_CODICEGESTIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE_GESTIONALE as RICGESCODGES, ");
    SQL.append("  TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || C.DESCRIZIONE as RICGESCODGE1 ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST A, ");
    SQL.append("  RICLASSIFICAZIONI B, ");
    SQL.append("  CODICI_GESTIONALI C ");
    SQL.append("where (C.CODICE = A.CODICE_GESTIONALE) ");
    SQL.append("and   (A.PROGR_RICLASSIFICAZIONI = B.PROGRESSIVO) ");
    SQL.append("and   (C.E_S = B.E_S) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(~~TBL_VALORICAP.ROWNAMETITOL~~, NVL(B.TITOLO, -1))) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(~~TBL_VALORICAP.ROWNAMECATEG~~, NVL(B.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODINT~~, NVL(B.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(~~TBL_VALORICAP.ROWNAMCODTER~~, NVL(B.COD_TERZI, -1))) ");
    SQL.append("and   (B.VOCE_ECON = ~~PARAVOCEECON~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE_GESTIONALE ");
    PAN_PARAMETRI.SetQuery(PPQRY_RICLASSIGEST, 1, SQL, PFL_PARAMETRI_CODICEGESTIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_RICLASSIGEST, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLCODIC1 ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~PARATIPOVINC~~) ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLCODIC1 ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAMETRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~PARTIPPAPECA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T02, 0, SQL, PFL_PARAMETRI_TIPPAGPERCAS, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T02, 1, SQL, PFL_PARAMETRI_TIPPAGPERCAS, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A, ");
    SQL.append("  IMP_FIN B ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.CODICE = B.FINANZIAMENTO) ");
    SQL.append("and   (NVL(A.SCADENZA, 2999) >= DECODE(~~PARAANNOSUBI~~, to_number(NULL), ~~PARAMANNOIMP~~, 3000)) ");
    SQL.append("and   (B.ANNO_IMP = DECODE(~~PARAANNOSUBI~~, to_number(NULL), ~~PARAMANNOIMP~~, 0)) ");
    SQL.append("and   (B.NUMERO_IMP = DECODE(~~PARANUMESUBI~~, to_number(NULL), ~~PARAMNUMEIMP~~, 0)) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAMETRI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_PARAMETRI_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A, ");
    SQL.append("  IMP_FIN B ");
    SQL.append("where (A.CODICE = B.FINANZIAMENTO) ");
    SQL.append("and   (NVL(A.SCADENZA, 2999) >= DECODE(~~PARAANNOSUBI~~, to_number(NULL), ~~PARAMANNOIMP~~, 3000)) ");
    SQL.append("and   (B.ANNO_IMP = DECODE(~~PARAANNOSUBI~~, to_number(NULL), ~~PARAMANNOIMP~~, 0)) ");
    SQL.append("and   (B.NUMERO_IMP = DECODE(~~PARANUMESUBI~~, to_number(NULL), ~~PARAMNUMEIMP~~, 0)) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAMETRI.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_PARAMETRI_FINANZIAMENT, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARAMETRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI551", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI551, IMDBDef14.PQRY_PARAMETRI551_RS, IMDBDef5.TBL_PARAMETRI553);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROIMP, IMDBDef5.FLD_PARAMETRI553_PARAMNUMEIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOIMP, IMDBDef5.FLD_PARAMETRI553_PARAMANNOIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROSUBIMP, IMDBDef5.FLD_PARAMETRI553_PARANUMESUBI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOSUBIMP, IMDBDef5.FLD_PARAMETRI553_PARAANNOSUBI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INEMISSIONE, IMDBDef5.FLD_PARAMETRI553_PARAMINEMISS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDEL, IMDBDef5.FLD_PARAMETRI553_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef5.FLD_PARAMETRI553_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef5.FLD_PARAMETRI553_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROPONE, IMDBDef5.FLD_PARAMETRI553_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef5.FLD_PARAMETRI553_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef5.FLD_PARAMETRI553_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VOCEECONOMIC, IMDBDef5.FLD_PARAMETRI553_PARAVOCEECON);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICEGESTIO, IMDBDef5.FLD_PARAMETRI553_PARACODIGEST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVINCOLO, IMDBDef5.FLD_PARAMETRI553_PARATIPOVINC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIZIONE, IMDBDef5.FLD_PARAMETRI553_DESCRIZIONE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAUSALE, IMDBDef5.FLD_PARAMETRI553_CAUSALE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPPAGPERCAS, IMDBDef5.FLD_PARAMETRI553_PARTIPPAPECA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLO, IMDBDef5.FLD_PARAMETRI553_BOLLO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI553_UFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FINANZIAMENT, IMDBDef5.FLD_PARAMETRI553_FINANZIAMENTO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCADENZA, IMDBDef5.FLD_PARAMETRI553_PARAMSCADENZ);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SPESE, IMDBDef5.FLD_PARAMETRI553_SPESE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_COMMISSIONI, IMDBDef5.FLD_PARAMETRI553_COMMISSIONI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ALLEGATI, IMDBDef5.FLD_PARAMETRI553_ALLEGATI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INFOTESORIER, IMDBDef5.FLD_PARAMETRI553_INFO_TESORIERE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI553");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
