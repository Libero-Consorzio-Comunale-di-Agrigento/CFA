// **********************************************
// Caricamento Fatture
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CaricamentoFatture extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETERS_DATIDOCUMENT = 0;
  private static int GRP_PARAMETERS_DATILIQUIDAZ = 1;
  private static int GRP_PARAMETERS_PROVVEDIMENT = 2;

  private static int PFL_PARAMETERS_DATAEMISS = 0;
  private static int PFL_PARAMETERS_CATEGORIA = 1;
  private static int PFL_PARAMETERS_DATAPROT = 2;
  private static int PFL_PARAMETERS_DESCRIZIONE1 = 3;
  private static int PFL_PARAMETERS_DATAARRIVO = 4;
  private static int PFL_PARAMETERS_NUMERPROTGEN = 5;
  private static int PFL_PARAMETERS_COMPETENZDA1 = 6;
  private static int PFL_PARAMETERS_AL1 = 7;
  private static int PFL_PARAMETERS_PANNELLO = 8;
  private static int PFL_PARAMETERS_UTENZA = 9;
  private static int PFL_PARAMETERS_EMISSILIQUID = 10;
  private static int PFL_PARAMETERS_SOLOCONTDISP = 11;
  private static int PFL_PARAMETERS_DESCDADETUTE = 12;
  private static int PFL_PARAMETERS_DESCRIZIONE = 13;
  private static int PFL_PARAMETERS_UFFICIO = 14;
  private static int PFL_PARAMETERS_CAUSALE = 15;
  private static int PFL_PARAMETERS_BOLLO = 16;
  private static int PFL_PARAMETERS_INEMISSIONE = 17;
  private static int PFL_PARAMETERS_NUMCONTABILE = 18;
  private static int PFL_PARAMETERS_DATACONTABIL = 19;
  private static int PFL_PARAMETERS_COMPETENZDAL = 20;
  private static int PFL_PARAMETERS_AL = 21;
  private static int PFL_PARAMETERS_DELIBERA = 22;
  private static int PFL_PARAMETERS_NUMERODEL = 23;
  private static int PFL_PARAMETERS_ANNODEL = 24;
  private static int PFL_PARAMETERS_BARRA = 25;
  private static int PFL_PARAMETERS_SLASH = 26;
  private static int PFL_PARAMETERS_SCELTADELIBE = 27;
  private static int PFL_PARAMETERS_INFODELIBERA = 28;
  private static int PFL_PARAMETERS_ELABORA = 29;

  private static int PPQRY_PARAMETERS1 = 0;

  private static int PPQRY_T08 = 1;
  private static int PPQRY_T53 = 2;
  private static int PPQRY_T58 = 3;
  private static int PPQRY_T60 = 4;


  IDPanel PAN_PARAMETERS;
  private static int PFL_WORKEXPORTID_PROGRESSIVO = 0;
  private static int PFL_WORKEXPORTID_FILE = 1;

  private static int PPQRY_WORKEXPORTI2 = 0;


  IDPanel PAN_WORKEXPORTID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETERS(IMDB);
    //
    //
    Init_PQRY_PARAMETERS1(IMDB);
    Init_PQRY_PARAMETERS1_RS(IMDB);
    Init_PQRY_WORKEXPORTI2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETERS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETERS, 28);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETERS, "TBL_PARAMETERS");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATAEMIS,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMECATEGO, "PARAMECATEGO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMECATEGO,5,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATAPROT, "PARADATAPROT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATAPROT,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEDESCRI, "PARAMEDESCRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEDESCRI,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMCOMPDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMCOMPEAL, "PARAMCOMPEAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMCOMPEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAEMISLIQU, "PARAEMISLIQU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAEMISLIQU,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARSOLCONDIS, "PARSOLCONDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARSOLCONDIS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEDESCR1, "PARAMEDESCR1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEDESCR1,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEUFFICI, "PARAMEUFFICI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEUFFICI,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMECAUSAL, "PARAMECAUSAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMECAUSAL,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMETBOLLO, "PARAMETBOLLO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMETBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMNUMCONT, "PARAMNUMCONT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMNUMCONT,5,100,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATACONT, "PARADATACONT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATACONT,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEUTENZA, "PARAMEUTENZA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEUTENZA,5,150,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, "PARACODIUTEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARACODIUTEN,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARDESDADEUT, "PARDESDADEUT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARDESDADEUT,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARACOMPDAL1, "PARACOMPDAL1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARACOMPDAL1,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMCOMPAL1, "PARAMCOMPAL1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMCOMPAL1,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEPERCOR, "PARAMEPERCOR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEPERCOR,9,266,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEBLOBIN, "PARAMEBLOBIN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARAMEBLOBIN,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_progr, "progr");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_progr,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATAARRI, "PARADATAARRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARADATAARRI,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARNUMPROGEN, "PARNUMPROGEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETERS,IMDBDef2.FLD_PARAMETERS_PARNUMPROGEN,1,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETERS, 0);
  }

  private static void Init_PQRY_PARAMETERS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETERS1, 23);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETERS1, "PQRY_PARAMETERS1");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMECATEGO, "PARAMECATEGO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMECATEGO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT, "PARADATAPROT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI, "PARAMEDESCRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPEAL, "PARAMCOMPEAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU, "PARAEMISLIQU");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS, "PARSOLCONDIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, "PARAMEDESCR1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI, "PARAMEUFFICI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL, "PARAMECAUSAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO, "PARAMETBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMCONT, "PARAMNUMCONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMCONT,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATACONT, "PARADATACONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATACONT,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT, "PARDESDADEUT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1, "PARACOMPDAL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1, "PARAMCOMPAL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATAARRI, "PARADATAARRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARADATAARRI,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARNUMPROGEN, "PARNUMPROGEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1,IMDBDef10.PQSL_PARAMETERS1_PARNUMPROGEN,1,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETERS1, 0);
  }

  private static void Init_PQRY_PARAMETERS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETERS1_RS, 23);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETERS1_RS, "PQRY_PARAMETERS1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMECATEGO, "PARAMECATEGO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMECATEGO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT, "PARADATAPROT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI, "PARAMEDESCRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPEAL, "PARAMCOMPEAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU, "PARAEMISLIQU");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS, "PARSOLCONDIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, "PARAMEDESCR1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI, "PARAMEUFFICI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL, "PARAMECAUSAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO, "PARAMETBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMCONT, "PARAMNUMCONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMNUMCONT,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATACONT, "PARADATACONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATACONT,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT, "PARDESDADEUT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1, "PARACOMPDAL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1, "PARAMCOMPAL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1,6,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATAARRI, "PARADATAARRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARADATAARRI,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARNUMPROGEN, "PARNUMPROGEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETERS1_RS,IMDBDef10.PQSL_PARAMETERS1_PARNUMPROGEN,1,10,0);
  }

  private static void Init_PQRY_WORKEXPORTI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WORKEXPORTI2, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_WORKEXPORTI2, "PQRY_WORKEXPORTI2");
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI2,IMDBDef10.PQSL_WORKEXPORTI2_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WORKEXPORTI2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CaricamentoFatture(MyWebEntryPoint w, IMDBObj imdb)
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
  public CaricamentoFatture()
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
    FormIdx = MyGlb.FRM_CARICAFATTUR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D28101D2-2838-4CFC-BACC-723F68E56E5E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 604;
    DesignHeight = 622;
    set_Caption(new IDVariant("Caricamento Fatture"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 604;
    Frames[1].Height = 596;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parameters";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 596;
    PAN_PARAMETERS = new IDPanel(w, this, 1, "PAN_PARAMETERS");
    Frames[1].Content = PAN_PARAMETERS;
    PAN_PARAMETERS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETERS.VS = MainFrm.VisualStyleList;
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 604-MyGlb.PAN_OFFS_X, 596-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0DD3C36A-611A-4031-8CB9-D6369137D07B");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2128, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETERS.InitStatus = 2;
    PAN_PARAMETERS_Init();
    PAN_PARAMETERS_InitFields();
    PAN_PARAMETERS_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_PARAMETERS.SetSubFrame(PFL_PARAMETERS_PANNELLO,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "WORK EXPORT ID";
    Frames[2].Parent = this;
    PAN_WORKEXPORTID = new IDPanel(w, this, 2, "PAN_WORKEXPORTID");
    Frames[2].Content = PAN_WORKEXPORTID;
    PAN_WORKEXPORTID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_WORKEXPORTID.VS = MainFrm.VisualStyleList;
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A7188943-36A1-4D54-9EF7-FEF1C52A74E9");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_WORKEXPORTID.InitStatus = 2;
    PAN_WORKEXPORTID_Init();
    PAN_WORKEXPORTID_InitFields();
    PAN_WORKEXPORTID_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETERS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CARICAFATTUR_PARAMETERS1();
      }
      PAN_PARAMETERS.UpdatePanel(MainFrm);
      PAN_WORKEXPORTID.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETERS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETERS_SCELTADELIBE) {
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
    return (obj instanceof CaricamentoFatture);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CaricamentoFatture.class.getName() : (Glb.ClassWithPackage(CaricamentoFatture.class) ? CaricamentoFatture.class.getName().substring(CaricamentoFatture.class.getPackage().getName().length() + 1) : CaricamentoFatture.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parameters On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETERS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETERS);
      // 
      // Parameters On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0))))
      {
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "ParametersOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parameters On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETERS_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETERS, Cancel);
      // 
      // Parameters On Validate Row Event Body
      // Procedure Body
      // 
      v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0));
      v_ANNODEL = IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0);
      v_NUMERODEL = IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0);
      MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0, new IDVariant(v_SEDEDEL));
      IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0, new IDVariant(v_ANNODEL));
      IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0, new IDVariant(v_NUMERODEL));
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU, 0).equals((new IDVariant("SI")), true))
      {
        AbilitaDisabilita((new IDVariant(-1)));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0)))
          {
            IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI, 0));
          }
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMCONT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATACONT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMINEMISS, 0, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT, 0, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1, 0, (new IDVariant()));
        AbilitaDisabilita((new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "ParametersOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // WORK EXPORT ID After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_WORKEXPORTID_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
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
      // WORK EXPORT ID After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_WORKEXPORTID.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_WORKEXPORTID.GotoFirst();
      while (!PAN_WORKEXPORTID.RSEOF())
      {
        if (IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI2, IMDBDef10.PQSL_WORKEXPORTI2_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),(new IDVariant(MainFrm.RealPath)),IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("temp")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("_"))), IDL.ToString(MainFrm.PROGRESESSIO)), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_progr, 0))));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEPERCOR, 0, new IDVariant(v_PERCORSO));
        }
        PAN_WORKEXPORTID.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEBLOBIN, 0, (new IDVariant("SI")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "WORKEXPORTIDAfterBLOBUpdateEvent", _e);
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
    IDVariant v_UTENZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_BOLLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DATAEMISS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_UTENZA = (new IDVariant("Utenza: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_PARAMETERS.set_FieldText(PFL_PARAMETERS_UTENZA, IDL.Add(v_UTENZA, IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEUTENZA, 0)).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DATA_EMISS_NO_FILE as TIUTDAEMNOFI ");
      SQL.append("from ");
      SQL.append("  TIPI_UTENZA A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DATAEMISS = QV.Get("TIUTDAEMNOFI", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_DATAEMISS.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAEMIS, 0, IDL.Today());
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAPROT, 0, IDL.Today());
      if (MainFrm.MODAIMPUSPES.compareTo((new IDVariant("FA")), true)!=0)
      {
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_AL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAEMISLIQU, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARSOLCONDIS, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARDESDADEUT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMINEMISS, 0, (new IDVariant("NO")));
      v_BOLLO = (new IDVariant());
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMECATEGO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEUFFICI, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMECAUSAL, 0, (new IDVariant(-1)));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINT60CODICE ");
      SQL.append("from ");
      SQL.append("  T60 A ");
      SQL.append("where (A.TIPO = 'F') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_BOLLO = QV.Get("MINT60CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMETBOLLO, 0, IDL.NullValue(v_BOLLO,(new IDVariant(-1))));
      if (MainFrm.MODAIMPUSPES.compareTo((new IDVariant("LI")), true)!=0)
      {
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_progr, 0, PredisposizioneWORDEXPORTID());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "LoadEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parameters: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAEMIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMECATEGO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAPROT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEDESCRI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMCOMPDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMCOMPEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAEMISLIQU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARSOLCONDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMSEDEDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMNUMEDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMANNODEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEDESCR1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEUFFICI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMECAUSAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMETBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMNUMCONT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATACONT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMINEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEUTENZA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARDESDADEUT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACOMPDAL1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMCOMPAL1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEPERCOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEBLOBIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_progr, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAARRI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARNUMPROGEN, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Abilita Disabilita
  // Explain which processing is carried out by this procedure
  // Abilita:  - Input
  // **********************************************************************
  public int AbilitaDisabilita (IDVariant Abilita)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Disabilita Body
      // Procedure Body
      // 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETERS.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, (Abilita.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "AbilitaDisabilita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SceltaDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "SceltaDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "InfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Esegui
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdEsegui ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Esegui Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEBLOBIN, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Manca indicazione del file da caricare", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (PAN_PARAMETERS.bFields(PFL_PARAMETERS_DATAEMISS).IsEnabled(PAN_PARAMETERS.AttR) && IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data Emissione Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (PAN_PARAMETERS.bFields(PFL_PARAMETERS_DATAPROT).IsEnabled(PAN_PARAMETERS.AttR) && IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data Protocollo Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS, 0).equals((new IDVariant("NO")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0)) && IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT, 0).equals((new IDVariant("NO")), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return 0;
          }
          if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0))) && IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT, 0).equals((new IDVariant("SI")), true))
          {
            if (IDL.Length(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0)).compareTo((new IDVariant(99)), true)>0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("La Descrizione non può superare i 99 caratteri", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_SMS); 
              return 0;
            }
          }
        }
      }
      // 
      // controlli sulle date di competenza
      // 
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Date di Competenza non valorizzate.", IDVariant.STRING));
        IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
        v_SMS1 = (new IDVariant("Continuare?", IDVariant.STRING));
        IDVariant v_COMPETENZA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_COMPETENZA1 = new IDVariant(0,IDVariant.INTEGER);
        v_COMPETENZA = (new IDVariant(0));
        v_COMPETENZA1 = (new IDVariant(0));
        if ((PAN_PARAMETERS.bFields(PFL_PARAMETERS_COMPETENZDA1).IsVisible(PAN_PARAMETERS.AttR) && PAN_PARAMETERS.bFields(PFL_PARAMETERS_COMPETENZDA1).IsPresent()))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPEAL, 0)))
          {
            v_COMPETENZA = (new IDVariant(-1));
          }
        }
        if ((PAN_PARAMETERS.bFields(PFL_PARAMETERS_COMPETENZDAL).IsVisible(PAN_PARAMETERS.AttR) && PAN_PARAMETERS.bFields(PFL_PARAMETERS_COMPETENZDAL).IsPresent()))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1, 0)))
          {
            v_COMPETENZA1 = (new IDVariant(-1));
          }
        }
        if (v_COMPETENZA.booleanValue() || v_COMPETENZA1.booleanValue())
        {
          if (!(ControlloNonBloccante(IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), v_SMS1))))
          {
            return 0;
          }
        }
      }
      LeggiRigheDelFile();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "CmdEsegui", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Annulla
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdAnnulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "CmdAnnulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Non Bloccante
  // Explain which processing is carried out by this procedure
  // sms:  - Input
  // **********************************************************************
  public boolean ControlloNonBloccante (IDVariant sms)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Non Bloccante Body
      // Procedure Body
      // 
      v_RET = (new IDVariant(-1));
      if (!(MainFrm.MessageConfirm(sms)))
      {
        v_RET = (new IDVariant(0));
        return v_RET.booleanValue();
      }
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "ControlloNonBloccante", _e);
      return false;
    }
  }

  // **********************************************************************
  // Leggi Righe Del File
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int LeggiRigheDelFile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTROLLOFIL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Leggi Righe Del File Body
      // Procedure Body
      // 
      v_CONTROLLOFIL = (new IDVariant(-1));
      v_FD = MainFrm.VBFile.FreeFile();
      MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEPERCOR, 0), v_FD); 
      MainFrm.Cf4armDBObject.BeginTrans();
      while (!(MainFrm.VBFile.EOF(v_FD)))
      {
        IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CURRNUMBERCH = new IDVariant(0,IDVariant.INTEGER);
        v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
        v_CURRNUMBERCH = IDL.Length(v_CURRLINE);
        // 
        // controllo se il file è vuoto ed eventualmente lo gestisco
        // 
        {
          if (v_CONTROLLOFIL.booleanValue())
          {
            v_CONTROLLOFIL = (new IDVariant(0));
            if (v_CURRNUMBERCH.equals((new IDVariant(0)), true))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Il file è vuoto!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
          }
        }
        if (v_CURRNUMBERCH.compareTo((new IDVariant(0)), true)>0)
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into WRK_UTENZE ");
            SQL.append("( ");
            SQL.append("  SESSIONE, ");
            SQL.append("  PROGRESSIVO, ");
            SQL.append("  DATI ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
            SQL.append("  to_number(NULL), ");
            SQL.append("  " + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e9)
          {
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
      }
      // MainFrm.Cf4armDBObject.CommitTrans();
      MainFrm.VBFile.Close(v_FD); 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (PAN_PARAMETERS.bFields(PFL_PARAMETERS_DATAEMISS).IsEnabled(PAN_PARAMETERS.AttR) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, 0))))
      {
        MainFrm.Cf4armDBObject.CARICAUTENZEGEN(IDL.ToString(MainFrm.PROGRESESSIO), IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0), (new IDVariant("@"))), IDL.ToString(IDL.Day(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, 0)))), (new IDVariant("/"))), IDL.ToString(IDL.Month(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, 0)))), (new IDVariant("/"))), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAEMIS, 0)))));
      }
      else
      {
        MainFrm.Cf4armDBObject.CARICAUTENZEGEN(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      // 
      // caricamento fatture
      // 
      {
        IDVariant v_NFATTURE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NMAX = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMPDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMPA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SUBDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SUBA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_LIQDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_LIQA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANTICIPAZION = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
        v_NFATTURE = (new IDVariant());
        v_NMAX = (new IDVariant());
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CARICAFATPI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0), IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_BENEFICIARIO, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAPROT, 0)), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCRI, 0), IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_NUM_QUIETANZA, 0), ((IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMECATEGO, 0).equals((new IDVariant("-1"))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMECATEGO, 0)), v_NMAX, v_NFATTURE, IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPDAL, 0),IDL.ToDate((new IDVariant(1900)), (new IDVariant(1)), (new IDVariant(1)))), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPEAL, 0),IDL.ToDate((new IDVariant(1900)), (new IDVariant(1)), (new IDVariant(1)))), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATAARRI, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARNUMPROGEN, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU, 0).equals((new IDVariant("NO")), true))
        {
          MainFrm.Cf4armDBObject.CommitTrans();
        }
        else
        {
          v_IMPDA = (new IDVariant());
          v_IMPA = (new IDVariant());
          v_SUBDA = (new IDVariant());
          v_SUBA = (new IDVariant());
          v_LIQDA = (new IDVariant());
          v_LIQA = (new IDVariant());
          v_ANTICIPAZION = (new IDVariant());
          v_FINANZIAMENT = (new IDVariant());
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CARICALIQPI(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0), IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_BENEFICIARIO, 0), ((IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEUFFICI, 0)), ((IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMECAUSAL, 0)), ((IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMETBOLLO, 0)), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMANNODEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMEDEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMSEDEDEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMEDESCR1, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.Today(), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMINEMISS, 0), IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_NUM_QUIETANZA, 0), v_IMPDA, v_IMPA, v_SUBDA, v_SUBA, v_LIQDA, v_LIQA, v_ANTICIPAZION, v_FINANZIAMENT, ((IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS, 0).equals((new IDVariant("NO"))))?(new IDVariant()):(new IDVariant("SI"))), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARACOMPDAL1, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMCOMPAL1, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAMNUMCONT, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARADATACONT, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARDESDADEUT, 0), v_NSUPDISPPURO, (new IDVariant()));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARSOLCONDIS, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  WRK_ERRORI A ");
          SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
            v_CAPTION = (new IDVariant("Anomalie Utenze", IDVariant.STRING));
            MainFrm.Cf4armDBObject.CommitTrans();
            MainFrm.LanciaErrorReport(v_CAPTION, (new IDVariant("NO")));
            return 0;
          }
          else
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Nessuna presenza di anomalie", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            MainFrm.Cf4armDBObject.RollbackTrans();
          }
        }
        else
        {
          IDVariant v_GLOBAL = new IDVariant(0,IDVariant.STRING);
          MainFrm.Cf4armDBObject.CommitTrans();
          if (v_NFATTURE.equals((new IDVariant(0)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Nessuna fattura emessa", IDVariant.STRING));
            v_GLOBAL = IDL.Add(IDL.Add(v_GLOBAL, v_SMS), (new IDVariant("<BR/>")));
          }
          else
          {
            if (v_NFATTURE.equals((new IDVariant(1)), true))
            {
              if (IDL.NullValue(v_NMAX,(new IDVariant(0))).equals((new IDVariant(0)), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Emessa una fattura", IDVariant.STRING));
                v_GLOBAL = IDL.Add(IDL.Add(v_GLOBAL, v_SMS), (new IDVariant("<BR/>")));
              }
              else
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Emessa una fattura con numero protocollo ", IDVariant.STRING));
                v_GLOBAL = IDL.Add(IDL.Add(IDL.Add(v_GLOBAL, v_SMS), IDL.ToString(v_NMAX)), (new IDVariant("<BR/>")));
              }
            }
            else
            {
              if (IDL.NullValue(v_NMAX,(new IDVariant(0))).equals((new IDVariant(0)), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Emesse ", IDVariant.STRING));
                IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
                v_SMS1 = (new IDVariant(" fatture", IDVariant.STRING));
                v_GLOBAL = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_GLOBAL, v_SMS), IDL.ToString(v_NFATTURE)), v_SMS1), (new IDVariant("<BR/>")));
              }
              else
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Emesse ", IDVariant.STRING));
                IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
                v_SMS1 = (new IDVariant(" fatture dal protocollo ", IDVariant.STRING));
                IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
                v_SMS2 = (new IDVariant(" al protocollo ", IDVariant.STRING));
                v_GLOBAL = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_GLOBAL, v_SMS), IDL.ToString(v_NFATTURE)), v_SMS1), IDL.ToString(IDL.Add(IDL.Sub(v_NMAX, v_NFATTURE), (new IDVariant(1))))), v_SMS2), IDL.ToString(v_NMAX)), (new IDVariant("<BR/>")));
              }
            }
          }
          // 
          // gestione liquidazioni
          // 
          {
            IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO1 = (new IDVariant(" ", IDVariant.STRING));
            IDVariant v_MESSAGGIO2 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO2 = (new IDVariant(" ", IDVariant.STRING));
            IDVariant v_SIMP = new IDVariant(0,IDVariant.STRING);
            IDVariant v_SSUB = new IDVariant(0,IDVariant.STRING);
            IDVariant v_SLIQ = new IDVariant(0,IDVariant.STRING);
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Emissione liquidazioni", IDVariant.STRING));
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Impegni emessi: ", IDVariant.STRING));
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Sub-Impegni emessi: ", IDVariant.STRING));
            IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
            v_MSG3 = (new IDVariant("Liquidazioni emesse: ", IDVariant.STRING));
            IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
            v_MESSUPDISPUR = (new IDVariant("Sono stati emessi impegni che superano la disponibilità dello stanziamento puro"));
            if (IMDB.Value(IMDBDef10.PQRY_PARAMETERS1, IMDBDef10.PQSL_PARAMETERS1_PARAEMISLIQU, 0).equals((new IDVariant("SI")), true))
            {
              if (MainFrm.FINANZIAMENT.booleanValue())
              {
                if (v_ANTICIPAZION.compareTo((new IDVariant(0)), true)!=0)
                {
                  IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                  v_SMS = (new IDVariant(" Sono presenti casi di anticipazione sui finanziamenti", IDVariant.STRING));
                  v_MESSAGGIO1 = new IDVariant(v_SMS);
                }
                if (v_FINANZIAMENT.compareTo((new IDVariant(0)), true)!=0)
                {
                  IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                  v_SMS = (new IDVariant(" Sono state emesse liquidazioni senza finanziamento", IDVariant.STRING));
                  v_MESSAGGIO2 = new IDVariant(v_SMS);
                }
              }
              if (v_IMPDA.compareTo(v_IMPA, true)>0)
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("nessuno", IDVariant.STRING));
                v_SIMP = new IDVariant(v_SMS);
              }
              else
              {
                IDVariant v_DAL = new IDVariant(0,IDVariant.STRING);
                v_DAL = (new IDVariant("dal ", IDVariant.STRING));
                IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
                v_AL = (new IDVariant(" al ", IDVariant.STRING));
                v_SIMP = IDL.Add(IDL.Add(IDL.Add(v_DAL, IDL.ToString(v_IMPDA)), v_AL), IDL.ToString(v_IMPA));
              }
              if (v_SUBDA.compareTo(v_SUBA, true)>0)
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("nessuno", IDVariant.STRING));
                v_SSUB = new IDVariant(v_SMS);
              }
              else
              {
                IDVariant v_DAL = new IDVariant(0,IDVariant.STRING);
                v_DAL = (new IDVariant("dal ", IDVariant.STRING));
                IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
                v_AL = (new IDVariant(" al ", IDVariant.STRING));
                v_SSUB = IDL.Add(IDL.Add(IDL.Add(v_DAL, IDL.ToString(v_SUBDA)), v_AL), IDL.ToString(v_SUBA));
              }
              if (v_LIQDA.compareTo(v_LIQA, true)>0)
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("nessuna", IDVariant.STRING));
                v_SLIQ = new IDVariant(v_SMS);
              }
              else
              {
                IDVariant v_DAL = new IDVariant(0,IDVariant.STRING);
                v_DAL = (new IDVariant("dal ", IDVariant.STRING));
                IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
                v_AL = (new IDVariant(" al ", IDVariant.STRING));
                v_SLIQ = IDL.Add(IDL.Add(IDL.Add(v_DAL, IDL.ToString(v_LIQDA)), v_AL), IDL.ToString(v_LIQA));
              }
              v_GLOBAL = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_GLOBAL, v_MSG), (new IDVariant("<BR/>"))), v_MSG1), v_SIMP), (new IDVariant("<BR/>"))), v_MSG2), v_SSUB), (new IDVariant("<BR/>"))), v_MSG3), v_SLIQ), v_MESSAGGIO2), v_MESSAGGIO1), (new IDVariant("<BR/>")));
              if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
              {
                v_GLOBAL = IDL.Add(IDL.Add(v_GLOBAL, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
              }
            }
          }
          MainFrm.set_AlertMessage(v_GLOBAL); 
        }
        // 
        // cancello dalle tabelle temp
        // 
        // {
          // SQL = new StringBuffer();
          // SQL.append("delete from IVA_UTENZE_TMP ");
          // SQL.append("where (SESSIONE_ID = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          // SQL = new StringBuffer();
          // SQL.append("delete from LIQ_UTENZE_TMP ");
          // SQL.append("where (SESSIONE_ID = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          // SQL = new StringBuffer();
          // SQL.append("delete from UTENZE_TMP ");
          // SQL.append("where (SESSIONE_ID = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        // }
        SQL = new StringBuffer();
        SQL.append("update TIPI_UTENZA set ");
        SQL.append("  DATA_ULTIMA_ELAB = TRUNC( SYSDATE ) ");
        SQL.append("where (CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACODIUTEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "LeggiRigheDelFile", _e);
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
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione WORDEXPORTID Body
      // Procedure Body
      // 
      v_IFASE = (new IDVariant("CAR_FAT"));
      v_ISESSIONE = new IDVariant(new IDVariant(MainFrm.PROGRESESSIO),IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO + 1) as MAWOEXIDPRUN ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MAWOEXIDPRUN", IDVariant.INTEGER) ;
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
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFatture", "PredisposizioneWORDEXPORTID", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parameters
  // Primary record source for panel data
  // **********************************************************************
  private void CARICAFATTUR_PARAMETERS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETERS1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETERS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETERS, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETERS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETERS1_RS, 0, IMDBDef2.TBL_PARAMETERS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 0, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAEMIS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 1, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMECATEGO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 2, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAPROT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 3, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEDESCRI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 4, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMCOMPDAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 5, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMCOMPEAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 6, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAEMISLIQU, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 7, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARSOLCONDIS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 8, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMSEDEDEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 9, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMNUMEDEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 10, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMANNODEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 11, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEDESCR1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 12, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMEUFFICI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 13, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMECAUSAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 14, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMETBOLLO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 15, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMNUMCONT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 16, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATACONT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 17, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 18, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARDESDADEUT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 19, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARACOMPDAL1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 20, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARAMCOMPAL1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 21, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARADATAARRI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETERS1_RS, 22, 0, IMDBDef2.TBL_PARAMETERS, IMDBDef2.FLD_PARAMETERS_PARNUMPROGEN, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETERS, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETERS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETERS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETERS1_RS, 0);
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
  private void PAN_PARAMETERS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETERS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAMETERS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETERS_SCELTADELIBE)
    {
      this.IdxPanelActived = this.PAN_PARAMETERS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETERS_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETERS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETERS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETERS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdEsegui();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETERS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETERS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETERS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_WORKEXPORTID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_WORKEXPORTID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_WORKEXPORTID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_WORKEXPORTID, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_WORKEXPORTID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_WORKEXPORTID);
    // Stub
  }

  private void PAN_WORKEXPORTID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_WORKEXPORTID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_WORKEXPORTID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI2, IMDBDef10.PQSL_WORKEXPORTI2_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_WORKEXPORTI2, IMDBDef10.PQSL_WORKEXPORTI2_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_WORKEXPORTID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETERS_Init()
  {

    PAN_PARAMETERS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETERS.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, "F9A682FE-2F05-418C-A498-67553903312E");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, "Dati Documento");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, MyGlb.PANEL_FORM, 8, 143, 572, 121, 0, 0);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, 0, 91);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, 1, 13);
    PAN_PARAMETERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, 0, 4);
    PAN_PARAMETERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, 1, 4);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATIDOCUMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, "CFDEC5AC-B5AF-4D39-9262-88E1E0DAEB70");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, "Dati Liquidazioni");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, MyGlb.PANEL_LIST, 0, -9999, 420, 16, 0, 0);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, MyGlb.PANEL_FORM, 8, 291, 572, 245, 0, 0);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, 0, 92);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, 1, 13);
    PAN_PARAMETERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, 0, 4);
    PAN_PARAMETERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, 1, 4);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETERS_DATILIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, "AC7C4A12-8FEC-47E8-A826-3FB7E17E6400");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, MyGlb.PANEL_FORM, 32, 339, 288, 49, 0, 0);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, 0, 87);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, 1, 13);
    PAN_PARAMETERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, 0, 4);
    PAN_PARAMETERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, 1, 4);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETERS_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETERS.SetSize(MyGlb.OBJ_FIELD, 30);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, "09A56599-2722-4764-80E5-0D98F80E4E1B");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, "Data Emiss");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, "37FCF481-AD6E-416E-AA72-0D03D6251557");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, "Categoria");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, "4852216B-FB0B-40EE-9F9C-D5DBA37F201B");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, "Data Prot");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, "4BA8C251-1EF6-4320-8D0B-72B987FDD606");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, "Descrizione");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, "5BC91537-D15C-4DD3-BF73-1F0DBDA50F6D");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, "Data Arrivo");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, "C608CB92-723D-42F8-BA9E-FE78B46872A5");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, "Num. Protocollo Gen.");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, "0C0F0532-C5AF-42D0-88ED-5800B552173A");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, "Competenza dal");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, "F6CF810E-0EC1-4751-B9B7-0A33F6E27EA9");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, "al");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, "4C9FD56B-F72D-4988-8969-79B34C00B0EC");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, "2D539B1D-2D4D-4A92-94C3-4CE54422E6E5");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, "s");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, "C67C192D-1893-4A03-A6A3-862C33D1E27F");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, "Emissione Liquidazioni");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, "D0E04817-430A-4CEB-ACF7-C38C5B20657C");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, "Solo Controllo Disponibilità");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, "620AB51E-76E0-4F6D-9182-945C92E045FC");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, "Descrizione da Dettagli Utenze");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, "21369724-05E4-4408-B6E6-28C1B89FEFF3");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, "Descrizione ");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, "DBE7E26D-58EE-4F6B-904F-2C8910EE13F6");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, "Ufficio");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, "B94FAA2B-D659-493B-ACD1-14D533232BD6");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, "Causale");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, "9F2D6142-CE9C-4142-AA69-194CFFB2E00B");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, "Bollo");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, "F9259B82-5E11-46E3-93CF-42742C262C0C");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, "In Emissione");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, "004B5E0F-3541-46C7-8EB2-3AAAB4D246E8");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, "Num. Contabile");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, "670FF01B-8E01-4869-87CE-65650894B667");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, "Data Contabile");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, "D3E2C96F-4266-4C02-ACEF-E4A3D754DEC5");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, "Competenza dal ");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, "D9E9436F-4657-4991-AA5C-F2DBA0ADB315");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, "al ");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, "5B74ACA7-F5C7-48A9-BCD2-787A097BC3A6");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, "Delibera");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, "E6423EB2-541D-4219-8702-0994186EC011");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, "Numero Del");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, "C4420F4E-404A-4B8C-8625-13A367116F8B");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, "Anno Del");
    PAN_PARAMETERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, "7361FF83-37C5-400B-831B-9F0A100EDDF1");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, "-");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, "BEF7E4CD-7CE2-4EFA-88FC-524649CD7E75");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, "/");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, "BEB942D2-6CCE-4472-B83B-060247B22545");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETERS.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, 0, "wsearch1.gif", false);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, "E80FE738-CA00-40D7-9900-D991A75D5D4C");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, "");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETERS.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, "40703646-FBAB-4915-8AC2-1877A364EEFC");
    PAN_PARAMETERS.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, "Elabora");
    PAN_PARAMETERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETERS.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETERS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETERS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_LIST, 4, 184, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_LIST, "Data Emiss");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_FORM, 36, 168, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAEMISS, MyGlb.PANEL_FORM, "Data Emiss");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DATAEMISS, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DATAEMISS, PPQRY_PARAMETERS1, "A.PARADATAEMIS", "PARADATAEMIS", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_FORM, 308, 168, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_CATEGORIA, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_CATEGORIA, PPQRY_PARAMETERS1, "A.PARAMECATEGO", "PARAMECATEGO", 5, 6, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_LIST, 4, 208, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_LIST, "Data Prot");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_FORM, 32, 192, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAPROT, MyGlb.PANEL_FORM, "Data Prot");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DATAPROT, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DATAPROT, PPQRY_PARAMETERS1, "A.PARADATAPROT", "PARADATAPROT", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_LIST, 4, 232, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_FORM, 208, 192, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DESCRIZIONE1, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DESCRIZIONE1, PPQRY_PARAMETERS1, "A.PARAMEDESCRI", "PARAMEDESCRI", 5, 250, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_LIST, "Data Arrivo");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_FORM, 36, 216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATAARRIVO, MyGlb.PANEL_FORM, "Data Arrivo");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DATAARRIVO, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DATAARRIVO, PPQRY_PARAMETERS1, "A.PARADATAARRI", "PARADATAARRI", 6, 10, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_LIST, "Num Protoc. Gen");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_FORM, 208, 216, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERPROTGEN, MyGlb.PANEL_FORM, "Num. Protocollo Gen.");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_NUMERPROTGEN, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_NUMERPROTGEN, PPQRY_PARAMETERS1, "A.PARNUMPROGEN", "PARNUMPROGEN", 1, 10, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_LIST, 4, 256, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_FORM, 12, 240, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDA1, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_COMPETENZDA1, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_COMPETENZDA1, PPQRY_PARAMETERS1, "A.PARAMCOMPDAL", "PARAMCOMPDAL", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_LIST, 4, 280, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_LIST, "al");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_FORM, 308, 240, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL1, MyGlb.PANEL_FORM, "al");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_AL1, -1, GRP_PARAMETERS_DATIDOCUMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_AL1, PPQRY_PARAMETERS1, "A.PARAMCOMPEAL", "PARAMCOMPEAL", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.PANEL_LIST, 4, 0, 556, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.PANEL_LIST, 4);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.PANEL_FORM, 4, 32, 552, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_PANNELLO, MyGlb.PANEL_FORM, 8);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_PANNELLO, -1, -1);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_PANNELLO, -1, "", "PANNELLO", 0, 0, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.PANEL_LIST, 12, 0, 544, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.PANEL_FORM, 12, 4, 544, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_UTENZA, -1, -1);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_UTENZA, -1, "", "UTENZA", 0, 0, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_LIST, "Emis. Liq.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_FORM, 16, 268, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_FORM, 140);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_EMISSILIQUID, MyGlb.PANEL_FORM, "Emissione Liquidazioni");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_EMISSILIQUID, -1, -1);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_EMISSILIQUID, PPQRY_PARAMETERS1, "A.PARAEMISLIQU", "PARAEMISLIQU", 5, 2, 0, -13997);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_EMISSILIQUID, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_EMISSILIQUID, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_LIST, 136);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_LIST, "S. Cn. Dsp.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_FORM, 176, 268, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SOLOCONTDISP, MyGlb.PANEL_FORM, "Solo Controllo Disponibilità");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_SOLOCONTDISP, -1, -1);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_SOLOCONTDISP, PPQRY_PARAMETERS1, "A.PARSOLCONDIS", "PARSOLCONDIS", 5, 2, 0, -13997);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_SOLOCONTDISP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_SOLOCONTDISP, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_LIST, 156);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_LIST, "Descr. da Dettagli Utenze");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_FORM, 24, 316, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCDADETUTE, MyGlb.PANEL_FORM, "Descrizione da Dettagli Utenze");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DESCDADETUTE, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DESCDADETUTE, PPQRY_PARAMETERS1, "A.PARDESDADEUT", "PARDESDADEUT", 5, 2, 0, -13997);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_DESCDADETUTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_DESCDADETUTE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione ");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_FORM, 52, 392, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione ");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DESCRIZIONE, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DESCRIZIONE, PPQRY_PARAMETERS1, "A.PARAMEDESCR1", "PARAMEDESCR1", 5, 250, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_FORM, 72, 416, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_UFFICIO, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_UFFICIO, PPQRY_PARAMETERS1, "A.PARAMEUFFICI", "PARAMEUFFICI", 1, 5, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_FORM, 64, 440, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_CAUSALE, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_CAUSALE, PPQRY_PARAMETERS1, "A.PARAMECAUSAL", "PARAMECAUSAL", 1, 4, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_FORM, 80, 464, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_BOLLO, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_BOLLO, PPQRY_PARAMETERS1, "A.PARAMETBOLLO", "PARAMETBOLLO", 1, 2, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_FORM, 372, 464, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_INEMISSIONE, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_INEMISSIONE, PPQRY_PARAMETERS1, "A.PARAMINEMISS", "PARAMINEMISS", 5, 2, 0, -13997);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETERS.SetValueListItem(PFL_PARAMETERS_INEMISSIONE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_LIST, "Num Cont.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_FORM, 12, 488, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMCONTABILE, MyGlb.PANEL_FORM, "Num. Contabile");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_NUMCONTABILE, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_NUMCONTABILE, PPQRY_PARAMETERS1, "A.PARAMNUMCONT", "PARAMNUMCONT", 5, 100, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_LIST, "Data Contabile");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_FORM, 296, 488, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DATACONTABIL, MyGlb.PANEL_FORM, "Data Contabile");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DATACONTABIL, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DATACONTABIL, PPQRY_PARAMETERS1, "A.PARADATACONT", "PARADATACONT", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal ");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_FORM, 20, 512, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal ");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_COMPETENZDAL, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_COMPETENZDAL, PPQRY_PARAMETERS1, "A.PARACOMPDAL1", "PARACOMPDAL1", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_LIST, "al ");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_FORM, 220, 512, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_AL, MyGlb.PANEL_FORM, "al ");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_AL, -1, GRP_PARAMETERS_DATILIQUIDAZ);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_AL, PPQRY_PARAMETERS1, "A.PARAMCOMPAL1", "PARAMCOMPAL1", 6, 49, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_FORM, 36, 364, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_DELIBERA, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_DELIBERA, PPQRY_PARAMETERS1, "A.PARAMSEDEDEL", "PARAMSEDEDEL", 5, 4, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_LIST, "Num. Del");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_FORM, 168, 364, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_NUMERODEL, MyGlb.PANEL_FORM, "Num. Del");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_NUMERODEL, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_NUMERODEL, PPQRY_PARAMETERS1, "A.PARAMNUMEDEL", "PARAMNUMEDEL", 1, 6, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_LIST, "Ann. Del");
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_FORM, 232, 364, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ANNODEL, MyGlb.PANEL_FORM, "Ann. Del");
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_ANNODEL, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_ANNODEL, PPQRY_PARAMETERS1, "A.PARAMANNODEL", "PARAMANNODEL", 1, 4, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.PANEL_LIST, 112, 160, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.PANEL_FORM, 148, 364, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_BARRA, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.PANEL_LIST, 120, 168, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.PANEL_FORM, 216, 364, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_SLASH, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.PANEL_LIST, 184, 144, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.PANEL_FORM, 280, 368, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_SCELTADELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_SCELTADELIBE, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_SCELTADELIBE, -1, "", "SCELTADELIBE", 0, 0, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.PANEL_LIST, 192, 152, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.PANEL_FORM, 300, 368, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_INFODELIBERA, -1, GRP_PARAMETERS_PROVVEDIMENT);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.PANEL_LIST, 280, 484, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETERS.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.PANEL_FORM, 484, 544, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETERS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETERS.SetFieldPage(PFL_PARAMETERS_ELABORA, -1, -1);
    PAN_PARAMETERS.SetFieldPanel(PFL_PARAMETERS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETERS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETERS.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T08CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T08DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T08 A ");
    SQL.append("where (A.CODICE = ~~PARAMECATEGO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMECATEGO~~ = '-1') ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T08, 0, SQL, PFL_PARAMETERS_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T08CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T08DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T08 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T08, 1, SQL, PFL_PARAMETERS_CATEGORIA, "");
    PAN_PARAMETERS.SetQueryDB(PPQRY_T08, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMEUFFICI~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMEUFFICI~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETERS_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETERS_UFFICIO, "");
    PAN_PARAMETERS.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~PARAMECAUSAL~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMECAUSAL~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAMETERS_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAMETERS_CAUSALE, "");
    PAN_PARAMETERS.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~PARAMETBOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMETBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETERS_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETERS.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETERS_BOLLO, "");
    PAN_PARAMETERS.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETERS.SetIMDB(IMDB, "PQRY_PARAMETERS1", true);
    PAN_PARAMETERS.set_SetString(MyGlb.MASTER_ROWNAME, "PARAMETERS");
    PAN_PARAMETERS.SetQueryIMDB(PPQRY_PARAMETERS1, IMDBDef10.PQRY_PARAMETERS1_RS, IMDBDef2.TBL_PARAMETERS);
    JustLoaded = true;
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DATAEMISS, IMDBDef2.FLD_PARAMETERS_PARADATAEMIS);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_CATEGORIA, IMDBDef2.FLD_PARAMETERS_PARAMECATEGO);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DATAPROT, IMDBDef2.FLD_PARAMETERS_PARADATAPROT);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DESCRIZIONE1, IMDBDef2.FLD_PARAMETERS_PARAMEDESCRI);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DATAARRIVO, IMDBDef2.FLD_PARAMETERS_PARADATAARRI);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_NUMERPROTGEN, IMDBDef2.FLD_PARAMETERS_PARNUMPROGEN);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_COMPETENZDA1, IMDBDef2.FLD_PARAMETERS_PARAMCOMPDAL);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_AL1, IMDBDef2.FLD_PARAMETERS_PARAMCOMPEAL);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_EMISSILIQUID, IMDBDef2.FLD_PARAMETERS_PARAEMISLIQU);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_SOLOCONTDISP, IMDBDef2.FLD_PARAMETERS_PARSOLCONDIS);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DESCDADETUTE, IMDBDef2.FLD_PARAMETERS_PARDESDADEUT);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DESCRIZIONE, IMDBDef2.FLD_PARAMETERS_PARAMEDESCR1);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_UFFICIO, IMDBDef2.FLD_PARAMETERS_PARAMEUFFICI);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_CAUSALE, IMDBDef2.FLD_PARAMETERS_PARAMECAUSAL);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_BOLLO, IMDBDef2.FLD_PARAMETERS_PARAMETBOLLO);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_INEMISSIONE, IMDBDef2.FLD_PARAMETERS_PARAMINEMISS);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_NUMCONTABILE, IMDBDef2.FLD_PARAMETERS_PARAMNUMCONT);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DATACONTABIL, IMDBDef2.FLD_PARAMETERS_PARADATACONT);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_COMPETENZDAL, IMDBDef2.FLD_PARAMETERS_PARACOMPDAL1);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_AL, IMDBDef2.FLD_PARAMETERS_PARAMCOMPAL1);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_DELIBERA, IMDBDef2.FLD_PARAMETERS_PARAMSEDEDEL);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_NUMERODEL, IMDBDef2.FLD_PARAMETERS_PARAMNUMEDEL);
    PAN_PARAMETERS.SetFieldPrimaryIndex(PFL_PARAMETERS_ANNODEL, IMDBDef2.FLD_PARAMETERS_PARAMANNODEL);
    PAN_PARAMETERS.SetMasterTable(0, "PARAMETERS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETERS.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETERS.iUseListQBE;
      PAN_PARAMETERS.iUseListQBE = 0;
      PAN_PARAMETERS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETERS.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETERS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_WORKEXPORTID_Init()
  {

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "C6419165-4DE2-47EE-9E0F-61F83BDBBC73");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "PROGRESSIVO");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, "673E6FD2-20C9-4607-9A47-D4B72DAD08A8");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, "File");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.VIS_NORMFIELPADR);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_WORKEXPORTID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 84, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_PROGRESSIVO, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_PROGRESSIVO, PPQRY_WORKEXPORTI2, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, 2);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, "File");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, 4, 4, 500, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, 6);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, "File");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_FILE, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_FILE, PPQRY_WORKEXPORTI2, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
  }

  private void PAN_WORKEXPORTID_InitQueries()
  {
    StringBuffer SQL;

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_WORKEXPORTID.SetIMDB(IMDB, "PQRY_WORKEXPORTI2", true);
    PAN_WORKEXPORTID.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT ID");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMETERS.progr~~) ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI2, 5, SQL, -1, "");
    PAN_WORKEXPORTID.SetQueryDB(PPQRY_WORKEXPORTI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_WORKEXPORTID.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_WORKEXPORTID.Status() == 2)
    {
      int oldListQBE = PAN_WORKEXPORTID.iUseListQBE;
      PAN_WORKEXPORTID.iUseListQBE = 0;
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_SEARCH);
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_FIND);
      PAN_WORKEXPORTID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETERS) PAN_PARAMETERS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETERS) PAN_PARAMETERS_ValidateRow(Cancel);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETERS) PAN_PARAMETERS_DynamicProperties();
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETERS) PAN_PARAMETERS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_PARAMETERS) PAN_PARAMETERS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
