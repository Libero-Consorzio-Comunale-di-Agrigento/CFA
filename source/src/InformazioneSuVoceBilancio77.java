// **********************************************
// Informazione Su Voce Bilancio 77
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioneSuVoceBilancio77 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_NEWTABBEVIEW;
  private static int GRP_DISPONIBILIT_ESERCICORREN = 0;
  private static int GRP_DISPONIBILIT_ESERCIPRECED = 1;
  private static int GRP_DISPONIBILIT_ULTIESERCHIU = 2;

  private static int PFL_DISPONIBILIT_IMPEGNABIAT1 = 0;
  private static int PFL_DISPONIBILIT_LABELIMPEATT = 1;
  private static int PFL_DISPONIBILIT_VARIMPEGNAB1 = 2;
  private static int PFL_DISPONIBILIT_LABELVARIMPE = 3;
  private static int PFL_DISPONIBILIT_IMPEGNABILE = 4;
  private static int PFL_DISPONIBILIT_LABEIMPEINIZ = 5;
  private static int PFL_DISPONIBILIT_STANPROVSVIL = 6;
  private static int PFL_DISPONIBILIT_STANPROVCONS = 7;
  private static int PFL_DISPONIBILIT_STANZPROVTOT = 8;
  private static int PFL_DISPONIBILIT_STANZPROVVIS = 9;
  private static int PFL_DISPONIBILIT_VARPROVVISO1 = 10;
  private static int PFL_DISPONIBILIT_STANZATTUALE = 11;
  private static int PFL_DISPONIBILIT_STANATTUSVIL = 12;
  private static int PFL_DISPONIBILIT_STANATTUCONS = 13;
  private static int PFL_DISPONIBILIT_STANZATTUTOT = 14;
  private static int PFL_DISPONIBILIT_VARIAZIONI1 = 15;
  private static int PFL_DISPONIBILIT_STANZINIZIA1 = 16;
  private static int PFL_DISPONIBILIT_SVILUPPO = 17;
  private static int PFL_DISPONIBILIT_CONSOLIDATO = 18;
  private static int PFL_DISPONIBILIT_TOTALE = 19;
  private static int PFL_DISPONIBILIT_VARIAZCOSVIL = 20;
  private static int PFL_DISPONIBILIT_VARIAZCOCONS = 21;
  private static int PFL_DISPONIBILIT_VARIAZIONIC1 = 22;
  private static int PFL_DISPONIBILIT_STNINICOSVIL = 23;
  private static int PFL_DISPONIBILIT_STNINICOCONS = 24;
  private static int PFL_DISPONIBILIT_STNINICO1 = 25;
  private static int PFL_DISPONIBILIT_VARPROVVISOR = 26;
  private static int PFL_DISPONIBILIT_VARPROVVCONS = 27;
  private static int PFL_DISPONIBILIT_VARPROVVSVIL = 28;
  private static int PFL_DISPONIBILIT_IMPACC2 = 29;
  private static int PFL_DISPONIBILIT_IMPACCCONS1 = 30;
  private static int PFL_DISPONIBILIT_IMPACCSVIL1 = 31;
  private static int PFL_DISPONIBILIT_DISPONIBILIT = 32;
  private static int PFL_DISPONIBILIT_DISPONIBCONS = 33;
  private static int PFL_DISPONIBILIT_DISPONIBSVIL = 34;
  private static int PFL_DISPONIBILIT_IMPACCLABEL = 35;
  private static int PFL_DISPONIBILIT_LABELDISPONI = 36;
  private static int PFL_DISPONIBILIT_SPAZESERCORR = 37;
  private static int PFL_DISPONIBILIT_MANORD = 38;
  private static int PFL_DISPONIBILIT_MANORDCOMP = 39;
  private static int PFL_DISPONIBILIT_MANORDRES = 40;
  private static int PFL_DISPONIBILIT_LABETOTAMAND = 41;
  private static int PFL_DISPONIBILIT_LABELCOMPETE = 42;
  private static int PFL_DISPONIBILIT_LABELRESIDUI = 43;
  private static int PFL_DISPONIBILIT_MANORDLABEL = 44;
  private static int PFL_DISPONIBILIT_LIQUIDAZIONI = 45;
  private static int PFL_DISPONIBILIT_LIQUIDAZCOMP = 46;
  private static int PFL_DISPONIBILIT_LIQUIDAZIRES = 47;
  private static int PFL_DISPONIBILIT_RESIDUI = 48;
  private static int PFL_DISPONIBILIT_PREVISIONE1 = 49;
  private static int PFL_DISPONIBILIT_PREVISIONE = 50;
  private static int PFL_DISPONIBILIT_PREVISIOCONS = 51;
  private static int PFL_DISPONIBILIT_PREVISIOSVIL = 52;
  private static int PFL_DISPONIBILIT_SPAZESERPREC = 53;
  private static int PFL_DISPONIBILIT_LABEIMPEACCE = 54;
  private static int PFL_DISPONIBILIT_IMPACCULTCHI = 55;
  private static int PFL_DISPONIBILIT_IMPACCULTCON = 56;
  private static int PFL_DISPONIBILIT_IMPACCULTSVI = 57;
  private static int PFL_DISPONIBILIT_SPAZESERCHIU = 58;
  private static int PFL_DISPONIBILIT_ESERCIZIO = 59;
  private static int PFL_DISPONIBILIT_RISORSINTER1 = 60;
  private static int PFL_DISPONIBILIT_CAPITOLO2 = 61;
  private static int PFL_DISPONIBILIT_ARTICOLO2 = 62;

  private static int PPQRY_VISTABILANU4 = 0;


  IDPanel PAN_DISPONIBILIT;
  private static int PFL_UNITAORGANIZ_CODICE = 0;
  private static int PFL_UNITAORGANIZ_DESCRIZIONE1 = 1;
  private static int PFL_UNITAORGANIZ_STANZIAMENTO = 2;
  private static int PFL_UNITAORGANIZ_VARIAZIONI2 = 3;
  private static int PFL_UNITAORGANIZ_STANZDEFINI1 = 4;
  private static int PFL_UNITAORGANIZ_IMPACC1 = 5;
  private static int PFL_UNITAORGANIZ_DISPONIBILI1 = 6;

  private static int PPQRY_VISTABILANU5 = 0;


  IDPanel PAN_UNITAORGANIZ;
  private static int PFL_IMPEGNATO_LABELSVILUPP = 0;
  private static int PFL_IMPEGNATO_LABELCONSOLI = 1;
  private static int PFL_IMPEGNATO_LABELTOTALE = 2;
  private static int PFL_IMPEGNATO_NEWPANELLABE = 3;
  private static int PFL_IMPEGNATO_LABELTOTALE1 = 4;
  private static int PFL_IMPEGNATO_IMPACCCONS = 5;
  private static int PFL_IMPEGNATO_IMPACCSVIL = 6;
  private static int PFL_IMPEGNATO_IMPCONSNOATT = 7;
  private static int PFL_IMPEGNATO_IMPSVILNOATT = 8;
  private static int PFL_IMPEGNATO_LABESENZATTO = 9;
  private static int PFL_IMPEGNATO_IMPCONPRNOAT = 10;
  private static int PFL_IMPEGNATO_IMPSVIPRNOAT = 11;
  private static int PFL_IMPEGNATO_LASEATDICUPR = 12;
  private static int PFL_IMPEGNATO_IMPCONSDEFIN = 13;
  private static int PFL_IMPEGNATO_IMPSVILDEFIN = 14;
  private static int PFL_IMPEGNATO_LABELDEFINIT = 15;
  private static int PFL_IMPEGNATO_IMPCONPREDEF = 16;
  private static int PFL_IMPEGNATO_IMPSVIPREDEF = 17;
  private static int PFL_IMPEGNATO_LABDEFDICUPR = 18;
  private static int PFL_IMPEGNATO_IMPCONSPRENO = 19;
  private static int PFL_IMPEGNATO_IMPSVILPRENO = 20;
  private static int PFL_IMPEGNATO_LABETOTAPREN = 21;
  private static int PFL_IMPEGNATO_IMPCONSOBBLI = 22;
  private static int PFL_IMPEGNATO_IMPSVILOBBLI = 23;
  private static int PFL_IMPEGNATO_LABELOBBLIGA = 24;
  private static int PFL_IMPEGNATO_IMPCONSESECU = 25;
  private static int PFL_IMPEGNATO_IMPSVILESECU = 26;
  private static int PFL_IMPEGNATO_LABELESECUTI = 27;
  private static int PFL_IMPEGNATO_IMPACC = 28;
  private static int PFL_IMPEGNATO_IMPNOATTO = 29;
  private static int PFL_IMPEGNATO_IMPPRENNOATT = 30;
  private static int PFL_IMPEGNATO_IMPDEFINITIV = 31;
  private static int PFL_IMPEGNATO_IMPPRENDEFIN = 32;
  private static int PFL_IMPEGNATO_IMPPRENOTATI = 33;
  private static int PFL_IMPEGNATO_IMPOBBLIGATO = 34;
  private static int PFL_IMPEGNATO_IMPESECUTIVI = 35;

  private static int PPQRY_VISTABILANUO = 0;


  IDPanel PAN_IMPEGNATO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI476(IMDB);
    //
    //
    Init_PQRY_VISTABILANU4(IMDB);
    Init_PQRY_VISTABILANU5(IMDB);
    Init_PQRY_VISTABILANUO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI476(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI476, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI476, "TBL_PARAMETRI476");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMRISORSA, "PARAMRISORSA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMRISORSA,1,7,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMCAPITOL,1,6,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARPROUNIORG, "PARPROUNIORG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI476,IMDBDef1.FLD_PARAMETRI476_PARPROUNIORG,1,8,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI476, 0);
  }

  private static void Init_PQRY_VISTABILANU4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTABILANU4, 43);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTABILANU4, "PQRY_VISTABILANU4");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_ESERCIZIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_RISORSA_INTERVENTO, "RISORSA_INTERVENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_RISORSA_INTERVENTO,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_ULT_CHIUSO, "IMP_ACC_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_ULT_CONS, "IMP_ACC_ULT_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_ULT_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_ULT_SVIL, "IMP_ACC_ULT_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_ULT_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_IMPEGNABILE, "VAR_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTATTO, "VIBIUOSTATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTATTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTATCO, "VIBIUOSTATCO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTATCO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTATSV, "VIBIUOSTATSV");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTATSV,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTPRTO, "VIBIUOSTPRTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTPRTO,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTPRCO, "VIBIUOSTPRCO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTPRCO,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTPRSV, "VIBIUOSTPRSV");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOSTPRSV,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VISBILUOIMAT, "VISBILUOIMAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VISBILUOIMAT,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOLAIMAC, "VIBIUOLAIMAC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VIBIUOLAIMAC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_PROVVISORIE, "VAR_PROVVISORIE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_PROVVISORIE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_PROVVISORIE_CONS, "VAR_PROVVISORIE_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_PROVVISORIE_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_PROVVISORIE_SVIL, "VAR_PROVVISORIE_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_VAR_PROVVISORIE_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC, "IMP_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_CONS, "IMP_ACC_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_SVIL, "IMP_ACC_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_IMP_ACC_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_DISPONIBILITA_CONS, "DISPONIBILITA_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_DISPONIBILITA_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_DISPONIBILITA_SVIL, "DISPONIBILITA_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_DISPONIBILITA_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_MAN_ORD,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_MAN_ORD_COMP, "MAN_ORD_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_MAN_ORD_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_MAN_ORD_RES, "MAN_ORD_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_MAN_ORD_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_RESIDUI, "RESIDUI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_RESIDUI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_LIQUIDAZIONI, "LIQUIDAZIONI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_LIQUIDAZIONI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_LIQUIDAZIONI_COMP, "LIQUIDAZIONI_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_LIQUIDAZIONI_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_LIQUIDAZIONI_RES, "LIQUIDAZIONI_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU4,IMDBDef8.PQSL_VISTABILANU4_LIQUIDAZIONI_RES,2,15,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTABILANU4, 0);
  }

  private static void Init_PQRY_VISTABILANU5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTABILANU5, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTABILANU5, "PQRY_VISTABILANU5");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VISTBILUOCOD, "VISTBILUOCOD");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VISTBILUOCOD,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VISTBILUODES, "VISTBILUODES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VISTBILUODES,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VISBILUOSTDE, "VISBILUOSTDE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_VISBILUOSTDE,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_IMP_ACC, "IMP_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANU5,IMDBDef8.PQSL_VISTABILANU5_DISPONIBILITA,3,14,2);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTABILANU5, 0);
  }

  private static void Init_PQRY_VISTABILANUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTABILANUO, 24);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTABILANUO, "PQRY_VISTABILANUO");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ACC, "IMP_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ACC_CONS, "IMP_ACC_CONS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ACC_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ACC_SVIL, "IMP_ACC_SVIL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ACC_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_NO_ATTO, "IMP_NO_ATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_NO_ATTO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_NO_ATTO, "IMP_CONS_NO_ATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_NO_ATTO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_NO_ATTO, "IMP_SVIL_NO_ATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_NO_ATTO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_PREN_NO_ATTO, "IMP_PREN_NO_ATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_PREN_NO_ATTO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_PREN_NO_ATTO, "IMP_CONS_PREN_NO_ATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_PREN_NO_ATTO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_PREN_NO_ATTO, "IMP_SVIL_PREN_NO_ATTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_PREN_NO_ATTO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_DEFINITIVO, "IMP_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_DEFINITIVO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_DEFINITIVO, "IMP_CONS_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_DEFINITIVO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_DEFINITIVO, "IMP_SVIL_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_DEFINITIVO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_PREN_DEFINITIVO, "IMP_PREN_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_PREN_DEFINITIVO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_PREN_DEFINITIVO, "IMP_CONS_PREN_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_PREN_DEFINITIVO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_PREN_DEFINITIVO, "IMP_SVIL_PREN_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_PREN_DEFINITIVO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_PRENOTATI, "IMP_PRENOTATI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_PRENOTATI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_PRENOTATI, "IMP_CONS_PRENOTATI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_PRENOTATI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_PRENOTATI, "IMP_SVIL_PRENOTATI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_PRENOTATI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_OBBLIGATORI, "IMP_OBBLIGATORI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_OBBLIGATORI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_OBBLIGATORI, "IMP_CONS_OBBLIGATORI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_OBBLIGATORI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_OBBLIGATORI, "IMP_SVIL_OBBLIGATORI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_OBBLIGATORI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ESECUTIVI, "IMP_ESECUTIVI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_ESECUTIVI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_ESECUTIVI, "IMP_CONS_ESECUTIVI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_CONS_ESECUTIVI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_ESECUTIVI, "IMP_SVIL_ESECUTIVI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTABILANUO,IMDBDef8.PQSL_VISTABILANUO_IMP_SVIL_ESECUTIVI,2,15,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTABILANUO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioneSuVoceBilancio77(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioneSuVoceBilancio77()
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
    FormIdx = MyGlb.FRM_INFSUVOCBI77;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5CD947A9-3B60-432B-AE11-B083C4D18F82";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 856;
    DesignHeight = 586;
    set_Caption(new IDVariant("Informazione Su Voce Bilancio 77"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 856;
    Frames[1].Height = 560;
    Frames[1].Caption = "New Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 560;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[1].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "363F5579-CF3A-40AE-A290-57F36C69E2E3";
    TAB_NEWTABBEVIEW.SetItemCount(3);
    TAB_NEWTABBEVIEW.Placement = 1;
    TAB_NEWTABBEVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Disponibilità";
    Frames[2].Parent = this;
    PAN_DISPONIBILIT = new IDPanel(w, this, 2, "PAN_DISPONIBILIT");
    Frames[2].Content = PAN_DISPONIBILIT;
    PAN_DISPONIBILIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISPONIBILIT.VS = MainFrm.VisualStyleList;
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 856-MyGlb.PAN_OFFS_X, 560-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "008E071B-ED52-48D5-A399-0D54EB35738C");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4168, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISPONIBILIT.InitStatus = 2;
    PAN_DISPONIBILIT_Init();
    PAN_DISPONIBILIT_InitFields();
    PAN_DISPONIBILIT_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(1, Frames[2], 0, "", "Disponibilità", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Unità Organizzative";
    Frames[3].Parent = this;
    PAN_UNITAORGANIZ = new IDPanel(w, this, 3, "PAN_UNITAORGANIZ");
    Frames[3].Content = PAN_UNITAORGANIZ;
    PAN_UNITAORGANIZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_UNITAORGANIZ.VS = MainFrm.VisualStyleList;
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 856-MyGlb.PAN_OFFS_X, 560-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "467213BE-AB19-400D-843E-7E50EEB748D7");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 808, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_UNITAORGANIZ.InitStatus = 2;
    PAN_UNITAORGANIZ_Init();
    PAN_UNITAORGANIZ_InitFields();
    PAN_UNITAORGANIZ_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[3], 0, "", "Unità Organizzative", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Impegnato";
    Frames[4].Parent = this;
    PAN_IMPEGNATO = new IDPanel(w, this, 4, "PAN_IMPEGNATO");
    Frames[4].Content = PAN_IMPEGNATO;
    PAN_IMPEGNATO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEGNATO.VS = MainFrm.VisualStyleList;
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 856-MyGlb.PAN_OFFS_X, 560-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F307894D-9D6C-4B48-9014-1140C1DC74F0");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2612, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEGNATO.InitStatus = 2;
    PAN_IMPEGNATO_Init();
    PAN_IMPEGNATO_InitFields();
    PAN_IMPEGNATO_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(3, Frames[4], 0, "", "Impegnato", "");
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
      if (CmdIdx==MyGlb.CMD_FUNZIONI11+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_COMANDI3+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIONI11+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PIANODEICONT+BaseCmdLinIdx)
      {
        ApriPianoDeiConti();
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
      PAN_DISPONIBILIT.UpdatePanel(MainFrm);
      PAN_UNITAORGANIZ.UpdatePanel(MainFrm);
      PAN_IMPEGNATO.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioneSuVoceBilancio77);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioneSuVoceBilancio77.class.getName() : (Glb.ClassWithPackage(InformazioneSuVoceBilancio77.class) ? InformazioneSuVoceBilancio77.class.getName().substring(InformazioneSuVoceBilancio77.class.getPackage().getName().length() + 1) : InformazioneSuVoceBilancio77.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      set_Caption(IDL.Add(((IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0).equals((new IDVariant("E")), true))?(new IDVariant("Risorsa")):(new IDVariant("Intervento"))), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMRISORSA, 0)), IDL.Add((new IDVariant(" - ")), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMCAPITOL, 0)), IDL.Add((new IDVariant(" / ")), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMARTICOL, 0)), IDL.Add(v_ESERCIZIO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))))))))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneSuVoceBilancio77", "Settacaption", _e);
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
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0).equals((new IDVariant("E")), true))
      {
        PAN_IMPEGNATO.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DISPONIBILIT.set_FieldText(PFL_DISPONIBILIT_MANORDLABEL, (new IDVariant("Ordinativi")).stringValue());
        PAN_DISPONIBILIT.set_FieldText(PFL_DISPONIBILIT_IMPACCLABEL, (new IDVariant("Accertato")).stringValue());
      }
      else
      {
        PAN_DISPONIBILIT.set_FieldText(PFL_DISPONIBILIT_MANORDLABEL, (new IDVariant("Mandati")).stringValue());
        PAN_DISPONIBILIT.set_FieldText(PFL_DISPONIBILIT_IMPACCLABEL, (new IDVariant("Impegnato")).stringValue());
        PAN_IMPEGNATO.set_Visible((new IDVariant(-1)).booleanValue());
      }
      PAN_DISPONIBILIT.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneSuVoceBilancio77", "LoadEvent", _e);
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
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0).equals((new IDVariant("S")), true) && MainFrm.GESTIOIMPEGN.equals((new IDVariant("SI")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0).equals((new IDVariant("E")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
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
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  VISTA_BILANCIO_UO_77 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.RISORSA_INTERVENTO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMRISORSA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = 'O') ");
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
      MainFrm.ErrObj.ProcError ("InformazioneSuVoceBilancio77", "DisponibilitàAfterFindEvent", _e);
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
      PAN_UNITAORGANIZ.set_ToolTip(Glb.OBJ_FIELD,PFL_UNITAORGANIZ_DESCRIZIONE1,IMDB.Value(IMDBDef8.PQRY_VISTABILANU5, IMDBDef8.PQSL_VISTABILANU5_VISTBILUODES, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneSuVoceBilancio77", "UnitàOrganizzativeOnDynamicPropertiesEvent", _e);
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
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0).equals((new IDVariant("S")), true))
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
      MainFrm.ErrObj.ProcError ("InformazioneSuVoceBilancio77", "UnitàOrganizzativeAfterFindEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI477, IMDBDef1.FLD_PARAMETRI477_PARAMES, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI477, IMDBDef1.FLD_PARAMETRI477_PARAMRISORSA, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMRISORSA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI477, IMDBDef1.FLD_PARAMETRI477_PARAMCAPITOL, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMCAPITOL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI477, IMDBDef1.FLD_PARAMETRI477_PARAMARTICOL, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMARTICOL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI477, IMDBDef1.FLD_PARAMETRI477_PARAMSCADENZ, 0, IDL.Today());
      MainFrm.UnloadForm(MyGlb.FRM_PIANDEICON77,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PIANDEICON77, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneSuVoceBilancio77", "ApriPianoDeiConti", _e);
      return -1;
    }
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
  private void TAB_NEWTABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IMPEGNATO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPEGNATO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEGNATO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEGNATO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEGNATO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPEGNATO);
    // Stub
  }

  private void PAN_IMPEGNATO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPEGNATO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEGNATO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPEGNATO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISPONIBILIT_Init()
  {

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, "5BF17105-6B36-454F-BF2E-514407FCEBEF");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, "Esercizio Corrente");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, MyGlb.VIS_GROUPSTYLE);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, MyGlb.PANEL_LIST, 0, -9999, 148, 16, 0, 0);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, MyGlb.PANEL_FORM, 4, 7, 840, 293, 0, 0);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, 0, 102);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, 1, 13);
    PAN_DISPONIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, 0, 4);
    PAN_DISPONIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, 1, 4);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCICORREN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, "87E906AF-0043-4F8D-916C-7BD4163A37B5");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, "Esercizio Precedente");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, MyGlb.VIS_GROUPSTYLE);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, MyGlb.PANEL_FORM, 4, 307, 432, 53, 0, 0);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, 0, 117);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, 1, 13);
    PAN_DISPONIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, 0, 4);
    PAN_DISPONIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, 1, 4);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ESERCIPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, "B72E38F8-530D-4601-AD1F-F22A39B75F2E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, "Ultimo Esercizio Chiuso");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, MyGlb.VIS_GROUPSTYLE);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, MyGlb.PANEL_LIST, 0, -9999, 428, 16, 0, 0);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, MyGlb.PANEL_FORM, 4, 367, 432, 53, 0, 0);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, 0, 129);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, 1, 13);
    PAN_DISPONIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, 0, 4);
    PAN_DISPONIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, 1, 4);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPONIBILIT_ULTIESERCHIU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_FIELD, 63);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, "77735B77-61A8-4406-9D05-613786C466C8");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, "Impegnabile Att");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, "B25E23AD-6861-4FDF-B3A4-0EAF0471574E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, "Impegnabile Att.");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, "C85EBFE4-DD57-4ED8-8484-7A7854920CEE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, "VAR IMPEGNABILE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, "A006A6FD-CC3F-4C76-9DE8-214892FA458D");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, "Var. Impegnabile");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, "8D322EB6-D154-450E-94CB-A6BC657DAB21");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, "IMPEGNABILE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, "6E09CB80-BDE6-43A5-8178-A1457B37679D");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, "Impegnabile Iniz.");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, "D39D3232-80D1-4016-A995-D6C5A7A2A697");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, "Stanz Provvisorio Svil");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, "4707EAC1-5E28-4A98-9FF4-F8D72D80870B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, "Stanz Provvisorio Cons");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, "D9FC9918-4AE0-4E9D-8034-5329909478C6");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, "Stanz Provvisorio Tot");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, "0C279117-9D6F-4C86-99D4-9F7E6EC50A5D");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, "Stanz. Provvisorio");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, "A76107FD-A3DB-49F6-AC7E-64E1C8560DC4");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, "Var. Provvisorie");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, "40C1BFF8-85FB-4C8C-A86C-D1AA5524F4CD");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, "Stanz. Attuale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, "8F515DE9-8DAB-4C64-B653-01D1A7E9FB91");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, "Stanziamento Attuale Svil");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, "A9C34343-E5D1-4A84-8E0C-435EE74C1D01");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, "Stanziamento Attuale Cons");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, "12CC6801-9BF1-4B2F-BB82-DEEB315DD766");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, "Stanz Attuale Tot");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, "F5D9BE5C-51DE-4738-BF73-66DFAD6960C8");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, "Variazioni");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, "580BC3B6-61B6-4F1E-8AD2-49BEBD810A9C");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, "Stanz. Iniziale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, "D607DBEE-9783-474A-AD22-E5110610B9CC");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, "Sviluppo");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, "98FB5BB6-1F9B-4EA7-B166-DC1BC0700BBC");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, "Consolidato");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, "B81A7438-AC00-47A9-B353-E1F77C7BC74F");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, "Totale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, "4E44E44C-07A3-4593-B7D1-66968B9299E6");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, "6686A19A-8676-41B8-9FB3-58A956CD20A2");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, "5E1E08C2-8471-446E-818F-8A9255508277");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, "VARIAZIONI CO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, "C22C26AC-00C1-4933-A549-CDE9E086F469");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, "STN INI CO SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, "CEC542AF-F84B-4CA7-9E67-559612BF008A");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, "STN INI CO CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, "B6BEBBDB-7517-4F13-B482-171B68FA3B4A");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, "STN INI CO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, "2049BDFA-56C1-4656-80DE-7E0937EDDFAD");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, "VAR PROVVISORIE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, "CF6ADB22-0E32-4744-9C5C-3E7DE5C94AD5");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, "VAR PROVVISORIE CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, "B14FD589-D95A-41D2-AE53-00FFAB263728");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, "VAR PROVVISORIE SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, "789683F2-2CAA-43C6-980F-3539A76C3882");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, "IMP ACC");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, "3E12BFE3-D130-4091-AB6C-6E1B99102D17");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, "IMP ACC CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, "3D94F6ED-3119-43A2-9B9F-AD623BC6F99E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, "IMP ACC SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "F045865E-A5D5-46F3-A543-323C2A1A0258");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "DISPONIBILITA");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, "D1F9FC01-D019-485B-996E-6162BDADC88E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, "DISPONIBILITA CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, "CD76FAF5-BA43-4B8D-97E9-B90EEE747ECE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, "DISPONIBILITA SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, "6946D7C9-8697-49E6-818B-EBCC25E4EBEE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, "Imp Acc");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, "10D530C3-1BD8-4AB8-9D57-C1EB84798D55");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, "Disponibilità");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, "D941D4BB-17FA-4A5E-9AE8-07699E6F0DEF");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.VIS_SFONEBORDTRA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, "B10FBBC2-0483-464B-92CC-370482F11640");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, "MAN ORD");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, "36EE2700-E98D-4E3A-B8B6-A70E0687446B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, "MAN ORD COMP");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, "245192B1-B7B2-4AFB-978D-E619733A67C6");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, "MAN ORD RES");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, "EB17E65B-B985-468C-B790-A0A64CB5DEEF");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, "Totale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, "659174EB-4A4B-47E6-9B8A-349728A11C67");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, "Competenza");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, "F699F519-C705-4FF6-8A3A-545D1F76DDA9");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, "Residui");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.VIS_VUOTOGRASSET);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, "E870F068-C7B3-4856-9741-4A8821B979C2");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, "Man Ord");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, "D2D6AD32-2077-41D1-AC6B-C896E1FCB636");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, "Liquidazioni");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, "AABEE071-C894-4AA8-AF7D-8CD6A8256519");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, "LIQUIDAZIONI COMP");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, "27363013-2E43-4EB3-8F52-061FE8D0289A");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, "LIQUIDAZIONI RES");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, "AED4BDC6-206B-427B-8DFB-855571B96260");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, "Residui");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, "50B1BC9D-F0A5-4E0C-A15C-2E9180EDE2F8");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, "Previsione");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, "C40C175F-B6C9-4C83-8A6A-C9C299880400");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, "PREVISIONE");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, "9631E78D-C38C-4E3E-81FE-A0A036789A21");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, "PREVISIONE CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, "9B2B8118-24BE-478B-8535-CB3512C70D1E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, "755DF864-801C-4377-B836-69F5FA12B943");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.VIS_SFONEBORDTRA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, "AE1320F3-28CA-4431-8987-31236A1C1ADA");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, "Label Impegno Accertamento");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.VIS_VUOTONORMALE);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, "0C8D9BA1-B715-4914-B2FC-A4C4ABA2B68C");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, "IMP ACC ULT CHIUSO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, "C206FFD1-A82D-49FE-A9FD-39A93F1A3FB4");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, "IMP ACC ULT CONS");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, "682032CF-B9C3-47BD-B999-E1101B1C8BF4");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, "IMP ACC ULT SVIL");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, "CA848DDA-47DB-4F53-8901-82D206EB460B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.VIS_SFONEBORDTRA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, "DC8B3880-9BAD-49AB-81EC-249F84733338");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, "ESERCIZIO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, "FFE4739D-C537-4EA2-A2A7-70EE47628021");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, "RISORSA INTERVENTO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, "A5F91D83-57D5-45E3-8517-2BB6698C7C9B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, "CAPITOLO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, "AF2D3645-0CE4-490C-AAA4-BFF1DA906AF4");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, "ARTICOLO");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISPONIBILIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_LIST, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_LIST, "Impegnabile Att");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_FORM, 124, 224, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_FORM, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABIAT1, MyGlb.PANEL_FORM, "Impegn. Att");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPEGNABIAT1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_IMPEGNABIAT1, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPEGNABIAT1, PPQRY_VISTABILANU4, "NVL(A.VAR_IMPEGNABILE, 0) + NVL(A.IMPEGNABILE, 0)", "VISBILUOIMAT", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.PANEL_LIST, 200, 68, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.PANEL_FORM, 12, 224, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELIMPEATT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELIMPEATT, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELIMPEATT, -1, "", "LABELIMPEATT", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_LIST, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_LIST, "VAR IMPEGN.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_FORM, 124, 200, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIMPEGNAB1, MyGlb.PANEL_FORM, "VAR IMPEGN.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIMPEGNAB1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIMPEGNAB1, PPQRY_VISTABILANU4, "A.VAR_IMPEGNABILE", "VAR_IMPEGNABILE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_LIST, 192, 60, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_FORM, 12, 200, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELVARIMPE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELVARIMPE, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELVARIMPE, -1, "", "LABELVARIMPE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_LIST, "IMPEGN.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, 124, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPEGNABILE, MyGlb.PANEL_FORM, "IMPEGN.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPEGNABILE, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPEGNABILE, PPQRY_VISTABILANU4, "A.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_LIST, 184, 52, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_FORM, 12, 176, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEINIZ, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABEIMPEINIZ, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABEIMPEINIZ, -1, "", "LABEIMPEINIZ", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_LIST, "St. Provvisorio Svil");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, 332, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVSVIL, MyGlb.PANEL_FORM, "St. Provvisorio Svil");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANPROVSVIL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANPROVSVIL, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANPROVSVIL, PPQRY_VISTABILANU4, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL + NVL(A.VAR_PROVVISORIE_SVIL, 0)", "VIBIUOSTPRSV", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_LIST, "St. Provvisorio Cons");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, 228, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANPROVCONS, MyGlb.PANEL_FORM, "St. Provvisorio Cons");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANPROVCONS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANPROVCONS, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANPROVCONS, PPQRY_VISTABILANU4, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS + NVL(A.VAR_PROVVISORIE_CONS, 0)", "VIBIUOSTPRCO", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_LIST, "St. Provvisorio Tot");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, 124, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVTOT, MyGlb.PANEL_FORM, "St. Provvisorio Tot");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZPROVTOT, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZPROVTOT, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZPROVTOT, PPQRY_VISTABILANU4, "A.STN_INI_CO + A.VARIAZIONI_CO + NVL(A.VAR_PROVVISORIE, 0)", "VIBIUOSTPRTO", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_LIST, 176, 44, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_FORM, 8, 152, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZPROVVIS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZPROVVIS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZPROVVIS, -1, "", "STANZPROVVIS", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_LIST, 168, 36, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_FORM, 20, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVISO1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVISO1, -1, "", "VARPROVVISO1", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_LIST, 160, 28, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_FORM, 24, 104, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZATTUALE, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZATTUALE, -1, "", "STANZATTUALE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_LIST, "Stanziam. Attuale Svil");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, 332, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUSVIL, MyGlb.PANEL_FORM, "Stanziam. Attuale Svil");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANATTUSVIL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANATTUSVIL, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANATTUSVIL, PPQRY_VISTABILANU4, "A.STN_INI_CO_SVIL + A.VARIAZIONI_CO_SVIL", "VIBIUOSTATSV", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_LIST, "Stanziam. Attuale Cons");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, 228, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, 140);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANATTUCONS, MyGlb.PANEL_FORM, "Stanziam. Attuale Cons");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANATTUCONS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANATTUCONS, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANATTUCONS, PPQRY_VISTABILANU4, "A.STN_INI_CO_CONS + A.VARIAZIONI_CO_CONS", "VIBIUOSTATCO", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_LIST, "Stanz Attuale Tot");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, 124, 104, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZATTUTOT, MyGlb.PANEL_FORM, "St. Attuale Tot");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZATTUTOT, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_STANZATTUTOT, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZATTUTOT, PPQRY_VISTABILANU4, "A.STN_INI_CO + A.VARIAZIONI_CO", "VIBIUOSTATTO", 3, 28, 6, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.PANEL_FORM, 48, 80, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZIONI1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZIONI1, -1, "", "VARIAZIONI1", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.PANEL_LIST, 144, 12, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.PANEL_FORM, 8, 56, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STANZINIZIA1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STANZINIZIA1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STANZINIZIA1, -1, "", "STANZINIZIA1", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_FORM, 332, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SVILUPPO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SVILUPPO, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SVILUPPO, -1, "", "SVILUPPO", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_LIST, 144, 12, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_FORM, 228, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CONSOLIDATO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_CONSOLIDATO, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_CONSOLIDATO, -1, "", "CONSOLIDATO", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_LIST, 136, 4, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_FORM, 124, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_TOTALE, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_TOTALE, -1, "", "TOTALE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VAR. C. S.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, 332, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZCOSVIL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZCOSVIL, PPQRY_VISTABILANU4, "A.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_LIST, "VAR. C. CNS.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, 228, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZ. CO CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZCOCONS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZCOCONS, PPQRY_VISTABILANU4, "A.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_LIST, "VARIAZ. CO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_FORM, 124, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARIAZIONIC1, MyGlb.PANEL_FORM, "VARIAZ. CO");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARIAZIONIC1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARIAZIONIC1, PPQRY_VISTABILANU4, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_LIST, "ST. IN. C. SVL.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, 332, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOSVIL, MyGlb.PANEL_FORM, "ST. INI CO SVL.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STNINICOSVIL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STNINICOSVIL, PPQRY_VISTABILANU4, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CNS.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, 228, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CNS.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STNINICOCONS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STNINICOCONS, PPQRY_VISTABILANU4, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_LIST, "STN INI CO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_FORM, 124, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_FORM, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_STNINICO1, MyGlb.PANEL_FORM, "ST. INI CO");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_STNINICO1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_STNINICO1, PPQRY_VISTABILANU4, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_LIST, "VAR PROVV.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, 124, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVISOR, MyGlb.PANEL_FORM, "VAR PROVV.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVISOR, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVISOR, PPQRY_VISTABILANU4, "A.VAR_PROVVISORIE", "VAR_PROVVISORIE", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_LIST, "VAR PROVV. CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, 228, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVCONS, MyGlb.PANEL_FORM, "VAR PROVV. CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVCONS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVCONS, PPQRY_VISTABILANU4, "A.VAR_PROVVISORIE_CONS", "VAR_PROVVISORIE_CONS", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_LIST, "VAR PROVV. SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, 332, 128, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_VARPROVVSVIL, MyGlb.PANEL_FORM, "VAR PROVV. SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_VARPROVVSVIL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_VARPROVVSVIL, PPQRY_VISTABILANU4, "A.VAR_PROVVISORIE_SVIL", "VAR_PROVVISORIE_SVIL", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_LIST, 52);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_LIST, "IMP ACC");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_FORM, 124, 248, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_FORM, 52);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACC2, MyGlb.PANEL_FORM, "IM. ACC");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACC2, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACC2, PPQRY_VISTABILANU4, "A.IMP_ACC", "IMP_ACC", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_LIST, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_LIST, "IMP ACC CNS.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_FORM, 228, 248, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_FORM, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCCONS1, MyGlb.PANEL_FORM, "IMP ACC CNS.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACCCONS1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACCCONS1, PPQRY_VISTABILANU4, "A.IMP_ACC_CONS", "IMP_ACC_CONS", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_LIST, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_LIST, "IMP ACC SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_FORM, 332, 248, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_FORM, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCSVIL1, MyGlb.PANEL_FORM, "IM. ACC SVL.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACCSVIL1, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACCSVIL1, PPQRY_VISTABILANU4, "A.IMP_ACC_SVIL", "IMP_ACC_SVIL", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, "DISPON.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 124, 272, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, "DISPON.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBILIT, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBILIT, PPQRY_VISTABILANU4, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_LIST, "DISPON. CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, 228, 272, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBCONS, MyGlb.PANEL_FORM, "DISPON. CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBCONS, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBCONS, PPQRY_VISTABILANU4, "A.DISPONIBILITA_CONS", "DISPONIBILITA_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_LIST, "DISPON. SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, 332, 272, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBSVIL, MyGlb.PANEL_FORM, "DISPON. SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBSVIL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBSVIL, PPQRY_VISTABILANU4, "A.DISPONIBILITA_SVIL", "DISPONIBILITA_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.PANEL_LIST, 160, 28, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.PANEL_FORM, 28, 248, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCLABEL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACCLABEL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACCLABEL, -1, "", "IMPACCLABEL", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_LIST, 60, 148, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_FORM, 40, 272, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELDISPONI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELDISPONI, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELDISPONI, -1, "", "LABELDISPONI", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.PANEL_LIST, 404, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.PANEL_FORM, 416, 288, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCORR, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SPAZESERCORR, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SPAZESERCORR, -1, "", "SPAZESERCORR", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_LIST, 56);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_LIST, "MAN ORD");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_FORM, 532, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_FORM, 56);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORD, MyGlb.PANEL_FORM, "MN. ORD");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_MANORD, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_MANORD, PPQRY_VISTABILANU4, "A.MAN_ORD", "MAN_ORD", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_LIST, "MAN ORD CMP.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_FORM, 636, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDCOMP, MyGlb.PANEL_FORM, "MAN ORD CMP.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_MANORDCOMP, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_MANORDCOMP, PPQRY_VISTABILANU4, "A.MAN_ORD_COMP", "MAN_ORD_COMP", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_LIST, 80);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_LIST, "MAN ORD RES");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_FORM, 740, 56, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_FORM, 80);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDRES, MyGlb.PANEL_FORM, "MN. ORD RES");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_MANORDRES, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_MANORDRES, PPQRY_VISTABILANU4, "A.MAN_ORD_RES", "MAN_ORD_RES", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.PANEL_LIST, 144, 12, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.PANEL_FORM, 532, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABETOTAMAND, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABETOTAMAND, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABETOTAMAND, -1, "", "LABETOTAMAND", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.PANEL_FORM, 636, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELCOMPETE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELCOMPETE, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELCOMPETE, -1, "", "LABELCOMPETE", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.PANEL_LIST, 160, 28, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.PANEL_FORM, 740, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABELRESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABELRESIDUI, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABELRESIDUI, -1, "", "LABELRESIDUI", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.PANEL_FORM, 456, 56, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_MANORDLABEL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_MANORDLABEL, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_MANORDLABEL, -1, "", "MANORDLABEL", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_LIST, 80);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_LIST, "Liquidazioni");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_FORM, 452, 80, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_FORM, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIONI, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQUIDAZIONI, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQUIDAZIONI, PPQRY_VISTABILANU4, "A.LIQUIDAZIONI", "LIQUIDAZIONI", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_LIST, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_LIST, "LIQUID. COMP");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_FORM, 636, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZCOMP, MyGlb.PANEL_FORM, "LIQUID. COMP");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQUIDAZCOMP, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQUIDAZCOMP, PPQRY_VISTABILANU4, "A.LIQUIDAZIONI_COMP", "LIQUIDAZIONI_COMP", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_LIST, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_LIST, "LIQUID. RES");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_FORM, 740, 80, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_FORM, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDAZIRES, MyGlb.PANEL_FORM, "LIQUID. RES");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQUIDAZIRES, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQUIDAZIRES, PPQRY_VISTABILANU4, "A.LIQUIDAZIONI_RES", "LIQUIDAZIONI_RES", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_LIST, 52);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_FORM, 472, 248, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_FORM, 56);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_RESIDUI, -1, GRP_DISPONIBILIT_ESERCICORREN);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_RESIDUI, PPQRY_VISTABILANU4, "A.RESIDUI", "RESIDUI", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.PANEL_LIST, 208, 76, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.PANEL_FORM, 8, 332, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_PREVISIONE1, -1, GRP_DISPONIBILIT_ESERCIPRECED);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_PREVISIONE1, -1, "", "PREVISIONE1", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_LIST, 68);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_LIST, "PREVISIONE");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_FORM, 124, 332, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIONE, MyGlb.PANEL_FORM, "PREVISIONE");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_PREVISIONE, -1, GRP_DISPONIBILIT_ESERCIPRECED);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_PREVISIONE, PPQRY_VISTABILANU4, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_LIST, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVIS. CONS");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_FORM, 228, 332, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVIS. CONS");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_PREVISIOCONS, -1, GRP_DISPONIBILIT_ESERCIPRECED);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_PREVISIOCONS, PPQRY_VISTABILANU4, "A.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_LIST, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVIS. SVIL");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_FORM, 332, 332, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_FORM, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVIS. SVIL");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_PREVISIOSVIL, -1, GRP_DISPONIBILIT_ESERCIPRECED);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_PREVISIOSVIL, PPQRY_VISTABILANU4, "A.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.PANEL_LIST, 400, 312, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.PANEL_FORM, 416, 348, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERPREC, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SPAZESERPREC, -1, GRP_DISPONIBILIT_ESERCIPRECED);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SPAZESERPREC, -1, "", "SPAZESERPREC", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_STRETCH);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, 148);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, 3);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_LIST, "Label Impegno Accertamento");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, 8, 392, 112, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_STRETCH);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, 148);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LABEIMPEACCE, MyGlb.PANEL_FORM, "Lab. Imp. Accertamento");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LABEIMPEACCE, -1, GRP_DISPONIBILIT_ULTIESERCHIU);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_LABEIMPEACCE, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LABEIMPEACCE, PPQRY_VISTABILANU4, "DECODE(~~TBL_PARAMETRI476.PARAMES~~, 'S', 'Impegni', 'Accertamenti')", "VIBIUOLAIMAC", 5, 99, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_LIST, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_LIST, "IMP ACC ULT CH.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_FORM, 124, 392, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_FORM, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCHI, MyGlb.PANEL_FORM, "IMP ACC ULT CH.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACCULTCHI, -1, GRP_DISPONIBILIT_ULTIESERCHIU);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACCULTCHI, PPQRY_VISTABILANU4, "A.IMP_ACC_ULT_CHIUSO", "IMP_ACC_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_LIST, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_LIST, "IMP ACC ULT CNS.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_FORM, 228, 392, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_FORM, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTCON, MyGlb.PANEL_FORM, "IMP ACC ULT CNS.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACCULTCON, -1, GRP_DISPONIBILIT_ULTIESERCHIU);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACCULTCON, PPQRY_VISTABILANU4, "A.IMP_ACC_ULT_CONS", "IMP_ACC_ULT_CONS", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_LIST, "IM. AC. ULT SVL.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_FORM, 332, 392, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_FORM, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPACCULTSVI, MyGlb.PANEL_FORM, "IM. AC. ULT SVL.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPACCULTSVI, -1, GRP_DISPONIBILIT_ULTIESERCHIU);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPACCULTSVI, PPQRY_VISTABILANU4, "A.IMP_ACC_ULT_SVIL", "IMP_ACC_ULT_SVIL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.PANEL_LIST, 404, 368, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.PANEL_LIST, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.PANEL_FORM, 416, 408, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.PANEL_FORM, 0);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPAZESERCHIU, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SPAZESERCHIU, -1, GRP_DISPONIBILIT_ULTIESERCHIU);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SPAZESERCHIU, -1, "", "SPAZESERCHIU", 0, 0, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ESERCIZIO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ESERCIZIO, PPQRY_VISTABILANU4, "A.ESERCIZIO", "ESERCIZIO", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_LIST, "RISORSA INTERVENTO");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_FORM, 4, 364, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_FORM, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_RISORSINTER1, MyGlb.PANEL_FORM, "RIS. INTERVENTO");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_RISORSINTER1, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_RISORSINTER1, PPQRY_VISTABILANU4, "A.RISORSA_INTERVENTO", "RISORSA_INTERVENTO", 1, 7, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, 12, 372, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_CAPITOLO2, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_CAPITOLO2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_CAPITOLO2, PPQRY_VISTABILANU4, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, 4, 364, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, 60);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARTICOLO2, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ARTICOLO2, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ARTICOLO2, PPQRY_VISTABILANU4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
  }

  private void PAN_DISPONIBILIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISPONIBILIT.SetIMDB(IMDB, "PQRY_VISTABILANU4", true);
    PAN_DISPONIBILIT.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA BILANCIO UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.RISORSA_INTERVENTO as RISORSA_INTERVENTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMP_ACC_ULT_CHIUSO as IMP_ACC_ULT_CHIUSO, ");
    SQL.append("  A.IMP_ACC_ULT_CONS as IMP_ACC_ULT_CONS, ");
    SQL.append("  A.IMP_ACC_ULT_SVIL as IMP_ACC_ULT_SVIL, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  A.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
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
    SQL.append("  DECODE(~~TBL_PARAMETRI476.PARAMES~~, 'S', 'Impegni', 'Accertamenti') as VIBIUOLAIMAC, ");
    SQL.append("  A.VAR_PROVVISORIE as VAR_PROVVISORIE, ");
    SQL.append("  A.VAR_PROVVISORIE_CONS as VAR_PROVVISORIE_CONS, ");
    SQL.append("  A.VAR_PROVVISORIE_SVIL as VAR_PROVVISORIE_SVIL, ");
    SQL.append("  A.IMP_ACC as IMP_ACC, ");
    SQL.append("  A.IMP_ACC_CONS as IMP_ACC_CONS, ");
    SQL.append("  A.IMP_ACC_SVIL as IMP_ACC_SVIL, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.DISPONIBILITA_CONS as DISPONIBILITA_CONS, ");
    SQL.append("  A.DISPONIBILITA_SVIL as DISPONIBILITA_SVIL, ");
    SQL.append("  A.MAN_ORD as MAN_ORD, ");
    SQL.append("  A.MAN_ORD_COMP as MAN_ORD_COMP, ");
    SQL.append("  A.MAN_ORD_RES as MAN_ORD_RES, ");
    SQL.append("  A.RESIDUI as RESIDUI, ");
    SQL.append("  A.LIQUIDAZIONI as LIQUIDAZIONI, ");
    SQL.append("  A.LIQUIDAZIONI_COMP as LIQUIDAZIONI_COMP, ");
    SQL.append("  A.LIQUIDAZIONI_RES as LIQUIDAZIONI_RES ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO_77 A ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI476.PARAMES~~) ");
    SQL.append("and   (A.RISORSA_INTERVENTO = ~~TBL_PARAMETRI476.PARAMRISORSA~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI476.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI476.PARAMARTICOL~~) ");
    SQL.append("and   (A.TIPO = 'B') ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_VISTABILANU4, 5, SQL, -1, "");
    PAN_DISPONIBILIT.SetQueryDB(PPQRY_VISTABILANU4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPONIBILIT.SetMasterTable(0, "VISTA_BILANCIO_UO_77");
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
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, "4E60E4BD-9878-485A-A160-1F51A2642A05");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, "Codice");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, "6B4FE43E-4B71-4520-B3C6-470609720172");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, "Descrizione");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, "C3548A7F-648F-4B78-BADE-F18D7EAA68EE");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, "Stanziamento");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, "547FC211-5CBE-421D-8B2C-6EF2CD85135E");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, "Variazioni");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, "8D999F71-DCE9-40DF-914A-AE108097ABDE");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, "Stanz. Definitivo");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZDEFINI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, "B531B175-A6D4-4990-9E19-8472AB9B68EE");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, "Imp Acc");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.VIS_NORFIECF4IMP);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, "402DA5A1-B1C6-4AF4-9FB0-B9F7E48EEFDF");
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
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_CODICE, PPQRY_VISTABILANU5, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,~~TBL_PARAMETRI476.PARAMDATADAL~~)", "VISTBILUOCOD", 5, 99, 0, -13997);
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
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DESCRIZIONE1, PPQRY_VISTABILANU5, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,~~TBL_PARAMETRI476.PARAMDATADAL~~)", "VISTBILUODES", 5, 99, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, 288, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, 64);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, 44, 20, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, 64);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziam.");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_STANZIAMENTO, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_STANZIAMENTO, PPQRY_VISTABILANU5, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, 392, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_LIST, "Variazioni");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, 20, 44, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_VARIAZIONI2, MyGlb.PANEL_FORM, "Variazioni");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_VARIAZIONI2, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_VARIAZIONI2, PPQRY_VISTABILANU5, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
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
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_STANZDEFINI1, PPQRY_VISTABILANU5, "A.STN_INI_CO + A.VARIAZIONI_CO", "VISBILUOSTDE", 3, 28, 6, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, 600, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, 52);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_LIST, "Imp Acc");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, 4, 260, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, 52);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_IMPACC1, MyGlb.PANEL_FORM, "Imp Acc");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_IMPACC1, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_IMPACC1, PPQRY_VISTABILANU5, "A.IMP_ACC", "IMP_ACC", 2, 15, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, 704, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, 84);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, 24, 92, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, 84);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DISPONIBILI1, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DISPONIBILI1, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DISPONIBILI1, PPQRY_VISTABILANU5, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
  }

  private void PAN_UNITAORGANIZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_UNITAORGANIZ.SetIMDB(IMDB, "PQRY_VISTABILANU5", true);
    PAN_UNITAORGANIZ.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA BILANCIO UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,~~TBL_PARAMETRI476.PARAMDATADAL~~) as VISTBILUOCOD, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,~~TBL_PARAMETRI476.PARAMDATADAL~~) as VISTBILUODES, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as VISBILUOSTDE, ");
    SQL.append("  A.IMP_ACC as IMP_ACC, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO_77 A ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI476.PARAMES~~) ");
    SQL.append("and   (A.RISORSA_INTERVENTO = ~~TBL_PARAMETRI476.PARAMRISORSA~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI476.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI476.PARAMARTICOL~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_VISTABILANU5, 5, SQL, -1, "");
    PAN_UNITAORGANIZ.SetQueryDB(PPQRY_VISTABILANU5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UNITAORGANIZ.SetMasterTable(0, "VISTA_BILANCIO_UO_77");
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

  private void PAN_IMPEGNATO_Init()
  {

    PAN_IMPEGNATO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEGNATO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPEGNATO.SetSize(MyGlb.OBJ_FIELD, 36);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, "7329D7B7-B6CE-4A5D-B526-1211C72E1BDC");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, "Sviluppo");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.VIS_VUOTOGRASSET);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, "5835CB6D-F678-403C-B0B2-F922DF621FDF");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, "Consolidato");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.VIS_VUOTOGRASSET);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, "A35539F1-C6BB-4B6F-A746-9738F2AA9797");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, "Totale");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.VIS_VUOTOGRASSET);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, "9D782196-7CD5-4ED5-B983-79D7F22A4157");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, "DBB4CC4E-0094-40B6-960F-FE79F030C070");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, "Totale");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, "3ED90E32-B8B5-4D71-B37D-90EB7AFC6C9C");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, "IMP ACC CONS");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, "FE27CF88-B799-44EE-9878-BCD5A5866F27");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, "IMP ACC SVIL");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, "07D707C9-E662-44BA-9A14-0275C6A5C0E5");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, "IMP CONS NO ATTO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, "8F7C6275-F00A-47B9-BC19-BEB424354297");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, "IMP SVIL NO ATTO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, "6825FD35-EA1C-4045-9263-915A885E1191");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, "Senza Atto");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, "9BD9A231-C0E7-4CA7-BA70-23A31501B2BF");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, "IMP CONS PREN NO ATTO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, "80CC88DB-A431-431B-91DA-5DAE84206135");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, "IMP SVIL PREN NO ATTO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, "4E18BF0D-321B-42B3-B88E-B689E58A7678");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, "Di cui Prenotazioni");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, "F50C297D-061D-42F0-9C14-E3904DC67EEF");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, "IMP CONS DEFINITIVO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, "1AD77709-2AB3-4ED1-9DA4-069763BF0C24");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, "IMP SVIL DEFINITIVO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, "6B0D2043-569B-4453-9899-C2473BC46254");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, "Definitivo");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, "DB570DA6-7694-49FD-9FA9-53826509108C");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, "IMP CONS PREN DEFINITIVO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, "1EA13CE5-98F7-41EF-9CC1-DB6DF7B58661");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, "IMP SVIL PREN DEFINITIVO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, "BA4AD2E6-9505-422A-87CE-AF7273533CF9");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, "Di cui Prenotazioni");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, "568DC17A-0E53-432B-954D-5748B8A34E11");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, "IMP CONS PRENOTATI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, "EF042774-CF9C-402B-BFEA-E0363B330718");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, "IMP SVIL PRENOTATI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, "1EE11202-73BF-485A-8C97-060050F6DB39");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, "Totale Prenotazioni");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, "8D5F9676-56ED-40B0-A866-71F0FB851EAF");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, "IMP CONS OBBLIGATORI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, "0C2A86C2-AACA-4716-8FAE-F94205BA5E1C");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, "IMP SVIL OBBLIGATORI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, "4F28D62E-FA05-4E80-A724-9A136935B2FE");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, "Obbligatorio");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, "B5C87ECA-B369-4A91-AF8B-4D96F665ECE4");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, "IMP CONS ESECUTIVI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, "519ADC8C-A3F0-480F-9C8B-E30B6822F820");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, "IMP SVIL ESECUTIVI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, "4C5140BE-9CF7-4C30-BA18-1B7B44D0C79E");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, "Esecutivo");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, "BAB82BDC-1FEC-4BA4-9C2D-B37675591317");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, "IMP ACC");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, "61EDCE15-DF40-4042-8E30-88892F3B5F9B");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, "IMP NO ATTO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, "47582841-B5DC-4B68-8865-6A76F49EA615");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, "IMP PREN NO ATTO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, "7407126C-6FA1-4864-9360-424B4ED8BA4B");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, "IMP DEFINITIVO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, "7F87B241-3C81-4145-9096-BB43D2C6C0ED");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, "IMP PREN DEFINITIVO");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, "9F0820EC-FC73-4D8E-951B-1027E796154F");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, "IMP PRENOTATI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, "EF19DA31-8B03-4622-9F00-181407B0DAFF");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, "IMP OBBLIGATORI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, "C4B0F37A-7194-4E14-A916-62B74C1AE9B5");
    PAN_IMPEGNATO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, "IMP ESECUTIVI");
    PAN_IMPEGNATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, "");
    PAN_IMPEGNATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNATO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPEGNATO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.PANEL_LIST, 152, 20, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.PANEL_FORM, 420, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELSVILUPP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELSVILUPP, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELSVILUPP, -1, "", "LABELSVILUPP", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.PANEL_LIST, 144, 12, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.PANEL_FORM, 308, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELCONSOLI, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELCONSOLI, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELCONSOLI, -1, "", "LABELCONSOLI", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.PANEL_LIST, 136, 4, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.PANEL_FORM, 196, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELTOTALE, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELTOTALE, -1, "", "LABELTOTALE", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.PANEL_LIST, 4, 236, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 236, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_NEWPANELLABE, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.PANEL_LIST, 60, 148, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.PANEL_FORM, 20, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELTOTALE1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELTOTALE1, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELTOTALE1, -1, "", "LABELTOTALE1", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_LIST, 84);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_LIST, "IMP ACC CONS");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_FORM, 308, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_FORM, 84);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCCONS, MyGlb.PANEL_FORM, "IMP ACC CNS.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPACCCONS, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPACCCONS, PPQRY_VISTABILANUO, "A.IMP_ACC_CONS", "IMP_ACC_CONS", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_LIST, "IMP ACC SVIL");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_FORM, 420, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACCSVIL, MyGlb.PANEL_FORM, "IM. ACC SVL.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPACCSVIL, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPACCSVIL, PPQRY_VISTABILANUO, "A.IMP_ACC_SVIL", "IMP_ACC_SVIL", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_LIST, "IMP CONS NO ATTO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_FORM, 308, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSNOATT, MyGlb.PANEL_FORM, "IMP CNS. NO ATTO");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONSNOATT, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONSNOATT, PPQRY_VISTABILANUO, "A.IMP_CONS_NO_ATTO", "IMP_CONS_NO_ATTO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_LIST, 100);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_LIST, "IMP SVIL NO ATTO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_FORM, 420, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_FORM, 100);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILNOATT, MyGlb.PANEL_FORM, "IMP SVL. NO ATT.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVILNOATT, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVILNOATT, PPQRY_VISTABILANUO, "A.IMP_SVIL_NO_ATTO", "IMP_SVIL_NO_ATTO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.PANEL_LIST, 68, 156, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.PANEL_FORM, 20, 80, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABESENZATTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABESENZATTO, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABESENZATTO, -1, "", "LABESENZATTO", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_LIST, 136);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_LIST, "IMP CONS PREN NO ATTO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_FORM, 308, 108, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_FORM, 136);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPRNOAT, MyGlb.PANEL_FORM, "IMP CNS. PRN. NO ATTO");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONPRNOAT, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONPRNOAT, PPQRY_VISTABILANUO, "A.IMP_CONS_PREN_NO_ATTO", "IMP_CONS_PREN_NO_ATTO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_LIST, 128);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_LIST, "IMP SVIL PREN NO ATTO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_FORM, 420, 108, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_FORM, 128);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPRNOAT, MyGlb.PANEL_FORM, "IMP SVL. PRN. NO ATT.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVIPRNOAT, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVIPRNOAT, PPQRY_VISTABILANUO, "A.IMP_SVIL_PREN_NO_ATTO", "IMP_SVIL_PREN_NO_ATTO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.PANEL_LIST, 76, 164, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.PANEL_FORM, 20, 108, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LASEATDICUPR, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LASEATDICUPR, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LASEATDICUPR, -1, "", "LASEATDICUPR", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_LIST, 120);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_LIST, "IMP CONS DEFINITIVO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_FORM, 308, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_FORM, 116);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSDEFIN, MyGlb.PANEL_FORM, "IMP CNS. DEFIN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONSDEFIN, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONSDEFIN, PPQRY_VISTABILANUO, "A.IMP_CONS_DEFINITIVO", "IMP_CONS_DEFINITIVO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_LIST, "IMP SVIL DEFINITIVO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_FORM, 420, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILDEFIN, MyGlb.PANEL_FORM, "IMP SVL. DEFIN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVILDEFIN, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVILDEFIN, PPQRY_VISTABILANUO, "A.IMP_SVIL_DEFINITIVO", "IMP_SVIL_DEFINITIVO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.PANEL_LIST, 84, 172, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.PANEL_FORM, 20, 136, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELDEFINIT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELDEFINIT, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELDEFINIT, -1, "", "LABELDEFINIT", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_LIST, 148);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_LIST, "IMP CONS PREN DEFINITIVO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_FORM, 308, 164, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_FORM, 148);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONPREDEF, MyGlb.PANEL_FORM, "IMP CNS. PRN. DEFIN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONPREDEF, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONPREDEF, PPQRY_VISTABILANUO, "A.IMP_CONS_PREN_DEFINITIVO", "IMP_CONS_PREN_DEFINITIVO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_LIST, 140);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_LIST, "IMP SVIL PREN DEFINITIVO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_FORM, 420, 164, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_FORM, 140);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVIPREDEF, MyGlb.PANEL_FORM, "IMP SVL. PRN. DEFIN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVIPREDEF, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVIPREDEF, PPQRY_VISTABILANUO, "A.IMP_SVIL_PREN_DEFINITIVO", "IMP_SVIL_PREN_DEFINITIVO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.PANEL_LIST, 92, 180, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.PANEL_FORM, 20, 164, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABDEFDICUPR, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABDEFDICUPR, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABDEFDICUPR, -1, "", "LABDEFDICUPR", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_LIST, 120);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_LIST, "IMP CONS PRENOTATI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_FORM, 308, 192, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSPRENO, MyGlb.PANEL_FORM, "IMP CNS. PREN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONSPRENO, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONSPRENO, PPQRY_VISTABILANUO, "A.IMP_CONS_PRENOTATI", "IMP_CONS_PRENOTATI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_LIST, "IMP SVIL PRENOTATI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_FORM, 420, 192, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILPRENO, MyGlb.PANEL_FORM, "IMP SVL. PREN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVILPRENO, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVILPRENO, PPQRY_VISTABILANUO, "A.IMP_SVIL_PRENOTATI", "IMP_SVIL_PRENOTATI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.PANEL_LIST, 100, 188, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.PANEL_FORM, 20, 192, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABETOTAPREN, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABETOTAPREN, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABETOTAPREN, -1, "", "LABETOTAPREN", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_LIST, 128);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_LIST, "IMP CONS OBBLIGATORI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_FORM, 308, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_FORM, 128);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSOBBLI, MyGlb.PANEL_FORM, "IMP CNS. OBBLIG.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONSOBBLI, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONSOBBLI, PPQRY_VISTABILANUO, "A.IMP_CONS_OBBLIGATORI", "IMP_CONS_OBBLIGATORI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_LIST, 124);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_LIST, "IMP SVIL OBBLIGATORI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_FORM, 420, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_FORM, 124);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILOBBLI, MyGlb.PANEL_FORM, "IMP SVL. OBBLIG.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVILOBBLI, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVILOBBLI, PPQRY_VISTABILANUO, "A.IMP_SVIL_OBBLIGATORI", "IMP_SVIL_OBBLIGATORI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.PANEL_LIST, 108, 196, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.PANEL_FORM, 20, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELOBBLIGA, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELOBBLIGA, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELOBBLIGA, -1, "", "LABELOBBLIGA", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_LIST, "IMP CONS ESECUTIVI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_FORM, 308, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPCONSESECU, MyGlb.PANEL_FORM, "IMP CNS. ESEC.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPCONSESECU, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPCONSESECU, PPQRY_VISTABILANUO, "A.IMP_CONS_ESECUTIVI", "IMP_CONS_ESECUTIVI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_LIST, "IMP SVIL ESECUTIVI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_FORM, 420, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPSVILESECU, MyGlb.PANEL_FORM, "IMP SVL. ESEC.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPSVILESECU, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPSVILESECU, PPQRY_VISTABILANUO, "A.IMP_SVIL_ESECUTIVI", "IMP_SVIL_ESECUTIVI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.PANEL_LIST, 116, 204, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.PANEL_FORM, 20, 248, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_LABELESECUTI, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_LABELESECUTI, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_LABELESECUTI, -1, "", "LABELESECUTI", 0, 0, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_LIST, 52);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_LIST, "IMP ACC");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_FORM, 196, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_FORM, 52);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPACC, MyGlb.PANEL_FORM, "IM. ACC");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPACC, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPACC, PPQRY_VISTABILANUO, "A.IMP_ACC", "IMP_ACC", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_LIST, "IMP NO ATTO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_FORM, 196, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPNOATTO, MyGlb.PANEL_FORM, "IMP NO ATT.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPNOATTO, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPNOATTO, PPQRY_VISTABILANUO, "A.IMP_NO_ATTO", "IMP_NO_ATTO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_LIST, 104);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_LIST, "IMP PREN NO ATTO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_FORM, 196, 108, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_FORM, 104);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENNOATT, MyGlb.PANEL_FORM, "IMP PRN. NO ATT.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPPRENNOATT, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPPRENNOATT, PPQRY_VISTABILANUO, "A.IMP_PREN_NO_ATTO", "IMP_PREN_NO_ATTO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_LIST, 88);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_LIST, "IMP DEFINITIVO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_FORM, 196, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_FORM, 88);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPDEFINITIV, MyGlb.PANEL_FORM, "IMP DEFIN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPDEFINITIV, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPDEFINITIV, PPQRY_VISTABILANUO, "A.IMP_DEFINITIVO", "IMP_DEFINITIVO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_LIST, 116);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_LIST, "IMP PREN DEFINITIVO");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_FORM, 196, 164, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_FORM, 116);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENDEFIN, MyGlb.PANEL_FORM, "IMP PRN. DEFIN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPPRENDEFIN, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPPRENDEFIN, PPQRY_VISTABILANUO, "A.IMP_PREN_DEFINITIVO", "IMP_PREN_DEFINITIVO", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_LIST, 88);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_LIST, "IMP PRENOTATI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_FORM, 196, 192, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_FORM, 88);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPPRENOTATI, MyGlb.PANEL_FORM, "IMP PREN.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPPRENOTATI, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPPRENOTATI, PPQRY_VISTABILANUO, "A.IMP_PRENOTATI", "IMP_PRENOTATI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_LIST, 100);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_LIST, "IMP OBBLIGATORI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_FORM, 196, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_FORM, 100);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPOBBLIGATO, MyGlb.PANEL_FORM, "IMP OBBLIG.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPOBBLIGATO, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPOBBLIGATO, PPQRY_VISTABILANUO, "A.IMP_OBBLIGATORI", "IMP_OBBLIGATORI", 2, 15, 0, -13997);
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_LIST, 84);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_LIST, "IMP ESECUTIVI");
    PAN_IMPEGNATO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_FORM, 196, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_FORM, 84);
    PAN_IMPEGNATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNATO_IMPESECUTIVI, MyGlb.PANEL_FORM, "IMP ESEC.");
    PAN_IMPEGNATO.SetFieldPage(PFL_IMPEGNATO_IMPESECUTIVI, -1, -1);
    PAN_IMPEGNATO.SetFieldPanel(PFL_IMPEGNATO_IMPESECUTIVI, PPQRY_VISTABILANUO, "A.IMP_ESECUTIVI", "IMP_ESECUTIVI", 2, 15, 0, -13997);
  }

  private void PAN_IMPEGNATO_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEGNATO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPEGNATO.SetIMDB(IMDB, "PQRY_VISTABILANUO", true);
    PAN_IMPEGNATO.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA BILANCIO UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMP_ACC as IMP_ACC, ");
    SQL.append("  A.IMP_ACC_CONS as IMP_ACC_CONS, ");
    SQL.append("  A.IMP_ACC_SVIL as IMP_ACC_SVIL, ");
    SQL.append("  A.IMP_NO_ATTO as IMP_NO_ATTO, ");
    SQL.append("  A.IMP_CONS_NO_ATTO as IMP_CONS_NO_ATTO, ");
    SQL.append("  A.IMP_SVIL_NO_ATTO as IMP_SVIL_NO_ATTO, ");
    SQL.append("  A.IMP_PREN_NO_ATTO as IMP_PREN_NO_ATTO, ");
    SQL.append("  A.IMP_CONS_PREN_NO_ATTO as IMP_CONS_PREN_NO_ATTO, ");
    SQL.append("  A.IMP_SVIL_PREN_NO_ATTO as IMP_SVIL_PREN_NO_ATTO, ");
    SQL.append("  A.IMP_DEFINITIVO as IMP_DEFINITIVO, ");
    SQL.append("  A.IMP_CONS_DEFINITIVO as IMP_CONS_DEFINITIVO, ");
    SQL.append("  A.IMP_SVIL_DEFINITIVO as IMP_SVIL_DEFINITIVO, ");
    SQL.append("  A.IMP_PREN_DEFINITIVO as IMP_PREN_DEFINITIVO, ");
    SQL.append("  A.IMP_CONS_PREN_DEFINITIVO as IMP_CONS_PREN_DEFINITIVO, ");
    SQL.append("  A.IMP_SVIL_PREN_DEFINITIVO as IMP_SVIL_PREN_DEFINITIVO, ");
    SQL.append("  A.IMP_PRENOTATI as IMP_PRENOTATI, ");
    SQL.append("  A.IMP_CONS_PRENOTATI as IMP_CONS_PRENOTATI, ");
    SQL.append("  A.IMP_SVIL_PRENOTATI as IMP_SVIL_PRENOTATI, ");
    SQL.append("  A.IMP_OBBLIGATORI as IMP_OBBLIGATORI, ");
    SQL.append("  A.IMP_CONS_OBBLIGATORI as IMP_CONS_OBBLIGATORI, ");
    SQL.append("  A.IMP_SVIL_OBBLIGATORI as IMP_SVIL_OBBLIGATORI, ");
    SQL.append("  A.IMP_ESECUTIVI as IMP_ESECUTIVI, ");
    SQL.append("  A.IMP_CONS_ESECUTIVI as IMP_CONS_ESECUTIVI, ");
    SQL.append("  A.IMP_SVIL_ESECUTIVI as IMP_SVIL_ESECUTIVI ");
    PAN_IMPEGNATO.SetQuery(PPQRY_VISTABILANUO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO_77 A ");
    PAN_IMPEGNATO.SetQuery(PPQRY_VISTABILANUO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI476.PARAMES~~) ");
    SQL.append("and   (A.RISORSA_INTERVENTO = ~~TBL_PARAMETRI476.PARAMRISORSA~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI476.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI476.PARAMARTICOL~~) ");
    SQL.append("and   (A.TIPO = 'B') ");
    PAN_IMPEGNATO.SetQuery(PPQRY_VISTABILANUO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNATO.SetQuery(PPQRY_VISTABILANUO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNATO.SetQuery(PPQRY_VISTABILANUO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNATO.SetQuery(PPQRY_VISTABILANUO, 5, SQL, -1, "");
    PAN_IMPEGNATO.SetQueryDB(PPQRY_VISTABILANUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNATO.SetMasterTable(0, "VISTA_BILANCIO_UO_77");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEGNATO.Status() == 2)
    {
      int oldListQBE = PAN_IMPEGNATO.iUseListQBE;
      PAN_IMPEGNATO.iUseListQBE = 0;
      PAN_IMPEGNATO.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEGNATO.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEGNATO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPEGNATO) PAN_IMPEGNATO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateRow(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPEGNATO) PAN_IMPEGNATO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_DynamicProperties();
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_DynamicProperties();
    if (SrcObj == PAN_IMPEGNATO) PAN_IMPEGNATO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPEGNATO) PAN_IMPEGNATO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPEGNATO) PAN_IMPEGNATO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
