// **********************************************
// Eliminazione Var Esig
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EliminazioneVarEsig extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_VARIAZIONI = 0;

  private static int PFL_PARAM_VARIAZIONI = 0;
  private static int PFL_PARAM_NUOVCAMPSTA4 = 1;
  private static int PFL_PARAM_NUOVCAMPSTA5 = 2;
  private static int PFL_PARAM_PROPOSTA = 3;
  private static int PFL_PARAM_TRATTIPROPOS = 4;
  private static int PFL_PARAM_NUMPROPOSTA = 5;
  private static int PFL_PARAM_BARRAPROPOST = 6;
  private static int PFL_PARAM_ANNOPROPOSTA = 7;
  private static int PFL_PARAM_ETICSCELPROP = 8;
  private static int PFL_PARAM_ETICINFOPROP = 9;
  private static int PFL_PARAM_DELIBERA = 10;
  private static int PFL_PARAM_TRATTIDELIBE = 11;
  private static int PFL_PARAM_NUMDELIBERA = 12;
  private static int PFL_PARAM_BARRADELIBER = 13;
  private static int PFL_PARAM_ANNODELIBERA = 14;
  private static int PFL_PARAM_ETICSCELDELI = 15;
  private static int PFL_PARAM_ETICINFODELI = 16;
  private static int PFL_PARAM_CAPITOLO1 = 17;
  private static int PFL_PARAM_BARRACAPITOL = 18;
  private static int PFL_PARAM_ARTICOLO1 = 19;
  private static int PFL_PARAM_ETICSCELCAPI = 20;
  private static int PFL_PARAM_ETICINFOCAPI = 21;
  private static int PFL_PARAM_NUMEROIMPACC = 22;
  private static int PFL_PARAM_BARRAIMPEGNO = 23;
  private static int PFL_PARAM_ANNOIMPACC = 24;
  private static int PFL_PARAM_ETICINFOIMPE = 25;

  private static int PPQRY_PARAM120 = 0;


  IDPanel PAN_PARAM;
  OTabView TAB_VARIAZIONI;
  private static int GRP_IMPEGNI_IMPEGNO = 0;

  private static int PFL_IMPEGNI_CAPITOLO2 = 0;
  private static int PFL_IMPEGNI_ARTICOLO2 = 1;
  private static int PFL_IMPEGNI_CAPDESCRIZI1 = 2;
  private static int PFL_IMPEGNI_NUMEROIMP = 3;
  private static int PFL_IMPEGNI_ANNOIMP = 4;
  private static int PFL_IMPEGNI_IMPDESCRIZI1 = 5;
  private static int PFL_IMPEGNI_ANNOESIGIBI1 = 6;
  private static int PFL_IMPEGNI_IMPORTO1 = 7;
  private static int PFL_IMPEGNI_DESCRIZIONE1 = 8;
  private static int PFL_IMPEGNI_ETICHEELABO1 = 9;
  private static int PFL_IMPEGNI_PROGRESSIVO1 = 10;

  private static int PPQRY_VARIMP6 = 0;

  private static int PPQRY_CAP1 = 1;
  private static int PPQRY_IMP1 = 2;


  IDPanel PAN_IMPEGNI;
  private static int GRP_ACCERTAMENTI_ACCERTAMENTO = 0;

  private static int PFL_ACCERTAMENTI_CAPITOLO = 0;
  private static int PFL_ACCERTAMENTI_ARTICOLO = 1;
  private static int PFL_ACCERTAMENTI_CAPDESCRIZIO = 2;
  private static int PFL_ACCERTAMENTI_NUMEROACC = 3;
  private static int PFL_ACCERTAMENTI_ANNOACC = 4;
  private static int PFL_ACCERTAMENTI_IMPDESCRIZIO = 5;
  private static int PFL_ACCERTAMENTI_ANNOESIGIBIL = 6;
  private static int PFL_ACCERTAMENTI_IMPORTO = 7;
  private static int PFL_ACCERTAMENTI_DESCRIZIONE = 8;
  private static int PFL_ACCERTAMENTI_ETICHEELABOR = 9;
  private static int PFL_ACCERTAMENTI_PROGRESSIVO = 10;

  private static int PPQRY_VARACC3 = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_IMP = 2;


  IDPanel PAN_ACCERTAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM47(IMDB);
    //
    //
    Init_PQRY_PARAM120(IMDB);
    Init_PQRY_PARAM120_RS(IMDB);
    Init_PQRY_VARIMP6(IMDB);
    Init_PQRY_VARACC3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM47(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM47, 11);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM47, "TBL_PARAM47");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGNUMDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGNUIMAC, "NOMOGGNUIMAC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGANIMAC, "NOMOGGANIMAC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM47,IMDBDef4.FLD_PARAM47_NOMOGGANIMAC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM47, 0);
  }

  private static void Init_PQRY_PARAM120(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM120, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM120, "PQRY_PARAM120");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, "NOMOGGNUIMAC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, "NOMOGGANIMAC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120,IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAM120, 0);
  }

  private static void Init_PQRY_PARAM120_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM120_RS, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM120_RS, "PQRY_PARAM120_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, "NOMOGGNUIMAC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, "NOMOGGANIMAC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM120_RS,IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC,1,4,0);
  }

  private static void Init_PQRY_VARIMP6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARIMP6, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARIMP6, "PQRY_VARIMP6");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPPROGRE, "VARIMPPROGRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPCAPITO, "VARIMPCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPARTICO, "VARIMPARTICO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMNUMEIMP, "VARIMNUMEIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMANNOIMP, "VARIMANNOIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIANNOESIG, "VARIANNOESIG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPDESCRI, "VARIMPDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPIMPORT, "VARIMPIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP6,IMDBDef12.PQSL_VARIMP6_VARIMPIMPORT,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARIMP6, 0);
  }

  private static void Init_PQRY_VARACC3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARACC3, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARACC3, "PQRY_VARACC3");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCPROGRE, "VARACCPROGRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCCAPITO, "VARACCCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCARTICO, "VARACCARTICO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACNUMEACC, "VARACNUMEACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACANNOACC, "VARACANNOACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARAANNOESIG, "VARAANNOESIG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARAANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCDESCRI, "VARACCDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCIMPORT, "VARACCIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC3,IMDBDef12.PQSL_VARACC3_VARACCIMPORT,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARACC3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EliminazioneVarEsig(MyWebEntryPoint w, IMDBObj imdb)
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
  public EliminazioneVarEsig()
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
    FormIdx = MyGlb.FRM_ELIMIVARESIG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A4F9BBAC-C586-4732-8F9C-F3A52C2ECF16";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 892;
    DesignHeight = 518;
    set_Caption(new IDVariant("Eliminazione Var. Esig."));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 892;
    Frames[1].Height = 492;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.227642;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 892;
    Frames[2].Height = 112;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 112;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 112-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "439610F2-EC4B-47D9-90FD-253F0030C048");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 564, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 892;
    Frames[3].Height = 380;
    Frames[3].Caption = "Variazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    TAB_VARIAZIONI = new OTabView(this);
    Frames[3].Content = TAB_VARIAZIONI;
    TAB_VARIAZIONI.iGuid = "3BD68194-AFBE-4464-91E7-EE9B0DB241E0";
    TAB_VARIAZIONI.SetItemCount(2);
    TAB_VARIAZIONI.Placement = 1;
    TAB_VARIAZIONI.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Impegni";
    Frames[4].Parent = this;
    PAN_IMPEGNI = new IDPanel(w, this, 4, "PAN_IMPEGNI");
    Frames[4].Content = PAN_IMPEGNI;
    PAN_IMPEGNI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEGNI.VS = MainFrm.VisualStyleList;
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1E4AB7B0-C7A3-4015-8021-17720E7E8FD5");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 836, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEGNI.InitStatus = 2;
    PAN_IMPEGNI_Init();
    PAN_IMPEGNI_InitFields();
    PAN_IMPEGNI_InitQueries();
    TAB_VARIAZIONI.SetItem(1, Frames[4], 0, "", "Impegni", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Accertamenti";
    Frames[5].Parent = this;
    PAN_ACCERTAMENTI = new IDPanel(w, this, 5, "PAN_ACCERTAMENTI");
    Frames[5].Content = PAN_ACCERTAMENTI;
    PAN_ACCERTAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCERTAMENTI.VS = MainFrm.VisualStyleList;
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6C0FDF59-7C13-41A2-B955-71467F07F240");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 836, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCERTAMENTI.InitStatus = 2;
    PAN_ACCERTAMENTI_Init();
    PAN_ACCERTAMENTI_InitFields();
    PAN_ACCERTAMENTI_InitQueries();
    TAB_VARIAZIONI.SetItem(2, Frames[5], 0, "", "Accertamenti", "");
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM47, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELIMIVARESIG_PARAM120();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_IMPEGNI.UpdatePanel(MainFrm);
      PAN_ACCERTAMENTI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_ETICSCELPROP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_ETICSCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_ETICSCELCAPI) {
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
    return (obj instanceof EliminazioneVarEsig);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EliminazioneVarEsig.class.getName() : (Glb.ClassWithPackage(EliminazioneVarEsig.class) ? EliminazioneVarEsig.class.getName().substring(EliminazioneVarEsig.class.getPackage().getName().length() + 1) : EliminazioneVarEsig.class.getName()));
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
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_IMPEGNI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_IMPEGNI.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_IMPEGNI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ACCERTAMENTI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ACCERTAMENTI.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ACCERTAMENTI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Load", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEVARI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUIMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANIMAC, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Variazioni Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_VARIAZIONI_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex)), true))
      {
        IDVariant v_IMPEGNI = new IDVariant(0,IDVariant.STRING);
        v_IMPEGNI = (new IDVariant("Impegni"));
        PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_NUMEROIMPACC, new IDVariant(v_IMPEGNI).stringValue());
      }
      else
      {
        IDVariant v_ACCERTAMENTI = new IDVariant(0,IDVariant.STRING);
        v_ACCERTAMENTI = (new IDVariant("Accertamenti"));
        PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_NUMEROIMPACC, new IDVariant(v_ACCERTAMENTI).stringValue());
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGECAPI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEARTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUIMAC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANIMAC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "VariazioniChangePage", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, 0).equals((new IDVariant("P")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0))))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAM_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAM_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAM_NUMDELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAM_ANNODELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0))))
        {
          IDVariant v_SEDEDELIBERA = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODELIBE = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODELIBERA = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDELIBERA = IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0);
          v_NUMERODELIBE = IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0);
          v_ANNODELIBERA = IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDELIBERA, v_ANNODELIBERA, v_NUMERODELIBE, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMSEDDEL, 0, new IDVariant(v_SEDEDELIBERA));
          IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODELIBE));
          IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNDEL, 0, new IDVariant(v_ANNODELIBERA));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAM_CAPITOLO1)), true) || Column.equals((new IDVariant(PFL_PARAM_ARTICOLO1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0))))
        {
          if (!(MainFrm.CapitoloPresente(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex))))?(new IDVariant("S")):(new IDVariant("E"))), IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0), IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0))))
          {
            IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAM_NUMEROIMPACC)), true) || Column.equals((new IDVariant(PFL_PARAM_ANNOIMPACC)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0))))
        {
          if (new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex)), true))
          {
            if (MainFrm.ImpPresente(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0), IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0)).equals((new IDVariant(-1)), true))
            {
              IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0, (new IDVariant()));
            }
          }
          else
          {
            if (MainFrm.AccPresente(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0), IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0)).equals((new IDVariant(-1)), true))
            {
              IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0, (new IDVariant()));
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta scelta delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettasceltadelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta scelta delibera Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Etichettasceltadelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta info delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettainfodelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta info delibera Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEDELI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Etichettainfodelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta scelta proposta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettasceltaproposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta scelta proposta Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Etichettasceltaproposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta info proposta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettainfoproposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta info proposta Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUMPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANNPRO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Etichettainfoproposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Capitolo
  // **********************************************************************
  public int ApriCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("E")));
      }
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "ApriCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
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
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0))))
      {
        if (new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex)), true))
        {
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        }
        else
        {
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        }
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGECAPI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEARTI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Imp Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Imp Acc Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0)))
      {
        return 0;
      }
      if (new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex)), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0));
        if (IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        }
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGNUIMAC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMOGGANIMAC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "InfoImpAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettaelabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C5;
    IDCachedRowSet C9;

    try
    {
      TransCount = 0;
      // 
      // Etichetta elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare il tipo di variazione"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        IDVariant v_ERRORE = null;
        v_ERRORE = (new IDVariant());
        IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
        if (new IDVariant(TAB_VARIAZIONI.SelectedPageIndex()).equals((new IDVariant(PAN_IMPEGNI.FrIndex)), true))
        {
          C5 = PAN_IMPEGNI.MasterRS();
          if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
          if (!C5.Bof()) PAN_IMPEGNI.GotoFirst();
          while (!PAN_IMPEGNI.RSEOF())
          {
            if (PAN_IMPEGNI.IsRowSelected(I.intValue()))
            {
              v_SELEZIONATO = (new IDVariant(-1));
              MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
              MainFrm.Cf4armDBObject.ELIMINAVARESIG(C5.Get("VARIMPPROGRE"), IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, 0), (new IDVariant("S")));
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                v_ERRORE = IDL.Add(IDL.Add(v_ERRORE, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
              }
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_IMPEGNI.GotoNext();
          }
          if (CurPos>0) C5.absolute(CurPos);
        }
        else
        {
          C9 = PAN_ACCERTAMENTI.MasterRS();
          if (C9.size()>0) CurPos = C9.getRow(); else CurPos = 0;
          if (!C9.Bof()) PAN_ACCERTAMENTI.GotoFirst();
          while (!PAN_ACCERTAMENTI.RSEOF())
          {
            if (PAN_ACCERTAMENTI.IsRowSelected(I.intValue()))
            {
              v_SELEZIONATO = (new IDVariant(-1));
              MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
              MainFrm.Cf4armDBObject.ELIMINAVARESIG(C9.Get("VARACCPROGRE"), IMDB.Value(IMDBDef12.PQRY_PARAM120, IMDBDef12.PQSL_PARAM120_NOMEOGGEVARI, 0), (new IDVariant("E")));
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                v_ERRORE = IDL.Add(IDL.Add(v_ERRORE, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
              }
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_ACCERTAMENTI.GotoNext();
          }
          if (CurPos>0) C9.absolute(CurPos);
        }
        if (!(IDL.IsNull(v_ERRORE)))
        {
          MainFrm.set_AlertMessage(v_ERRORE); 
        }
        else
        {
          if (!(v_SELEZIONATO.booleanValue()))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Nessuna riga selezionata."));
            MainFrm.set_AlertMessage(v_AVVISO); 
          }
          else
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Elaborazione Eseguita"));
            MainFrm.set_AlertMessage(v_AVVISO); 
          }
        }
        PAN_IMPEGNI.PanelCommand(Glb.PCM_REQUERY);
        PAN_ACCERTAMENTI.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVarEsig", "Etichettaelabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELIMIVARESIG_PARAM120() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAM120_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM47, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM47, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAM120_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAM120_RS, 0, IMDBDef4.TBL_PARAM47, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 0, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEVARI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 1, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEPROP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 2, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 3, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 4, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEDELI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 5, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 6, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 7, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 8, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 9, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGNUIMAC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM120_RS, 10, 0, IMDBDef4.TBL_PARAM47, IMDBDef4.FLD_PARAM47_NOMOGGANIMAC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM47, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM47, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM47, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAM120_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICSCELPROP)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettasceltaproposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICINFOPROP)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettainfoproposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICSCELDELI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettasceltadelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICINFODELI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettainfodelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICSCELCAPI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICINFOCAPI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICINFOIMPE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpAcc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_VARIAZIONI_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_VARIAZIONI_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IMPEGNI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPEGNI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEGNI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEGNI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEGNI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPEGNI);
    // Stub
  }

  private void PAN_IMPEGNI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPEGNI_ETICHEELABO1)
    {
      this.IdxPanelActived = this.PAN_IMPEGNI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettaelabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPEGNI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEGNI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPEGNI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ACCERTAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCERTAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCERTAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCERTAMENTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCERTAMENTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ACCERTAMENTI);
    // Stub
  }

  private void PAN_ACCERTAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ACCERTAMENTI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettaelabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ACCERTAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCERTAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCERTAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "799E5A24-E265-42F5-BA62-A6ADF38AB761");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "Variazioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 12, 11, 864, 49, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0, 55);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, "52DF1912-A732-4D02-8F4F-79A1B55D5299");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, "Variazioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, "437FEDB6-BDDB-4C97-9135-008EA4CB44CC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, "EF06E8DF-3261-4CF0-894D-1986ADE5317A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "14A42973-617F-4072-88B2-FDFD089D15EA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, "D6354493-0D51-4EE0-961E-C90CCD241FF8");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, "8DC33D4B-1F88-4F47-BE92-EAE30E4F572C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, "Num Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, "2F79AA59-C916-4EF0-9CB2-EE19C53B0BC6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, "191B027D-9155-4973-A50D-FDA90D9973DD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, "E91D7338-416D-4280-82CC-D193FA6AF21A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, 0, "wsearch.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, "131B7DC5-D0BD-4AA1-B613-492590441653");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "C96220CB-C3EC-490E-B06E-54C9F0CFD3DF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, "38320FAE-CBDC-422F-8773-8430FA0D40F1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, "BE7408F5-C88E-4030-BD9D-6C831AC86F38");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, "Num Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, "58A460B3-A289-4C77-AC95-E350978B7F20");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, "51D5F541-4E65-4378-9578-6F73D0F6214F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, "Anno Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, "DC421D08-88DC-4E60-B4DD-400A186D6F6C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, 0, "wsearch.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, "4381501B-6BA8-4010-B524-64F9FB11AB21");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, "D99053EE-1CAE-49B5-A8D7-7CFEAED412A0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, "Capitolo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, "562E0C3D-83F3-432E-A9F5-B1A73D5CB631");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, "16D66036-6288-43D7-B4F7-7801CDF13FE9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, "Articolo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, "068DA601-0088-40B8-86DF-C50D087C9027");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, 0, "wsearch.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, "1C86833A-9240-4F0A-9082-587817E3FDE2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, "DD28CC6F-C329-4E9B-82B6-DD4751967F8F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, "Impegno");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, "0FFFABEB-8103-406B-9D2E-2CA6ED754893");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, "00AAA392-589E-4891-8EB8-05421C9F8932");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, "Anno Imp Acc");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, "42356491-CD3C-4D9A-A65F-49517837A18A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 44, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAM.SetFieldPage(PFL_PARAM_VARIAZIONI, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_VARIAZIONI, PPQRY_PARAM120, "A.NOMEOGGEVARI", "NOMEOGGEVARI", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_LIST, 164, 76, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_FORM, 16, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA4, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA4, -1, "", "NUOVCAMPSTA4", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_LIST, 172, 84, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_FORM, 204, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA5, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA5, -1, "", "NUOVCAMPSTA5", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 4, 164, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 228, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROPOSTA, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROPOSTA, PPQRY_PARAM120, "A.NOMEOGGEPROP", "NOMEOGGEPROP", 5, 255, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_LIST, 156, 68, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_FORM, 404, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TRATTIPROPOS, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, "N. Prp.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, 424, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, "Num Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMPROPOSTA, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMPROPOSTA, PPQRY_PARAM120, "A.NOMOGGNUMPRO", "NOMOGGNUMPRO", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_LIST, 164, 76, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_FORM, 496, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRAPROPOST, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Prp.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, 516, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOPROPOSTA, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOPROPOSTA, PPQRY_PARAM120, "A.NOMOGGANNPRO", "NOMOGGANNPRO", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_LIST, 296, 96, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_FORM, 552, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICSCELPROP, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICSCELPROP, -1, "", "ETICSCELPROP", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_LIST, 304, 104, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_FORM, 572, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICINFOPROP, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICINFOPROP, -1, "", "ETICINFOPROP", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 4, 188, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 596, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DELIBERA, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DELIBERA, PPQRY_PARAM120, "A.NOMEOGGEDELI", "NOMEOGGEDELI", 5, 255, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_LIST, 164, 76, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_FORM, 708, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TRATTIDELIBE, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, "N. Del.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, 728, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, "Num Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMDELIBERA, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMDELIBERA, PPQRY_PARAM120, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_LIST, 172, 84, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_FORM, 780, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRADELIBER, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, "An. Del.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, 800, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNODELIBERA, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNODELIBERA, PPQRY_PARAM120, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_LIST, 288, 88, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_FORM, 836, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICSCELDELI, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICSCELDELI, -1, "", "ETICSCELDELI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_LIST, 296, 96, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_FORM, 856, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICINFODELI, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICINFODELI, -1, "", "ETICINFODELI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_FORM, 16, 72, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAPITOLO1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAPITOLO1, PPQRY_PARAM120, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.PANEL_LIST, 172, 84, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.PANEL_FORM, 216, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRACAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRACAPITOL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRACAPITOL, -1, "", "BARRACAPITOL", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_FORM, 236, 72, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ARTICOLO1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ARTICOLO1, PPQRY_PARAM120, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.PANEL_LIST, 304, 104, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.PANEL_FORM, 264, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELCAPI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICSCELCAPI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICSCELCAPI, -1, "", "ETICSCELCAPI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.PANEL_LIST, 312, 112, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.PANEL_FORM, 284, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOCAPI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICINFOCAPI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICINFOCAPI, -1, "", "ETICINFOCAPI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_LIST, "Impegno");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_FORM, 316, 72, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_FORM, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROIMPACC, MyGlb.PANEL_FORM, "Impegno");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMEROIMPACC, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMEROIMPACC, PPQRY_PARAM120, "A.NOMOGGNUIMAC", "NOMOGGNUIMAC", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.PANEL_LIST, 180, 92, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.PANEL_FORM, 476, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRAIMPEGNO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRAIMPEGNO, -1, "", "BARRAIMPEGNO", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_LIST, "Anno Imp Acc");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_FORM, 496, 72, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPACC, MyGlb.PANEL_FORM, "An. I. Ac.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOIMPACC, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOIMPACC, PPQRY_PARAM120, "A.NOMOGGANIMAC", "NOMOGGANIMAC", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.PANEL_LIST, 312, 112, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.PANEL_FORM, 540, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICINFOIMPE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICINFOIMPE, -1, "", "ETICINFOIMPE", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM120", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM120, IMDBDef12.PQRY_PARAM120_RS, IMDBDef4.TBL_PARAM47);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_VARIAZIONI, IMDBDef4.FLD_PARAM47_NOMEOGGEVARI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROPOSTA, IMDBDef4.FLD_PARAM47_NOMEOGGEPROP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMPROPOSTA, IMDBDef4.FLD_PARAM47_NOMOGGNUMPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOPROPOSTA, IMDBDef4.FLD_PARAM47_NOMOGGANNPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DELIBERA, IMDBDef4.FLD_PARAM47_NOMEOGGEDELI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMDELIBERA, IMDBDef4.FLD_PARAM47_NOMOGGNUMDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNODELIBERA, IMDBDef4.FLD_PARAM47_NOMOGGANNDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAPITOLO1, IMDBDef4.FLD_PARAM47_NOMEOGGECAPI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ARTICOLO1, IMDBDef4.FLD_PARAM47_NOMEOGGEARTI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMEROIMPACC, IMDBDef4.FLD_PARAM47_NOMOGGNUIMAC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOIMPACC, IMDBDef4.FLD_PARAM47_NOMOGGANIMAC);
    PAN_PARAM.SetMasterTable(0, "PARAM47");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IMPEGNI_Init()
  {

    PAN_IMPEGNI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEGNI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, "B808B7CF-4052-4C09-B8F4-4E1A38CB3314");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, "Impegno");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, MyGlb.PANEL_LIST, 348, -9999, 308, 16, 0, 0);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, MyGlb.PANEL_FORM, 0, 3, 488, 361, 0, 0);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, 0, 51);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, 1, 13);
    PAN_IMPEGNI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, 0, 4);
    PAN_IMPEGNI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, 1, 4);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPEGNI_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPEGNI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, "B5600AFC-6C9E-4DD5-AE01-D9B6BC559A2B");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, "Capitolo/Art.");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.VIS_NOFIINLUHELE);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, "31AD7398-4B70-4F81-8C85-9B3E512B8793");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, " ");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.VIS_NOFINOBOVEHE);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, "62B172B1-470D-4480-97C5-3B2B8AEF58A5");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, "Descrizione");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, "50A72DC1-5C82-4DD8-BC27-E67D20ED9AF7");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, "Numero");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, "596B00C4-1136-4837-BA91-2031667144AD");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, "Anno");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, "2DC22C0B-8F9D-4218-9A93-90791EFF6513");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, "Descrizione");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, "01A883C0-B29E-47FE-A1AB-891159430D83");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, "Anno Esigibilità");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, "1C8763CC-C09B-468B-BDB8-42044B2D9DD0");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, "Importo");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, "A9748D74-4E4D-4564-A7E2-C5245709ADDC");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, "DESCRIZIONE");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, "");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, 0, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, "7E8D78AF-3DA1-4E66-A3B8-406F7ECF4A4C");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, "Elabora");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.VIS_STATICBUTTON);
    PAN_IMPEGNI.SetImage(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, 0, "button1.gif", false);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMPEGNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, "8AF31151-CD80-43BE-B269-7D2F13FFFED3");
    PAN_IMPEGNI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, "PROGRESSIVO");
    PAN_IMPEGNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, "Brief description of field content.");
    PAN_IMPEGNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_IMPEGNI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_IMPEGNI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_LIST, 64);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_FORM, 332, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_FORM, 80);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPITOLO2, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_CAPITOLO2, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_CAPITOLO2, PPQRY_VARIMP6, "A.CAPITOLO", "VARIMPCAPITO", 3, 16, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_LIST, 128, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_LIST, 68);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_LIST, " ");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_FORM, 136);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ARTICOLO2, MyGlb.PANEL_FORM, " ");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_ARTICOLO2, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_ARTICOLO2, PPQRY_VARIMP6, "A.ARTICOLO", "VARIMPARTICO", 1, 2, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 160, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 4, 292, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_CAPDESCRIZI1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_CAPDESCRIZI1, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_CAPDESCRIZI1, PPQRY_CAP1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_LIST, 348, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_FORM, 332, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_FORM, 96);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_NUMEROIMP, -1, GRP_IMPEGNI_IMPEGNO);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_NUMEROIMP, PPQRY_VARIMP6, "A.NUMERO_IMP", "VARIMNUMEIMP", 1, 5, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_FORM, 196, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_FORM, 80);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_ANNOIMP, -1, GRP_IMPEGNI_IMPEGNO);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_ANNOIMP, PPQRY_VARIMP6, "A.ANNO_IMP", "VARIMANNOIMP", 1, 4, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_LIST, 448, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_FORM, 4, 328, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPDESCRIZI1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_IMPDESCRIZI1, -1, GRP_IMPEGNI_IMPEGNO);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_IMPDESCRIZI1, PPQRY_IMP1, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_LIST, 656, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_FORM, 136);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ANNOESIGIBI1, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_ANNOESIGIBI1, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_ANNOESIGIBI1, PPQRY_VARIMP6, "A.ANNO_ESIGIBILITA", "VARIANNOESIG", 1, 4, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_LIST, 720, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_FORM, 372, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_FORM, 80);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_IMPORTO1, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_IMPORTO1, PPQRY_VARIMP6, "A.IMPORTO", "VARIMPIMPORT", 3, 14, 2, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_LIST, 360, 36, 112, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 100, 344, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_FORM, 136);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_DESCRIZIONE1, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_DESCRIZIONE1, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_DESCRIZIONE1, PPQRY_VARIMP6, "A.DESCRIZIONE", "VARIMPDESCRI", 5, 140, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.PANEL_LIST, 756, 260, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.PANEL_FORM, 400, 600, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_ETICHEELABO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_ETICHEELABO1, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_ETICHEELABO1, -1, "", "ETICHEELABO1", 0, 0, 0, -13997);
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROG.");
    PAN_IMPEGNI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 196, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_FORM, 136);
    PAN_IMPEGNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNI_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_IMPEGNI.SetFieldPage(PFL_IMPEGNI_PROGRESSIVO1, -1, -1);
    PAN_IMPEGNI.SetFieldPanel(PFL_IMPEGNI_PROGRESSIVO1, PPQRY_VARIMP6, "A.PROGRESSIVO", "VARIMPPROGRE", 3, 10, 0, -13997);
  }

  private void PAN_IMPEGNI_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEGNI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = ~~VARIMPARTICO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~VARIMPCAPITO~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_IMPEGNI.SetQuery(PPQRY_CAP1, 0, SQL, -1, "");
    PAN_IMPEGNI.SetQueryDB(PPQRY_CAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNI.SetMasterTable(PPQRY_CAP1, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~VARIMANNOIMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~VARIMNUMEIMP~~) ");
    PAN_IMPEGNI.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_IMPEGNI.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNI.SetMasterTable(PPQRY_IMP1, "IMP");
    PAN_IMPEGNI.SetIMDB(IMDB, "PQRY_VARIMP6", true);
    PAN_IMPEGNI.set_SetString(MyGlb.MASTER_ROWNAME, "VARIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as VARIMPPROGRE, ");
    SQL.append("  A.CAPITOLO as VARIMPCAPITO, ");
    SQL.append("  A.ARTICOLO as VARIMPARTICO, ");
    SQL.append("  A.NUMERO_IMP as VARIMNUMEIMP, ");
    SQL.append("  A.ANNO_IMP as VARIMANNOIMP, ");
    SQL.append("  A.ANNO_ESIGIBILITA as VARIANNOESIG, ");
    SQL.append("  A.DESCRIZIONE as VARIMPDESCRI, ");
    SQL.append("  A.IMPORTO as VARIMPIMPORT ");
    PAN_IMPEGNI.SetQuery(PPQRY_VARIMP6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIMP A ");
    PAN_IMPEGNI.SetQuery(PPQRY_VARIMP6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CAPITOLO = NVL(~~PQRY_PARAM120.NOMEOGGECAPI~~, A.CAPITOLO)) ");
    SQL.append("and   (A.ARTICOLO = NVL(~~PQRY_PARAM120.NOMEOGGEARTI~~, A.ARTICOLO)) ");
    SQL.append("and   (A.ANNO_IMP = NVL(~~PQRY_PARAM120.NOMOGGANIMAC~~, A.ANNO_IMP)) ");
    SQL.append("and   (A.NUMERO_IMP = NVL(~~PQRY_PARAM120.NOMOGGNUIMAC~~, A.NUMERO_IMP)) ");
    SQL.append("and   (A.ANNO_VAR <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((~~PQRY_PARAM120.NOMEOGGEVARI~~ = 'D' AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.PROGRESSIVO ");
    SQL.append("from ");
    SQL.append("  VARCOM B ");
    SQL.append("where (B.PROGRESSIVO_VARIMP = A.PROGRESSIVO) ");
    SQL.append("and   (NVL(B.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGANNPRO~~, NVL(B.ANNO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(B.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGNUMPRO~~, NVL(B.NUMERO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(B.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAM120.NOMEOGGEPROP~~, NVL(B.UNITA_PROPONENTE, '-1'))) ");
    SQL.append("and   (NVL(B.ANNO_DEL, -1) = NVL(~~PQRY_PARAM120.NOMOGGANNDEL~~, NVL(B.ANNO_DEL, -1))) ");
    SQL.append("and   (NVL(B.NUMERO_DEL, -1) = NVL(~~PQRY_PARAM120.NOMOGGNUMDEL~~, NVL(B.NUMERO_DEL, -1))) ");
    SQL.append("and   (NVL(B.SEDE_DEL, '-1') = NVL(~~PQRY_PARAM120.NOMEOGGEDELI~~, NVL(B.SEDE_DEL, '-1'))) ");
    SQL.append("))) OR (~~PQRY_PARAM120.NOMEOGGEVARI~~ = 'P' AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.PROGRESSIVO ");
    SQL.append("from ");
    SQL.append("  VARCOMPRO C ");
    SQL.append("where (C.PROGRESSIVO_VARIMP = A.PROGRESSIVO) ");
    SQL.append("and   (NVL(C.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGANNPRO~~, NVL(C.ANNO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(C.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGNUMPRO~~, NVL(C.NUMERO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(C.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAM120.NOMEOGGEPROP~~, NVL(C.UNITA_PROPONENTE, '-1'))) ");
    SQL.append("))))) ");
    SQL.append("and   (A.VARIAZIONE_GENERATA = 'SI') ");
    SQL.append("and   ((A.IMP_GENERATO IS NULL)) ");
    PAN_IMPEGNI.SetQuery(PPQRY_VARIMP6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNI.SetQuery(PPQRY_VARIMP6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNI.SetQuery(PPQRY_VARIMP6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP ");
    PAN_IMPEGNI.SetQuery(PPQRY_VARIMP6, 5, SQL, -1, "");
    PAN_IMPEGNI.SetQueryDB(PPQRY_VARIMP6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNI.SetMasterTable(0, "VARIMP");
    PAN_IMPEGNI.AddToSortList(PFL_IMPEGNI_CAPITOLO2, true);
    PAN_IMPEGNI.AddToSortList(PFL_IMPEGNI_ARTICOLO2, true);
    PAN_IMPEGNI.AddToSortList(PFL_IMPEGNI_ANNOIMP, true);
    PAN_IMPEGNI.AddToSortList(PFL_IMPEGNI_NUMEROIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEGNI.Status() == 2)
    {
      int oldListQBE = PAN_IMPEGNI.iUseListQBE;
      PAN_IMPEGNI.iUseListQBE = 0;
      PAN_IMPEGNI.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEGNI.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEGNI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ACCERTAMENTI_Init()
  {

    PAN_ACCERTAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCERTAMENTI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, "27213302-6930-4E9E-ACFB-C6D4249BC636");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, "Accertamento");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, MyGlb.PANEL_LIST, 348, -9999, 308, 16, 0, 0);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 3, 488, 361, 0, 0);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, 0, 81);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, 1, 13);
    PAN_ACCERTAMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, 0, 4);
    PAN_ACCERTAMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, 1, 4);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCERTAMENTI_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCERTAMENTI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, "A57FB64C-A1B8-4F2C-8E4B-B8D427D7445C");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, "Capitolo/Art.");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, "FB6D9BD6-ECC7-4548-B5B9-57FEFEF68314");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, " ");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, "659300AB-26EE-4FA6-974C-80B79036A28D");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, "Descrizione");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, "F4CBD40A-E72E-43BD-B5C5-840071858F6B");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, "Numero");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, "F181D509-8576-4DFC-9F0B-7DBB912F8F97");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, "Anno");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, "77E0E9AC-FD63-402F-B94C-FCA6047299DF");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, "Descrizione");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, "0F0550D8-8F09-4CFC-9342-AC5E47A6631F");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, "20D1EB0A-E170-41EE-91B2-79C547CDD4D8");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, "Importo");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, "975F2FBF-4A35-4619-898F-DAACD65F268F");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, "DESCRIZIONE");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, "");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, 0, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, "679B1EA6-C233-4CB7-ADC2-BF4A4FEDF7F7");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, "Elabora");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERTAMENTI.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, "336B4AD5-8340-424A-961C-79D29833DB71");
    PAN_ACCERTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, "PROGRESSIVO");
    PAN_ACCERTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, "Brief description of field content.");
    PAN_ACCERTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ACCERTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_ACCERTAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 332, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_CAPITOLO, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_CAPITOLO, PPQRY_VARACC3, "C.CAPITOLO", "VARACCCAPITO", 3, 16, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_LIST, 128, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_FORM, 136);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_ARTICOLO, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_ARTICOLO, PPQRY_VARACC3, "C.ARTICOLO", "VARACCARTICO", 1, 2, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 160, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 292, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_CAPDESCRIZIO, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_LIST, 348, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_FORM, 332, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_FORM, 96);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_NUMEROACC, -1, GRP_ACCERTAMENTI_ACCERTAMENTO);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_NUMEROACC, PPQRY_VARACC3, "C.NUMERO_ACC", "VARACNUMEACC", 1, 5, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_FORM, 196, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_ANNOACC, -1, GRP_ACCERTAMENTI_ACCERTAMENTO);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_ANNOACC, PPQRY_VARACC3, "C.ANNO_ACC", "VARACANNOACC", 1, 4, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 448, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 4, 328, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_IMPDESCRIZIO, -1, GRP_ACCERTAMENTI_ACCERTAMENTO);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_IMPDESCRIZIO, PPQRY_IMP, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 656, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 136);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_ANNOESIGIBIL, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_ANNOESIGIBIL, PPQRY_VARACC3, "C.ANNO_ESIGIBILITA", "VARAANNOESIG", 1, 4, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_LIST, 720, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_FORM, 372, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_FORM, 80);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_IMPORTO, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_IMPORTO, PPQRY_VARACC3, "C.IMPORTO", "VARACCIMPORT", 3, 14, 2, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 360, 36, 112, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 344, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 136);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_DESCRIZIONE, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_DESCRIZIONE, PPQRY_VARACC3, "C.DESCRIZIONE", "VARACCDESCRI", 5, 140, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.PANEL_LIST, 756, 252, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.PANEL_FORM, 400, 600, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_ETICHEELABOR, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_ACCERTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 196, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 136);
    PAN_ACCERTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_ACCERTAMENTI.SetFieldPage(PFL_ACCERTAMENTI_PROGRESSIVO, -1, -1);
    PAN_ACCERTAMENTI.SetFieldPanel(PFL_ACCERTAMENTI_PROGRESSIVO, PPQRY_VARACC3, "C.PROGRESSIVO", "VARACCPROGRE", 3, 10, 0, -13997);
  }

  private void PAN_ACCERTAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCERTAMENTI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = ~~VARACCARTICO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~VARACCCAPITO~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ACCERTAMENTI.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_ACCERTAMENTI.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTI.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~VARACANNOACC~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~VARACNUMEACC~~) ");
    PAN_ACCERTAMENTI.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_ACCERTAMENTI.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTI.SetMasterTable(PPQRY_IMP, "IMP");
    PAN_ACCERTAMENTI.SetIMDB(IMDB, "PQRY_VARACC3", true);
    PAN_ACCERTAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "VARACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.PROGRESSIVO as VARACCPROGRE, ");
    SQL.append("  C.CAPITOLO as VARACCCAPITO, ");
    SQL.append("  C.ARTICOLO as VARACCARTICO, ");
    SQL.append("  C.NUMERO_ACC as VARACNUMEACC, ");
    SQL.append("  C.ANNO_ACC as VARACANNOACC, ");
    SQL.append("  C.ANNO_ESIGIBILITA as VARAANNOESIG, ");
    SQL.append("  C.DESCRIZIONE as VARACCDESCRI, ");
    SQL.append("  C.IMPORTO as VARACCIMPORT ");
    PAN_ACCERTAMENTI.SetQuery(PPQRY_VARACC3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARACC C ");
    PAN_ACCERTAMENTI.SetQuery(PPQRY_VARACC3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CAPITOLO = NVL(~~PQRY_PARAM120.NOMEOGGECAPI~~, C.CAPITOLO)) ");
    SQL.append("and   (C.ARTICOLO = NVL(~~PQRY_PARAM120.NOMEOGGEARTI~~, C.ARTICOLO)) ");
    SQL.append("and   (C.ANNO_ACC = NVL(~~PQRY_PARAM120.NOMOGGANIMAC~~, C.ANNO_ACC)) ");
    SQL.append("and   (C.NUMERO_ACC = NVL(~~PQRY_PARAM120.NOMOGGNUIMAC~~, C.NUMERO_ACC)) ");
    SQL.append("and   (C.ANNO_VAR <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((~~PQRY_PARAM120.NOMEOGGEVARI~~ = 'D' AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.PROGRESSIVO_VARACC = C.PROGRESSIVO) ");
    SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGANNPRO~~, NVL(A.ANNO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGNUMPRO~~, NVL(A.NUMERO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAM120.NOMEOGGEPROP~~, NVL(A.UNITA_PROPONENTE, '-1'))) ");
    SQL.append("and   (NVL(A.ANNO_DEL, -1) = NVL(~~PQRY_PARAM120.NOMOGGANNDEL~~, NVL(A.ANNO_DEL, -1))) ");
    SQL.append("and   (NVL(A.NUMERO_DEL, -1) = NVL(~~PQRY_PARAM120.NOMOGGNUMDEL~~, NVL(A.NUMERO_DEL, -1))) ");
    SQL.append("and   (NVL(A.SEDE_DEL, '-1') = NVL(~~PQRY_PARAM120.NOMEOGGEDELI~~, NVL(A.SEDE_DEL, '-1'))) ");
    SQL.append("))) OR (~~PQRY_PARAM120.NOMEOGGEVARI~~ = 'P' AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.PROGRESSIVO ");
    SQL.append("from ");
    SQL.append("  VARCOMPRO B ");
    SQL.append("where (B.PROGRESSIVO_VARACC = C.PROGRESSIVO) ");
    SQL.append("and   (NVL(B.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGANNPRO~~, NVL(B.ANNO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(B.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAM120.NOMOGGNUMPRO~~, NVL(B.NUMERO_PROPOSTA, -1))) ");
    SQL.append("and   (NVL(B.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAM120.NOMEOGGEPROP~~, NVL(B.UNITA_PROPONENTE, '-1'))) ");
    SQL.append("))))) ");
    SQL.append("and   (C.VARIAZIONE_GENERATA = 'SI') ");
    SQL.append("and   ((C.ACC_GENERATO IS NULL)) ");
    PAN_ACCERTAMENTI.SetQuery(PPQRY_VARACC3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTI.SetQuery(PPQRY_VARACC3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTI.SetQuery(PPQRY_VARACC3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO, ");
    SQL.append("  C.ANNO_ACC, ");
    SQL.append("  C.NUMERO_ACC ");
    PAN_ACCERTAMENTI.SetQuery(PPQRY_VARACC3, 5, SQL, -1, "");
    PAN_ACCERTAMENTI.SetQueryDB(PPQRY_VARACC3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTI.SetMasterTable(0, "VARACC");
    PAN_ACCERTAMENTI.AddToSortList(PFL_ACCERTAMENTI_CAPITOLO, true);
    PAN_ACCERTAMENTI.AddToSortList(PFL_ACCERTAMENTI_ARTICOLO, true);
    PAN_ACCERTAMENTI.AddToSortList(PFL_ACCERTAMENTI_ANNOACC, true);
    PAN_ACCERTAMENTI.AddToSortList(PFL_ACCERTAMENTI_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCERTAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_ACCERTAMENTI.iUseListQBE;
      PAN_ACCERTAMENTI.iUseListQBE = 0;
      PAN_ACCERTAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCERTAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_ACCERTAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPEGNI) PAN_IMPEGNI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ACCERTAMENTI) PAN_ACCERTAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPEGNI) PAN_IMPEGNI_ValidateRow(Cancel);
    if (SrcObj == PAN_ACCERTAMENTI) PAN_ACCERTAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_IMPEGNI) PAN_IMPEGNI_DynamicProperties();
    if (SrcObj == PAN_ACCERTAMENTI) PAN_ACCERTAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPEGNI) PAN_IMPEGNI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ACCERTAMENTI) PAN_ACCERTAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IMPEGNI) PAN_IMPEGNI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ACCERTAMENTI) PAN_ACCERTAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_VARIAZIONI) TAB_VARIAZIONI_Click(PreviousPage, Cancel);
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
