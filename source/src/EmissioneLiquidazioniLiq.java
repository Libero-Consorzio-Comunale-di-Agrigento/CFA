// **********************************************
// Emissione Liquidazioni Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneLiquidazioniLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISSILIQUID_UNALIQUIDPER = 0;
  private static int GRP_EMISSILIQUID_LIQUIDAZIONI = 1;
  private static int GRP_EMISSILIQUID_MANDATINFORM = 2;
  private static int GRP_EMISSILIQUID_CONTADITESOR = 3;

  private static int PFL_EMISSILIQUID_UNIMPELABESX = 0;
  private static int PFL_EMISSILIQUID_UNIMPELABEDX = 1;
  private static int PFL_EMISSILIQUID_UNIMPEGNOPER = 2;
  private static int PFL_EMISSILIQUID_LIQUILABELSX = 3;
  private static int PFL_EMISSILIQUID_DELDAIMPSUIM = 4;
  private static int PFL_EMISSILIQUID_DESDAIMPSUIM = 5;
  private static int PFL_EMISSILIQUID_DELIBERLABEL = 6;
  private static int PFL_EMISSILIQUID_SEDEDEL = 7;
  private static int PFL_EMISSILIQUID_LIQUILABELDX = 8;
  private static int PFL_EMISSILIQUID_TRATTIDELIBE = 9;
  private static int PFL_EMISSILIQUID_NUMERODEL = 10;
  private static int PFL_EMISSILIQUID_BARRADELIBER = 11;
  private static int PFL_EMISSILIQUID_ANNODEL = 12;
  private static int PFL_EMISSILIQUID_SCELDELILABE = 13;
  private static int PFL_EMISSILIQUID_INFODELILABE = 14;
  private static int PFL_EMISSILIQUID_DESCRIGENERI = 15;
  private static int PFL_EMISSILIQUID_CAUSALE = 16;
  private static int PFL_EMISSILIQUID_UFFICIO = 17;
  private static int PFL_EMISSILIQUID_BOLLO = 18;
  private static int PFL_EMISSILIQUID_DATAEMISSION = 19;
  private static int PFL_EMISSILIQUID_INEMISSIONE = 20;
  private static int PFL_EMISSILIQUID_SCADENZABEN = 21;
  private static int PFL_EMISSILIQUID_ALLEGATI = 22;
  private static int PFL_EMISSILIQUID_INFOTESORIER = 23;
  private static int PFL_EMISSILIQUID_APRIALLEGATI = 24;
  private static int PFL_EMISSILIQUID_NOTETESORIER = 25;
  private static int PFL_EMISSILIQUID_SCADENZAMAND = 26;
  private static int PFL_EMISSILIQUID_SPESE = 27;
  private static int PFL_EMISSILIQUID_COMMISSIONI = 28;
  private static int PFL_EMISSILIQUID_NUMERO = 29;
  private static int PFL_EMISSILIQUID_DATA = 30;
  private static int PFL_EMISSILIQUID_CONTABILABEL = 31;
  private static int PFL_EMISSILIQUID_DATULTELALAB = 32;
  private static int PFL_EMISSILIQUID_ELABORALABEL = 33;
  private static int PFL_EMISSILIQUID_DATAULTIELAB = 34;
  private static int PFL_EMISSILIQUID_GRUPPOLABEL = 35;
  private static int PFL_EMISSILIQUID_ETICHEINFOEL = 36;

  private static int PPQRY_PARAMETRI269 = 0;

  private static int PPQRY_T58 = 1;
  private static int PPQRY_T53 = 2;
  private static int PPQRY_T60 = 3;
  private static int PPQRY_T01 = 4;
  private static int PPQRY_TIPISPESMINF = 5;


  IDPanel PAN_EMISSILIQUID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI350(IMDB);
    //
    //
    Init_PQRY_PARAMETRI269(IMDB);
    Init_PQRY_PARAMETRI269_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI350(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI350, 26);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI350, "TBL_PARAMETRI350");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAUNIMPPER, "PARAUNIMPPER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAUNIMPPER,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARDELDAIMSU, "PARDELDAIMSU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARDELDAIMSU,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARDESDAIMSU, "PARDESDAIMSU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARDESDAIMSU,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARADESCGENE, "PARADESCGENE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARADESCGENE,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARATIPOGRUP, "PARATIPOGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARATIPOGRUP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARATIPOSCAD, "PARATIPOSCAD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARATIPOSCAD,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARASCADMAND, "PARASCADMAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARASCADMAND,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMSPESE, "PARAMSPESE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMSPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMCOMMISS, "PARAMCOMMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAMCOMMISS,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE, "PARAQUALNOTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAIMPOFILE, "PARAIMPOFILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI350,IMDBDef5.FLD_PARAMETRI350_PARAIMPOFILE,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI350, 0);
  }

  private static void Init_PQRY_PARAMETRI269(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI269, 21);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI269, "PQRY_PARAMETRI269");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAUNIMPPER, "PARAUNIMPPER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAUNIMPPER,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU, "PARDELDAIMSU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARDESDAIMSU, "PARDESDAIMSU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARDESDAIMSU,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARADESCGENE, "PARADESCGENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARADESCGENE,5,250,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARATIPOSCAD, "PARATIPOSCAD");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARATIPOSCAD,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARASCADMAND, "PARASCADMAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARASCADMAND,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMSPESE, "PARAMSPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMSPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMCOMMISS, "PARAMCOMMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269,IMDBDef14.PQSL_PARAMETRI269_PARAMCOMMISS,1,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI269, 0);
  }

  private static void Init_PQRY_PARAMETRI269_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI269_RS, 21);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI269_RS, "PQRY_PARAMETRI269_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAUNIMPPER, "PARAUNIMPPER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAUNIMPPER,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU, "PARDELDAIMSU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARDESDAIMSU, "PARDESDAIMSU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARDESDAIMSU,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARADESCGENE, "PARADESCGENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARADESCGENE,5,250,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARATIPOSCAD, "PARATIPOSCAD");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARATIPOSCAD,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARASCADMAND, "PARASCADMAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARASCADMAND,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMSPESE, "PARAMSPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMSPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMCOMMISS, "PARAMCOMMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI269_RS,IMDBDef14.PQSL_PARAMETRI269_PARAMCOMMISS,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneLiquidazioniLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneLiquidazioniLiq()
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
    FormIdx = MyGlb.FRM_EMISSLIQULIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B0266F67-3433-4B1C-8D90-E3E4D1799918";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 572;
    DesignHeight = 634;
    set_Caption(new IDVariant("Emissione Liquidazioni Liq"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 572;
    Frames[1].Height = 608;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissioni Liquidazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 608;
    PAN_EMISSILIQUID = new IDPanel(w, this, 1, "PAN_EMISSILIQUID");
    Frames[1].Content = PAN_EMISSILIQUID;
    PAN_EMISSILIQUID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSILIQUID.VS = MainFrm.VisualStyleList;
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 608-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "989B5A9A-1333-46F5-967A-E5CE98699E8F");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2140, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSILIQUID.InitStatus = 2;
    PAN_EMISSILIQUID_Init();
    PAN_EMISSILIQUID_InitFields();
    PAN_EMISSILIQUID_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI350, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSLIQULIQ_PARAMETRI269();
      }
      PAN_EMISSILIQUID.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_EMISSILIQUID.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSILIQUID_SCELDELILABE) {
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
    return (obj instanceof EmissioneLiquidazioniLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneLiquidazioniLiq.class.getName() : (Glb.ClassWithPackage(EmissioneLiquidazioniLiq.class) ? EmissioneLiquidazioniLiq.class.getName().substring(EmissioneLiquidazioniLiq.class.getPackage().getName().length() + 1) : EmissioneLiquidazioniLiq.class.getName()));
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
    IDVariant v_DATAULTIMAEL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DATAULTIMAEL = (new IDVariant("Ultima Elab.  ", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Emissione Liquidazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      PAN_EMISSILIQUID.set_FieldText(PFL_EMISSILIQUID_GRUPPOLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Gruppo")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADESCGRUP, 0)).stringValue());
      PAN_EMISSILIQUID.set_FieldText(PFL_EMISSILIQUID_DATULTELALAB, IDL.Add(v_DATAULTIMAEL, ((IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDATULTELA, 0).equals((new IDVariant())))?(new IDVariant()):MainFrm.Datetostring(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDATULTELA, 0)))).stringValue());
      if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))) && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true)))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))) && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true)))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // 
      // 
      // 
      if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))) && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true)))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAIMPOFILE, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "LoadEvent", _e);
    }
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
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDATULTELA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAUNIMPPER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDELDAIMSU, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDESDAIMSU, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_SEDE_DEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_NUMERO_DEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_ANNO_DEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADESCGENE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_CAUSALE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_UFFICIO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_BOLLO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADATAEMIS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMINEMISS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_NUMERO_CONTABILE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_DATA_CONTABILE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMALLEGAT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAINFOTESO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARASCADMAND, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMSPESE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMCOMMISS, 0, (new IDVariant()));
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADESCGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDATULTELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAUNIMPPER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDELDAIMSU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDESDAIMSU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADESCGENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_BOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADATAEMIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMINEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_NUMERO_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_DATA_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARATIPOGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARATIPOSCAD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMALLEGAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAINFOTESO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARASCADMAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMSPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMCOMMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAIMPOFILE, 0, new IDVariant());
  }

  // **********************************************************************
  // Emissioni Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSILIQUID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISSILIQUID);
      // 
      // Emissioni Liquidazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, 0))) && IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU, 0).equals((new IDVariant("F")), true))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU, 0).equals((new IDVariant("T")), true))
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_EMISSILIQUID.SetFlags (Glb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "EmissioniLiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "InfoDelibere", _e);
      return -1;
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
    IDVariant v_AVVISONONBLO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_IMPA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SUBIMPDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SUBIMPA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_LIQDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_LIQA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANTICIPAZION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MEX = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TERMINANATA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPEGNI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SUBIMPEGNI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LIQUIDAZIONI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPDAA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SUBDAA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LIQDAA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DALNUMERO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NESSUNO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TERMINANATA = (new IDVariant("Procedura terminata.", IDVariant.STRING));
      v_IMPEGNI = (new IDVariant("Impegni emessi: ", IDVariant.STRING));
      v_SUBIMPEGNI = (new IDVariant("Sub-Impegni emessi: ", IDVariant.STRING));
      v_LIQUIDAZIONI = (new IDVariant("Liquidazioni emesse: ", IDVariant.STRING));
      v_DALNUMERO = (new IDVariant("dal numero ", IDVariant.STRING));
      v_AL = (new IDVariant(" al ", IDVariant.STRING));
      v_NESSUNO = (new IDVariant("Nessuno", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_STATCENTCOMO = new IDVariant(0,IDVariant.INTEGER);
      // 
      // Controlli Bloccanti
      // 
      {
        if (ControlloLiquidazioneEseguita())
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Emissioni liquidazioni già eseguita!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARADESCGENE, 0)))
        {
          IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
          v_NUMREC = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  GRL A ");
          SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((A.ANNO_IMP IS NULL)) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NUMREC.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Specificare la Descrizione Generica!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
      }
      v_AVVISONONBLO = ControlliNonBloccanti();
      if (!(IDL.IsNull(v_AVVISONONBLO)))
      {
        if (!(MainFrm.MessageConfirm(v_AVVISONONBLO)))
        {
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BeginTrans();
      MainFrm.Cf4armDBObject.GRLEMISSIONEAUTO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_CAUSALE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_UFFICIO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_BOLLO, 0), (new IDVariant("R")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARADESCGENE, 0), IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMINEMISS, 0),(new IDVariant("NO"))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARATIPOSCAD, 0),(new IDVariant(-1))))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_SEDE_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_NUMERO_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_ANNO_DEL, 0), v_IMPDA, v_IMPA, v_SUBIMPDA, v_SUBIMPA, v_LIQDA, v_LIQA, IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARDELDAIMSU, 0), IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARDESDAIMSU, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_NUMERO_CONTABILE, 0)), (new IDVariant("@"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_DATA_CONTABILE, 0))), v_ANTICIPAZION, IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO, 0), v_STATOSIOPE, v_NSUPDISPPURO, IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARASCADMAND, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMSPESE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMCOMMISS, 0), v_STATCENTCOMO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
      IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
      v_MESSUPDISPUR = (new IDVariant("Sono stati emessi impegni che superano la disponibilità dello stanziamento puro"));
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_BLOCCNONBLOC = null;
      v_BLOCCNONBLOC = (new IDVariant());
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMINEMISS, 0).equals((new IDVariant("SI")), true))
      {
        v_BLOCCNONBLOC = new IDVariant(MainFrm.CONCASLIQEMI);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  GRL A, ");
        SQL.append("  LIQ B ");
        SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",A.CAPITOLO,A.ARTICOLO,CASE WHEN NOT ((" + IDL.CSql(MainFrm.CONTRCASSLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN 'LI' ELSE 'EM' END) < 0) ");
        SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
        SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
        SQL.append("and   ((B.NUMERO_LIQ BETWEEN " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(v_LIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (NOT ((B.ANNO_MAND IS NULL))) ");
        SQL.append("and   (B.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      else
      {
        v_BLOCCNONBLOC = new IDVariant(MainFrm.CONTRCASSLIQ);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  GRL A, ");
        SQL.append("  LIQ B ");
        SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",A.CAPITOLO,A.ARTICOLO,CASE WHEN NOT ((" + IDL.CSql(MainFrm.CONTRCASSLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN 'LI' ELSE 'EM' END) < 0) ");
        SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
        SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
        SQL.append("and   ((B.NUMERO_LIQ BETWEEN " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(v_LIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (B.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0 && !(IDL.IsNull(v_BLOCCNONBLOC)))
      {
        if (v_BLOCCNONBLOC.equals((new IDVariant(1)), true))
        {
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Sono presenti record con disponibilità di cassa negativa."));
          MainFrm.set_AlertMessage(v_S1); 
          // 
          // l'apertura della maschera è stata commentata perchè
          // committa in automatico all'apertura
          // 
          // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMOGGCODGRU, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0));
          // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMEOGGETTES, 0, (new IDVariant("S")));
          // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMOGGLIQDAL, 0, new IDVariant(v_LIQDA));
          // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMEOGGLIQAL, 0, new IDVariant(v_LIQA));
          // MainFrm.Show(MyGlb.FRM_CAPCONDINEGR, (new IDVariant(-1)).intValue(), this); 
          MainFrm.Cf4armDBObject.RollbackTrans();
        }
        else
        {
          if (!(MainFrm.MessageConfirm(S)))
          {
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          else
          {
            MainFrm.Cf4armDBObject.CommitTrans();
          }
          IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMOGGCODGRU, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMEOGGETTES, 0, (new IDVariant("S")));
          IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMOGGLIQDAL, 0, new IDVariant(v_LIQDA));
          IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMEOGGLIQAL, 0, new IDVariant(v_LIQA));
          MainFrm.Show(MyGlb.FRM_CAPCONDINEGR, (new IDVariant(-1)).intValue(), this); 
        }
        // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMOGGCODGRU, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0));
        // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMEOGGETTES, 0, (new IDVariant("S")));
        // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMOGGLIQDAL, 0, new IDVariant(v_LIQDA));
        // IMDB.set_Value(IMDBDef5.TBL_PARS47, IMDBDef5.FLD_PARS47_NOMEOGGLIQAL, 0, new IDVariant(v_LIQA));
        // MainFrm.Show(MyGlb.FRM_CAPCONDINEGR, (new IDVariant(-1)).intValue(), this); 
        if (v_BLOCCNONBLOC.equals((new IDVariant(1)), true))
        {
          return 0;
        }
      }
      else
      {
        MainFrm.Cf4armDBObject.CommitTrans();
      }
      if (v_STATOSIOPE.equals((new IDVariant(1)), true))
      {
        IDVariant v_AVVISOCGU = new IDVariant(0,IDVariant.STRING);
        v_AVVISOCGU = (new IDVariant("Attenzione: sono state emesse liquidazioni senza Codice Gestionale!", IDVariant.STRING));
        IDVariant v_AVVISOLIV5 = new IDVariant(0,IDVariant.STRING);
        v_AVVISOLIV5 = (new IDVariant("Attenzione: sono state emesse liquidazioni senza Codice Livello 5!"));
        if (MainFrm.SIOPEATTIARM.booleanValue())
        {
          v_MEX = IDL.Add(IDL.Add(v_MEX, v_AVVISOLIV5), (new IDVariant("<BR/>")));
        }
        else
        {
          v_MEX = IDL.Add(IDL.Add(v_MEX, v_AVVISOCGU), (new IDVariant("<BR/>")));
        }
      }
      if (v_STATCENTCOMO.equals((new IDVariant(1)), true))
      {
        IDVariant v_AVVISOCENTRI = new IDVariant(0,IDVariant.STRING);
        v_AVVISOCENTRI = (new IDVariant("Attenzione: E' stato utilizzato il centro di comodo per uno o più movimenti creati", IDVariant.STRING));
        v_MEX = IDL.Add(IDL.Add(v_MEX, v_AVVISOCENTRI), (new IDVariant("<BR/>")));
      }
      if (MainFrm.FINANZIAMENT.booleanValue() && v_ANTICIPAZION.compareTo((new IDVariant(0)), true)!=0)
      {
        IDVariant v_AVVISOFIN = new IDVariant(0,IDVariant.STRING);
        v_AVVISOFIN = (new IDVariant("Sono presenti casi di anticipazione sui finanziamenti!", IDVariant.STRING));
        v_MEX = IDL.Add(IDL.Add(v_MEX, v_AVVISOFIN), (new IDVariant("<BR/>")));
      }
      if (v_IMPDA.compareTo(v_IMPA, true)>0)
      {
        v_IMPDAA = new IDVariant(v_NESSUNO);
      }
      else
      {
        v_IMPDAA = IDL.Add(IDL.Add(IDL.Add(v_DALNUMERO, IDL.ToString(v_IMPDA)), v_AL), IDL.ToString(v_IMPA));
      }
      if (v_SUBIMPDA.compareTo(v_SUBIMPA, true)>0)
      {
        v_SUBDAA = new IDVariant(v_NESSUNO);
      }
      else
      {
        v_SUBDAA = IDL.Add(IDL.Add(IDL.Add(v_DALNUMERO, IDL.ToString(v_SUBIMPDA)), v_AL), IDL.ToString(v_SUBIMPA));
      }
      if (v_LIQDA.compareTo(v_LIQA, true)>0)
      {
        v_LIQDAA = new IDVariant(v_NESSUNO);
      }
      else
      {
        v_LIQDAA = IDL.Add(IDL.Add(IDL.Add(v_DALNUMERO, IDL.ToString(v_LIQDA)), v_AL), IDL.ToString(v_LIQA));
      }
      v_MEX = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MEX, v_TERMINANATA), (new IDVariant("<BR/>"))), v_IMPEGNI), v_IMPDAA), (new IDVariant("<BR/>"))), v_SUBIMPEGNI), v_SUBDAA), (new IDVariant("<BR/>"))), v_LIQUIDAZIONI), v_LIQDAA), (new IDVariant("<BR/>")));
      if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
      {
        v_MEX = IDL.Add(IDL.Add(v_MEX, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
      }
      MainFrm.set_AlertMessage(v_MEX); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Liquidazione Eseguita
  // **********************************************************************
  public boolean ControlloLiquidazioneEseguita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMRECTOT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMRECLIQ = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Liquidazione Eseguita Body
      // Procedure Body
      // 
      v_NUMRECTOT = (new IDVariant(0));
      v_NUMRECLIQ = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  GRL A ");
      SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMRECTOT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMRECTOT.equals((new IDVariant(0)), true))
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  GRL A ");
        SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NOT ((A.ANNO_LIQ IS NULL))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMRECLIQ = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMRECLIQ.equals(v_NUMRECTOT, true))
        {
          return (new IDVariant(-1)).booleanValue();
        }
        else
        {
          return (new IDVariant(0)).booleanValue();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "ControlloLiquidazioneEseguita", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli Non Bloccanti
  // **********************************************************************
  public IDVariant ControlliNonBloccanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controlli Non Bloccanti Body
      // Procedure Body
      // 
      v_AVVISO = (new IDVariant());
      if ((PAN_EMISSILIQUID.bFields(PFL_EMISSILIQUID_SCADENZABEN).IsVisible(PAN_EMISSILIQUID.AttR) && PAN_EMISSILIQUID.bFields(PFL_EMISSILIQUID_SCADENZABEN).IsPresent()))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARATIPOSCAD, 0)))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Le liquidazioni verranno emesse per tutti i tipi di scadenza", IDVariant.STRING));
          v_AVVISO = IDL.Add(IDL.Add(v_AVVISO, v_MESSAGGIO), (new IDVariant("<BR/>")));
        }
      }
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARDATULTELA, 0), true)<0)
      {
        IDVariant v_AVVISODATA = new IDVariant(0,IDVariant.STRING);
        v_AVVISODATA = (new IDVariant("La data emissione è precedente a quella dell'ultima elaborazione!", IDVariant.STRING));
        v_AVVISO = IDL.Add(IDL.Add(v_AVVISO, v_AVVISODATA), (new IDVariant("<BR/>")));
      }
      if (MainFrm.SEIMPNEGLIPE.equals((new IDVariant("S")), true))
      {
        IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
        v_NUMREC = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  GRL A ");
        SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.IMPORTO < 0) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMREC.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_AVVISOIMPNEG = new IDVariant(0,IDVariant.STRING);
          v_AVVISOIMPNEG = (new IDVariant("Sono presenti importi negativi che verranno scartati dall'emissione liquidazioni!", IDVariant.STRING));
          v_AVVISO = IDL.Add(v_AVVISO, v_AVVISOIMPNEG);
        }
      }
      return v_AVVISO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "ControlliNonBloccanti", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Cmd Allegati
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdAllegati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Allegati", IDVariant.STRING));
      // 
      // Cmd Allegati Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAMALLEGAT, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "CmdAllegati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Note Tesoriere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int NoteTesoriere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Info Tesoriere", IDVariant.STRING));
      // 
      // Note Tesoriere Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAQUALNOTE, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARAINFOTESO, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniLiq", "NoteTesoriere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSLIQULIQ_PARAMETRI269() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI269_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI350, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI350, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI269_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI269_RS, 0, IMDBDef5.TBL_PARAMETRI350, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 0, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDATULTELA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 1, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAUNIMPPER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 2, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDELDAIMSU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 3, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARDESDAIMSU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 4, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 5, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 6, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 7, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADESCGENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 8, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 9, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 10, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_BOLLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 11, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARADATAEMIS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 12, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 13, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_NUMERO_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 14, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_DATA_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 15, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARATIPOSCAD, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 16, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMALLEGAT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 17, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAINFOTESO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 18, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARASCADMAND, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 19, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMSPESE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI269_RS, 20, 0, IMDBDef5.TBL_PARAMETRI350, IMDBDef5.FLD_PARAMETRI350_PARAMCOMMISS, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI350, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI350, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI350, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI269_RS, 0);
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
  private void PAN_EMISSILIQUID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSILIQUID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSILIQUID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSILIQUID, Cancel);
    // Stub
  }

  private void PAN_EMISSILIQUID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSILIQUID_SCELDELILABE)
    {
      this.IdxPanelActived = this.PAN_EMISSILIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSILIQUID_INFODELILABE)
    {
      this.IdxPanelActived = this.PAN_EMISSILIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSILIQUID_APRIALLEGATI)
    {
      this.IdxPanelActived = this.PAN_EMISSILIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdAllegati();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSILIQUID_NOTETESORIER)
    {
      this.IdxPanelActived = this.PAN_EMISSILIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      NoteTesoriere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSILIQUID_ELABORALABEL)
    {
      this.IdxPanelActived = this.PAN_EMISSILIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSILIQUID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSILIQUID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSILIQUID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSILIQUID_Init()
  {

    PAN_EMISSILIQUID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSILIQUID.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, "67132A0A-B8A4-446A-BA44-8A1B20C130B7");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, "Una Liquidazione per");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, MyGlb.PANEL_FORM, 8, 43, 532, 41, 0, 0);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, 0, 117);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, 1, 13);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, 0, 4);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, 1, 4);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_UNALIQUIDPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, "214C9D2E-8B0E-4BFC-B866-5523DBE25BAF");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, "Liquidazioni");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, MyGlb.PANEL_LIST, 248, -9999, 504, 16, 0, 0);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, MyGlb.PANEL_FORM, 8, 127, 532, 421, 0, 0);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, 0, 66);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, 1, 13);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, 0, 4);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, 1, 4);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_LIQUIDAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, "89D08FEB-3CDB-4402-9B6E-A48A9169E26D");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, "Mandato Informatico");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, MyGlb.PANEL_LIST, 0, -9999, 428, 16, 0, 0);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, MyGlb.PANEL_FORM, 44, 351, 464, 121, 0, 0);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, 0, 120);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, 1, 13);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, 0, 4);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, 1, 4);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_MANDATINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, "C296C70F-472E-44F5-BBDA-CEA038F71554");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, "Contabile di Tesoreria");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, MyGlb.PANEL_LIST, 752, -9999, 176, 16, 0, 0);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, MyGlb.PANEL_FORM, 44, 479, 464, 49, 0, 0);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, 0, 123);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, 1, 13);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, 0, 4);
    PAN_EMISSILIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, 1, 4);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSILIQUID_CONTADITESOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSILIQUID.SetSize(MyGlb.OBJ_FIELD, 37);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, "11463A6E-46F8-491B-AA77-7F6BF7CF649C");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, "8E9E038D-16E1-42FF-A762-8B9398EE42EB");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, "B0CC1571-2F51-4A50-9838-8519F019EE58");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, "Un Impegno Per");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.VIS_OPTBUTSENBOR);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, "288EE553-E46A-465D-AE89-D9B35C9A9E2F");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, "89C64214-29DA-4846-8B04-00B887550BD7");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, "Delibera Da Impegno/Sub-Impegno");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, "85D36A5B-706F-4BD2-8427-EAA7C265C154");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, "Descrizione  Da Impegno/Sub-Impegno");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, "7D1A32A8-BAF0-4612-B794-7DB221118EC1");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, "Delibera");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, "5ED12D93-9E9A-497D-A148-4213CAB71213");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, "Sede Del");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, "3E508AA1-BFFB-42CB-B646-5330B0B73ECE");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, "47A73BBE-4A41-40AB-9047-C6336726A810");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, "-");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, "8E7B13FD-C505-456C-8165-165978828A43");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, "Numero Del");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, "06CD70B0-FD09-4771-B26F-8E62F7EF22E9");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, "/");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, "1AFCCF8F-C4B1-4185-8E3E-AD7E1A281D80");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, "Anno Del");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, "D994C145-EF52-4F05-A299-FE9A5CAC9954");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSILIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, 0, "wsearch1.gif", false);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, "F01BA63A-7435-47A0-9F31-E67FCB4B2494");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSILIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, 0, "info.gif", false);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, "40224D70-52D8-4481-AD77-388788405D8A");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, "Descrizione Generica");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, "A5D5C28A-4B4A-4FD9-8DDB-594BE7E46851");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, "Causale");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, "7D697A4F-96B8-40CE-93FC-6620394386C8");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, "Ufficio");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, "ADCE902E-CAE8-4813-8E9C-A0992EB66C7E");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, "Bollo");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, "E34CE621-3FF8-4509-BECB-8CBB86F095F3");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, "Data Emissione");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, "2086D966-EAA9-4D32-89AB-3C308964676B");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, "In Emissione");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, "74B5E9C1-AECA-405C-8F74-346F9615BBAF");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, "Solo Beneficiari con Scadenza");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, "43D0DA34-E70B-40F6-94FD-B8F7D773F249");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, "Allegati");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, "4DFE5961-E102-4DC7-9B85-5EC2F0B467FF");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, "Info Tesoriere");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, "958787E5-CE22-4D99-8309-10222431D655");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSILIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, 0, "testo1.gif", false);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, "79B2A0EB-516C-49D7-A933-ED1DCBF9F13D");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSILIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, 0, "testo1.gif", false);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, "853E3C12-EA72-4C63-9A92-94D20F42B597");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, "Scadenza");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, "D910E3EE-00A1-4796-9ACD-CBD0A52D4EE7");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, "Spese");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, "4A05A9AF-C9B9-4086-9B82-B05D3E4F2EC7");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, "Commissioni");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, "2DE2D376-F544-4802-BC2C-290D36CA766A");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, "Numero");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, "3BDF1822-5BCD-49BF-90C4-D32839A9C997");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, "Data");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, "FEEB7041-9D6E-4618-856A-574069C6A798");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, "73699DA7-3BA4-40CC-BC15-D8F0EE2325F7");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, "43654AFC-0FAE-478D-BC42-2698203E3F1D");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, "Elabora");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSILIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, 0, "button1.gif", false);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, "A625A90E-0A11-4D0D-B1AE-642405F4FA07");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, "Data Ultima Elaborazione");
    PAN_EMISSILIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, "68EB4C14-57DA-4A40-9898-9BCBF4A4E25B");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, "");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSILIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, "91335FFB-0284-49C5-82D9-8CD9DCA3C796");
    PAN_EMISSILIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, "L'emissione trattera' solo le righe di dettaglio per le quali non sono ancora state emesse liquidazioni.");
    PAN_EMISSILIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_EMISSILIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_EMISSILIQUID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.PANEL_LIST, 12, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.PANEL_FORM, 12, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABESX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_UNIMPELABESX, -1, GRP_EMISSILIQUID_UNALIQUIDPER);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_UNIMPELABESX, -1, "", "UNIMPELABESX", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.PANEL_LIST, 556, 60, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.PANEL_FORM, 524, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPELABEDX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_UNIMPELABEDX, -1, GRP_EMISSILIQUID_UNALIQUIDPER);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_UNIMPELABEDX, -1, "", "UNIMPELABEDX", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_LIST, 120, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_LIST, 88);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_LIST, "Un Impegno Per");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_FORM, 136, 60, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_FORM, 104);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UNIMPEGNOPER, MyGlb.PANEL_FORM, "Un Impegno Per");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_UNIMPEGNOPER, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_UNIMPEGNOPER, PPQRY_PARAMETRI269, "A.PARAUNIMPPER", "PARAUNIMPPER", 5, 1, 0, -13997);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_UNIMPEGNOPER, (new IDVariant("R")), "Capitolo/Impegno", "", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_UNIMPEGNOPER, (new IDVariant("D")), "Dettaglio", "", "", -1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.PANEL_LIST, 8, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.PANEL_FORM, 12, 160, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELSX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_LIQUILABELSX, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_LIQUILABELSX, -1, "", "LIQUILABELSX", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_LIST, 248, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_LIST, 108);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_LIST, "D. D. I. S. I.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_FORM, 44, 152, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_FORM, 212);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELDAIMPSUIM, MyGlb.PANEL_FORM, "Delibera Da Impegno/Sub-Impegno");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DELDAIMPSUIM, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DELDAIMPSUIM, PPQRY_PARAMETRI269, "A.PARDELDAIMSU", "PARDELDAIMSU", 5, 1, 0, -13997);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_DELDAIMPSUIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_DELDAIMPSUIM, (new IDVariant("F")), "F", "", "", -1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_LIST, 296, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_LIST, 120);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_LIST, "D. D. I. S. I.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_FORM, 24, 176, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_FORM, 232);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESDAIMPSUIM, MyGlb.PANEL_FORM, "Descrizione  Da Impegno/Sub-Impegno");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DESDAIMPSUIM, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DESDAIMPSUIM, PPQRY_PARAMETRI269, "A.PARDESDAIMSU", "PARDESDAIMSU", 5, 1, 0, -13997);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_DESDAIMPSUIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_DESDAIMPSUIM, (new IDVariant("F")), "F", "", "", -1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.PANEL_LIST, 20, 192, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.PANEL_FORM, 80, 204, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DELIBERLABEL, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_LIST, 344, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_LIST, 52);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_LIST, "Sd. Dl.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_FORM, 144, 204, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SEDEDEL, MyGlb.PANEL_FORM, "Sede Del");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_SEDEDEL, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_SEDEDEL, PPQRY_PARAMETRI269, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.PANEL_LIST, 572, 396, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.PANEL_FORM, 524, 532, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_LIQUILABELDX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_LIQUILABELDX, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_LIQUILABELDX, -1, "", "LIQUILABELDX", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.PANEL_LIST, 192, 192, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.PANEL_FORM, 192, 204, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_TRATTIDELIBE, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_LIST, 384, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_LIST, 64);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_LIST, "N. D.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_FORM, 212, 204, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_FORM, 68);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERODEL, MyGlb.PANEL_FORM, "Num. Del");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_NUMERODEL, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_NUMERODEL, PPQRY_PARAMETRI269, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.PANEL_LIST, 200, 200, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.PANEL_FORM, 260, 204, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_BARRADELIBER, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_LIST, 424, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_LIST, "An. D.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_FORM, 280, 204, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_FORM, 56);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_ANNODEL, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_ANNODEL, PPQRY_PARAMETRI269, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.PANEL_LIST, 308, 176, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.PANEL_FORM, 328, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCELDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_SCELDELILABE, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_SCELDELILABE, -1, "", "SCELDELILABE", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.PANEL_LIST, 316, 184, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.PANEL_FORM, 348, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFODELILABE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_INFODELILABE, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_INFODELILABE, -1, "", "INFODELILABE", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_LIST, 4, 276, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_LIST, 128);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_LIST, 2);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_LIST, "Descrizione Generica");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_FORM, 12, 228, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_FORM, 128);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DESCRIGENERI, MyGlb.PANEL_FORM, "Descrizione Generica");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DESCRIGENERI, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DESCRIGENERI, PPQRY_PARAMETRI269, "A.PARADESCGENE", "PARADESCGENE", 5, 250, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_LIST, 464, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_FORM, 24, 252, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_FORM, 116);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_CAUSALE, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_CAUSALE, PPQRY_PARAMETRI269, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_LIST, 504, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_FORM, 24, 276, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_FORM, 116);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_UFFICIO, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_UFFICIO, PPQRY_PARAMETRI269, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_FORM, 24, 300, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_FORM, 116);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_BOLLO, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_BOLLO, PPQRY_PARAMETRI269, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_LIST, 584, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_LIST, 80);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_LIST, "Data Emissione");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_FORM, 24, 324, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_FORM, 116);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAEMISSION, MyGlb.PANEL_FORM, "Data Emissione");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DATAEMISSION, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DATAEMISSION, PPQRY_PARAMETRI269, "A.PARADATAEMIS", "PARADATAEMIS", 6, 19, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_LIST, 704, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_LIST, "In Ems.");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_FORM, 380, 324, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_INEMISSIONE, -1, GRP_EMISSILIQUID_LIQUIDAZIONI);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_INEMISSIONE, PPQRY_PARAMETRI269, "A.PARAMINEMISS", "PARAMINEMISS", 5, 2, 0, -13997);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_INEMISSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_LIST, 80);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_LIST, "Solo Beneficiari con Scadenza");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_FORM, 8, 96, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_FORM, 184);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZABEN, MyGlb.PANEL_FORM, "Solo Beneficiari con Scadenza");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_SCADENZABEN, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_SCADENZABEN, PPQRY_PARAMETRI269, "A.PARATIPOSCAD", "PARATIPOSCAD", 1, 2, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_FORM, 88, 424, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_ALLEGATI, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_ALLEGATI, PPQRY_PARAMETRI269, "A.PARAMALLEGAT", "PARAMALLEGAT", 5, 255, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_FORM, 48, 448, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_FORM, 92);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_INFOTESORIER, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_INFOTESORIER, PPQRY_PARAMETRI269, "A.PARAINFOTESO", "PARAINFOTESO", 5, 255, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.PANEL_LIST, 484, 412, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.PANEL_FORM, 488, 428, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_APRIALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_APRIALLEGATI, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_APRIALLEGATI, -1, "", "APRIALLEGATI", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.PANEL_LIST, 492, 420, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.PANEL_FORM, 488, 452, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NOTETESORIER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_NOTETESORIER, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_NOTETESORIER, -1, "", "NOTETESORIER", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_LIST, 96);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_LIST, "Scadenza");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_FORM, 68, 400, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_FORM, 72);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SCADENZAMAND, MyGlb.PANEL_FORM, "Scadenza");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_SCADENZAMAND, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_SCADENZAMAND, PPQRY_PARAMETRI269, "A.PARASCADMAND", "PARASCADMAND", 6, 10, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_LIST, 44);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_FORM, 96, 376, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_SPESE, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_SPESE, PPQRY_PARAMETRI269, "A.PARAMSPESE", "PARAMSPESE", 1, 1, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_FORM, 268, 400, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_FORM, 84);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_COMMISSIONI, -1, GRP_EMISSILIQUID_MANDATINFORM);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_COMMISSIONI, PPQRY_PARAMETRI269, "A.PARAMCOMMISS", "PARAMCOMMISS", 1, 1, 0, -13997);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_EMISSILIQUID.SetValueListItem(PFL_EMISSILIQUID_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_LIST, 752, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_LIST, 96);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_FORM, 48, 504, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_FORM, 92);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_NUMERO, -1, GRP_EMISSILIQUID_CONTADITESOR);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_NUMERO, PPQRY_PARAMETRI269, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_LIST, 808, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_LIST, 80);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_FORM, 296, 504, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_FORM, 60);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DATA, -1, GRP_EMISSILIQUID_CONTADITESOR);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DATA, PPQRY_PARAMETRI269, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.PANEL_LIST, 528, 376, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.PANEL_FORM, 492, 512, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_CONTABILABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_CONTABILABEL, -1, GRP_EMISSILIQUID_CONTADITESOR);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_CONTABILABEL, -1, "", "CONTABILABEL", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.PANEL_LIST, 112, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.PANEL_FORM, 372, 12, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATULTELALAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DATULTELALAB, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DATULTELALAB, -1, "", "DATULTELALAB", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.PANEL_LIST, 424, 416, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.PANEL_FORM, 424, 560, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_ELABORALABEL, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_LIST, 128);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_LIST, "Data Ultima Elaborazione");
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_FORM, 4, 444, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_FORM, 128);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_DATAULTIELAB, MyGlb.PANEL_FORM, "Dt. Ult. Elaborazione");
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_DATAULTIELAB, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_DATAULTIELAB, PPQRY_PARAMETRI269, "A.PARDATULTELA", "PARDATULTELA", 6, 19, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.PANEL_LIST, 120, 12, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.PANEL_FORM, 8, 12, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_GRUPPOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_GRUPPOLABEL, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_GRUPPOLABEL, -1, "", "GRUPPOLABEL", 0, 0, 0, -13997);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.PANEL_LIST, 12, 556, 396, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.PANEL_LIST, 2);
    PAN_EMISSILIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.PANEL_FORM, 12, 556, 396, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSILIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSILIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSILIQUID_ETICHEINFOEL, MyGlb.PANEL_FORM, 2);
    PAN_EMISSILIQUID.SetFieldPage(PFL_EMISSILIQUID_ETICHEINFOEL, -1, -1);
    PAN_EMISSILIQUID.SetFieldPanel(PFL_EMISSILIQUID_ETICHEINFOEL, -1, "", "ETICHEINFOEL", 0, 0, 0, -13997);
  }

  private void PAN_EMISSILIQUID_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSILIQUID.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T58, 0, SQL, PFL_EMISSILIQUID_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T58, 1, SQL, PFL_EMISSILIQUID_CAUSALE, "");
    PAN_EMISSILIQUID.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T53, 0, SQL, PFL_EMISSILIQUID_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T53, 1, SQL, PFL_EMISSILIQUID_UFFICIO, "");
    PAN_EMISSILIQUID.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("and   ((A.TIPO IS NULL) OR A.TIPO = 'L') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T60, 0, SQL, PFL_EMISSILIQUID_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where ((A.TIPO IS NULL) OR A.TIPO = 'L') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T60, 1, SQL, PFL_EMISSILIQUID_BOLLO, "");
    PAN_EMISSILIQUID.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T01CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T01DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T01 A ");
    SQL.append("where (A.CODICE = ~~PARATIPOSCAD~~) ");
    SQL.append("and   (A.SE_PERSONALE = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T01, 0, SQL, PFL_EMISSILIQUID_SCADENZABEN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T01CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T01DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T01 A ");
    SQL.append("where (A.SE_PERSONALE = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_T01, 1, SQL, PFL_EMISSILIQUID_SCADENZABEN, "");
    PAN_EMISSILIQUID.SetQueryDB(PPQRY_T01, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~PARAMSPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_EMISSILIQUID_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSILIQUID.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_EMISSILIQUID_SPESE, "");
    PAN_EMISSILIQUID.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSILIQUID.SetIMDB(IMDB, "PQRY_PARAMETRI269", true);
    PAN_EMISSILIQUID.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_EMISSILIQUID.SetQueryIMDB(PPQRY_PARAMETRI269, IMDBDef14.PQRY_PARAMETRI269_RS, IMDBDef5.TBL_PARAMETRI350);
    JustLoaded = true;
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_UNIMPEGNOPER, IMDBDef5.FLD_PARAMETRI350_PARAUNIMPPER);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_DELDAIMPSUIM, IMDBDef5.FLD_PARAMETRI350_PARDELDAIMSU);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_DESDAIMPSUIM, IMDBDef5.FLD_PARAMETRI350_PARDESDAIMSU);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_SEDEDEL, IMDBDef5.FLD_PARAMETRI350_SEDE_DEL);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_NUMERODEL, IMDBDef5.FLD_PARAMETRI350_NUMERO_DEL);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_ANNODEL, IMDBDef5.FLD_PARAMETRI350_ANNO_DEL);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_DESCRIGENERI, IMDBDef5.FLD_PARAMETRI350_PARADESCGENE);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_CAUSALE, IMDBDef5.FLD_PARAMETRI350_CAUSALE);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_UFFICIO, IMDBDef5.FLD_PARAMETRI350_UFFICIO);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_BOLLO, IMDBDef5.FLD_PARAMETRI350_BOLLO);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_DATAEMISSION, IMDBDef5.FLD_PARAMETRI350_PARADATAEMIS);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_INEMISSIONE, IMDBDef5.FLD_PARAMETRI350_PARAMINEMISS);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_SCADENZABEN, IMDBDef5.FLD_PARAMETRI350_PARATIPOSCAD);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_ALLEGATI, IMDBDef5.FLD_PARAMETRI350_PARAMALLEGAT);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_INFOTESORIER, IMDBDef5.FLD_PARAMETRI350_PARAINFOTESO);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_SCADENZAMAND, IMDBDef5.FLD_PARAMETRI350_PARASCADMAND);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_SPESE, IMDBDef5.FLD_PARAMETRI350_PARAMSPESE);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_COMMISSIONI, IMDBDef5.FLD_PARAMETRI350_PARAMCOMMISS);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_NUMERO, IMDBDef5.FLD_PARAMETRI350_NUMERO_CONTABILE);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_DATA, IMDBDef5.FLD_PARAMETRI350_DATA_CONTABILE);
    PAN_EMISSILIQUID.SetFieldPrimaryIndex(PFL_EMISSILIQUID_DATAULTIELAB, IMDBDef5.FLD_PARAMETRI350_PARDATULTELA);
    PAN_EMISSILIQUID.SetMasterTable(0, "PARAMETRI350");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSILIQUID.Status() == 2)
    {
      int oldListQBE = PAN_EMISSILIQUID.iUseListQBE;
      PAN_EMISSILIQUID.iUseListQBE = 0;
      PAN_EMISSILIQUID.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSILIQUID.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSILIQUID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSILIQUID) PAN_EMISSILIQUID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSILIQUID) PAN_EMISSILIQUID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSILIQUID) PAN_EMISSILIQUID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSILIQUID) PAN_EMISSILIQUID_CellActivated(ColIndex, Cancel);
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
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_EMISSILIQUID) PAN_EMISSILIQUID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
