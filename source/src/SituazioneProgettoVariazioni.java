// **********************************************
// Situazione Progetto Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneProgettoVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_ESERCIZIO = 0;

  private static int PPQRY_FILTRO24 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_FILTRO;
  private static int PFL_SITUAZPROGET_VOCEPEGID = 0;
  private static int PFL_SITUAZPROGET_PROGETTOID = 1;
  private static int PFL_SITUAZPROGET_VOCEPEG = 2;
  private static int PFL_SITUAZPROGET_PROGETTO = 3;
  private static int PFL_SITUAZPROGET_RICHIEINIZIA = 4;
  private static int PFL_SITUAZPROGET_VARIAZINIZIA = 5;
  private static int PFL_SITUAZPROGET_RICHIEDEFINI = 6;
  private static int PFL_SITUAZPROGET_VARIAZDEFINI = 7;
  private static int PFL_SITUAZPROGET_STANZIATTUAL = 8;
  private static int PFL_SITUAZPROGET_VARIAZPROVVI = 9;
  private static int PFL_SITUAZPROGET_STANZIPROVVI = 10;
  private static int PFL_SITUAZPROGET_RICHIEIMPEGN = 11;
  private static int PFL_SITUAZPROGET_VARIAINIIMPE = 12;
  private static int PFL_SITUAZPROGET_RICHIDEFIMPE = 13;
  private static int PFL_SITUAZPROGET_VARIAZIMPEGN = 14;
  private static int PFL_SITUAZPROGET_IMPEGNATTUAL = 15;
  private static int PFL_SITUAZPROGET_IMPEGNATO = 16;
  private static int PFL_SITUAZPROGET_DISPONIBILIT = 17;
  private static int PFL_SITUAZPROGET_TOTALELABEL = 18;
  private static int PFL_SITUAZPROGET_STNINICONS = 19;
  private static int PFL_SITUAZPROGET_STNINISVIL = 20;
  private static int PFL_SITUAZPROGET_CONSOLILABEL = 21;
  private static int PFL_SITUAZPROGET_SVILUPPLABEL = 22;
  private static int PFL_SITUAZPROGET_VARINICONS = 23;
  private static int PFL_SITUAZPROGET_VARINISVIL = 24;
  private static int PFL_SITUAZPROGET_RICHDEFICONS = 25;
  private static int PFL_SITUAZPROGET_RICHDEFISVIL = 26;
  private static int PFL_SITUAZPROGET_VARDEFCONS = 27;
  private static int PFL_SITUAZPROGET_VARDEFSVIL = 28;
  private static int PFL_SITUAZPROGET_STANZIATTUA1 = 29;
  private static int PFL_SITUAZPROGET_STANZIATTUA2 = 30;
  private static int PFL_SITUAZPROGET_VARPROVCONS = 31;
  private static int PFL_SITUAZPROGET_VARPROVSVIL = 32;
  private static int PFL_SITUAZPROGET_STANZIPROVV1 = 33;
  private static int PFL_SITUAZPROGET_STANZIPROVV2 = 34;
  private static int PFL_SITUAZPROGET_IMPCONS = 35;
  private static int PFL_SITUAZPROGET_IMPSVIL = 36;
  private static int PFL_SITUAZPROGET_DISPCONS = 37;
  private static int PFL_SITUAZPROGET_DISPSVIL = 38;
  private static int PFL_SITUAZPROGET_INFOLABEL = 39;
  private static int PFL_SITUAZPROGET_VARIAZPROPOS = 40;
  private static int PFL_SITUAZPROGET_VARPROPOCONS = 41;
  private static int PFL_SITUAZPROGET_VARPROPOSVIL = 42;
  private static int PFL_SITUAZPROGET_STANZCONPROP = 43;
  private static int PFL_SITUAZPROGET_STANCONPROP1 = 44;
  private static int PFL_SITUAZPROGET_STANCONPROP2 = 45;
  private static int PFL_SITUAZPROGET_DISPONPROVVI = 46;
  private static int PFL_SITUAZPROGET_DISPONPROVV1 = 47;
  private static int PFL_SITUAZPROGET_DISPONPROVV2 = 48;
  private static int PFL_SITUAZPROGET_DISPOCONPROP = 49;
  private static int PFL_SITUAZPROGET_DISPCONPROP1 = 50;
  private static int PFL_SITUAZPROGET_DISPCONPROP2 = 51;

  private static int PPQRY_POLDETSTNPR2 = 0;

  private static int PPQRY_POLVOCIPEG = 1;
  private static int PPQRY_PROGETTI = 2;


  IDPanel PAN_SITUAZPROGET;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO30(IMDB);
    Init_TBL_PARAMETRI459(IMDB);
    //
    //
    Init_PQRY_POLDETSTNPR2(IMDB);
    Init_PQRY_FILTRO24(IMDB);
    Init_PQRY_FILTRO24_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FILTRO30, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_FILTRO30, "TBL_FILTRO30");
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRO30,IMDBDef4.FLD_FILTRO30_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRO30,IMDBDef4.FLD_FILTRO30_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FILTRO30, 0);
  }

  private static void Init_TBL_PARAMETRI459(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI459, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI459, "TBL_PARAMETRI459");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMEPROID, "ROWNAMEPROID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMEPROID,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMGESIMP, "ROWNAMGESIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI459,IMDBDef4.FLD_PARAMETRI459_ROWNAMGESIMP,5,49,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI459, 0);
  }

  private static void Init_PQRY_POLDETSTNPR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLDETSTNPR2, 46);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLDETSTNPR2, "PQRY_POLDETSTNPR2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VOCE_PEG_ID, "VOCE_PEG_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VOCE_PEG_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_STN_INI, "STN_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_STN_INI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI, "VAR_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECORICHDEFI, "RECORICHDEFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECORICHDEFI,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF, "VAR_DEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANATTU, "RECOSTANATTU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANATTU,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROV, "VAR_PROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROV,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANPROV, "RECOSTANPROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANPROV,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMPEGNABILE_INI, "IMPEGNABILE_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMPEGNABILE_INI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI_IMPEGNABILE, "VAR_INI_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI_IMPEGNABILE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECRICDEFIMP, "RECRICDEFIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECRICDEFIMP,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF_IMPEGNABILE, "VAR_DEF_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF_IMPEGNABILE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOIMPEATTU, "RECOIMPEATTU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOIMPEATTU,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMP_ACC, "IMP_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_DISP, "DISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_DISP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_STN_INI_CONS, "STN_INI_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_STN_INI_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_STN_INI_SVIL, "STN_INI_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_STN_INI_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI_CONS, "VAR_INI_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI_SVIL, "VAR_INI_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_INI_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECRICDEFCON, "RECRICDEFCON");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECRICDEFCON,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECRICDEFSVI, "RECRICDEFSVI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECRICDEFSVI,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF_CONS, "VAR_DEF_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF_SVIL, "VAR_DEF_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_DEF_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANATT1, "RECOSTANATT1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANATT1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANATT2, "RECOSTANATT2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANATT2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROV_CONS, "VAR_PROV_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROV_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROV_SVIL, "VAR_PROV_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROV_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANPRO1, "RECOSTANPRO1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANPRO1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANPRO2, "RECOSTANPRO2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECOSTANPRO2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMP_CONS, "IMP_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMP_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMP_SVIL, "IMP_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_IMP_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_DISP_CONS, "DISP_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_DISP_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_DISP_SVIL, "DISP_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_DISP_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROPOSTE, "VAR_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROPOSTE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROPOSTE_CONS, "VAR_PROPOSTE_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROPOSTE_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROPOSTE_SVIL, "VAR_PROPOSTE_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_VAR_PROPOSTE_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECSTACONPRO, "RECSTACONPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECSTACONPRO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECSTACONPR1, "RECSTACONPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECSTACONPR1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECSTACONPR2, "RECSTACONPR2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECSTACONPR2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECODISPPROV, "RECODISPPROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECODISPPROV,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECODISPPRO1, "RECODISPPRO1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECODISPPRO1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECODISPPRO2, "RECODISPPRO2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECODISPPRO2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECDISCONPRO, "RECDISCONPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECDISCONPRO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECDISCONPR1, "RECDISCONPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECDISCONPR1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECDISCONPR2, "RECDISCONPR2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR2,IMDBDef12.PQSL_POLDETSTNPR2_RECDISCONPR2,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLDETSTNPR2, 0);
  }

  private static void Init_PQRY_FILTRO24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO24, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO24, "PQRY_FILTRO24");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO24,IMDBDef12.PQSL_FILTRO24_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO24,IMDBDef12.PQSL_FILTRO24_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO24, 0);
  }

  private static void Init_PQRY_FILTRO24_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO24_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO24_RS, "PQRY_FILTRO24_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO24_RS,IMDBDef12.PQSL_FILTRO24_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO24_RS,IMDBDef12.PQSL_FILTRO24_ROWNAMEESERC,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneProgettoVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneProgettoVariazioni()
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
    FormIdx = MyGlb.FRM_SITUPROGVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2E9697BA-8E29-4DFF-8557-C13FC1418DE2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 696;
    DesignHeight = 694;
    set_Caption(new IDVariant("Situazione Progetto Variazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 696;
    Frames[1].Height = 668;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0778443;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 696;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A0E42948-4177-4616-8D74-30B6FF0ED0C7");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 696;
    Frames[3].Height = 616;
    Frames[3].Caption = "Situazione Progetto";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 616;
    PAN_SITUAZPROGET = new IDPanel(w, this, 3, "PAN_SITUAZPROGET");
    Frames[3].Content = PAN_SITUAZPROGET;
    PAN_SITUAZPROGET.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZPROGET.VS = MainFrm.VisualStyleList;
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 616-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5416C7D2-7621-456B-A1E0-E13899F55A0B");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4760, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZPROGET.InitStatus = 2;
    PAN_SITUAZPROGET_Init();
    PAN_SITUAZPROGET_InitFields();
    PAN_SITUAZPROGET_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_FILTRO30, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUPROGVARI_FILTRO24();
      }
      PAN_SITUAZPROGET.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneProgettoVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneProgettoVariazioni.class.getName() : (Glb.ClassWithPackage(SituazioneProgettoVariazioni.class) ? SituazioneProgettoVariazioni.class.getName().substring(SituazioneProgettoVariazioni.class.getPackage().getName().length() + 1) : SituazioneProgettoVariazioni.class.getName()));
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
    IDVariant v_GESTIMP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_FILTRO30, IMDBDef4.FLD_FILTRO30_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI459, IMDBDef4.FLD_PARAMETRI459_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.set_Header(Glb.OBJ_FIELD,PFL_SITUAZPROGET_IMPEGNATO, (new IDVariant("Accertato")).stringValue());
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.GESTIONE_IMPEGNABILE as T99GESTIIMPE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_GESTIMP = QV.Get("T99GESTIIMPE", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI459, IMDBDef4.FLD_PARAMETRI459_ROWNAMGESIMP, 0, new IDVariant(v_GESTIMP));
      if (v_GESTIMP.equals((new IDVariant()), true))
      {
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProgettoVariazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Progetto On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZPROGET_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SITUAZPROGET);
      // 
      // Situazione Progetto On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SITUAZPROGET.set_ToolTip(Glb.OBJ_FIELD,PFL_SITUAZPROGET_VOCEPEG,(new IDVariant(PAN_SITUAZPROGET.FieldText(PFL_SITUAZPROGET_VOCEPEG))).stringValue()); 
      PAN_SITUAZPROGET.set_ToolTip(Glb.OBJ_FIELD,PFL_SITUAZPROGET_PROGETTO,(new IDVariant(PAN_SITUAZPROGET.FieldText(PFL_SITUAZPROGET_PROGETTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProgettoVariazioni", "SituazioneProgettoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Progetto After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SITUAZPROGET_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Situazione Progetto After Find Event Body
      // Procedure Body
      // 
      PAN_SITUAZPROGET.set_FieldText(PFL_SITUAZPROGET_INFOLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Voce P.e.g.")), (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant(PAN_SITUAZPROGET.FieldText(PFL_SITUAZPROGET_VOCEPEG)))), (new IDVariant(" - "))), (new IDVariant("Progetto"))), (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant(PAN_SITUAZPROGET.FieldText(PFL_SITUAZPROGET_PROGETTO)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProgettoVariazioni", "SituazioneProgettoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
      // 
      // Filtro On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO24, IMDBDef12.PQSL_FILTRO24_ROWNAMEESERC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>0)
      {
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (IMDB.Value(IMDBDef4.TBL_PARAMETRI459, IMDBDef4.FLD_PARAMETRI459_ROWNAMGESIMP, 0).compareTo((new IDVariant()), true)!=0)
        {
          PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZPROGET.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_FILTRO24, IMDBDef12.PQSL_FILTRO24_ROWNAMEESERC, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_FILTRO30, IMDBDef4.FLD_FILTRO30_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProgettoVariazioni", "FiltroOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void SITUPROGVARI_FILTRO24() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_FILTRO24_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO30, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FILTRO30, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO24_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_FILTRO24_RS, 0, IMDBDef4.TBL_FILTRO30, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_FILTRO24_RS, 0, 0, IMDBDef4.TBL_FILTRO30, IMDBDef4.FLD_FILTRO30_ROWNAMEESERC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FILTRO30, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FILTRO30, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO30, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_FILTRO24_RS, 0);
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
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRO);
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SITUAZPROGET_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZPROGET, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZPROGET_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZPROGET, Cancel);
    // Stub
  }

  private void PAN_SITUAZPROGET_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SITUAZPROGET_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZPROGET_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZPROGET_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITUAZPROGET_Init()
  {

    PAN_SITUAZPROGET.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZPROGET.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITUAZPROGET.SetSize(MyGlb.OBJ_FIELD, 52);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, "5E004CFE-B04E-48C2-975B-9CACE74345D9");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, "VOCE PEG ID");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.VIS_NORMFIELPADR);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, "79BF293A-8526-435E-9BA9-DE7414B68C1E");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, "PROGETTO ID");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, "F93AB26F-5927-447E-82FA-894C174E7846");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, "Voce P.e.g.");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.VIS_VISULOOUPCF4);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, "B8879752-4666-4C8F-BDEA-B528B598F377");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, "Progetto");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, "24875445-0916-4332-B6CC-3921855B0443");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, "Richiesta Iniziale");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, "1F13FEEA-8C7A-4602-8BE2-E21EC6E159F3");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, "Variazioni Iniziali");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, "A360C55E-2D8E-4BF6-A496-DB8C7210B930");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, "Richiesta Definitiva");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, "2BD11062-20B4-4668-B00D-C0B1FA8E73B6");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, "Variazioni Definitive");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, "55F80B2F-BA97-4D95-B026-B29DEDF0A5D4");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, "Stanziamento Attuale");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, "POL DETTAGLIO STN PROG STN INI + POL DETTAGLIO STN PROG VAR INI + POL DETTAGLIO STN PROG VAR DEF");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, "8452030A-DAA6-41F0-A8E5-3B2C247619BE");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, "Variazioni Provvisorie");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, "55F2BBA6-ADC4-4DB2-AD4C-B9F17EC16BD5");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, "Stanziamento Provvisorio");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, "POL DETTAGLIO STN PROG STN INI + POL DETTAGLIO STN PROG VAR INI + POL DETTAGLIO STN PROG VAR DEF + POL DETTAGLIO STN PROG VAR PROV");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, "6B1215A3-23C9-4D5D-9774-306772885072");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, "Richiesta Impegnabile");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, "DA5C93A4-5F78-4FF4-A464-2BBE4DDB3938");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, "Variazioni Ini. Impegnabile");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, "2928F034-DE54-4931-8C76-EA610C9027A3");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, "Richiesta Def. Impegnabile");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, "7F96A2AE-7C3E-4EF3-B1CC-4508D647A785");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, "Variazioni Impegnabile");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, "2F3A50A5-269C-4E4E-881C-6ED4F7C9A616");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, "Impegnabile Attuale");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, "POL DETTAGLIO STN PROG IMPEGNABILE INI + POL DETTAGLIO STN PROG VAR INI IMPEGNABILE + POL DETTAGLIO STN PROG VAR DEF IMPEGNABILE");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, "98B0DA28-32E7-40C2-BD96-BCEB63FCBE2C");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, "Impegnato");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, "E05C7872-85E9-41A9-8FD9-CDD2F1FC32E5");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, "Disponibilità");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, "97012338-8680-4840-A160-A83DDCEBC4A4");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, "Totale");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, "315C6E7F-FB09-45FB-8DF3-4D748E8DE90B");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, "STN INI CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, "0F0CECD6-C0C7-411A-BD44-3CDC271DBA41");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, "STN INI SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, "0455F066-2428-4546-A1B6-9CD3A1DEE21C");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, "Consolidato");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, "5834277F-8473-458A-9A71-43C4E0A64341");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, "Sviluppo");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, "2EE2BF92-FBE2-4BFF-A0FA-9BDA10836C7C");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, "VAR INI CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, "CE5E6B26-B885-4C9F-8EEF-E97276A3B967");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, "VAR INI SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, "09736D8F-4AFF-4B75-A343-02B709BC5767");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, "Richiesta Definitiva Cons");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, "6711C6D6-15E2-4652-A889-AF38A4BFF9FB");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, "Richiesta Definitiva Svil");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, "3BFC9FE4-A71F-4182-B9C3-B435AC1B4C12");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, "VAR DEF CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, "92C9F670-5DB8-456F-A53A-E2ED2AE88405");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, "VAR DEF SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, "E8C907F1-C494-4FEB-9A70-F18AF312DFFD");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, "Stanziamento Attuale 1");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, "728F8370-9DD9-4B68-B9E8-D0E0AF411B1E");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, "Stanziamento Attuale 2");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, "3A4EF8AF-A965-408E-BA6F-D5DF19667161");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, "VAR PROV CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, "F07B04BD-3E23-41B8-9AEE-7133673C8AF1");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, "VAR PROV SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, "E92B55D3-189F-46E9-93BF-444CCC73D2A8");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, "Stanziamento Provvisorio 1");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, "97B306C9-EF0F-42FB-84CC-15ECF48109FC");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, "Stanziamento Provvisorio 2");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, "37D9B0A8-1695-408D-BF82-C1FFE95DE7CC");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, "IMP CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, "E9A012DE-5147-4519-84D6-33C067479238");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, "IMP SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, "43902A7D-ECB3-4D6B-BACD-BF41452BB099");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, "DISP CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, "13288FF4-88CD-4F8A-A9DF-15144346D142");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, "DISP SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, "7E6E4554-D22C-4C09-A176-EB5F7F043200");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, "7436B84E-8F55-4FF9-B4CD-35B974A42194");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, "Variazioni Proposte");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, "CAC677CF-C1AF-42A6-9A4E-30AEFA4EA08E");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, "VAR PROPOSTE CONS");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, "77ED5F6A-4A88-4F55-8D4B-F27FB46DF346");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, "VAR PROPOSTE SVIL");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, "A54639CC-D0CD-486B-8292-EA639A612530");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, "Stanziamento Con Proposte");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, "0A7DF7BC-2F6E-4B8E-934A-89E07F2D5952");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, "Stanziamento Con Proposte 1");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, "5E9DFF11-C413-4DBB-9B77-5A2C6FC340E6");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, "Stanziamento Con Proposte 2");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, "C51E144C-57B7-447A-8057-48FD07F3DB4D");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, "Disponibilità Provvisoria");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, "CF26C8BE-9106-44D7-947E-D4F4CFEF5F78");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, "Disponibilità Provvisoria 1");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, "0B53F22E-2B62-4728-93C9-04FE73F0FE63");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, "Disponibilità Provvisoria 2");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, "E7BD1C87-ECFF-4A36-8A6F-C4D5BE7E57E6");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, "Disponibilità Con Proposte");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, "9DF9C31C-3CA5-419E-A9C5-C2C3D334315B");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, "Disponibilità Con Proposte 1");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZPROGET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, "4016DD3D-3489-41B3-8254-32620E7D1D5F");
    PAN_SITUAZPROGET.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, "Disponibilità Con Proposte 2");
    PAN_SITUAZPROGET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, "");
    PAN_SITUAZPROGET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZPROGET.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SITUAZPROGET_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_LIST, "VOCE PEG ID");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEGID, MyGlb.PANEL_FORM, "VC. PEG ID");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VOCEPEGID, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VOCEPEGID, PPQRY_POLDETSTNPR2, "A.VOCE_PEG_ID", "VOCE_PEG_ID", 3, 10, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_LIST, 72, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTOID, MyGlb.PANEL_FORM, "PROG. ID");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_PROGETTOID, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_PROGETTOID, PPQRY_POLDETSTNPR2, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_LIST, 2);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_LIST, "Voce P.e.g.");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_FORM, 76, 12, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VOCEPEG, MyGlb.PANEL_FORM, "Voce P e g");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VOCEPEG, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VOCEPEG, PPQRY_POLVOCIPEG, "TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' - ' || B.DESCRIZIONE", "POLVOPEVOPEG", 5, 342, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_LIST, 104);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_LIST, 2);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_LIST, "Progetto");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_FORM, 88, 40, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_FORM, 52);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_PROGETTO, MyGlb.PANEL_FORM, "Prog.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_PROGETTO, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_PROGETTO, PPQRY_PROGETTI, "A.PROGETTO_ID || ' - ' || A.DESCRIZIONE", "PROGETPROGET", 5, 112, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_LIST, 48);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_LIST, "Richiesta Iniziale");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_FORM, 52, 92, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_FORM, 156);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEINIZIA, MyGlb.PANEL_FORM, "Richiesta Iniziale");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_RICHIEINIZIA, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_RICHIEINIZIA, PPQRY_POLDETSTNPR2, "A.STN_INI", "STN_INI", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_LIST, 48);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_LIST, "Variazioni Iniziali");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_FORM, 52, 116, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_FORM, 156);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZINIZIA, MyGlb.PANEL_FORM, "Variazioni Iniziali");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARIAZINIZIA, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARIAZINIZIA, PPQRY_POLDETSTNPR2, "A.VAR_INI", "VAR_INI", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_LIST, "Richiesta Definitiva");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_FORM, 40, 140, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_FORM, 168);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEDEFINI, MyGlb.PANEL_FORM, "Richiesta Definitiva");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_RICHIEDEFINI, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_RICHIEDEFINI, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_RICHIEDEFINI, PPQRY_POLDETSTNPR2, "A.STN_INI + A.VAR_INI", "RECORICHDEFI", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_LIST, "Variazioni Definitive");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_FORM, 36, 164, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_FORM, 172);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZDEFINI, MyGlb.PANEL_FORM, "Variazioni Definitive");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARIAZDEFINI, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARIAZDEFINI, PPQRY_POLDETSTNPR2, "A.VAR_DEF", "VAR_DEF", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_LIST, 112);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_LIST, "Stanziamento Attuale");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_FORM, 28, 188, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_FORM, 180);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUAL, MyGlb.PANEL_FORM, "Stanziamento Attuale");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZIATTUAL, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZIATTUAL, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZIATTUAL, PPQRY_POLDETSTNPR2, "A.STN_INI + A.VAR_INI + A.VAR_DEF", "RECOSTANATTU", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_FORM, 28, 212, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_FORM, 180);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROVVI, MyGlb.PANEL_FORM, "Variazioni Provvisorie");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARIAZPROVVI, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARIAZPROVVI, PPQRY_POLDETSTNPR2, "A.VAR_PROV", "VAR_PROV", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_LIST, "Stanziamento Provvisorio");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_FORM, 8, 236, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_FORM, 200);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVVI, MyGlb.PANEL_FORM, "Stanziamento Provvisorio");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZIPROVVI, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZIPROVVI, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZIPROVVI, PPQRY_POLDETSTNPR2, "A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROV", "RECOSTANPROV", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_LIST, "Richiesta Impegnabile");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_FORM, 28, 308, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_FORM, 180);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIEIMPEGN, MyGlb.PANEL_FORM, "Richiesta Impegnabile");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_RICHIEIMPEGN, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_RICHIEIMPEGN, PPQRY_POLDETSTNPR2, "A.IMPEGNABILE_INI", "IMPEGNABILE_INI", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_LIST, 116);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_LIST, "Variazioni Ini. Impegnabile");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_FORM, 4, 332, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_FORM, 204);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAINIIMPE, MyGlb.PANEL_FORM, "Variazioni Ini. Impegnabile");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARIAINIIMPE, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARIAINIIMPE, PPQRY_POLDETSTNPR2, "A.VAR_INI_IMPEGNABILE", "VAR_INI_IMPEGNABILE", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_LIST, "Richiesta Def. Impegnabile");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_FORM, 4, 356, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_FORM, 204);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHIDEFIMPE, MyGlb.PANEL_FORM, "Richiesta Def. Impegnabile");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_RICHIDEFIMPE, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_RICHIDEFIMPE, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_RICHIDEFIMPE, PPQRY_POLDETSTNPR2, "A.IMPEGNABILE_INI + A.VAR_INI_IMPEGNABILE", "RECRICDEFIMP", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_LIST, "Variazioni Impegnabile");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_FORM, 24, 380, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_FORM, 184);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZIMPEGN, MyGlb.PANEL_FORM, "Variazioni Impegnabile");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARIAZIMPEGN, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARIAZIMPEGN, PPQRY_POLDETSTNPR2, "A.VAR_DEF_IMPEGNABILE", "VAR_DEF_IMPEGNABILE", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_LIST, 104);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_LIST, "Impegnabile Attuale");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_FORM, 36, 404, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_FORM, 172);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATTUAL, MyGlb.PANEL_FORM, "Impegnabile Attuale");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_IMPEGNATTUAL, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_IMPEGNATTUAL, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_IMPEGNATTUAL, PPQRY_POLDETSTNPR2, "A.IMPEGNABILE_INI + A.VAR_INI_IMPEGNABILE + A.VAR_DEF_IMPEGNABILE", "RECOIMPEATTU", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_LIST, "Impegnato");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_FORM, 80, 428, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPEGNATO, MyGlb.PANEL_FORM, "Impegnato");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_IMPEGNATO, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_IMPEGNATO, PPQRY_POLDETSTNPR2, "A.IMP_ACC", "IMP_ACC", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_LIST, 32);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_FORM, 76, 452, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPONIBILIT, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPONIBILIT, PPQRY_POLDETSTNPR2, "A.DISP", "DISP", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.PANEL_LIST, 144, 68, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.PANEL_FORM, 208, 68, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_TOTALELABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_TOTALELABEL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_TOTALELABEL, -1, "", "TOTALELABEL", 0, 0, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_LIST, "STN INI CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_FORM, 344, 92, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINICONS, MyGlb.PANEL_FORM, "STN INI CNS.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STNINICONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STNINICONS, PPQRY_POLDETSTNPR2, "A.STN_INI_CONS", "STN_INI_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_LIST, "STN INI SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_FORM, 484, 92, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STNINISVIL, MyGlb.PANEL_FORM, "ST. INI SVL.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STNINISVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STNINISVIL, PPQRY_POLDETSTNPR2, "A.STN_INI_SVIL", "STN_INI_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.PANEL_LIST, 152, 76, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.PANEL_FORM, 344, 68, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_CONSOLILABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_CONSOLILABEL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_CONSOLILABEL, -1, "", "CONSOLILABEL", 0, 0, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.PANEL_LIST, 160, 84, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.PANEL_FORM, 484, 68, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_SVILUPPLABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_SVILUPPLABEL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_SVILUPPLABEL, -1, "", "SVILUPPLABEL", 0, 0, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_LIST, "VAR INI CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_FORM, 344, 116, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_FORM, 80);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINICONS, MyGlb.PANEL_FORM, "VAR INI CNS.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARINICONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARINICONS, PPQRY_POLDETSTNPR2, "A.VAR_INI_CONS", "VAR_INI_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_LIST, "VAR INI SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_FORM, 484, 116, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARINISVIL, MyGlb.PANEL_FORM, "VR. INI SVL.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARINISVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARINISVIL, PPQRY_POLDETSTNPR2, "A.VAR_INI_SVIL", "VAR_INI_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_LIST, 128);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_LIST, "Richiesta Definitiva Cons");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_FORM, 344, 140, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFICONS, MyGlb.PANEL_FORM, "Rich. Definitiva Cons");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_RICHDEFICONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_RICHDEFICONS, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_RICHDEFICONS, PPQRY_POLDETSTNPR2, "A.STN_INI_CONS + A.VAR_INI_CONS", "RECRICDEFCON", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_LIST, "Richiesta Definitiva Svil");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_FORM, 484, 140, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_RICHDEFISVIL, MyGlb.PANEL_FORM, "Rich. Definitiva Svil");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_RICHDEFISVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_RICHDEFISVIL, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_RICHDEFISVIL, PPQRY_POLDETSTNPR2, "A.STN_INI_SVIL + A.VAR_INI_SVIL", "RECRICDEFSVI", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_LIST, "VAR DEF CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_FORM, 344, 164, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_FORM, 84);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFCONS, MyGlb.PANEL_FORM, "VAR DEF CONS");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARDEFCONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARDEFCONS, PPQRY_POLDETSTNPR2, "A.VAR_DEF_CONS", "VAR_DEF_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_LIST, "VAR DEF SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_FORM, 484, 164, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARDEFSVIL, MyGlb.PANEL_FORM, "VR. DEF SVL.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARDEFSVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARDEFSVIL, PPQRY_POLDETSTNPR2, "A.VAR_DEF_SVIL", "VAR_DEF_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_LIST, "Stanziamento Attuale 1");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_FORM, 344, 188, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA1, MyGlb.PANEL_FORM, "Stanziam. Attuale 1");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZIATTUA1, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZIATTUA1, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZIATTUA1, PPQRY_POLDETSTNPR2, "A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS", "RECOSTANATT1", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_LIST, "Stanziamento Attuale 2");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_FORM, 484, 188, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIATTUA2, MyGlb.PANEL_FORM, "Stanziam. Attuale 2");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZIATTUA2, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZIATTUA2, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZIATTUA2, PPQRY_POLDETSTNPR2, "A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL", "RECOSTANATT2", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_LIST, "VAR PROV CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_FORM, 344, 212, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_FORM, 92);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVCONS, MyGlb.PANEL_FORM, "VAR PRV. CONS");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARPROVCONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARPROVCONS, PPQRY_POLDETSTNPR2, "A.VAR_PROV_CONS", "VAR_PROV_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_LIST, "VAR PROV SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_FORM, 484, 212, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_FORM, 84);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROVSVIL, MyGlb.PANEL_FORM, "VAR PRV. SVL.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARPROVSVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARPROVSVIL, PPQRY_POLDETSTNPR2, "A.VAR_PROV_SVIL", "VAR_PROV_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_LIST, 140);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 1");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_FORM, 344, 236, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV1, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 1");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZIPROVV1, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZIPROVV1, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZIPROVV1, PPQRY_POLDETSTNPR2, "A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS", "RECOSTANPRO1", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_LIST, 140);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 2");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_FORM, 484, 236, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZIPROVV2, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 2");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZIPROVV2, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZIPROVV2, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZIPROVV2, PPQRY_POLDETSTNPR2, "A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL", "RECOSTANPRO2", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_LIST, "IMP CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_FORM, 344, 428, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_FORM, 60);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPCONS, MyGlb.PANEL_FORM, "IMP CONS");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_IMPCONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_IMPCONS, PPQRY_POLDETSTNPR2, "A.IMP_CONS", "IMP_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_LIST, "IMP SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_FORM, 484, 428, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_FORM, 52);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_IMPSVIL, MyGlb.PANEL_FORM, "IM. SVL.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_IMPSVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_IMPSVIL, PPQRY_POLDETSTNPR2, "A.IMP_SVIL", "IMP_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_LIST, 64);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_LIST, "DISP CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_FORM, 344, 452, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONS, MyGlb.PANEL_FORM, "DSP. CONS");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPCONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPCONS, PPQRY_POLDETSTNPR2, "A.DISP_CONS", "DISP_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_LIST, 56);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_LIST, "DISP SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_FORM, 484, 452, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_FORM, 56);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPSVIL, MyGlb.PANEL_FORM, "DS. SVL.");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPSVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPSVIL, PPQRY_POLDETSTNPR2, "A.DISP_SVIL", "DISP_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.PANEL_LIST, 4, 4, 548, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.PANEL_FORM, 4, 4, 632, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_INFOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_INFOLABEL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_INFOLABEL, -1, "", "INFOLABEL", 0, 0, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_LIST, "Variazioni Proposte");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_FORM, 24, 260, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_FORM, 184);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARIAZPROPOS, MyGlb.PANEL_FORM, "Variazioni Proposte");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARIAZPROPOS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARIAZPROPOS, PPQRY_POLDETSTNPR2, "A.VAR_PROPOSTE", "VAR_PROPOSTE", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_LIST, 116);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_LIST, "VAR PROPOSTE CONS");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_FORM, 344, 260, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOCONS, MyGlb.PANEL_FORM, "VAR PROP. CONS");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARPROPOCONS, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARPROPOCONS, PPQRY_POLDETSTNPR2, "A.VAR_PROPOSTE_CONS", "VAR_PROPOSTE_CONS", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_LIST, 108);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_LIST, "VAR PROPOSTE SVIL");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_FORM, 484, 260, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_FORM, 108);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_VARPROPOSVIL, MyGlb.PANEL_FORM, "VAR PROP. SVIL");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_VARPROPOSVIL, -1, -1);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_VARPROPOSVIL, PPQRY_POLDETSTNPR2, "A.VAR_PROPOSTE_SVIL", "VAR_PROPOSTE_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_LIST, "Stanziamento Con Proposte");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_FORM, -4, 284, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_FORM, 212);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANZCONPROP, MyGlb.PANEL_FORM, "Stanziamento Con Proposte");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANZCONPROP, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANZCONPROP, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANZCONPROP, PPQRY_POLDETSTNPR2, "A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROV + A.VAR_PROPOSTE", "RECSTACONPRO", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_LIST, "Stanziamento Con Proposte 1");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_FORM, 344, 284, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_FORM, 152);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP1, MyGlb.PANEL_FORM, "Stanziam. Con Proposte 1");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANCONPROP1, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANCONPROP1, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANCONPROP1, PPQRY_POLDETSTNPR2, "A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS + A.VAR_PROPOSTE_CONS", "RECSTACONPR1", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_LIST, "Stanziamento Con Proposte 2");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_FORM, 484, 284, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_FORM, 152);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_STANCONPROP2, MyGlb.PANEL_FORM, "Stanziam. Con Proposte 2");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_STANCONPROP2, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_STANCONPROP2, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_STANCONPROP2, PPQRY_POLDETSTNPR2, "A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL + A.VAR_PROPOSTE_SVIL", "RECSTACONPR2", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_LIST, "Disponibilità Provvisoria");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_FORM, 20, 476, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_FORM, 188);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVVI, MyGlb.PANEL_FORM, "Disponibilità Provvisoria");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPONPROVVI, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_DISPONPROVVI, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPONPROVVI, PPQRY_POLDETSTNPR2, "A.DISP + A.VAR_PROV", "RECODISPPROV", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_LIST, "Disponibilità Provvisoria 1");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_FORM, 344, 476, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV1, MyGlb.PANEL_FORM, "Dispon. Provvisoria 1");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPONPROVV1, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_DISPONPROVV1, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPONPROVV1, PPQRY_POLDETSTNPR2, "A.DISP_CONS + A.VAR_PROV_CONS", "RECODISPPRO1", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_LIST, "Disponibilità Provvisoria 2");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_FORM, 484, 476, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPONPROVV2, MyGlb.PANEL_FORM, "Dispon. Provvisoria 2");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPONPROVV2, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_DISPONPROVV2, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPONPROVV2, PPQRY_POLDETSTNPR2, "A.DISP_SVIL + A.VAR_PROV_SVIL", "RECODISPPRO2", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_LIST, "Disponibilità Con Proposte");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_FORM, -8, 500, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_FORM, 216);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPOCONPROP, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPOCONPROP, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_DISPOCONPROP, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPOCONPROP, PPQRY_POLDETSTNPR2, "A.DISP + A.VAR_PROPOSTE", "RECDISCONPRO", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_LIST, "Disponibilità Con Proposte 1");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_FORM, 344, 500, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_FORM, 8);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP1, MyGlb.PANEL_FORM, "D. C. P. 1");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPCONPROP1, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_DISPCONPROP1, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPCONPROP1, PPQRY_POLDETSTNPR2, "A.DISP_CONS + A.VAR_PROPOSTE_CONS", "RECDISCONPR1", 2, 19, 0, -13997);
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_LIST, "Disponibilità Con Proposte 2");
    PAN_SITUAZPROGET.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_FORM, 484, 500, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZPROGET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_FORM, 8);
    PAN_SITUAZPROGET.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZPROGET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZPROGET_DISPCONPROP2, MyGlb.PANEL_FORM, "D. C. P. 2");
    PAN_SITUAZPROGET.SetFieldPage(PFL_SITUAZPROGET_DISPCONPROP2, -1, -1);
    PAN_SITUAZPROGET.SetFieldUnbound(PFL_SITUAZPROGET_DISPCONPROP2, true);
    PAN_SITUAZPROGET.SetFieldPanel(PFL_SITUAZPROGET_DISPCONPROP2, PPQRY_POLDETSTNPR2, "A.DISP_SVIL + A.VAR_PROPOSTE_SVIL", "RECDISCONPR2", 2, 19, 0, -13997);
  }

  private void PAN_SITUAZPROGET_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZPROGET.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' - ' || B.DESCRIZIONE as POLVOPEVOPEG ");
    SQL.append("from ");
    SQL.append("  POL_VOCI_PEG A, ");
    SQL.append("  CAP B ");
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (A.VOCE_PEG_ID = ~~VOCE_PEG_ID~~) ");
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLVOCIPEG, 0, SQL, -1, "");
    PAN_SITUAZPROGET.SetQueryDB(PPQRY_POLVOCIPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZPROGET.SetMasterTable(PPQRY_POLVOCIPEG, "POL_VOCI_PEG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID || ' - ' || A.DESCRIZIONE as PROGETPROGET ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    PAN_SITUAZPROGET.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_SITUAZPROGET.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZPROGET.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    PAN_SITUAZPROGET.SetIMDB(IMDB, "PQRY_POLDETSTNPR2", true);
    PAN_SITUAZPROGET.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VOCE_PEG_ID as VOCE_PEG_ID, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.STN_INI as STN_INI, ");
    SQL.append("  A.VAR_INI as VAR_INI, ");
    SQL.append("  A.STN_INI + A.VAR_INI as RECORICHDEFI, ");
    SQL.append("  A.VAR_DEF as VAR_DEF, ");
    SQL.append("  A.STN_INI + A.VAR_INI + A.VAR_DEF as RECOSTANATTU, ");
    SQL.append("  A.VAR_PROV as VAR_PROV, ");
    SQL.append("  A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROV as RECOSTANPROV, ");
    SQL.append("  A.IMPEGNABILE_INI as IMPEGNABILE_INI, ");
    SQL.append("  A.VAR_INI_IMPEGNABILE as VAR_INI_IMPEGNABILE, ");
    SQL.append("  A.IMPEGNABILE_INI + A.VAR_INI_IMPEGNABILE as RECRICDEFIMP, ");
    SQL.append("  A.VAR_DEF_IMPEGNABILE as VAR_DEF_IMPEGNABILE, ");
    SQL.append("  A.IMPEGNABILE_INI + A.VAR_INI_IMPEGNABILE + A.VAR_DEF_IMPEGNABILE as RECOIMPEATTU, ");
    SQL.append("  A.IMP_ACC as IMP_ACC, ");
    SQL.append("  A.DISP as DISP, ");
    SQL.append("  A.STN_INI_CONS as STN_INI_CONS, ");
    SQL.append("  A.STN_INI_SVIL as STN_INI_SVIL, ");
    SQL.append("  A.VAR_INI_CONS as VAR_INI_CONS, ");
    SQL.append("  A.VAR_INI_SVIL as VAR_INI_SVIL, ");
    SQL.append("  A.STN_INI_CONS + A.VAR_INI_CONS as RECRICDEFCON, ");
    SQL.append("  A.STN_INI_SVIL + A.VAR_INI_SVIL as RECRICDEFSVI, ");
    SQL.append("  A.VAR_DEF_CONS as VAR_DEF_CONS, ");
    SQL.append("  A.VAR_DEF_SVIL as VAR_DEF_SVIL, ");
    SQL.append("  A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS as RECOSTANATT1, ");
    SQL.append("  A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL as RECOSTANATT2, ");
    SQL.append("  A.VAR_PROV_CONS as VAR_PROV_CONS, ");
    SQL.append("  A.VAR_PROV_SVIL as VAR_PROV_SVIL, ");
    SQL.append("  A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS as RECOSTANPRO1, ");
    SQL.append("  A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL as RECOSTANPRO2, ");
    SQL.append("  A.IMP_CONS as IMP_CONS, ");
    SQL.append("  A.IMP_SVIL as IMP_SVIL, ");
    SQL.append("  A.DISP_CONS as DISP_CONS, ");
    SQL.append("  A.DISP_SVIL as DISP_SVIL, ");
    SQL.append("  A.VAR_PROPOSTE as VAR_PROPOSTE, ");
    SQL.append("  A.VAR_PROPOSTE_CONS as VAR_PROPOSTE_CONS, ");
    SQL.append("  A.VAR_PROPOSTE_SVIL as VAR_PROPOSTE_SVIL, ");
    SQL.append("  A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROV + A.VAR_PROPOSTE as RECSTACONPRO, ");
    SQL.append("  A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS + A.VAR_PROPOSTE_CONS as RECSTACONPR1, ");
    SQL.append("  A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL + A.VAR_PROPOSTE_SVIL as RECSTACONPR2, ");
    SQL.append("  A.DISP + A.VAR_PROV as RECODISPPROV, ");
    SQL.append("  A.DISP_CONS + A.VAR_PROV_CONS as RECODISPPRO1, ");
    SQL.append("  A.DISP_SVIL + A.VAR_PROV_SVIL as RECODISPPRO2, ");
    SQL.append("  A.DISP + A.VAR_PROPOSTE as RECDISCONPRO, ");
    SQL.append("  A.DISP_CONS + A.VAR_PROPOSTE_CONS as RECDISCONPR1, ");
    SQL.append("  A.DISP_SVIL + A.VAR_PROPOSTE_SVIL as RECDISCONPR2 ");
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLDETSTNPR2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_DETTAGLIO_STN_PROG A ");
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLDETSTNPR2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~PQRY_FILTRO24.ROWNAMEESERC~~) ");
    SQL.append("and   (A.PROGETTO_ID = ~~TBL_PARAMETRI459.ROWNAMEPROID~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI459.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI459.ROWNAMEARTIC~~) ");
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLDETSTNPR2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLDETSTNPR2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLDETSTNPR2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZPROGET.SetQuery(PPQRY_POLDETSTNPR2, 5, SQL, -1, "");
    PAN_SITUAZPROGET.SetQueryDB(PPQRY_POLDETSTNPR2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZPROGET.SetMasterTable(0, "POL_DETTAGLIO_STN_PROG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZPROGET.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZPROGET.iUseListQBE;
      PAN_SITUAZPROGET.iUseListQBE = 0;
      PAN_SITUAZPROGET.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZPROGET.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZPROGET.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "57F6454D-8C6F-44F7-95F8-3079919D05E4");
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
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 24, 8, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ESERCIZIO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ESERCIZIO, PPQRY_FILTRO24, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALSESSESER, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUATOSTRSEES ");
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
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALSESSESER, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUATOSTRSEES ");
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
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO24", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO24, IMDBDef12.PQRY_FILTRO24_RS, IMDBDef4.TBL_FILTRO30);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ESERCIZIO, IMDBDef4.FLD_FILTRO30_ROWNAMEESERC);
    PAN_FILTRO.SetMasterTable(0, "FILTRO30");
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
    if (SrcObj == PAN_SITUAZPROGET) PAN_SITUAZPROGET_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZPROGET) PAN_SITUAZPROGET_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITUAZPROGET) PAN_SITUAZPROGET_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZPROGET) PAN_SITUAZPROGET_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITUAZPROGET) PAN_SITUAZPROGET_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SITUAZPROGET) PAN_SITUAZPROGET_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
