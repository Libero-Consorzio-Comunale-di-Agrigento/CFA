// **********************************************
// Estrazione Dati Per Corte Dei Conti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioneDatiPerCorteDeiConti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ESDAPECODECO_GESTDELLENTR = 0;
  private static int PFL_ESDAPECODECO_MAGOMIENCOS1 = 1;
  private static int PFL_ESDAPECODECO_ELENDELLRISO = 2;
  private static int PFL_ESDAPECODECO_MAGOMIENCOS2 = 3;
  private static int PFL_ESDAPECODECO_GESTDELLSPES = 4;
  private static int PFL_ESDAPECODECO_MAGOMIENCOS3 = 5;
  private static int PFL_ESDAPECODECO_FUNDELDELREG = 6;
  private static int PFL_ESDAPECODECO_MAGOMIENCOS4 = 7;
  private static int PFL_ESDAPECODECO_CONTCOMEDINT = 8;
  private static int PFL_ESDAPECODECO_MAGOMIENCOSE = 9;
  private static int PFL_ESDAPECODECO_QUAGENRIDEEN = 10;
  private static int PFL_ESDAPECODECO_QUAGENRIDESP = 11;
  private static int PFL_ESDAPECODECO_QUADRISUDIFF = 12;
  private static int PFL_ESDAPECODECO_QUARIAGESCOM = 13;
  private static int PFL_ESDAPECODECO_QUARIAGESFIN = 14;
  private static int PFL_ESDAPECODECO_PARAMEDEFICI = 15;
  private static int PFL_ESDAPECODECO_PROSPDICONCI = 16;
  private static int PFL_ESDAPECODECO_CONTOECONOMI = 17;
  private static int PFL_ESDAPECODECO_PERIODO1 = 18;
  private static int PFL_ESDAPECODECO_CONTODELPATR = 19;
  private static int PFL_ESDAPECODECO_PERIODO = 20;
  private static int PFL_ESDAPECODECO_MONIPATDISTA = 21;
  private static int PFL_ESDAPECODECO_ESERCIZIORIF = 22;
  private static int PFL_ESDAPECODECO_TRIMESTRE1 = 23;
  private static int PFL_ESDAPECODECO_INFOCONTNAZI = 24;
  private static int PFL_ESDAPECODECO_TRIMESTRE = 25;
  private static int PFL_ESDAPECODECO_OK = 26;

  private static int PPQRY_PARAMETRIIN1 = 0;

  private static int PPQRY_CEESALDI1 = 1;
  private static int PPQRY_CEESALDI = 2;


  IDPanel PAN_ESDAPECODECO;

  // Definition of Global Variables
  private IDVariant PRIVOLAFTFIN = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRIIN3(IMDB);
    //
    //
    Init_PQRY_PARAMETRIIN1(IMDB);
    Init_PQRY_PARAMETRIIN1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRIIN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRIIN3, 26);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRIIN3, "TBL_PARAMETRIIN3");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDEEN, "ROWNAMGEDEEN");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDEEN,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMIECS, "RONAMAOMIECS");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMIECS,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMELDERI, "ROWNAMELDERI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMELDERI,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS1, "RONAMAOMECS1");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS1,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDESP, "ROWNAMGEDESP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDESP,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS2, "RONAMAOMECS2");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS2,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAFUDEDERE, "RONAFUDEDERE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAFUDEDERE,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS3, "RONAMAOMECS3");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS3,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONACOCOEDIN, "RONACOCOEDIN");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONACOCOEDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS4, "RONAMAOMECS4");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS4,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDE, "RONAQUGERIDE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDE,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDS, "RONAQUGERIDS");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDS,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMQURIDI, "ROWNAMQURIDI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMQURIDI,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGECO, "RONAQURIGECO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGECO,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGEFI, "RONAQURIGEFI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGEFI,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPARDEF, "ROWNAMPARDEF");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPARDEF,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPRDICO, "ROWNAMPRDICO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPRDICO,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCONECO, "ROWNAMCONECO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCONECO,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCODEPA, "ROWNAMCODEPA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCODEPA,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMOPADIST, "RONAMOPADIST");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_RONAMOPADIST,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMINCONA, "ROWNAMINCONA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMINCONA,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMESERIF,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIME, "ROWNAMETRIME");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIME,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIM1, "ROWNAMETRIM1");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIM1,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERIO, "ROWNAMEPERIO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERIO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERI1, "ROWNAMEPERI1");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIIN3,IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERI1,1,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRIIN3, 0);
  }

  private static void Init_PQRY_PARAMETRIIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRIIN1, 26);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRIIN1, "PQRY_PARAMETRIIN1");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN, "ROWNAMGEDEEN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMIECS, "RONAMAOMIECS");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMIECS,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI, "ROWNAMELDERI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS1, "RONAMAOMECS1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS1,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP, "ROWNAMGEDESP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS2, "RONAMAOMECS2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS2,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE, "RONAFUDEDERE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS3, "RONAMAOMECS3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS3,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN, "RONACOCOEDIN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS4, "RONAMAOMECS4");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS4,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDE, "RONAQUGERIDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDE,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDS, "RONAQUGERIDS");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDS,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMQURIDI, "ROWNAMQURIDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMQURIDI,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGECO, "RONAQURIGECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGECO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGEFI, "RONAQURIGEFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGEFI,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPARDEF, "ROWNAMPARDEF");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPARDEF,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPRDICO, "ROWNAMPRDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPRDICO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO, "ROWNAMCONECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA, "ROWNAMCODEPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST, "RONAMOPADIST");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA, "ROWNAMINCONA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, "ROWNAMETRIME");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1, "ROWNAMETRIM1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERIO, "ROWNAMEPERIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERIO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERI1, "ROWNAMEPERI1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERI1,1,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRIIN1, 0);
  }

  private static void Init_PQRY_PARAMETRIIN1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 26);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRIIN1_RS, "PQRY_PARAMETRIIN1_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN, "ROWNAMGEDEEN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMIECS, "RONAMAOMIECS");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMIECS,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI, "ROWNAMELDERI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS1, "RONAMAOMECS1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS1,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP, "ROWNAMGEDESP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS2, "RONAMAOMECS2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS2,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE, "RONAFUDEDERE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS3, "RONAMAOMECS3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS3,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN, "RONACOCOEDIN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS4, "RONAMAOMECS4");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS4,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDE, "RONAQUGERIDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDE,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDS, "RONAQUGERIDS");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDS,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMQURIDI, "ROWNAMQURIDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMQURIDI,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGECO, "RONAQURIGECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGECO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGEFI, "RONAQURIGEFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGEFI,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPARDEF, "ROWNAMPARDEF");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPARDEF,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPRDICO, "ROWNAMPRDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPRDICO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO, "ROWNAMCONECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA, "ROWNAMCODEPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST, "RONAMOPADIST");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA, "ROWNAMINCONA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, "ROWNAMETRIME");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1, "ROWNAMETRIM1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERIO, "ROWNAMEPERIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERIO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERI1, "ROWNAMEPERI1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRIIN1_RS,IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERI1,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioneDatiPerCorteDeiConti(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioneDatiPerCorteDeiConti()
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
    FormIdx = MyGlb.FRM_ESDAPECODECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A953A1C1-F9C0-47F8-BEA3-16D67F55C7F1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 596;
    DesignHeight = 502;
    set_Caption(new IDVariant("Estrazione Dati Per Corte Dei Conti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 596;
    Frames[1].Height = 476;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Estrazione Dati Per Corte Dei Conti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 476;
    PAN_ESDAPECODECO = new IDPanel(w, this, 1, "PAN_ESDAPECODECO");
    Frames[1].Content = PAN_ESDAPECODECO;
    PAN_ESDAPECODECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESDAPECODECO.VS = MainFrm.VisualStyleList;
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 476-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2A6ABECB-21A2-4445-8529-828782760B66");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 768, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESDAPECODECO.InitStatus = 2;
    PAN_ESDAPECODECO_Init();
    PAN_ESDAPECODECO_InitFields();
    PAN_ESDAPECODECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRIIN3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESDAPECODECO_PARAMETRIIN1();
      }
      PAN_ESDAPECODECO.UpdatePanel(MainFrm);
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
    return (obj instanceof EstrazioneDatiPerCorteDeiConti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioneDatiPerCorteDeiConti.class.getName() : (Glb.ClassWithPackage(EstrazioneDatiPerCorteDeiConti.class) ? EstrazioneDatiPerCorteDeiConti.class.getName().substring(EstrazioneDatiPerCorteDeiConti.class.getPackage().getName().length() + 1) : EstrazioneDatiPerCorteDeiConti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // OK Proc
  // **********************************************************************
  public int OKProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ESER = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DEN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PROV = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CODISTAT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IVA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DELIBERACC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DATADELCC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ABITANTI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SUPERF = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODENTE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // OK Proc Body
      // Procedure Body
      // 
      v_COUNT = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  A.ESERCIZIO as VISXMLDATESE, ");
      SQL.append("  A.DENOMINAZIONE as VISXMLDATDEN, ");
      SQL.append("  A.PROVINCIA as VISXMLDATPRO, ");
      SQL.append("  A.CODICE_ISTAT as VISXMLDACOIS, ");
      SQL.append("  A.PARTITA_IVA as VISXMLDAPAIV, ");
      SQL.append("  A.DELIBERA_CC as VISXMLDADECC, ");
      SQL.append("  A.DATA_DEL_CC as VIXMDADADECC, ");
      SQL.append("  A.ABITANTI as VISXMLDATABI, ");
      SQL.append("  A.SUPERFICIE as VISXMLDATSUP, ");
      SQL.append("  A.CODICE_ENTE as VISXMLDACOEN ");
      SQL.append("from ");
      SQL.append("  VISTA_XML_DATI A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("group by ");
      SQL.append("  A.ESERCIZIO, ");
      SQL.append("  A.DENOMINAZIONE, ");
      SQL.append("  A.PROVINCIA, ");
      SQL.append("  A.CODICE_ISTAT, ");
      SQL.append("  A.PARTITA_IVA, ");
      SQL.append("  A.DELIBERA_CC, ");
      SQL.append("  A.DATA_DEL_CC, ");
      SQL.append("  A.ABITANTI, ");
      SQL.append("  A.SUPERFICIE, ");
      SQL.append("  A.CODICE_ENTE ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_ESER = QV.Get("VISXMLDATESE", IDVariant.INTEGER) ;
        v_DEN = QV.Get("VISXMLDATDEN", IDVariant.STRING) ;
        v_PROV = QV.Get("VISXMLDATPRO", IDVariant.STRING) ;
        v_CODISTAT = QV.Get("VISXMLDACOIS", IDVariant.STRING) ;
        v_IVA = QV.Get("VISXMLDAPAIV", IDVariant.STRING) ;
        v_DELIBERACC = QV.Get("VISXMLDADECC", IDVariant.STRING) ;
        v_DATADELCC = QV.Get("VIXMDADADECC", IDVariant.STRING) ;
        v_ABITANTI = QV.Get("VISXMLDATABI", IDVariant.INTEGER) ;
        v_SUPERF = QV.Get("VISXMLDATSUP", IDVariant.INTEGER) ;
        v_CODENTE = QV.Get("VISXMLDACOEN", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_ESER.equals((new IDVariant()), true) || v_DEN.equals((new IDVariant()), true) || v_PROV.equals((new IDVariant()), true) || v_CODISTAT.equals((new IDVariant()), true) || v_IVA.equals((new IDVariant()), true) || v_DELIBERACC.equals((new IDVariant()), true) || v_DATADELCC.equals((new IDVariant()), true) || v_ABITANTI.equals((new IDVariant()), true) || v_SUPERF.equals((new IDVariant()), true) || v_CODENTE.equals((new IDVariant()), true) || v_COUNT.equals((new IDVariant(0)), true))
      {
        IDVariant v_ERRMSG = new IDVariant(0,IDVariant.STRING);
        v_ERRMSG = (new IDVariant("Errore, Uno dei campi di vista_xml_dati non è valorizzato oppure non esiste il record relativo all'esericizio del Contesto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRMSG); 
      }
      else
      {
        // 
        // --------------------------------------------------
        // ----------------
        // 
        IDVariant v_EMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_EMESSAGE = (new IDVariant("Errore. Il Campo Periodo non può essere nullo.", IDVariant.STRING));
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO, 0).equals((new IDVariant(1)), true))
        // {
          // 
          // Controllo che Periodo non sia Nullo
          // 
          // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERIO, 0).equals((new IDVariant()), true))
          // {
            // MainFrm.set_AlertMessage(v_EMESSAGE); 
            // return 0;
          // }
        // }
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA, 0).equals((new IDVariant(1)), true))
        // {
          // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERI1, 0).equals((new IDVariant()), true))
          // {
            // MainFrm.set_AlertMessage(v_EMESSAGE); 
            // return 0;
          // }
        // }
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST, 0).equals((new IDVariant(1)), true))
        {
          // 
          // Controllo Esercizio indicato MINORE di quello del Contesto
          // 
          if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>=0)
          {
            IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
            v_ERRORE = (new IDVariant("Errore. L'esercizio di riferimento deve essere minore dell'esercizio del contesto", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERRORE); 
            return 0;
          }
        }
        ERRORMESSAGE = (new IDVariant(""));
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZGESTE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMIECS, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZELR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS1, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZGESTS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS2, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZFDL(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS3, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZCTI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMAOMECS4, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDE, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZQGRE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAQUGERIDS, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZQGRS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMQURIDI, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZQGRD(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGECO, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZQGCO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAQURIGEFI, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZQGFI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        Settaerrormessage();
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPARDEF, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.XMLESTRAZPADF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        Settaerrormessage();
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMPRDICO, 0).equals((new IDVariant(1)), true))
        // {
          // MainFrm.Cf4armDBObject.XMLESTRAZPCON(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        // }
        // Settaerrormessage();
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO, 0).equals((new IDVariant(1)), true))
        // {
          // MainFrm.Cf4armDBObject.XMLESTRAZCONTOECON(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERIO, 0), IDL.ToString(MainFrm.PROGRESESSIO));
        // }
        // Settaerrormessage();
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA, 0).equals((new IDVariant(1)), true))
        // {
          // MainFrm.Cf4armDBObject.XMLESTRAZCONTOPATR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMEPERI1, 0), IDL.ToString(MainFrm.PROGRESESSIO));
        // }
        // Settaerrormessage();
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST, 0).equals((new IDVariant(1)), true))
        // {
          // MainFrm.Cf4armDBObject.XMLESTRAZPS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF, 0), MainFrm.Getdatatrimestre(IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), MainFrm.Getdatatrimestre(IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMESERIF, 0)), IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, 0));
        // }
        // Settaerrormessage();
        // if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA, 0).equals((new IDVariant(1)), true))
        // {
          // MainFrm.Cf4armDBObject.XMLESTRAZPSISTAT(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1, 0));
        // }
        // Settaerrormessage();
        // 
        // -----------------------FINE-----------------------
        // -------
        // 
        if (ERRORMESSAGE.compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(ERRORMESSAGE); 
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Operazione Terminata"))); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "OKProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Proc
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
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settaerrormessage
  // **********************************************************************
  public int Settaerrormessage ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settaerrormessage Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        ERRORMESSAGE = IDL.Add(IDL.Add(ERRORMESSAGE, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "Settaerrormessage", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMESERIF, 0, IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))));
      PRIVOLAFTFIN = (new IDVariant(1));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDEEN, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMELDERI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDESP, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAFUDEDERE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONACOCOEDIN, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDS, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMQURIDI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGECO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGEFI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPARDEF, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPRDICO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCONECO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCODEPA, 0, (new IDVariant(1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "LoadEvent", _e);
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
      PRIVOLAFTFIN = (new IDVariant(1));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMINCONA, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMOPADIST, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCODEPA, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCONECO, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMIECS, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS1, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS2, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS3, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS4, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Estrazione Dati Per Corte Dei Conti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESDAPECODECO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MAXPERIODO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Estrazione Dati Per Corte Dei Conti After Find Event Body
      // Procedure Body
      // 
      if (PRIVOLAFTFIN.equals((new IDVariant(1)), true))
      {
        PRIVOLAFTFIN = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  MAX(A.PERIODO) as MAXCEESALPER ");
        SQL.append("from ");
        SQL.append("  CEE_SALDI A, ");
        SQL.append("  PERIODI B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
        SQL.append("and   (B.PERIODO = A.PERIODO) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_MAXPERIODO = QV.Get("MAXCEESALPER", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERIO, 0, new IDVariant(v_MAXPERIODO));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERI1, 0, new IDVariant(v_MAXPERIODO));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIME, 0, (new IDVariant(1)));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIM1, 0, (new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "EstrazioneDatiPerCorteDeiContiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Estrazione Dati Per Corte Dei Conti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESDAPECODECO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESDAPECODECO);
      // 
      // Estrazione Dati Per Corte Dei Conti On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDEEN, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMIECS, 0, (new IDVariant(0)));
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMELDERI, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS1, 0, (new IDVariant(0)));
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMGEDESP, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS2, 0, (new IDVariant(0)));
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAFUDEDERE, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS3, 0, (new IDVariant(0)));
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONACOCOEDIN, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS4, 0, (new IDVariant(0)));
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCONECO, 0).equals((new IDVariant(0)), true))
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMCODEPA, 0).equals((new IDVariant(0)), true))
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_RONAMOPADIST, 0).equals((new IDVariant(0)), true))
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMINCONA, 0).equals((new IDVariant(0)), true))
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ESDAPECODECO.SetFlags (Glb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "EstrazioneDatiPerCorteDeiContiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Estrazione Dati Per Corte Dei Conti On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESDAPECODECO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_ESDAPECODECO, Cancel);
      // 
      // Estrazione Dati Per Corte Dei Conti On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1, 0).equals((new IDVariant()), true))
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIM1, 0, (new IDVariant(1)));
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, 0).equals((new IDVariant()), true))
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRIIN1, IMDBDef17.PQSL_PARAMETRIIN1_ROWNAMETRIME, 0, (new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneDatiPerCorteDeiConti", "EstrazioneDatiPerCorteDeiContiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri IN
  // Primary record source for panel data
  // **********************************************************************
  private void ESDAPECODECO_PARAMETRIIN1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRIIN1_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRIIN3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRIIN3, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRIIN1_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRIIN1_RS, 0, IMDBDef7.TBL_PARAMETRIIN3, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 0, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDEEN, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 1, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMIECS, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 2, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMELDERI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 3, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS1, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 4, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDESP, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 5, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS2, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 6, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAFUDEDERE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 7, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS3, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 8, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONACOCOEDIN, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 9, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS4, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 10, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 11, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDS, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 12, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMQURIDI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 13, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGECO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 14, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGEFI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 15, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPARDEF, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 16, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPRDICO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 17, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCONECO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 18, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCODEPA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 19, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_RONAMOPADIST, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 20, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMINCONA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 21, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMESERIF, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 22, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIME, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 23, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIM1, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 24, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERIO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRIIN1_RS, 25, 0, IMDBDef7.TBL_PARAMETRIIN3, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERI1, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRIIN3, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRIIN3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRIIN3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRIIN1_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESDAPECODECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESDAPECODECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_ESDAPECODECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESDAPECODECO_OK)
    {
      this.IdxPanelActived = this.PAN_ESDAPECODECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OKProc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESDAPECODECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESDAPECODECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESDAPECODECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESDAPECODECO_Init()
  {

    PAN_ESDAPECODECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESDAPECODECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESDAPECODECO.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, "202CD606-EEAA-4FE9-9FCA-7090986A211B");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, "Gestione Delle Entrate");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, "0CC93F86-C47F-42C4-8EC5-D50B7C9C3A1F");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, "Maggiori O Minori Entrate Con Segno");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, "A36C3226-EA5B-4215-883A-4B3730DC0BEB");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, "Elenco Delle Risorse");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, "8F32A8D8-5CEA-42D2-BFF7-066CFC6D60A2");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, "Maggiori O Minori Entrate Con Segno  ");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, "Brief description of field content.");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, "40C5B89B-37D3-4ECF-8B1E-258E33CED37A");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, "Gestione Delle Spese");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, "7501F9D8-134D-4DBF-B4AC-8D059666E130");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, "Maggiori O Minori Entrate Con Segno   ");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, "D16841A9-5E5C-4EC8-B724-7E0523CA5878");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, "Funzioni Delegate Della Regione");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, "63501ED1-5319-429A-B3D5-1D92EEF6778C");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, "Maggiori O Minori Entrate Con Segno    ");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, "621D8411-B21E-4BAE-85F1-D846BFA7A571");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, "Contributi Comunitari Ed Internazionali");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, "E1AC6D5A-F887-4946-B7B7-A331EF9847DE");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, "Maggiori O Minori Entrate Con Segno     ");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, "6A6CC904-5867-46E4-BA3C-94FCFDB411CC");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, "Quadro Generale Riassuntivo Delle Entrate");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, "EA6B44AE-7768-4534-B56A-884521498FEC");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, "Quadro Generale Riassuntivo Delle Spese");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, "7E38EF3F-2F21-41B0-B75A-B0CE528CC1F9");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, "Quadro Risultati Differenziali");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, "223A2074-3D0E-4D05-8A9C-70839712C22C");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, "Quadro Riassuntivo Gestione Competenza");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, "B55713EE-4FEF-44A2-B349-1CDDF25EF65D");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, "Quadro Riassuntivo Gestione Finanziaria");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, "97120A1D-9876-4CAC-837C-7247EEA86ADF");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, "Parametri Deficitari");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, "52B47AA8-30BE-44D9-BB60-B2241CF98FFC");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, "Prospetto Di Conciliazione");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, "281F0DF2-621E-4FCF-B4D3-C8A1DA9AC0B5");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, "Conto Economico");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, "73891EE4-55D2-4F00-9204-B2AC1D6AD78B");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, "Periodo");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, 0 | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, "A6C06A05-9AD1-4BD8-AF93-904ACC784F7C");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, "Conto Del Patrimonio");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, "A3E07018-A164-45F7-AB55-56D19E766B69");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, "Periodo  ");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, 0 | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, "D5EB5197-0628-4BC3-99A2-C1E9D94F6BCB");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, "Monitoraggio Patto Di Stabilità");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, "F1AA4B12-ED0E-4DE6-B3D2-127C7FB61F8B");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, "Esercizio Rif.");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.VIS_NORMALFIELDS);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, "322FFB5A-D9DA-46AB-AE7C-D74A8F33F3E7");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, "Trimestre");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, "33158E7E-C086-42E9-B611-1DC9A33647D6");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, "Informazioni Contabilità Nazionale");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, "Brief description of field content.");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.VIS_CHECKSTYLE);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, "7AEAC58A-886B-45FE-9AF1-2312F449DF7F");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, "Trimestre  ");
    PAN_ESDAPECODECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, "");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESDAPECODECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, "97928289-8A0E-457B-A920-92469EBB4C4F");
    PAN_ESDAPECODECO.set_Header(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, "OK");
    PAN_ESDAPECODECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.VIS_STATICBUTTON);
    PAN_ESDAPECODECO.SetImage(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, 0, "button1.gif", false);
    PAN_ESDAPECODECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ESDAPECODECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_LIST, 116);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_LIST, "Gst. Dl. Ent.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_FORM, 4, 4, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLENTR, MyGlb.PANEL_FORM, "Gestione Delle Entrate");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_GESTDELLENTR, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_GESTDELLENTR, PPQRY_PARAMETRIIN1, "A.ROWNAMGEDEEN", "ROWNAMGEDEEN", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_GESTDELLENTR, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_GESTDELLENTR, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_LIST, 48, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_LIST, 184);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_LIST, "M. O M. E. C. S.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_FORM, 320, 8, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_FORM, 220);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS1, MyGlb.PANEL_FORM, "Maggiori O Minori Entrate Con Segno");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_MAGOMIENCOS1, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_MAGOMIENCOS1, PPQRY_PARAMETRIIN1, "A.RONAMAOMIECS", "RONAMAOMIECS", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS1, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS1, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_LIST, 96, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_LIST, 104);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_LIST, "Eln. Dl. Ris.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_FORM, 4, 28, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ELENDELLRISO, MyGlb.PANEL_FORM, "Elenco Delle Risorse");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_ELENDELLRISO, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_ELENDELLRISO, PPQRY_PARAMETRIIN1, "A.ROWNAMELDERI", "ROWNAMELDERI", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_ELENDELLRISO, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_ELENDELLRISO, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_LIST, 144, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_LIST, 196);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_LIST, "M. O M. E. C. S.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_FORM, 320, 32, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_FORM, 220);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS2, MyGlb.PANEL_FORM, "Maggiori O Minori Entrate Con Segno  ");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_MAGOMIENCOS2, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_MAGOMIENCOS2, PPQRY_PARAMETRIIN1, "A.RONAMAOMECS1", "RONAMAOMECS1", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS2, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS2, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_LIST, 192, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_LIST, 108);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_LIST, "Gest. Del. Sp.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_FORM, 4, 52, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_GESTDELLSPES, MyGlb.PANEL_FORM, "Gestione Delle Spese");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_GESTDELLSPES, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_GESTDELLSPES, PPQRY_PARAMETRIIN1, "A.ROWNAMGEDESP", "ROWNAMGEDESP", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_GESTDELLSPES, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_GESTDELLSPES, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_LIST, 240, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_LIST, 196);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_LIST, "M. O M. E. C. S.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_FORM, 320, 56, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_FORM, 220);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS3, MyGlb.PANEL_FORM, "Maggiori O Minori Entrate Con Segno   ");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_MAGOMIENCOS3, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_MAGOMIENCOS3, PPQRY_PARAMETRIIN1, "A.RONAMAOMECS2", "RONAMAOMECS2", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS3, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS3, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_LIST, 288, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_LIST, 164);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_LIST, "Fn. Del. D. Rg.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_FORM, 4, 76, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_FUNDELDELREG, MyGlb.PANEL_FORM, "Funzioni Delegate Della Regione");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_FUNDELDELREG, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_FUNDELDELREG, PPQRY_PARAMETRIIN1, "A.RONAFUDEDERE", "RONAFUDEDERE", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_FUNDELDELREG, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_FUNDELDELREG, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_LIST, 336, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_LIST, 196);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_LIST, "M. O M. E. C. S.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_FORM, 320, 80, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_FORM, 220);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOS4, MyGlb.PANEL_FORM, "Maggiori O Minori Entrate Con Segno    ");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_MAGOMIENCOS4, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_MAGOMIENCOS4, PPQRY_PARAMETRIIN1, "A.RONAMAOMECS3", "RONAMAOMECS3", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS4, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOS4, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_LIST, 384, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_LIST, 192);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_LIST, "Cn. Cm. E. Int.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_FORM, 4, 100, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTCOMEDINT, MyGlb.PANEL_FORM, "Contributi Comunitari Ed Internazionali");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_CONTCOMEDINT, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_CONTCOMEDINT, PPQRY_PARAMETRIIN1, "A.RONACOCOEDIN", "RONACOCOEDIN", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_CONTCOMEDINT, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_CONTCOMEDINT, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_LIST, 432, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_LIST, 196);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_LIST, "M. O M. E. C. S.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_FORM, 320, 104, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_FORM, 220);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MAGOMIENCOSE, MyGlb.PANEL_FORM, "Maggiori O Minori Entrate Con Segno");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_MAGOMIENCOSE, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_MAGOMIENCOSE, PPQRY_PARAMETRIIN1, "A.RONAMAOMECS4", "RONAMAOMECS4", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOSE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MAGOMIENCOSE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_LIST, 480, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_LIST, 216);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_LIST, "Q. G. R. D. E.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_FORM, 4, 124, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDEEN, MyGlb.PANEL_FORM, "Quadro Generale Riassuntivo Delle Entrate");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_QUAGENRIDEEN, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_QUAGENRIDEEN, PPQRY_PARAMETRIIN1, "A.RONAQUGERIDE", "RONAQUGERIDE", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUAGENRIDEEN, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUAGENRIDEEN, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_LIST, 528, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_LIST, 208);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_LIST, "Q. G. R. D. S.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_FORM, 4, 148, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUAGENRIDESP, MyGlb.PANEL_FORM, "Quadro Generale Riassuntivo Delle Spese");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_QUAGENRIDESP, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_QUAGENRIDESP, PPQRY_PARAMETRIIN1, "A.RONAQUGERIDS", "RONAQUGERIDS", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUAGENRIDESP, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUAGENRIDESP, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_LIST, 576, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_LIST, 144);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_LIST, "Qd. Ris. Differ.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_FORM, 4, 172, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUADRISUDIFF, MyGlb.PANEL_FORM, "Quadro Risultati Differenziali");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_QUADRISUDIFF, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_QUADRISUDIFF, PPQRY_PARAMETRIIN1, "A.ROWNAMQURIDI", "ROWNAMQURIDI", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUADRISUDIFF, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUADRISUDIFF, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_LIST, 624, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_LIST, 212);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_LIST, "Q. Rs. Gs. Cm.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_FORM, 4, 196, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESCOM, MyGlb.PANEL_FORM, "Quadro Riassuntivo Gestione Competenza");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_QUARIAGESCOM, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_QUARIAGESCOM, PPQRY_PARAMETRIIN1, "A.RONAQURIGECO", "RONAQURIGECO", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUARIAGESCOM, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUARIAGESCOM, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_LIST, 672, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_LIST, 204);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_LIST, "Qd. Rs. Gs. Fin.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_FORM, 4, 220, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_QUARIAGESFIN, MyGlb.PANEL_FORM, "Quadro Riassuntivo Gestione Finanziaria");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_QUARIAGESFIN, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_QUARIAGESFIN, PPQRY_PARAMETRIIN1, "A.RONAQURIGEFI", "RONAQURIGEFI", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUARIAGESFIN, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_QUARIAGESFIN, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_LIST, 720, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_LIST, 100);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_LIST, "Param. Defic.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_FORM, 4, 244, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PARAMEDEFICI, MyGlb.PANEL_FORM, "Parametri Deficitari");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_PARAMEDEFICI, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_PARAMEDEFICI, PPQRY_PARAMETRIIN1, "A.ROWNAMPARDEF", "ROWNAMPARDEF", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_PARAMEDEFICI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_PARAMEDEFICI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_LIST, 768, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_LIST, 132);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_LIST, "Pros. Di Concil.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_FORM, 4, 268, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PROSPDICONCI, MyGlb.PANEL_FORM, "Prospetto Di Conciliazione");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_PROSPDICONCI, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_PROSPDICONCI, PPQRY_PARAMETRIIN1, "A.ROWNAMPRDICO", "ROWNAMPRDICO", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_PROSPDICONCI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_PROSPDICONCI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_LIST, 816, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_LIST, 92);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_LIST, "Con. Econ.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_FORM, 4, 292, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTOECONOMI, MyGlb.PANEL_FORM, "Conto Economico");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_CONTOECONOMI, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_CONTOECONOMI, PPQRY_PARAMETRIIN1, "A.ROWNAMCONECO", "ROWNAMCONECO", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_CONTOECONOMI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_CONTOECONOMI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_LIST, 44);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_LIST, "Periodo");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_FORM, 332, 292, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_FORM, 56);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO1, MyGlb.PANEL_FORM, "Periodo");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_PERIODO1, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_PERIODO1, PPQRY_PARAMETRIIN1, "A.ROWNAMEPERIO", "ROWNAMEPERIO", 1, 2, 0, -13997);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_LIST, 864, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_LIST, 108);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_LIST, "Con. Del Ptr.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_FORM, 4, 316, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_CONTODELPATR, MyGlb.PANEL_FORM, "Conto Del Patrimonio");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_CONTODELPATR, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_CONTODELPATR, PPQRY_PARAMETRIIN1, "A.ROWNAMCODEPA", "ROWNAMCODEPA", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_CONTODELPATR, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_CONTODELPATR, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_LIST, 56);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_LIST, "Periodo  ");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_FORM, 332, 316, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_FORM, 56);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_PERIODO, MyGlb.PANEL_FORM, "Periodo  ");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_PERIODO, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_PERIODO, PPQRY_PARAMETRIIN1, "A.ROWNAMEPERI1", "ROWNAMEPERI1", 1, 2, 0, -13997);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_LIST, 912, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_LIST, 152);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_LIST, "Mon. P. D. Stb.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_FORM, 4, 340, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_MONIPATDISTA, MyGlb.PANEL_FORM, "Monitoraggio Patto Di Stabilità");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_MONIPATDISTA, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_MONIPATDISTA, PPQRY_PARAMETRIIN1, "A.RONAMOPADIST", "RONAMOPADIST", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MONIPATDISTA, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_MONIPATDISTA, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_LIST, 1008, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_LIST, 108);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_LIST, "Eserc. Rif");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_FORM, 304, 340, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_FORM, 84);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_ESERCIZIORIF, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_ESERCIZIORIF, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_ESERCIZIORIF, PPQRY_PARAMETRIIN1, "A.ROWNAMESERIF", "ROWNAMESERIF", 1, 4, 0, -13997);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_LIST, 1048, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_LIST, 56);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_LIST, "Trim.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_FORM, 452, 340, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_FORM, 64);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE1, MyGlb.PANEL_FORM, "Trimestre");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_TRIMESTRE1, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_TRIMESTRE1, PPQRY_PARAMETRIIN1, "A.ROWNAMETRIME", "ROWNAMETRIME", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE1, (new IDVariant(1)), "1", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE1, (new IDVariant(2)), "2", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE1, (new IDVariant(3)), "3", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE1, (new IDVariant(4)), "4", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_LIST, 960, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_LIST, 172);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_LIST, "Inf. Cnt. Nz.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_FORM, 4, 364, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_FORM, 248);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_INFOCONTNAZI, MyGlb.PANEL_FORM, "Informazioni Contabilità Nazionale");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_INFOCONTNAZI, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_INFOCONTNAZI, PPQRY_PARAMETRIIN1, "A.ROWNAMINCONA", "ROWNAMINCONA", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_INFOCONTNAZI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_INFOCONTNAZI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_LIST, 1088, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_LIST, 64);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_LIST, "Trim.");
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_FORM, 324, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_FORM, 64);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_TRIMESTRE, MyGlb.PANEL_FORM, "Trimestre");
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_TRIMESTRE, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_TRIMESTRE, PPQRY_PARAMETRIIN1, "A.ROWNAMETRIM1", "ROWNAMETRIM1", 1, 1, 0, -13997);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE, (new IDVariant(1)), "1", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE, (new IDVariant(2)), "2", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE, (new IDVariant(3)), "3", "", "", -1);
    PAN_ESDAPECODECO.SetValueListItem(PFL_ESDAPECODECO_TRIMESTRE, (new IDVariant(4)), "4", "", "", -1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.PANEL_LIST, 44, 412, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.PANEL_LIST, 0);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.PANEL_LIST, 1);
    PAN_ESDAPECODECO.SetRect(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.PANEL_FORM, 484, 412, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESDAPECODECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.PANEL_FORM, 0);
    PAN_ESDAPECODECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESDAPECODECO_OK, MyGlb.PANEL_FORM, 1);
    PAN_ESDAPECODECO.SetFieldPage(PFL_ESDAPECODECO_OK, -1, -1);
    PAN_ESDAPECODECO.SetFieldPanel(PFL_ESDAPECODECO_OK, -1, "", "OK", 0, 0, 0, -13997);
  }

  private void PAN_ESDAPECODECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESDAPECODECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PERIODO as CEESALDIPERI, ");
    SQL.append("  B.DESCRIZIONE as CEESALPERDES ");
    SQL.append("from ");
    SQL.append("  CEE_SALDI A, ");
    SQL.append("  PERIODI B ");
    SQL.append("where (A.PERIODO = ~~ROWNAMEPERIO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO AND B.PERIODO = A.PERIODO) ");
    PAN_ESDAPECODECO.SetQuery(PPQRY_CEESALDI1, 0, SQL, PFL_ESDAPECODECO_PERIODO1, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PERIODO as CEESALDIPERI, ");
    SQL.append("  B.DESCRIZIONE as CEESALPERDES ");
    SQL.append("from ");
    SQL.append("  CEE_SALDI A, ");
    SQL.append("  PERIODI B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO AND B.PERIODO = A.PERIODO) ");
    PAN_ESDAPECODECO.SetQuery(PPQRY_CEESALDI1, 1, SQL, PFL_ESDAPECODECO_PERIODO1, "");
    PAN_ESDAPECODECO.SetQueryDB(PPQRY_CEESALDI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PERIODO as CEESALDIPERI, ");
    SQL.append("  B.DESCRIZIONE as CEESALPERDES ");
    SQL.append("from ");
    SQL.append("  CEE_SALDI A, ");
    SQL.append("  PERIODI B ");
    SQL.append("where (A.PERIODO = ~~ROWNAMEPERI1~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO AND B.PERIODO = A.PERIODO) ");
    PAN_ESDAPECODECO.SetQuery(PPQRY_CEESALDI, 0, SQL, PFL_ESDAPECODECO_PERIODO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PERIODO as CEESALDIPERI, ");
    SQL.append("  B.DESCRIZIONE as CEESALPERDES ");
    SQL.append("from ");
    SQL.append("  CEE_SALDI A, ");
    SQL.append("  PERIODI B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO AND B.PERIODO = A.PERIODO) ");
    PAN_ESDAPECODECO.SetQuery(PPQRY_CEESALDI, 1, SQL, PFL_ESDAPECODECO_PERIODO, "");
    PAN_ESDAPECODECO.SetQueryDB(PPQRY_CEESALDI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESDAPECODECO.SetIMDB(IMDB, "PQRY_PARAMETRIIN1", true);
    PAN_ESDAPECODECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ESDAPECODECO.SetQueryIMDB(PPQRY_PARAMETRIIN1, IMDBDef17.PQRY_PARAMETRIIN1_RS, IMDBDef7.TBL_PARAMETRIIN3);
    JustLoaded = true;
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_GESTDELLENTR, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDEEN);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_MAGOMIENCOS1, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMIECS);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_ELENDELLRISO, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMELDERI);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_MAGOMIENCOS2, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS1);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_GESTDELLSPES, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMGEDESP);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_MAGOMIENCOS3, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS2);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_FUNDELDELREG, IMDBDef7.FLD_PARAMETRIIN3_RONAFUDEDERE);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_MAGOMIENCOS4, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS3);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_CONTCOMEDINT, IMDBDef7.FLD_PARAMETRIIN3_RONACOCOEDIN);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_MAGOMIENCOSE, IMDBDef7.FLD_PARAMETRIIN3_RONAMAOMECS4);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_QUAGENRIDEEN, IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDE);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_QUAGENRIDESP, IMDBDef7.FLD_PARAMETRIIN3_RONAQUGERIDS);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_QUADRISUDIFF, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMQURIDI);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_QUARIAGESCOM, IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGECO);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_QUARIAGESFIN, IMDBDef7.FLD_PARAMETRIIN3_RONAQURIGEFI);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_PARAMEDEFICI, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPARDEF);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_PROSPDICONCI, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMPRDICO);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_CONTOECONOMI, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCONECO);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_PERIODO1, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERIO);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_CONTODELPATR, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMCODEPA);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_PERIODO, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMEPERI1);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_MONIPATDISTA, IMDBDef7.FLD_PARAMETRIIN3_RONAMOPADIST);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_ESERCIZIORIF, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMESERIF);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_TRIMESTRE1, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIME);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_INFOCONTNAZI, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMINCONA);
    PAN_ESDAPECODECO.SetFieldPrimaryIndex(PFL_ESDAPECODECO_TRIMESTRE, IMDBDef7.FLD_PARAMETRIIN3_ROWNAMETRIM1);
    PAN_ESDAPECODECO.SetMasterTable(0, "PARAMETRIIN3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESDAPECODECO.Status() == 2)
    {
      int oldListQBE = PAN_ESDAPECODECO.iUseListQBE;
      PAN_ESDAPECODECO.iUseListQBE = 0;
      PAN_ESDAPECODECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESDAPECODECO.PanelCommand(Glb.PCM_FIND);
      PAN_ESDAPECODECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESDAPECODECO) PAN_ESDAPECODECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESDAPECODECO) PAN_ESDAPECODECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESDAPECODECO) PAN_ESDAPECODECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESDAPECODECO) PAN_ESDAPECODECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESDAPECODECO) PAN_ESDAPECODECO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ESDAPECODECO) PAN_ESDAPECODECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
