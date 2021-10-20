// **********************************************
// Situazione Obiettivo Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneObiettivoVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_ESERCIZIO = 0;

  private static int PPQRY_FILTRO22 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_FILTRO;
  private static int PFL_SITUAZOBIETT_VOCEPEGID = 0;
  private static int PFL_SITUAZOBIETT_PROGETTOID = 1;
  private static int PFL_SITUAZOBIETT_VOCEPEG = 2;
  private static int PFL_SITUAZOBIETT_PROGETTO = 3;
  private static int PFL_SITUAZOBIETT_RICHIEINIZIA = 4;
  private static int PFL_SITUAZOBIETT_VARIAZINIZIA = 5;
  private static int PFL_SITUAZOBIETT_RICHIEDEFINI = 6;
  private static int PFL_SITUAZOBIETT_VARIAZDEFINI = 7;
  private static int PFL_SITUAZOBIETT_STANZIATTUAL = 8;
  private static int PFL_SITUAZOBIETT_VARIAZPROVVI = 9;
  private static int PFL_SITUAZOBIETT_STANZIPROVVI = 10;
  private static int PFL_SITUAZOBIETT_RICHIEIMPEGN = 11;
  private static int PFL_SITUAZOBIETT_VARIAINIIMPE = 12;
  private static int PFL_SITUAZOBIETT_RICHIDEFIMPE = 13;
  private static int PFL_SITUAZOBIETT_VARIAZIMPEGN = 14;
  private static int PFL_SITUAZOBIETT_IMPEGNATTUAL = 15;
  private static int PFL_SITUAZOBIETT_IMPEGNATO = 16;
  private static int PFL_SITUAZOBIETT_DISPONIBILIT = 17;
  private static int PFL_SITUAZOBIETT_TOTALELABEL = 18;
  private static int PFL_SITUAZOBIETT_STNINICONS = 19;
  private static int PFL_SITUAZOBIETT_STNINISVIL = 20;
  private static int PFL_SITUAZOBIETT_CONSOLILABEL = 21;
  private static int PFL_SITUAZOBIETT_SVILUPPLABEL = 22;
  private static int PFL_SITUAZOBIETT_VARINICONS = 23;
  private static int PFL_SITUAZOBIETT_VARINISVIL = 24;
  private static int PFL_SITUAZOBIETT_RICHDEFICONS = 25;
  private static int PFL_SITUAZOBIETT_RICHDEFISVIL = 26;
  private static int PFL_SITUAZOBIETT_VARDEFCONS = 27;
  private static int PFL_SITUAZOBIETT_VARDEFSVIL = 28;
  private static int PFL_SITUAZOBIETT_STANZIATTUA1 = 29;
  private static int PFL_SITUAZOBIETT_STANZIATTUA2 = 30;
  private static int PFL_SITUAZOBIETT_VARPROVCONS = 31;
  private static int PFL_SITUAZOBIETT_VARPROVSVIL = 32;
  private static int PFL_SITUAZOBIETT_STANZIPROVV1 = 33;
  private static int PFL_SITUAZOBIETT_STANZIPROVV2 = 34;
  private static int PFL_SITUAZOBIETT_IMPCONS = 35;
  private static int PFL_SITUAZOBIETT_IMPSVIL = 36;
  private static int PFL_SITUAZOBIETT_DISPCONS = 37;
  private static int PFL_SITUAZOBIETT_DISPSVIL = 38;
  private static int PFL_SITUAZOBIETT_OBIETTIVO = 39;
  private static int PFL_SITUAZOBIETT_INFOLABEL = 40;
  private static int PFL_SITUAZOBIETT_VARIAZPROPOS = 41;
  private static int PFL_SITUAZOBIETT_VARPROPOCONS = 42;
  private static int PFL_SITUAZOBIETT_VARPROPOSVIL = 43;
  private static int PFL_SITUAZOBIETT_STANZCONPROP = 44;
  private static int PFL_SITUAZOBIETT_STANCONPROP1 = 45;
  private static int PFL_SITUAZOBIETT_STANCONPROP2 = 46;
  private static int PFL_SITUAZOBIETT_DISPONPROVVI = 47;
  private static int PFL_SITUAZOBIETT_DISPONPROVV1 = 48;
  private static int PFL_SITUAZOBIETT_DISPONPROVV2 = 49;
  private static int PFL_SITUAZOBIETT_DISPOCONPROP = 50;
  private static int PFL_SITUAZOBIETT_DISPCONPROP1 = 51;
  private static int PFL_SITUAZOBIETT_DISPCONPROP2 = 52;

  private static int PPQRY_POLDETSTNPR3 = 0;

  private static int PPQRY_POLVOCIPEG = 1;
  private static int PPQRY_PROGETTI = 2;
  private static int PPQRY_OBIETTIVO = 3;


  IDPanel PAN_SITUAZOBIETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO31(IMDB);
    Init_TBL_PARAMETRI406(IMDB);
    //
    //
    Init_PQRY_POLDETSTNPR3(IMDB);
    Init_PQRY_FILTRO22(IMDB);
    Init_PQRY_FILTRO22_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FILTRO31, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_FILTRO31, "TBL_FILTRO31");
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRO31,IMDBDef4.FLD_FILTRO31_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRO31,IMDBDef4.FLD_FILTRO31_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FILTRO31, 0);
  }

  private static void Init_TBL_PARAMETRI406(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI406, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI406, "TBL_PARAMETRI406");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMEPROID, "ROWNAMEPROID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMEPROID,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMGESIMP, "ROWNAMGESIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMGESIMP,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMSCOBID, "ROWNAMSCOBID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMSCOBID,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI406,IMDBDef4.FLD_PARAMETRI406_ROWNAMEARTIC,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI406, 0);
  }

  private static void Init_PQRY_POLDETSTNPR3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLDETSTNPR3, 46);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLDETSTNPR3, "PQRY_POLDETSTNPR3");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VOCE_PEG_ID, "VOCE_PEG_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VOCE_PEG_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_STN_INI, "STN_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_STN_INI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI, "VAR_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECORICHDEFI, "RECORICHDEFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECORICHDEFI,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF, "VAR_DEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANATTU, "RECOSTANATTU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANATTU,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROV, "VAR_PROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROV,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANPROV, "RECOSTANPROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANPROV,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMPEGNABILE_INI, "IMPEGNABILE_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMPEGNABILE_INI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI_IMPEGNABILE, "VAR_INI_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI_IMPEGNABILE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECRICDEFIMP, "RECRICDEFIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECRICDEFIMP,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF_IMPEGNABILE, "VAR_DEF_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF_IMPEGNABILE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOIMPEATTU, "RECOIMPEATTU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOIMPEATTU,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMP_ACC, "IMP_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_DISP, "DISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_DISP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_STN_INI_CONS, "STN_INI_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_STN_INI_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_STN_INI_SVIL, "STN_INI_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_STN_INI_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI_CONS, "VAR_INI_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI_SVIL, "VAR_INI_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_INI_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECRICDEFCON, "RECRICDEFCON");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECRICDEFCON,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECRICDEFSVI, "RECRICDEFSVI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECRICDEFSVI,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF_CONS, "VAR_DEF_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF_SVIL, "VAR_DEF_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_DEF_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANATT1, "RECOSTANATT1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANATT1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANATT2, "RECOSTANATT2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANATT2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROV_CONS, "VAR_PROV_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROV_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROV_SVIL, "VAR_PROV_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROV_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANPRO1, "RECOSTANPRO1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANPRO1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANPRO2, "RECOSTANPRO2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECOSTANPRO2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMP_CONS, "IMP_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMP_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMP_SVIL, "IMP_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_IMP_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_DISP_CONS, "DISP_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_DISP_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_DISP_SVIL, "DISP_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_DISP_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROPOSTE, "VAR_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROPOSTE,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROPOSTE_CONS, "VAR_PROPOSTE_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROPOSTE_CONS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROPOSTE_SVIL, "VAR_PROPOSTE_SVIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_VAR_PROPOSTE_SVIL,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECSTACONPRO, "RECSTACONPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECSTACONPRO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECSTACONPR1, "RECSTACONPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECSTACONPR1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECSTACONPR2, "RECSTACONPR2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECSTACONPR2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECODISPPROV, "RECODISPPROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECODISPPROV,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECODISPPRO1, "RECODISPPRO1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECODISPPRO1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECODISPPRO2, "RECODISPPRO2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECODISPPRO2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECDISCONPRO, "RECDISCONPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECDISCONPRO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECDISCONPR1, "RECDISCONPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECDISCONPR1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECDISCONPR2, "RECDISCONPR2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLDETSTNPR3,IMDBDef12.PQSL_POLDETSTNPR3_RECDISCONPR2,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLDETSTNPR3, 0);
  }

  private static void Init_PQRY_FILTRO22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO22, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO22, "PQRY_FILTRO22");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO22,IMDBDef12.PQSL_FILTRO22_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO22,IMDBDef12.PQSL_FILTRO22_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO22, 0);
  }

  private static void Init_PQRY_FILTRO22_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO22_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO22_RS, "PQRY_FILTRO22_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO22_RS,IMDBDef12.PQSL_FILTRO22_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO22_RS,IMDBDef12.PQSL_FILTRO22_ROWNAMEESERC,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneObiettivoVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneObiettivoVariazioni()
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
    FormIdx = MyGlb.FRM_SITUOBIEVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A24DA3A6-0E47-4F49-9C65-BCAF35DA1AA1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 764;
    DesignHeight = 678;
    set_Caption(new IDVariant("Situazione Obiettivo Variazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 764;
    Frames[1].Height = 652;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0797546;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 764;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3BBC8350-5A5A-4083-98E1-8C40BA547B70");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Width = 764;
    Frames[3].Height = 600;
    Frames[3].Caption = "Situazione Obiettivo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 600;
    PAN_SITUAZOBIETT = new IDPanel(w, this, 3, "PAN_SITUAZOBIETT");
    Frames[3].Content = PAN_SITUAZOBIETT;
    PAN_SITUAZOBIETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZOBIETT.VS = MainFrm.VisualStyleList;
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "08F4CAEE-A6B4-41CD-8ABB-C1756ED14656");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4760, 200, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZOBIETT.InitStatus = 2;
    PAN_SITUAZOBIETT_Init();
    PAN_SITUAZOBIETT_InitFields();
    PAN_SITUAZOBIETT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_FILTRO31, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUOBIEVARI_FILTRO22();
      }
      PAN_SITUAZOBIETT.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneObiettivoVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneObiettivoVariazioni.class.getName() : (Glb.ClassWithPackage(SituazioneObiettivoVariazioni.class) ? SituazioneObiettivoVariazioni.class.getName().substring(SituazioneObiettivoVariazioni.class.getPackage().getName().length() + 1) : SituazioneObiettivoVariazioni.class.getName()));
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
    IDVariant v_TEMP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      v_TEMP = (new IDVariant("obiettivi_attiva"));
      IMDB.set_Value(IMDBDef4.TBL_FILTRO31, IMDBDef4.FLD_FILTRO31_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI406, IMDBDef4.FLD_PARAMETRI406_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.set_Header(Glb.OBJ_FIELD,PFL_SITUAZOBIETT_IMPEGNATO, (new IDVariant("Accertato")).stringValue());
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI406, IMDBDef4.FLD_PARAMETRI406_ROWNAMGESIMP, 0, new IDVariant(v_GESTIMP));
      if (v_GESTIMP.equals((new IDVariant()), true))
      {
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneObiettivoVariazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Obiettivo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZOBIETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SITUAZOBIETT);
      // 
      // Situazione Obiettivo On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SITUAZOBIETT.set_ToolTip(Glb.OBJ_FIELD,PFL_SITUAZOBIETT_VOCEPEG,(new IDVariant(PAN_SITUAZOBIETT.FieldText(PFL_SITUAZOBIETT_VOCEPEG))).stringValue()); 
      PAN_SITUAZOBIETT.set_ToolTip(Glb.OBJ_FIELD,PFL_SITUAZOBIETT_PROGETTO,(new IDVariant(PAN_SITUAZOBIETT.FieldText(PFL_SITUAZOBIETT_PROGETTO))).stringValue()); 
      PAN_SITUAZOBIETT.set_ToolTip(Glb.OBJ_FIELD,PFL_SITUAZOBIETT_OBIETTIVO,(new IDVariant(PAN_SITUAZOBIETT.FieldText(PFL_SITUAZOBIETT_OBIETTIVO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneObiettivoVariazioni", "SituazioneObiettivoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Obiettivo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SITUAZOBIETT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Situazione Obiettivo After Find Event Body
      // Procedure Body
      // 
      PAN_SITUAZOBIETT.set_FieldText(PFL_SITUAZOBIETT_INFOLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Voce P.e.g.")), (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant(PAN_SITUAZOBIETT.FieldText(PFL_SITUAZOBIETT_VOCEPEG)))), (new IDVariant(" - "))), (new IDVariant("Progetto"))), (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant(PAN_SITUAZOBIETT.FieldText(PFL_SITUAZOBIETT_PROGETTO)))), (new IDVariant(" - "))), (new IDVariant("Obiettivo"))), (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant(PAN_SITUAZOBIETT.FieldText(PFL_SITUAZOBIETT_OBIETTIVO)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneObiettivoVariazioni", "SituazioneObiettivoAfterFindEvent", _e);
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
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO22, IMDBDef12.PQSL_FILTRO22_ROWNAMEESERC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>0)
      {
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (IMDB.Value(IMDBDef4.TBL_PARAMETRI406, IMDBDef4.FLD_PARAMETRI406_ROWNAMGESIMP, 0).compareTo((new IDVariant()), true)!=0)
        {
          PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SITUAZOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_FILTRO22, IMDBDef12.PQSL_FILTRO22_ROWNAMEESERC, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_FILTRO31, IMDBDef4.FLD_FILTRO31_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneObiettivoVariazioni", "FiltroOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void SITUOBIEVARI_FILTRO22() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_FILTRO22_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO31, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FILTRO31, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO22_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_FILTRO22_RS, 0, IMDBDef4.TBL_FILTRO31, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_FILTRO22_RS, 0, 0, IMDBDef4.TBL_FILTRO31, IMDBDef4.FLD_FILTRO31_ROWNAMEESERC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FILTRO31, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FILTRO31, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO31, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_FILTRO22_RS, 0);
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
  private void PAN_SITUAZOBIETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZOBIETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZOBIETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZOBIETT, Cancel);
    // Stub
  }

  private void PAN_SITUAZOBIETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SITUAZOBIETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZOBIETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZOBIETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITUAZOBIETT_Init()
  {

    PAN_SITUAZOBIETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZOBIETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITUAZOBIETT.SetSize(MyGlb.OBJ_FIELD, 53);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, "B38EE6AB-8669-450E-BAED-9A53ED0C4B52");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, "VOCE PEG ID");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.VIS_NORMFIELPADR);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, "74ABBF32-68AF-465B-85B9-8B279CCFD0F8");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, "PROGETTO ID");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, "2E786DD4-AB05-42A5-BE6C-C150139A42FA");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, "Voce P.e.g.");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.VIS_VISULOOUPCF4);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, "59F54A9D-E02F-459D-8F28-B2C46B7FA1D5");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, "Progetto");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, "5AE10977-87F3-483C-AED7-2E951AB0EAB3");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, "Richiesta Iniziale");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, "86F724F1-68AF-43FC-8C56-B9AAC797C0B2");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, "Variazioni Iniziali");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, "DD71B08C-FD0E-4706-811A-CD53ADC1AFBF");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, "Richiesta Definitiva");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, "DBDA7997-DCD5-42AD-B6B6-00D39BCCEB1A");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, "Variazioni Definitive");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, "607BA2AB-477A-469C-BBE0-0BCD85C769BB");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, "Stanziamento Attuale");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, "POL DETTAGLIO STN OB STN INI + POL DETTAGLIO STN OB VAR INI + POL DETTAGLIO STN OB VAR DEF");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, "9A3849A7-0003-4AC1-A56B-C4048D343C52");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, "Variazioni Provvisorie");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, "82A15079-7ED3-47B1-BE71-0ADD7D295DD3");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, "Stanziamento Provvisorio");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, "POL DETTAGLIO STN OB STN INI + POL DETTAGLIO STN OB VAR INI + POL DETTAGLIO STN OB VAR DEF + POL DETTAGLIO STN OB VAR PROV");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, "FEB4FAD5-152A-4146-8776-5B3503B83736");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, "Richiesta Impegnabile");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, "CB131C10-DBF4-4A36-A266-BF7CA2792DEB");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, "Variazioni Ini. Impegnabile");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, "A83083AC-3D06-4FBC-B67C-C94FA0DBDD92");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, "Richiesta Def. Impegnabile");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, "2EC0EED1-E504-4CEB-BDA8-540FB01520AA");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, "Variazioni Impegnabile");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, "EA17E553-2A2E-46B9-9CFA-5010DDF8B623");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, "Impegnabile Attuale");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, "POL DETTAGLIO STN OB IMPEGNABILE INI + POL DETTAGLIO STN OB VAR INI IMPEGNABILE + POL DETTAGLIO STN OB VAR DEF IMPEGNABILE");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, "43B210B8-6C96-4FAD-88E1-58B7266B4B20");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, "Impegnato");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, "BAA37682-9F65-4645-95BE-B007ECD4C563");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, "Disponibilità");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, "D9AE03E8-9F5D-4F55-A1BD-9A5A8ED7759A");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, "Totale");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, "9DDCAC8F-7009-49A0-B791-6D8E31E78A7A");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, "STN INI CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, "5F61CBFE-B582-4E42-8CE6-2337DFA7A927");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, "STN INI SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, "E09AD5E7-E7B6-40AD-823F-E1C7F22228F5");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, "Consolidato");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, "D4CE1655-905C-4E0E-966C-DF9C04D7FF72");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, "Sviluppo");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, "10453BB5-EE1B-4E38-92BE-11697A97C2C7");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, "VAR INI CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, "3D913DA0-A301-4956-89CE-EBAC1B7FB1D0");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, "VAR INI SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, "A76D8F3E-FDA8-455C-B0A7-5923E56CA373");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, "Richiesta Definitiva Cons");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, "D59B3EE5-C59A-4F7D-BFA2-38BE459F30CE");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, "Richiesta Definitiva Svil");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, "86899B4D-56EC-4E31-8167-F5C034465381");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, "VAR DEF CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, "68111F7C-2970-4031-BF6A-E726FDA27D70");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, "VAR DEF SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, "2CA01F10-D5EA-4010-AF9E-685ED590E486");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, "Stanziamento Attuale 1");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, "CF38B484-50CC-4E2D-9499-F25FA7E583AE");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, "Stanziamento Attuale 2");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, "8CD993E9-9B5A-4FCA-84D6-D483DB52400E");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, "VAR PROV CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, "C2500705-6EA7-4073-A892-33D501FF6742");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, "VAR PROV SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, "31B6D352-E05D-43AC-8CEF-7E96861FAFA5");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, "Stanziamento Provvisorio 1");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, "435F7660-F799-48A8-9FB2-038417389F38");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, "Stanziamento Provvisorio 2");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, "F37174A1-E02F-4CE6-8494-CE3FC528BC95");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, "IMP CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, "2DE57606-B7C2-4D63-9E3F-A28C26A66F78");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, "IMP SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, "2EFC8476-B508-45FF-AAF2-4D5C83B647B4");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, "DISP CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, "39101A1F-1FF7-472E-ABA3-A4274895C7C1");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, "DISP SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, "5FD3808E-2D23-4ADF-BF3B-D4BCB02CDCFA");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, "Obiettivo");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.VIS_VISULOOUPCF4);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, "8DFB3F24-A320-45C8-AF1C-6FA74EC0C07E");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, "721997B2-BFCF-4E4B-B912-736BFF17FCB3");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, "Variazioni Proposte");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, "6EFE3054-4000-443B-A843-BFD2F57E98E7");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, "VAR PROPOSTE CONS");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, "9DB7F3BD-A79E-40B6-B1C0-50BE5188F728");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, "VAR PROPOSTE SVIL");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, "B0EC686E-A331-458C-A439-A7E325017558");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, "Stanziamento con Proposte");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, "");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, "8033E8B5-C21C-4861-AD72-26BA2380B38A");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, "Stanziamento Con Proposte 1");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, "POL DETTAGLIO STN OB STN INI CONS + POL DETTAGLIO STN OB VAR INI CONS + POL DETTAGLIO STN OB VAR DEF CONS + POL DETTAGLIO STN OB VAR PROV CONS + POL DETTAGLIO STN OB VAR PROPOSTE CONS");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, "6E6B2F06-B266-42F0-99F8-FE5414593600");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, "Stanziamento Con Proposte 2");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, "POL DETTAGLIO STN OB STN INI SVIL + POL DETTAGLIO STN OB VAR INI SVIL + POL DETTAGLIO STN OB VAR DEF SVIL + POL DETTAGLIO STN OB VAR PROV SVIL + POL DETTAGLIO STN OB VAR PROPOSTE SVIL");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, "55BC51FF-EEEF-400E-BAC1-CD75AA81B439");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, "Disponibilità Provvisoria");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, "POL DETTAGLIO STN OB DISP + POL DETTAGLIO STN OB VAR PROV");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, "8EEB40B7-E452-4F7F-9DB0-2D6DC5F17EEE");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, "Disponibilità Provvisoria 1");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, "POL DETTAGLIO STN OB DISP CONS + POL DETTAGLIO STN OB VAR PROV CONS");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, "221D1F46-B1AA-4127-9F73-196DAC52E828");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, "Disponibilità Provvisoria 2");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, "POL DETTAGLIO STN OB DISP SVIL + POL DETTAGLIO STN OB VAR PROV SVIL");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, "AE1AB12C-ED43-4101-B95E-E19531FD5D14");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, "Disponibilità Con Proposte");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, "POL DETTAGLIO STN OB DISP + POL DETTAGLIO STN OB VAR PROPOSTE");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, "DFC1C07C-7F72-4E47-9AFE-FF3FDBCDD1F9");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, "Disponibilità Con Proposte 1");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, "POL DETTAGLIO STN OB DISP CONS + POL DETTAGLIO STN OB VAR PROPOSTE CONS");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, "EAFA66AC-9087-4053-B7FB-491CDE544450");
    PAN_SITUAZOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, "Disponibilità Con Proposte 2");
    PAN_SITUAZOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, "POL DETTAGLIO STN OB DISP SVIL + POL DETTAGLIO STN OB VAR PROPOSTE SVIL");
    PAN_SITUAZOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SITUAZOBIETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_LIST, "VOCE PEG ID");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEGID, MyGlb.PANEL_FORM, "VC. PEG ID");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VOCEPEGID, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VOCEPEGID, PPQRY_POLDETSTNPR3, "A.VOCE_PEG_ID", "VOCE_PEG_ID", 3, 10, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_LIST, 72, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTOID, MyGlb.PANEL_FORM, "PROG. ID");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_PROGETTOID, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_PROGETTOID, PPQRY_POLDETSTNPR3, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_LIST, 2);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_LIST, "Voce P.e.g.");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_FORM, 76, 12, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VOCEPEG, MyGlb.PANEL_FORM, "Voce P e g");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VOCEPEG, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VOCEPEG, PPQRY_POLVOCIPEG, "TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' - ' || B.DESCRIZIONE", "POLVOPEVOPEG", 5, 342, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_LIST, 104);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_LIST, 2);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_LIST, "Progetto");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_FORM, 88, 40, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_FORM, 52);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_PROGETTO, MyGlb.PANEL_FORM, "Prog.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_PROGETTO, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_PROGETTO, PPQRY_PROGETTI, "A.PROGETTO_ID || ' - ' || A.DESCRIZIONE", "PROGETPROGET", 5, 112, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_LIST, 48);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_LIST, "Richiesta Iniziale");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_FORM, 60, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_FORM, 88);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEINIZIA, MyGlb.PANEL_FORM, "Rich. Iniziale");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_RICHIEINIZIA, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_RICHIEINIZIA, PPQRY_POLDETSTNPR3, "A.STN_INI", "STN_INI", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_LIST, 48);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_LIST, "Variazioni Iniziali");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_FORM, 60, 100, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_FORM, 88);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZINIZIA, MyGlb.PANEL_FORM, "Variaz. Iniziali");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARIAZINIZIA, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARIAZINIZIA, PPQRY_POLDETSTNPR3, "A.VAR_INI", "VAR_INI", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_LIST, "Richiesta Definitiva");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_FORM, 48, 124, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_FORM, 100);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEDEFINI, MyGlb.PANEL_FORM, "Rich. Definitiva");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_RICHIEDEFINI, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_RICHIEDEFINI, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_RICHIEDEFINI, PPQRY_POLDETSTNPR3, "A.STN_INI + A.VAR_INI", "RECORICHDEFI", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_LIST, "Variazioni Definitive");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_FORM, 44, 148, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_FORM, 104);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZDEFINI, MyGlb.PANEL_FORM, "Variaz. Definitive");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARIAZDEFINI, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARIAZDEFINI, PPQRY_POLDETSTNPR3, "A.VAR_DEF", "VAR_DEF", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_LIST, 112);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_LIST, "Stanziamento Attuale");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_FORM, 36, 172, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_FORM, 112);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUAL, MyGlb.PANEL_FORM, "Stanziam. Attuale");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZIATTUAL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZIATTUAL, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZIATTUAL, PPQRY_POLDETSTNPR3, "A.STN_INI + A.VAR_INI + A.VAR_DEF", "RECOSTANATTU", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_FORM, 36, 196, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_FORM, 112);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROVVI, MyGlb.PANEL_FORM, "Variaz. Provvisorie");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARIAZPROVVI, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARIAZPROVVI, PPQRY_POLDETSTNPR3, "A.VAR_PROV", "VAR_PROV", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_LIST, "Stanziamento Provvisorio");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_FORM, 16, 220, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVVI, MyGlb.PANEL_FORM, "Stanziam. Provvisorio");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZIPROVVI, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZIPROVVI, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZIPROVVI, PPQRY_POLDETSTNPR3, "A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROV", "RECOSTANPROV", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_LIST, "Richiesta Impegnabile");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_FORM, 36, 292, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_FORM, 112);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIEIMPEGN, MyGlb.PANEL_FORM, "Rich. Impegnabile");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_RICHIEIMPEGN, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_RICHIEIMPEGN, PPQRY_POLDETSTNPR3, "A.IMPEGNABILE_INI", "IMPEGNABILE_INI", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_LIST, 116);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_LIST, "Variazioni Ini. Impegnabile");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_FORM, 12, 316, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAINIIMPE, MyGlb.PANEL_FORM, "Variaz. Ini Impegnabile");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARIAINIIMPE, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARIAINIIMPE, PPQRY_POLDETSTNPR3, "A.VAR_INI_IMPEGNABILE", "VAR_INI_IMPEGNABILE", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_LIST, "Richiesta Def. Impegnabile");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_FORM, 12, 340, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHIDEFIMPE, MyGlb.PANEL_FORM, "Rich. Def Impegnabile");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_RICHIDEFIMPE, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_RICHIDEFIMPE, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_RICHIDEFIMPE, PPQRY_POLDETSTNPR3, "A.IMPEGNABILE_INI + A.VAR_INI_IMPEGNABILE", "RECRICDEFIMP", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_LIST, "Variazioni Impegnabile");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_FORM, 32, 364, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZIMPEGN, MyGlb.PANEL_FORM, "Variaz. Impegn.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARIAZIMPEGN, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARIAZIMPEGN, PPQRY_POLDETSTNPR3, "A.VAR_DEF_IMPEGNABILE", "VAR_DEF_IMPEGNABILE", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_LIST, 104);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_LIST, "Impegnabile Attuale");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_FORM, 44, 388, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_FORM, 104);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATTUAL, MyGlb.PANEL_FORM, "Impegn. Attuale");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_IMPEGNATTUAL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_IMPEGNATTUAL, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_IMPEGNATTUAL, PPQRY_POLDETSTNPR3, "A.IMPEGNABILE_INI + A.VAR_INI_IMPEGNABILE + A.VAR_DEF_IMPEGNABILE", "RECOIMPEATTU", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_LIST, "Impegnato");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_FORM, 88, 412, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_FORM, 60);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPEGNATO, MyGlb.PANEL_FORM, "Impeg.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_IMPEGNATO, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_IMPEGNATO, PPQRY_POLDETSTNPR3, "A.IMP_ACC", "IMP_ACC", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, 32);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, 84, 436, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, "Dispon.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPONIBILIT, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPONIBILIT, PPQRY_POLDETSTNPR3, "A.DISP", "DISP", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.PANEL_LIST, 144, 68, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.PANEL_FORM, 152, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_TOTALELABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_TOTALELABEL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_TOTALELABEL, -1, "", "TOTALELABEL", 0, 0, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_LIST, "STN INI CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_FORM, 288, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINICONS, MyGlb.PANEL_FORM, "STN INI CNS.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STNINICONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STNINICONS, PPQRY_POLDETSTNPR3, "A.STN_INI_CONS", "STN_INI_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_LIST, "STN INI SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_FORM, 428, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STNINISVIL, MyGlb.PANEL_FORM, "ST. INI SVL.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STNINISVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STNINISVIL, PPQRY_POLDETSTNPR3, "A.STN_INI_SVIL", "STN_INI_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.PANEL_LIST, 152, 76, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.PANEL_FORM, 288, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_CONSOLILABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_CONSOLILABEL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_CONSOLILABEL, -1, "", "CONSOLILABEL", 0, 0, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.PANEL_LIST, 160, 84, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.PANEL_FORM, 428, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_SVILUPPLABEL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_SVILUPPLABEL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_SVILUPPLABEL, -1, "", "SVILUPPLABEL", 0, 0, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_LIST, "VAR INI CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_FORM, 288, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_FORM, 80);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINICONS, MyGlb.PANEL_FORM, "VAR INI CNS.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARINICONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARINICONS, PPQRY_POLDETSTNPR3, "A.VAR_INI_CONS", "VAR_INI_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_LIST, "VAR INI SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_FORM, 428, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARINISVIL, MyGlb.PANEL_FORM, "VR. INI SVL.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARINISVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARINISVIL, PPQRY_POLDETSTNPR3, "A.VAR_INI_SVIL", "VAR_INI_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_LIST, 128);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_LIST, "Richiesta Definitiva Cons");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_FORM, 288, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFICONS, MyGlb.PANEL_FORM, "Rich. Definitiva Cons");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_RICHDEFICONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_RICHDEFICONS, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_RICHDEFICONS, PPQRY_POLDETSTNPR3, "A.STN_INI_CONS + A.VAR_INI_CONS", "RECRICDEFCON", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_LIST, "Richiesta Definitiva Svil");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_FORM, 428, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_RICHDEFISVIL, MyGlb.PANEL_FORM, "Rich. Definitiva Svil");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_RICHDEFISVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_RICHDEFISVIL, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_RICHDEFISVIL, PPQRY_POLDETSTNPR3, "A.STN_INI_SVIL + A.VAR_INI_SVIL", "RECRICDEFSVI", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_LIST, "VAR DEF CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_FORM, 288, 148, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_FORM, 84);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFCONS, MyGlb.PANEL_FORM, "VAR DEF CONS");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARDEFCONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARDEFCONS, PPQRY_POLDETSTNPR3, "A.VAR_DEF_CONS", "VAR_DEF_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_LIST, "VAR DEF SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_FORM, 428, 148, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARDEFSVIL, MyGlb.PANEL_FORM, "VR. DEF SVL.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARDEFSVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARDEFSVIL, PPQRY_POLDETSTNPR3, "A.VAR_DEF_SVIL", "VAR_DEF_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_LIST, "Stanziamento Attuale 1");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_FORM, 288, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA1, MyGlb.PANEL_FORM, "Stanziam. Attuale 1");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZIATTUA1, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZIATTUA1, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZIATTUA1, PPQRY_POLDETSTNPR3, "A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS", "RECOSTANATT1", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_LIST, "Stanziamento Attuale 2");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_FORM, 428, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIATTUA2, MyGlb.PANEL_FORM, "Stanziam. Attuale 2");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZIATTUA2, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZIATTUA2, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZIATTUA2, PPQRY_POLDETSTNPR3, "A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL", "RECOSTANATT2", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_LIST, "VAR PROV CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_FORM, 288, 196, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_FORM, 92);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVCONS, MyGlb.PANEL_FORM, "VAR PRV. CONS");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARPROVCONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARPROVCONS, PPQRY_POLDETSTNPR3, "A.VAR_PROV_CONS", "VAR_PROV_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_LIST, "VAR PROV SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_FORM, 428, 196, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_FORM, 84);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROVSVIL, MyGlb.PANEL_FORM, "VAR PRV. SVL.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARPROVSVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARPROVSVIL, PPQRY_POLDETSTNPR3, "A.VAR_PROV_SVIL", "VAR_PROV_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_LIST, 140);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 1");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_FORM, 288, 220, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV1, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 1");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZIPROVV1, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZIPROVV1, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZIPROVV1, PPQRY_POLDETSTNPR3, "A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS", "RECOSTANPRO1", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_LIST, 140);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_LIST, "Stanziamento Provvisorio 2");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_FORM, 428, 220, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZIPROVV2, MyGlb.PANEL_FORM, "Stanziam. Provvisorio 2");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZIPROVV2, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZIPROVV2, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZIPROVV2, PPQRY_POLDETSTNPR3, "A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL", "RECOSTANPRO2", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_LIST, "IMP CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_FORM, 288, 412, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_FORM, 60);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPCONS, MyGlb.PANEL_FORM, "IMP CONS");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_IMPCONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_IMPCONS, PPQRY_POLDETSTNPR3, "A.IMP_CONS", "IMP_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_LIST, "IMP SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_FORM, 428, 412, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_FORM, 52);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_IMPSVIL, MyGlb.PANEL_FORM, "IM. SVL.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_IMPSVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_IMPSVIL, PPQRY_POLDETSTNPR3, "A.IMP_SVIL", "IMP_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_LIST, 64);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_LIST, "DISP CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_FORM, 288, 436, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONS, MyGlb.PANEL_FORM, "DSP. CONS");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPCONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPCONS, PPQRY_POLDETSTNPR3, "A.DISP_CONS", "DISP_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_LIST, 56);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_LIST, "DISP SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_FORM, 428, 436, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_FORM, 56);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPSVIL, MyGlb.PANEL_FORM, "DS. SVL.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPSVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPSVIL, PPQRY_POLDETSTNPR3, "A.DISP_SVIL", "DISP_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 108);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 2);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 88, 68, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 52);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, "Obiet.");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_OBIETTIVO, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_OBIETTIVO, PPQRY_OBIETTIVO, "B.CODICE || ' - ' || B.DESCRIZIONE", "ROWNAMEOBIET", 5, 113, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.PANEL_LIST, 8, 8, 544, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.PANEL_FORM, 8, 8, 716, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_INFOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_INFOLABEL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_INFOLABEL, -1, "", "INFOLABEL", 0, 0, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_LIST, "Variazioni Proposte");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_FORM, 48, 244, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_FORM, 100);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARIAZPROPOS, MyGlb.PANEL_FORM, "Variaz. Proposte");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARIAZPROPOS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARIAZPROPOS, PPQRY_POLDETSTNPR3, "A.VAR_PROPOSTE", "VAR_PROPOSTE", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_LIST, 116);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_LIST, "VAR PROPOSTE CONS");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_FORM, 288, 244, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOCONS, MyGlb.PANEL_FORM, "VAR PROP. CONS");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARPROPOCONS, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARPROPOCONS, PPQRY_POLDETSTNPR3, "A.VAR_PROPOSTE_CONS", "VAR_PROPOSTE_CONS", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_LIST, 108);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_LIST, "VAR PROPOSTE SVIL");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_FORM, 428, 244, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_FORM, 108);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_VARPROPOSVIL, MyGlb.PANEL_FORM, "VAR PROP. SVIL");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_VARPROPOSVIL, -1, -1);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_VARPROPOSVIL, PPQRY_POLDETSTNPR3, "A.VAR_PROPOSTE_SVIL", "VAR_PROPOSTE_SVIL", 2, 15, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_LIST, "Stanziamento con Proposte");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_FORM, 4, 268, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_FORM, 144);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANZCONPROP, MyGlb.PANEL_FORM, "Stanziam. con Proposte");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANZCONPROP, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANZCONPROP, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANZCONPROP, PPQRY_POLDETSTNPR3, "A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROPOSTE + A.VAR_PROV", "RECSTACONPRO", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_LIST, "Stanziamento Con Proposte 1");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_FORM, 288, 268, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_FORM, 152);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP1, MyGlb.PANEL_FORM, "Stanziam. Con Proposte 1");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANCONPROP1, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANCONPROP1, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANCONPROP1, PPQRY_POLDETSTNPR3, "A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS + A.VAR_PROPOSTE_CONS", "RECSTACONPR1", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_LIST, "Stanziamento Con Proposte 2");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_FORM, 428, 268, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_FORM, 152);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_STANCONPROP2, MyGlb.PANEL_FORM, "Stanziam. Con Proposte 2");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_STANCONPROP2, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_STANCONPROP2, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_STANCONPROP2, PPQRY_POLDETSTNPR3, "A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL + A.VAR_PROPOSTE_SVIL", "RECSTACONPR2", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_LIST, "Disponibilità Provvisoria");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_FORM, 28, 462, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVVI, MyGlb.PANEL_FORM, "Dispon. Provvisoria");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPONPROVVI, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_DISPONPROVVI, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPONPROVVI, PPQRY_POLDETSTNPR3, "A.DISP + A.VAR_PROV", "RECODISPPROV", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_LIST, "Disponibilità Provvisoria 1");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_FORM, 288, 462, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV1, MyGlb.PANEL_FORM, "Dispon. Provvisoria 1");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPONPROVV1, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_DISPONPROVV1, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPONPROVV1, PPQRY_POLDETSTNPR3, "A.DISP_CONS + A.VAR_PROV_CONS", "RECODISPPRO1", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_LIST, "Disponibilità Provvisoria 2");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_FORM, 428, 462, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPONPROVV2, MyGlb.PANEL_FORM, "Dispon. Provvisoria 2");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPONPROVV2, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_DISPONPROVV2, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPONPROVV2, PPQRY_POLDETSTNPR3, "A.DISP_SVIL + A.VAR_PROV_SVIL", "RECODISPPRO2", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_LIST, "Disponibilità Con Proposte");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_FORM, 16, 486, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPOCONPROP, MyGlb.PANEL_FORM, "Dispon. Con Proposte");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPOCONPROP, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_DISPOCONPROP, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPOCONPROP, PPQRY_POLDETSTNPR3, "A.DISP + A.VAR_PROPOSTE", "RECDISCONPRO", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_LIST, "Disponibilità Con Proposte 1");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_FORM, 288, 486, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_FORM, 144);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP1, MyGlb.PANEL_FORM, "Dispon. Con Proposte 1");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPCONPROP1, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_DISPCONPROP1, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPCONPROP1, PPQRY_POLDETSTNPR3, "A.DISP_CONS + A.VAR_PROPOSTE_CONS", "RECDISCONPR1", 2, 19, 0, -13997);
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_LIST, "Disponibilità Con Proposte 2");
    PAN_SITUAZOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_FORM, 428, 486, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_FORM, 144);
    PAN_SITUAZOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZOBIETT_DISPCONPROP2, MyGlb.PANEL_FORM, "Dispon. Con Proposte 2");
    PAN_SITUAZOBIETT.SetFieldPage(PFL_SITUAZOBIETT_DISPCONPROP2, -1, -1);
    PAN_SITUAZOBIETT.SetFieldUnbound(PFL_SITUAZOBIETT_DISPCONPROP2, true);
    PAN_SITUAZOBIETT.SetFieldPanel(PFL_SITUAZOBIETT_DISPCONPROP2, PPQRY_POLDETSTNPR3, "A.DISP_SVIL + A.VAR_PROPOSTE_SVIL", "RECDISCONPR2", 2, 19, 0, -13997);
  }

  private void PAN_SITUAZOBIETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZOBIETT.SetSize(MyGlb.OBJ_QUERY, 4);
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
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLVOCIPEG, 0, SQL, -1, "");
    PAN_SITUAZOBIETT.SetQueryDB(PPQRY_POLVOCIPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZOBIETT.SetMasterTable(PPQRY_POLVOCIPEG, "POL_VOCI_PEG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID || ' - ' || A.DESCRIZIONE as PROGETPROGET ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    PAN_SITUAZOBIETT.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_SITUAZOBIETT.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZOBIETT.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CODICE || ' - ' || B.DESCRIZIONE as ROWNAMEOBIET ");
    SQL.append("from ");
    SQL.append("  POL_SCHEDE_OBIETTIVO A, ");
    SQL.append("  POL_OBIETTIVI B ");
    SQL.append("where (B.OBIETTIVO_ID = A.OBIETTIVO_ID) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = ~~TBL_PARAMETRI406.ROWNAMSCOBID~~) ");
    SQL.append("and   (A.PROGETTO_ID = ~~TBL_PARAMETRI406.ROWNAMEPROID~~) ");
    PAN_SITUAZOBIETT.SetQuery(PPQRY_OBIETTIVO, 0, SQL, -1, "");
    PAN_SITUAZOBIETT.SetQueryDB(PPQRY_OBIETTIVO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZOBIETT.SetMasterTable(PPQRY_OBIETTIVO, "POL_SCHEDE_OBIETTIVO");
    PAN_SITUAZOBIETT.SetIMDB(IMDB, "PQRY_POLDETSTNPR3", true);
    PAN_SITUAZOBIETT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
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
    SQL.append("  A.STN_INI + A.VAR_INI + A.VAR_DEF + A.VAR_PROPOSTE + A.VAR_PROV as RECSTACONPRO, ");
    SQL.append("  A.STN_INI_CONS + A.VAR_INI_CONS + A.VAR_DEF_CONS + A.VAR_PROV_CONS + A.VAR_PROPOSTE_CONS as RECSTACONPR1, ");
    SQL.append("  A.STN_INI_SVIL + A.VAR_INI_SVIL + A.VAR_DEF_SVIL + A.VAR_PROV_SVIL + A.VAR_PROPOSTE_SVIL as RECSTACONPR2, ");
    SQL.append("  A.DISP + A.VAR_PROV as RECODISPPROV, ");
    SQL.append("  A.DISP_CONS + A.VAR_PROV_CONS as RECODISPPRO1, ");
    SQL.append("  A.DISP_SVIL + A.VAR_PROV_SVIL as RECODISPPRO2, ");
    SQL.append("  A.DISP + A.VAR_PROPOSTE as RECDISCONPRO, ");
    SQL.append("  A.DISP_CONS + A.VAR_PROPOSTE_CONS as RECDISCONPR1, ");
    SQL.append("  A.DISP_SVIL + A.VAR_PROPOSTE_SVIL as RECDISCONPR2 ");
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLDETSTNPR3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_DETTAGLIO_STN_OB A ");
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLDETSTNPR3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~PQRY_FILTRO22.ROWNAMEESERC~~) ");
    SQL.append("and   (A.PROGETTO_ID = ~~TBL_PARAMETRI406.ROWNAMEPROID~~) ");
    SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = ~~TBL_PARAMETRI406.ROWNAMSCOBID~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI406.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI406.ROWNAMEARTIC~~) ");
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLDETSTNPR3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLDETSTNPR3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLDETSTNPR3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZOBIETT.SetQuery(PPQRY_POLDETSTNPR3, 5, SQL, -1, "");
    PAN_SITUAZOBIETT.SetQueryDB(PPQRY_POLDETSTNPR3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZOBIETT.SetMasterTable(0, "POL_DETTAGLIO_STN_OB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZOBIETT.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZOBIETT.iUseListQBE;
      PAN_SITUAZOBIETT.iUseListQBE = 0;
      PAN_SITUAZOBIETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZOBIETT.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZOBIETT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "814776DD-A0B5-44B2-A186-41F067C92A80");
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
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 4, 8, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ESERCIZIO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ESERCIZIO, PPQRY_FILTRO22, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
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
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO22", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO22, IMDBDef12.PQRY_FILTRO22_RS, IMDBDef4.TBL_FILTRO31);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ESERCIZIO, IMDBDef4.FLD_FILTRO31_ROWNAMEESERC);
    PAN_FILTRO.SetMasterTable(0, "FILTRO31");
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
    if (SrcObj == PAN_SITUAZOBIETT) PAN_SITUAZOBIETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZOBIETT) PAN_SITUAZOBIETT_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITUAZOBIETT) PAN_SITUAZOBIETT_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZOBIETT) PAN_SITUAZOBIETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITUAZOBIETT) PAN_SITUAZOBIETT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SITUAZOBIETT) PAN_SITUAZOBIETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
