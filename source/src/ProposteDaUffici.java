// **********************************************
// Proposte Da Uffici
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProposteDaUffici extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_ASSESTAMENT1 = 0;
  private static int PFL_PARAM_ASSESTDESCRI = 1;

  private static int PPQRY_PARAM156 = 0;

  private static int PPQRY_ASSESTAMENTI = 1;


  IDPanel PAN_PARAM;
  private static int GRP_PROPOSTE_INSERIMENTO = 0;
  private static int GRP_PROPOSTE_AGGIORNAMENT = 1;

  private static int PFL_PROPOSTE_STATO = 0;
  private static int PFL_PROPOSTE_PARTE = 1;
  private static int PFL_PROPOSTE_CAPITOLO1 = 2;
  private static int PFL_PROPOSTE_ARTICOLO1 = 3;
  private static int PFL_PROPOSTE_ISTNC = 4;
  private static int PFL_PROPOSTE_IMPORTI = 5;
  private static int PFL_PROPOSTE_IMPORTO2 = 6;
  private static int PFL_PROPOSTE_IMPORTO3 = 7;
  private static int PFL_PROPOSTE_DESCRIZIONE = 8;
  private static int PFL_PROPOSTE_TIPOVAR = 9;
  private static int PFL_PROPOSTE_VARBIL2012 = 10;
  private static int PFL_PROPOSTE_VARBIL2 = 11;
  private static int PFL_PROPOSTE_VARBIL3 = 12;
  private static int PFL_PROPOSTE_CONSSVIL = 13;
  private static int PFL_PROPOSTE_PROGETTO = 14;
  private static int PFL_PROPOSTE_FINANZIAMENT = 15;
  private static int PFL_PROPOSTE_OPERA = 16;
  private static int PFL_PROPOSTE_FATTORE = 17;
  private static int PFL_PROPOSTE_CENTRO = 18;
  private static int PFL_PROPOSTE_UNITAORGANI1 = 19;
  private static int PFL_PROPOSTE_ETICHETSLASH = 20;
  private static int PFL_PROPOSTE_ETICHESCELTA = 21;
  private static int PFL_PROPOSTE_ETICHEIMPORT = 22;
  private static int PFL_PROPOSTE_ETICHEIMPOR1 = 23;
  private static int PFL_PROPOSTE_ETICHEIMPOR2 = 24;
  private static int PFL_PROPOSTE_UTENTE1 = 25;
  private static int PFL_PROPOSTE_DATA1 = 26;
  private static int PFL_PROPOSTE_UTENTE = 27;
  private static int PFL_PROPOSTE_DATA = 28;
  private static int PFL_PROPOSTE_ETICNOTAVUOT = 29;
  private static int PFL_PROPOSTE_ETICNOTAPIEN = 30;
  private static int PFL_PROPOSTE_NOTE = 31;
  private static int PFL_PROPOSTE_ETICHETTNOTE = 32;
  private static int PFL_PROPOSTE_CAPITOLO = 33;
  private static int PFL_PROPOSTE_ARTICOLO = 34;
  private static int PFL_PROPOSTE_ASSESTAMENTO = 35;
  private static int PFL_PROPOSTE_NOTE1 = 36;
  private static int PFL_PROPOSTE_UNITAORGANIZ = 37;
  private static int PFL_PROPOSTE_PROGETDESCRI = 38;
  private static int PFL_PROPOSTE_ETICHEFINOPE = 39;
  private static int PFL_PROPOSTE_ESERCIZIO = 40;
  private static int PFL_PROPOSTE_ETICHINFOPEG = 41;
  private static int PFL_PROPOSTE_OPEREDESCRIZ = 42;
  private static int PFL_PROPOSTE_FINANZDESCRI = 43;
  private static int PFL_PROPOSTE_TIPO = 44;
  private static int PFL_PROPOSTE_FATTORDESCRI = 45;
  private static int PFL_PROPOSTE_CENTRIDESCRI = 46;
  private static int PFL_PROPOSTE_ETICCAPIFORM = 47;

  private static int PPQRY_PROPOSTEVB2 = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_UNITAORGANIZ = 2;
  private static int PPQRY_PROGETTI = 3;
  private static int PPQRY_OPERE = 4;
  private static int PPQRY_FINANZIAMENT = 5;
  private static int PPQRY_FATTORI = 6;
  private static int PPQRY_CENTRI = 7;

  private static int PPQRY_T54 = 8;
  private static int PPQRY_DUAL1 = 9;
  private static int PPQRY_DUAL2 = 10;


  IDPanel PAN_PROPOSTE;
  private static int PFL_FINANZIAMENT_FINANZOPERA = 0;
  private static int PFL_FINANZIAMENT_ETICHINFOFIN = 1;
  private static int PFL_FINANZIAMENT_ETICHINFOOPE = 2;

  private static int PPQRY_FINANZIAMEN2 = 0;

  private static int PPQRY_BILFIN = 1;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM8(IMDB);
    Init_TBL_FINANZIAMENT(IMDB);
    //
    //
    Init_PQRY_PARAM156(IMDB);
    Init_PQRY_PARAM156_RS(IMDB);
    Init_PQRY_PROPOSTEVB2(IMDB);
    Init_PQRY_FINANZIAMEN2(IMDB);
    Init_PQRY_FINANZIAMEN2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAM8, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAM8, "TBL_PARAM8");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM8,IMDBDef7.FLD_PARAM8_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM8,IMDBDef7.FLD_PARAM8_NOMEOGGECODI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM8,IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, "NOMEOGGECHIU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM8,IMDBDef7.FLD_PARAM8_NOMEOGGECHIU,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM8,IMDBDef7.FLD_PARAM8_NOMEOGGEGENE, "NOMEOGGEGENE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM8,IMDBDef7.FLD_PARAM8_NOMEOGGEGENE,5,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAM8, 0);
  }

  private static void Init_TBL_FINANZIAMENT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_FINANZIAMENT, 1);
    IMDB.set_TblCode(IMDBDef7.TBL_FINANZIAMENT, "TBL_FINANZIAMENT");
    IMDB.set_FldCode(IMDBDef7.TBL_FINANZIAMENT,IMDBDef7.FLD_FINANZIAMENT_NOMEOGGEFINO, "NOMEOGGEFINO");
    IMDB.SetFldParams(IMDBDef7.TBL_FINANZIAMENT,IMDBDef7.FLD_FINANZIAMENT_NOMEOGGEFINO,5,52,0);
    IMDB.TblAddNew(IMDBDef7.TBL_FINANZIAMENT, 0);
  }

  private static void Init_PQRY_PARAM156(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM156, 1);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM156, "PQRY_PARAM156");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM156,IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM156,IMDBDef17.PQSL_PARAM156_NOMEOGGECODI,1,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAM156, 0);
  }

  private static void Init_PQRY_PARAM156_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM156_RS, 1);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM156_RS, "PQRY_PARAM156_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM156_RS,IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM156_RS,IMDBDef17.PQSL_PARAM156_NOMEOGGECODI,1,2,0);
  }

  private static void Init_PQRY_PROPOSTEVB2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PROPOSTEVB2, 34);
    IMDB.set_TblCode(IMDBDef17.PQRY_PROPOSTEVB2, "PQRY_PROPOSTEVB2");
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_TIPO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ASSESTAMENTO, "ASSESTAMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ASSESTAMENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_VAR_BIL_1, "VAR_BIL_1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_VAR_BIL_1,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_CONS_SVILUPPO, "CONS_SVILUPPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_CONS_SVILUPPO,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_UTENTE_AGGIORNAMENTO, "UTENTE_AGGIORNAMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_UTENTE_AGGIORNAMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_DATA_ULT_AGG, "DATA_ULT_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_DATA_ULT_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_STANZIAMENTO, "PROGR_STANZIAMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_STANZIAMENTO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_STANZIAMENTO_FC, "PROGR_STANZIAMENTO_FC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_STANZIAMENTO_FC,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_VARCOM_1, "PROGR_VARCOM_1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_VARCOM_1,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_VARCOMPRO_1, "PROGR_VARCOMPRO_1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_VARCOMPRO_1,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_NOTE1, "NOTE1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_NOTE1,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_VAR_BIL_2, "VAR_BIL_2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_VAR_BIL_2,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_VAR_BIL_3, "VAR_BIL_3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB2,IMDBDef17.PQSL_PROPOSTEVB2_VAR_BIL_3,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PROPOSTEVB2, 0);
  }

  private static void Init_PQRY_FINANZIAMEN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FINANZIAMEN2, 1);
    IMDB.set_TblCode(IMDBDef17.PQRY_FINANZIAMEN2, "PQRY_FINANZIAMEN2");
    IMDB.set_FldCode(IMDBDef17.PQRY_FINANZIAMEN2,IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO, "NOMEOGGEFINO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FINANZIAMEN2,IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO,5,52,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FINANZIAMEN2, 0);
  }

  private static void Init_PQRY_FINANZIAMEN2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FINANZIAMEN2_RS, 1);
    IMDB.set_TblCode(IMDBDef17.PQRY_FINANZIAMEN2_RS, "PQRY_FINANZIAMEN2_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_FINANZIAMEN2_RS,IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO, "NOMEOGGEFINO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FINANZIAMEN2_RS,IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO,5,52,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProposteDaUffici(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProposteDaUffici()
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
    FormIdx = MyGlb.FRM_PROPODAUFFIC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "569181DE-9962-435D-B541-C1D396746E04";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 618;
    set_Caption(new IDVariant("Proposte Da Uffici"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 592;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0878378;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 880;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AD31C914-1674-4D06-B497-68BF75CDAEA3");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 316, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 880;
    Frames[3].Height = 540;
    Frames[3].Caption = "Proposte";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 540;
    PAN_PROPOSTE = new IDPanel(w, this, 3, "PAN_PROPOSTE");
    Frames[3].Content = PAN_PROPOSTE;
    PAN_PROPOSTE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROPOSTE.VS = MainFrm.VisualStyleList;
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 540-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "389CBF45-961B-48D5-B622-AB2F41833E04");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1652, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROPOSTE.InitStatus = 2;
    PAN_PROPOSTE_Init();
    PAN_PROPOSTE_InitFields();
    PAN_PROPOSTE_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_PROPOSTE.SetSubFrame(PFL_PROPOSTE_ETICHEFINOPE,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Finanziamento";
    Frames[4].Parent = this;
    PAN_FINANZIAMENT = new IDPanel(w, this, 4, "PAN_FINANZIAMENT");
    Frames[4].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.Lockable = false;
    PAN_FINANZIAMENT.iLocked = false;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5DC1633B-7224-41C7-9D9D-9A2900C2E7F5");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 424, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG130+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG167+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG130+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_TOTALIPROPOS+BaseCmdLinIdx)
      {
        ControlliTotali();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTRODISPON+BaseCmdLinIdx)
      {
        ControlloDisponibilita();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTROQUADRA+BaseCmdLinIdx)
      {
        ControlloQuadratura();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVARDIBIL+BaseCmdLinIdx)
      {
        AggiornamentoVariazioniDiBilancio();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAVARIA5+BaseCmdLinIdx)
      {
        GenerazioneVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMVARIGENE+BaseCmdLinIdx)
      {
        EliminazioneVariazioniGenerate();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAM8, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROPODAUFFIC_PARAM156();
      }
      if (IMDB.TblModified(IMDBDef7.TBL_FINANZIAMENT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROPODAUFFIC_FINANZIAMEN2();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_PROPOSTE.UpdatePanel(MainFrm);
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAASSEST && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_ASSESTAMENT1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROGET && flRis && IdxPanelActived == PAN_PROPOSTE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROPOSTE_PROGETTO) {
      IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI6, IMDBDef7.PQSL_PROGETTI6_PROGETTO_ID, 0));
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEFINIMPACC && flRis && IdxPanelActived == PAN_PROPOSTE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROPOSTE_FINANZIAMENT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAOPERE && flRis && IdxPanelActived == PAN_PROPOSTE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROPOSTE_OPERA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_PROPOSTE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROPOSTE_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_PROPOSTE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROPOSTE_CENTRO) {
      IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PROPOSTE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROPOSTE_ETICHESCELTA) {
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
    return (obj instanceof ProposteDaUffici);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProposteDaUffici.class.getName() : (Glb.ClassWithPackage(ProposteDaUffici.class) ? ProposteDaUffici.class.getName().substring(ProposteDaUffici.class.getPackage().getName().length() + 1) : ProposteDaUffici.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Finanziamento On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZIAMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZIAMENT);
      // 
      // Finanziamento On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_FINANZIAMEN2, IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO, 0),(new IDVariant("@"))).compareTo((new IDVariant("@")), true)!=0)
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).equals((new IDVariant("SI")), true))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "FinanziamentoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Finanziamento Finanz.-Opera Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_FINANZIAMENT_FINANZOPERA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento Finanz.-Opera Validate Body
      // Corpo Procedura
      // 
      IDVariant v_FINOPE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FINANZIAMEN2, IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_FINANZIAMENTO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_OPERA, 0, (new IDVariant()));
      }
      else
      {
        v_FINOPE = IMDB.Value(IMDBDef17.PQRY_FINANZIAMEN2, IMDBDef17.PQSL_FINANZIAMEN2_NOMEOGGEFINO, 0);
        v_FINANZIAMENT = IDL.ToInteger(MainFrm.Sottostringapb(v_FINOPE, (new IDVariant("@"))));
        v_OPERA = IDL.ToInteger(v_FINOPE);
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_OPERA, 0, new IDVariant(v_OPERA));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "FinanziamentoFinanz.-OperaValidate", _e);
    }
  }

  // **********************************************************************
  // Info Finanziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Finanziamento Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "InfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Opera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Opera Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI21, IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_INFOSULLOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "InfoOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Info peg
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfopeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info peg Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "EtichettaInfopeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Note
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Note Body
      // Corpo Procedura
      // 
      IDVariant v_ANNOTAZIONI = new IDVariant(0,IDVariant.STRING);
      v_ANNOTAZIONI = (new IDVariant("Annotazioni"));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_NOTE, 0), v_ANNOTAZIONI, ((IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).equals((new IDVariant("SI"))))?(new IDVariant(0)):(new IDVariant(-1))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "EtichettaNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaScelta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_E_S, 0));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "EtichettaScelta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Assestamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Assestamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Assestamento Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAASSEST, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "Assestamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Totali
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlliTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Totali Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAM9, IMDBDef7.FLD_PARAM9_NOMEOGGECODI, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAM9, IMDBDef7.FLD_PARAM9_NOMEOGGEDESC, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_ASSESTDESCRI))));
      IMDB.set_Value(IMDBDef7.TBL_PARAM9, IMDBDef7.FLD_PARAM9_NOMEOGGETIPO, 0, ((IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).equals((new IDVariant("SI"))))?(new IDVariant(2)):(new IDVariant(1))));
      MainFrm.Show(MyGlb.FRM_TOTALIPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ControlliTotali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Finanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMES, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "Finanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Opera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Opera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opera Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEES, 0, IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAOPERE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "Opera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Disponibilita
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlloDisponibilita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Disponibilita Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAM116, IMDBDef7.FLD_PARAM116_NOMEOGGEASSE, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
      MainFrm.Show(MyGlb.FRM_CONTRODISPON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ControlloDisponibilita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Quadratura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlloQuadratura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Quadratura Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMEOGGEASSE, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
      MainFrm.Show(MyGlb.FRM_CONTROQUADR1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ControlloQuadratura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiornamento Variazioni Di Bilancio
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornamentoVariazioniDiBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento Variazioni Di Bilancio Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare l'assestamento"))); 
        return 0;
      }
      IMDB.set_Value(IMDBDef7.TBL_PARAM118, IMDBDef7.FLD_PARAM118_NOMEOGGEASSE, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
      MainFrm.Show(MyGlb.FRM_AGGIVARIBILA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "AggiornamentoVariazioniDiBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Generazione Variazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare l'assestamento"))); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Assestamento Aperto"))); 
        return 0;
      }
      IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
      MainFrm.Show(MyGlb.FRM_GENERAVARIAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "GenerazioneVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Eliminazione Variazioni Generate
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EliminazioneVariazioniGenerate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Eliminazione Variazioni Generate Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare l'assestamento"))); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGEGENE, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare un'assestamento generato!"))); 
        return 0;
      }
      IMDB.set_Value(IMDBDef7.TBL_PARAM142, IMDBDef7.FLD_PARAM142_NOMEOGGEASSE, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
      MainFrm.Show(MyGlb.FRM_ELIMVARIGENE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "EliminazioneVariazioniGenerate", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR11+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR11+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ParamOnDynamicProperties", _e);
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
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAASSEST)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0, IMDB.Value(IMDBDef7.PQRY_ASSESTAMENT1, IMDBDef7.PQSL_ASSESTAMENT1_ASSESTCODICE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROGET)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI6, IMDBDef7.PQSL_PROGETTI6_PROGETTO_ID, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELUNITORGA)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_PROGR_UNITA_ORGANIZZATIVA, 0, IMDB.Value(IMDBDef7.PQRY_UNITAORGANIZ, IMDBDef7.PQSL_UNITAORGANIZ_SO4ANAUNORPR, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_NOTE, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFINIMPACC)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_FINANZIAMENTO, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME10, IMDBDef7.PQSL_FINANZIAME10_CODICE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAOPERE)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_OPERA, 0, IMDB.Value(IMDBDef7.PQRY_OPERE5, IMDBDef7.PQSL_OPERE5_CODICE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "EndModal", _e);
    }
  }

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
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTI, IDL.Add((new IDVariant("Importo ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTO2, IDL.Add((new IDVariant("Importo ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTO3, IDL.Add((new IDVariant("Importo ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_VARBIL2012, IDL.Add((new IDVariant("Var.Bil. ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_VARBIL2, IDL.Add((new IDVariant("Var.Bil. ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_VARBIL3, IDL.Add((new IDVariant("Var.Bil. ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_ETICHEIMPORT, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_ETICHEIMPOR1, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_ETICHEIMPOR2, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      if (MainFrm.FunctionRppAttiva().equals((new IDVariant(0)), true))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_PROPOSTE.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (MainFrm.ControlloFaseEsefin(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).equals((new IDVariant(-1)), true))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.ControlloFaseEsefin(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).equals((new IDVariant(-1)), true))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      set_Caption((new IDVariant("Proposte Variazioni")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "Load", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECODI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGEGENE, 0, new IDVariant());
  }

  // **********************************************************************
  // Proposte On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROPOSTE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROPOSTE);
      // 
      // Proposte On Dynamic Properties Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_PROPOSTE.Layout())).equals((new IDVariant(0)), true))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTI, IDL.Add((new IDVariant("Importo ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTO2, IDL.Add((new IDVariant("Importo ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTO3, IDL.Add((new IDVariant("Importo ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_ISTNC, (new IDVariant("Ist.N.C.")).stringValue());
        PAN_PROPOSTE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_PROPOSTE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        if (IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).equals((new IDVariant("SI")), true))
        {
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          if (IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGEGENE, 0).equals((new IDVariant("SI")), true))
          {
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_TOTALIPROPOS+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_TOTALIPROPOS+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          if (IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_STATO, 0).equals((new IDVariant("N")), true))
          {
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_PROPOSTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_IMPORTI, (new IDVariant("Importi")).stringValue());
        PAN_PROPOSTE.set_Header(Glb.OBJ_FIELD,PFL_PROPOSTE_ISTNC, (new IDVariant("Nuova")).stringValue());
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ISTITUZIONE_NC, 0))))
        {
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_NOTE, 0))))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, 0))))
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSTE.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ProposteOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Proposte On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_PROPOSTE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        PAN_PROPOSTE.set_Layout((new IDVariant(1)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ProposteOnCommand", _e);
    }
  }

  // **********************************************************************
  // Proposte On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PROPOSTE_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PROPOSTE, Cancel);
      // 
      // Proposte On Validate Row Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, 0))))
      {
        IDVariant v_UNITAORG = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR ");
        SQL.append("from ");
        SQL.append("  CAP_UO A ");
        SQL.append("where (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_UNITAORG = QV.Get("CAPUOPROUNOR", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_PROGR_UNITA_ORGANIZZATIVA, 0, new IDVariant(v_UNITAORG));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ProposteOnValidateRow", _e);
    }
  }

  // **********************************************************************
  // Proposte chiuso nullo Ist N C Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PROPOSTE_ISTNC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte chiuso nullo Ist N C Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ISTITUZIONE_NC, 0))))
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_CAPITOLO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ARTICOLO, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "PropostechiusonulloIstNCValidate", _e);
    }
  }

  // **********************************************************************
  // Proposte On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PROPOSTE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ASSESTAMENTO, 0, IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_TIPO, 0, ((IMDB.Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0).equals((new IDVariant("SI"))))?(new IDVariant(2)):(new IDVariant(1))));
      }
      else
      {
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_UTENTE_AGGIORNAMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB2, IMDBDef17.PQSL_PROPOSTEVB2_DATA_ULT_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ProposteOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Proposte On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_PROPOSTE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PROPOSTE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Proposte On Database Error Body
      // Corpo Procedura
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ProposteOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Param Assestamento Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_ASSESTAMENT1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Assestamento Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0))))
      {
        IDVariant v_CHIUSO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_GENERATO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CHIUSO as ASSESTCHIUSO, ");
        SQL.append("  A.GENERATO as ASSESTGENERA ");
        SQL.append("from ");
        SQL.append("  ASSESTAMENTI A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CHIUSO = QV.Get("ASSESTCHIUSO", IDVariant.STRING) ;
          v_GENERATO = QV.Get("ASSESTGENERA", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECHIU, 0, new IDVariant(v_CHIUSO));
        IMDB.set_Value(IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGEGENE, 0, new IDVariant(v_GENERATO));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaUffici", "ParamAssestamentoValidate", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PROPODAUFFIC_PARAM156() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAM156_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM8, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAM8, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAM156_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAM156_RS, 0, IMDBDef7.TBL_PARAM8, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM156_RS, 0, 0, IMDBDef7.TBL_PARAM8, IMDBDef7.FLD_PARAM8_NOMEOGGECODI, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAM8, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAM8, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM8, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAM156_RS, 0);
  }

  // **********************************************************************
  // Finanziamento
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PROPODAUFFIC_FINANZIAMEN2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_FINANZIAMEN2_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_FINANZIAMENT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_FINANZIAMENT, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_FINANZIAMEN2_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_FINANZIAMEN2_RS, 0, IMDBDef7.TBL_FINANZIAMENT, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FINANZIAMEN2_RS, 0, 0, IMDBDef7.TBL_FINANZIAMENT, IMDBDef7.FLD_FINANZIAMENT_NOMEOGGEFINO, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_FINANZIAMENT, 0);
      if (IMDB.Eof(IMDBDef7.TBL_FINANZIAMENT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_FINANZIAMENT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_FINANZIAMEN2_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ASSESTAMENT1)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Assestamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_ASSESTAMENT1)
      {
        PFL_PARAM_ASSESTAMENT1_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void PAN_PROPOSTE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PROPOSTE_PROGETTO)
    {
      IdxPanelActived = PAN_PROPOSTE.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELTAPROGET, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_PROPOSTE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Finanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_OPERA)
    {
      this.IdxPanelActived = this.PAN_PROPOSTE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Opera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_FATTORE)
    {
      IdxPanelActived = PAN_PROPOSTE.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_CENTRO)
    {
      IdxPanelActived = PAN_PROPOSTE.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELTACENTRI, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_ETICHESCELTA)
    {
      this.IdxPanelActived = this.PAN_PROPOSTE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaScelta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_ETICNOTAVUOT)
    {
      this.IdxPanelActived = this.PAN_PROPOSTE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_ETICNOTAPIEN)
    {
      this.IdxPanelActived = this.PAN_PROPOSTE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSTE_ETICHINFOPEG)
    {
      this.IdxPanelActived = this.PAN_PROPOSTE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfopeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PROPOSTE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PROPOSTE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PROPOSTE_ISTNC)
      {
        PFL_PROPOSTE_ISTNC_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PROPOSTE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROPOSTE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANZIAMENT_ETICHINFOFIN)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_ETICHINFOOPE)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FINANZIAMENT_FINANZOPERA)
      {
        PFL_FINANZIAMENT_FINANZOPERA_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, "E749BC9B-547C-4674-821F-DBA7CDC4AC47");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, "Assestamento");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, "35B3BE37-51A5-490D-B7D8-550CB12BBF8C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, "ASSESTAMENTI DESCRIZIONE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_LIST, "Assest.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_FORM, 48, 12, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_FORM, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENT1, MyGlb.PANEL_FORM, "Assestamento");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ASSESTAMENT1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ASSESTAMENT1, PPQRY_PARAM156, "A.NOMEOGGECODI", "NOMEOGGECODI", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_LIST, 172);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_LIST, "ASSESTAMENTI DESCRIZIONE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_FORM, 208, 12, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_FORM, 172);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTDESCRI, MyGlb.PANEL_FORM, "ASSESTAMENTI DESCRIZIONE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ASSESTDESCRI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ASSESTDESCRI, PPQRY_ASSESTAMENTI, "A.DESCRIZIONE", "ASSESTDESCRI", 5, 50, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ASSESTDESCRI, ");
    SQL.append("  A.CHIUSO as ASSESTCHIUSO ");
    SQL.append("from ");
    SQL.append("  ASSESTAMENTI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE = ~~NOMEOGGECODI~~) ");
    PAN_PARAM.SetQuery(PPQRY_ASSESTAMENTI, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_ASSESTAMENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_ASSESTAMENTI, "ASSESTAMENTI");
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM156", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM156, IMDBDef17.PQRY_PARAM156_RS, IMDBDef7.TBL_PARAM8);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ASSESTAMENT1, IMDBDef7.FLD_PARAM8_NOMEOGGECODI);
    PAN_PARAM.SetMasterTable(0, "PARAM8");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PROPOSTE_Init()
  {

    PAN_PROPOSTE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROPOSTE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, "C368B3A4-5075-403B-B533-1B0C2452577C");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, "Inserimento");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, MyGlb.PANEL_FORM, 52, 363, 256, 49, 0, 0);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, 0, 70);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, 1, 13);
    PAN_PROPOSTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, 0, 4);
    PAN_PROPOSTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, 1, 4);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_GROUP, GRP_PROPOSTE_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, "BA8E1218-250C-4A2B-A738-8C0D71965FA2");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, "Aggiornamento");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, MyGlb.PANEL_FORM, 328, 363, 252, 49, 0, 0);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, 0, 88);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, 1, 13);
    PAN_PROPOSTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, 0, 4);
    PAN_PROPOSTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, 1, 4);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_GROUP, GRP_PROPOSTE_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROPOSTE.SetSize(MyGlb.OBJ_FIELD, 48);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, "48CAE4AD-A7F7-4F77-BBB2-02F0217C6DFF");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, "Stato");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, "39A39111-B9C3-4281-852C-85F0056DBB9B");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, "Parte");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, "59210103-F09A-4E90-BE9D-A182D5C88D70");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, "Capitolo/Art.");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.VIS_NOFIINLUHELE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, "C8364093-DF1A-4BF8-838D-7E6EC1CC2C17");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, " ");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.VIS_NOFINOBOVEHE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, "3A786855-8735-48E8-9AE9-01D7FD965925");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, "Ist. N.C.");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.VIS_CHECKSTYLE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, "1F1537B7-45B7-421D-8361-A627039E77FC");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, "Importi");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, "4BACBEF4-EB77-4816-829E-1C4602E1E017");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, "IMPORTO 2");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, "2EC6BD50-89A7-4065-AB13-BD03E1D0DF4F");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, "IMPORTO 3");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, "3F164557-3E78-4C04-8AB4-D82D5AC8AF55");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, "Descrizione");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, "74391B2A-4756-4E22-BD0E-BDCC55E79310");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, "Tipo Var");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, "BAF2BDE1-A7BA-4221-A685-E73714AEE3B8");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, "Var.Bil. 2012");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.VIS_CHECKSTYLE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, "FA49738E-D4EA-4485-9586-5B4E35D29DB0");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, "VAR BIL 2");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.VIS_CHECKSTYLE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, "9DCFE298-033C-4ED9-8F73-68BB7FF1FCC6");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, "VAR BIL 3");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.VIS_CHECKSTYLE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, "002786B5-45F6-424D-929B-BFC8A4864EDD");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, "Cons./Svil.");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, "64BAEDEF-0649-41E5-9472-D6BA99582327");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, "Obiettivo Operativo");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, "85794D58-FDE6-4B51-B588-CF446FAEC0FE");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, "Finanziamento");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, "40116B08-A368-4BA9-9A69-FCD9EE09B686");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, "Opera");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, "0EDD333C-FDB3-437E-A7B0-B04AAB492AE3");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, "Fattore");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, "6248CA05-2ECF-4A02-9A7C-80F1797741AF");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, "Centro");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, "F776F0A4-36BE-436D-AB3C-DA43CBA74EEB");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, "Unità Organizzativa");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, "B8EDFEB5-0B0A-48CB-89EE-EB63E9563600");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, "/");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.VIS_VUOTOGRASSET);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, "516B81CE-CB3C-4BD5-8DEB-E28A0C8C588C");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.VIS_STATICBUTTON);
    PAN_PROPOSTE.SetImage(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, 0, "wsearch1.gif", false);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, "ACA1A6DB-45A2-4A4F-9686-9EAB4F14B79C");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, "2012");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.VIS_VUOTOGRASSET);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, "BB211CF3-8D0E-45E4-A8F1-E83440EE9170");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, "2013");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.VIS_VUOTOGRASSET);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, "24AEAE95-EF97-4851-9471-92EA165B330B");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, "2013");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.VIS_VUOTOGRASSET);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, "92E4FC24-0769-4651-B060-DC7057EC757D");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, "Utente");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, "F604A92D-BD5A-4B44-A898-1E96DFBFBC22");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, "Data");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, "F5296E46-AE34-4D59-ADD7-55DD2AAE7A56");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, "Utente ");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "B2CE2627-D20B-4D43-BD51-BEB5EECCE7F9");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "Data ");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, "7E8E54D5-A7BF-4A68-9FFC-AE8F7D6D1143");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.VIS_STATICBUTTON);
    PAN_PROPOSTE.SetImage(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, 0, "nota bianca.gif", false);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, "4E3E93B8-9F3F-4496-8E7C-4A6BE255C44D");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.VIS_STATICBUTTON);
    PAN_PROPOSTE.SetImage(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, 0, "nota scritta.gif", false);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, "66F002FB-06AD-44E6-997F-EA5EF59404FF");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, "NOTE");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, "DD90B32D-995D-43A4-BC3A-D5AA3EBC1457");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, "Note");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.VIS_VUOTOGRASSET);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, "EC105389-0AE5-4336-A23A-1B6E0CE30CBD");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, "Capitolo ");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, "A GET DESCRIZIONE CAP (Sessione Esercizio, Record Parte [Proposte Assestamento - Proposte chiuso nullo], Record Voce P E G [Proposte Assestamento - Proposte chiuso nullo], Record Capitolo [Proposte Assestamento - Proposte chiuso nullo], 0)");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, "5E8B5A5D-80F1-4582-AE99-E07F8FA58900");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, "Articolo ");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, "A GET DESCRIZIONE CAP (Sessione Esercizio, Record Parte [Proposte Assestamento - Proposte chiuso nullo], Record Voce P E G [Proposte Assestamento - Proposte chiuso nullo], Record Capitolo [Proposte Assestamento - Proposte chiuso nullo], Record Articolo [Proposte Assestamento - Proposte chiuso nullo])");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, "5C1D8097-1420-4EEA-AE9D-B701F470244B");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, "ASSESTAMENTO");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, "6250CBD6-0F87-48FE-8892-B7F0B045CCEE");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, "Note 1");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, "6F8A9D52-A5FA-483B-A549-D20106A7E0F0");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, "Unità Organizzativa ");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, "22B53B11-7E36-4C5A-8D90-700D58D64949");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, "PROGETTI DESCRIZIONE");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, "C8F70287-D3DF-4F73-B140-0DC05A480B01");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, "Fin Ope");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.VIS_LABELFIELD);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, "34C65871-F928-46D4-B829-B0E1BAF12404");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, "ESERCIZIO");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, "6F9265C7-1C26-406A-A985-58449612CC56");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PROPOSTE.SetImage(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, 0, "info.gif", false);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, "0111AF5F-4D11-4F1D-B672-BD45EBF1C5E2");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, "OPERE DESCRIZIONE");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, "095F4148-3273-4CBB-87AB-CC18976686F8");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, "8134400F-0AA6-42B2-81C6-57BEFA89AE48");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, "TIPO");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, "84F6A891-3D28-48C1-BD80-558E7D33C5DD");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, "D9373B38-A762-46EA-8A14-9021B86049E5");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, "8B3DC2D6-6769-4589-B564-8414BEAA2D9D");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, "Capitolo");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.VIS_VUOTONORMALE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PROPOSTE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_LIST, 48);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_FORM, 352, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_FORM, 48);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_STATO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_STATO, PPQRY_PROPOSTEVB2, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_STATO, (new IDVariant()), "Attesa Appr.", "", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_STATO, (new IDVariant("A")), "Approvato", "", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_STATO, (new IDVariant("N")), "Annullato", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_LIST, 84, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_FORM, 100, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_PARTE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_PARTE, PPQRY_PROPOSTEVB2, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_LIST, 136, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_FORM, 144, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO1, MyGlb.PANEL_FORM, "Capit. Art");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_CAPITOLO1, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_CAPITOLO1, PPQRY_PROPOSTEVB2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_LIST, 244, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_LIST, " ");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_FORM, 292, 28, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_FORM, 68);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO1, MyGlb.PANEL_FORM, " ");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ARTICOLO1, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ARTICOLO1, PPQRY_PROPOSTEVB2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_LIST, 300, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_LIST, 100);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_LIST, "Ist. N.C.");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_FORM, 388, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_FORM, 88);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ISTNC, MyGlb.PANEL_FORM, "Ist. N.C.");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ISTNC, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ISTNC, PPQRY_PROPOSTEVB2, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_ISTNC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_ISTNC, (new IDVariant()), "Null", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_LIST, 276, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_LIST, 72);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_LIST, "Importi");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_FORM, 68, 144, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_FORM, 72);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTI, MyGlb.PANEL_FORM, "Importi");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_IMPORTI, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_IMPORTI, PPQRY_PROPOSTEVB2, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_LIST, 364, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_FORM, 228, 144, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_FORM, 72);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_IMPORTO2, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_IMPORTO2, PPQRY_PROPOSTEVB2, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_LIST, 452, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_FORM, 312, 144, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_FORM, 72);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_IMPORTO3, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_IMPORTO3, PPQRY_PROPOSTEVB2, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, 540, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, 64, 168, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_DESCRIZIONE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_DESCRIZIONE, PPQRY_PROPOSTEVB2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_LIST, 760, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Var");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_FORM, 84, 204, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_FORM, 56);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Var");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_TIPOVAR, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_TIPOVAR, PPQRY_PROPOSTEVB2, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_LIST, 936, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_LIST, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_LIST, "Var.Bil. 2012");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_FORM, 504, 232, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_FORM, 80);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2012, MyGlb.PANEL_FORM, "Var.Bil. 2012");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_VARBIL2012, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_VARBIL2012, PPQRY_PROPOSTEVB2, "A.VAR_BIL_1", "VAR_BIL_1", 5, 2, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_VARBIL2012, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_VARBIL2012, (new IDVariant()), "Null", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_LIST, 984, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_LIST, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_LIST, "VAR BIL 2");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_FORM, 504, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_FORM, 80);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL2, MyGlb.PANEL_FORM, "VAR BIL 2");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_VARBIL2, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_VARBIL2, PPQRY_PROPOSTEVB2, "A.VAR_BIL_2", "VAR_BIL_2", 5, 2, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_VARBIL2, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_VARBIL2, (new IDVariant()), "Null", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_LIST, 1032, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_LIST, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_LIST, "VAR BIL 3");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_FORM, 504, 280, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_FORM, 80);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_VARBIL3, MyGlb.PANEL_FORM, "VAR BIL 3");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_VARBIL3, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_VARBIL3, PPQRY_PROPOSTEVB2, "A.VAR_BIL_3", "VAR_BIL_3", 5, 2, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_VARBIL3, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_VARBIL3, (new IDVariant()), "Null", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_LIST, 1080, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_LIST, 96);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_LIST, "Cons./Svil.");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_FORM, 72, 228, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_FORM, 68);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CONSSVIL, MyGlb.PANEL_FORM, "Cons./Svil.");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_CONSSVIL, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_CONSSVIL, PPQRY_PROPOSTEVB2, "A.CONS_SVILUPPO", "CONS_SVILUPPO", 5, 1, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_CONSSVIL, (new IDVariant("C")), "Consolidato", "", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_CONSSVIL, (new IDVariant("S")), "Sviluppo", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_LIST, 1164, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_LIST, 84);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_FORM, 76, 252, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_FORM, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETTO, MyGlb.PANEL_FORM, "Ob. Oper.");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_PROGETTO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_PROGETTO, PPQRY_PROPOSTEVB2, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_LIST, 1320, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_FORM, 48, 276, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_FINANZIAMENT, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_FINANZIAMENT, PPQRY_PROPOSTEVB2, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_LIST, 1412, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_FORM, 424, 276, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_OPERA, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_OPERA, PPQRY_PROPOSTEVB2, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_LIST, 1232, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_FORM, 88, 312, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_FATTORE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_FATTORE, PPQRY_PROPOSTEVB2, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_LIST, 1292, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_FORM, 92, 336, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_FORM, 48);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_CENTRO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_CENTRO, PPQRY_PROPOSTEVB2, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_LIST, 1600, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_LIST, 184);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_FORM, 20, 100, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_FORM, 120);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANI1, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_UNITAORGANI1, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_UNITAORGANI1, PPQRY_PROPOSTEVB2, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.PANEL_LIST, 292, 84, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.PANEL_FORM, 272, 28, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETSLASH, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHETSLASH, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHETSLASH, -1, "", "ETICHETSLASH", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.PANEL_LIST, 300, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.PANEL_FORM, 336, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHESCELTA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHESCELTA, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHESCELTA, -1, "", "ETICHESCELTA", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.PANEL_LIST, 84, 92, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.PANEL_FORM, 144, 124, 80, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHEIMPORT, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHEIMPORT, -1, "", "ETICHEIMPORT", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.PANEL_LIST, 92, 100, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.PANEL_FORM, 228, 124, 80, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHEIMPOR1, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHEIMPOR1, -1, "", "ETICHEIMPOR1", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.PANEL_LIST, 100, 108, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.PANEL_FORM, 312, 124, 80, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEIMPOR2, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHEIMPOR2, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHEIMPOR2, -1, "", "ETICHEIMPOR2", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_LIST, 128);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_FORM, 56, 388, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_FORM, 52);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_UTENTE1, -1, GRP_PROPOSTE_INSERIMENTO);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_UTENTE1, PPQRY_PROPOSTEVB2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_LIST, 120);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_FORM, 200, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_DATA1, -1, GRP_PROPOSTE_INSERIMENTO);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_DATA1, PPQRY_PROPOSTEVB2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_LIST, 152);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_FORM, 332, 388, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_UTENTE, -1, GRP_PROPOSTE_AGGIORNAMENT);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_UTENTE, PPQRY_PROPOSTEVB2, "A.UTENTE_AGGIORNAMENTO", "UTENTE_AGGIORNAMENTO", 5, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 92);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 472, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_DATA, -1, GRP_PROPOSTE_AGGIORNAMENT);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_DATA, PPQRY_PROPOSTEVB2, "A.DATA_ULT_AGG", "DATA_ULT_AGG", 6, 19, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.PANEL_LIST, 528, 156, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.PANEL_FORM, 544, 172, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAVUOT, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICNOTAVUOT, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICNOTAVUOT, -1, "", "ETICNOTAVUOT", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.PANEL_LIST, 536, 164, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.PANEL_FORM, 544, 172, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICNOTAPIEN, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICNOTAPIEN, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICNOTAPIEN, -1, "", "ETICNOTAPIEN", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_FORM, 4, 340, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_NOTE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_NOTE, PPQRY_PROPOSTEVB2, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.PANEL_LIST, 588, 148, 60, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.PANEL_LIST, 2);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.PANEL_FORM, 508, 168, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHETTNOTE, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHETTNOTE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHETTNOTE, -1, "", "ETICHETTNOTE", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_LIST, 156);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo ");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_FORM, 84, 52, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_FORM, 56);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo ");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_CAPITOLO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_CAPITOLO, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,0)", "DUALDESCCAPI", 5, 99, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_LIST, 156);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_LIST, "Articolo ");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_FORM, 88, 76, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_FORM, 52);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ARTICOLO, MyGlb.PANEL_FORM, "Articolo ");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ARTICOLO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ARTICOLO, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,~~ARTICOLO~~)", "DUALDESCARTI", 5, 99, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_LIST, 96);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_LIST, "ASSESTAMENTO");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_FORM, 4, 396, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_FORM, 96);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ASSESTAMENTO, MyGlb.PANEL_FORM, "ASSESTAMENTO");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ASSESTAMENTO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ASSESTAMENTO, PPQRY_PROPOSTEVB2, "A.ASSESTAMENTO", "ASSESTAMENTO", 1, 2, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_LIST, 44);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_LIST, "Note 1");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_FORM, 4, 396, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_FORM, 44);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NOTE1, MyGlb.PANEL_FORM, "Note 1");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_NOTE1, -1, -1);
    PAN_PROPOSTE.SetFieldUnbound(PFL_PROPOSTE_NOTE1, true);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_NOTE1, PPQRY_PROPOSTEVB2, "CASE WHEN NOT ((A.NOTE IS NULL)) THEN 'P' ELSE 'N' END", "NOTE1", 5, 99, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, 1344, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, 268);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa ");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, 212, 100, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, 268);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa ");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_UNITAORGANIZ, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_UNITAORGANIZ, PPQRY_UNITAORGANIZ, "A.DESCRIZIONE", "SOANUNORVBUD", 5, 140, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_LIST, 1920, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_LIST, 144);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_LIST, "PROGETTI DESCRIZIONE");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_FORM, 232, 252, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_FORM, 144);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGETDESCRI, MyGlb.PANEL_FORM, "PROGETTI DESCRIZIONE");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_PROGETDESCRI, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_PROGETDESCRI, PPQRY_PROGETTI, "A.DESCRIZIONE", "PROGETDESCRI", 5, 100, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.PANEL_LIST, 528, 340, 272, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.PANEL_LIST, 3);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.PANEL_FORM, 44, 276, 624, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHEFINOPE, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHEFINOPE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHEFINOPE, -1, "", "ETICHEFINOPE", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_FORM, 4, 388, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ESERCIZIO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ESERCIZIO, PPQRY_PROPOSTEVB2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.PANEL_LIST, 308, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.PANEL_FORM, 356, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICHINFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICHINFOPEG, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICHINFOPEG, -1, "", "ETICHINFOPEG", 0, 0, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_LIST, 1740, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_LIST, 120);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_LIST, "OPERE DESCRIZIONE");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_FORM, 536, 276, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_FORM, 120);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OPEREDESCRIZ, MyGlb.PANEL_FORM, "OPERE DESCRIZIONE");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_OPEREDESCRIZ, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_OPEREDESCRIZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_FORM, 204, 276, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZIAMENTI DESCRIZIONE");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_FINANZDESCRI, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_FORM, 4, 384, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_TIPO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_TIPO, PPQRY_PROPOSTEVB2, "A.TIPO", "TIPO", 1, 1, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_FORM, 232, 312, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_FATTORDESCRI, MyGlb.PANEL_FORM, "FATTORI DESCRIZIONE");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_FATTORDESCRI, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_LIST, 128);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_FORM, 232, 336, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENTRI DESCRIZIONE");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_CENTRIDESCRI, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.PANEL_LIST, 596, 156, 60, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.PANEL_LIST, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.PANEL_LIST, 2);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.PANEL_FORM, 68, 28, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.PANEL_FORM, 0);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ETICCAPIFORM, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ETICCAPIFORM, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ETICCAPIFORM, -1, "", "ETICCAPIFORM", 0, 0, 0, -13997);
  }

  private void PAN_PROPOSTE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROPOSTE.SetSize(MyGlb.OBJ_QUERY, 11);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,0) as DUALDESCCAPI, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,~~ARTICOLO~~) as DUALDESCARTI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PROPOSTE.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as SOANUNORVBUD ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.TIPO = 'B') ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PROPOSTE.SetQuery(PPQRY_UNITAORGANIZ, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_UNITAORGANIZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_UNITAORGANIZ, "VISTA_BILANCIO_UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROGETDESCRI ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCR ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROPOSTE.SetQuery(PPQRY_T54, 0, SQL, PFL_PROPOSTE_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCR ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROPOSTE.SetQuery(PPQRY_T54, 1, SQL, PFL_PROPOSTE_TIPOVAR, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTPRDAUFP1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTPRDAUFPR ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_PROPOSTE.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_PROPOSTE_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTPRDAUFP1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTPRDAUFPR ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PROPOSTE.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_PROPOSTE_UTENTE1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_AGGIORNAMENTO~~ as REUT1PRDAUF1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_AGGIORNAMENTO~~) as REUT1PRDAUFP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_AGGIORNAMENTO~~ IS NULL))) ");
    PAN_PROPOSTE.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_PROPOSTE_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_AGGIORNAMENTO~~ as REUT1PRDAUF1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_AGGIORNAMENTO~~) as REUT1PRDAUFP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PROPOSTE.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_PROPOSTE_UTENTE, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetIMDB(IMDB, "PQRY_PROPOSTEVB2", true);
    PAN_PROPOSTE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.ASSESTAMENTO as ASSESTAMENTO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.VAR_BIL_1 as VAR_BIL_1, ");
    SQL.append("  A.CONS_SVILUPPO as CONS_SVILUPPO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_AGGIORNAMENTO as UTENTE_AGGIORNAMENTO, ");
    SQL.append("  A.DATA_ULT_AGG as DATA_ULT_AGG, ");
    SQL.append("  A.PROGR_STANZIAMENTO as PROGR_STANZIAMENTO, ");
    SQL.append("  A.PROGR_STANZIAMENTO_FC as PROGR_STANZIAMENTO_FC, ");
    SQL.append("  A.PROGR_VARCOM_1 as PROGR_VARCOM_1, ");
    SQL.append("  A.PROGR_VARCOMPRO_1 as PROGR_VARCOMPRO_1, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  CASE WHEN NOT ((A.NOTE IS NULL)) THEN 'P' ELSE 'N' END as NOTE1, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.VAR_BIL_2 as VAR_BIL_2, ");
    SQL.append("  A.VAR_BIL_3 as VAR_BIL_3 ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTEVB2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE_VB A ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTEVB2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.TIPO = 1 AND (~~TBL_PARAM8.NOMEOGGECHIU~~ IS NULL)) OR (A.TIPO = 2 AND ~~TBL_PARAM8.NOMEOGGECHIU~~ = 'SI')) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ASSESTAMENTO = ~~PQRY_PARAM156.NOMEOGGECODI~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTEVB2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTEVB2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTEVB2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTEVB2, 5, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_PROPOSTEVB2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(0, "PROPOSTE_VB");
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_UNITAORGANI1, true);
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_PARTE, true);
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_CAPITOLO1, true);
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_ARTICOLO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROPOSTE.Status() == 2)
    {
      int oldListQBE = PAN_PROPOSTE.iUseListQBE;
      PAN_PROPOSTE.iUseListQBE = 0;
      PAN_PROPOSTE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROPOSTE.PanelCommand(Glb.PCM_FIND);
      PAN_PROPOSTE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, "55AEE96F-93A2-422E-A6BB-18B2E378155C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, "Finanz.-Opera");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, "622194A0-8A77-4B57-A9EA-0D77871680E6");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, 0, "info.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, "139700F2-C5D4-400C-862E-4BD8CDD3D8E1");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, 0, "info.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_LIST, 0, 36, 424, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_LIST, 48);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_LIST, "Finanz.-Opera");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_FORM, 4, 0, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_FORM, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZOPERA, MyGlb.PANEL_FORM, "Finanz.-Opera");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZOPERA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZOPERA, PPQRY_FINANZIAMEN2, "A.NOMEOGGEFINO", "NOMEOGGEFINO", 5, 52, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.PANEL_LIST, 468, 8, 32, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.PANEL_FORM, 460, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOFIN, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ETICHINFOFIN, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ETICHINFOFIN, -1, "", "ETICHINFOFIN", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.PANEL_LIST, 476, 16, 32, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.PANEL_FORM, 480, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ETICHINFOOPE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ETICHINFOOPE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ETICHINFOOPE, -1, "", "ETICHINFOOPE", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN NOT ((A.FINANZIAMENTO IS NULL)) AND NOT ((A.OPERA IS NULL)) THEN TO_CHAR ( A.FINANZIAMENTO ) || '@' || TO_CHAR ( A.OPERA ) ELSE NULL END as CODICE, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || '-' || TO_CHAR ( A.OPERA ) as ORDINAMENTO, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( A.OPERA ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (CASE WHEN NOT ((A.FINANZIAMENTO IS NULL)) AND NOT ((A.OPERA IS NULL)) THEN TO_CHAR ( A.FINANZIAMENTO ) || '@' || TO_CHAR ( A.OPERA ) ELSE NULL END = ~~NOMEOGGEFINO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_PROPOSTEVB2.E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~PQRY_PROPOSTEVB2.CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~PQRY_PROPOSTEVB2.ARTICOLO~~) ");
    SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (C.CODICE = A.OPERA) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_BILFIN, 0, SQL, PFL_FINANZIAMENT_FINANZOPERA, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_FINANZIAMEN2", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_FINANZIAMENT.SetQueryIMDB(PPQRY_FINANZIAMEN2, IMDBDef17.PQRY_FINANZIAMEN2_RS, IMDBDef7.TBL_FINANZIAMENT);
    JustLoaded = true;
    PAN_FINANZIAMENT.SetFieldPrimaryIndex(PFL_FINANZIAMENT_FINANZOPERA, IMDBDef7.FLD_FINANZIAMENT_NOMEOGGEFINO);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINANZIAMENT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_ValidateRow(Cancel);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_DynamicProperties();
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
