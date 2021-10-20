// **********************************************
// Dettaglio Del Puro
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettaglioDelPuro extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_STPUALNEDEFP = 0;

  private static int PFL_PARAMETRI_ESERCIZIPLU1 = 0;
  private static int PFL_PARAMETRI_STANZINIPURO = 1;
  private static int PFL_PARAMETRI_VARIAZIOPURO = 2;
  private static int PFL_PARAMETRI_STANZATTPURO = 3;
  private static int PFL_PARAMETRI_ETICHETITOLO = 4;
  private static int PFL_PARAMETRI_TOTPERANFIES = 5;
  private static int PFL_PARAMETRI_TOTPERANFICR = 6;
  private static int PFL_PARAMETRI_TOPECAANPLCR = 7;

  private static int PPQRY_PARAMETRI522 = 0;

  private static int PPQRY_BIL = 1;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_TAB;
  private static int GRP_DAESIGIBILIT_IMPEGNO = 0;
  private static int GRP_DAESIGIBILIT_IMPPROVENIEN = 1;

  private static int PFL_DAESIGIBILIT_ANNOESIGIBIL = 0;
  private static int PFL_DAESIGIBILIT_CAPITOLO3 = 1;
  private static int PFL_DAESIGIBILIT_ARTICOLO3 = 2;
  private static int PFL_DAESIGIBILIT_INFOCAPITOLO = 3;
  private static int PFL_DAESIGIBILIT_DESCRIZIONE1 = 4;
  private static int PFL_DAESIGIBILIT_NUMEROIMP = 5;
  private static int PFL_DAESIGIBILIT_ANNOIMP = 6;
  private static int PFL_DAESIGIBILIT_INFOIMPEGNO = 7;
  private static int PFL_DAESIGIBILIT_IMPORTO1 = 8;
  private static int PFL_DAESIGIBILIT_DDATAREG1 = 9;
  private static int PFL_DAESIGIBILIT_NUMERIMPPROV = 10;
  private static int PFL_DAESIGIBILIT_ANNOIMPPROVE = 11;
  private static int PFL_DAESIGIBILIT_INFOIMPEPROV = 12;
  private static int PFL_DAESIGIBILIT_BILVAR1 = 13;
  private static int PFL_DAESIGIBILIT_INFOBILVAR = 14;
  private static int PFL_DAESIGIBILIT_CODICEUO1 = 15;
  private static int PFL_DAESIGIBILIT_DESCRIZIONUO = 16;
  private static int PFL_DAESIGIBILIT_ANNOIMPEPAD1 = 17;
  private static int PFL_DAESIGIBILIT_ETICHETOTAL1 = 18;
  private static int PFL_DAESIGIBILIT_TOTALEDAESI1 = 19;
  private static int PFL_DAESIGIBILIT_PROGRESSIVO1 = 20;
  private static int PFL_DAESIGIBILIT_PROGUNITORG1 = 21;

  private static int PPQRY_FPVESIBPRDE2 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_UNITAORGANIZ = 2;


  IDPanel PAN_DAESIGIBILIT;
  private static int PFL_DAESIGTOTFIN_IMPORTO3 = 0;
  private static int PFL_DAESIGTOTFIN_ANNOIMPEPADR = 1;
  private static int PFL_DAESIGTOTFIN_TOTALEDAESIG = 2;

  private static int PPQRY_FPVESIBPRDEP = 0;


  IDPanel PAN_DAESIGTOTFIN;
  private static int GRP_DACRONOPROGR_OPERAPROGETT = 0;
  private static int GRP_DACRONOPROGR_FINANZIAMENT = 1;

  private static int PFL_DACRONOPROGR_CRONOPROGRID = 0;
  private static int PFL_DACRONOPROGR_VARCOMPROGRE = 1;
  private static int PFL_DACRONOPROGR_CAPITOLO1 = 2;
  private static int PFL_DACRONOPROGR_ARTICOLO1 = 3;
  private static int PFL_DACRONOPROGR_DESCRIZIONE2 = 4;
  private static int PFL_DACRONOPROGR_OPERA = 5;
  private static int PFL_DACRONOPROGR_DESCRIZOPERA = 6;
  private static int PFL_DACRONOPROGR_ESERCIZIPLU2 = 7;
  private static int PFL_DACRONOPROGR_IMPORTO2 = 8;
  private static int PFL_DACRONOPROGR_DDATAREG = 9;
  private static int PFL_DACRONOPROGR_BILVAR = 10;
  private static int PFL_DACRONOPROGR_INFOVARBIL = 11;
  private static int PFL_DACRONOPROGR_CODICEUO = 12;
  private static int PFL_DACRONOPROGR_UNITAORGANIZ = 13;
  private static int PFL_DACRONOPROGR_ANNOFINANZ1 = 14;
  private static int PFL_DACRONOPROGR_FINANZIAMENT = 15;
  private static int PFL_DACRONOPROGR_FINANZDESCRI = 16;
  private static int PFL_DACRONOPROGR_ETICHETOTALE = 17;
  private static int PFL_DACRONOPROGR_TOTALDACRON1 = 18;
  private static int PFL_DACRONOPROGR_PROGUNITORGA = 19;

  private static int PPQRY_CROESIBPRDE2 = 0;

  private static int PPQRY_CAPUO = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_FINANZIAMENT = 3;


  IDPanel PAN_DACRONOPROGR;
  private static int PFL_DACRONTOTFIN_IMPORTO4 = 0;
  private static int PFL_DACRONTOTFIN_ANNOFINANZ = 1;
  private static int PFL_DACRONTOTFIN_TOTALDACRON2 = 2;

  private static int PPQRY_CROESIBPRDE1 = 0;


  IDPanel PAN_DACRONTOTFIN;
  private static int PFL_DACRONTOTCAP_CAPITOLO = 0;
  private static int PFL_DACRONTOTCAP_ARTICOLO = 1;
  private static int PFL_DACRONTOTCAP_DESCRIZIONE = 2;
  private static int PFL_DACRONTOTCAP_ESERCIZIPLUR = 3;
  private static int PFL_DACRONTOTCAP_IMPORTO = 4;
  private static int PFL_DACRONTOTCAP_TOTALDACRONO = 5;

  private static int PPQRY_CROESIBPRDEP = 0;


  IDPanel PAN_DACRONTOTCAP;

  // Definition of Global Variables
  private IDVariant ESERCIZIO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI546(IMDB);
    //
    //
    Init_PQRY_PARAMETRI522(IMDB);
    Init_PQRY_PARAMETRI522_RS(IMDB);
    Init_PQRY_FPVESIBPRDE2(IMDB);
    Init_PQRY_FPVESIBPRDEP(IMDB);
    Init_PQRY_CROESIBPRDE2(IMDB);
    Init_PQRY_CROESIBPRDE1(IMDB);
    Init_PQRY_CROESIBPRDEP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI546(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI546, 6);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI546, "TBL_PARAMETRI546");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFE, "NOOGTOPEANFE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFC, "NOOGTOPEANFC");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFC,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO, "NOOGTOPEAFCO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPECAPC, "NOOGTOPECAPC");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPECAPC,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPCAPCO, "NOOGTOPCAPCO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI546,IMDBDef7.FLD_PARAMETRI546_NOOGTOPCAPCO,5,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI546, 0);
  }

  private static void Init_PQRY_PARAMETRI522(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI522, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI522, "PQRY_PARAMETRI522");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFE, "NOOGTOPEANFE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC, "NOOGTOPEANFC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC, "NOOGTOPECAPC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI522, 0);
  }

  private static void Init_PQRY_PARAMETRI522_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI522_RS, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI522_RS, "PQRY_PARAMETRI522_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFE, "NOOGTOPEANFE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC, "NOOGTOPEANFC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC, "NOOGTOPECAPC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI522_RS,IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC,5,2,0);
  }

  private static void Init_PQRY_FPVESIBPRDE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FPVESIBPRDE2, 14);
    IMDB.set_TblCode(IMDBDef17.PQRY_FPVESIBPRDE2, "PQRY_FPVESIBPRDE2");
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESNUIM, "REFPDAESNUIM");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESNUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIM, "REFPDAESANIM");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESCA, "RECFPVDAESCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESAR, "RECFPVDAESAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESDECA, "REFPDAESDECA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESDECA,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANES, "REFPDAESANES");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANES,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESIM, "RECFPVDAESIM");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESIM,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESDDAR, "REFPDAESDDAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESDDAR,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESNUIP, "REFPDAESNUIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESNUIP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIP, "REFPDAESANIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECORDBILVAR, "RECORDBILVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_RECORDBILVAR,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESPRVA, "REFPDAESPRVA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESPRVA,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_ANNOIMPEPADR, "ANNOIMPEPADR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_ANNOIMPEPADR,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESPRUO, "REFPDAESPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDE2,IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESPRUO,1,8,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FPVESIBPRDE2, 0);
  }

  private static void Init_PQRY_FPVESIBPRDEP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FPVESIBPRDEP, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_FPVESIBPRDEP, "PQRY_FPVESIBPRDEP");
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDEP,IMDBDef17.PQSL_FPVESIBPRDEP_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDEP,IMDBDef17.PQSL_FPVESIBPRDEP_IMPORTO,2,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVESIBPRDEP,IMDBDef17.PQSL_FPVESIBPRDEP_ANNOIMPEPADR, "ANNOIMPEPADR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVESIBPRDEP,IMDBDef17.PQSL_FPVESIBPRDEP_ANNOIMPEPADR,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FPVESIBPRDEP, 0);
  }

  private static void Init_PQRY_CROESIBPRDE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CROESIBPRDE2, 14);
    IMDB.set_TblCode(IMDBDef17.PQRY_CROESIBPRDE2, "PQRY_CROESIBPRDE2");
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRCRID, "REFPDACRCRID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRCRID,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRCA, "RECFPVDACRCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRAR, "RECFPVDACRAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRDECC, "REFPDACRDECC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRDECC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACROP, "RECFPVDACROP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACROP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECOOPERDESC, "RECOOPERDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECOOPERDESC,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRESPL, "REFPDACRESPL");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRESPL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRIM, "RECFPVDACRIM");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRIM,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRDAVA, "REFPDACRDAVA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRDAVA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECORDBILVAR, "RECORDBILVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECORDBILVAR,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRPRVA, "REFPDACRPRVA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRPRVA,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRANFI, "REFPDACRANFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRANFI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRFI, "RECFPVDACRFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECFPVDACRFI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECPROUNIORG, "RECPROUNIORG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE2,IMDBDef17.PQSL_CROESIBPRDE2_RECPROUNIORG,1,8,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CROESIBPRDE2, 0);
  }

  private static void Init_PQRY_CROESIBPRDE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CROESIBPRDE1, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_CROESIBPRDE1, "PQRY_CROESIBPRDE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE1,IMDBDef17.PQSL_CROESIBPRDE1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE1,IMDBDef17.PQSL_CROESIBPRDE1_IMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE1,IMDBDef17.PQSL_CROESIBPRDE1_REFPDACRANFI, "REFPDACRANFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE1,IMDBDef17.PQSL_CROESIBPRDE1_REFPDACRANFI,1,4,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CROESIBPRDE1, 0);
  }

  private static void Init_PQRY_CROESIBPRDEP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CROESIBPRDEP, 5);
    IMDB.set_TblCode(IMDBDef17.PQRY_CROESIBPRDEP, "PQRY_CROESIBPRDEP");
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_RECFPVDACRCA, "RECFPVDACRCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_RECFPVDACRCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_RECFPVDACRAR, "RECFPVDACRAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_RECFPVDACRAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_REFPDACRDECC, "REFPDACRDECC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_REFPDACRDECC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_REFPDACRESPL, "REFPDACRESPL");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_REFPDACRESPL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDEP,IMDBDef17.PQSL_CROESIBPRDEP_IMPORTO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CROESIBPRDEP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettaglioDelPuro(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettaglioDelPuro()
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
    FormIdx = MyGlb.FRM_DETTADELPURO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4C6FF7F5-258A-4333-BC73-7F14192BC240";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1040;
    DesignHeight = 526;
    set_Caption(new IDVariant("Dettaglio del Puro"));
    //
    Frames = new AFrame[9];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1040;
    Frames[1].Height = 500;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.192;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1040;
    Frames[2].Height = 96;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1040;
    Frames[2].FixedHeight = 96;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 96-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CCD8503C-4FE0-4BCE-BF65-57776EEF6328");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 892, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1040;
    Frames[3].Height = 404;
    Frames[3].Caption = "Tab";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 404;
    TAB_TAB = new OTabView(this);
    Frames[3].Content = TAB_TAB;
    TAB_TAB.iGuid = "17982F5E-8136-40B1-AAEC-78691FB189E8";
    TAB_TAB.SetItemCount(5);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "da Esigibilità";
    Frames[4].Parent = this;
    PAN_DAESIGIBILIT = new IDPanel(w, this, 4, "PAN_DAESIGIBILIT");
    Frames[4].Content = PAN_DAESIGIBILIT;
    PAN_DAESIGIBILIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DAESIGIBILIT.VS = MainFrm.VisualStyleList;
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "704CF18C-EF5C-4E6A-A2F9-67C641BC1142");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1100, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DAESIGIBILIT.InitStatus = 2;
    PAN_DAESIGIBILIT_Init();
    PAN_DAESIGIBILIT_InitFields();
    PAN_DAESIGIBILIT_InitQueries();
    TAB_TAB.SetItem(1, Frames[4], 0, "", "da Esigibilita", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "da Esigibilità";
    Frames[5].Parent = this;
    PAN_DAESIGTOTFIN = new IDPanel(w, this, 5, "PAN_DAESIGTOTFIN");
    Frames[5].Content = PAN_DAESIGTOTFIN;
    PAN_DAESIGTOTFIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DAESIGTOTFIN.VS = MainFrm.VisualStyleList;
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DAESIGTOTFIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5E865AC3-A505-4627-ADE1-BE773E80509F");
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DAESIGTOTFIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DAESIGTOTFIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DAESIGTOTFIN.InitStatus = 2;
    PAN_DAESIGTOTFIN_Init();
    PAN_DAESIGTOTFIN_InitFields();
    PAN_DAESIGTOTFIN_InitQueries();
    TAB_TAB.SetItem(2, Frames[5], 0, "", "da Esigibilita Tot Fin", "");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[6].InTabbed = true;
    Frames[6].Caption = "da Cronoprogramma";
    Frames[6].Parent = this;
    PAN_DACRONOPROGR = new IDPanel(w, this, 6, "PAN_DACRONOPROGR");
    Frames[6].Content = PAN_DACRONOPROGR;
    PAN_DACRONOPROGR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DACRONOPROGR.VS = MainFrm.VisualStyleList;
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "86808CA1-2A27-4EB1-AAF2-756F79EFFA4F");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1264, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DACRONOPROGR.InitStatus = 2;
    PAN_DACRONOPROGR_Init();
    PAN_DACRONOPROGR_InitFields();
    PAN_DACRONOPROGR_InitQueries();
    TAB_TAB.SetItem(3, Frames[6], 0, "", "da Cronoprogramma", "");
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[7].InTabbed = true;
    Frames[7].Caption = "da Cronoprogramma";
    Frames[7].Parent = this;
    PAN_DACRONTOTFIN = new IDPanel(w, this, 7, "PAN_DACRONTOTFIN");
    Frames[7].Content = PAN_DACRONTOTFIN;
    PAN_DACRONTOTFIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DACRONTOTFIN.VS = MainFrm.VisualStyleList;
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DACRONTOTFIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "78473812-174B-4063-8CF8-DA5D0072D433");
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DACRONTOTFIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DACRONTOTFIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DACRONTOTFIN.InitStatus = 2;
    PAN_DACRONTOTFIN_Init();
    PAN_DACRONTOTFIN_InitFields();
    PAN_DACRONTOTFIN_InitQueries();
    TAB_TAB.SetItem(4, Frames[7], 0, "", "da Cronoprogramma Tot fin", "");
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    Frames[8].InTabbed = true;
    Frames[8].Caption = "da Cronoprogramma";
    Frames[8].Parent = this;
    PAN_DACRONTOTCAP = new IDPanel(w, this, 8, "PAN_DACRONTOTCAP");
    Frames[8].Content = PAN_DACRONTOTCAP;
    PAN_DACRONTOTCAP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DACRONTOTCAP.VS = MainFrm.VisualStyleList;
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "17767C3A-D389-4077-9115-BC737B3E24ED");
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 320, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DACRONTOTCAP.InitStatus = 2;
    PAN_DACRONTOTCAP_Init();
    PAN_DACRONTOTCAP_InitFields();
    PAN_DACRONTOTCAP_InitQueries();
    TAB_TAB.SetItem(5, Frames[8], 0, "", "da Cronoprogramma Tot Cap", "");
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI546, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DETTADELPURO_PARAMETRI522();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DAESIGIBILIT.UpdatePanel(MainFrm);
      PAN_DAESIGTOTFIN.UpdatePanel(MainFrm);
      PAN_DACRONOPROGR.UpdatePanel(MainFrm);
      PAN_DACRONTOTFIN.UpdatePanel(MainFrm);
      PAN_DACRONTOTCAP.UpdatePanel(MainFrm);
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
    return (obj instanceof DettaglioDelPuro);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettaglioDelPuro.class.getName() : (Glb.ClassWithPackage(DettaglioDelPuro.class) ? DettaglioDelPuro.class.getName().substring(DettaglioDelPuro.class.getPackage().getName().length() + 1) : DettaglioDelPuro.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TOTPERANFIES)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFE, 0).equals((new IDVariant("SI")), true))
        {
          PAN_DAESIGTOTFIN.set_Visible((new IDVariant(-1)).booleanValue());
          TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DAESIGTOTFIN.FrIndex)).intValue()); 
          PAN_DAESIGIBILIT.set_Visible((new IDVariant(0)).booleanValue());
        }
        else
        {
          PAN_DAESIGIBILIT.set_Visible((new IDVariant(-1)).booleanValue());
          TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DAESIGIBILIT.FrIndex)).intValue()); 
          PAN_DAESIGTOTFIN.set_Visible((new IDVariant(0)).booleanValue());
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TOTPERANFICR)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC, 0).equals((new IDVariant("SI")), true))
          {
            IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPCAPCO, 0, (new IDVariant()));
            PAN_DACRONTOTFIN.set_Visible((new IDVariant(-1)).booleanValue());
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DACRONTOTFIN.FrIndex)).intValue()); 
            PAN_DACRONOPROGR.set_Visible((new IDVariant(0)).booleanValue());
            PAN_DACRONTOTCAP.set_Visible((new IDVariant(0)).booleanValue());
          }
          else
          {
            PAN_DACRONOPROGR.set_Visible((new IDVariant(-1)).booleanValue());
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DACRONOPROGR.FrIndex)).intValue()); 
            PAN_DACRONTOTFIN.set_Visible((new IDVariant(0)).booleanValue());
          }
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TOPECAANPLCR)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPCAPCO, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC, 0).equals((new IDVariant("SI")), true))
          {
            IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPEANFC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO, 0, (new IDVariant()));
            PAN_DACRONTOTCAP.set_Visible((new IDVariant(-1)).booleanValue());
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DACRONTOTCAP.FrIndex)).intValue()); 
            PAN_DACRONOPROGR.set_Visible((new IDVariant(0)).booleanValue());
            PAN_DACRONTOTFIN.set_Visible((new IDVariant(0)).booleanValue());
          }
          else
          {
            PAN_DACRONOPROGR.set_Visible((new IDVariant(-1)).booleanValue());
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DACRONOPROGR.FrIndex)).intValue()); 
            PAN_DACRONTOTFIN.set_Visible((new IDVariant(0)).booleanValue());
            PAN_DACRONTOTCAP.set_Visible((new IDVariant(0)).booleanValue());
          }
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPCAPCO, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI522, IMDBDef17.PQSL_PARAMETRI522_NOOGTOPECAPC, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Tab Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_TAB_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tab Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DAESIGIBILIT.FrIndex)), true) || new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DAESIGTOTFIN.FrIndex)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACRONOPROGR.FrIndex)), true) || new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACRONTOTFIN.FrIndex)), true) || new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACRONTOTCAP.FrIndex)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "TabChangePage", _e);
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
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOMOGGESEPLU, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFE, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFC, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO, 0, (new IDVariant("SI")));
      // 
      // Metto l'esercizio nella variabile per problemi nella
      // group by della query
      // 
      ESERCIZIO = IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0);
      PAN_DACRONTOTFIN_InitQueries();
      PAN_DAESIGIBILIT.set_Visible((new IDVariant(0)).booleanValue());
      PAN_DACRONOPROGR.set_Visible((new IDVariant(0)).booleanValue());
      PAN_DAESIGTOTFIN.set_Visible((new IDVariant(-1)).booleanValue());
      PAN_DACRONTOTFIN.set_Visible((new IDVariant(-1)).booleanValue());
      PAN_DACRONTOTCAP.set_Visible((new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "Load", _e);
    }
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.Form_Activate(this);
      // 
      // Activate Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOBIL, 0, false)!=null))
      {
        MainFrm.GetForm(MyGlb.FRM_SCHEDINFOBIL,0).set_WindowState((new IDVariant(0)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "Activate", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOMOGGESEPLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEAFCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPECAPC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPCAPCO, 0, new IDVariant());
  }

  // **********************************************************************
  // da Esigibilita On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DAESIGIBILIT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DAESIGIBILIT);
      // 
      // da Esigibilita On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESCRIZIONE1,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_DESCRIZIONE1))).stringValue()); 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_CODICEUO1,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_CODICEUO1))).stringValue()); 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESCRIZIONUO,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_DESCRIZIONUO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daEsigibilitaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // da Esigibilita On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DAESIGIBILIT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Esigibilita On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.STRING);
          v_NUMEROIMP = (new IDVariant("Numero Imp."));
          IDVariant v_NUMERIMPPROV = new IDVariant(0,IDVariant.STRING);
          v_NUMERIMPPROV = (new IDVariant("Numero Imp. Prov."));
          IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.STRING);
          v_ANNOIMP = (new IDVariant("Anno Imp."));
          IDVariant v_ANNOIMPPROV = new IDVariant(0,IDVariant.STRING);
          v_ANNOIMPPROV = (new IDVariant("Anno Imp. Prov."));
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMEROIMP, new IDVariant(v_NUMEROIMP).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMP, new IDVariant(v_ANNOIMP).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMERIMPPROV, new IDVariant(v_NUMERIMPPROV).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMPPROVE, new IDVariant(v_ANNOIMPPROV).stringValue());
          new IDVariant(PAN_DAESIGIBILIT.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMEROIMP, (new IDVariant("Numero")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMP, (new IDVariant("Anno")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMERIMPPROV, (new IDVariant("Numero")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMPPROVE, (new IDVariant("Anno")).stringValue());
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daEsigibilitaOnCommand", _e);
    }
  }

  // **********************************************************************
  // da Esigibilita After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DAESIGIBILIT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Esigibilita After Find Body
      // Corpo Procedura
      // 
      PAN_DAESIGIBILIT.set_FieldText(PFL_DAESIGIBILIT_TOTALEDAESI1, IDL.Format(IDL.NullValue(PAN_DAESIGIBILIT.GetFieldSum(PFL_DAESIGIBILIT_IMPORTO1),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daEsigibilitaAfterFind", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DACRONOPROGR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DACRONOPROGR);
      // 
      // da Cronoprogramma On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_UNITAORGANIZ,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_UNITAORGANIZ))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESCRIZOPERA,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_DESCRIZOPERA))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZDESCRI,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_FINANZDESCRI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daCronoprogrammaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DACRONOPROGR_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          IDVariant v_CODOPERA = new IDVariant(0,IDVariant.STRING);
          v_CODOPERA = (new IDVariant("Cod. Opera"));
          IDVariant v_CODFINANZIAM = new IDVariant(0,IDVariant.STRING);
          v_CODFINANZIAM = (new IDVariant("Cod. Finanziamento"));
          IDVariant v_DESCOPERA = new IDVariant(0,IDVariant.STRING);
          v_DESCOPERA = (new IDVariant("Desc. Opera"));
          IDVariant v_DESCFINANZIA = new IDVariant(0,IDVariant.STRING);
          v_DESCFINANZIA = (new IDVariant("Desc. Finanziamento"));
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_OPERA, new IDVariant(v_CODOPERA).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESCRIZOPERA, new IDVariant(v_DESCOPERA).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZIAMENT, new IDVariant(v_CODFINANZIAM).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZDESCRI, new IDVariant(v_DESCFINANZIA).stringValue());
          new IDVariant(PAN_DACRONOPROGR.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_OPERA, (new IDVariant("Codice")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESCRIZOPERA, (new IDVariant("Descrizione")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZIAMENT, (new IDVariant("Codice")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZDESCRI, (new IDVariant("Descrizione")).stringValue());
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daCronoprogrammaOnCommand", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DACRONOPROGR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma After Find Body
      // Corpo Procedura
      // 
      PAN_DACRONOPROGR.set_FieldText(PFL_DACRONOPROGR_TOTALDACRON1, IDL.Format(IDL.NullValue(PAN_DACRONOPROGR.GetFieldSum(PFL_DACRONOPROGR_IMPORTO2),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daCronoprogrammaAfterFind", _e);
    }
  }

  // **********************************************************************
  // DUAL Info Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Impegno Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIM, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, ((IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIM, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)?(new IDVariant("R")):(new IDVariant("INFO"))));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIM, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESNUIM, 0));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "DUALInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Capitolo Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESCA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESCA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_RECFPVDAESAR, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno Prov
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegnoProv ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Prov Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, ((IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)?(new IDVariant("R")):(new IDVariant("INFO"))));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESANIP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESNUIP, 0));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "InfoImpegnoProv", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Bil Var Esig
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoBilVarEsig ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Bil Var Esig Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_RECORDBILVAR, 0).equals((new IDVariant("V")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0, IMDB.Value(IMDBDef17.PQRY_FPVESIBPRDE2, IMDBDef17.PQSL_FPVESIBPRDE2_REFPDAESPRVA, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, 0, (new IDVariant("E")));
        MainFrm.Show(MyGlb.FRM_INFOVARICRON, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "InfoBilVarEsig", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Var Bil Crono
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoVarBilCrono ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Var Bil Crono Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_CROESIBPRDE2, IMDBDef17.PQSL_CROESIBPRDE2_RECORDBILVAR, 0).equals((new IDVariant("V")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0, new IDVariant(IMDB.Value(IMDBDef17.PQRY_CROESIBPRDE2, IMDBDef17.PQSL_CROESIBPRDE2_REFPDACRPRVA, 0),IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, 0, (new IDVariant("C")));
        MainFrm.Show(MyGlb.FRM_INFOVARICRON, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "InfoVarBilCrono", _e);
      return -1;
    }
  }

  // **********************************************************************
  // da Esigibilita Tot Fin After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DAESIGTOTFIN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Esigibilita Tot Fin After Find Body
      // Corpo Procedura
      // 
      PAN_DAESIGTOTFIN.set_FieldText(PFL_DAESIGTOTFIN_TOTALEDAESIG, IDL.Format(IDL.NullValue(PAN_DAESIGTOTFIN.GetFieldSum(PFL_DAESIGTOTFIN_IMPORTO3),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daEsigibilitaTotFinAfterFind", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma Tot fin After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DACRONTOTFIN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma Tot fin After Find Body
      // Corpo Procedura
      // 
      PAN_DACRONTOTFIN.set_FieldText(PFL_DACRONTOTFIN_TOTALDACRON2, IDL.Format(IDL.NullValue(PAN_DACRONTOTFIN.GetFieldSum(PFL_DACRONTOTFIN_IMPORTO4),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daCronoprogrammaTotfinAfterFind", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma Tot Cap After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DACRONTOTCAP_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma Tot Cap After Find Body
      // Corpo Procedura
      // 
      PAN_DACRONTOTCAP.set_FieldText(PFL_DACRONTOTCAP_TOTALDACRONO, IDL.Format(IDL.NullValue(PAN_DACRONTOTCAP.GetFieldSum(PFL_DACRONTOTCAP_IMPORTO),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDelPuro", "daCronoprogrammaTotCapAfterFind", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DETTADELPURO_PARAMETRI522() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI522_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI546, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI546, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI522_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI522_RS, 0, IMDBDef7.TBL_PARAMETRI546, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI522_RS, 0, 0, IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOMOGGESEPLU, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI522_RS, 1, 0, IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI522_RS, 2, 0, IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFC, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI522_RS, 3, 0, IMDBDef7.TBL_PARAMETRI546, IMDBDef7.FLD_PARAMETRI546_NOOGTOPECAPC, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI546, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI546, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI546, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI522_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_TAB_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DAESIGIBILIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DAESIGIBILIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DAESIGIBILIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DAESIGIBILIT, Cancel);
    // Stub
  }

  private void PAN_DAESIGIBILIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOIMPEPROV)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoProv();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOBILVAR)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBilVarEsig();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DAESIGIBILIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DAESIGIBILIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DAESIGIBILIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DAESIGTOTFIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DAESIGTOTFIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DAESIGTOTFIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DAESIGTOTFIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DAESIGTOTFIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DAESIGTOTFIN);
    // Stub
  }

  private void PAN_DAESIGTOTFIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DAESIGTOTFIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DAESIGTOTFIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DAESIGTOTFIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DACRONOPROGR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DACRONOPROGR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DACRONOPROGR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DACRONOPROGR, Cancel);
    // Stub
  }

  private void PAN_DACRONOPROGR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DACRONOPROGR_INFOVARBIL)
    {
      this.IdxPanelActived = this.PAN_DACRONOPROGR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVarBilCrono();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DACRONOPROGR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DACRONOPROGR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DACRONOPROGR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DACRONTOTFIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DACRONTOTFIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DACRONTOTFIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DACRONTOTFIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DACRONTOTFIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DACRONTOTFIN);
    // Stub
  }

  private void PAN_DACRONTOTFIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DACRONTOTFIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DACRONTOTFIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DACRONTOTFIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DACRONTOTCAP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DACRONTOTCAP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DACRONTOTCAP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DACRONTOTCAP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DACRONTOTCAP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DACRONTOTCAP);
    // Stub
  }

  private void PAN_DACRONTOTCAP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DACRONTOTCAP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DACRONTOTCAP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DACRONTOTCAP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, "72E3A8F4-5CDC-4C2F-A044-303DED1B8E3D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, "Stanz. Puro al netto del FPV");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, MyGlb.PANEL_LIST, 0, -9999, 148, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, MyGlb.PANEL_FORM, 152, 3, 684, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, 0, 154);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_STPUALNEDEFP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, "7EC80CC3-D44A-4E8A-8C9F-585A5EA35560");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, "Esercizio Plur.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, "B60AB5A2-5FBB-49EA-8CB4-B99CDD777D2E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, "Stanz. Iniziale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, "9AF680F5-AC69-46A3-812D-2FCA569730DB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, "E0A03B6E-842D-4AB2-AAF1-56E8903AA6D1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, "Stanz. Attuale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, "933B7242-51F4-4D8E-9527-4946089AF4A6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, "Dettaglio Composizione FPV");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, "4AFCAE53-EDBE-4C5E-981B-3024005802DC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, "Totali Per Anno Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, "B3423FA1-3BC3-40DB-B1B0-E47DC9E7709D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, "Totali Per Anno Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, "168ED066-3FE0-4061-98A7-4F0425EC690E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, "Totale per Capitolo/Anno Plur.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, "Esercizio Plur.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 16, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, "Esercizio Plur.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIPLU1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIPLU1, PPQRY_PARAMETRI522, "A.NOMOGGESEPLU", "NOMOGGESEPLU", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_LIST, "Stanz. Iniziale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_FORM, 156, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZINIPURO, MyGlb.PANEL_FORM, "Stanz. Iniziale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZINIPURO, -1, GRP_PARAMETRI_STPUALNEDEFP);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZINIPURO, PPQRY_BIL, "NVL(SUM(A.STN_INI_CO), 0) - (NVL(SUM(A.REISCRIZIONI_DA_IMP), 0) + NVL(SUM(A.REISCRIZIONI_DA_STN), 0))", "STANZINIPURO", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_FORM, 388, 28, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIOPURO, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZIOPURO, -1, GRP_PARAMETRI_STPUALNEDEFP);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZIOPURO, PPQRY_BIL, "NVL(SUM(A.VARIAZIONI_CO), 0) - (NVL(SUM(A.VARIAZIONI_REISCR_DA_IMP), 0) + NVL(SUM(A.VARIAZIONI_REISCR_DA_STN), 0))", "VARIAZIOPURO", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_LIST, "Stanz. Attuale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_FORM, 592, 28, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZATTPURO, MyGlb.PANEL_FORM, "Stanz. Attuale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZATTPURO, -1, GRP_PARAMETRI_STPUALNEDEFP);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZATTPURO, PPQRY_BIL, "(NVL(SUM(A.STN_INI_CO), 0) - (NVL(SUM(A.REISCRIZIONI_DA_IMP), 0) + NVL(SUM(A.REISCRIZIONI_DA_STN), 0))) + NVL(SUM(A.VARIAZIONI_CO), 0) - (NVL(SUM(A.VARIAZIONI_REISCR_DA_IMP), 0) + NVL(SUM(A.VARIAZIONI_REISCR_DA_STN), 0))", "STANZATTPURO", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_LIST, 8, 68, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_FORM, 8, 68, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETITOLO, -1, "", "ETICHETITOLO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_LIST, "Totali Per Anno Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_FORM, 188, 68, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_FORM, 180);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFIES, MyGlb.PANEL_FORM, "Totali Per Anno Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTPERANFIES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTPERANFIES, PPQRY_PARAMETRI522, "A.NOOGTOPEANFE", "NOOGTOPEANFE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERANFIES, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERANFIES, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_LIST, 152);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_LIST, "Totali Per Anno Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_FORM, 188, 68, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_FORM, 180);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERANFICR, MyGlb.PANEL_FORM, "Totali Per Anno Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTPERANFICR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTPERANFICR, PPQRY_PARAMETRI522, "A.NOOGTOPEANFC", "NOOGTOPEANFC", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERANFICR, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERANFICR, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_LIST, 180);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_LIST, "Totale per Capitolo/Anno Plur.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_FORM, 400, 68, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_FORM, 180);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPECAANPLCR, MyGlb.PANEL_FORM, "Totale per Capitolo/Anno Plur.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOPECAANPLCR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOPECAANPLCR, PPQRY_PARAMETRI522, "A.NOOGTOPECAPC", "NOOGTOPECAPC", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOPECAANPLCR, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOPECAANPLCR, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.STN_INI_CO), 0) - (NVL(SUM(A.REISCRIZIONI_DA_IMP), 0) + NVL(SUM(A.REISCRIZIONI_DA_STN), 0)) as STANZINIPURO, ");
    SQL.append("  NVL(SUM(A.VARIAZIONI_CO), 0) - (NVL(SUM(A.VARIAZIONI_REISCR_DA_IMP), 0) + NVL(SUM(A.VARIAZIONI_REISCR_DA_STN), 0)) as VARIAZIOPURO, ");
    SQL.append("  (NVL(SUM(A.STN_INI_CO), 0) - (NVL(SUM(A.REISCRIZIONI_DA_IMP), 0) + NVL(SUM(A.REISCRIZIONI_DA_STN), 0))) + NVL(SUM(A.VARIAZIONI_CO), 0) - (NVL(SUM(A.VARIAZIONI_REISCR_DA_IMP), 0) + NVL(SUM(A.VARIAZIONI_REISCR_DA_STN), 0)) as STANZATTPURO ");
    SQL.append("from ");
    SQL.append("  BIL A ");
    SQL.append("where (A.ESERCIZIO = ~~NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (GET_FPV_ESPL(~~NOMOGGESEPLU~~,TRUNC(TO_NUMBER(GET_CODICE(~~NOMOGGESEPLU~~,'S',A.CAPITOLO,A.ARTICOLO,4,'LIV')))) = 'NO') ");
    PAN_PARAMETRI.SetQuery(PPQRY_BIL, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BIL, "BIL");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI522", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI522, IMDBDef17.PQRY_PARAMETRI522_RS, IMDBDef7.TBL_PARAMETRI546);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIPLU1, IMDBDef7.FLD_PARAMETRI546_NOMOGGESEPLU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOTPERANFIES, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOTPERANFICR, IMDBDef7.FLD_PARAMETRI546_NOOGTOPEANFC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOPECAANPLCR, IMDBDef7.FLD_PARAMETRI546_NOOGTOPECAPC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI546");
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

  private void PAN_DAESIGIBILIT_Init()
  {

    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, "8C655F7D-2D6A-428E-AA51-E3CCB447EB03");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, "Impegno");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, MyGlb.PANEL_LIST, 240, -9999, 120, 16, 0, 0);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, MyGlb.PANEL_FORM, 0, 159, 172, 181, 0, 0);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 0, 51);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 1, 13);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 0, 4);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 1, 4);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, "A417CBEB-8177-4D73-918E-B2DA1B56E269");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, "Imp. Provenienza");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, MyGlb.PANEL_LIST, 556, -9999, 140, 16, 0, 0);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, MyGlb.PANEL_FORM, 0, 447, 664, 97, 0, 0);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 0, 99);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 1, 13);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 0, 4);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 1, 4);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, "B0F232A1-7F61-408F-9267-CE4563E28FEF");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, "A13CEFA5-AEA8-4675-90DA-61D34C32FFD9");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, "Capitolo");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.VIS_NOFIINLUHELE);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, "67F872D1-D6E0-4A2A-ADCE-69FD4A8EB6ED");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, "Art.");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, "3A8FAE35-BDCA-4A24-BF36-F09A0442509B");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, "FFCA7033-2215-485E-8B0D-52111CC9632A");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, "Descrizione Cap");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, "875ACFBD-BC64-4E3D-8A23-A56730810C53");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, "Numero");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, "656D9798-D079-4506-89C3-A3D6E00ECD6F");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, "Anno");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, "B4BBB63E-DECC-43B2-B1DA-14C7D994F45C");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, "2CFF9ACA-F1F6-45FF-8E00-AB91884728ED");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, "   Importo Variazione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, "040654B6-D307-4937-AB11-43B9B2EA7FB2");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, "Data Variazione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, "A6ABD728-AF41-4229-957A-383E500FF82F");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, "Numero");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, "4B69DA14-7EB7-4E6B-8022-184388E9E0C7");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, "Anno");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, "E802716E-C817-4B71-A1E3-56CFC5D97620");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, "76AE4ABD-CEA0-4EE8-B322-DDFBA3298396");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, "Bil. Var.");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, "27E43796-642A-428E-999C-AF8554A10076");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, "F2BA96C3-0553-49B0-884F-ECA2A618227C");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, "Codice UO");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, "B6D31D49-9CAF-43A9-A98B-828787C0CA13");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, "Unita Organizzativa");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, "9E3B2E2F-07FD-407C-859A-79F0459D5A43");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, "Anno Finanz.");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, "Anno del primo impegno di provenienza");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, "4D121661-3F85-4960-8E29-D4F8A79D4FD3");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, "Totale da Esigibilità");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.VIS_VUOTONORMALE);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, "78737E7D-211B-4A3E-BE3C-1388C8B3CF1D");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.VIS_CAMPTOTADISA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, "E3843DAE-715C-4FB3-9457-2D4044366FCA");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, "PROGRESSIVO");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, "925FFBC1-E3CE-498F-A926-96A6821D819C");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, "PROGR UNITA ORGANIZZATIVA");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DAESIGIBILIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOESIGIBIL, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOESIGIBIL, PPQRY_FPVESIBPRDE2, "B.ANNO_ESIGIBILITA", "REFPDAESANES", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, 64, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, 4, 340, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_CAPITOLO3, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_CAPITOLO3, PPQRY_FPVESIBPRDE2, "B.CAPITOLO", "RECFPVDAESCA", 3, 16, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, 184, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, 68);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, "Art.");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, 4, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, 68);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, "Art.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ARTICOLO3, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ARTICOLO3, PPQRY_FPVESIBPRDE2, "B.ARTICOLO", "RECFPVDAESAR", 1, 2, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, 216, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 424, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, 116);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOCAPITOLO, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOCAPITOLO, PPQRY_DUAL1, "DECODE(~~RECFPVDAESCA~~, to_number(NULL), NULL, 'I')", "INFOCAPITOLO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, 236, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione Cap");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 388, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione Cap");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESCRIZIONE1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESCRIZIONE1, PPQRY_FPVESIBPRDE2, "B.DESCRIZIONE_CAP", "REFPDAESDECA", 5, 140, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, 240, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, 4, 184, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_NUMEROIMP, -1, GRP_DAESIGIBILIT_IMPEGNO);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_NUMEROIMP, PPQRY_FPVESIBPRDE2, "B.NUMERO_IMP", "REFPDAESNUIM", 1, 5, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, 296, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, 4, 208, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOIMP, -1, GRP_DAESIGIBILIT_IMPEGNO);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOIMP, PPQRY_FPVESIBPRDE2, "B.ANNO_IMP", "REFPDAESANIM", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, 340, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, 120);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 316, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOIMPEGNO, -1, GRP_DAESIGIBILIT_IMPEGNO);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOIMPEGNO, PPQRY_DUAL1, "DECODE(~~REFPDAESANIM~~, to_number(NULL), NULL, 'I')", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, 360, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, "   Importo Variazione");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, 4, 256, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, "Imp. Var.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_IMPORTO1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_IMPORTO1, PPQRY_FPVESIBPRDE2, "B.IMPORTO", "RECFPVDAESIM", 2, 15, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, 480, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, 4, 448, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, "Dt. Variaz.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DDATAREG1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DDATAREG1, PPQRY_FPVESIBPRDE2, "B.D_DATA_REG", "REFPDAESDDAR", 6, 10, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, 556, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, 160);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, "Numero");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, 4, 472, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, 160);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, "Numero");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_NUMERIMPPROV, -1, GRP_DAESIGIBILIT_IMPPROVENIEN);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_NUMERIMPPROV, PPQRY_FPVESIBPRDE2, "B.NUMERO_IMP_PROVENIENZA", "REFPDAESNUIP", 1, 5, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, 616, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, 144);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, "Anno");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, 4, 496, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, 144);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, "Anno");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOIMPPROVE, -1, GRP_DAESIGIBILIT_IMPPROVENIEN);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOIMPPROVE, PPQRY_FPVESIBPRDE2, "B.ANNO_IMP_PROVENIENZA", "REFPDAESANIP", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, 676, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, 148);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, 4, 520, 656, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, 148);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOIMPEPROV, -1, GRP_DAESIGIBILIT_IMPPROVENIEN);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOIMPEPROV, PPQRY_DUAL1, "DECODE(~~REFPDAESANIP~~, to_number(NULL), NULL, 'I')", "INFOIMPEPROV", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, 696, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, 44);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, "Bil. Var.");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, 4, 544, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, 44);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, "Bil Var");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_BILVAR1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_BILVAR1, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_BILVAR1, PPQRY_FPVESIBPRDE2, "GET_BIL_VAR_ESIG(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,B.PROGRESSIVO_VARIMP,'S')", "RECORDBILVAR", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, 728, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, 104);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, 4, 568, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, 104);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOBILVAR, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOBILVAR, PPQRY_DUAL1, "DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL)", "INFOBILVAR", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, 752, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, 100);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, "Codice UO");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, 4, 616, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, 100);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, "Codice UO");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_CODICEUO1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_CODICEUO1, PPQRY_UNITAORGANIZ, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~REFPDAESPRUO~~,TRUNC( SYSDATE ))", "CODICEUO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, 852, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, "Unita Organizzativa");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 640, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, "Unita Organizzativa");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESCRIZIONUO, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESCRIZIONUO, PPQRY_UNITAORGANIZ, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(~~REFPDAESPRUO~~,TRUNC( SYSDATE ))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_LIST, 1052, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_LIST, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_LIST, "Anno Finanz.");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_FORM, 4, 592, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_FORM, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPAD1, MyGlb.PANEL_FORM, "Anno Finanz.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOIMPEPAD1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_ANNOIMPEPAD1, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOIMPEPAD1, PPQRY_FPVESIBPRDE2, "SUBSTR(GET_IMPEGNO_PROV_PADRE(B.NUMERO_IMP,B.ANNO_IMP), -4, 8000)", "ANNOIMPEPADR", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_LIST, 186, 244, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_LIST, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_FORM, 324, 252, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_FORM, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ETICHETOTAL1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ETICHETOTAL1, -1, "", "ETICHETOTAL1", 0, 0, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_LIST, 360, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_LIST, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_FORM, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_TOTALEDAESI1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_TOTALEDAESI1, -1, "", "TOTALEDAESI1", 0, 0, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, 88);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_PROGRESSIVO1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_PROGRESSIVO1, PPQRY_FPVESIBPRDE2, "B.PROGRESSIVO_VARIMP", "REFPDAESPRVA", 3, 10, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, 1100, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, 184);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, 4, 664, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, 184);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_PROGUNITORG1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_PROGUNITORG1, PPQRY_FPVESIBPRDE2, "B.PROGR_UNITA_ORGANIZZATIVA", "REFPDAESPRUO", 1, 8, 0, -13997);
  }

  private void PAN_DAESIGIBILIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~REFPDAESANIM~~, to_number(NULL), NULL, 'I') as INFOIMPEGNO, ");
    SQL.append("  DECODE(~~RECFPVDAESCA~~, to_number(NULL), NULL, 'I') as INFOCAPITOLO, ");
    SQL.append("  DECODE(~~REFPDAESANIP~~, to_number(NULL), NULL, 'I') as INFOIMPEPROV, ");
    SQL.append("  DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL) as INFOBILVAR ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_DAESIGIBILIT.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGIBILIT.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~REFPDAESPRUO~~,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(~~REFPDAESPRUO~~,TRUNC( SYSDATE )) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~REFPDAESPRUO~~ IS NULL))) ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_UNITAORGANIZ, 0, SQL, -1, "");
    PAN_DAESIGIBILIT.SetQueryDB(PPQRY_UNITAORGANIZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGIBILIT.SetMasterTable(PPQRY_UNITAORGANIZ, "DUAL");
    PAN_DAESIGIBILIT.SetIMDB(IMDB, "PQRY_FPVESIBPRDE2", true);
    PAN_DAESIGIBILIT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.NUMERO_IMP as REFPDAESNUIM, ");
    SQL.append("  B.ANNO_IMP as REFPDAESANIM, ");
    SQL.append("  B.CAPITOLO as RECFPVDAESCA, ");
    SQL.append("  B.ARTICOLO as RECFPVDAESAR, ");
    SQL.append("  B.DESCRIZIONE_CAP as REFPDAESDECA, ");
    SQL.append("  B.ANNO_ESIGIBILITA as REFPDAESANES, ");
    SQL.append("  B.IMPORTO as RECFPVDAESIM, ");
    SQL.append("  B.D_DATA_REG as REFPDAESDDAR, ");
    SQL.append("  B.NUMERO_IMP_PROVENIENZA as REFPDAESNUIP, ");
    SQL.append("  B.ANNO_IMP_PROVENIENZA as REFPDAESANIP, ");
    SQL.append("  GET_BIL_VAR_ESIG(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,B.PROGRESSIVO_VARIMP,'S') as RECORDBILVAR, ");
    SQL.append("  B.PROGRESSIVO_VARIMP as REFPDAESPRVA, ");
    SQL.append("  SUBSTR(GET_IMPEGNO_PROV_PADRE(B.NUMERO_IMP,B.ANNO_IMP), -4, 8000) as ANNOIMPEPADR, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as REFPDAESPRUO ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVESIBPRDE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_ESIG B ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVESIBPRDE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((~~PQRY_PARAMETRI522.NOMOGGESEPLU~~ >= NVL(B.ANNO_ENTRATA, DECODE(SIGN(B.ANNO_ESIGIBILITA - B.ANNO_IMP), -1, NVL(B.ANNO_ENTRATA_PROVENIENZA, B.ANNO_IMP_PROVENIENZA), B.ANNO_IMP)))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI522.NOMOGGESEPLU~~ BETWEEN LEAST(B.ANNO_VAR, B.ANNO_ESIGIBILITA) AND GREATEST(B.ANNO_VAR, B.ANNO_ESIGIBILITA) - 1)) ");
    SQL.append("and   (B.CODICE_STRUTTURA IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  A.CODICE_STRUTTURA ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (GET_FPV_ESPL(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,TRUNC(TO_NUMBER(GET_CODICE(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'LIV')))) = 'SI') ");
    SQL.append(")) ");
    SQL.append("and   (SUBSTR(B.COD_4_LIV, 1, 1) IN (1, 2)) ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVESIBPRDE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVESIBPRDE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVESIBPRDE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.ANNO_ESIGIBILITA, ");
    SQL.append("  B.ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP, ");
    SQL.append("  B.D_DATA_REG ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVESIBPRDE2, 5, SQL, -1, "");
    PAN_DAESIGIBILIT.SetQueryDB(PPQRY_FPVESIBPRDE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGIBILIT.SetMasterTable(0, "FPV_DA_ESIG");
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_CAPITOLO3, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_ARTICOLO3, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_ANNOESIGIBIL, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_ANNOIMP, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_NUMEROIMP, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_DDATAREG1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DAESIGIBILIT.Status() == 2)
    {
      int oldListQBE = PAN_DAESIGIBILIT.iUseListQBE;
      PAN_DAESIGIBILIT.iUseListQBE = 0;
      PAN_DAESIGIBILIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DAESIGIBILIT.PanelCommand(Glb.PCM_FIND);
      PAN_DAESIGIBILIT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DAESIGTOTFIN_Init()
  {

    PAN_DAESIGTOTFIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DAESIGTOTFIN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DAESIGTOTFIN.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_DAESIGTOTFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, "8221E25D-7A13-44B2-B59B-A5866E01D5DA");
    PAN_DAESIGTOTFIN.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, "Importo");
    PAN_DAESIGTOTFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, "");
    PAN_DAESIGTOTFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DAESIGTOTFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGTOTFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, "A16BD546-279C-45B7-ABB9-2200E0096E8E");
    PAN_DAESIGTOTFIN.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, "Anno Finanz.");
    PAN_DAESIGTOTFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, "Anno del primo impegno di provenienza");
    PAN_DAESIGTOTFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGTOTFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGTOTFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, "E66E3249-E327-4A56-B13A-6B59938FE49F");
    PAN_DAESIGTOTFIN.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, "");
    PAN_DAESIGTOTFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.VIS_CAMPTOTADISA);
    PAN_DAESIGTOTFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DAESIGTOTFIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_LIST, "Importo");
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_FORM, 4, 256, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_IMPORTO3, MyGlb.PANEL_FORM, "Importo");
    PAN_DAESIGTOTFIN.SetFieldPage(PFL_DAESIGTOTFIN_IMPORTO3, -1, -1);
    PAN_DAESIGTOTFIN.SetFieldUnbound(PFL_DAESIGTOTFIN_IMPORTO3, true);
    PAN_DAESIGTOTFIN.SetFieldPanel(PFL_DAESIGTOTFIN_IMPORTO3, PPQRY_FPVESIBPRDEP, "SUM(B.IMPORTO)", "IMPORTO", 2, 19, 0, -13997);
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_LIST, 120, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_LIST, 128);
    PAN_DAESIGTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_LIST, "Anno Finanz.");
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_FORM, 4, 592, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_FORM, 128);
    PAN_DAESIGTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_ANNOIMPEPADR, MyGlb.PANEL_FORM, "Anno Finanz.");
    PAN_DAESIGTOTFIN.SetFieldPage(PFL_DAESIGTOTFIN_ANNOIMPEPADR, -1, -1);
    PAN_DAESIGTOTFIN.SetFieldUnbound(PFL_DAESIGTOTFIN_ANNOIMPEPADR, true);
    PAN_DAESIGTOTFIN.SetFieldPanel(PFL_DAESIGTOTFIN_ANNOIMPEPADR, PPQRY_FPVESIBPRDEP, "SUBSTR(GET_IMPEGNO_PROV_PADRE(B.NUMERO_IMP,B.ANNO_IMP), -4, 8000)", "ANNOIMPEPADR", 5, 99, 0, -13997);
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.PANEL_LIST, 0, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.PANEL_LIST, 0);
    PAN_DAESIGTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.PANEL_FORM, 0);
    PAN_DAESIGTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGTOTFIN_TOTALEDAESIG, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGTOTFIN.SetFieldPage(PFL_DAESIGTOTFIN_TOTALEDAESIG, -1, -1);
    PAN_DAESIGTOTFIN.SetFieldPanel(PFL_DAESIGTOTFIN_TOTALEDAESIG, -1, "", "TOTALEDAESIG", 0, 0, 0, -13997);
  }

  private void PAN_DAESIGTOTFIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_DAESIGTOTFIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DAESIGTOTFIN.SetIMDB(IMDB, "PQRY_FPVESIBPRDEP", true);
    PAN_DAESIGTOTFIN.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(B.IMPORTO) as IMPORTO, ");
    SQL.append("  SUBSTR(GET_IMPEGNO_PROV_PADRE(B.NUMERO_IMP,B.ANNO_IMP), -4, 8000) as ANNOIMPEPADR ");
    PAN_DAESIGTOTFIN.SetQuery(PPQRY_FPVESIBPRDEP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_ESIG B ");
    PAN_DAESIGTOTFIN.SetQuery(PPQRY_FPVESIBPRDEP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((~~PQRY_PARAMETRI522.NOMOGGESEPLU~~ >= NVL(B.ANNO_ENTRATA, DECODE(SIGN(B.ANNO_ESIGIBILITA - B.ANNO_IMP), -1, NVL(B.ANNO_ENTRATA_PROVENIENZA, B.ANNO_IMP_PROVENIENZA), B.ANNO_IMP)))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI522.NOMOGGESEPLU~~ BETWEEN LEAST(B.ANNO_VAR, B.ANNO_ESIGIBILITA) AND GREATEST(B.ANNO_VAR, B.ANNO_ESIGIBILITA) - 1)) ");
    SQL.append("and   (B.CODICE_STRUTTURA IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  A.CODICE_STRUTTURA ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (GET_FPV_ESPL(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,TRUNC(TO_NUMBER(GET_CODICE(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'LIV')))) = 'SI') ");
    SQL.append(")) ");
    SQL.append("and   (SUBSTR(B.COD_4_LIV, 1, 1) IN (1, 2)) ");
    PAN_DAESIGTOTFIN.SetQuery(PPQRY_FPVESIBPRDEP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  SUBSTR(GET_IMPEGNO_PROV_PADRE(B.NUMERO_IMP,B.ANNO_IMP), -4, 8000) ");
    PAN_DAESIGTOTFIN.SetQuery(PPQRY_FPVESIBPRDEP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DAESIGTOTFIN.SetQuery(PPQRY_FPVESIBPRDEP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2 ");
    PAN_DAESIGTOTFIN.SetQuery(PPQRY_FPVESIBPRDEP, 5, SQL, -1, "");
    PAN_DAESIGTOTFIN.SetQueryDB(PPQRY_FPVESIBPRDEP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGTOTFIN.SetMasterTable(0, "FPV_DA_ESIG");
    PAN_DAESIGTOTFIN.AddToSortList(PFL_DAESIGTOTFIN_ANNOIMPEPADR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DAESIGTOTFIN.Status() == 2)
    {
      int oldListQBE = PAN_DAESIGTOTFIN.iUseListQBE;
      PAN_DAESIGTOTFIN.iUseListQBE = 0;
      PAN_DAESIGTOTFIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_DAESIGTOTFIN.PanelCommand(Glb.PCM_FIND);
      PAN_DAESIGTOTFIN.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DACRONOPROGR_Init()
  {

    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, "5575117A-EEDE-4E03-9E09-4787389C08F2");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, "Opera/Progetto");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, MyGlb.VIS_GROUPSTYLE);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, MyGlb.PANEL_LIST, 152, -9999, 260, 16, 0, 0);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, MyGlb.PANEL_FORM, 0, 411, 492, 109, 0, 0);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, 0, 90);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, 1, 13);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, 0, 4);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, 1, 4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, "902ABF59-7592-4B61-9644-A8111A9D0652");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, "Finanziamento");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 1056, -9999, 208, 16, 0, 0);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 0, 591, 692, 85, 0, 0);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, 0, 83);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, 1, 13);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, 0, 4);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, 1, 4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, "2B9DAE88-8EFF-4097-AD2F-A84CBF505A76");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.VIS_NONNULLAFIEL);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, 0, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, "8156218C-D6ED-46AA-9D84-D5936F9CF60A");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, "VARCOM PROGRESSIVO ");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, "01D1757C-3FCB-4B34-A27E-78ED2E7F0765");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, "Capitolo");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.VIS_NOFIINLUHELE);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, "D8D3FAC7-B786-43BC-BB96-4AD3656AE3F5");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, "Art.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, "F0FB34DE-7F02-46CF-8378-04164EB848AB");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, "Descrizione Cap");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, "DAD40D65-5D51-4859-AA56-D5CABA416820");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, "Codice");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, "3AA69F98-0208-4F05-9C2F-7597B722A502");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, "Descrizione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, "35C1C55D-5CC3-4503-97C8-B5206CBBDAA7");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, "Anno Plur.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, "8F58E577-E87C-43D4-B36D-557117BD017A");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, "Importo");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, "56A4A78A-D3F7-46DD-B6CE-F74B059A3F6C");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, "Data Var.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, "AE2F9C24-EDC7-4C38-91CC-23BC35720012");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, "Bil. Var.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, "674393E7-377F-425B-A9B1-9720FA7E868D");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, " ");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.VIS_HYPELINKIMMA);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, "58C54F3D-A8AB-43F3-82AA-47EAE02A0532");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, "Codice UO");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, "0D13B9DE-4D11-4A87-8E0E-B44CBFC2AAF0");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, "Unità Organizzativa");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, "D51FA13D-4504-45FA-94ED-2E21205446FB");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, "Anno Finanz.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, "Esercizio plur dell'entrata cronoprogramma se presente, altrimenti esercizio entrata del finanziamento sul cronoprogramma");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, "EF089D10-F4BB-4166-9DEC-25221C32BEA6");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, "Codice");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, "2512D91F-96CE-47FB-8E4E-E2E30E089CB1");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, "Descrizione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, "E9CF6CC8-3CD5-4FA2-9E5E-D619701D08E5");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, "Totale da Cronoprogramma");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, "195F507E-8AF9-45F3-8791-544710DA4F8F");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.VIS_CAMPTOTADISA);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, "BB20A513-5EA0-49D0-A22E-24AD8F18C80C");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DACRONOPROGR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, 1312, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 340, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, 140);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CRONOPROGRID, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CRONOPROGRID, PPQRY_CROESIBPRDE2, "B.CRONOPROGRAMMA_ID", "REFPDACRCRID", 3, 10, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, 88);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, "VARCOM PROGRESSIVO ");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, 88);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, "VARC. PROGR.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_VARCOMPROGRE, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_VARCOMPROGRE, PPQRY_CROESIBPRDE2, "B.PROGRESSIVO_VAR", "REFPDACRPRVA", 2, 15, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_FORM, 4, 340, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CAPITOLO1, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CAPITOLO1, PPQRY_CROESIBPRDE2, "B.CAPITOLO", "RECFPVDACRCA", 3, 16, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_LIST, 120, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_FORM, 4, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_FORM, 68);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO1, MyGlb.PANEL_FORM, "Art.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ARTICOLO1, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ARTICOLO1, PPQRY_CROESIBPRDE2, "B.ARTICOLO", "RECFPVDACRAR", 1, 2, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_LIST, 84);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_LIST, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione Cap");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 592, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_FORM, 84);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descrizione Cap");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESCRIZIONE2, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESCRIZIONE2, PPQRY_CROESIBPRDE2, "B.DESCRIZIONE_CAP", "REFPDACRDECC", 5, 140, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, 152, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, "Codice");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, 4, 436, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, "Codice");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_OPERA, -1, GRP_DACRONOPROGR_OPERAPROGETT);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_OPERA, PPQRY_CROESIBPRDE2, "B.OPERA", "RECFPVDACROP", 1, 5, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, 212, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, 124);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, 4, 484, 484, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, 124);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESCRIZOPERA, -1, GRP_DACRONOPROGR_OPERAPROGETT);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESCRIZOPERA, PPQRY_CROESIBPRDE2, "C.DESCRIZIONE", "RECOOPERDESC", 5, 200, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_LIST, 412, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_LIST, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_LIST, "Anno Plur.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_FORM, 4, 460, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_FORM, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLU2, MyGlb.PANEL_FORM, "Anno Plur.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ESERCIZIPLU2, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ESERCIZIPLU2, PPQRY_CROESIBPRDE2, "B.ESERCIZIO_PLUR", "REFPDACRESPL", 1, 4, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_LIST, 460, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_LIST, "Importo");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO2, MyGlb.PANEL_FORM, "Importo");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_IMPORTO2, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_IMPORTO2, PPQRY_CROESIBPRDE2, "B.IMPORTO", "RECFPVDACRIM", 3, 14, 2, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, 580, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, "Data Var.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, 4, 520, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, "Data Var.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DDATAREG, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DDATAREG, PPQRY_CROESIBPRDE2, "B.DATA_VAR", "REFPDACRDAVA", 6, 10, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, 652, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, 44);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, "Bil. Var.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, 4, 544, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, 44);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, "Bil Var");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_BILVAR, -1, -1);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_BILVAR, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_BILVAR, PPQRY_CROESIBPRDE2, "GET_BIL_VAR_CRONO(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,B.CRONOPROGRAMMA_ID,B.CAPITOLO,B.ARTICOLO,B.ESERCIZIO_PLUR,B.FINANZIAMENTO,B.ANNO_FINANZIAMENTO,B.PROGRESSIVO_VAR)", "RECORDBILVAR", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, 684, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, 104);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, " ");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, 4, 568, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, 104);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, " ");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_INFOVARBIL, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_INFOVARBIL, PPQRY_DUAL, "DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL)", "INFOVARBIL", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetValueListItem(PFL_DACRONOPROGR_INFOVARBIL, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DACRONOPROGR.SetValueListItem(PFL_DACRONOPROGR_INFOVARBIL, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DACRONOPROGR.SetValueListItem(PFL_DACRONOPROGR_INFOVARBIL, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, 708, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, 92);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, "Codice UO");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, 4, 676, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, 92);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, "Codice UO");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CODICEUO, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CODICEUO, PPQRY_CAPUO, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~RECPROUNIORG~~,TRUNC( SYSDATE ))", "CODICEUO", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_LIST, 808, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_LIST, 164);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 340, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_FORM, 164);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_UNITAORGANIZ, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_UNITAORGANIZ, PPQRY_CAPUO, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(~~RECPROUNIORG~~,TRUNC( SYSDATE ))", "UNITAORGANIZ", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_LIST, 1008, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_LIST, 116);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_LIST, "Anno Finanz.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_FORM, 4, 616, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_FORM, 116);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ1, MyGlb.PANEL_FORM, "Anno Finanz.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ANNOFINANZ1, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ANNOFINANZ1, PPQRY_CROESIBPRDE2, "B.ANNO_FINANZIAMENTO", "REFPDACRANFI", 1, 4, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 1056, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, "Codice");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 616, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, "Codice");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_FINANZIAMENT, -1, GRP_DACRONOPROGR_FINANZIAMENT);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_FINANZIAMENT, PPQRY_CROESIBPRDE2, "B.FINANZIAMENTO", "RECFPVDACRFI", 1, 5, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, 1104, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, 4, 640, 684, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_FINANZDESCRI, -1, GRP_DACRONOPROGR_FINANZIAMENT);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.PANEL_LIST, 288, 244, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.PANEL_FORM, 324, 252, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ETICHETOTALE, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_LIST, 460, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_LIST, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_FORM, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_TOTALDACRON1, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_TOTALDACRON1, -1, "", "TOTALDACRON1", 0, 0, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 700, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_PROGUNITORGA, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_PROGUNITORGA, PPQRY_CROESIBPRDE2, "B.PROGR_UNITA_ORGANIZZATIVA", "RECPROUNIORG", 1, 8, 0, -13997);
  }

  private void PAN_DACRONOPROGR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~RECPROUNIORG~~,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(~~RECPROUNIORG~~,TRUNC( SYSDATE )) as UNITAORGANIZ ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_CAPUO, 0, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(PPQRY_CAPUO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL) as INFOVARBIL ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~REFPDACRCRID~~ IS NULL))) ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~RECFPVDACRFI~~) ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_DACRONOPROGR.SetIMDB(IMDB, "PQRY_CROESIBPRDE2", true);
    PAN_DACRONOPROGR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CRONOPROGRAMMA_ID as REFPDACRCRID, ");
    SQL.append("  B.CAPITOLO as RECFPVDACRCA, ");
    SQL.append("  B.ARTICOLO as RECFPVDACRAR, ");
    SQL.append("  B.DESCRIZIONE_CAP as REFPDACRDECC, ");
    SQL.append("  B.OPERA as RECFPVDACROP, ");
    SQL.append("  C.DESCRIZIONE as RECOOPERDESC, ");
    SQL.append("  B.ESERCIZIO_PLUR as REFPDACRESPL, ");
    SQL.append("  B.IMPORTO as RECFPVDACRIM, ");
    SQL.append("  B.DATA_VAR as REFPDACRDAVA, ");
    SQL.append("  GET_BIL_VAR_CRONO(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,B.CRONOPROGRAMMA_ID,B.CAPITOLO,B.ARTICOLO,B.ESERCIZIO_PLUR,B.FINANZIAMENTO,B.ANNO_FINANZIAMENTO,B.PROGRESSIVO_VAR) as RECORDBILVAR, ");
    SQL.append("  B.PROGRESSIVO_VAR as REFPDACRPRVA, ");
    SQL.append("  B.ANNO_FINANZIAMENTO as REFPDACRANFI, ");
    SQL.append("  B.FINANZIAMENTO as RECFPVDACRFI, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as RECPROUNIORG ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_CROESIBPRDE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_CRONO B, ");
    SQL.append("  OPERE C ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_CROESIBPRDE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE = B.OPERA) ");
    SQL.append("and   (B.ESERCIZIO_PLUR > ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (B.ANNO_FINANZIAMENTO <= ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  A.CODICE_STRUTTURA ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (GET_FPV_ESPL(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,TRUNC(TO_NUMBER(GET_CODICE(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,'S',A.CAPITOLO,A.ARTICOLO,4,'LIV')))) = 'SI') ");
    SQL.append(")) ");
    SQL.append("and   (SUBSTR(B.COD_4_LIV, 1, 1) IN (1, 2)) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_CROESIBPRDE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACRONOPROGR.SetQuery(PPQRY_CROESIBPRDE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACRONOPROGR.SetQuery(PPQRY_CROESIBPRDE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.FINANZIAMENTO ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_CROESIBPRDE2, 5, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_CROESIBPRDE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(0, "FPV_DA_CRONO");
    PAN_DACRONOPROGR.AddToSortList(PFL_DACRONOPROGR_CAPITOLO1, true);
    PAN_DACRONOPROGR.AddToSortList(PFL_DACRONOPROGR_ARTICOLO1, true);
    PAN_DACRONOPROGR.AddToSortList(PFL_DACRONOPROGR_FINANZIAMENT, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DACRONOPROGR.Status() == 2)
    {
      int oldListQBE = PAN_DACRONOPROGR.iUseListQBE;
      PAN_DACRONOPROGR.iUseListQBE = 0;
      PAN_DACRONOPROGR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DACRONOPROGR.PanelCommand(Glb.PCM_FIND);
      PAN_DACRONOPROGR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DACRONTOTFIN_Init()
  {

    PAN_DACRONTOTFIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DACRONTOTFIN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DACRONTOTFIN.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_DACRONTOTFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, "C7ADBD12-BC5B-4811-BCA9-19F8BD25984E");
    PAN_DACRONTOTFIN.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, "Importo");
    PAN_DACRONTOTFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, "");
    PAN_DACRONTOTFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_DACRONTOTFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONTOTFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, "A7601F3C-9E26-4ECD-8EA8-13C656B7DFCF");
    PAN_DACRONTOTFIN.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, "Anno Finanz.");
    PAN_DACRONTOTFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, "Esercizio plur dell'entrata cronoprogramma se presente, altrimenti esercizio entrata del finanziamento sul cronoprogramma");
    PAN_DACRONTOTFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONTOTFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONTOTFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, "B76FCC52-B92A-4A2C-B355-AFA60FAFDCB1");
    PAN_DACRONTOTFIN.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, "");
    PAN_DACRONTOTFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.VIS_CAMPTOTADISA);
    PAN_DACRONTOTFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DACRONTOTFIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_LIST, 64);
    PAN_DACRONTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_LIST, "Importo");
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_FORM, 64);
    PAN_DACRONTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_IMPORTO4, MyGlb.PANEL_FORM, "Importo");
    PAN_DACRONTOTFIN.SetFieldPage(PFL_DACRONTOTFIN_IMPORTO4, -1, -1);
    PAN_DACRONTOTFIN.SetFieldUnbound(PFL_DACRONTOTFIN_IMPORTO4, true);
    PAN_DACRONTOTFIN.SetFieldPanel(PFL_DACRONTOTFIN_IMPORTO4, PPQRY_CROESIBPRDE1, "SUM(B.IMPORTO)", "IMPORTO", 3, 28, 6, -13997);
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_LIST, 120, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_LIST, 116);
    PAN_DACRONTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_LIST, "Anno Finanz.");
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_FORM, 4, 616, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_FORM, 116);
    PAN_DACRONTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_ANNOFINANZ, MyGlb.PANEL_FORM, "Anno Finanz.");
    PAN_DACRONTOTFIN.SetFieldPage(PFL_DACRONTOTFIN_ANNOFINANZ, -1, -1);
    PAN_DACRONTOTFIN.SetFieldPanel(PFL_DACRONTOTFIN_ANNOFINANZ, PPQRY_CROESIBPRDE1, "B.ANNO_FINANZIAMENTO", "REFPDACRANFI", 1, 4, 0, -13997);
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.PANEL_LIST, 0, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.PANEL_LIST, 0);
    PAN_DACRONTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTFIN.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONTOTFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.PANEL_FORM, 0);
    PAN_DACRONTOTFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTFIN_TOTALDACRON2, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTFIN.SetFieldPage(PFL_DACRONTOTFIN_TOTALDACRON2, -1, -1);
    PAN_DACRONTOTFIN.SetFieldPanel(PFL_DACRONTOTFIN_TOTALDACRON2, -1, "", "TOTALDACRON2", 0, 0, 0, -13997);
  }

  private void PAN_DACRONTOTFIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_DACRONTOTFIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DACRONTOTFIN.SetIMDB(IMDB, "PQRY_CROESIBPRDE1", true);
    PAN_DACRONTOTFIN.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(B.IMPORTO) as IMPORTO, ");
    SQL.append("  B.ANNO_FINANZIAMENTO as REFPDACRANFI ");
    PAN_DACRONTOTFIN.SetQuery(PPQRY_CROESIBPRDE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_CRONO B ");
    PAN_DACRONTOTFIN.SetQuery(PPQRY_CROESIBPRDE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ESERCIZIO_PLUR > ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (B.ANNO_FINANZIAMENTO <= ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  A.CODICE_STRUTTURA ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (GET_FPV_ESPL(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,TRUNC(TO_NUMBER(GET_CODICE(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,'S',A.CAPITOLO,A.ARTICOLO,4,'LIV')))) = 'SI') ");
    SQL.append(")) ");
    SQL.append("and   (SUBSTR(B.COD_4_LIV, 1, 1) IN (1, 2)) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_DACRONTOTFIN.SetQuery(PPQRY_CROESIBPRDE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.ANNO_FINANZIAMENTO ");
    PAN_DACRONTOTFIN.SetQuery(PPQRY_CROESIBPRDE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACRONTOTFIN.SetQuery(PPQRY_CROESIBPRDE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_FINANZIAMENTO ");
    PAN_DACRONTOTFIN.SetQuery(PPQRY_CROESIBPRDE1, 5, SQL, -1, "");
    PAN_DACRONTOTFIN.SetQueryDB(PPQRY_CROESIBPRDE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONTOTFIN.SetMasterTable(0, "FPV_DA_CRONO");
    PAN_DACRONTOTFIN.AddToSortList(PFL_DACRONTOTFIN_ANNOFINANZ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DACRONTOTFIN.Status() == 2)
    {
      int oldListQBE = PAN_DACRONTOTFIN.iUseListQBE;
      PAN_DACRONTOTFIN.iUseListQBE = 0;
      PAN_DACRONTOTFIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_DACRONTOTFIN.PanelCommand(Glb.PCM_FIND);
      PAN_DACRONTOTFIN.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DACRONTOTCAP_Init()
  {

    PAN_DACRONTOTCAP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DACRONTOTCAP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DACRONTOTCAP.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, "73E0645B-6219-4DBB-82B8-CE4429785AA4");
    PAN_DACRONTOTCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, "Capitolo");
    PAN_DACRONTOTCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, "");
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, "2743981F-7A05-4D0C-9902-348C9B0C3225");
    PAN_DACRONTOTCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, "Art.");
    PAN_DACRONTOTCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, "");
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, "7FCCDC76-246C-492F-B4BD-88028BE7EE1C");
    PAN_DACRONTOTCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, "Descrizione Cap");
    PAN_DACRONTOTCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, "");
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, "54ABDA2E-4C7B-491D-B2BD-1854778049DB");
    PAN_DACRONTOTCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, "Anno Plur.");
    PAN_DACRONTOTCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, "");
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, "3F3938E3-D8F0-4CE2-AF91-9AEB7F1764DB");
    PAN_DACRONTOTCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, "Importo");
    PAN_DACRONTOTCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, "");
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONTOTCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, "E9C89445-DC1C-4BC4-97D9-5C7FC6AAB059");
    PAN_DACRONTOTCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, "");
    PAN_DACRONTOTCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DACRONTOTCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DACRONTOTCAP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_FORM, 4, 340, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DACRONTOTCAP.SetFieldPage(PFL_DACRONTOTCAP_CAPITOLO, -1, -1);
    PAN_DACRONTOTCAP.SetFieldPanel(PFL_DACRONTOTCAP_CAPITOLO, PPQRY_CROESIBPRDEP, "B.CAPITOLO", "RECFPVDACRCA", 3, 16, 0, -13997);
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_FORM, 4, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_DACRONTOTCAP.SetFieldPage(PFL_DACRONTOTCAP_ARTICOLO, -1, -1);
    PAN_DACRONTOTCAP.SetFieldPanel(PFL_DACRONTOTCAP_ARTICOLO, PPQRY_CROESIBPRDEP, "B.ARTICOLO", "RECFPVDACRAR", 1, 2, 0, -13997);
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Cap");
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 592, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Cap");
    PAN_DACRONTOTCAP.SetFieldPage(PFL_DACRONTOTCAP_DESCRIZIONE, -1, -1);
    PAN_DACRONTOTCAP.SetFieldPanel(PFL_DACRONTOTCAP_DESCRIZIONE, PPQRY_CROESIBPRDEP, "B.DESCRIZIONE_CAP", "REFPDACRDECC", 5, 140, 0, -13997);
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_LIST, 152, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Anno Plur.");
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_FORM, 4, 460, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_FORM, 100);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Anno Plur.");
    PAN_DACRONTOTCAP.SetFieldPage(PFL_DACRONTOTCAP_ESERCIZIPLUR, -1, -1);
    PAN_DACRONTOTCAP.SetFieldPanel(PFL_DACRONTOTCAP_ESERCIZIPLUR, PPQRY_CROESIBPRDEP, "B.ESERCIZIO_PLUR", "REFPDACRESPL", 1, 4, 0, -13997);
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_LIST, 200, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DACRONTOTCAP.SetFieldPage(PFL_DACRONTOTCAP_IMPORTO, -1, -1);
    PAN_DACRONTOTCAP.SetFieldUnbound(PFL_DACRONTOTCAP_IMPORTO, true);
    PAN_DACRONTOTCAP.SetFieldPanel(PFL_DACRONTOTCAP_IMPORTO, PPQRY_CROESIBPRDEP, "SUM(B.IMPORTO)", "IMPORTO", 3, 28, 6, -13997);
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.PANEL_LIST, 200, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.PANEL_LIST, 0);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONTOTCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONTOTCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.PANEL_FORM, 0);
    PAN_DACRONTOTCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONTOTCAP_TOTALDACRONO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONTOTCAP.SetFieldPage(PFL_DACRONTOTCAP_TOTALDACRONO, -1, -1);
    PAN_DACRONTOTCAP.SetFieldPanel(PFL_DACRONTOTCAP_TOTALDACRONO, -1, "", "TOTALDACRONO", 0, 0, 0, -13997);
  }

  private void PAN_DACRONTOTCAP_InitQueries()
  {
    StringBuffer SQL;

    PAN_DACRONTOTCAP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DACRONTOTCAP.SetIMDB(IMDB, "PQRY_CROESIBPRDEP", true);
    PAN_DACRONTOTCAP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CAPITOLO as RECFPVDACRCA, ");
    SQL.append("  B.ARTICOLO as RECFPVDACRAR, ");
    SQL.append("  B.DESCRIZIONE_CAP as REFPDACRDECC, ");
    SQL.append("  B.ESERCIZIO_PLUR as REFPDACRESPL, ");
    SQL.append("  SUM(B.IMPORTO) as IMPORTO ");
    PAN_DACRONTOTCAP.SetQuery(PPQRY_CROESIBPRDEP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_CRONO B ");
    PAN_DACRONTOTCAP.SetQuery(PPQRY_CROESIBPRDEP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ESERCIZIO_PLUR > ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (B.ANNO_FINANZIAMENTO <= ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  A.CODICE_STRUTTURA ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI522.NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (GET_FPV_ESPL(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,TRUNC(TO_NUMBER(GET_CODICE(~~PQRY_PARAMETRI522.NOMOGGESEPLU~~,'S',A.CAPITOLO,A.ARTICOLO,4,'LIV')))) = 'SI') ");
    SQL.append(")) ");
    SQL.append("and   (SUBSTR(B.COD_4_LIV, 1, 1) IN (1, 2)) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_DACRONTOTCAP.SetQuery(PPQRY_CROESIBPRDEP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.DESCRIZIONE_CAP, ");
    SQL.append("  B.ESERCIZIO_PLUR ");
    PAN_DACRONTOTCAP.SetQuery(PPQRY_CROESIBPRDEP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACRONTOTCAP.SetQuery(PPQRY_CROESIBPRDEP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.ESERCIZIO_PLUR ");
    PAN_DACRONTOTCAP.SetQuery(PPQRY_CROESIBPRDEP, 5, SQL, -1, "");
    PAN_DACRONTOTCAP.SetQueryDB(PPQRY_CROESIBPRDEP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONTOTCAP.SetMasterTable(0, "FPV_DA_CRONO");
    PAN_DACRONTOTCAP.AddToSortList(PFL_DACRONTOTCAP_CAPITOLO, true);
    PAN_DACRONTOTCAP.AddToSortList(PFL_DACRONTOTCAP_ARTICOLO, true);
    PAN_DACRONTOTCAP.AddToSortList(PFL_DACRONTOTCAP_ESERCIZIPLUR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DACRONTOTCAP.Status() == 2)
    {
      int oldListQBE = PAN_DACRONTOTCAP.iUseListQBE;
      PAN_DACRONTOTCAP.iUseListQBE = 0;
      PAN_DACRONTOTCAP.PanelCommand(Glb.PCM_SEARCH);
      PAN_DACRONTOTCAP.PanelCommand(Glb.PCM_FIND);
      PAN_DACRONTOTCAP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DAESIGTOTFIN) PAN_DAESIGTOTFIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DACRONTOTFIN) PAN_DACRONTOTFIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DACRONTOTCAP) PAN_DACRONTOTCAP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_ValidateRow(Cancel);
    if (SrcObj == PAN_DAESIGTOTFIN) PAN_DAESIGTOTFIN_ValidateRow(Cancel);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_ValidateRow(Cancel);
    if (SrcObj == PAN_DACRONTOTFIN) PAN_DACRONTOTFIN_ValidateRow(Cancel);
    if (SrcObj == PAN_DACRONTOTCAP) PAN_DACRONTOTCAP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_DynamicProperties();
    if (SrcObj == PAN_DAESIGTOTFIN) PAN_DAESIGTOTFIN_DynamicProperties();
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_DynamicProperties();
    if (SrcObj == PAN_DACRONTOTFIN) PAN_DACRONTOTFIN_DynamicProperties();
    if (SrcObj == PAN_DACRONTOTCAP) PAN_DACRONTOTCAP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DAESIGTOTFIN) PAN_DAESIGTOTFIN_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DACRONTOTFIN) PAN_DACRONTOTFIN_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DACRONTOTCAP) PAN_DACRONTOTCAP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_AfterFind(CmdFind);
    if (SrcObj == PAN_DAESIGTOTFIN) PAN_DAESIGTOTFIN_AfterFind(CmdFind);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_AfterFind(CmdFind);
    if (SrcObj == PAN_DACRONTOTFIN) PAN_DACRONTOTFIN_AfterFind(CmdFind);
    if (SrcObj == PAN_DACRONTOTCAP) PAN_DACRONTOTCAP_AfterFind(CmdFind);
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
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DAESIGTOTFIN) PAN_DAESIGTOTFIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DACRONTOTFIN) PAN_DACRONTOTFIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DACRONTOTCAP) PAN_DACRONTOTCAP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
