// **********************************************
// Dettaglio Documenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettaglioDocumenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_AZIONE1 = 0;
  private static int PFL_PARAMETRI_DATASELEDOCU = 1;
  private static int PFL_PARAMETRI_INCLDOCUPAGA = 2;

  private static int PPQRY_PARAMETRI600 = 0;

  private static int PPQRY_COSTANIMPEXP = 1;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_TABBEDVIEW;
  private static int GRP_DOCUMENTI_DOCUMENTO = 0;
  private static int GRP_DOCUMENTI_PROTOCINTERN = 1;
  private static int GRP_DOCUMENTI_PROTOCGENERA = 2;

  private static int PFL_DOCUMENTI_PROGREREGIS1 = 0;
  private static int PFL_DOCUMENTI_ANNOPROG = 1;
  private static int PFL_DOCUMENTI_NUMEROPROG = 2;
  private static int PFL_DOCUMENTI_RAGISOCIESTE = 3;
  private static int PFL_DOCUMENTI_NUMERODOC = 4;
  private static int PFL_DOCUMENTI_INFOFATTURA = 5;
  private static int PFL_DOCUMENTI_DDATADOC = 6;
  private static int PFL_DOCUMENTI_CODICEDOC = 7;
  private static int PFL_DOCUMENTI_STATOLIQ = 8;
  private static int PFL_DOCUMENTI_IMPORTO = 9;
  private static int PFL_DOCUMENTI_SALDO = 10;
  private static int PFL_DOCUMENTI_NUMEROPROT = 11;
  private static int PFL_DOCUMENTI_DDATAPROT = 12;
  private static int PFL_DOCUMENTI_NUMPROTGEN = 13;
  private static int PFL_DOCUMENTI_DATAARRIVO = 14;
  private static int PFL_DOCUMENTI_STORNO = 15;
  private static int PFL_DOCUMENTI_STATODELDEB1 = 16;
  private static int PFL_DOCUMENTI_IDSDI = 17;
  private static int PFL_DOCUMENTI_NOMEFILE1 = 18;
  private static int PFL_DOCUMENTI_ETICULTISTEP = 19;
  private static int PFL_DOCUMENTI_ETICAPRIFILE = 20;
  private static int PFL_DOCUMENTI_SEMODIFICDOC = 21;
  private static int PFL_DOCUMENTI_UTENTMODIDOC = 22;
  private static int PFL_DOCUMENTI_DATAMODIFDOC = 23;
  private static int PFL_DOCUMENTI_IDGDMFE = 24;
  private static int PFL_DOCUMENTI_ULTIMAAZIONE = 25;

  private static int PPQRY_PCCDOCUMENTI = 0;

  private static int PPQRY_DUAL = 1;

  private static int PPQRY_T03 = 2;


  IDPanel PAN_DOCUMENTI;
  private static int PFL_STEP_PROGREREGIST = 0;
  private static int PFL_STEP_SEQUENZA = 1;
  private static int PFL_STEP_AZIONE = 2;
  private static int PFL_STEP_DATAULTIVARI = 3;
  private static int PFL_STEP_STATODELDEBI = 4;
  private static int PFL_STEP_IMPORTPARZIA = 5;
  private static int PFL_STEP_NOMEFILE = 6;
  private static int PFL_STEP_STEPANNULLAT = 7;
  private static int PFL_STEP_NOTE = 8;
  private static int PFL_STEP_UTENULTIVARI = 9;
  private static int PFL_STEP_UTENTINOMINA = 10;
  private static int PFL_STEP_CODICEESITO = 11;
  private static int PFL_STEP_DESCRESITO = 12;
  private static int PFL_STEP_ETICHESOGGET = 13;
  private static int PFL_STEP_ETICHEDOCUME = 14;
  private static int PFL_STEP_ETICIMPOHEAD = 15;
  private static int PFL_STEP_ETICHEIMPORT = 16;
  private static int PFL_STEP_ETICHETSTATO = 17;
  private static int PFL_STEP_ETIICOSTALIQ = 18;

  private static int PPQRY_PCCSTEP1 = 0;

  private static int PPQRY_UTENTI = 1;


  IDPanel PAN_STEP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI601(IMDB);
    //
    //
    Init_PQRY_PARAMETRI600(IMDB);
    Init_PQRY_PARAMETRI600_RS(IMDB);
    Init_PQRY_PCCDOCUMENTI(IMDB);
    Init_PQRY_PCCSTEP1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI601(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI601, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI601, "TBL_PARAMETRI601");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, "PARAMAZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE,5,52,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARDATSELDOC, "PARDATSELDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARDATSELDOC,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARADATANECE, "PARADATANECE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARADATANECE,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARSTRDOCSEL, "PARSTRDOCSEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARSTRDOCSEL,9,2000,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARNUMDOCSEL, "PARNUMDOCSEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARNUMDOCSEL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG, "PARTIPPROREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARINCDOCPAG, "PARINCDOCPAG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI601,IMDBDef2.FLD_PARAMETRI601_PARINCDOCPAG,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI601, 0);
  }

  private static void Init_PQRY_PARAMETRI600(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI600, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI600, "PQRY_PARAMETRI600");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI600,IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, "PARAMAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI600,IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE,5,52,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI600,IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, "PARDATSELDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI600,IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI600,IMDBDef10.PQSL_PARAMETRI600_PARINCDOCPAG, "PARINCDOCPAG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI600,IMDBDef10.PQSL_PARAMETRI600_PARINCDOCPAG,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI600, 0);
  }

  private static void Init_PQRY_PARAMETRI600_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI600_RS, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI600_RS, "PQRY_PARAMETRI600_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI600_RS,IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, "PARAMAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI600_RS,IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE,5,52,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI600_RS,IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, "PARDATSELDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI600_RS,IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI600_RS,IMDBDef10.PQSL_PARAMETRI600_PARINCDOCPAG, "PARINCDOCPAG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI600_RS,IMDBDef10.PQSL_PARAMETRI600_PARINCDOCPAG,5,1,0);
  }

  private static void Init_PQRY_PCCDOCUMENTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PCCDOCUMENTI, 24);
    IMDB.set_TblCode(IMDBDef10.PQRY_PCCDOCUMENTI, "PQRY_PCCDOCUMENTI");
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCPROREG, "PCCDOCPROREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCPROREG,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCANNPRO, "PCCDOCANNPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCNUMPRO, "PCCDOCNUMPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCNUMPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOBERASOES, "PCDOBERASOES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOBERASOES,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFANUDO, "PCCDOCFANUDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFANUDO,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOFADDADO, "PCCDOFADDADO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOFADDADO,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFACODO, "PCCDOCFACODO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFACODO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFATIMP, "PCCDOCFATIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFATIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_SALDO, "SALDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_SALDO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFANUPR, "PCCDOCFANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFANUPR,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOFADDAPR, "PCCDOFADDAPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOFADDAPR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFANUPRGE, "PCDOFANUPRGE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFANUPRGE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFADAAR, "PCCDOCFADAAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFADAAR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTSTDD, "PCDOPCSTSTDD");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTSTDD,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTNOFI, "PCDOPCSTNOFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTNOFI,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFATSTO, "PCCDOCFATSTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFATSTO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCSEMODO, "PCCDOCSEMODO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCSEMODO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCUTMODO, "PCCDOCUTMODO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCUTMODO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCDAMODO, "PCCDOCDAMODO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCDAMODO,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTDAUV, "PCDOPCSTDAUV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTDAUV,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFAIDGDFE, "PCDOFAIDGDFE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFAIDGDFE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFEDOIDSD, "PCDOFEDOIDSD");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFEDOIDSD,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_STATOLIQ, "STATOLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_STATOLIQ,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_ULTIMAAZIONE, "ULTIMAAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENTI,IMDBDef10.PQSL_PCCDOCUMENTI_ULTIMAAZIONE,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PCCDOCUMENTI, 0);
  }

  private static void Init_PQRY_PCCSTEP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PCCSTEP1, 12);
    IMDB.set_TblCode(IMDBDef10.PQRY_PCCSTEP1, "PQRY_PCCSTEP1");
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPROREG, "PCCSTEPROREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPROREG,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPSEQUE, "PCCSTEPSEQUE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPSEQUE,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPAZION, "PCCSTEPAZION");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPAZION,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTESTDEDE, "PCCSTESTDEDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTESTDEDE,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEIMPPAR, "PCCSTEIMPPAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEIMPPAR,3,12,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTENOMFIL, "PCCSTENOMFIL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTENOMFIL,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPANNUL, "PCCSTEPANNUL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPANNUL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPNOTE, "PCCSTEPNOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEPNOTE,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEDAULVA, "PCCSTEDAULVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEDAULVA,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEUTULVA, "PCCSTEUTULVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEUTULVA,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTECODESI, "PCCSTECODESI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTECODESI,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEDESESI, "PCCSTEDESESI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP1,IMDBDef10.PQSL_PCCSTEP1_PCCSTEDESESI,5,200,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PCCSTEP1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettaglioDocumenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettaglioDocumenti()
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
    FormIdx = MyGlb.FRM_DETTAGDOCUME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EC3B31D0-4321-4542-A5B1-575E0F297711";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 972;
    DesignHeight = 546;
    set_Caption(new IDVariant("Dettaglio Documenti"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 972;
    Frames[1].Height = 520;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0769231;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 972;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 972-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6F7D6134-284D-4128-AD77-CE0735ECB0CA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 152, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Width = 972;
    Frames[3].Height = 480;
    Frames[3].Caption = "Tabbed View";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 480;
    TAB_TABBEDVIEW = new OTabView(this);
    Frames[3].Content = TAB_TABBEDVIEW;
    TAB_TABBEDVIEW.iGuid = "9F4582F2-904C-4392-BD7F-ED5D674C3989";
    TAB_TABBEDVIEW.SetItemCount(2);
    TAB_TABBEDVIEW.Placement = 1;
    TAB_TABBEDVIEW.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Documenti";
    Frames[4].Parent = this;
    PAN_DOCUMENTI = new IDPanel(w, this, 4, "PAN_DOCUMENTI");
    Frames[4].Content = PAN_DOCUMENTI;
    PAN_DOCUMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMENTI.VS = MainFrm.VisualStyleList;
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 972-MyGlb.PAN_OFFS_X, 480-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B8F8F1B5-FFD5-4230-98E3-625A46BE6089");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1684, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMENTI.InitStatus = 1;
    PAN_DOCUMENTI_Init();
    PAN_DOCUMENTI_InitFields();
    PAN_DOCUMENTI_InitQueries();
    TAB_TABBEDVIEW.SetItem(1, Frames[4], 0, "", "Documenti", "Documenti estratti per comunicazione a  PCC");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Step";
    Frames[5].Parent = this;
    PAN_STEP = new IDPanel(w, this, 5, "PAN_STEP");
    Frames[5].Content = PAN_STEP;
    PAN_STEP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STEP.VS = MainFrm.VisualStyleList;
    PAN_STEP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 972-MyGlb.PAN_OFFS_X, 480-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "855FFB5E-00B2-4A76-9CA1-2E7969DA09C9");
    PAN_STEP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 56, 896, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STEP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STEP.InitStatus = 2;
    PAN_STEP_Init();
    PAN_STEP_InitFields();
    PAN_STEP_InitQueries();
    TAB_TABBEDVIEW.SetItem(2, Frames[5], 0, "", "Step", "I diversi step di elaborazione subiti dai singoli documenti");
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG182+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG181+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG182+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CAMBAZIOANNU+BaseCmdLinIdx)
      {
        CambiaAzioneAnnulla();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RENMODDOCCOR+BaseCmdLinIdx)
      {
        RendiModificabileDocumentoCorrente();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPESIRICPCC+BaseCmdLinIdx)
      {
        ImportaEsitoRicezionePCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ACCETMANUPCC+BaseCmdLinIdx)
      {
        AccettazioneManualePCC();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI601, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DETTAGDOCUME_PARAMETRI600();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DOCUMENTI.UpdatePanel(MainFrm);
      PAN_STEP.UpdatePanel(MainFrm);
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
    return (obj instanceof DettaglioDocumenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettaglioDocumenti.class.getName() : (Glb.ClassWithPackage(DettaglioDocumenti.class) ? DettaglioDocumenti.class.getName().substring(DettaglioDocumenti.class.getPackage().getName().length() + 1) : DettaglioDocumenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      PAN_DOCUMENTI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DOCUMENTI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_STEP.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0)))
      {
        PAN_DOCUMENTI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_DOCUMENTI.Freezed = (new IDVariant(0)).booleanValue();
      }
      PAN_DOCUMENTI.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      PAN_STEP.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARINCDOCPAG, 0, (new IDVariant("N")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARDATSELDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARADATANECE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARSTRDOCSEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARNUMDOCSEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARINCDOCPAG, 0, new IDVariant());
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
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_REQUERY);
      PAN_STEP.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "EndModal", _e);
    }
  }

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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_AZIONE1)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARINCDOCPAG, 0, (new IDVariant("N")));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0),(new IDVariant("TUTTE"))).compareTo((new IDVariant("TUTTE")), true)!=0)
        {
          IDVariant I = null;
          I = IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0), (new IDVariant(0)), (new IDVariant(2))));
          // if (I.compareTo((new IDVariant(80)), true)>=0)
          // {
            // if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, 0)))
            // {
              // IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, 0, IDL.Today());
            // }
          // }
          // else
          // {
            // IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, 0, (new IDVariant()));
          // }
          if (I.equals((new IDVariant(10)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG, 0, (new IDVariant("RUF")));
          }
          else
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DATASELEDOCU)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, 0))) && IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, 0).compareTo(IDL.Today(), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione! La data non può essere superiore alla data odierna!"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARDATSELDOC, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
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
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0))))
      {
        IDVariant I = null;
        I = (new IDVariant(0));
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0).compareTo((new IDVariant("TUTTE")), true)!=0)
        {
          I = IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0), (new IDVariant(0)), (new IDVariant(2))));
        }
        // if (I.compareTo((new IDVariant(80)), true)>=0)
        // {
          // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (I.equals((new IDVariant(31)), true) || I.equals((new IDVariant(4)), true) || I.equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0).equals((new IDVariant("TUTTE")), true) || (I.compareTo((new IDVariant(40)), true)>=0 && I.compareTo((new IDVariant(60)), true)<0))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (MainFrm.ESITODOC002.equals((new IDVariant("SI")), true) && IDL.SubStr(IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0), (new IDVariant(1)), (new IDVariant(2))).equals((new IDVariant("25")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_IMPESIRICPCC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCETMANUPCC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_IMPESIRICPCC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCETMANUPCC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_ULTIMAAZIONE,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_ULTIMAAZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tabbed View Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_TABBEDVIEW_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tabbed View Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_STEP.FrIndex)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCPROREG, 0)))
        {
          Cancel.set((new IDVariant(-1)));
          return;
        }
        PAN_STEP.set_FieldText(PFL_STEP_ETICHESOGGET, IDL.Add((new IDVariant("Soggetto: ")), (new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_RAGISOCIESTE)))).stringValue());
        PAN_STEP.set_FieldText(PFL_STEP_ETICHEDOCUME, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_CODICEDOC))), (new IDVariant(" "))), (new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_NUMERODOC)))), (new IDVariant(" "))), (new IDVariant("del"))), (new IDVariant(" "))), (new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_DDATADOC)))).stringValue());
        PAN_STEP.set_FieldText(PFL_STEP_ETICHEIMPORT, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFATIMP, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_STATOLIQ, 0).equals((new IDVariant("N")), true))
        {
          IDVariant v_TOOLICONNERA = new IDVariant(0,IDVariant.STRING);
          v_TOOLICONNERA = (new IDVariant("Mandato Emesso"));
          PAN_STEP.set_FieldText(PFL_STEP_ETICHETSTATO, new IDVariant(v_TOOLICONNERA).stringValue());
          PAN_STEP.SetImage(Glb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0, (new IDVariant("vnera.gif")).stringValue()); 
        }
        else if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_STATOLIQ, 0).equals((new IDVariant("R")), true))
        {
          IDVariant v_TOOLICONNERA = new IDVariant(0,IDVariant.STRING);
          v_TOOLICONNERA = (new IDVariant("Liquidata - in Emissione"));
          PAN_STEP.set_FieldText(PFL_STEP_ETICHETSTATO, new IDVariant(v_TOOLICONNERA).stringValue());
          PAN_STEP.SetImage(Glb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0, (new IDVariant("vrossa.gif")).stringValue()); 
        }
        else if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_STATOLIQ, 0).equals((new IDVariant("V")), true))
        {
          IDVariant v_TOOLICONVERD = new IDVariant(0,IDVariant.STRING);
          v_TOOLICONVERD = (new IDVariant("Liquidata"));
          PAN_STEP.set_FieldText(PFL_STEP_ETICHETSTATO, new IDVariant(v_TOOLICONVERD).stringValue());
          PAN_STEP.SetImage(Glb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0, (new IDVariant("vverde.gif")).stringValue()); 
        }
        else if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_STATOLIQ, 0).equals((new IDVariant("G")), true))
        {
          IDVariant v_TOOLICONGIAL = new IDVariant(0,IDVariant.STRING);
          v_TOOLICONGIAL = (new IDVariant("Inserita in Distinta"));
          PAN_STEP.set_FieldText(PFL_STEP_ETICHETSTATO, new IDVariant(v_TOOLICONGIAL).stringValue());
          PAN_STEP.SetImage(Glb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0, (new IDVariant("vgialla.gif")).stringValue()); 
        }
        else
        {
          PAN_STEP.set_FieldText(PFL_STEP_ETICHETSTATO, (new IDVariant("")).stringValue());
          PAN_STEP.SetImage(Glb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0, (new IDVariant("")).stringValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "TabbedViewChangePage", _e);
    }
  }

  // **********************************************************************
  // Documenti On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMENTI);
      // 
      // Documenti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_RAGISOCIESTE,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_RAGISOCIESTE))).stringValue()); 
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCSEMODO, 0),(new IDVariant(2))).equals((new IDVariant(1)), true))
      {
        PAN_DOCUMENTI.set_VisualStyle(Glb.OBJ_FIELD,PFL_DOCUMENTI_NUMERODOC,new IDVariant(MyGlb.VIS_NORFIETESROS).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "DocumentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Documenti Before Find
  // Evento notificato dal pannello prima di eseguire una
  // operazione di recupero dati.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DOCUMENTI_BeforeFind (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Before Find Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "DocumentiBeforeFind", _e);
    }
  }

  // **********************************************************************
  // Documenti On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_DOCUMENTI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DOCUMENTI.Status()).equals((new IDVariant(1)), true))
      {
        PAN_DOCUMENTI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_DOCUMENTI.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "DocumentiOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Step On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STEP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STEP);
      // 
      // Step On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_STEP.set_ToolTip(Glb.OBJ_FIELD,PFL_STEP_NOTE,(new IDVariant(PAN_STEP.FieldText(PFL_STEP_NOTE))).stringValue()); 
      PAN_STEP.set_ToolTip(Glb.OBJ_FIELD,PFL_STEP_DESCRESITO,(new IDVariant(PAN_STEP.FieldText(PFL_STEP_DESCRESITO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "StepOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Apri File
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaApriFile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Apri File Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTNOFI, 0))))
      {
        MainFrm.ApriCSVPCC(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTNOFI, 0), (new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "EtichettaApriFile", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cambia Azione Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CambiaAzioneAnnulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Cambia Azione Annulla Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_NUMDOCSEL = null;
      v_NUMDOCSEL = (new IDVariant(0));
      IDVariant v_ELENCODOC = null;
      v_ELENCODOC = (new IDVariant("@"));
      C2 = PAN_DOCUMENTI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_DOCUMENTI.GotoFirst();
      while (!PAN_DOCUMENTI.RSEOF())
      {
        if (PAN_DOCUMENTI.IsRowSelected(I.intValue()))
        {
          v_ELENCODOC = IDL.Add(IDL.Add(v_ELENCODOC, IDL.ToString(C2.Get("PCCDOCPROREG"))), (new IDVariant("@")));
          v_NUMDOCSEL = IDL.Add(v_NUMDOCSEL, (new IDVariant(1)));
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_DOCUMENTI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (IDL.NullValue(v_NUMDOCSEL,(new IDVariant(0))).equals((new IDVariant(0)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stato selezionato nessun documento"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI607, IMDBDef2.FLD_PARAMETRI607_PARAMDOCSEL, 0, new IDVariant(v_ELENCODOC));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI607, IMDBDef2.FLD_PARAMETRI607_PARNUMDOCSEL, 0, new IDVariant(v_NUMDOCSEL));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI607, IMDBDef2.FLD_PARAMETRI607_PARASTEPINIZ, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI600, IMDBDef10.PQSL_PARAMETRI600_PARAMAZIONE, 0));
        MainFrm.Show(MyGlb.FRM_CAMBAZIOANNU, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "CambiaAzioneAnnulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Rendi Modificabile Documento Corrente
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RendiModificabileDocumentoCorrente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rendi Modificabile Documento Corrente Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(MainFrm.MODDOCUMENTO,(new IDVariant("T"))).equals((new IDVariant("C")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCDOFAIDGDFE, 0))))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("La possibilita' di modifica da PCC e' ammessa solo per le fatture cartacee"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARAMSOGGETT, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCDOBERASOES, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARAMNUMEDOC, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFANUDO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARAMDATADOC, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOFADDADO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARANUMEPROT, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCFANUPR, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARADATAPROT, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOFADDAPR, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARAPROGREGI, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCPROREG, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARAMSEMODIF, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCSEMODO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARAUTENMODI, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCUTMODO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI628, IMDBDef2.FLD_PARAMETRI628_PARADATAMODI, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCDAMODO, 0));
        MainFrm.Show(MyGlb.FRM_RENDMODIDOCU, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "RendiModificabileDocumentoCorrente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Importa Esito Ricezione PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ImportaEsitoRicezionePCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Importa Esito Ricezione PCC Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_IMPESIRICPCC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "ImportaEsitoRicezionePCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accettazione Manuale PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AccettazioneManualePCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accettazione Manuale PCC Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI630, IMDBDef3.FLD_PARAMETRI630_PARAPROGREGI, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCPROREG, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI630, IMDBDef3.FLD_PARAMETRI630_PARAMSCELTA, 0, (new IDVariant("D")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI630, IMDBDef3.FLD_PARAMETRI630_PARANOMEFILE, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCDOPCSTNOFI, 0));
      MainFrm.Show(MyGlb.FRM_ACCETMANUPCC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "AccettazioneManualePCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Fattura Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCNUMPRO, 0))))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOFATTURA,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCANNPRO, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENTI, IMDBDef10.PQSL_PCCDOCUMENTI_PCCDOCNUMPRO, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioDocumenti", "InfoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DETTAGDOCUME_PARAMETRI600() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI600_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI601, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI601, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI600_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI600_RS, 0, IMDBDef2.TBL_PARAMETRI601, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI600_RS, 0, 0, IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI600_RS, 1, 0, IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARDATSELDOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI600_RS, 2, 0, IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARINCDOCPAG, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI601, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI601, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI601, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI600_RS, 0);
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

  private void TAB_TABBEDVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_TABBEDVIEW_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMENTI, Cancel);
    // Stub
  }

  private void PAN_DOCUMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCUMENTI_INFOFATTURA)
    {
      this.IdxPanelActived = this.PAN_DOCUMENTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DOCUMENTI_ETICAPRIFILE)
    {
      this.IdxPanelActived = this.PAN_DOCUMENTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaApriFile();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCUMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_STEP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STEP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STEP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STEP, Cancel);
    // Stub
  }

  private void PAN_STEP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STEP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_STEP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCSTEP1, IMDBDef10.PQSL_PCCSTEP1_PCCSTEPANNUL, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PCCSTEP1, IMDBDef10.PQSL_PCCSTEP1_PCCSTEPANNUL, 0, (new IDVariant("SI")));
      }
      if (Cancel.isFalse())
      {
        PAN_STEP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, "4D8E526A-267F-4BBF-9BC7-F9C9BC7BF4A7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, "Documenti con ultima azione:");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, "898C6F69-3DCD-4C3C-8D8A-321BCC259F40");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, "Data Selezione Documenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, "81670E70-F55E-40F9-A415-F0A6753D630C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, "Anche Documenti Completamente Pagati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_LIST, 4, 164, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_LIST, "Docum. con ult. azion.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_FORM, 8, 8, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_FORM, 176);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AZIONE1, MyGlb.PANEL_FORM, "Documenti con ultima azione:");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AZIONE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AZIONE1, PPQRY_PARAMETRI600, "A.PARAMAZIONE", "PARAMAZIONE", 5, 52, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_LIST, 156);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_LIST, "Dt. Selezione Documenti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_FORM, 556, 8, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_FORM, 156);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATASELEDOCU, MyGlb.PANEL_FORM, "Data Selezione Documenti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATASELEDOCU, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATASELEDOCU, PPQRY_PARAMETRI600, "A.PARDATSELDOC", "PARDATSELDOC", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_LIST, 152);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_LIST, "Anche Documenti Completamente Pagati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_FORM, 568, 8, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_FORM, 244);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INCLDOCUPAGA, MyGlb.PANEL_FORM, "Anche Documenti Completamente Pagati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INCLDOCUPAGA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INCLDOCUPAGA, PPQRY_PARAMETRI600, "A.PARINCDOCPAG", "PARINCDOCPAG", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INCLDOCUPAGA, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INCLDOCUPAGA, (new IDVariant("N")), "N", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA_BANCA as COSIMPEXSIBA, ");
    SQL.append("  'AA' || A.SIGLA_BANCA as ORDINE, ");
    SQL.append("  A.SIGLA_BANCA || ' - ' || A.TITOLO as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  COSTANTI_IMP_EXP A ");
    SQL.append("where (A.SIGLA_BANCA LIKE ~~PARAMAZIONE~~ || '%') ");
    SQL.append("and   (A.TIPO_FILE = 34) ");
    SQL.append("and   (A.SIGLA_BANCA <> '99') ");
    SQL.append("and   (A.SIGLA_BANCA <> '25RCA' OR " + IDL.CSql(MainFrm.ESITODOC002, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'TUTTE', ");
    SQL.append("  'BB', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_COSTANIMPEXP, 0, SQL, PFL_PARAMETRI_AZIONE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA_BANCA as COSIMPEXSIBA, ");
    SQL.append("  'AA' || A.SIGLA_BANCA as ORDINE, ");
    SQL.append("  A.SIGLA_BANCA || ' - ' || A.TITOLO as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  COSTANTI_IMP_EXP A ");
    SQL.append("where (A.TIPO_FILE = 34) ");
    SQL.append("and   (A.SIGLA_BANCA <> '99') ");
    SQL.append("and   (A.SIGLA_BANCA <> '25RCA' OR " + IDL.CSql(MainFrm.ESITODOC002, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'TUTTE', ");
    SQL.append("  'BB', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_COSTANIMPEXP, 1, SQL, PFL_PARAMETRI_AZIONE1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_COSTANIMPEXP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI600", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI600, IMDBDef10.PQRY_PARAMETRI600_RS, IMDBDef2.TBL_PARAMETRI601);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AZIONE1, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATASELEDOCU, IMDBDef2.FLD_PARAMETRI601_PARDATSELDOC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INCLDOCUPAGA, IMDBDef2.FLD_PARAMETRI601_PARINCDOCPAG);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI601");
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

  private void PAN_DOCUMENTI_Init()
  {

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, "3FE09EBC-B35B-4925-B724-4B7714FECFAC");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, "Documento");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 296, -9999, 452, 16, 0, 0);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 0, 291, 204, 313, 0, 0);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, 0, 65);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, 1, 13);
    PAN_DOCUMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, 0, 4);
    PAN_DOCUMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, 1, 4);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, "9A38143F-CB90-46CA-9114-5E4F4589F797");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, "Protocollo Interno");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, MyGlb.VIS_GROUPSTYLE);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, MyGlb.PANEL_LIST, 1004, -9999, 156, 16, 0, 0);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, MyGlb.PANEL_FORM, 0, 411, 156, 73, 0, 0);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, 0, 103);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, 1, 13);
    PAN_DOCUMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, 0, 4);
    PAN_DOCUMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, 1, 4);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCINTERN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, "945D5A5C-7490-4F1B-8790-7D2FD327C085");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, "Protocollo Generale");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, MyGlb.VIS_GROUPSTYLE);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, MyGlb.PANEL_LIST, 1160, -9999, 156, 16, 0, 0);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, MyGlb.PANEL_FORM, 0, 459, 164, 73, 0, 0);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, 0, 111);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, 1, 13);
    PAN_DOCUMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, 0, 4);
    PAN_DOCUMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, 1, 4);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_GROUP, GRP_DOCUMENTI_PROTOCGENERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, "5D3AED0E-94C1-4E06-9E97-715392167203");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, "PROGRESSIVO REGISTRAZIONE");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "4CC4922B-A67E-4F81-833F-BE8D782A9D8B");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "ANNO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, 0, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "02892D5D-15E7-4A73-9185-3D481F54F9DF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "NUMERO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, 0, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, "661FD767-04A6-4EFE-A52D-578D28008850");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, "Fornitore");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "B1374C12-D68D-4C62-855A-8301439E6EB6");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "Numero");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, "C756E2B0-B789-4322-8E38-B4B448F85319");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, " ");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, "5F02B42F-9080-48D3-B8A7-50313103882E");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, "Data");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, "7021F9D2-6EEF-4535-BA00-16C70328C9FF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, "Tipo");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, "D931DCDD-1678-41D2-8599-6F7A22E3E9BF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, " ");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, "55EC73C4-7C5C-4AE8-A8C4-4A053935BA75");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, "Importo");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, "26D4A955-4CE7-4327-B6C6-7CB9824FF1B8");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, "Saldo");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, "4C3DC546-8A02-4D1C-9959-36EBCBC1A183");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, "Numero");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, "4EFC6A27-4D29-4957-A4F3-B37FF78192EF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, "Data");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, "0C7DD326-5F80-496F-9596-D9944AE4B056");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, "Numero");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, "AFF46C1D-4100-4127-8D37-E9159B187D67");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, "Data");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, "68FCB5FE-5EBE-431A-80D3-F46DA4BB629D");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, "STORNO");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, "BE59611B-7FC0-4383-896C-A40152DC6286");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, "Stato del Debito");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, "Stato del debito Comunicato a PCC");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, "62E44B16-380B-4AB7-B817-DBC8E125B446");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, "Identificativo SDI");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.VIS_NORFIEINTLUN);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, "BCE37195-480B-4196-9CFA-E2E7BAF01DC6");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, "Nome File");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, "D2D2352F-E5B7-4F9D-9849-88593BFFE19E");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, "Ultimo Step:");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.VIS_VUOGRAALILEF);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, "FE31D61E-83D9-404E-9CDD-CF81CB908C61");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_DOCUMENTI.SetImage(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, 0, "csv.gif", false);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, "2AB91D98-08DC-4B87-90E6-266F3D457878");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, "SE MODIFICA DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, "14DEEE06-4E2F-4BC4-ACD5-42BF6B1794C9");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, "UTENTE MODIFICA DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, "74E5694D-068F-408F-B1AE-B9465EAEF987");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, "DATA MODIFICA DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, "D8FA48FB-8929-4ACC-9367-7B95D1819E2B");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, "ID GDM FE");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, "3FB67A07-103B-49B2-954D-C12B6485C634");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, "Ultima Azione");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DOCUMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_LIST, 180);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_LIST, "PROGRESSIVO REGISTRAZIONE");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_FORM, 4, 4, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_FORM, 160);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_PROGREREGIS1, MyGlb.PANEL_FORM, "PROGR. REGISTRAZIONE");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_PROGREREGIS1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_PROGREREGIS1, PPQRY_PCCDOCUMENTI, "A.PROGRESSIVO_REGISTRAZIONE", "PCCDOCPROREG", 5, 12, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 104, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 160);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNOPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNOPROG, PPQRY_PCCDOCUMENTI, "A.ANNO_PROG", "PCCDOCANNPRO", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, "NUM. PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 160);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROPROG, PPQRY_PCCDOCUMENTI, "A.NUMERO_PROG", "PCCDOCNUMPRO", 1, 5, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_LIST, 0, 36, 296, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_LIST, 152);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_LIST, "Fornitore");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_FORM, 4, 292, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_FORM, 152);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_RAGISOCIESTE, MyGlb.PANEL_FORM, "Fornitore");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_RAGISOCIESTE, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_RAGISOCIESTE, PPQRY_PCCDOCUMENTI, "D.RAGIONE_SOCIALE_ESTESA", "PCDOBERASOES", 5, 60, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 296, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 4, 316, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMERODOC, -1, GRP_DOCUMENTI_DOCUMENTO);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMERODOC, PPQRY_PCCDOCUMENTI, "C.NUMERO_DOC", "PCCDOCFANUDO", 5, 20, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, 460, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, 112);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, " ");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, 4, 580, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, 112);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, " ");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_INFOFATTURA, -1, GRP_DOCUMENTI_DOCUMENTO);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_INFOFATTURA, PPQRY_DUAL, "'I'", "INFOFATTURA", 5, 1, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, 480, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, 4, 340, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DDATADOC, -1, GRP_DOCUMENTI_DOCUMENTO);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DDATADOC, PPQRY_PCCDOCUMENTI, "C.D_DATA_DOC", "PCCDOFADDADO", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, 556, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, "Tipo");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, 4, 364, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, "Tipo");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CODICEDOC, -1, GRP_DOCUMENTI_DOCUMENTO);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CODICEDOC, PPQRY_PCCDOCUMENTI, "C.CODICE_DOC", "PCCDOCFACODO", 1, 2, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_LIST, 724, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_LIST, " ");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_FORM, 4, 580, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATOLIQ, MyGlb.PANEL_FORM, " ");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_STATOLIQ, -1, GRP_DOCUMENTI_DOCUMENTO);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_STATOLIQ, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_STATOLIQ, PPQRY_PCCDOCUMENTI, "GET_STATO_FATTURA(C.ANNO_PROG,C.NUMERO_PROG,C.CODICE_DOC,'FAT')", "STATOLIQ", 5, 99, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_STATOLIQ, (new IDVariant("N")), "Nera", "Mandato Emesso", "vnera.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_STATOLIQ, (new IDVariant("R")), "Rossa", "Liquidata - in Emissione", "vrossa.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_STATOLIQ, (new IDVariant("G")), "Gialla", "Inserita in Distinta", "vgialla.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_STATOLIQ, (new IDVariant("V")), "Verde", "Liquidata", "vverde.gif", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, 748, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, 4, 388, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_IMPORTO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_IMPORTO, PPQRY_PCCDOCUMENTI, "C.IMPORTO", "PCCDOCFATIMP", 3, 14, 2, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, 876, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, 40);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, "Saldo");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, 4, 412, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, 40);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, "Saldo");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SALDO, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_SALDO, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SALDO, PPQRY_PCCDOCUMENTI, "C.IMPORTO + NVL(C.VARIAZIONI, 0) - NVL(C.IMPUTATO, 0)", "SALDO", 3, 28, 6, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, 1004, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, "Numero");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, 4, 436, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, "Numero");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROPROT, -1, GRP_DOCUMENTI_PROTOCINTERN);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROPROT, PPQRY_PCCDOCUMENTI, "C.NUMERO_PROT", "PCCDOCFANUPR", 1, 7, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, 1080, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, "Data");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, 4, 460, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, "Data");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DDATAPROT, -1, GRP_DOCUMENTI_PROTOCINTERN);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DDATAPROT, PPQRY_PCCDOCUMENTI, "C.D_DATA_PROT", "PCCDOFADDAPR", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_LIST, 1160, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_LIST, "Numero");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_FORM, 4, 484, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_FORM, 92);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMPROTGEN, MyGlb.PANEL_FORM, "Numero");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMPROTGEN, -1, GRP_DOCUMENTI_PROTOCGENERA);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMPROTGEN, PPQRY_PCCDOCUMENTI, "C.NUM_PROT_GEN", "PCDOFANUPRGE", 3, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_LIST, 1236, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_LIST, "Data");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_FORM, 4, 508, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAARRIVO, MyGlb.PANEL_FORM, "Data");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATAARRIVO, -1, GRP_DOCUMENTI_PROTOCGENERA);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATAARRIVO, PPQRY_PCCDOCUMENTI, "C.DATA_ARRIVO", "PCCDOCFADAAR", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, 1468, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_LIST, "STORNO");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, 4, 532, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STORNO, MyGlb.PANEL_FORM, "STORNO");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_STORNO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_STORNO, PPQRY_PCCDOCUMENTI, "C.STORNO", "PCCDOCFATSTO", 1, 1, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_LIST, 84, 300, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_LIST, 112);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_LIST, "Stato del Debito");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_FORM, 4, 532, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_FORM, 112);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_STATODELDEB1, MyGlb.PANEL_FORM, "Stato del Debito");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_STATODELDEB1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_STATODELDEB1, PPQRY_PCCDOCUMENTI, "B.STATO_DEL_DEBITO", "PCDOPCSTSTDD", 5, 12, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_LIST, 1316, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_LIST, 44);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_LIST, "Identificativo SDI");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_FORM, 4, 604, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_FORM, 44);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDSDI, MyGlb.PANEL_FORM, "Idn. S.");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_IDSDI, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_IDSDI, PPQRY_PCCDOCUMENTI, "G.ID_SDI", "PCDOFEDOIDSD", 3, 16, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_LIST, 328, 300, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_LIST, "Nome File");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_FORM, 4, 556, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NOMEFILE1, MyGlb.PANEL_FORM, "Nome File");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NOMEFILE1, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NOMEFILE1, PPQRY_PCCDOCUMENTI, "B.NOME_FILE", "PCDOPCSTNOFI", 5, 40, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.PANEL_LIST, 0, 300, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.PANEL_FORM, -4, 268, 80, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICULTISTEP, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ETICULTISTEP, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ETICULTISTEP, -1, "", "ETICULTISTEP", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.PANEL_LIST, 748, 300, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.PANEL_FORM, 752, 252, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ETICAPRIFILE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ETICAPRIFILE, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ETICAPRIFILE, -1, "", "ETICAPRIFILE", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_LIST, 1272, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_LIST, 108);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_LIST, "SE MODIFICA DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_FORM, 4, 580, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_FORM, 108);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEMODIFICDOC, MyGlb.PANEL_FORM, "SE MODIFICA DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SEMODIFICDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SEMODIFICDOC, PPQRY_PCCDOCUMENTI, "A.SE_MODIFICA_DOC", "PCCDOCSEMODO", 1, 1, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_LIST, 1272, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_LIST, 136);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_LIST, "UTENTE MODIFICA DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_FORM, 4, 580, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_FORM, 136);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UTENTMODIDOC, MyGlb.PANEL_FORM, "UTENTE MODIFICA DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_UTENTMODIDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_UTENTMODIDOC, PPQRY_PCCDOCUMENTI, "A.UTENTE_MODIFICA_DOC", "PCCDOCUTMODO", 5, 8, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_LIST, 1272, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_LIST, 128);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_LIST, "DATA MODIFICA DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_FORM, 4, 604, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_FORM, 128);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAMODIFDOC, MyGlb.PANEL_FORM, "DATA MODIFICA DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATAMODIFDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATAMODIFDOC, PPQRY_PCCDOCUMENTI, "A.DATA_MODIFICA_DOC", "PCCDOCDAMODO", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_LIST, "ID GDM FE");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_FORM, 4, 580, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDGDMFE, MyGlb.PANEL_FORM, "ID GDM FE");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_IDGDMFE, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_IDGDMFE, PPQRY_PCCDOCUMENTI, "C.ID_GDM_FE", "PCDOFAIDGDFE", 3, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_LIST, 1428, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_LIST, "Ultima Azione");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_FORM, 4, 628, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ULTIMAAZIONE, MyGlb.PANEL_FORM, "Ultima Azione");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ULTIMAAZIONE, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_ULTIMAAZIONE, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ULTIMAAZIONE, PPQRY_PCCDOCUMENTI, "CASE WHEN (B.AZIONE IS NULL) THEN '' ELSE B.AZIONE || ' - ' || PCC.GET_DESCRI_ULTIMA_AZIONE(B.AZIONE) END", "ULTIMAAZIONE", 5, 99, 0, -13997);
  }

  private void PAN_DOCUMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOFATTURA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~PCCDOCNUMPRO~~ IS NULL))) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T03CODICE, ");
    SQL.append("  A.DESCRIZIONE as T03DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T03 A ");
    SQL.append("where (A.CODICE = ~~PCCDOCFACODO~~) ");
    SQL.append("and   (A.STORNO = NVL(~~PCCDOCFATSTO~~, 0)) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_T03, 0, SQL, PFL_DOCUMENTI_CODICEDOC, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T03CODICE, ");
    SQL.append("  A.DESCRIZIONE as T03DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T03 A ");
    SQL.append("where (A.STORNO = NVL(~~PCCDOCFATSTO~~, 0)) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_T03, 1, SQL, PFL_DOCUMENTI_CODICEDOC, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_T03, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetIMDB(IMDB, "PQRY_PCCDOCUMENTI", true);
    PAN_DOCUMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "PCC DOCUMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO_REGISTRAZIONE as PCCDOCPROREG, ");
    SQL.append("  A.ANNO_PROG as PCCDOCANNPRO, ");
    SQL.append("  A.NUMERO_PROG as PCCDOCNUMPRO, ");
    SQL.append("  D.RAGIONE_SOCIALE_ESTESA as PCDOBERASOES, ");
    SQL.append("  C.NUMERO_DOC as PCCDOCFANUDO, ");
    SQL.append("  C.D_DATA_DOC as PCCDOFADDADO, ");
    SQL.append("  C.CODICE_DOC as PCCDOCFACODO, ");
    SQL.append("  C.IMPORTO as PCCDOCFATIMP, ");
    SQL.append("  C.IMPORTO + NVL(C.VARIAZIONI, 0) - NVL(C.IMPUTATO, 0) as SALDO, ");
    SQL.append("  C.NUMERO_PROT as PCCDOCFANUPR, ");
    SQL.append("  C.D_DATA_PROT as PCCDOFADDAPR, ");
    SQL.append("  C.NUM_PROT_GEN as PCDOFANUPRGE, ");
    SQL.append("  C.DATA_ARRIVO as PCCDOCFADAAR, ");
    SQL.append("  B.STATO_DEL_DEBITO as PCDOPCSTSTDD, ");
    SQL.append("  B.NOME_FILE as PCDOPCSTNOFI, ");
    SQL.append("  C.STORNO as PCCDOCFATSTO, ");
    SQL.append("  A.SE_MODIFICA_DOC as PCCDOCSEMODO, ");
    SQL.append("  A.UTENTE_MODIFICA_DOC as PCCDOCUTMODO, ");
    SQL.append("  A.DATA_MODIFICA_DOC as PCCDOCDAMODO, ");
    SQL.append("  B.DATA_ULTIMA_VARIAZIONE as PCDOPCSTDAUV, ");
    SQL.append("  C.ID_GDM_FE as PCDOFAIDGDFE, ");
    SQL.append("  G.ID_SDI as PCDOFEDOIDSD, ");
    SQL.append("  GET_STATO_FATTURA(C.ANNO_PROG,C.NUMERO_PROG,C.CODICE_DOC,'FAT') as STATOLIQ, ");
    SQL.append("  CASE WHEN (B.AZIONE IS NULL) THEN '' ELSE B.AZIONE || ' - ' || PCC.GET_DESCRI_ULTIMA_AZIONE(B.AZIONE) END as ULTIMAAZIONE ");
    PAN_DOCUMENTI.SetQuery(PPQRY_PCCDOCUMENTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PCC_DOCUMENTI A, ");
    SQL.append("  PCC_STEP B, ");
    SQL.append("  FAT C, ");
    SQL.append("  BEN D, ");
    SQL.append("  FE_DOCUMENTALE G ");
    PAN_DOCUMENTI.SetQuery(PPQRY_PCCDOCUMENTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (D.CODICE = C.CODICE) ");
    SQL.append("and   (G.ID_DOCUMENTO(+) = C.ID_FE_DOCUMENTALE) ");
    SQL.append("and   (A.ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   (B.PROGRESSIVO_REGISTRAZIONE = A.PROGRESSIVO_REGISTRAZIONE) ");
    SQL.append("and   (B.SEQUENZA = A.ULTIMO_STEP) ");
    SQL.append("and   (A.PROCESSO_CONCLUSO <> 'AN') ");
    SQL.append("and   ((A.PROGRESSIVO_REGISTRAZIONE LIKE 'RUF' || '%' OR A.PROGRESSIVO_REGISTRAZIONE LIKE 'NR2' || '%')) ");
    SQL.append("and   (A.PROGRESSIVO_REGISTRAZIONE LIKE ~~TBL_PARAMETRI601.PARTIPPROREG~~ || '%') ");
    SQL.append("and   ((NVL(~~PQRY_PARAMETRI600.PARAMAZIONE~~, 'AA') = 'TUTTE') OR (NVL(~~PQRY_PARAMETRI600.PARAMAZIONE~~, 'AA') <> 'TUTTE' AND SUBSTR(NVL(~~PQRY_PARAMETRI600.PARAMAZIONE~~, 'AA'), 1, 2) = SUBSTR(B.AZIONE, 1, 2))) ");
    SQL.append("and   (SUBSTR(B.AZIONE, 1, 2) <> '99') ");
    SQL.append("and   ((((SUBSTR(B.AZIONE, 1, 1) = '4' OR SUBSTR(B.AZIONE, 1, 1) = '5' OR SUBSTR(B.AZIONE, 1, 2) = '31') AND (~~PQRY_PARAMETRI600.PARINCDOCPAG~~ = 'S' OR (~~PQRY_PARAMETRI600.PARINCDOCPAG~~ = 'N' AND ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(E.IMPORTO), -1) ");
    SQL.append("from ");
    SQL.append("  LIQ E, ");
    SQL.append("  MAN F ");
    SQL.append("where (F.ANNO_MAND = E.ANNO_MAND) ");
    SQL.append("and   (F.NUMERO_MAND = E.NUMERO_MAND) ");
    SQL.append("and   (E.FAT_ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (E.FAT_NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (F.D_DATA_MAND <= TRUNC( SYSDATE )) ");
    SQL.append(") < C.IMPORTO + NVL(C.VARIAZIONI, 0)))) OR (SUBSTR(B.AZIONE, 1, 1) <> '4' AND SUBSTR(B.AZIONE, 1, 1) <> '5' AND SUBSTR(B.AZIONE, 1, 2) <> '31'))) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_PCCDOCUMENTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_PCCDOCUMENTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_PCCDOCUMENTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  D.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  C.D_DATA_DOC, ");
    SQL.append("  C.NUMERO_DOC ");
    PAN_DOCUMENTI.SetQuery(PPQRY_PCCDOCUMENTI, 5, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_PCCDOCUMENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(0, "PCC_DOCUMENTI");
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_RAGISOCIESTE, true);
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_DDATADOC, true);
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_NUMERODOC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMENTI.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMENTI.iUseListQBE;
      PAN_DOCUMENTI.iUseListQBE = 0;
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMENTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_STEP_Init()
  {

    PAN_STEP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STEP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STEP.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, "11443A9D-204A-426A-8EF9-6AF5084CF079");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, "PROGRESSIVO REGISTRAZIONE");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, "26ACEA91-D4A9-4D78-9780-CF536C90C723");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, "SEQUENZA");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, "Sequenza dello step nell'ambito del progr_registrazione");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, "33C234A1-F988-41BF-BD29-29E98872B01D");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, "Azione");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, "Azione prodotta dallo Step in ottica comunicazione a a PCC");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, "17985E21-A48C-47F4-8878-F5280E6C2871");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, "Del");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, "390AC8A5-EE7A-4FB0-9E6F-1021CC7DBBC2");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, "Stato del Debito");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, "Stato del debito Comunicato a PCC");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, "110203BB-5990-4058-BDC9-E202DB98BD9B");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, "Importo");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, "Eventuale importo di pagamento parziale");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, "0A89D6AB-8386-4533-B4BB-84FA50320EEB");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, "Nome File");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, "597A80D3-3DEE-49A1-9507-0C633722EF5C");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, "Annullato");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, "Se l'elaborazione del singolo step e' da considerare annullata SI / NO");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.VIS_CHECKSTYLE);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, "7D38F932-5568-43E7-9F2B-FD0B832A7AC2");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, "Note");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, "598C2645-2A3F-4A3C-B512-28695C29D57B");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, "Utente Ultima Variazione");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, "88B00D55-63C1-4FD3-95B8-254590CE4307");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, "UTENTI NOMINATIVO");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, "A01EE40A-4EFB-425A-8E63-8EF4643A881B");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, "Esito");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, "A22E2812-3E69-4557-9149-F6A1186CCC13");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, "DESCR ESITO");
    PAN_STEP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.VIS_NORMALFIELDS);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, "4354E479-4A4C-44D8-8292-0CBF064B8283");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, "B3AF82D0-CD94-4425-88CA-6D9C1B724BED");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, "AA1679DF-BB6C-49B9-8023-4A0AD1E05AC1");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, "Importo ");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, "D79FF121-2F4B-451A-A90C-092385243128");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, "08FD6F27-F6FA-4AB6-996C-CC89E66014EF");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, "AE41F33F-BC39-4AD3-8947-B262A4C4175F");
    PAN_STEP.set_Header(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, "");
    PAN_STEP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.VIS_IMAGEFIELD);
    PAN_STEP.SetImage(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0, "vgialla.gif", false);
    PAN_STEP.SetFlags(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_STEP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_LIST, 180);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_LIST, "PROGRESSIVO REGISTRAZIONE");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_FORM, 4, 4, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_PROGREREGIST, MyGlb.PANEL_FORM, "PROGR. REGISTR.");
    PAN_STEP.SetFieldPage(PFL_STEP_PROGREREGIST, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_PROGREREGIST, PPQRY_PCCSTEP1, "A.PROGRESSIVO_REGISTRAZIONE", "PCCSTEPROREG", 5, 12, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_LIST, 68);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_LIST, "SEQ.");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_SEQUENZA, MyGlb.PANEL_FORM, "SEQUENZA");
    PAN_STEP.SetFieldPage(PFL_STEP_SEQUENZA, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_SEQUENZA, PPQRY_PCCSTEP1, "A.SEQUENZA", "PCCSTEPSEQUE", 1, 3, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_LIST, 0, 92, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_LIST, 52);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_LIST, "Azione");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_AZIONE, MyGlb.PANEL_FORM, "Azione");
    PAN_STEP.SetFieldPage(PFL_STEP_AZIONE, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_AZIONE, PPQRY_PCCSTEP1, "A.AZIONE", "PCCSTEPAZION", 5, 4, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_LIST, 68, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_LIST, 160);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_LIST, "Del");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_FORM, 4, 196, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_DATAULTIVARI, MyGlb.PANEL_FORM, "Del");
    PAN_STEP.SetFieldPage(PFL_STEP_DATAULTIVARI, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_DATAULTIVARI, PPQRY_PCCSTEP1, "A.DATA_ULTIMA_VARIAZIONE", "PCCSTEDAULVA", 6, 10, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_LIST, 172, 92, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_LIST, 112);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_LIST, "Stato del Debito");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_STATODELDEBI, MyGlb.PANEL_FORM, "Stato del Debito");
    PAN_STEP.SetFieldPage(PFL_STEP_STATODELDEBI, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_STATODELDEBI, PPQRY_PCCSTEP1, "A.STATO_DEL_DEBITO", "PCCSTESTDEDE", 5, 12, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_LIST, 300, 92, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_LIST, 120);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_LIST, "Importo");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_IMPORTPARZIA, MyGlb.PANEL_FORM, "Importo");
    PAN_STEP.SetFieldPage(PFL_STEP_IMPORTPARZIA, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_IMPORTPARZIA, PPQRY_PCCSTEP1, "A.IMPORTO_PARZIALE", "PCCSTEIMPPAR", 3, 12, 2, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_LIST, 456, 92, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_LIST, 68);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_LIST, "Nome File");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_FORM, 4, 124, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_NOMEFILE, MyGlb.PANEL_FORM, "Nome File");
    PAN_STEP.SetFieldPage(PFL_STEP_NOMEFILE, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_NOMEFILE, PPQRY_PCCSTEP1, "A.NOME_FILE", "PCCSTENOMFIL", 5, 40, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_LIST, 832, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_LIST, 104);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_LIST, "Annullato");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_STEPANNULLAT, MyGlb.PANEL_FORM, "Annullato");
    PAN_STEP.SetFieldPage(PFL_STEP_STEPANNULLAT, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_STEPANNULLAT, PPQRY_PCCSTEP1, "A.STEP_ANNULLATO", "PCCSTEPANNUL", 5, 2, 0, -13997);
    PAN_STEP.SetValueListItem(PFL_STEP_STEPANNULLAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STEP.SetValueListItem(PFL_STEP_STEPANNULLAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_LIST, -8, 288, 904, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_FORM, 4, 172, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_STEP.SetFieldPage(PFL_STEP_NOTE, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_NOTE, PPQRY_PCCSTEP1, "A.NOTE", "PCCSTEPNOTE", 5, 200, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_LIST, -8, 336, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_LIST, 152);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_LIST, "Utente Ultima Variazione");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_FORM, 128);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_UTENULTIVARI, MyGlb.PANEL_FORM, "Uten. Ult. Variazione");
    PAN_STEP.SetFieldPage(PFL_STEP_UTENULTIVARI, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_UTENULTIVARI, PPQRY_PCCSTEP1, "A.UTENTE_ULTIMA_VARIAZIONE", "PCCSTEUTULVA", 5, 8, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_LIST, 224, 336, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_LIST, 124);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_LIST, "UTENTI NOMINATIVO");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_FORM, 132, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_FORM, 124);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_UTENTINOMINA, MyGlb.PANEL_FORM, "UTENTI NOMINATIVO");
    PAN_STEP.SetFieldPage(PFL_STEP_UTENTINOMINA, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_UTENTINOMINA, PPQRY_UTENTI, "A.NOMINATIVO", "UTENTINOMINA", 5, 40, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_LIST, -4, 364, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_LIST, 36);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_LIST, "Esito");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_FORM, 4, 268, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_FORM, 88);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_CODICEESITO, MyGlb.PANEL_FORM, "Esito");
    PAN_STEP.SetFieldPage(PFL_STEP_CODICEESITO, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_CODICEESITO, PPQRY_PCCSTEP1, "A.CODICE_ESITO", "PCCSTECODESI", 5, 10, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_LIST, 128, 364, 768, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_LIST, 80);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_LIST, "DESCR ESITO");
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_FORM, 88, 292, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_FORM, 80);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_FORM, 2);
    PAN_STEP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEP_DESCRESITO, MyGlb.PANEL_FORM, "DESCR ESITO");
    PAN_STEP.SetFieldPage(PFL_STEP_DESCRESITO, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_DESCRESITO, PPQRY_PCCSTEP1, "A.DESCR_ESITO", "PCCSTEDESESI", 5, 200, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.PANEL_LIST, 0, 4, 832, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.PANEL_LIST, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.PANEL_FORM, 0, 8, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.PANEL_FORM, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHESOGGET, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetFieldPage(PFL_STEP_ETICHESOGGET, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_ETICHESOGGET, -1, "", "ETICHESOGGET", 0, 0, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.PANEL_LIST, 0, 28, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.PANEL_FORM, 8, 16, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetFieldPage(PFL_STEP_ETICHEDOCUME, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.PANEL_LIST, 332, 28, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.PANEL_LIST, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.PANEL_FORM, 16, 24, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.PANEL_FORM, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICIMPOHEAD, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetFieldPage(PFL_STEP_ETICIMPOHEAD, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_ETICIMPOHEAD, -1, "", "ETICIMPOHEAD", 0, 0, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.PANEL_LIST, 396, 28, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.PANEL_FORM, 24, 32, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetFieldPage(PFL_STEP_ETICHEIMPORT, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_ETICHEIMPORT, -1, "", "ETICHEIMPORT", 0, 0, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.PANEL_LIST, 588, 28, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.PANEL_LIST, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.PANEL_FORM, 16, 24, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.PANEL_FORM, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETICHETSTATO, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetFieldPage(PFL_STEP_ETICHETSTATO, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_ETICHETSTATO, -1, "", "ETICHETSTATO", 0, 0, 0, -13997);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.PANEL_LIST, 568, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.PANEL_LIST, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.PANEL_LIST, 1);
    PAN_STEP.SetRect(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.PANEL_FORM, 568, 36, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.PANEL_FORM, 0);
    PAN_STEP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEP_ETIICOSTALIQ, MyGlb.PANEL_FORM, 1);
    PAN_STEP.SetFieldPage(PFL_STEP_ETIICOSTALIQ, -1, -1);
    PAN_STEP.SetFieldPanel(PFL_STEP_ETIICOSTALIQ, -1, "", "ETIICOSTALIQ", 0, 0, 0, -13997);
  }

  private void PAN_STEP_InitQueries()
  {
    StringBuffer SQL;

    PAN_STEP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NOMINATIVO as UTENTINOMINA ");
    SQL.append("from ");
    SQL.append("  AD4_UTENTI A ");
    SQL.append("where (A.UTENTE = ~~PCCSTEUTULVA~~) ");
    PAN_STEP.SetQuery(PPQRY_UTENTI, 0, SQL, -1, "");
    PAN_STEP.SetQueryDB(PPQRY_UTENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STEP.SetMasterTable(PPQRY_UTENTI, "AD4_UTENTI");
    PAN_STEP.SetIMDB(IMDB, "PQRY_PCCSTEP1", true);
    PAN_STEP.set_SetString(MyGlb.MASTER_ROWNAME, "PCC STEP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO_REGISTRAZIONE as PCCSTEPROREG, ");
    SQL.append("  A.SEQUENZA as PCCSTEPSEQUE, ");
    SQL.append("  A.AZIONE as PCCSTEPAZION, ");
    SQL.append("  A.STATO_DEL_DEBITO as PCCSTESTDEDE, ");
    SQL.append("  A.IMPORTO_PARZIALE as PCCSTEIMPPAR, ");
    SQL.append("  A.NOME_FILE as PCCSTENOMFIL, ");
    SQL.append("  A.STEP_ANNULLATO as PCCSTEPANNUL, ");
    SQL.append("  A.NOTE as PCCSTEPNOTE, ");
    SQL.append("  A.DATA_ULTIMA_VARIAZIONE as PCCSTEDAULVA, ");
    SQL.append("  A.UTENTE_ULTIMA_VARIAZIONE as PCCSTEUTULVA, ");
    SQL.append("  A.CODICE_ESITO as PCCSTECODESI, ");
    SQL.append("  A.DESCR_ESITO as PCCSTEDESESI ");
    PAN_STEP.SetQuery(PPQRY_PCCSTEP1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PCC_STEP A ");
    PAN_STEP.SetQuery(PPQRY_PCCSTEP1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO_REGISTRAZIONE = ~~PQRY_PCCDOCUMENTI.PCCDOCPROREG~~) ");
    PAN_STEP.SetQuery(PPQRY_PCCSTEP1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STEP.SetQuery(PPQRY_PCCSTEP1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STEP.SetQuery(PPQRY_PCCSTEP1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA desc ");
    PAN_STEP.SetQuery(PPQRY_PCCSTEP1, 5, SQL, -1, "");
    PAN_STEP.SetQueryDB(PPQRY_PCCSTEP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STEP.SetMasterTable(0, "PCC_STEP");
    PAN_STEP.AddToSortList(PFL_STEP_SEQUENZA, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STEP.Status() == 2)
    {
      int oldListQBE = PAN_STEP.iUseListQBE;
      PAN_STEP.iUseListQBE = 0;
      PAN_STEP.PanelCommand(Glb.PCM_SEARCH);
      PAN_STEP.PanelCommand(Glb.PCM_FIND);
      PAN_STEP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_STEP) PAN_STEP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateRow(Cancel);
    if (SrcObj == PAN_STEP) PAN_STEP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_DynamicProperties();
    if (SrcObj == PAN_STEP) PAN_STEP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_STEP) PAN_STEP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_BeforeFind(Cancel);
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
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_STEP) PAN_STEP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABBEDVIEW) TAB_TABBEDVIEW_Click(PreviousPage, Cancel);
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
