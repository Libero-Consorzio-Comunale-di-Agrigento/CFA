// **********************************************
// Info Su Voce Bilancio Per Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoSuVoceBilancioPerVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_ESERCIZIO = 0;

  private static int PPQRY_FILTRO26 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_FILTRO;
  OTabView TAB_NEWTABBEVIEW;
  private static int PFL_DISPONIBILIT_I = 0;
  private static int PFL_DISPONIBILIT_VARIMPEGNABI = 1;
  private static int PFL_DISPONIBILIT_LABELVARIMPE = 2;
  private static int PFL_DISPONIBILIT_IMPEGNABILE = 3;
  private static int PFL_DISPONIBILIT_LABEIMPEINIZ = 4;
  private static int PFL_DISPONIBILIT_STANPROVSVIL = 5;
  private static int PFL_DISPONIBILIT_STANPROVCONS = 6;
  private static int PFL_DISPONIBILIT_STANZPROVTOT = 7;
  private static int PFL_DISPONIBILIT_STANZPROVVIS = 8;
  private static int PFL_DISPONIBILIT_VARPROVVISO1 = 9;
  private static int PFL_DISPONIBILIT_STANZATTUALE = 10;
  private static int PFL_DISPONIBILIT_STANATTUSVIL = 11;
  private static int PFL_DISPONIBILIT_STANATTUCONS = 12;
  private static int PFL_DISPONIBILIT_STANZATTUTOT = 13;
  private static int PFL_DISPONIBILIT_VARIAZIONI = 14;
  private static int PFL_DISPONIBILIT_STANZINIZIAL = 15;
  private static int PFL_DISPONIBILIT_SVILUPPO = 16;
  private static int PFL_DISPONIBILIT_CONSOLIDATO = 17;
  private static int PFL_DISPONIBILIT_TOTALE = 18;
  private static int PFL_DISPONIBILIT_VARIAZCOSVIL = 19;
  private static int PFL_DISPONIBILIT_VARIAZCOCONS = 20;
  private static int PFL_DISPONIBILIT_VARIAZIONICO = 21;
  private static int PFL_DISPONIBILIT_STNINICOSVIL = 22;
  private static int PFL_DISPONIBILIT_STNINICOCONS = 23;
  private static int PFL_DISPONIBILIT_STNINICO = 24;
  private static int PFL_DISPONIBILIT_VARPROVVISOR = 25;
  private static int PFL_DISPONIBILIT_VARPROVVCONS = 26;
  private static int PFL_DISPONIBILIT_VARPROVVSVIL = 27;
  private static int PFL_DISPONIBILIT_IMPEGNABIATT = 28;
  private static int PFL_DISPONIBILIT_DISPONIBILIT = 29;
  private static int PFL_DISPONIBILIT_DISPONIBCONS = 30;
  private static int PFL_DISPONIBILIT_DISPONIBSVIL = 31;
  private static int PFL_DISPONIBILIT_LABELDISPONI = 32;
  private static int PFL_DISPONIBILIT_VARIAZPROPOS = 33;
  private static int PFL_DISPONIBILIT_ESERCIZIO1 = 34;
  private static int PFL_DISPONIBILIT_CAPITOLO2 = 35;
  private static int PFL_DISPONIBILIT_ARTICOLO2 = 36;
  private static int PFL_DISPONIBILIT_SCADENZA = 37;
  private static int PFL_DISPONIBILIT_LABEIMPEACCE = 38;
  private static int PFL_DISPONIBILIT_VARPROPOSTE1 = 39;
  private static int PFL_DISPONIBILIT_VARPROPCONS1 = 40;
  private static int PFL_DISPONIBILIT_VARPROPSVIL1 = 41;
  private static int PFL_DISPONIBILIT_VARPROPOSTE2 = 42;
  private static int PFL_DISPONIBILIT_VARPROPCONS2 = 43;
  private static int PFL_DISPONIBILIT_VARPROPSVIL2 = 44;
  private static int PFL_DISPONIBILIT_VARPROPOSTE3 = 45;
  private static int PFL_DISPONIBILIT_VARPROPCONS3 = 46;
  private static int PFL_DISPONIBILIT_VARPROPSVIL3 = 47;
  private static int PFL_DISPONIBILIT_STANZCONPROP = 48;
  private static int PFL_DISPONIBILIT_STANZIPROVVI = 49;
  private static int PFL_DISPONIBILIT_STANZIPROVV2 = 50;
  private static int PFL_DISPONIBILIT_STANZIPROVV3 = 51;
  private static int PFL_DISPONIBILIT_STANZIPROVV4 = 52;
  private static int PFL_DISPONIBILIT_STANZIPROVV5 = 53;
  private static int PFL_DISPONIBILIT_STANZIPROVV6 = 54;
  private static int PFL_DISPONIBILIT_STANZIPROVV7 = 55;
  private static int PFL_DISPONIBILIT_STANZIPROVV8 = 56;
  private static int PFL_DISPONIBILIT_STANZIPROVV9 = 57;
  private static int PFL_DISPONIBILIT_ES = 58;

  private static int PPQRY_VISTABILANU1 = 0;


  IDPanel PAN_DISPONIBILIT;
  private static int PFL_UNITAORGANIZ_CODICE = 0;
  private static int PFL_UNITAORGANIZ_DESCRIZIONE1 = 1;
  private static int PFL_UNITAORGANIZ_STANZIAMENTO = 2;
  private static int PFL_UNITAORGANIZ_VARIAZIONI2 = 3;
  private static int PFL_UNITAORGANIZ_STANZDEFINI1 = 4;
  private static int PFL_UNITAORGANIZ_IMPACC1 = 5;
  private static int PFL_UNITAORGANIZ_DISPONIBILI1 = 6;

  private static int PPQRY_VISTABILANU2 = 0;


  IDPanel PAN_UNITAORGANIZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO27(IMDB);
    Init_TBL_PARAMETRI106(IMDB);
    //
    //
    Init_PQRY_VISTABILANU1(IMDB);
    Init_PQRY_VISTABILANU2(IMDB);
    Init_PQRY_FILTRO26(IMDB);
    Init_PQRY_FILTRO26_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FILTRO27, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_FILTRO27, "TBL_FILTRO27");
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRO27,IMDBDef4.FLD_FILTRO27_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRO27,IMDBDef4.FLD_FILTRO27_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FILTRO27, 0);
  }

  private static void Init_TBL_PARAMETRI106(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI106, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI106, "TBL_PARAMETRI106");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAGESTECON, "PARAGESTECON");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAGESTECON,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARPROUNIORG, "PARPROUNIORG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARPROUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI106,IMDBDef4.FLD_PARAMETRI106_PARAMDATADAL,6,19,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI106, 0);
  }

  private static void Init_PQRY_VISTABILANU1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTABILANU1, 45);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTABILANU1, "PQRY_VISTABILANU1");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_ESERCIZIO,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_IMPEGNABILE, "VAR_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTATTO, "VIBIUOSTATTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTATTO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTATCO, "VIBIUOSTATCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTATCO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTATSV, "VIBIUOSTATSV");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTATSV,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTPRTO, "VIBIUOSTPRTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTPRTO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTPRCO, "VIBIUOSTPRCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTPRCO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTPRSV, "VIBIUOSTPRSV");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOSTPRSV,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBILUOIMAT, "VISBILUOIMAT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBILUOIMAT,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOLAIMA1, "VIBIUOLAIMA1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VIBIUOLAIMA1,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROVVISORIE, "VAR_PROVVISORIE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROVVISORIE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROVVISORIE_CONS, "VAR_PROVVISORIE_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROVVISORIE_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROVVISORIE_SVIL, "VAR_PROVVISORIE_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROVVISORIE_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_DISPONIBILITA_CONS, "DISPONIBILITA_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_DISPONIBILITA_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_DISPONIBILITA_SVIL, "DISPONIBILITA_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_DISPONIBILITA_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_SCADENZA,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_1, "VAR_PROPOSTE_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_1, "VAR_PROPOSTE_CONS_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_1, "VAR_PROPOSTE_SVIL_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_2, "VAR_PROPOSTE_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_2, "VAR_PROPOSTE_CONS_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_2, "VAR_PROPOSTE_SVIL_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_3, "VAR_PROPOSTE_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_3, "VAR_PROPOSTE_CONS_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_3, "VAR_PROPOSTE_SVIL_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBILUOSTPR, "VISBILUOSTPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBILUOSTPR,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR2, "VISBIUOSTPR2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR3, "VISBIUOSTPR3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR3,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR4, "VISBIUOSTPR4");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR4,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR5, "VISBIUOSTPR5");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR5,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR6, "VISBIUOSTPR6");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR6,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR7, "VISBIUOSTPR7");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR7,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR8, "VISBIUOSTPR8");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR8,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR9, "VISBIUOSTPR9");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU1,IMDBDef12.PQSL_VISTABILANU1_VISBIUOSTPR9,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTABILANU1, 0);
  }

  private static void Init_PQRY_VISTABILANU2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTABILANU2, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTABILANU2, "PQRY_VISTABILANU2");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VISTBILUOCOD, "VISTBILUOCOD");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VISTBILUOCOD,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VISTBILUODES, "VISTBILUODES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VISTBILUODES,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VISBILUOSTDE, "VISBILUOSTDE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_VISBILUOSTDE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_IMP_ACC, "IMP_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILANU2,IMDBDef12.PQSL_VISTABILANU2_DISPONIBILITA,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTABILANU2, 0);
  }

  private static void Init_PQRY_FILTRO26(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO26, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO26, "PQRY_FILTRO26");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO26,IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO26,IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO26, 0);
  }

  private static void Init_PQRY_FILTRO26_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO26_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO26_RS, "PQRY_FILTRO26_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO26_RS,IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO26_RS,IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoSuVoceBilancioPerVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoSuVoceBilancioPerVariazioni()
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
    FormIdx = MyGlb.FRM_INSUVOBIPEVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FB881F3B-38BC-455B-8E31-906151B7D186";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 860;
    DesignHeight = 526;
    set_Caption(new IDVariant("Info Su Voce Bilancio Per Variazioni"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 860;
    Frames[1].Height = 500;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.12;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 860;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 860-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8BF03425-169C-42FC-88D0-194AAE5668D7");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 860;
    Frames[3].Height = 440;
    Frames[3].Caption = "New Tabbed View";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 440;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[3].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "E70DA9EF-D294-4421-8379-51A88DBDD687";
    TAB_NEWTABBEVIEW.SetItemCount(2);
    TAB_NEWTABBEVIEW.Placement = 1;
    TAB_NEWTABBEVIEW.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Disponibilità";
    Frames[4].Parent = this;
    PAN_DISPONIBILIT = new IDPanel(w, this, 4, "PAN_DISPONIBILIT");
    Frames[4].Content = PAN_DISPONIBILIT;
    PAN_DISPONIBILIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISPONIBILIT.VS = MainFrm.VisualStyleList;
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 860-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "68DCB242-F4E0-462D-BFCA-C84CE7BDABA6");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4536, 292, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISPONIBILIT.InitStatus = 2;
    PAN_DISPONIBILIT_Init();
    PAN_DISPONIBILIT_InitFields();
    PAN_DISPONIBILIT_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(1, Frames[4], 0, "", "Disponibilità", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Unità Organizzative";
    Frames[5].Parent = this;
    PAN_UNITAORGANIZ = new IDPanel(w, this, 5, "PAN_UNITAORGANIZ");
    Frames[5].Content = PAN_UNITAORGANIZ;
    PAN_UNITAORGANIZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_UNITAORGANIZ.VS = MainFrm.VisualStyleList;
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 860-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5FD0E0BA-78E4-497A-821D-ADEFC59BC8E8");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 808, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_UNITAORGANIZ.InitStatus = 2;
    PAN_UNITAORGANIZ_Init();
    PAN_UNITAORGANIZ_InitFields();
    PAN_UNITAORGANIZ_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[5], 0, "", "Unità Organizzative", "");
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
      if (CmdIdx==MyGlb.CMD_FUNZIONI+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_COMANDI5+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIONI+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FINANZIAMEN8+BaseCmdLinIdx)
      {
        ApriFinanziamenti();
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
      if (IMDB.TblModified(IMDBDef4.TBL_FILTRO27, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INSUVOBIPEVA_FILTRO26();
      }
      PAN_DISPONIBILIT.UpdatePanel(MainFrm);
      PAN_UNITAORGANIZ.UpdatePanel(MainFrm);
      PAN_FILTRO.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoSuVoceBilancioPerVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoSuVoceBilancioPerVariazioni.class.getName() : (Glb.ClassWithPackage(InfoSuVoceBilancioPerVariazioni.class) ? InfoSuVoceBilancioPerVariazioni.class.getName().substring(InfoSuVoceBilancioPerVariazioni.class.getPackage().getName().length() + 1) : InfoSuVoceBilancioPerVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // New Tabbed View Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_NEWTABBEVIEW_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // New Tabbed View Change Page Event Body
      // Procedure Body
      // 
      if (PreviousPage.equals((new IDVariant(PAN_DISPONIBILIT.FrIndex)), true))
      {
        PAN_FILTRO.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_FILTRO.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "NewTabbedViewChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Settacaption
  // **********************************************************************
  public int Settacaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ESERCIZIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ESERCIZIO = (new IDVariant(" - Esercizio ", IDVariant.STRING));
      // 
      // Settacaption Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo/Art ")), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMARTICOL, 0))), v_ESERCIZIO), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "Settacaption", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAGESTECON, 0, new IDVariant(MainFrm.GESTIOECONOM));
      IMDB.set_Value(IMDBDef4.TBL_FILTRO27, IMDBDef4.FLD_FILTRO27_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CF4FDWEB")), true))
      {
        PAN_UNITAORGANIZ.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_UNITAORGANIZ.set_Visible((new IDVariant(-1)).booleanValue());
      }
      // if (IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMES, 0).equals((new IDVariant("E")), true))
      // {
        // PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // }
      // else
      // {
      // }
      PAN_DISPONIBILIT.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Disponibilità After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DISPONIBILIT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNTUO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Disponibilità After Find Event Body
      // Procedure Body
      // 
      Settacaption();
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMES, 0).equals((new IDVariant("S")), true) && MainFrm.GESTIOIMPEGN.equals((new IDVariant("SI")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_I, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_I, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMES, 0).equals((new IDVariant("E")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  VISTA_BILANCIO_UO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARPROUNIORG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COUNTUO = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_COUNTUO.equals((new IDVariant(1)), true) || v_COUNTUO.equals((new IDVariant(0)), true))
      {
        PAN_UNITAORGANIZ.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_UNITAORGANIZ.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "DisponibilitàAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Unità Organizzative On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_UNITAORGANIZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_UNITAORGANIZ);
      // 
      // Unità Organizzative On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_UNITAORGANIZ.set_ToolTip(Glb.OBJ_FIELD,PFL_UNITAORGANIZ_DESCRIZIONE1,IMDB.Value(IMDBDef12.PQRY_VISTABILANU2, IMDBDef12.PQSL_VISTABILANU2_VISTBILUODES, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "UnitàOrganizzativeOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Unità Organizzative After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_UNITAORGANIZ_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unità Organizzative After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMES, 0).equals((new IDVariant("S")), true))
      {
        PAN_UNITAORGANIZ.set_Header(Glb.OBJ_FIELD,PFL_UNITAORGANIZ_IMPACC1, (new IDVariant("Impegnato")).stringValue());
      }
      else
      {
        PAN_UNITAORGANIZ.set_Header(Glb.OBJ_FIELD,PFL_UNITAORGANIZ_IMPACC1, (new IDVariant("Accertato")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "UnitàOrganizzativeAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Piano Dei Conti
  // **********************************************************************
  public int ApriPianoDeiConti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Piano Dei Conti Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(MyGlb.FRM_INFOPDCONTI,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI432, IMDBDef1.FLD_PARAMETRI432_ROWNAMEESERC, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VISTABILANU1, IMDBDef12.PQSL_VISTABILANU1_ESERCIZIO, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI432, IMDBDef1.FLD_PARAMETRI432_ROWNAMENTSPE, 0, IMDB.Value(IMDBDef12.PQRY_VISTABILANU1, IMDBDef12.PQSL_VISTABILANU1_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI432, IMDBDef1.FLD_PARAMETRI432_ROWNAMECAPIT, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VISTABILANU1, IMDBDef12.PQSL_VISTABILANU1_CAPITOLO, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI432, IMDBDef1.FLD_PARAMETRI432_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_VISTABILANU1, IMDBDef12.PQSL_VISTABILANU1_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_INFOPDCONTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "ApriPianoDeiConti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Finanziamenti
  // **********************************************************************
  public int ApriFinanziamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Finanziamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMES, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMES, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMCAPITOL, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMCAPITOL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMARTICOL, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI106, IMDBDef4.FLD_PARAMETRI106_PARAMARTICOL, 0));
      MainFrm.UnloadForm(MyGlb.FRM_FINAVOCIBILA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_FINAVOCIBILA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "ApriFinanziamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtro On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRO);
      // 
      // Filtro On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO26, IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO26, IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, 0).equals(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO26, IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, 0).equals(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "FiltroOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro Esercizio Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRO_ESERCIZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro Esercizio Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_FILTRO26, IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_FILTRO27, IMDBDef4.FLD_FILTRO27_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef12.PQRY_FILTRO26, IMDBDef12.PQSL_FILTRO26_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoSuVoceBilancioPerVariazioni", "FiltroEsercizioValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void INSUVOBIPEVA_FILTRO26() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_FILTRO26_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO27, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FILTRO27, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO26_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_FILTRO26_RS, 0, IMDBDef4.TBL_FILTRO27, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_FILTRO26_RS, 0, 0, IMDBDef4.TBL_FILTRO27, IMDBDef4.FLD_FILTRO27_ROWNAMEESERC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FILTRO27, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FILTRO27, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO27, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_FILTRO26_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRO_ESERCIZIO)
      {
        PFL_FILTRO_ESERCIZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_NEWTABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_NEWTABBEVIEW_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISPONIBILIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISPONIBILIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISPONIBILIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISPONIBILIT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISPONIBILIT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISPONIBILIT);
    // Stub
  }

  private void PAN_DISPONIBILIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISPONIBILIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISPONIBILIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISPONIBILIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_UNITAORGANIZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_UNITAORGANIZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_UNITAORGANIZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_UNITAORGANIZ, Cancel);
    // Stub
  }

  private void PAN_UNITAORGANIZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_UNITAORGANIZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_UNITAORGANIZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_UNITAORGANIZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISPONIBILIT_Init()
  {

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_FIELD, 59);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, "61FBB0B8-1F13-467F-A549-A4D29FF7F44C");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, "Impegnabile Attuale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, "FB867774-04D8-4293-BAE4-04F2D4B1C9D7");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, "VAR IMPEGNABILE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, "EE3B6F46-9661-487F-96FD-56CF9A3262DB");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, "Variazioni Impegnabile");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, "7EE83E79-BA14-4738-8D29-48CD586DE520");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, "IMPEGNABILE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, "46AB8E44-DF3E-446F-8916-7D1B6BAE5C71");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, "Impegnabile Iniziale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, "DF745EDC-9146-49F3-80FE-13682BB133D5");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, "Stanz Provvisorio Svil");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, "0EFBD421-F4FB-42EE-917E-E98ADF3BE5BA");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, "Stanz Provvisorio Cons");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, "EA62C8CA-9825-4012-9745-85C1991E2290");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, "Stanz Provvisorio Tot");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, "924B119E-0882-4FBF-BA90-3592A449BB8B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, "Stanziamento Provvisorio");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, "8E8AF146-3279-46A0-A561-C05B7E31F76D");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, "Variazioni Provvisorie");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, "46142535-71A6-46E7-A37D-5438C6B009A5");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, "Stanziamento Attuale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, "6BC3A037-F8A6-4F5A-AF8E-5D36FC3544B8");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, "Stanziamento Attuale Svil");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, "2C665734-3582-4357-B9ED-353884134DC0");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, "Stanziamento Attuale Cons");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, "D33D6949-7D7C-4F5A-8942-408DBE3FED15");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, "Stanz Attuale Tot");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, "AB815741-B695-462D-B35B-FCD0B61F847B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, "Variazioni");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, "26FDA8E6-4A99-4175-A318-B730F31B8B48");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, "Stanziamento Iniziale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, "17224F96-8DB4-484E-A557-E2E253B300DB");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, "Sviluppo");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, "5714B03E-F2F7-4088-B483-4AE6792BC314");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, "Consolidato");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, "F9908752-71F5-481B-8A96-0EAC95065CB0");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, "Totale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, "D3B83042-FD56-4ECC-9C8C-C3F634CAE2DA");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, "57A9E033-3E75-4962-89D0-25FB6512CF46");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, "B88BB233-F1FC-48F4-B9AB-71C16DA9BADE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, "VARIAZIONI CO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, "FA815A86-E51A-47D6-A34F-4BD9310AFAAD");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, "STN INI CO SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, "068E53A9-FFB2-43CC-AF8F-D189688AABEE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, "STN INI CO CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, "4A566B20-E0AE-4FC4-8CC5-A30885B5D41B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, "STN INI CO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, "C6F054C9-B7F5-4C97-9528-1CB1051E3C82");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, "VAR PROVVISORIE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, "F9C27E03-304E-4F84-AA00-1831CF69452A");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, "VAR PROVVISORIE CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, "BAE4E25B-1054-4EA3-9ADA-08FBDB9471D0");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, "VAR PROVVISORIE SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, "98B69B24-AD77-471E-BB15-2B2F67CD8BDA");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, "Impegnabile Att");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "630896B9-1BD9-4140-816C-96E5BABA6603");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "DISPONIBILITA");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, "2B0CC2FA-2509-41BF-B1F2-6D4B4658C277");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, "DISPONIBILITA CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, "B58289C8-9990-4BC9-AA57-CADC69EAB3C9");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, "DISPONIBILITA SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, "BE4CBF2D-AFDA-403E-B2F3-241057C632F3");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, "Disponibilità");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, "AA7F316F-4B12-4605-AA66-A6AD2210696B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, "Variazioni Proposte");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, "720B9F21-A9C3-4153-874B-654E3B973A51");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, "ESERCIZIO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, "933AEABF-7E81-42DE-859D-531304ED030D");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, "CAPITOLO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, "54CFE10E-7EC0-4B77-9BBA-36C482172C97");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, "ARTICOLO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, "8A2B7F23-EA96-4583-B518-64CF4259DED0");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, "SCADENZA");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, "B99FCB3E-D1EC-4BE5-AC93-495A6AD25BC3");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, "Label Impegno Accertamento");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, "E3BF3975-67B9-4D07-87A8-E45E6ECEE656");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, "VAR PROPOSTE 1");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, "6E6083B1-EDE0-4020-9610-A09A4078FB84");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, "VAR PROPOSTE CONS 1");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, "FFDE48C4-8B73-4AC7-9C3F-ADD92666588E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, "VAR PROPOSTE SVIL 1");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, "24513BE9-8A90-4CDC-BA04-16DC3679377E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, "VAR PROPOSTE 2");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, "310066AE-F7AE-4487-AB8D-01779DF90BB2");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, "VAR PROPOSTE CONS 2");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, "00027027-A33E-49F5-82F2-A01D84D27832");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, "VAR PROPOSTE SVIL 2");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, "1057AA2A-AF33-49F6-943D-18A8C704A234");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, "VAR PROPOSTE 3");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, "7CF9828F-A6A6-41E2-82D1-7CE42554CCD4");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, "VAR PROPOSTE CONS 3");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, "F939B03E-0485-4628-AFFD-AE37AFA9A2F9");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, "VAR PROPOSTE SVIL 3");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, "F9107182-AFED-49CB-ACB4-479BDDCFB931");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, "Stanziamento con Proposte");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, "26DBE229-8B07-4987-8115-CB83176CE558");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, "Stanziamento Provvisorio1");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, "F096C8E3-C714-4EE0-94AA-224B6C12D60E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, "Stanziamento Provvisorio 2");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, "POL VISTA BILANCIO UO STN INI CO + POL VISTA BILANCIO UO VARIAZIONI CO + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE 2");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, "0654FE15-6111-485D-B88E-CEAFE48F0629");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, "Stanziamento Provvisorio 3");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, "POL VISTA BILANCIO UO STN INI CO + POL VISTA BILANCIO UO VARIAZIONI CO + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE 3");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, "55EF93CA-A7EE-49C2-9DD4-BEDEBAB7CB55");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, "Stanziamento Provvisorio 4");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, "POL VISTA BILANCIO UO STN INI CO CONS + POL VISTA BILANCIO UO VARIAZIONI CO CONS + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE CONS, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE CONS 1");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, "AAC38C82-6C2D-4128-8A0F-1E276C9825ED");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, "Stanziamento Provvisorio 5");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, "POL VISTA BILANCIO UO STN INI CO CONS + POL VISTA BILANCIO UO VARIAZIONI CO CONS + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE CONS, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE CONS 2");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, "FE0C4283-15B4-46F2-A8CB-374522F2871F");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, "Stanziamento Provvisorio 6");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, "POL VISTA BILANCIO UO STN INI CO CONS + POL VISTA BILANCIO UO VARIAZIONI CO CONS + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE CONS, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE CONS 3");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, "D9217BF3-CEFC-4B99-A641-287BC7DD897D");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, "Stanziamento Provvisorio 7");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, "POL VISTA BILANCIO UO STN INI CO SVIL + POL VISTA BILANCIO UO VARIAZIONI CO SVIL + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE SVIL, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE SVIL 1");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, "314E1ABD-4AAC-4A8D-B320-DCF7D5AE9860");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, "Stanziamento Provvisorio 8");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, "POL VISTA BILANCIO UO STN INI CO SVIL + POL VISTA BILANCIO UO VARIAZIONI CO SVIL + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE SVIL, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE SVIL 2");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, "9C918C5D-3975-4025-8387-F9BD5B170DDE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, "Stanziamento Provvisorio 9");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, "POL VISTA BILANCIO UO STN INI CO SVIL + POL VISTA BILANCIO UO VARIAZIONI CO SVIL + Null Value (POL VISTA BILANCIO UO VAR PROVVISORIE SVIL, ZERO) + POL VISTA BILANCIO UO VAR PROPOSTE SVIL 3");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, "7A027B86-9F98-4393-A3F9-6431F1510887");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, "E S");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISPONIBILIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.PANEL_LIST, 200, 68, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.PANEL_FORM, 52, 276, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_I, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_I, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_I, -1, "", "I", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_LIST, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_LIST, "VAR IMPEGNABILE");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_FORM, 180, 248, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNABI, MyGlb.PANEL_FORM, "VAR IMPEGN.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIMPEGNABI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIMPEGNABI, PPQRY_VISTABILANU1, "A.VAR_IMPEGNABILE", "VAR_IMPEGNABILE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_LIST, 192, 60, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_FORM, 24, 252, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELVARIMPE, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELVARIMPE, -1, "", "LABELVARIMPE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, "IMPEGN.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, 180, 224, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, "IMPEGN.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPEGNABILE, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPEGNABILE, PPQRY_VISTABILANU1, "A.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_LIST, 184, 52, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_FORM, 32, 228, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABEIMPEINIZ, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABEIMPEINIZ, -1, "", "LABEIMPEINIZ", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, "Stanz Provvisorio Svil");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, 388, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, "S. P. S.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANPROVSVIL, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANPROVSVIL, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANPROVSVIL, PPQRY_VISTABILANU1, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0)", "VIBIUOSTPRSV", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, "Stanz Provvisorio Cons");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, 284, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, "St. Provvisorio Cons");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANPROVCONS, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANPROVCONS, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANPROVCONS, PPQRY_VISTABILANU1, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0)", "VIBIUOSTPRCO", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, "Stanz Provvisorio Tot");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, 180, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, "St. Provvisorio Tot");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZPROVTOT, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZPROVTOT, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZPROVTOT, PPQRY_VISTABILANU1, "A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0)", "VIBIUOSTPRTO", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_LIST, 176, 44, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_FORM, 16, 152, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZPROVVIS, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZPROVVIS, -1, "", "STANZPROVVIS", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_LIST, 168, 36, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_FORM, 36, 128, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVISO1, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVISO1, -1, "", "VARPROVVISO1", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_LIST, 160, 28, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_FORM, 36, 104, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZATTUALE, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZATTUALE, -1, "", "STANZATTUALE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, "Stanziamento Attuale Svil");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, 388, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, "Stanziam. Attuale Svil");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANATTUSVIL, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANATTUSVIL, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANATTUSVIL, PPQRY_VISTABILANU1, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL", "VIBIUOSTATSV", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, "Stanziamento Attuale Cons");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, 284, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, "Stanziam. Attuale Cons");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANATTUCONS, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANATTUCONS, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANATTUCONS, PPQRY_VISTABILANU1, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS", "VIBIUOSTATCO", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, "Stanz Attuale Tot");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, 180, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, "St. Attuale Tot");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZATTUTOT, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZATTUTOT, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZATTUTOT, PPQRY_VISTABILANU1, "A.STN_INI_CO + A.VARIAZIONI_CO", "VIBIUOSTATTO", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.PANEL_FORM, 92, 80, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZIONI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZIONI, -1, "", "VARIAZIONI", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.PANEL_LIST, 144, 12, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.PANEL_FORM, 36, 56, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIAL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZINIZIAL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZINIZIAL, -1, "", "STANZINIZIAL", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_FORM, 388, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SVILUPPO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SVILUPPO, -1, "", "SVILUPPO", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_LIST, 144, 12, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_FORM, 284, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_CONSOLIDATO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_CONSOLIDATO, -1, "", "CONSOLIDATO", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_LIST, 136, 4, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_FORM, 180, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_TOTALE, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_TOTALE, -1, "", "TOTALE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZ. CO SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, 388, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZCOSVIL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZCOSVIL, PPQRY_VISTABILANU1, "A.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZ. CO CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, 284, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZ. CO CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZCOCONS, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZCOCONS, PPQRY_VISTABILANU1, "A.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZ. CO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_FORM, 180, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZ. CO");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZIONICO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZIONICO, PPQRY_VISTABILANU1, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, 388, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, "ST. INI CO SVL.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STNINICOSVIL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STNINICOSVIL, PPQRY_VISTABILANU1, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, 284, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CNS.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STNINICOCONS, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STNINICOCONS, PPQRY_VISTABILANU1, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_LIST, "STN INI CO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_FORM, 180, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_FORM, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO, MyGlb.PANEL_FORM, "ST. INI CO");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STNINICO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STNINICO, PPQRY_VISTABILANU1, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, "VAR PROVVISORIE");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, 180, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, "VAR PROVV.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVISOR, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVISOR, PPQRY_VISTABILANU1, "A.VAR_PROVVISORIE", "VAR_PROVVISORIE", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, "VAR PROVVISORIE CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, 284, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, "VAR PROVV. CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVCONS, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVCONS, PPQRY_VISTABILANU1, "A.VAR_PROVVISORIE_CONS", "VAR_PROVVISORIE_CONS", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, "VAR PROVVISORIE SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, 388, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, "VAR PROVV. SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVSVIL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVSVIL, PPQRY_VISTABILANU1, "A.VAR_PROVVISORIE_SVIL", "VAR_PROVVISORIE_SVIL", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_LIST, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_LIST, "Impegnabile Att");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_FORM, 180, 272, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_FORM, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIATT, MyGlb.PANEL_FORM, "Impegn. Att");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPEGNABIATT, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_IMPEGNABIATT, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPEGNABIATT, PPQRY_VISTABILANU1, "NVL(A.VAR_IMPEGNABILE, 0) + NVL(A.IMPEGNABILE, 0)", "VISBILUOIMAT", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, "DISPON.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 180, 296, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, "DISPON.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBILIT, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBILIT, PPQRY_VISTABILANU1, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, "DISPONIBILITA CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, 284, 296, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, "DISPON. CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBCONS, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBCONS, PPQRY_VISTABILANU1, "A.DISPONIBILITA_CONS", "DISPONIBILITA_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, "DISPONIBILITA SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, 388, 296, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, "DISPON. SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBSVIL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBSVIL, PPQRY_VISTABILANU1, "A.DISPONIBILITA_SVIL", "DISPONIBILITA_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_LIST, 60, 148, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_FORM, 84, 300, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELDISPONI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELDISPONI, -1, "", "LABELDISPONI", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.PANEL_LIST, 184, 52, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.PANEL_FORM, 16, 176, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZPROPOS, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZPROPOS, -1, "", "VARIAZPROPOS", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ESERCIZIO1, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ESERCIZIO1, PPQRY_VISTABILANU1, "A.ESERCIZIO", "ESERCIZIO", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, 12, 372, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_CAPITOLO2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_CAPITOLO2, PPQRY_VISTABILANU1, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, 4, 364, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ARTICOLO2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ARTICOLO2, PPQRY_VISTABILANU1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_LIST, "SCADENZA");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_FORM, 4, 420, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SCADENZA, MyGlb.PANEL_FORM, "SCADENZA");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SCADENZA, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SCADENZA, PPQRY_VISTABILANU1, "A.SCADENZA", "SCADENZA", 8, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, 148);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, 2);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, "Label Impegno Accertamento");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, 4, 300, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, 148);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, 2);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, "Label Impegno Accertamento");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABEIMPEACCE, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_LABEIMPEACCE, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABEIMPEACCE, PPQRY_VISTABILANU1, "DECODE(~~TBL_PARAMETRI106.PARAMES~~, 'S', 'Impegni', 'Accertamenti')", "VIBIUOLAIMA1", 5, 99, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_LIST, "VAR PROPOSTE 1");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_FORM, 180, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE1, MyGlb.PANEL_FORM, "V. P. 1");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPOSTE1, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPOSTE1, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_1", "VAR_PROPOSTE_1", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_LIST, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_LIST, "VAR PROPOSTE CONS 1");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_FORM, 284, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_FORM, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS1, MyGlb.PANEL_FORM, "VAR PROP. CONS 1");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPCONS1, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPCONS1, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_CONS_1", "VAR_PROPOSTE_CONS_1", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_LIST, "VAR PROPOSTE SVIL 1");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_FORM, 388, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL1, MyGlb.PANEL_FORM, "V. P. S. 1");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPSVIL1, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPSVIL1, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_SVIL_1", "VAR_PROPOSTE_SVIL_1", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_LIST, "VAR PROPOSTE 2");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_FORM, 180, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE2, MyGlb.PANEL_FORM, "V. P. 2");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPOSTE2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPOSTE2, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_2", "VAR_PROPOSTE_2", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_LIST, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_LIST, "VAR PROPOSTE CONS 2");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_FORM, 284, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_FORM, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS2, MyGlb.PANEL_FORM, "VAR PROP. CONS 2");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPCONS2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPCONS2, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_CONS_2", "VAR_PROPOSTE_CONS_2", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_LIST, "VAR PROPOSTE SVIL 2");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_FORM, 388, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL2, MyGlb.PANEL_FORM, "V. P. S. 2");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPSVIL2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPSVIL2, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_SVIL_2", "VAR_PROPOSTE_SVIL_2", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_LIST, "VAR PROPOSTE 3");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_FORM, 180, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPOSTE3, MyGlb.PANEL_FORM, "V. P. 3");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPOSTE3, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPOSTE3, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_3", "VAR_PROPOSTE_3", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_LIST, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_LIST, "VAR PROPOSTE CONS 3");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_FORM, 284, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_FORM, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPCONS3, MyGlb.PANEL_FORM, "VAR PROP. CONS 3");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPCONS3, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPCONS3, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_CONS_3", "VAR_PROPOSTE_CONS_3", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_LIST, "VAR PROPOSTE SVIL 3");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_FORM, 388, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_FORM, 8);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROPSVIL3, MyGlb.PANEL_FORM, "V. P. S. 3");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROPSVIL3, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROPSVIL3, PPQRY_VISTABILANU1, "A.VAR_PROPOSTE_SVIL_3", "VAR_PROPOSTE_SVIL_3", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.PANEL_LIST, 192, 60, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.PANEL_FORM, 4, 200, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZCONPROP, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZCONPROP, -1, "", "STANZCONPROP", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_LIST, 136);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_LIST, "Stanziamento Provvisorio1");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_FORM, 180, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_FORM, 136);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVVI, MyGlb.PANEL_FORM, "Stanziam. Provvisorio1");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVVI, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVVI, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVVI, PPQRY_VISTABILANU1, "A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) + A.VAR_PROPOSTE_1", "VISBILUOSTPR", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 2");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_FORM, 180, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV2, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 2");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV2, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV2, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV2, PPQRY_VISTABILANU1, "A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) + A.VAR_PROPOSTE_2", "VISBIUOSTPR2", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 3");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_FORM, 180, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV3, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 3");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV3, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV3, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV3, PPQRY_VISTABILANU1, "A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) + A.VAR_PROPOSTE_3", "VISBIUOSTPR3", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 4");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_FORM, 284, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV4, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 4");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV4, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV4, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV4, PPQRY_VISTABILANU1, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) + A.VAR_PROPOSTE_CONS_1", "VISBIUOSTPR4", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 5");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_FORM, 284, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV5, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 5");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV5, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV5, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV5, PPQRY_VISTABILANU1, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) + A.VAR_PROPOSTE_CONS_2", "VISBIUOSTPR5", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 6");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_FORM, 284, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV6, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 6");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV6, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV6, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV6, PPQRY_VISTABILANU1, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) + A.VAR_PROPOSTE_CONS_3", "VISBIUOSTPR6", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 7");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_FORM, 388, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV7, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 7");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV7, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV7, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV7, PPQRY_VISTABILANU1, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) + A.VAR_PROPOSTE_SVIL_1", "VISBIUOSTPR7", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 8");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_FORM, 388, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV8, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 8");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV8, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV8, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV8, PPQRY_VISTABILANU1, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) + A.VAR_PROPOSTE_SVIL_2", "VISBIUOSTPR8", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 9");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_FORM, 388, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZIPROVV9, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 9");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZIPROVV9, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZIPROVV9, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZIPROVV9, PPQRY_VISTABILANU1, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) + A.VAR_PROPOSTE_SVIL_3", "VISBIUOSTPR9", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_LIST, 24);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_LIST, "E S");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_FORM, 4, 324, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_FORM, 24);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ES, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ES, PPQRY_VISTABILANU1, "A.E_S", "E_S", 5, 1, 0, -13997);
  }

  private void PAN_DISPONIBILIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISPONIBILIT.SetIMDB(IMDB, "PQRY_VISTABILANU1", true);
    PAN_DISPONIBILIT.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA BILANCIO UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  A.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  A.VARIAZIONI_CO_CONS as VARIAZIONI_CO_CONS, ");
    SQL.append("  A.VARIAZIONI_CO_SVIL as VARIAZIONI_CO_SVIL, ");
    SQL.append("  A.VAR_IMPEGNABILE as VAR_IMPEGNABILE, ");
    SQL.append("  A.IMPEGNABILE as IMPEGNABILE, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as VIBIUOSTATTO, ");
    SQL.append("  A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS as VIBIUOSTATCO, ");
    SQL.append("  A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL as VIBIUOSTATSV, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) as VIBIUOSTPRTO, ");
    SQL.append("  A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) as VIBIUOSTPRCO, ");
    SQL.append("  A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) as VIBIUOSTPRSV, ");
    SQL.append("  NVL(A.VAR_IMPEGNABILE, 0) + NVL(A.IMPEGNABILE, 0) as VISBILUOIMAT, ");
    SQL.append("  DECODE(~~TBL_PARAMETRI106.PARAMES~~, 'S', 'Impegni', 'Accertamenti') as VIBIUOLAIMA1, ");
    SQL.append("  A.VAR_PROVVISORIE as VAR_PROVVISORIE, ");
    SQL.append("  A.VAR_PROVVISORIE_CONS as VAR_PROVVISORIE_CONS, ");
    SQL.append("  A.VAR_PROVVISORIE_SVIL as VAR_PROVVISORIE_SVIL, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.DISPONIBILITA_CONS as DISPONIBILITA_CONS, ");
    SQL.append("  A.DISPONIBILITA_SVIL as DISPONIBILITA_SVIL, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.VAR_PROPOSTE_1 as VAR_PROPOSTE_1, ");
    SQL.append("  A.VAR_PROPOSTE_CONS_1 as VAR_PROPOSTE_CONS_1, ");
    SQL.append("  A.VAR_PROPOSTE_SVIL_1 as VAR_PROPOSTE_SVIL_1, ");
    SQL.append("  A.VAR_PROPOSTE_2 as VAR_PROPOSTE_2, ");
    SQL.append("  A.VAR_PROPOSTE_CONS_2 as VAR_PROPOSTE_CONS_2, ");
    SQL.append("  A.VAR_PROPOSTE_SVIL_2 as VAR_PROPOSTE_SVIL_2, ");
    SQL.append("  A.VAR_PROPOSTE_3 as VAR_PROPOSTE_3, ");
    SQL.append("  A.VAR_PROPOSTE_CONS_3 as VAR_PROPOSTE_CONS_3, ");
    SQL.append("  A.VAR_PROPOSTE_SVIL_3 as VAR_PROPOSTE_SVIL_3, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) + A.VAR_PROPOSTE_1 as VISBILUOSTPR, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) + A.VAR_PROPOSTE_2 as VISBIUOSTPR2, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0) + A.VAR_PROPOSTE_3 as VISBIUOSTPR3, ");
    SQL.append("  A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) + A.VAR_PROPOSTE_CONS_1 as VISBIUOSTPR4, ");
    SQL.append("  A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) + A.VAR_PROPOSTE_CONS_2 as VISBIUOSTPR5, ");
    SQL.append("  A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0) + A.VAR_PROPOSTE_CONS_3 as VISBIUOSTPR6, ");
    SQL.append("  A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) + A.VAR_PROPOSTE_SVIL_1 as VISBIUOSTPR7, ");
    SQL.append("  A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) + A.VAR_PROPOSTE_SVIL_2 as VISBIUOSTPR8, ");
    SQL.append("  A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0) + A.VAR_PROPOSTE_SVIL_3 as VISBIUOSTPR9 ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_VISTA_BILANCIO_UO A ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = NVL(~~TBL_PARAMETRI106.PARPROUNIORG~~, A.PROGR_UNITA_ORGANIZZATIVA)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI106.PARAMES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI106.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI106.PARAMARTICOL~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU1, 5, SQL, -1, "");
    PAN_DISPONIBILIT.SetQueryDB(PPQRY_VISTABILANU1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPONIBILIT.SetMasterTable(0, "POL_VISTA_BILANCIO_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISPONIBILIT.Status() == 2)
    {
      int oldListQBE = PAN_DISPONIBILIT.iUseListQBE;
      PAN_DISPONIBILIT.iUseListQBE = 0;
      PAN_DISPONIBILIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISPONIBILIT.PanelCommand(Glb.PCM_FIND);
      PAN_DISPONIBILIT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_UNITAORGANIZ_Init()
  {

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, "7F5D81AB-3282-4B3A-A65A-B41B90150132");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, "Codice");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, "B46F1BA1-C989-4921-8ED5-EE8206466433");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, "Descrizione");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, "7307192F-909A-4225-B936-EA2FB700B774");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, "Stanziamento");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, "690FD67E-FEED-49D8-93C4-AFEF4360DFF6");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, "Variazioni");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, "46A04A62-6CBE-4A35-BFB0-261BADE05B1C");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, "Stanz. Definitivo");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, "DA511A49-5A7A-415A-9351-8DD88F952182");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, "Imp Acc");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, "95C2B8AB-7B7D-4911-B8DA-338C68B4D17F");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, "Disponibilità");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_UNITAORGANIZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_LIST, 40);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_FORM, 4, 116, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_FORM, 40);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.PANEL_FORM, "Cod.");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_CODICE, -1, -1);
    PAN_UNITAORGANIZ.SetFieldUnbound(PFL_UNITAORGANIZ_CODICE, true);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_CODICE, PPQRY_VISTABILANU2, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(~~TBL_PARAMETRI106.PARPROUNIORG~~,~~TBL_PARAMETRI106.PARAMDATADAL~~)", "VISTBILUOCOD", 5, 99, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_LIST, 64, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_LIST, 64);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 140, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_FORM, 64);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descr.");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DESCRIZIONE1, -1, -1);
    PAN_UNITAORGANIZ.SetFieldUnbound(PFL_UNITAORGANIZ_DESCRIZIONE1, true);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DESCRIZIONE1, PPQRY_VISTABILANU2, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(~~TBL_PARAMETRI106.PARPROUNIORG~~,~~TBL_PARAMETRI106.PARAMDATADAL~~)", "VISTBILUODES", 5, 99, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, 288, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, 64);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, 44, 20, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, 64);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziam.");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_STANZIAMENTO, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_STANZIAMENTO, PPQRY_VISTABILANU2, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, 392, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, "Variazioni");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, 20, 44, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, "Variazioni");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_VARIAZIONI2, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_VARIAZIONI2, PPQRY_VISTABILANU2, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_LIST, 496, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_LIST, 124);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_LIST, "Stanz. Definitivo");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_FORM, 4, 188, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_FORM, 124);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.PANEL_FORM, "Stanz. Definitivo");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_STANZDEFINI1, -1, -1);
    PAN_UNITAORGANIZ.SetFieldUnbound(PFL_UNITAORGANIZ_STANZDEFINI1, true);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_STANZDEFINI1, PPQRY_VISTABILANU2, "A.STN_INI_CO + A.VARIAZIONI_CO", "VISBILUOSTDE", 3, 28, 6, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, 600, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, 52);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, "Imp Acc");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, 4, 260, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, 52);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, "Imp Acc");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_IMPACC1, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_IMPACC1, PPQRY_VISTABILANU2, "A.IMP_ACC", "IMP_ACC", 2, 15, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, 704, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, 84);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, 24, 92, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, 84);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DISPONIBILI1, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DISPONIBILI1, PPQRY_VISTABILANU2, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
  }

  private void PAN_UNITAORGANIZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_UNITAORGANIZ.SetIMDB(IMDB, "PQRY_VISTABILANU2", true);
    PAN_UNITAORGANIZ.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA BILANCIO UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(~~TBL_PARAMETRI106.PARPROUNIORG~~,~~TBL_PARAMETRI106.PARAMDATADAL~~) as VISTBILUOCOD, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(~~TBL_PARAMETRI106.PARPROUNIORG~~,~~TBL_PARAMETRI106.PARAMDATADAL~~) as VISTBILUODES, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as VISBILUOSTDE, ");
    SQL.append("  A.IMP_ACC as IMP_ACC, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI106.PARAMES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI106.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI106.PARAMARTICOL~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_PARAMETRI106.PARPROUNIORG~~) ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU2, 5, SQL, -1, "");
    PAN_UNITAORGANIZ.SetQueryDB(PPQRY_VISTABILANU2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UNITAORGANIZ.SetMasterTable(0, "VISTA_BILANCIO_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_UNITAORGANIZ.Status() == 2)
    {
      int oldListQBE = PAN_UNITAORGANIZ.iUseListQBE;
      PAN_UNITAORGANIZ.iUseListQBE = 0;
      PAN_UNITAORGANIZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_UNITAORGANIZ.PanelCommand(Glb.PCM_FIND);
      PAN_UNITAORGANIZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "BFCD6738-9D2A-4C6C-BBBB-852EAB522539");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "Esercizio");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 20, 16, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ESERCIZIO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ESERCIZIO, PPQRY_FILTRO26, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUAL008 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = TO_CHAR ( ~~ROWNAMEESERC~~ )) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_FILTRO.SetQuery(PPQRY_DUAL, 0, SQL, PFL_FILTRO_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUAL008 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_FILTRO.SetQuery(PPQRY_DUAL, 1, SQL, PFL_FILTRO_ESERCIZIO, "");
    PAN_FILTRO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO26", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO26, IMDBDef12.PQRY_FILTRO26_RS, IMDBDef4.TBL_FILTRO27);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ESERCIZIO, IMDBDef4.FLD_FILTRO27_ROWNAMEESERC);
    PAN_FILTRO.SetMasterTable(0, "FILTRO27");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateRow(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_DynamicProperties();
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_AfterFind(CmdFind);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_NEWTABBEVIEW) TAB_NEWTABBEVIEW_Click(PreviousPage, Cancel);
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
