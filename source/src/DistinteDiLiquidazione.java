// **********************************************
// Distinte Di Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistinteDiLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FILTRI_DATIFATTURA = 0;

  private static int PFL_FILTRI_BENDEBITORE = 0;
  private static int PFL_FILTRI_CODICEFORNIT = 1;
  private static int PFL_FILTRI_ETICHSCELBEN = 2;
  private static int PFL_FILTRI_NUMEPROTGENE = 3;
  private static int PFL_FILTRI_NUMEPROTINTE = 4;
  private static int PFL_FILTRI_NUMERODOC = 5;
  private static int PFL_FILTRI_NULLAOSTA = 6;
  private static int PFL_FILTRI_CODLIVELLO1 = 7;
  private static int PFL_FILTRI_CODLIVELLO2 = 8;
  private static int PFL_FILTRI_MISSIONE = 9;
  private static int PFL_FILTRI_PROGRMISSION = 10;
  private static int PFL_FILTRI_PROGRUO = 11;

  private static int PPQRY_FILTRI5 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_CF4ESPPIACO1 = 2;
  private static int PPQRY_CF4ESPPIACON = 3;
  private static int PPQRY_VISTMISSPRO1 = 4;
  private static int PPQRY_VISTMISSPROG = 5;
  private static int PPQRY_DISTINLIQUI2 = 6;


  IDPanel PAN_FILTRI;
  private static int PFL_DISTINLIQUID_NUMERODISTIN = 0;
  private static int PFL_DISTINLIQUID_ANNODISTINTA = 1;
  private static int PFL_DISTINLIQUID_DATADISTINTA = 2;
  private static int PFL_DISTINLIQUID_ANNODEL = 3;
  private static int PFL_DISTINLIQUID_NUMERODEL = 4;
  private static int PFL_DISTINLIQUID_SEDEDEL = 5;
  private static int PFL_DISTINLIQUID_ANNOIMP = 6;
  private static int PFL_DISTINLIQUID_NUMEROIMP = 7;
  private static int PFL_DISTINLIQUID_ANNOSUBIMP = 8;
  private static int PFL_DISTINLIQUID_NUMEROSUBIMP = 9;
  private static int PFL_DISTINLIQUID_TIPODIST = 10;
  private static int PFL_DISTINLIQUID_FLAGLIQUIDAT = 11;
  private static int PFL_DISTINLIQUID_SCADENZADAL = 12;
  private static int PFL_DISTINLIQUID_SCADENZAAL = 13;
  private static int PFL_DISTINLIQUID_IMPORTO = 14;
  private static int PFL_DISTINLIQUID_STATO = 15;
  private static int PFL_DISTINLIQUID_PROGUNITORGA = 16;
  private static int PFL_DISTINLIQUID_UTENTEINSERI = 17;
  private static int PFL_DISTINLIQUID_DATAINSERIME = 18;
  private static int PFL_DISTINLIQUID_UTENTULTIAGG = 19;
  private static int PFL_DISTINLIQUID_DATAULTIMAGG = 20;
  private static int PFL_DISTINLIQUID_LINKGDM = 21;
  private static int PFL_DISTINLIQUID_PROGRUOCOMPE = 22;
  private static int PFL_DISTINLIQUID_PROUNIORGINS = 23;
  private static int PFL_DISTINLIQUID_UNITAORGANIZ = 24;
  private static int PFL_DISTINLIQUID_FLAGCONDCONT = 25;
  private static int PFL_DISTINLIQUID_FLAGSCELFORN = 26;
  private static int PFL_DISTINLIQUID_FLAGREGOCONT = 27;
  private static int PFL_DISTINLIQUID_FLAGVERSRITE = 28;
  private static int PFL_DISTINLIQUID_FLAGNULLOSTA = 29;
  private static int PFL_DISTINLIQUID_NUOVAESPRESS = 30;

  private static int PPQRY_DISTINLIQUI1 = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_DISTINLIQUID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRI32(IMDB);
    //
    //
    Init_PQRY_DISTINLIQUI1(IMDB);
    Init_PQRY_FILTRI5(IMDB);
    Init_PQRY_FILTRI5_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRI32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_FILTRI32, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_FILTRI32, "TBL_FILTRI32");
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGCODFOR, "NOMOGGCODFOR");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGCODFOR,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNUPRGE, "NOMOGGNUPRGE");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNUPRGE,1,7,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNUPRIN, "NOMOGGNUPRIN");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNUPRIN,1,7,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNUMDOC, "NOMOGGNUMDOC");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNULOST, "NOMOGGNULOST");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGNULOST,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGCODLI1, "NOMOGGCODLI1");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGCODLI1,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGCODLI2, "NOMOGGCODLI2");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGCODLI2,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMEOGGEMISS,5,21,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGPROMIS, "NOMOGGPROMIS");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMOGGPROMIS,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI32,IMDBDef5.FLD_FILTRI32_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef5.TBL_FILTRI32, 0);
  }

  private static void Init_PQRY_DISTINLIQUI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_DISTINLIQUI1, 30);
    IMDB.set_TblCode(IMDBDef14.PQRY_DISTINLIQUI1, "PQRY_DISTINLIQUI1");
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNDIS, "DISLIQANNDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMDIS, "DISLIQNUMDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMDIS,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQDATDIS, "DISLIQDATDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQDATDIS,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNDEL, "DISLIQANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMDEL, "DISLIQNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQSEDDEL, "DISLIQSEDDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQSEDDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNIMP, "DISLIQANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMIMP, "DISLIQNUMIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNSUB, "DISLIQANNSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMSUB, "DISLIQNUMSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQTIPDIS, "DISLIQTIPDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQTIPDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLALIQ, "DISLIQFLALIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLALIQ,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQSCADAL, "DISLIQSCADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQSCADAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISTLIQSCAAL, "DISTLIQSCAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISTLIQSCAAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISTLIQUSTAT, "DISTLIQUSTAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISTLIQUSTAT,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQPRUNOR, "DISLIQPRUNOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQUTEINS, "DISLIQUTEINS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQUTEINS,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQDATINS, "DISLIQDATINS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQDATINS,8,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQUTULAG, "DISLIQUTULAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQUTULAG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQDAULAG, "DISLIQDAULAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQDAULAG,8,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQLINGDM, "DISLIQLINGDM");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQLINGDM,5,500,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQPRUOCO, "DISLIQPRUOCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQPRUOCO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DILIPRUNORIN, "DILIPRUNORIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DILIPRUNORIN,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLCOCO, "DISLIQFLCOCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLCOCO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLSCFO, "DISLIQFLSCFO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLSCFO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLRECO, "DISLIQFLRECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLRECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLVERI, "DISLIQFLVERI");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLVERI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLNUOS, "DISLIQFLNUOS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_DISLIQFLNUOS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_NUOVAESPRESS,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINLIQUI1,IMDBDef14.PQSL_DISTINLIQUI1_IMPORTO,3,28,6);
    IMDB.TblAddNew(IMDBDef14.PQRY_DISTINLIQUI1, 0);
  }

  private static void Init_PQRY_FILTRI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_FILTRI5, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_FILTRI5, "PQRY_FILTRI5");
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGCODFOR, "NOMOGGCODFOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGCODFOR,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRGE, "NOMOGGNUPRGE");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRGE,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRIN, "NOMOGGNUPRIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRIN,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNUMDOC, "NOMOGGNUMDOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNULOST, "NOMOGGNULOST");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGNULOST,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI1, "NOMOGGCODLI1");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI1,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI2, "NOMOGGCODLI2");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI2,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMEOGGEMISS,5,21,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGPROMIS, "NOMOGGPROMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMOGGPROMIS,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5,IMDBDef14.PQSL_FILTRI5_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_FILTRI5, 0);
  }

  private static void Init_PQRY_FILTRI5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_FILTRI5_RS, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_FILTRI5_RS, "PQRY_FILTRI5_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGCODFOR, "NOMOGGCODFOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGCODFOR,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRGE, "NOMOGGNUPRGE");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRGE,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRIN, "NOMOGGNUPRIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNUPRIN,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNUMDOC, "NOMOGGNUMDOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNULOST, "NOMOGGNULOST");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGNULOST,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI1, "NOMOGGCODLI1");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI1,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI2, "NOMOGGCODLI2");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGCODLI2,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMEOGGEMISS,5,21,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGPROMIS, "NOMOGGPROMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMOGGPROMIS,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI5_RS,IMDBDef14.PQSL_FILTRI5_NOMEOGGPROUO,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistinteDiLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistinteDiLiquidazione()
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
    FormIdx = MyGlb.FRM_DISTIDILIQUI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "017459C1-8D2E-414D-9E11-72B58AA11629";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 574;
    set_Caption(new IDVariant("Distinte Di Liquidazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 548;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.437956;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 832;
    Frames[2].Height = 240;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 832;
    Frames[2].FixedHeight = 240;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_FILTRI = new IDPanel(w, this, 2, "PAN_FILTRI");
    Frames[2].Content = PAN_FILTRI;
    PAN_FILTRI.Lockable = false;
    PAN_FILTRI.iLocked = false;
    PAN_FILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRI.VS = MainFrm.VisualStyleList;
    PAN_FILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "659BBB51-4C21-4F76-8BC8-EB098C77F2C9");
    PAN_FILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1424, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRI.InitStatus = 1;
    PAN_FILTRI_Init();
    PAN_FILTRI_InitFields();
    PAN_FILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 832;
    Frames[3].Height = 308;
    Frames[3].Caption = "Distinte di liquidazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 308;
    PAN_DISTINLIQUID = new IDPanel(w, this, 3, "PAN_DISTINLIQUID");
    Frames[3].Content = PAN_DISTINLIQUID;
    PAN_DISTINLIQUID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINLIQUID.VS = MainFrm.VisualStyleList;
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 308-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "42E5E769-9AF0-4D29-BD7F-235D033E9D7D");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1220, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINLIQUID.InitStatus = 1;
    PAN_DISTINLIQUID_Init();
    PAN_DISTINLIQUID_InitFields();
    PAN_DISTINLIQUID_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA17+BaseCmdLinIdx)
      {
        Stampa();
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
      if (IMDB.TblModified(IMDBDef5.TBL_FILTRI32, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DISTIDILIQUI_FILTRI5();
      }
      PAN_DISTINLIQUID.UpdatePanel(MainFrm);
      PAN_FILTRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_FILTRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_FILTRI_ETICHSCELBEN) {
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
    return (obj instanceof DistinteDiLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistinteDiLiquidazione.class.getName() : (Glb.ClassWithPackage(DistinteDiLiquidazione.class) ? DistinteDiLiquidazione.class.getName().substring(DistinteDiLiquidazione.class.getPackage().getName().length() + 1) : DistinteDiLiquidazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // DISTINTE LIQUIDAZIONE On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_DISTINLIQUID_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DISTINTE LIQUIDAZIONE On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DISTINLIQUID.Status()).equals((new IDVariant(1)), true))
      {
        PAN_DISTINLIQUID.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_DISTINLIQUID.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiLiquidazione", "DISTINTELIQUIDAZIONEOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM31, IMDBDef2.FLD_PARAMESTAM31_PARSTAANNDIS, 0, IMDB.Value(IMDBDef14.PQRY_DISTINLIQUI1, IMDBDef14.PQSL_DISTINLIQUI1_DISLIQANNDIS, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM31, IMDBDef2.FLD_PARAMESTAM31_PARSTANUMDIS, 0, IMDB.Value(IMDBDef14.PQRY_DISTINLIQUI1, IMDBDef14.PQSL_DISTINLIQUI1_DISLIQNUMDIS, 0));
      MainFrm.Show(MyGlb.FRM_STAMPADISTIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiLiquidazione", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_FILTRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_FILTRI_BENDEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_FILTRI.FieldText(PFL_FILTRI_BENDEBITORE))), IDL.Today(), (new IDVariant("FAT")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiLiquidazione", "FiltriOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Etichetta scelta ben
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettasceltaben ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta scelta ben Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARVISPANPAR, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiLiquidazione", "Etichettasceltaben", _e);
      return -1;
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_FILTRI5, IMDBDef14.PQSL_FILTRI5_NOMOGGCODFOR, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_FILTRI5, IMDBDef14.PQSL_FILTRI5_NOMOGGCODFOR, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiLiquidazione", "EndModal", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGNULOST, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGCODLI1, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGCODLI2, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMEOGGEMISS, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGPROMIS, 0, (new IDVariant("-1")));
      PAN_DISTINLIQUID.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiLiquidazione", "Load", _e);
    }
  }

  // **********************************************************************
  // Filtri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DISTIDILIQUI_FILTRI5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_FILTRI5_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_FILTRI32, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_FILTRI32, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_FILTRI5_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_FILTRI5_RS, 0, IMDBDef5.TBL_FILTRI32, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 0, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGCODFOR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 1, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGNUPRGE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 2, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGNUPRIN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 3, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGNUMDOC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 4, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGNULOST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 5, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGCODLI1, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 6, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGCODLI2, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 7, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMEOGGEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 8, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMOGGPROMIS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI5_RS, 9, 0, IMDBDef5.TBL_FILTRI32, IMDBDef5.FLD_FILTRI32_NOMEOGGPROUO, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_FILTRI32, 0);
      if (IMDB.Eof(IMDBDef5.TBL_FILTRI32, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_FILTRI32, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_FILTRI5_RS, 0);
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
  private void PAN_FILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRI);
    // Stub
  }

  private void PAN_FILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FILTRI_ETICHSCELBEN)
    {
      this.IdxPanelActived = this.PAN_FILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettasceltaben();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISTINLIQUID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINLIQUID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINLIQUID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINLIQUID, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINLIQUID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISTINLIQUID);
    // Stub
  }

  private void PAN_DISTINLIQUID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISTINLIQUID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINLIQUID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINLIQUID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISTINLIQUID_Init()
  {

    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_FIELD, 31);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, "D2D02B82-07BF-4449-BCAF-FC3A9CA83017");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, "Numero");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, "6B810390-26E8-4BE6-A90F-27BC397602B1");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, "Anno");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, "CF6497EA-F786-484D-9C45-430738D65822");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, "Data");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, "08143C18-F68E-4263-9147-E978D4543620");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, "ANNO DEL");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, "05BC882E-B5E8-4397-BB54-88BFE4BD23B7");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, "NUMERO DEL");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, "C1925CB2-548D-4037-AA34-2742A98E1584");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, "SEDE DEL");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, "B602116B-A26A-45A7-A767-3573333E076B");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, "ANNO IMP");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, "E52F1A04-D754-470E-A4FE-7AC3CF577331");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, "NUMERO IMP");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, "E16228B5-6512-41A4-B632-7AA3F825E927");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, "93DAD083-ECCF-47ED-8401-BA8DB84285DE");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, "0E5090E4-A8D8-40FD-A313-A54E5D3BAB2E");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, "TIPO DIST");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, "Brief description of field content.");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.VIS_NONNULLAFIEL);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, "D29F298B-DE2D-4530-BC48-68892400DF16");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, "FLAG LIQUIDATO");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, "Brief description of field content.");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, "405C794C-AF6F-4F76-B950-2E2DFD132CF9");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, "SCADENZA DAL");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, "DB22B00A-B78C-461D-B78D-FC1A5F7AD538");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, "SCADENZA AL");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, "C64BE96E-FDE5-44F6-82E0-5031303540B9");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, "Importo");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, "81E95EC9-5E6D-4DDC-96C6-BF72A670F58F");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, "Stato");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, "5936D280-0A78-40B8-8CE1-72C2841FBD28");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, "FFE6D590-5EF2-4FFD-BDC6-C7D71ADD6842");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, "6737DB44-D112-479B-B8E2-19CF0C464416");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, "AC073AFA-F727-4BFB-8C54-52521538D0CD");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, "B2E63243-709D-46A0-BDDC-117FEF088CE7");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, "3E9EDD24-669B-4645-8158-BF53AFD6BDA0");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, "LINK GDM");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, "537579BE-D1E8-4A29-B09E-84A8F2F6BD46");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, "PROGR UO COMPETENZA");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, "A24CD6C0-A8A8-4DAE-B867-59EF1A26BAE4");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, "PROGR UNITA ORGANIZZATIVA INS");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, "6E45EBB1-4B08-49F7-B3C8-7A973CA6ED93");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, "Unità Organizzativa");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, "50E24122-65A0-42A5-8C10-C255DB1B97F2");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, "Condizioni Contrattuali");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, "Le forniture e/o prestazioni cui la suddetta documentazione si riferisce sono state eseguite secondo le condizioni contrattuali e, per quanto riguarda i prodotti, con i requisiti merceologici e tipologici chiesti");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, "3BB23996-B168-439B-9096-36934C2020E7");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, "Scelta Fornitori");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, "La scelta dei fornitori è avvenuta secondo le procedure previste");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, "1767A632-10FA-4AA4-9F83-CFA1A3C422BC");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, "Regolarità Contributiva");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, "Si attesta la verifica della regolarità contributiva di cui all’art. 2 della Legge n. 266/2002");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, "9572A2A3-6C6D-479C-9ABA-1D876CA8D6C1");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, "Versamento Ritenute");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, "Si attesta la verifica del versamento delle ritenute di cui all’art. 17-bis del D.lgs. n. 241/1997");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, "20AE9B3A-0743-4A79-9551-7BBD4B3EF9FB");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, "Nulla Osta");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, "Vista la proposta sopracitata e constatata la regolarità della stessa, ai sensi e per gli effetti di quanto contemplato nel regolamento interno di contabilità, si rilascia il nulla osta per l’esecuzione della proposta");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, "1F6EF5F9-6A5F-4BE6-802E-4DBE020A0774");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, "Storico Check");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISTINLIQUID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, 112);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, 188, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMERODISTIN, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMERODISTIN, PPQRY_DISTINLIQUI1, "A.NUMERO_DISTINTA", "DISLIQNUMDIS", 1, 5, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, 68, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNODISTINTA, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNODISTINTA, PPQRY_DISTINLIQUI1, "A.ANNO_DISTINTA", "DISLIQANNDIS", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_LIST, 108, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_LIST, "Data");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_FORM, 4, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATADISTINTA, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_DATADISTINTA, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_DATADISTINTA, PPQRY_DISTINLIQUI1, "A.DATA_DISTINTA", "DISLIQDATDIS", 6, 19, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, 176, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, 244, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNODEL, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNODEL, PPQRY_DISTINLIQUI1, "A.ANNO_DEL", "DISLIQANNDEL", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 216, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 380, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 96);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, "NUMERO DEL");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMERODEL, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMERODEL, PPQRY_DISTINLIQUI1, "A.NUMERO_DEL", "DISLIQNUMDEL", 1, 6, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_SEDEDEL, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_SEDEDEL, PPQRY_DISTINLIQUI1, "A.SEDE_DEL", "DISLIQSEDDEL", 5, 255, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_FORM, 188, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_FORM, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNOIMP, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNOIMP, PPQRY_DISTINLIQUI1, "A.ANNO_IMP", "DISLIQANNIMP", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, 324, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, 96);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, "NUMERO IMP");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMEROIMP, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMEROIMP, PPQRY_DISTINLIQUI1, "A.NUMERO_IMP", "DISLIQNUMIMP", 1, 5, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANNO SUBIMP");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNOSUBIMP, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNOSUBIMP, PPQRY_DISTINLIQUI1, "A.ANNO_SUBIMP", "DISLIQANNSUB", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, 188, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMP");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMEROSUBIMP, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMEROSUBIMP, PPQRY_DISTINLIQUI1, "A.NUMERO_SUBIMP", "DISLIQNUMSUB", 1, 5, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, 176, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, 68);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, "TIPO DIST");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, 364, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, "TIPO DIST");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_TIPODIST, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_TIPODIST, PPQRY_DISTINLIQUI1, "A.TIPO_DIST", "DISLIQTIPDIS", 5, 1, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_TIPODIST, (new IDVariant("B")), "Ordini", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_TIPODIST, (new IDVariant("D")), "Disposizioni", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_TIPODIST, (new IDVariant("L")), "Liquidazioni", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_LIST, 256, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_LIST, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_LIST, "FLG. LIQ.");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGLIQUIDAT, MyGlb.PANEL_FORM, "FLAG LIQUIDATO");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_FLAGLIQUIDAT, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_FLAGLIQUIDAT, PPQRY_DISTINLIQUI1, "A.FLAG_LIQUIDATO", "DISLIQFLALIQ", 5, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGLIQUIDAT, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGLIQUIDAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_LIST, 296, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_LIST, 92);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_LIST, "SCADENZA DAL");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_FORM, 188, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_FORM, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZADAL, MyGlb.PANEL_FORM, "SCADENZA DAL");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_SCADENZADAL, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_SCADENZADAL, PPQRY_DISTINLIQUI1, "A.SCADENZA_DAL", "DISLIQSCADAL", 6, 10, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_LIST, 384, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_LIST, 84);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_LIST, "SCADENZA AL");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_FORM, 4, 124, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SCADENZAAL, MyGlb.PANEL_FORM, "SCADENZA AL");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_SCADENZAAL, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_SCADENZAAL, PPQRY_DISTINLIQUI1, "A.SCADENZA_AL", "DISTLIQSCAAL", 6, 10, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, 204, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, 384);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, 4, 448, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_IMPORTO, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  SUM(B.IMPORTO) ");
  SQL.append("from ");
  SQL.append("  LIQ_DISTINTA B ");
  SQL.append("where (B.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
  SQL.append("and   (A.ANNO_DISTINTA = B.ANNO_DISTINTA) ");
  SQL.append(")");
    PAN_DISTINLIQUID.SetFieldUnbound(PFL_DISTINLIQUID_IMPORTO, true);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_IMPORTO, PPQRY_DISTINLIQUI1, SQL.toString(), "IMPORTO", 3, 28, 6, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_LIST, 316, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_LIST, 48);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_FORM, 260, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_FORM, 64);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_STATO, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_STATO, PPQRY_DISTINLIQUI1, "A.STATO", "DISTLIQUSTAT", 1, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_STATO, (new IDVariant(10)), "In preparazione", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_STATO, (new IDVariant(20)), "Completa", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_STATO, (new IDVariant(25)), "Inclusa in Atto", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_STATO, (new IDVariant(27)), "Liquidabile", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_STATO, (new IDVariant(30)), "Liquidata", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_LIST, 296, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_LIST, "P. UN. ORG.");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGUNITORGA, MyGlb.PANEL_FORM, "PR. UN. ORGANIZ.");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_PROGUNITORGA, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_PROGUNITORGA, PPQRY_DISTINLIQUI1, "A.PROGR_UNITA_ORGANIZZATIVA", "DISLIQPRUNOR", 1, 8, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_LIST, 244, 264, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_FORM, 188, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_FORM, 144);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_UTENTEINSERI, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_UTENTEINSERI, PPQRY_DISTINLIQUI1, "A.UTENTE_INSERIMENTO", "DISLIQUTEINS", 5, 8, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_LIST, 0, 264, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_FORM, 4, 172, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_DATAINSERIME, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_DATAINSERIME, PPQRY_DISTINLIQUI1, "A.DATA_INSERIMENTO", "DISLIQDATINS", 8, 19, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_LIST, 124, 300, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_UTENTULTIAGG, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_UTENTULTIAGG, PPQRY_DISTINLIQUI1, "A.UTENTE_ULTIMO_AGG", "DISLIQUTULAG", 5, 8, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_LIST, 344, 300, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 220, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_DATAULTIMAGG, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_DATAULTIMAGG, PPQRY_DISTINLIQUI1, "A.DATA_ULTIMO_AGG", "DISLIQDAULAG", 8, 19, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_LIST, 4, 244, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_LIST, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_LIST, 2);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_LIST, "LINK GDM");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_FORM, 4, 244, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_FORM, 2);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_LINKGDM, MyGlb.PANEL_FORM, "LINK GDM");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_LINKGDM, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_LINKGDM, PPQRY_DISTINLIQUI1, "A.LINK_GDM", "DISLIQLINGDM", 5, 500, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_LIST, 4, 292, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_LIST, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_LIST, "PR. UO COMPETENZA");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_FORM, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROGRUOCOMPE, MyGlb.PANEL_FORM, "PR. UO COMPETENZA");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_PROGRUOCOMPE, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_PROGRUOCOMPE, PPQRY_DISTINLIQUI1, "A.PROGR_UO_COMPETENZA", "DISLIQPRUOCO", 1, 8, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_LIST, 4, 316, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_LIST, 128);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_LIST, "PR. UN. ORGANIZ. INS");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_FORM, 244, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_FORM, 160);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_PROUNIORGINS, MyGlb.PANEL_FORM, "PR. UN. ORGANIZ. INS");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_PROUNIORGINS, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_PROUNIORGINS, PPQRY_DISTINLIQUI1, "A.PROGR_UNITA_ORGANIZZATIVA_INS", "DILIPRUNORIN", 1, 8, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_LIST, 448, 36, 324, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_LIST, 348);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 412, 656, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_FORM, 348);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_FORM, 2);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_UNITAORGANIZ, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_UNITAORGANIZ, PPQRY_SO4ANAUNIORG, "A.DES_UNITA_ORGANIZZATIVA", "SOANUNORDEUO", 5, 120, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_LIST, 772, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_LIST, 160);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_LIST, "Condizioni Contrattuali");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_FORM, 4, 292, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_FORM, 160);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGCONDCONT, MyGlb.PANEL_FORM, "Condizioni Contrattuali");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_FLAGCONDCONT, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_FLAGCONDCONT, PPQRY_DISTINLIQUI1, "A.FLAG_COND_CONTRATTUALI", "DISLIQFLCOCO", 5, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGCONDCONT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGCONDCONT, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_LIST, 876, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_LIST, 148);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_LIST, "Scelta Fornitori");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_FORM, 4, 316, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_FORM, 148);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGSCELFORN, MyGlb.PANEL_FORM, "Scelta Fornitori");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_FLAGSCELFORN, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_FLAGSCELFORN, PPQRY_DISTINLIQUI1, "A.FLAG_SCELTA_FORNITORI", "DISLIQFLSCFO", 5, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGSCELFORN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGSCELFORN, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_LIST, 968, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_LIST, 200);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_LIST, "Regolarità Contributiva");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_FORM, 4, 340, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_FORM, 200);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGREGOCONT, MyGlb.PANEL_FORM, "Regolarità Contributiva");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_FLAGREGOCONT, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_FLAGREGOCONT, PPQRY_DISTINLIQUI1, "A.FLAG_REGOLARITA_CONTRIBUTIVA", "DISLIQFLRECO", 5, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGREGOCONT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGREGOCONT, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_LIST, 1060, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_LIST, 172);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_LIST, "Versamento Ritenute");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_FORM, 4, 472, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_FORM, 172);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGVERSRITE, MyGlb.PANEL_FORM, "Versamento Ritenute");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_FLAGVERSRITE, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_FLAGVERSRITE, PPQRY_DISTINLIQUI1, "A.FLAG_VERSAMENTO_RITENUTE", "DISLIQFLVERI", 5, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGVERSRITE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGVERSRITE, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_LIST, 1140, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_LIST, 108);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_LIST, "Nulla Osta");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_FORM, 108);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_FLAGNULLOSTA, MyGlb.PANEL_FORM, "Nulla Osta");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_FLAGNULLOSTA, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_FLAGNULLOSTA, PPQRY_DISTINLIQUI1, "A.FLAG_NULLA_OSTA", "DISLIQFLNUOS", 5, 2, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGNULLOSTA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_FLAGNULLOSTA, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_LIST, 0, 204, 608, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_LIST, 100);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_LIST, 3);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_LIST, "Storico Check");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_FORM, 4, 388, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_FORM, 116);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUOVAESPRESS, MyGlb.PANEL_FORM, "Storico Check");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUOVAESPRESS, -1, -1);
    PAN_DISTINLIQUID.SetFieldUnbound(PFL_DISTINLIQUID_NUOVAESPRESS, true);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUOVAESPRESS, PPQRY_DISTINLIQUI1, "REPLACE(A.STORICO_CHECK, ';', CHR(10))", "NUOVAESPRESS", 5, 99, 0, -13997);
  }

  private void PAN_DISTINLIQUID_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~DISLIQPRUNOR~~) ");
    SQL.append("and   (" + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = A.OTTICA) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, -1, "");
    PAN_DISTINLIQUID.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINLIQUID.SetMasterTable(PPQRY_SO4ANAUNIORG, "SO4_ANA_UNITA_ORGANIZZATIVE");
    PAN_DISTINLIQUID.SetIMDB(IMDB, "PQRY_DISTINLIQUI1", true);
    PAN_DISTINLIQUID.set_SetString(MyGlb.MASTER_ROWNAME, "DISTINTE LIQUIDAZIONE");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ANNO_DISTINTA as DISLIQANNDIS, ");
    SQL.append("  A.NUMERO_DISTINTA as DISLIQNUMDIS, ");
    SQL.append("  A.DATA_DISTINTA as DISLIQDATDIS, ");
    SQL.append("  A.ANNO_DEL as DISLIQANNDEL, ");
    SQL.append("  A.NUMERO_DEL as DISLIQNUMDEL, ");
    SQL.append("  A.SEDE_DEL as DISLIQSEDDEL, ");
    SQL.append("  A.ANNO_IMP as DISLIQANNIMP, ");
    SQL.append("  A.NUMERO_IMP as DISLIQNUMIMP, ");
    SQL.append("  A.ANNO_SUBIMP as DISLIQANNSUB, ");
    SQL.append("  A.NUMERO_SUBIMP as DISLIQNUMSUB, ");
    SQL.append("  A.TIPO_DIST as DISLIQTIPDIS, ");
    SQL.append("  A.FLAG_LIQUIDATO as DISLIQFLALIQ, ");
    SQL.append("  A.SCADENZA_DAL as DISLIQSCADAL, ");
    SQL.append("  A.SCADENZA_AL as DISTLIQSCAAL, ");
    SQL.append("  A.STATO as DISTLIQUSTAT, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DISLIQPRUNOR, ");
    SQL.append("  A.UTENTE_INSERIMENTO as DISLIQUTEINS, ");
    SQL.append("  A.DATA_INSERIMENTO as DISLIQDATINS, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as DISLIQUTULAG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DISLIQDAULAG, ");
    SQL.append("  A.LINK_GDM as DISLIQLINGDM, ");
    SQL.append("  A.PROGR_UO_COMPETENZA as DISLIQPRUOCO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA_INS as DILIPRUNORIN, ");
    SQL.append("  A.FLAG_COND_CONTRATTUALI as DISLIQFLCOCO, ");
    SQL.append("  A.FLAG_SCELTA_FORNITORI as DISLIQFLSCFO, ");
    SQL.append("  A.FLAG_REGOLARITA_CONTRIBUTIVA as DISLIQFLRECO, ");
    SQL.append("  A.FLAG_VERSAMENTO_RITENUTE as DISLIQFLVERI, ");
    SQL.append("  A.FLAG_NULLA_OSTA as DISLIQFLNUOS, ");
    SQL.append("  REPLACE(A.STORICO_CHECK, ';', CHR(10)) as NUOVAESPRESS, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  SUM(B.IMPORTO) ");
    SQL.append("from ");
    SQL.append("  LIQ_DISTINTA B ");
    SQL.append("where (B.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
    SQL.append("and   (A.ANNO_DISTINTA = B.ANNO_DISTINTA) ");
    SQL.append(") as IMPORTO ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE A, ");
    SQL.append("  IMP C, ");
    SQL.append("  LIQ_DISTINTA D, ");
    SQL.append("  CAP E, ");
    SQL.append("  FAT F ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CAPITOLO = E.CAPITOLO(+)) ");
    SQL.append("and   (C.ARTICOLO = E.ARTICOLO(+)) ");
    SQL.append("and   (E.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (E.E_S(+) = 'S') ");
    SQL.append("and   (A.ANNO_IMP = C.ANNO_IMP(+)) ");
    SQL.append("and   (A.NUMERO_IMP = C.NUMERO_IMP(+)) ");
    SQL.append("and   ((D.BENEFICIARIO = ~~PQRY_FILTRI5.NOMOGGCODFOR~~ AND NOT ((~~PQRY_FILTRI5.NOMOGGCODFOR~~ IS NULL))) OR (~~PQRY_FILTRI5.NOMOGGCODFOR~~ IS NULL)) ");
    SQL.append("and   (A.ANNO_DISTINTA = D.ANNO_DISTINTA) ");
    SQL.append("and   (A.NUMERO_DISTINTA = D.NUMERO_DISTINTA) ");
    SQL.append("and   (F.ANNO_PROG(+) = D.ANNO_PROG_FAT) ");
    SQL.append("and   (F.NUMERO_PROG(+) = D.NUMERO_PROG_FAT) ");
    SQL.append("and   ((F.NUMERO_DOC = ~~PQRY_FILTRI5.NOMOGGNUMDOC~~ AND NOT ((~~PQRY_FILTRI5.NOMOGGNUMDOC~~ IS NULL))) OR (~~PQRY_FILTRI5.NOMOGGNUMDOC~~ IS NULL)) ");
    SQL.append("and   ((F.NUM_PROT_GEN = ~~PQRY_FILTRI5.NOMOGGNUPRGE~~ AND NOT ((~~PQRY_FILTRI5.NOMOGGNUPRGE~~ IS NULL))) OR (~~PQRY_FILTRI5.NOMOGGNUPRGE~~ IS NULL)) ");
    SQL.append("and   ((F.NUMERO_PROT = ~~PQRY_FILTRI5.NOMOGGNUPRIN~~ AND NOT ((~~PQRY_FILTRI5.NOMOGGNUPRIN~~ IS NULL))) OR (~~PQRY_FILTRI5.NOMOGGNUPRIN~~ IS NULL)) ");
    SQL.append("and   (A.TIPO_DIST = 'L') ");
    SQL.append("and   ((NVL(A.FLAG_NULLA_OSTA, 'NO') = 'SI' AND NOT ((~~PQRY_FILTRI5.NOMOGGNULOST~~ IS NULL))) OR (~~PQRY_FILTRI5.NOMOGGNULOST~~ IS NULL)) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( D.COD_LIVELLO_5 ), 1, 3) = SUBSTR(TO_CHAR ( ~~PQRY_FILTRI5.NOMOGGCODLI2~~ ), 1, 3) OR NVL(~~PQRY_FILTRI5.NOMOGGCODLI2~~, -1) = -1) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( D.COD_LIVELLO_5 ), 1, 1) = SUBSTR(TO_CHAR ( ~~PQRY_FILTRI5.NOMOGGCODLI1~~ ), 1, 1) OR NVL(~~PQRY_FILTRI5.NOMOGGCODLI1~~, -1) = -1) ");
    SQL.append("and   (SUBSTR(E.CODICE_STRUTTURA, 3, 2) = SUBSTR(~~TBL_FILTRI32.NOMOGGPROMIS~~, 3, 2) OR NVL(~~TBL_FILTRI32.NOMOGGPROMIS~~, '-1') = '-1') ");
    SQL.append("and   (SUBSTR(E.CODICE_STRUTTURA, 1, 2) = ~~TBL_FILTRI32.NOMEOGGEMISS~~ OR NVL(~~TBL_FILTRI32.NOMEOGGEMISS~~, '-1') = '-1') ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_FILTRI32.NOMEOGGPROUO~~ OR (~~TBL_FILTRI32.NOMEOGGPROUO~~ IS NULL)) ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DISTINTA desc, ");
    SQL.append("  A.NUMERO_DISTINTA desc ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUI1, 5, SQL, -1, "");
    PAN_DISTINLIQUID.SetQueryDB(PPQRY_DISTINLIQUI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINLIQUID.SetMasterTable(0, "DISTINTE_LIQUIDAZIONE");
    PAN_DISTINLIQUID.AddToSortList(PFL_DISTINLIQUID_ANNODISTINTA, false);
    PAN_DISTINLIQUID.AddToSortList(PFL_DISTINLIQUID_NUMERODISTIN, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINLIQUID.Status() == 2)
    {
      int oldListQBE = PAN_DISTINLIQUID.iUseListQBE;
      PAN_DISTINLIQUID.iUseListQBE = 0;
      PAN_DISTINLIQUID.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINLIQUID.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINLIQUID.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRI_Init()
  {

    PAN_FILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, "0516FE92-1309-4DA5-B5F1-59E74FC66123");
    PAN_FILTRI.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, "Dati Fattura");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, MyGlb.PANEL_LIST, 0, -9999, 88, 10, 0, 0);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, MyGlb.PANEL_FORM, 20, 42, 584, 38, 0, 0);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, 0, 68);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, 1, 13);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, 0, 2);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, 1, 2);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRI_DATIFATTURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, "064940B8-7DE6-4BF3-B4B8-46D8B7725DB7");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, "Fornitore");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, "3D07DF38-58DB-4A63-B2AC-5BDE44F7A55F");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, "Codice Fornitore");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, "23748489-E666-411C-BDA6-2864C62B3B37");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, " ");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, "scelta ben");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.VIS_STATICBUTTON);
    PAN_FILTRI.SetImage(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, 0, "wsearch.gif", false);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, "8FC9BDA0-192B-47E2-B35E-90C01A6450C7");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, "Prot. Gen. N.");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, "54E9807A-4543-4CCB-A80F-DCC5B259779A");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, "Prot. Int. N.");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, "5006A9D7-E58D-4E78-8562-255B657CD93B");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, "Documento N.");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, "76F7D2CF-2044-4880-9A0C-F6547E8556A1");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, "Solo con Nulla Osta");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, "1E24ACCC-2740-4D15-8E9D-F69814CD6C07");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, "Titolo");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, "3BB8502E-12B7-4B5C-9F6E-25E4829540E0");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, "Macroprogramma");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, "80ED006C-DA3A-4CE8-A217-346FFBD6A769");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, "Missione");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, "Descrivi il contenuto del campo");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, "8807CF37-293D-4B0A-BDEA-512085DD1C90");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, "Programma");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, "7E7D00BE-6D56-48E4-8604-FCD4EF139CB6");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, "Unità Organizzativa");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_LIST, "Fornitore");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_FORM, 40, 12, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_FORM, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_BENDEBITORE, MyGlb.PANEL_FORM, "Fornitore");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_BENDEBITORE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_BENDEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_LIST, 116);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_LIST, "Cod. Forn.");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_FORM, 616, 12, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_FORM, 152);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODICEFORNIT, MyGlb.PANEL_FORM, "Codice Fornitore");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CODICEFORNIT, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CODICEFORNIT, PPQRY_FILTRI5, "A.NOMOGGCODFOR", "NOMOGGCODFOR", 2, 15, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.PANEL_LIST, 564, 12, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.PANEL_LIST, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.PANEL_FORM, 692, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.PANEL_FORM, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ETICHSCELBEN, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_ETICHSCELBEN, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_ETICHSCELBEN, -1, "", "ETICHSCELBEN", 0, 0, 0, -13997);
    PAN_FILTRI.set_ImageResizeMode(PFL_FILTRI_ETICHSCELBEN, 3);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_LIST, 136);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_LIST, "P. G. N");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_FORM, 404, 56, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_FORM, 100);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTGENE, MyGlb.PANEL_FORM, "Prot. Gen. N.");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_NUMEPROTGENE, -1, GRP_FILTRI_DATIFATTURA);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_NUMEPROTGENE, PPQRY_FILTRI5, "A.NOMOGGNUPRGE", "NOMOGGNUPRGE", 1, 7, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_LIST, 128);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_LIST, "P. I. N");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_FORM, 216, 56, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_FORM, 96);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMEPROTINTE, MyGlb.PANEL_FORM, "Prot. Int. N.");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_NUMEPROTINTE, -1, GRP_FILTRI_DATIFATTURA);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_NUMEPROTINTE, PPQRY_FILTRI5, "A.NOMOGGNUPRIN", "NOMOGGNUPRIN", 1, 7, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_LIST, "Documento N.");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_FORM, 24, 56, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_FORM, 100);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NUMERODOC, MyGlb.PANEL_FORM, "Documento N.");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_NUMERODOC, -1, GRP_FILTRI_DATIFATTURA);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_NUMERODOC, PPQRY_FILTRI5, "A.NOMOGGNUMDOC", "NOMOGGNUMDOC", 5, 20, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_LIST, 64);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_LIST, "Solo con Nulla Osta");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_FORM, 496, 96, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_FORM, 116);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_NULLAOSTA, MyGlb.PANEL_FORM, "Solo con Nulla Osta");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_NULLAOSTA, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_NULLAOSTA, PPQRY_FILTRI5, "A.NOMOGGNULOST", "NOMOGGNULOST", 5, 2, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_NULLAOSTA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_NULLAOSTA, (new IDVariant()), "Null", "", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_LIST, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_LIST, "Titolo");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_FORM, 44, 96, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_FORM, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO1, MyGlb.PANEL_FORM, "Titolo");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CODLIVELLO1, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CODLIVELLO1, PPQRY_FILTRI5, "A.NOMOGGCODLI1", "NOMOGGCODLI1", 1, 9, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_LIST, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_LIST, "Macropr.");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_FORM, 12, 120, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_FORM, 112);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODLIVELLO2, MyGlb.PANEL_FORM, "Macroprogramma");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CODLIVELLO2, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CODLIVELLO2, PPQRY_FILTRI5, "A.NOMOGGCODLI2", "NOMOGGCODLI2", 1, 9, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_LIST, 60);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_FORM, 64, 152, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_FORM, 60);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_MISSIONE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_MISSIONE, PPQRY_FILTRI5, "A.NOMEOGGEMISS", "NOMEOGGEMISS", 5, 21, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_LIST, 92);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_LIST, "Programma");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_FORM, 32, 176, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_FORM, 92);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRMISSION, MyGlb.PANEL_FORM, "Programma");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_PROGRMISSION, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_PROGRMISSION, PPQRY_FILTRI5, "A.NOMOGGPROMIS", "NOMOGGPROMIS", 5, 50, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_FORM, 4, 208, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_FORM, 120);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_PROGRUO, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_PROGRUO, PPQRY_FILTRI5, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 8, 0, -13997);
  }

  private void PAN_FILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRI.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~NOMOGGCODFOR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FILTRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_FILTRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_FILTRI.SetQueryLKE(PPQRY_BEN, PFL_FILTRI_CODICEFORNIT, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FILTRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_FILTRI.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_FILTRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_FILTRI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_FILTRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_FILTRI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_LIV_1 as CFESPICOCOL1, ");
    SQL.append("  MAX(TO_CHAR ( A.COD_LIV_1 ) || ' - ' || A.DES_LIV_1) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI A ");
    SQL.append("where (A.COD_LIV_1 = ~~NOMOGGCODLI1~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("group by ");
    SQL.append("  A.COD_LIV_1 ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMOGGCODLI1~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_FILTRI.SetQuery(PPQRY_CF4ESPPIACO1, 0, SQL, PFL_FILTRI_CODLIVELLO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_LIV_1 as CFESPICOCOL1, ");
    SQL.append("  MAX(TO_CHAR ( A.COD_LIV_1 ) || ' - ' || A.DES_LIV_1) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("group by ");
    SQL.append("  A.COD_LIV_1 ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_FILTRI.SetQuery(PPQRY_CF4ESPPIACO1, 1, SQL, PFL_FILTRI_CODLIVELLO1, "");
    PAN_FILTRI.SetQueryDB(PPQRY_CF4ESPPIACO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_LIV_2 as CFESPICOCOL2, ");
    SQL.append("  MAX(TO_CHAR ( A.COD_LIV_2 ) || ' - ' || A.DES_LIV_2) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI A ");
    SQL.append("where (A.COD_LIV_2 = ~~NOMOGGCODLI2~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.COD_LIV_1 = NVL(~~NOMOGGCODLI1~~, A.COD_LIV_1)) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("group by ");
    SQL.append("  A.COD_LIV_2 ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (NVL(~~NOMOGGCODLI2~~, -1) = -1) ");
    SQL.append("order by 1 ");
    PAN_FILTRI.SetQuery(PPQRY_CF4ESPPIACON, 0, SQL, PFL_FILTRI_CODLIVELLO2, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_LIV_2 as CFESPICOCOL2, ");
    SQL.append("  MAX(TO_CHAR ( A.COD_LIV_2 ) || ' - ' || A.DES_LIV_2) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("and   (A.COD_LIV_1 = NVL(~~NOMOGGCODLI1~~, A.COD_LIV_1)) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("group by ");
    SQL.append("  A.COD_LIV_2 ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_FILTRI.SetQuery(PPQRY_CF4ESPPIACON, 1, SQL, PFL_FILTRI_CODLIVELLO2, "");
    PAN_FILTRI.SetQueryDB(PPQRY_CF4ESPPIACON, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  TO_CHAR ( A.MISSIONE ) as ORDINAMENTO, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPRDEMI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~NOMEOGGEMISS~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  '(Tutte)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMEOGGEMISS~~ = '-1') ");
    SQL.append("order by 2 ");
    PAN_FILTRI.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_FILTRI_MISSIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  TO_CHAR ( A.MISSIONE ) as ORDINAMENTO, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPRDEMI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  '(Tutte)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_FILTRI.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_FILTRI_MISSIONE, "");
    PAN_FILTRI.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  TO_CHAR ( A.PROGRAMMA ) as VISMISPROORD, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPRDEPR ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~NOMOGGPROMIS~~) ");
    SQL.append("and   ((A.MISSIONE = ~~NOMEOGGEMISS~~) OR ~~NOMEOGGEMISS~~ = '-1') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMOGGPROMIS~~ = '-1') ");
    SQL.append("order by 2 ");
    PAN_FILTRI.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_FILTRI_PROGRMISSION, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  TO_CHAR ( A.PROGRAMMA ) as VISMISPROORD, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPRDEPR ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where ((A.MISSIONE = ~~NOMEOGGEMISS~~) OR ~~NOMEOGGEMISS~~ = '-1') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_FILTRI.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_FILTRI_PROGRMISSION, "");
    PAN_FILTRI.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DISLIQPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    PAN_FILTRI.SetQuery(PPQRY_DISTINLIQUI2, 0, SQL, PFL_FILTRI_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DISLIQPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE A ");
    SQL.append("where (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    PAN_FILTRI.SetQuery(PPQRY_DISTINLIQUI2, 1, SQL, PFL_FILTRI_PROGRUO, "");
    PAN_FILTRI.SetQueryDB(PPQRY_DISTINLIQUI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRI.SetIMDB(IMDB, "PQRY_FILTRI5", true);
    PAN_FILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_FILTRI.SetQueryIMDB(PPQRY_FILTRI5, IMDBDef14.PQRY_FILTRI5_RS, IMDBDef5.TBL_FILTRI32);
    JustLoaded = true;
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CODICEFORNIT, IMDBDef5.FLD_FILTRI32_NOMOGGCODFOR);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_NUMEPROTGENE, IMDBDef5.FLD_FILTRI32_NOMOGGNUPRGE);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_NUMEPROTINTE, IMDBDef5.FLD_FILTRI32_NOMOGGNUPRIN);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_NUMERODOC, IMDBDef5.FLD_FILTRI32_NOMOGGNUMDOC);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_NULLAOSTA, IMDBDef5.FLD_FILTRI32_NOMOGGNULOST);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CODLIVELLO1, IMDBDef5.FLD_FILTRI32_NOMOGGCODLI1);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CODLIVELLO2, IMDBDef5.FLD_FILTRI32_NOMOGGCODLI2);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_MISSIONE, IMDBDef5.FLD_FILTRI32_NOMEOGGEMISS);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_PROGRMISSION, IMDBDef5.FLD_FILTRI32_NOMOGGPROMIS);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_PROGRUO, IMDBDef5.FLD_FILTRI32_NOMEOGGPROUO);
    PAN_FILTRI.SetMasterTable(0, "FILTRI32");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRI.Status() == 2)
    {
      int oldListQBE = PAN_FILTRI.iUseListQBE;
      PAN_FILTRI.iUseListQBE = 0;
      PAN_FILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_DynamicProperties();
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
