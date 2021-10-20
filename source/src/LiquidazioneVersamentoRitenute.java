// **********************************************
// Liquidazione Versamento Ritenute
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioneVersamentoRitenute extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_TIPORITENUTA = 0;
  private static int GRP_PARAMETRI_LIQUIDAZIONE = 1;

  private static int PFL_PARAMETRI_TIPORITENUTA = 0;
  private static int PFL_PARAMETRI_NEWPANELLABE = 1;
  private static int PFL_PARAMETRI_RITEDELMESDI = 2;
  private static int PFL_PARAMETRI_A = 3;
  private static int PFL_PARAMETRI_UFFICIO = 4;
  private static int PFL_PARAMETRI_RITEACARIENT = 5;
  private static int PFL_PARAMETRI_IMPODANONVER = 6;
  private static int PFL_PARAMETRI_CUMULATIVA = 7;
  private static int PFL_PARAMETRI_CODICEBENEFI = 8;
  private static int PFL_PARAMETRI_BENBENEFICIA = 9;
  private static int PFL_PARAMETRI_SCEGBENELABE = 10;
  private static int PFL_PARAMETRI_INFOBENELABE = 11;
  private static int PFL_PARAMETRI_CAUSALE = 12;
  private static int PFL_PARAMETRI_BOLLO = 13;
  private static int PFL_PARAMETRI_UFFICIO1 = 14;
  private static int PFL_PARAMETRI_INEMISSIONE = 15;
  private static int PFL_PARAMETRI_SPESE = 16;
  private static int PFL_PARAMETRI_COMMISSIONI = 17;
  private static int PFL_PARAMETRI_SCADENZA = 18;
  private static int PFL_PARAMETRI_ALLEGATI = 19;
  private static int PFL_PARAMETRI_INFOTESORIER = 20;
  private static int PFL_PARAMETRI_STIPENDI = 21;
  private static int PFL_PARAMETRI_NEWPANELLAB1 = 22;
  private static int PFL_PARAMETRI_ELABORA = 23;
  private static int PFL_PARAMETRI_AGGIUNGENOTE = 24;
  private static int PFL_PARAMETRI_AGGIUNGENOT2 = 25;

  private static int PPQRY_PARAMETRI146 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T54 = 2;
  private static int PPQRY_T58 = 3;
  private static int PPQRY_T60 = 4;
  private static int PPQRY_T53 = 5;
  private static int PPQRY_TIPISPESMINF = 6;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant NUMEDIGITEST = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI223(IMDB);
    Init_TBL_STRINGHE(IMDB);
    //
    //
    Init_PQRY_PARAMETRI146(IMDB);
    Init_PQRY_PARAMETRI146_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI223(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI223, 23);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI223, "TBL_PARAMETRI223");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARADATARITE, "PARADATARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARADATARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSTART, "PARAMSTART");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSTART,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSTIPEND, "PARAMSTIPEND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSTIPEND,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMNEWSTAR, "PARAMNEWSTAR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMNEWSTAR,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARATIPORITE, "PARATIPORITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARATIPORITE,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA, "PARRITDEMEDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA, "PARRITDEIMEA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARRITACAREN, "PARRITACAREN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARRITACAREN,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCUMULAT, "PARAMCUMULAT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCUMULAT,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARIMPDANOVE, "PARIMPDANOVE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARIMPDANOVE,3,2,2);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCAUSALE, "PARAMCAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMBOLLO, "PARAMBOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMINEMISS,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSPESE, "PARAMSPESE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSPESE,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, "PARAMCOMMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMSCADENZ,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMUFFILIQ, "PARAMUFFILIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI223,IMDBDef5.FLD_PARAMETRI223_PARAMUFFILIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI223, 0);
  }

  private static void Init_TBL_STRINGHE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_STRINGHE, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_STRINGHE, "TBL_STRINGHE");
    IMDB.set_FldCode(IMDBDef5.TBL_STRINGHE,IMDBDef5.FLD_STRINGHE_ROWNAMNEWFIE, "ROWNAMNEWFIE");
    IMDB.SetFldParams(IMDBDef5.TBL_STRINGHE,IMDBDef5.FLD_STRINGHE_ROWNAMNEWFIE,5,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_STRINGHE, 0);
  }

  private static void Init_PQRY_PARAMETRI146(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI146, 18);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI146, "PQRY_PARAMETRI146");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, "PARAMBOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMSTIPEND, "PARAMSTIPEND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMSTIPEND,6,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, "PARATIPORITE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, "PARRITDEMEDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARRITDEIMEA, "PARRITDEIMEA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARRITDEIMEA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, "PARRITACAREN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT, "PARAMCUMULAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE, "PARIMPDANOVE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE,3,2,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, "PARAMCAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE, "PARAMSPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ,6,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS, "PARAMCOMMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, "PARAMUFFILIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI146, 0);
  }

  private static void Init_PQRY_PARAMETRI146_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI146_RS, 18);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI146_RS, "PQRY_PARAMETRI146_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, "PARAMBOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMSTIPEND, "PARAMSTIPEND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMSTIPEND,6,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, "PARATIPORITE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, "PARRITDEMEDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARRITDEIMEA, "PARRITDEIMEA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARRITDEIMEA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, "PARRITACAREN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT, "PARAMCUMULAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE, "PARIMPDANOVE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE,3,2,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, "PARAMCAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE, "PARAMSPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ,6,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS, "PARAMCOMMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, "PARAMUFFILIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI146_RS,IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioneVersamentoRitenute(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioneVersamentoRitenute()
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
    FormIdx = MyGlb.FRM_LIQUVERSRITE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7A98964F-3D5D-44DB-8E9D-EB2782193815";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 552;
    DesignHeight = 602;
    set_Caption(new IDVariant("Liquidazione Versamento Ritenute"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 552;
    Frames[1].Height = 576;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 576;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 552-MyGlb.PAN_OFFS_X, 576-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8C45B81B-7F0C-4CF8-A11D-241827D3BEF1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4328, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI223, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUVERSRITE_PARAMETRI146();
      }
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGBENELABE) {
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
    return (obj instanceof LiquidazioneVersamentoRitenute);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioneVersamentoRitenute.class.getName() : (Glb.ClassWithPackage(LiquidazioneVersamentoRitenute.class) ? LiquidazioneVersamentoRitenute.class.getName().substring(LiquidazioneVersamentoRitenute.class.getPackage().getName().length() + 1) : LiquidazioneVersamentoRitenute.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties Event
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
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione tooltip
      // 
      {
        PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_ALLEGATI,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_ALLEGATI))).stringValue()); 
        PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_INFOTESORIER,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_INFOTESORIER))).stringValue()); 
      }
      // 
      // visibilità del e del campo Beneficiario, Importo da non versare, campo ritenute dei mesi a, importo da non versare
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(2)), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_A, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_A, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      // 
      // visibilità del checkbox cumulativa e ritenute a carico ente
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(3)), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          // 
          // campo cumulativa
          // 
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, 0).equals((new IDVariant("NO")), true))
            {
              PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            else
            {
              PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
          }
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAMETRI_BENBENEFICIA)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENBENEFICIA))), IDL.Today(), (new IDVariant("FM")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "ParametriOnGetSmartLookup", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Liquidazione Versamento Ritenute", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      // 
      // setto valori default
      // 
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARATIPORITE, 0, (new IDVariant(1)));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITACAREN, 0, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARIMPDANOVE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, 0, (new IDVariant()));
        // 
        // gestione di ritenute mesi da e a
        // 
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA, 0, IDL.Sub(IDL.Month(IDL.Today()), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA, 0, IDL.Sub(IDL.Month(IDL.Today()), (new IDVariant(1))));
          if (IMDB.Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA, 0).equals((new IDVariant(0)), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA, 0, (new IDVariant(1)));
          }
          if (IMDB.Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA, 0).equals((new IDVariant(0)), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA, 0, (new IDVariant(1)));
          }
        }
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMINEMISS, 0, (new IDVariant(0)));
        v_LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
        if (v_LICENZAMIF.equals((new IDVariant(-1)), true))
        {
          if (MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            // 
            // setto valore di default
            // 
            {
              IDVariant v_VALUEDEFAULT = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.CODICE as TIPSPEMINCOD ");
              SQL.append("from ");
              SQL.append("  TIPI_SPESA_MINF A ");
              SQL.append("where (A.DEFAULT_S = 'SI') ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VALUEDEFAULT = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
              }
              QV.Close();
              IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSPESE, 0, new IDVariant(v_VALUEDEFAULT));
            }
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSPESE, 0, (new IDVariant()));
          }
          if (MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, 0, (new IDVariant()));
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, 0, (new IDVariant()));
          }
          if (MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT, 0, (new IDVariant()));
          }
          if (MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO, 0, (new IDVariant()));
          }
        }
        else
        {
          // 
          // rendo i campi invisibili
          // 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSPESE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO, 0, (new IDVariant()));
        }
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCAUSALE, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMBOLLO, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMUFFILIQ, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARADATARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSTART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSTIPEND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMNEWSTAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARATIPORITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITACAREN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCUMULAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARIMPDANOVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARACODIBENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMINEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSCADENZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMUFFILIQ, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue())
      {
        if (NUMEDIGITEST.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (NUMEDIGITEST.equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Scegli Soggetto
  // **********************************************************************
  public int ApriScegliSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "ApriScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
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
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Tipo Ritenuta Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_TIPORITENUTA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipo Ritenuta Validate Event Body
      // Procedure Body
      // 
      // 
      // gestione mese - mese, Importo da non versare
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
          v_MSG1 = (new IDVariant("Ritenute del mese di", IDVariant.STRING));
          PAN_PARAMETRI.set_Header(Glb.OBJ_FIELD,PFL_PARAMETRI_RITEDELMESDI, new IDVariant(v_MSG1).stringValue());
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE, 0, (new IDVariant()));
        }
        else
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(3)), true))
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Ritenute del mese da", IDVariant.STRING));
            PAN_PARAMETRI.set_Header(Glb.OBJ_FIELD,PFL_PARAMETRI_RITEDELMESDI, new IDVariant(v_MSG).stringValue());
          }
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0, (new IDVariant()));
        }
      }
      // 
      // gestione checkbox carico ente
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(3)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, 0, (new IDVariant("NO")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, 0, (new IDVariant("SI")));
        }
      }
      // 
      // gestione checkbox cumulativa
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(2)), true))
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, 0).equals((new IDVariant("NO")), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT, 0, (new IDVariant(0)));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT, 0, (new IDVariant(0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "TipoRitenutaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYLIQDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYLIQA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STATOSIOPE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // gestione errori bloccanti
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Specificare il Beneficiario !", IDVariant.STRING));
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0)))
          {
            MainFrm.set_AlertMessage(v_MSG); 
            return 0;
          }
        }
        else
        {
          // 
          // se ritenute=addizionale
          // 
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEIMEA, 0), true)>0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Intervallo di mesi non corretto !", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            return 0;
          }
          // 
          // controllo se non sono presneti causali relative all'addizionale
          // 
          {
            IDVariant v_PRESENTI = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);
            v_TIPO = (new IDVariant("A", IDVariant.STRING));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  T59 A ");
            SQL.append("where (A.TIPO = " + IDL.CSql(v_TIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_PRESENTI = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_PRESENTI.equals((new IDVariant(0)), true))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Non sono presenti causali relative all'Addizionale", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
          }
        }
      }
      // 
      // gestione errori non bloccanti
      // 
      {
        // 
        // controllo se tipo ritenute= irpef e  anno_imp < esercizio
        // 
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true))
          {
            IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  T59 A ");
            SQL.append("where (A.ANNO_IMP < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_COUNT.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Sono presenti causali I.R.Pe.F. inputate ad impegni a residuo. Si conferma l'elaborazione ?", IDVariant.STRING));
              if (!(MainFrm.MessageConfirm(v_MSG)))
              {
                return 0;
              }
            }
          }
        }
        // 
        // controllo se tipo_ritenute= addizionale e tipo=A e anno_imp < esercizio
        // 
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(3)), true))
          {
            IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);
            v_TIPO = (new IDVariant("A", IDVariant.STRING));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  T59 A ");
            SQL.append("where (A.ANNO_IMP < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.TIPO = " + IDL.CSql(v_TIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_COUNT.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("\"Sono presenti causali I.R.Pe.F. imputate ad impegni a residuo. Si conferma l'elaborazione?", IDVariant.STRING));
              if (!(MainFrm.MessageConfirm(v_MSG)))
              {
                return 0;
              }
            }
          }
        }
        // 
        // controllo se tipo ritenute= previdenziale e anno_imp < esercizio
        // 
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(2)), true))
          {
            IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  T83 A ");
            SQL.append("where (A.ANNO_IMP_CP < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_COUNT.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Sono presenti causali I.N.P.S. inputate ad impegni a residuo. Si conferma l'elaborazione?", IDVariant.STRING));
              if (!(MainFrm.MessageConfirm(v_MSG)))
              {
                return 0;
              }
            }
          }
        }
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      // 
      // eseguo procedura
      // 
      {
        IDVariant v_MYDATADAL = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_MYDATAA1 = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_TMP = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_MESEA = new IDVariant(0,IDVariant.INTEGER);
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(3)), true))
        {
          v_MESEA = IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEIMEA, 0);
        }
        else
        {
          v_MESEA = IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0);
        }
        // 
        // calcolo alcune variabili
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  TO_DATE((1)||'/'||(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy') as TDSEPRDMDLVR ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYDATADAL = QV.Get("TDSEPRDMDLVR", IDVariant.DATETIME) ;
          }
          QV.Close();
          v_TMP = IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_MESEA, (new IDVariant(1)));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  TO_DATE((TO_NUMBER(TO_CHAR(LAST_DAY(" + IDL.CSql(v_TMP, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + "), 'dd')))||'/'||(" + IDL.CSql(v_MESEA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy') as TODASEMADLDT ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYDATAA1 = QV.Get("TODASEMADLDT", IDVariant.DATETIME) ;
          }
          QV.Close();
        }
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.RITPAGAMENTOIRPEF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(v_MYDATADAL), IDL.ToString(v_MYDATAA1), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, 0), IDL.ToString((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), v_MYLIQDA, v_MYLIQA, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, 0), v_STATOSIOPE);
        }
        else
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(3)), true))
          {
            MainFrm.Cf4armDBObject.RITPAGAMENTOADDIZIONALE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(v_MYDATADAL), IDL.ToString(v_MYDATAA1), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, 0), IDL.ToString((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARIMPDANOVE, 0), v_MYLIQDA, v_MYLIQA, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, 0), v_STATOSIOPE);
          }
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARATIPORITE, 0).equals((new IDVariant(2)), true))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITACAREN, 0).equals((new IDVariant("NO")), true))
            {
              MainFrm.Cf4armDBObject.RITPAGAMENTOINPS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(v_MYDATADAL), IDL.ToString(v_MYDATAA1), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCUMULAT, 0), IDL.ToString((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), v_MYLIQDA, v_MYLIQA, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, 0), v_STATOSIOPE);
            }
            else
            {
              MainFrm.Cf4armDBObject.RITPAGAMENTOINPSCE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(v_MYDATADAL), IDL.ToString(v_MYDATAA1), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCAUSALE, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMBOLLO, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFICIO, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, 0), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARRITDEMEDA, 0)), v_MYLIQDA, v_MYLIQA, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMUFFILIQ, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMCOMMISS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAINFOTESO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSPESE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMSCADENZ, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMALLEGAT, 0), v_STATOSIOPE);
            }
          }
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).equals((new IDVariant("")), true))
      {
        IDVariant v_STATOSIOPE1 = new IDVariant(0,IDVariant.STRING);
        v_STATOSIOPE1 = (new IDVariant("Attenzione: sono stati emesse liquidazioni senza Codice Gestionale.", IDVariant.STRING));
        IDVariant v_MSGP1 = new IDVariant(0,IDVariant.STRING);
        v_MSGP1 = (new IDVariant("Operazione eseguita. Emesse liquidazioni da ", IDVariant.STRING));
        IDVariant v_MSGP2 = new IDVariant(0,IDVariant.STRING);
        v_MSGP2 = (new IDVariant(" a ", IDVariant.STRING));
        if (!(v_STATOSIOPE.equals((new IDVariant(1)), true)))
        {
          v_STATOSIOPE1 = (new IDVariant(""));
        }
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_BLOCCNONBLOC = null;
        v_BLOCCNONBLOC = (new IDVariant());
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARAMINEMISS, 0).equals((new IDVariant(1)), true))
        {
          v_BLOCCNONBLOC = new IDVariant(MainFrm.CONCASLIQEMI);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BIL A, ");
          SQL.append("  LIQ B ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
          SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
          SQL.append("and   (B.ANNO_LIQ = A.ESERCIZIO) ");
          SQL.append("and   ((B.NUMERO_LIQ BETWEEN " + IDL.CSql(v_MYLIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(v_MYLIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (NOT ((B.ANNO_MAND IS NULL))) ");
          SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,CASE WHEN NOT ((" + IDL.CSql(MainFrm.CONTRCASSLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN 'LI' ELSE 'EM' END) < 0) ");
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
          SQL.append("  BIL A, ");
          SQL.append("  LIQ B ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
          SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
          SQL.append("and   (B.ANNO_LIQ = A.ESERCIZIO) ");
          SQL.append("and   ((B.NUMERO_LIQ BETWEEN " + IDL.CSql(v_MYLIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(v_MYLIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,CASE WHEN NOT ((" + IDL.CSql(MainFrm.CONTRCASSLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN 'LI' ELSE 'EM' END) < 0) ");
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
            MainFrm.Cf4armDBObject.RollbackTrans();
            MainFrm.set_AlertMessage(v_S1); 
            return 0;
          }
          else
          {
            IDVariant v_RISP = null;
            v_RISP = (new IDVariant(MainFrm.MessageConfirmEx(S)));
            if (IDL.IsNull(v_RISP))
            {
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
            if (v_RISP.equals((new IDVariant(-1)), true))
            {
              MainFrm.Cf4armDBObject.CommitTrans();
            }
            else
            {
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
            IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETDAL, 0, new IDVariant(v_MYLIQDA));
            IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTAL, 0, new IDVariant(v_MYLIQA));
            IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTES, 0, (new IDVariant("S")));
            MainFrm.Show(MyGlb.FRM_CACODINEDAAL, (new IDVariant(-1)).intValue(), this); 
          }
        }
        else
        {
          MainFrm.Cf4armDBObject.CommitTrans();
        }
        if (v_MYLIQDA.compareTo(v_MYLIQA, true)<=0)
        {
          IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
          v_MSG1 = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSGP1, IDL.ToString(v_MYLIQDA)), v_MSGP2), IDL.ToString(v_MYLIQA)), (new IDVariant(" "))), v_STATOSIOPE1);
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_STATOSIOPE1)); 
        }
        else
        {
          IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
          v_MSG1 = (new IDVariant("Operazione eseguita. Non sono state emesse liquidazioni", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG1); 
        }
      }
      else
      {
        // 
        // si è verificato un errore di db
        // 
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Digita Testo1
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriDigitaTesto1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Digita Testo1 Body
      // Procedure Body
      // 
      NUMEDIGITEST = (new IDVariant(1));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "ApriDigitaTesto1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Digita Testo 2
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriDigitaTesto2 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Digita Testo 2 Body
      // Procedure Body
      // 
      NUMEDIGITEST = (new IDVariant(2));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "ApriDigitaTesto2", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Beneficiario
  // **********************************************************************
  public int ApriInfoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Beneficiario Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI146, IMDBDef14.PQSL_PARAMETRI146_PARACODIBENE, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneVersamentoRitenute", "ApriInfoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUVERSRITE_PARAMETRI146() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI146_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI223, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI223, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI146_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI146_RS, 0, IMDBDef5.TBL_PARAMETRI223, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 0, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMBOLLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 1, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSTIPEND, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 2, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARATIPORITE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 3, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 4, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 5, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARRITACAREN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 6, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCUMULAT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 7, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARIMPDANOVE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 8, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARACODIBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 9, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCAUSALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 10, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 11, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 12, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSPESE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 13, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMSCADENZ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 14, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 15, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 16, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI146_RS, 17, 0, IMDBDef5.TBL_PARAMETRI223, IMDBDef5.FLD_PARAMETRI223_PARAMUFFILIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI223, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI223, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI223, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI146_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGBENELABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOBENELABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_AGGIUNGENOTE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDigitaTesto1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_AGGIUNGENOT2)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDigitaTesto2();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_TIPORITENUTA)
      {
        PFL_PARAMETRI_TIPORITENUTA_ValidateCell(Cancel);
      }
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
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, "5FB6207A-5319-4AA6-95D8-153C53BFE277");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, "Tipo Ritenuta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_FORM, 4, 3, 532, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, 0, 76);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPORITENUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, "455707E2-0CB6-42F4-B1C5-8AAA919D44EF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, "Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, -9999, 504, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 139, 532, 277, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, 0, 70);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, "BCA5AFBF-4D8F-41BB-8A78-89829B7F3FFB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, "Tipo Ritenuta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "4ADDA1A0-6E5F-487B-8F4A-E22BE3C2E249");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, "5BD41EFC-B27C-4D2A-87F9-4EBD7CCFFE86");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, "Ritenute del mese di");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "01D99F93-CFBC-4A5C-AF6A-0B300F04BB0D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "a");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "E399A930-94DA-4B15-8864-EC1C0DFB3324");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, "8EF34CE0-B4F3-425B-8D11-48B59CCABD0F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, "Ritenute a Carico Ente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, "7C1CC632-3D07-4054-9B51-C622BF94E047");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, "Importo Da Non Versare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, "D3ABCA7F-C1E9-407A-A939-E50AB80A7ACD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, "Cumulativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "61C0461A-2711-4A9A-AD16-850E0CC95825");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "Codice Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, "0152A00E-0804-431C-AD9C-404C7581C9D8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, "6A67DDFC-B0DE-47A0-B7F0-0DA39C5972D0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, "94869910-6AD7-447C-892C-CE899B36A8C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "6B62B636-72CF-43D4-9034-9BF6DE9C89F9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "Causale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "E68C4F0A-03FC-4355-9684-CD6F64AD97A8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "Bollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, "AF491E88-3817-4A4F-ADD3-0B8A80666F18");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "BE8EFDCF-855A-453D-BFA5-CD441604CDBB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "In Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "B960050D-C6B0-4CD4-84EA-C5E8183BF367");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "Spese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "5A5C98D7-5887-4928-9D3C-F0887B0C4045");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "Commissioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "DFFA06B3-3A83-46BF-90F0-FFD32EE53144");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "Scadenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "F2CB5E75-EF19-41CA-9D19-3D3CE54C9D19");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "Allegati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "C27203C8-96EA-4810-9E1D-3EE768D73E71");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "Info Tesoriere");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, "8B3E4C48-EBE6-4742-B792-9A00722E6F8C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, "Stipendi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "78C7392E-74B7-477D-8635-8AC1F4A56362");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "51A55EB4-9BDB-4290-ACFA-C404EA24E9BA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, "513E8E28-1FC9-41B5-8ECC-A7DFAEB22E10");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, 0, "testo1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, "672AE7A6-059B-448C-9F6B-BF2F59443435");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, 0, "testo1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_LIST, "Tipo Ritenuta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_FORM, 156, 28, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORITENUTA, MyGlb.PANEL_FORM, "Tp. Riten.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPORITENUTA, -1, GRP_PARAMETRI_TIPORITENUTA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPORITENUTA, PPQRY_PARAMETRI146, "A.PARATIPORITE", "PARATIPORITE", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORITENUTA, (new IDVariant(1)), "I.R.P.E.F.", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORITENUTA, (new IDVariant(2)), "Previdenziale", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORITENUTA, (new IDVariant(3)), "Addizionale", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 96, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_TIPORITENUTA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_LIST, "Ritenute del mese di");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_FORM, 24, 64, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEDELMESDI, MyGlb.PANEL_FORM, "Ritenute del mese di");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RITEDELMESDI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RITEDELMESDI, PPQRY_PARAMETRI146, "A.PARRITDEMEDA", "PARRITDEMEDA", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEDELMESDI, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, "a");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 384, 64, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "a");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI146, "A.PARRITDEIMEA", "PARRITDEIMEA", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 92, 88, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI146, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_LIST, "Ritenute a Carico Ente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_FORM, 16, 112, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RITEACARIENT, MyGlb.PANEL_FORM, "Ritenute a Carico Ente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RITEACARIENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RITEACARIENT, PPQRY_PARAMETRI146, "A.PARRITACAREN", "PARRITACAREN", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEACARIENT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RITEACARIENT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_LIST, "Importo Da Non Versare");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_FORM, 8, 164, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_FORM, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPODANONVER, MyGlb.PANEL_FORM, "Importo Da Non Versare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPODANONVER, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPODANONVER, PPQRY_PARAMETRI146, "A.PARIMPDANOVE", "PARIMPDANOVE", 3, 2, 2, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_LIST, "Cumul.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_FORM, 72, 164, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CUMULATIVA, MyGlb.PANEL_FORM, "Cumulativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CUMULATIVA, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CUMULATIVA, PPQRY_PARAMETRI146, "A.PARAMCUMULAT", "PARAMCUMULAT", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CUMULATIVA, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CUMULATIVA, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, "C. Ben.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 428, 188, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, "C. Bn.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEBENEFI, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEBENEFI, PPQRY_PARAMETRI146, "A.PARACODIBENE", "PARACODIBENE", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, 52, 188, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENBENEFICIA, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENBENEFICIA, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENBENEFICIA", 5, 162, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.PANEL_LIST, 308, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.PANEL_FORM, 492, 192, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENELABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGBENELABE, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGBENELABE, -1, "", "SCEGBENELABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.PANEL_LIST, 324, 4, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.PANEL_FORM, 512, 192, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENELABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOBENELABE, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOBENELABE, -1, "", "INFOBENELABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 84, 212, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAUSALE, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAUSALE, PPQRY_PARAMETRI146, "A.PARAMCAUSALE", "PARAMCAUSALE", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 100, 236, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLO, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLO, PPQRY_PARAMETRI146, "A.PARAMBOLLO", "PARAMBOLLO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_FORM, 76, 260, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO1, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO1, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO1, PPQRY_PARAMETRI146, "A.PARAMUFFILIQ", "PARAMUFFILIQ", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 64, 284, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INEMISSIONE, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INEMISSIONE, PPQRY_PARAMETRI146, "A.PARAMINEMISS", "PARAMINEMISS", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 108, 308, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SPESE, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SPESE, PPQRY_PARAMETRI146, "A.PARAMSPESE", "PARAMSPESE", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 304, 308, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_COMMISSIONI, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_COMMISSIONI, PPQRY_PARAMETRI146, "A.PARAMCOMMISS", "PARAMCOMMISS", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 76, 332, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCADENZA, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCADENZA, PPQRY_PARAMETRI146, "A.PARAMSCADENZ", "PARAMSCADENZ", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 96, 356, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ALLEGATI, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ALLEGATI, PPQRY_PARAMETRI146, "A.PARAMALLEGAT", "PARAMALLEGAT", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 64, 380, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOTESORIER, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOTESORIER, PPQRY_PARAMETRI146, "A.PARAINFOTESO", "PARAINFOTESO", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, "Stipendi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, 20, 520, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, "Stip.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STIPENDI, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STIPENDI, PPQRY_PARAMETRI146, "A.PARAMSTIPEND", "PARAMSTIPEND", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 16, 400, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 520, 400, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB1, -1, GRP_PARAMETRI_LIQUIDAZIONE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 440, 432, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.PANEL_LIST, 420, 384, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.PANEL_FORM, 492, 356, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AGGIUNGENOTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AGGIUNGENOTE, -1, "", "AGGIUNGENOTE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.PANEL_LIST, 428, 392, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.PANEL_FORM, 492, 380, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AGGIUNGENOT2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AGGIUNGENOT2, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AGGIUNGENOT2, -1, "", "AGGIUNGENOT2", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PARACODIBENE~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BEN, PFL_PARAMETRI_CODICEBENEFI, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "BENBENEFICIA", "Beneficiario");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFICIO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUFFICIO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T54, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T54, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || TO_CHAR ( A.DESCRIZIONE ) as T58DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~PARAMCAUSALE~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMCAUSALE~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAMETRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || TO_CHAR ( A.DESCRIZIONE ) as T58DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~PARAMBOLLO~~) ");
    SQL.append("and   (A.TIPO = 'L' OR (A.TIPO IS NULL)) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.TIPO = 'L' OR (A.TIPO IS NULL)) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFILIQ~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUFFILIQ~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMIDEEX ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~PARAMSPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARAMETRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMIDEEX ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI146", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI146, IMDBDef14.PQRY_PARAMETRI146_RS, IMDBDef5.TBL_PARAMETRI223);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPORITENUTA, IMDBDef5.FLD_PARAMETRI223_PARATIPORITE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RITEDELMESDI, IMDBDef5.FLD_PARAMETRI223_PARRITDEMEDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI223_PARRITDEIMEA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI223_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RITEACARIENT, IMDBDef5.FLD_PARAMETRI223_PARRITACAREN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPODANONVER, IMDBDef5.FLD_PARAMETRI223_PARIMPDANOVE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CUMULATIVA, IMDBDef5.FLD_PARAMETRI223_PARAMCUMULAT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICEBENEFI, IMDBDef5.FLD_PARAMETRI223_PARACODIBENE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAUSALE, IMDBDef5.FLD_PARAMETRI223_PARAMCAUSALE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLO, IMDBDef5.FLD_PARAMETRI223_PARAMBOLLO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO1, IMDBDef5.FLD_PARAMETRI223_PARAMUFFILIQ);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INEMISSIONE, IMDBDef5.FLD_PARAMETRI223_PARAMINEMISS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SPESE, IMDBDef5.FLD_PARAMETRI223_PARAMSPESE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_COMMISSIONI, IMDBDef5.FLD_PARAMETRI223_PARAMCOMMISS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCADENZA, IMDBDef5.FLD_PARAMETRI223_PARAMSCADENZ);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ALLEGATI, IMDBDef5.FLD_PARAMETRI223_PARAMALLEGAT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INFOTESORIER, IMDBDef5.FLD_PARAMETRI223_PARAINFOTESO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STIPENDI, IMDBDef5.FLD_PARAMETRI223_PARAMSTIPEND);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI223");
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
