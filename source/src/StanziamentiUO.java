// **********************************************
// Stanziamenti UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STANZUOEFFET_PROGUNITORG1 = 0;
  private static int PFL_STANZUOEFFET_CAPITOLO1 = 1;
  private static int PFL_STANZUOEFFET_ARTICOLO1 = 2;
  private static int PFL_STANZUOEFFET_STANZIAMENT1 = 3;
  private static int PFL_STANZUOEFFET_PREVISIONE1 = 4;
  private static int PFL_STANZUOEFFET_ESERCIZIO1 = 5;
  private static int PFL_STANZUOEFFET_ES1 = 6;
  private static int PFL_STANZUOEFFET_ESTVOCPEGLA1 = 7;
  private static int PFL_STANZUOEFFET_STINICOTOTA1 = 8;
  private static int PFL_STANZUOEFFET_PREVISTOTAL1 = 9;
  private static int PFL_STANZUOEFFET_DISPONIBILI1 = 10;
  private static int PFL_STANZUOEFFET_PREVISIOCON1 = 11;
  private static int PFL_STANZUOEFFET_PREVISIOSVI1 = 12;
  private static int PFL_STANZUOEFFET_STNINICOCON1 = 13;
  private static int PFL_STANZUOEFFET_STNINICOSVI1 = 14;
  private static int PFL_STANZUOEFFET_VARIAZCOCON1 = 15;
  private static int PFL_STANZUOEFFET_VARIAZCOSVI1 = 16;
  private static int PFL_STANZUOEFFET_IMPULTCHIUS1 = 17;
  private static int PFL_STANZUOEFFET_IMPULTCHICO1 = 18;
  private static int PFL_STANZUOEFFET_IMPULTCHISV1 = 19;
  private static int PFL_STANZUOEFFET_VARIAZIONIC1 = 20;

  private static int PPQRY_BILUO1 = 0;

  private static int PPQRY_CAPUO1 = 1;


  IDPanel PAN_STANZUOEFFET;
  private static int PFL_STANZUOSIMUL_PROGUNITORGA = 0;
  private static int PFL_STANZUOSIMUL_CAPITOLO = 1;
  private static int PFL_STANZUOSIMUL_ARTICOLO = 2;
  private static int PFL_STANZUOSIMUL_STANZIAMENTO = 3;
  private static int PFL_STANZUOSIMUL_PREVISIONE = 4;
  private static int PFL_STANZUOSIMUL_ESERCIZIO = 5;
  private static int PFL_STANZUOSIMUL_ES = 6;
  private static int PFL_STANZUOSIMUL_ESTVOCPEGLAB = 7;
  private static int PFL_STANZUOSIMUL_STINICOTOTAL = 8;
  private static int PFL_STANZUOSIMUL_PREVISTOTALE = 9;
  private static int PFL_STANZUOSIMUL_PREVISIOCONS = 10;
  private static int PFL_STANZUOSIMUL_PREVISIOSVIL = 11;
  private static int PFL_STANZUOSIMUL_STNINICOCONS = 12;
  private static int PFL_STANZUOSIMUL_STNINICOSVIL = 13;
  private static int PFL_STANZUOSIMUL_IMPULTCHIUSO = 14;
  private static int PFL_STANZUOSIMUL_IMPULTCHICON = 15;
  private static int PFL_STANZUOSIMUL_IMPULTCHISVI = 16;

  private static int PPQRY_BILUO = 0;

  private static int PPQRY_CAPUO = 1;


  IDPanel PAN_STANZUOSIMUL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI339(IMDB);
    //
    //
    Init_PQRY_BILUO1(IMDB);
    Init_PQRY_BILUO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI339(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI339, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI339, "TBL_PARAMETRI339");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMTIPBIL, "ROWNAMTIPBIL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMTIPBIL,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEES,5,49,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEPREVI, "ROWNAMEPREVI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMEPREVI,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMESTANZ, "ROWNAMESTANZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMESTANZ,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_RONAIMACULCT, "RONAIMACULCT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_RONAIMACULCT,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMENUOVO, "ROWNAMENUOVO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMENUOVO,5,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMESTATO, "ROWNAMESTATO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI339,IMDBDef3.FLD_PARAMETRI339_ROWNAMESTATO,5,49,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI339, 0);
  }

  private static void Init_PQRY_BILUO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILUO1, 22);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILUO1, "PQRY_BILUO1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO, "IMP_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_CONS, "IMP_ULT_CHIUSO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_SVIL, "IMP_ULT_CHIUSO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO1,IMDBDef11.PQSL_BILUO1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILUO1, 0);
  }

  private static void Init_PQRY_BILUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILUO, 18);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILUO, "PQRY_BILUO");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO, "IMP_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO_CONS, "IMP_ULT_CHIUSO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO_SVIL, "IMP_ULT_CHIUSO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUO,IMDBDef11.PQSL_BILUO_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILUO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiUO()
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
    FormIdx = MyGlb.FRM_STANZIAMENUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8D65A0C0-13D5-47F2-A1C7-90D4FBBCC197";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 652;
    DesignHeight = 838;
    set_Caption(new IDVariant("Stanziamenti U.O."));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 652;
    Frames[1].Height = 812;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.497537;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 652;
    Frames[2].Height = 404;
    Frames[2].Caption = "Stanziamenti U.O.";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 404;
    PAN_STANZUOEFFET = new IDPanel(w, this, 2, "PAN_STANZUOEFFET");
    Frames[2].Content = PAN_STANZUOEFFET;
    PAN_STANZUOEFFET.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZUOEFFET.VS = MainFrm.VisualStyleList;
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FE8B92A2-889D-4D13-8206-353FADF460BC");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 48, 540, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZUOEFFET.InitStatus = 1;
    PAN_STANZUOEFFET_Init();
    PAN_STANZUOEFFET_InitFields();
    PAN_STANZUOEFFET_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 652;
    Frames[3].Height = 408;
    Frames[3].Caption = "Stanziamenti U.O.";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 408;
    PAN_STANZUOSIMUL = new IDPanel(w, this, 3, "PAN_STANZUOSIMUL");
    Frames[3].Content = PAN_STANZUOSIMUL;
    PAN_STANZUOSIMUL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZUOSIMUL.VS = MainFrm.VisualStyleList;
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EF8AE486-7B89-4239-9A8B-8E4100E5A8DC");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 48, 540, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZUOSIMUL.InitStatus = 1;
    PAN_STANZUOSIMUL_Init();
    PAN_STANZUOSIMUL_InitFields();
    PAN_STANZUOSIMUL_InitQueries();
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
      PAN_STANZUOEFFET.UpdatePanel(MainFrm);
      PAN_STANZUOSIMUL.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiUO.class.getName() : (Glb.ClassWithPackage(StanziamentiUO.class) ? StanziamentiUO.class.getName().substring(StanziamentiUO.class.getPackage().getName().length() + 1) : StanziamentiUO.class.getName()));
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Capitolo/Art. ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMTIPBIL, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZUOEFFET.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_STANZUOSIMUL.set_Visible((new IDVariant(0)).booleanValue());
        PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_ESTVOCPEGLA1, IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, 0))).stringValue());
        PAN_STANZUOEFFET.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOEFFET.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOEFFET.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOEFFET.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOEFFET.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
        // 
        // campi opzionali
        // 
        {
          PAN_STANZUOEFFET.SetFlags (Glb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
          PAN_STANZUOEFFET.SetFlags (Glb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        }
      }
      else
      {
        PAN_STANZUOEFFET.set_Visible((new IDVariant(0)).booleanValue());
        PAN_STANZUOSIMUL.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_ESTVOCPEGLAB, IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, 0))).stringValue());
        PAN_STANZUOSIMUL.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOSIMUL.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOSIMUL.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOSIMUL.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZUOSIMUL.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
        // 
        // campi opzionali
        // 
        {
          PAN_STANZUOSIMUL.SetFlags (Glb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
          PAN_STANZUOSIMUL.SetFlags (Glb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        }
      }
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "LoadEvent", _e);
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTROLLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MSG1 = (new IDVariant("Stanziamento Unità Organizzative inferiore allo Stanziamento", IDVariant.STRING));
      v_MSG2 = (new IDVariant("Previsione Unità Organizzative inferiore a Previsione", IDVariant.STRING));
      v_MSG3 = (new IDVariant("Imp Ult. Chiuso Unità Organizzative inferiore a Imp. Ult. Chiuso", IDVariant.STRING));
      v_CONTROLLO = (new IDVariant(0, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.equals((new IDVariant(-1)), true))
      {
        // 
        // controllo se importi sono inferiori rispetto alla riga di partenza
        // 
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMTIPBIL, 0).equals((new IDVariant("E")), true))
          {
            if ((IDL.ToFloat((new IDVariant(PAN_STANZUOEFFET.FieldText(PFL_STANZUOEFFET_STINICOTOTA1)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMESTANZ, 0),(new IDVariant(0))), true)<0))
            {
              v_CONTROLLO = (new IDVariant(-1));
              v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG1), (new IDVariant("<BR/>")));
            }
            if (IDL.ToFloat((new IDVariant(PAN_STANZUOEFFET.FieldText(PFL_STANZUOEFFET_PREVISTOTAL1)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEPREVI, 0),(new IDVariant(0))), true)<0)
            {
              v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG2), (new IDVariant("<BR/>")));
              v_CONTROLLO = (new IDVariant(-1));
            }
          }
          else
          {
            if ((IDL.ToFloat((new IDVariant(PAN_STANZUOSIMUL.FieldText(PFL_STANZUOSIMUL_STINICOTOTAL)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMESTANZ, 0),(new IDVariant(0))), true)<0))
            {
              v_CONTROLLO = (new IDVariant(-1));
              v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG1), (new IDVariant("<BR/>")));
            }
            if (IDL.ToFloat((new IDVariant(PAN_STANZUOSIMUL.FieldText(PFL_STANZUOSIMUL_PREVISTOTALE)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEPREVI, 0),(new IDVariant(0))), true)<0)
            {
              v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG2), (new IDVariant("<BR/>")));
              v_CONTROLLO = (new IDVariant(-1));
            }
          }
          // 
          // 
          // 
          // 
          if (v_CONTROLLO.booleanValue())
          {
            MainFrm.set_AlertMessage(v_MSG); 
          }
        }
        MainFrm.Cf4armDBObject.BeginTrans();
        // 
        // salvo dati del pannello
        // 
        // 
        // 
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMTIPBIL, 0).equals((new IDVariant("E")), true))
          {
            if (new IDVariant(PAN_STANZUOEFFET.Status()).equals((new IDVariant(3)), true))
            {
              PAN_STANZUOEFFET.PanelCommand(Glb.PCM_UPDATE);
            }
            if (!(new IDVariant(PAN_STANZUOEFFET.Status()).equals((new IDVariant(2)), true)))
            {
              Cancel.set((new IDVariant(-1)));
              MainFrm.Cf4armDBObject.RollbackTrans();
              return;
            }
          }
          else
          {
            if (new IDVariant(PAN_STANZUOSIMUL.Status()).equals((new IDVariant(3)), true))
            {
              PAN_STANZUOSIMUL.PanelCommand(Glb.PCM_UPDATE);
            }
            if (!(new IDVariant(PAN_STANZUOSIMUL.Status()).equals((new IDVariant(2)), true)))
            {
              Cancel.set((new IDVariant(-1)));
              MainFrm.Cf4armDBObject.RollbackTrans();
              return;
            }
          }
        }
        MainFrm.Cf4armDBObject.CommitTrans();
        UNLOADEVENT_PARAMEDELETE();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMTIPBIL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEPREVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMESTANZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_RONAIMACULCT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMENUOVO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMESTATO, 0, new IDVariant());
  }

  // **********************************************************************
  // Stanziamenti U O Effettivo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_STANZUOEFFET_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Effettivo After Find Event Body
      // Procedure Body
      // 
      PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_STINICOTOTA1, IDL.Format(PAN_STANZUOEFFET.GetFieldSum(PFL_STANZUOEFFET_STANZIAMENT1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_PREVISTOTAL1, IDL.Format(PAN_STANZUOEFFET.GetFieldSum(PFL_STANZUOEFFET_PREVISIONE1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOEffettivoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Effettivo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZUOEFFET_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STANZUOEFFET);
      // 
      // Stanziamenti U O Effettivo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PROGR_UNITA_ORGANIZZATIVA, 0))) && !(PAN_STANZUOEFFET.IsNewRow()))
      {
        PAN_STANZUOEFFET.SetFlags (Glb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOEffettivoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Effettivo Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_STANZUOEFFET_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Effettivo Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_ESERCIZIO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEES, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO_CONS, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE_CONS, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOEffettivoBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Effettivo On Database Error Event
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
  private void PAN_STANZUOEFFET_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_STANZUOEFFET, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Stanziamenti U O Effettivo On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      if (ErrorMessage.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(ErrorMessage); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOEffettivoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Effettivo On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STANZUOEFFET_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Effettivo On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_STANZUOEFFET.PanelCommand(Glb.PCM_REQUERY);
        PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_STINICOTOTA1, IDL.Format(PAN_STANZUOEFFET.GetFieldSum(PFL_STANZUOEFFET_STANZIAMENT1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_PREVISTOTAL1, IDL.ToString(PAN_STANZUOEFFET.GetFieldSum(PFL_STANZUOEFFET_PREVISIONE1)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOEffettivoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Effettivo On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STANZUOEFFET_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Effettivo On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_STANZUOEFFET_STANZIAMENT1)), true) && FieldWasModified.booleanValue())
      {
        // 
        // 
        // 
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_STINICOTOTA1, IDL.Format(PAN_STANZUOEFFET.GetFieldSum(PFL_STANZUOEFFET_STANZIAMENT1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_STANZUOEFFET_PREVISIONE1)), true) && FieldWasModified.booleanValue())
      {
        // 
        // 
        // 
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        PAN_STANZUOEFFET.set_FieldText(PFL_STANZUOEFFET_PREVISTOTAL1, IDL.Format(PAN_STANZUOEFFET.GetFieldSum(PFL_STANZUOEFFET_PREVISIONE1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOEffettivoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Simulato After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_STANZUOSIMUL_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Simulato After Find Event Body
      // Procedure Body
      // 
      PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_STINICOTOTAL, IDL.Format(PAN_STANZUOSIMUL.GetFieldSum(PFL_STANZUOSIMUL_STANZIAMENTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_PREVISTOTALE, IDL.Format(PAN_STANZUOSIMUL.GetFieldSum(PFL_STANZUOSIMUL_PREVISIONE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOSimulatoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Simulato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZUOSIMUL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STANZUOSIMUL);
      // 
      // Stanziamenti U O Simulato On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PROGR_UNITA_ORGANIZZATIVA, 0))) && !(PAN_STANZUOSIMUL.IsNewRow()))
      {
        PAN_STANZUOSIMUL.SetFlags (Glb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOSimulatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Simulato Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_STANZUOSIMUL_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Simulato Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_ESERCIZIO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEES, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO_CONS, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE_CONS, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOSimulatoBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Simulato On Database Error Event
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
  private void PAN_STANZUOSIMUL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_STANZUOSIMUL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Stanziamenti U O Simulato On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      if (ErrorMessage.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(ErrorMessage); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOSimulatoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Simulato On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STANZUOSIMUL_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Simulato On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_STANZUOSIMUL.PanelCommand(Glb.PCM_REQUERY);
        PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_STINICOTOTAL, IDL.Format(PAN_STANZUOSIMUL.GetFieldSum(PFL_STANZUOSIMUL_STANZIAMENTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_PREVISTOTALE, IDL.ToString(PAN_STANZUOSIMUL.GetFieldSum(PFL_STANZUOSIMUL_PREVISIONE)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOSimulatoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Simulato On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STANZUOSIMUL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Simulato On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_STANZUOSIMUL_STANZIAMENTO)), true) && FieldWasModified.booleanValue())
      {
        // 
        // 
        // 
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_STINICOTOTAL, IDL.Format(PAN_STANZUOSIMUL.GetFieldSum(PFL_STANZUOSIMUL_STANZIAMENTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_STANZUOSIMUL_PREVISIONE)), true) && FieldWasModified.booleanValue())
      {
        // 
        // 
        // 
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUO, IMDBDef11.PQSL_BILUO_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        PAN_STANZUOSIMUL.set_FieldText(PFL_STANZUOSIMUL_PREVISTOTALE, IDL.Format(PAN_STANZUOSIMUL.GetFieldSum(PFL_STANZUOSIMUL_PREVISIONE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUO", "StanziamentiUOSimulatoOnUpdatingRow", _e);
    }
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
  private void PAN_STANZUOEFFET_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STANZUOEFFET, Cancel);
    // Stub
  }

  private void PAN_STANZUOEFFET_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STANZUOEFFET_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STANZUOEFFET_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STANZUOEFFET_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_PREVISIONE_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_STN_INI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUO1, IMDBDef11.PQSL_BILUO1_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_STANZUOEFFET_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STANZUOSIMUL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STANZUOSIMUL, Cancel);
    // Stub
  }

  private void PAN_STANZUOSIMUL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STANZUOSIMUL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STANZUOSIMUL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STANZUOSIMUL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STANZUOSIMUL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STANZUOEFFET_Init()
  {

    PAN_STANZUOEFFET.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZUOEFFET.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STANZUOEFFET.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, "241C5B84-4117-44EE-A25A-B8EE56878A19");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, "Prog. Unità Organizzativa");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, "PROGR UNITA ORGANIZZATIVA");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, "E3DF513D-E9F8-4EAD-BE20-9D25D2D03EE7");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, "CAPITOLO");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, "C4C2009A-7A01-4E2F-A246-878CE614702D");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, "ARTICOLO");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, "EE50970C-C14D-46B9-A1EC-65D075F3C7B6");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, "Stanziamento");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, "6DE02A81-4FA5-4AB3-BEC0-02EBF597D4F1");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, "Previsione");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, "8AE11A89-BBF0-42F5-8817-4C862E8F7202");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, "ESERCIZIO");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, "ECCBBC69-C81F-4312-B907-AA0CEF3AAF2B");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, "E S");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, "4DB37878-D362-4890-8EB2-7638C0C84129");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.VIS_ETICHEGRASSE);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, "9BDE133E-7389-4A73-8DE8-B8FB7DF1C5E9");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.VIS_CAMPTOTADISA);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, "BC9A71BC-3C5E-4B91-B693-20C5FF7125A5");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.VIS_CAMPTOTADISA);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, "6A5B5F6B-407A-43D3-8CB0-F76D9E7BAF2F");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, "DISPONIBILITA");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, 0, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, "F26CCB7E-2084-464A-8327-9233E5FDDC98");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, "PREVISIONE CONS");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, "5FA91E8F-B339-49F7-BFDD-5EC084072CDB");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, "PREVISIONE SVIL");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, "BCE081BE-27BE-4F38-833C-9745FD5FD0CF");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, "STN INI CO CONS");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, "6D49AA0E-1CBA-416D-93A7-22CABD5D22BF");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, "STN INI CO SVIL");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, "D50E6B85-1F8B-400E-8FC1-0BB193740E3C");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, "VARIAZIONI CO CONS");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, "5D64615B-AB4E-4B1C-8194-FB3BF060F44E");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, "VARIAZIONI CO SVIL");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, "0DC0F5A3-52F3-42C2-9E06-9C2DA82CC60F");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, "IMP ULT CHIUSO");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, "3FFA03A0-44C9-41D1-8F7E-64166C4A6705");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, "IMP ULT CHIUSO CONS");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, "54A4A2EB-F7F1-4874-BDC2-EA362DBA59A5");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, "IMP ULT CHIUSO SVIL");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZUOEFFET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, "D724E712-5FC7-4D3B-AD98-8D3EC14DD37D");
    PAN_STANZUOEFFET.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, "VARIAZIONI CO");
    PAN_STANZUOEFFET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, "");
    PAN_STANZUOEFFET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOEFFET.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, 0, -1);
  }

  private void PAN_STANZUOEFFET_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_LIST, 16, 100, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_LIST, 164);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_LIST, "Prog. Unità Organizzativa");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_FORM, 164);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PROGUNITORG1, MyGlb.PANEL_FORM, "Prog. Unità Organizzativa");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_PROGUNITORG1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_PROGUNITORG1, PPQRY_BILUO1, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_LIST, 140, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_LIST, "CAP.");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_FORM, 436, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_FORM, 72);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_CAPITOLO1, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_CAPITOLO1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_CAPITOLO1, PPQRY_BILUO1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_LIST, 180, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_LIST, "ART.");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_FORM, 136);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ARTICOLO1, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_ARTICOLO1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_ARTICOLO1, PPQRY_BILUO1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_LIST, 332, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_LIST, 64);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_FORM, 136);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STANZIAMENT1, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_STANZIAMENT1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_STANZIAMENT1, PPQRY_BILUO1, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_LIST, 444, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_LIST, 68);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_LIST, "Previsione");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_FORM, 136);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIONE1, MyGlb.PANEL_FORM, "Previsione");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_PREVISIONE1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_PREVISIONE1, PPQRY_BILUO1, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC.");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_ESERCIZIO1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_ESERCIZIO1, PPQRY_BILUO1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_LIST, 0, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_LIST, 24);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_FORM, 4, 244, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_FORM, 24);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_ES1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_ES1, PPQRY_BILUO1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.PANEL_LIST, 16, 8, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.PANEL_LIST, 0);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.PANEL_FORM, 16, 8, 156, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.PANEL_FORM, 0);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_ESTVOCPEGLA1, MyGlb.PANEL_FORM, 2);
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_ESTVOCPEGLA1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_ESTVOCPEGLA1, -1, "", "ESTVOCPEGLA1", 0, 0, 0, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.PANEL_LIST, 332, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.PANEL_LIST, 0);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.PANEL_FORM, 108, 332, 80, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.PANEL_FORM, 0);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STINICOTOTA1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_STINICOTOTA1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_STINICOTOTA1, -1, "", "STINICOTOTA1", 0, 0, 0, -13997);
    PAN_STANZUOEFFET.set_Alignment(PFL_STANZUOEFFET_STINICOTOTA1, 4);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.PANEL_LIST, 444, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.PANEL_LIST, 0);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.PANEL_FORM, 72, 368, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.PANEL_FORM, 0);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISTOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_PREVISTOTAL1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_PREVISTOTAL1, -1, "", "PREVISTOTAL1", 0, 0, 0, -13997);
    PAN_STANZUOEFFET.set_Alignment(PFL_STANZUOEFFET_PREVISTOTAL1, 4);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_LIST, 556, 100, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_LIST, 96);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_LIST, "DISPONIBILITA");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_FORM, 4, 244, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_FORM, 96);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_DISPONIBILI1, MyGlb.PANEL_FORM, "DISPONIBILITA");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_DISPONIBILI1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_DISPONIBILI1, PPQRY_BILUO1, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_LIST, 0, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_LIST, 108);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_LIST, "PREVISIONE CONS");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_FORM, 4, 268, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_FORM, 108);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOCON1, MyGlb.PANEL_FORM, "PREVISIONE CONS");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_PREVISIOCON1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_PREVISIOCON1, PPQRY_BILUO1, "A.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_LIST, 0, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_LIST, 104);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_LIST, "PREVISIONE SVIL");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_FORM, 4, 268, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_FORM, 104);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_PREVISIOSVI1, MyGlb.PANEL_FORM, "PREVISIONE SVIL");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_PREVISIOSVI1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_PREVISIOSVI1, PPQRY_BILUO1, "A.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_LIST, 0, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_LIST, 100);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_FORM, 100);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOCON1, MyGlb.PANEL_FORM, "STN INI CO CONS");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_STNINICOCON1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_STNINICOCON1, PPQRY_BILUO1, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_LIST, 0, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_LIST, 96);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_FORM, 4, 268, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_FORM, 96);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_STNINICOSVI1, MyGlb.PANEL_FORM, "STN INI CO SVIL");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_STNINICOSVI1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_STNINICOSVI1, PPQRY_BILUO1, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_LIST, 0, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_LIST, 128);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_LIST, "VARIAZIONI CO CONS");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_FORM, 4, 268, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_FORM, 128);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOCON1, MyGlb.PANEL_FORM, "VARIAZIONI CO CONS");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_VARIAZCOCON1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_VARIAZCOCON1, PPQRY_BILUO1, "A.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_LIST, 0, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_LIST, 124);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_LIST, "VARIAZIONI CO SVIL");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_FORM, 4, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_FORM, 124);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZCOSVI1, MyGlb.PANEL_FORM, "VARIAZIONI CO SVIL");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_VARIAZCOSVI1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_VARIAZCOSVI1, PPQRY_BILUO1, "A.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_LIST, 8, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_LIST, 100);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_LIST, "IMP ULT CHIUSO");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_FORM, 12, 276, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_FORM, 100);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHIUS1, MyGlb.PANEL_FORM, "IMP ULT CHIUSO");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_IMPULTCHIUS1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_IMPULTCHIUS1, PPQRY_BILUO1, "A.IMP_ULT_CHIUSO", "IMP_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_LIST, 0, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_LIST, 132);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_LIST, "IMP ULT CHIUSO CONS");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_FORM, 132);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHICO1, MyGlb.PANEL_FORM, "IMP ULT CHIUSO CONS");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_IMPULTCHICO1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_IMPULTCHICO1, PPQRY_BILUO1, "A.IMP_ULT_CHIUSO_CONS", "IMP_ULT_CHIUSO_CONS", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_LIST, 8, 60, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_LIST, 128);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_LIST, "IMP ULT CHIUSO SVIL");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_FORM, 12, 276, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_FORM, 128);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_IMPULTCHISV1, MyGlb.PANEL_FORM, "IMP ULT CHIUSO SVIL");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_IMPULTCHISV1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_IMPULTCHISV1, PPQRY_BILUO1, "A.IMP_ULT_CHIUSO_SVIL", "IMP_ULT_CHIUSO_SVIL", 3, 14, 2, -13997);
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_LIST, 556, 100, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_LIST, 96);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_LIST, "VARIAZIONI CO");
    PAN_STANZUOEFFET.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_FORM, 4, 244, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOEFFET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_FORM, 96);
    PAN_STANZUOEFFET.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOEFFET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOEFFET_VARIAZIONIC1, MyGlb.PANEL_FORM, "VARIAZIONI CO");
    PAN_STANZUOEFFET.SetFieldPage(PFL_STANZUOEFFET_VARIAZIONIC1, -1, -1);
    PAN_STANZUOEFFET.SetFieldPanel(PFL_STANZUOEFFET_VARIAZIONIC1, PPQRY_BILUO1, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
  }

  private void PAN_STANZUOEFFET_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZUOEFFET.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI339.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRI339.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRI339.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRI339.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    SQL.append("order by 2 ");
    PAN_STANZUOEFFET.SetQuery(PPQRY_CAPUO1, 0, SQL, PFL_STANZUOEFFET_PROGUNITORG1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI339.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRI339.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRI339.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRI339.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    SQL.append("order by 2 ");
    PAN_STANZUOEFFET.SetQuery(PPQRY_CAPUO1, 1, SQL, PFL_STANZUOEFFET_PROGUNITORG1, "");
    PAN_STANZUOEFFET.SetQueryDB(PPQRY_CAPUO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZUOEFFET.SetIMDB(IMDB, "PQRY_BILUO1", true);
    PAN_STANZUOEFFET.set_SetString(MyGlb.MASTER_ROWNAME, "BIL UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  A.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
    SQL.append("  A.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  A.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  A.VARIAZIONI_CO_CONS as VARIAZIONI_CO_CONS, ");
    SQL.append("  A.VARIAZIONI_CO_SVIL as VARIAZIONI_CO_SVIL, ");
    SQL.append("  A.IMP_ULT_CHIUSO as IMP_ULT_CHIUSO, ");
    SQL.append("  A.IMP_ULT_CHIUSO_CONS as IMP_ULT_CHIUSO_CONS, ");
    SQL.append("  A.IMP_ULT_CHIUSO_SVIL as IMP_ULT_CHIUSO_SVIL, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_STANZUOEFFET.SetQuery(PPQRY_BILUO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_UO A ");
    PAN_STANZUOEFFET.SetQuery(PPQRY_BILUO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI339.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRI339.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRI339.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRI339.ROWNAMEARTIC~~) ");
    PAN_STANZUOEFFET.SetQuery(PPQRY_BILUO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZUOEFFET.SetQuery(PPQRY_BILUO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZUOEFFET.SetQuery(PPQRY_BILUO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZUOEFFET.SetQuery(PPQRY_BILUO1, 5, SQL, -1, "");
    PAN_STANZUOEFFET.SetQueryDB(PPQRY_BILUO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZUOEFFET.SetMasterTable(0, "BIL_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZUOEFFET.Status() == 2)
    {
      int oldListQBE = PAN_STANZUOEFFET.iUseListQBE;
      PAN_STANZUOEFFET.iUseListQBE = 0;
      PAN_STANZUOEFFET.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZUOEFFET.PanelCommand(Glb.PCM_FIND);
      PAN_STANZUOEFFET.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_STANZUOSIMUL_Init()
  {

    PAN_STANZUOSIMUL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZUOSIMUL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STANZUOSIMUL.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, "1A6F8B2E-6DBB-436D-992D-E0550F147E01");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, "Prog. Unità Organizzativa");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, "A04CBDC8-C121-4F15-8402-56AEF1D67002");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, "CAPITOLO");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, "DEA944D8-F95A-4E2A-99DB-AE1D82D06E9D");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, "ARTICOLO");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, "BB7E1EE8-0EF9-455A-B009-A41EFCEEFE5E");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, "Stanziamento");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, "2D2BE3F0-F5FA-420D-A5B5-F92821ECA001");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, "Previsione");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, "982B0134-0143-487F-9394-756F60521DAC");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, "ESERCIZIO");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, "D00FBB69-A7D5-4E7D-81A6-12E9DEEEDB2C");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, "E S");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, "53A3BC0B-C6DC-4E29-8FB9-B41DF9B10F0A");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, "4DA00F3D-DEA9-4F7F-9F07-D9CFA63056CD");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.VIS_CAMPTOTADISA);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, "873DE76C-5C4E-4160-B377-E47A81EBA5BD");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.VIS_CAMPTOTADISA);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, "D46D3081-5F1C-4795-BDF4-977FC5F03165");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, "PREVISIONE CONS");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, 0, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, "E4C7E8F8-4130-4C92-960E-0B1BF332CCAF");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, 0, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, "BF0099CB-4123-40A6-AFA8-561761A7A608");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, "STN INI CO CONS");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, 0, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, "FAA4E618-A2DF-4C6A-B2DE-D0D30D5C7272");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, "STN INI CO SVIL");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, 0, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, "7CAB1310-DCB1-4929-A61D-4A1E5B335509");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, "IMP ULT CHIUSO");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, 0, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, "7E94EFFC-9DAE-4B19-BA4F-9AF66BA43A71");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, "IMP ULT CHIUSO CONS");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, 0, -1);
    PAN_STANZUOSIMUL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, "B8593C2F-3165-4838-905A-F3515A4EBDE9");
    PAN_STANZUOSIMUL.set_Header(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, "IMP ULT CHIUSO SVIL");
    PAN_STANZUOSIMUL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, "");
    PAN_STANZUOSIMUL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZUOSIMUL.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, 0, -1);
  }

  private void PAN_STANZUOSIMUL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_LIST, 16, 100, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_LIST, "Prog. Unità Organizzativa");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PROGUNITORGA, MyGlb.PANEL_FORM, "Prog. Unità Organizzativa");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_PROGUNITORGA, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_PROGUNITORGA, PPQRY_BILUO, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_LIST, 140, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_LIST, "CAP.");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_FORM, 436, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_CAPITOLO, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_CAPITOLO, PPQRY_BILUO, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_LIST, 180, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_FORM, 136);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_ARTICOLO, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_ARTICOLO, PPQRY_BILUO, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_LIST, 332, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_LIST, 64);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_FORM, 136);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_STANZIAMENTO, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_STANZIAMENTO, PPQRY_BILUO, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_LIST, 444, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_LIST, 68);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_LIST, "Previsione");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_FORM, 136);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIONE, MyGlb.PANEL_FORM, "Previsione");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_PREVISIONE, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_PREVISIONE, PPQRY_BILUO, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_LIST, 0, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_ESERCIZIO, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_ESERCIZIO, PPQRY_BILUO, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_LIST, 0, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_LIST, 24);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_FORM, 4, 244, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_FORM, 24);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_ES, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_ES, PPQRY_BILUO, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 16, 8, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 16, 8, 156, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_ESTVOCPEGLAB, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_ESTVOCPEGLAB, -1, "", "ESTVOCPEGLAB", 0, 0, 0, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.PANEL_LIST, 332, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.PANEL_LIST, 0);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.PANEL_FORM, 108, 332, 80, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.PANEL_FORM, 0);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STINICOTOTAL, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_STINICOTOTAL, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_STINICOTOTAL, -1, "", "STINICOTOTAL", 0, 0, 0, -13997);
    PAN_STANZUOSIMUL.set_Alignment(PFL_STANZUOSIMUL_STINICOTOTAL, 4);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.PANEL_LIST, 444, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.PANEL_LIST, 0);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.PANEL_FORM, 72, 368, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.PANEL_FORM, 0);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_PREVISTOTALE, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_PREVISTOTALE, -1, "", "PREVISTOTALE", 0, 0, 0, -13997);
    PAN_STANZUOSIMUL.set_Alignment(PFL_STANZUOSIMUL_PREVISTOTALE, 4);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_LIST, 0, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_LIST, 108);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVISIONE CONS");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_FORM, 4, 268, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_FORM, 108);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVISIONE CONS");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_PREVISIOCONS, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_PREVISIOCONS, PPQRY_BILUO, "A.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_LIST, 0, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_LIST, 104);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVISIONE SVIL");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_FORM, 4, 268, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_FORM, 104);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVISIONE SVIL");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_PREVISIOSVIL, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_PREVISIOSVIL, PPQRY_BILUO, "A.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_LIST, 0, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_LIST, 100);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_FORM, 100);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CONS");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_STNINICOCONS, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_STNINICOCONS, PPQRY_BILUO, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_LIST, 0, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_LIST, 96);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_FORM, 4, 268, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_FORM, 96);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_STNINICOSVIL, MyGlb.PANEL_FORM, "STN INI CO SVIL");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_STNINICOSVIL, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_STNINICOSVIL, PPQRY_BILUO, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_LIST, 8, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_LIST, 100);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_LIST, "IMP ULT CHIUSO");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_FORM, 12, 276, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_FORM, 100);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHIUSO, MyGlb.PANEL_FORM, "IMP ULT CHIUSO");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_IMPULTCHIUSO, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_IMPULTCHIUSO, PPQRY_BILUO, "A.IMP_ULT_CHIUSO", "IMP_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_LIST, 0, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_LIST, 132);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_LIST, "IMP ULT CHIUSO CONS");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_FORM, 132);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHICON, MyGlb.PANEL_FORM, "IMP ULT CHIUSO CONS");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_IMPULTCHICON, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_IMPULTCHICON, PPQRY_BILUO, "A.IMP_ULT_CHIUSO_CONS", "IMP_ULT_CHIUSO_CONS", 3, 14, 2, -13997);
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_LIST, 8, 60, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_LIST, 128);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_LIST, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_LIST, "IMP ULT CHIUSO SVIL");
    PAN_STANZUOSIMUL.SetRect(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_FORM, 12, 276, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZUOSIMUL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_FORM, 128);
    PAN_STANZUOSIMUL.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_FORM, 1);
    PAN_STANZUOSIMUL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZUOSIMUL_IMPULTCHISVI, MyGlb.PANEL_FORM, "IMP ULT CHIUSO SVIL");
    PAN_STANZUOSIMUL.SetFieldPage(PFL_STANZUOSIMUL_IMPULTCHISVI, -1, -1);
    PAN_STANZUOSIMUL.SetFieldPanel(PFL_STANZUOSIMUL_IMPULTCHISVI, PPQRY_BILUO, "A.IMP_ULT_CHIUSO_SVIL", "IMP_ULT_CHIUSO_SVIL", 3, 14, 2, -13997);
  }

  private void PAN_STANZUOSIMUL_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZUOSIMUL.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI339.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRI339.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRI339.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRI339.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    PAN_STANZUOSIMUL.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_STANZUOSIMUL_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI339.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRI339.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRI339.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRI339.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    PAN_STANZUOSIMUL.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_STANZUOSIMUL_PROGUNITORGA, "");
    PAN_STANZUOSIMUL.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZUOSIMUL.SetIMDB(IMDB, "PQRY_BILUO", true);
    PAN_STANZUOSIMUL.set_SetString(MyGlb.MASTER_ROWNAME, "BIL UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  A.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
    SQL.append("  A.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  A.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  A.IMP_ULT_CHIUSO as IMP_ULT_CHIUSO, ");
    SQL.append("  A.IMP_ULT_CHIUSO_CONS as IMP_ULT_CHIUSO_CONS, ");
    SQL.append("  A.IMP_ULT_CHIUSO_SVIL as IMP_ULT_CHIUSO_SVIL, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_STANZUOSIMUL.SetQuery(PPQRY_BILUO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BPR_UO A ");
    PAN_STANZUOSIMUL.SetQuery(PPQRY_BILUO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI339.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRI339.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRI339.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRI339.ROWNAMEARTIC~~) ");
    PAN_STANZUOSIMUL.SetQuery(PPQRY_BILUO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZUOSIMUL.SetQuery(PPQRY_BILUO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZUOSIMUL.SetQuery(PPQRY_BILUO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZUOSIMUL.SetQuery(PPQRY_BILUO, 5, SQL, -1, "");
    PAN_STANZUOSIMUL.SetQueryDB(PPQRY_BILUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZUOSIMUL.SetMasterTable(0, "BPR_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZUOSIMUL.Status() == 2)
    {
      int oldListQBE = PAN_STANZUOSIMUL.iUseListQBE;
      PAN_STANZUOSIMUL.iUseListQBE = 0;
      PAN_STANZUOSIMUL.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZUOSIMUL.PanelCommand(Glb.PCM_FIND);
      PAN_STANZUOSIMUL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_ValidateRow(Cancel);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_DynamicProperties();
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_BeforeInsert(Cancel);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_AfterFind(CmdFind);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_STANZUOEFFET) PAN_STANZUOEFFET_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_STANZUOSIMUL) PAN_STANZUOSIMUL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
