// **********************************************
// Liquidazione Parziale Distinta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioneParzialeDistinta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DISTINTLABEL = 0;
  private static int PFL_PARAMETRI_NUMERODISTI1 = 1;
  private static int PFL_PARAMETRI_ANNODISTINT1 = 2;
  private static int PFL_PARAMETRI_BARRALABEL = 3;
  private static int PFL_PARAMETRI_SCELDISTLABE = 4;
  private static int PFL_PARAMETRI_DELLABEL = 5;
  private static int PFL_PARAMETRI_DATADISTINTA = 6;
  private static int PFL_PARAMETRI_TIPODIST = 7;

  private static int PPQRY_PARAMETRI376 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_LIQUPARZDIST_LIQPARZ = 0;
  private static int PFL_LIQUPARZDIST_NUMEROLIQ = 1;
  private static int PFL_LIQUPARZDIST_ANNOLIQ = 2;
  private static int PFL_LIQUPARZDIST_DATAREG = 3;
  private static int PFL_LIQUPARZDIST_CAPITOLO = 4;
  private static int PFL_LIQUPARZDIST_ARTICOLO = 5;
  private static int PFL_LIQUPARZDIST_NUMEROIMP = 6;
  private static int PFL_LIQUPARZDIST_ANNOIMP = 7;
  private static int PFL_LIQUPARZDIST_INFOIMPEGNO = 8;
  private static int PFL_LIQUPARZDIST_IMPELABELIST = 9;
  private static int PFL_LIQUPARZDIST_NUMEROSUBIMP = 10;
  private static int PFL_LIQUPARZDIST_ANNOSUBIMP = 11;
  private static int PFL_LIQUPARZDIST_INFOSUBIMPEG = 12;
  private static int PFL_LIQUPARZDIST_SUBIMPLABLIS = 13;
  private static int PFL_LIQUPARZDIST_IMPORTO = 14;
  private static int PFL_LIQUPARZDIST_IMPORTOIVA = 15;
  private static int PFL_LIQUPARZDIST_IMPORDAPAGAR = 16;
  private static int PFL_LIQUPARZDIST_IMPOIVADAPAG = 17;
  private static int PFL_LIQUPARZDIST_IMPORTIVAIST = 18;
  private static int PFL_LIQUPARZDIST_IMPOIVAIPAGA = 19;
  private static int PFL_LIQUPARZDIST_CODICEBENEFI = 20;
  private static int PFL_LIQUPARZDIST_BENEFICIARIO = 21;
  private static int PFL_LIQUPARZDIST_INFOBENEFICI = 22;
  private static int PFL_LIQUPARZDIST_NUMERODOC = 23;
  private static int PFL_LIQUPARZDIST_ANNODOC1 = 24;
  private static int PFL_LIQUPARZDIST_ANNODISTINTA = 25;
  private static int PFL_LIQUPARZDIST_NUMERODISTIN = 26;
  private static int PFL_LIQUPARZDIST_TIPODISTINTA = 27;
  private static int PFL_LIQUPARZDIST_ANNOMAND = 28;
  private static int PFL_LIQUPARZDIST_ANNODOC = 29;
  private static int PFL_LIQUPARZDIST_UTENTEINSERI = 30;
  private static int PFL_LIQUPARZDIST_DATAINSERIME = 31;
  private static int PFL_LIQUPARZDIST_UTENTULTIAGG = 32;
  private static int PFL_LIQUPARZDIST_DATAULTIMAGG = 33;
  private static int PFL_LIQUPARZDIST_CAPTITOLO = 34;
  private static int PFL_LIQUPARZDIST_CAPCATEGORIA = 35;
  private static int PFL_LIQUPARZDIST_CAPCODINTERV = 36;
  private static int PFL_LIQUPARZDIST_CAPCODTERZI = 37;
  private static int PFL_LIQUPARZDIST_LIQUIDALABEL = 38;
  private static int PFL_LIQUPARZDIST_FATANNOPROG = 39;
  private static int PFL_LIQUPARZDIST_FATNUMERPROG = 40;
  private static int PFL_LIQUPARZDIST_INFODOCUMENT = 41;
  private static int PFL_LIQUPARZDIST_INFODOCUMEN1 = 42;
  private static int PFL_LIQUPARZDIST_FATTRATTAIVA = 43;
  private static int PFL_LIQUPARZDIST_IMPODAPAGOLD = 44;
  private static int PFL_LIQUPARZDIST_FATATTIVIDOC = 45;

  private static int PPQRY_LIQ36 = 0;

  private static int PPQRY_BEN = 1;
  private static int PPQRY_INFOAPRI = 2;
  private static int PPQRY_FAT = 3;
  private static int PPQRY_CAP = 4;


  IDPanel PAN_LIQUPARZDIST;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI507(IMDB);
    //
    //
    Init_PQRY_PARAMETRI376(IMDB);
    Init_PQRY_PARAMETRI376_RS(IMDB);
    Init_PQRY_LIQ36(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI507(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI507, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI507, "TBL_PARAMETRI507");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA, "DATA_DISTINTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, "TIPO_DIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_TIPO_DIST,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_PARAMESTERNO, "PARAMESTERNO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_PARAMESTERNO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_PARAMLIQUIDA, "PARAMLIQUIDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_PARAMLIQUIDA,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_PARACAMPCHIA, "PARACAMPCHIA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI507,IMDBDef5.FLD_PARAMETRI507_PARACAMPCHIA,1,9,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI507, 0);
  }

  private static void Init_PQRY_PARAMETRI376(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI376, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI376, "PQRY_PARAMETRI376");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA, "DATA_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST, "TIPO_DIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_PARAMLIQUIDA, "PARAMLIQUIDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376,IMDBDef14.PQSL_PARAMETRI376_PARAMLIQUIDA,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI376, 0);
  }

  private static void Init_PQRY_PARAMETRI376_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI376_RS, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI376_RS, "PQRY_PARAMETRI376_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA, "DATA_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST, "TIPO_DIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_PARAMLIQUIDA, "PARAMLIQUIDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI376_RS,IMDBDef14.PQSL_PARAMETRI376_PARAMLIQUIDA,5,2,0);
  }

  private static void Init_PQRY_LIQ36(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ36, 30);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ36, "PQRY_LIQ36");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_TIPO_DISTINTA, "TIPO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_TIPO_DISTINTA,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_LIQ_PARZ, "LIQ_PARZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_LIQ_PARZ,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, "IMPORDAPAGAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, "IMPOIVADAPAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPODAPAGOLD, "IMPODAPAGOLD");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPODAPAGOLD,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPOIVAIPAGA, "IMPOIVAIPAGA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPOIVAIPAGA,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ36,IMDBDef14.PQSL_LIQ36_IMPORTO_IVA_IST,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ36, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioneParzialeDistinta(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioneParzialeDistinta()
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
    FormIdx = MyGlb.FRM_LIQUPARZDIST;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FA46AC38-8FC1-4EAB-8956-2109CFCAB60E";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 900;
    DesignHeight = 426;
    set_Caption(new IDVariant("Liquidazione Parziale Distinta"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 900;
    Frames[1].Height = 400;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.13;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 900;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 900;
    Frames[2].FixedHeight = 52;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 900-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FEAEC918-5A68-4CF3-A457-D3E1CCD0C9FB");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 244, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 900;
    Frames[3].Height = 348;
    Frames[3].Caption = "Liquidazione Parziale Distinta";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 348;
    PAN_LIQUPARZDIST = new IDPanel(w, this, 3, "PAN_LIQUPARZDIST");
    Frames[3].Content = PAN_LIQUPARZDIST;
    PAN_LIQUPARZDIST.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUPARZDIST.VS = MainFrm.VisualStyleList;
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 900-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4EF6182D-A1A8-4301-A7AF-4D5D040D13D1");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 1472, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUPARZDIST.InitStatus = 2;
    PAN_LIQUPARZDIST_Init();
    PAN_LIQUPARZDIST_InitFields();
    PAN_LIQUPARZDIST_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI507, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUPARZDIST_PARAMETRI376();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_LIQUPARZDIST.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELDISDILIQ && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCELDISTLABE) {
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
    return (obj instanceof LiquidazioneParzialeDistinta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioneParzialeDistinta.class.getName() : (Glb.ClassWithPackage(LiquidazioneParzialeDistinta.class) ? LiquidazioneParzialeDistinta.class.getName().substring(LiquidazioneParzialeDistinta.class.getPackage().getName().length() + 1) : LiquidazioneParzialeDistinta.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_LIQUPARZDIST.SetFieldValidation(PFL_LIQUPARZDIST_IMPORDAPAGAR, (new IDVariant(-1)).booleanValue()); 
      PAN_LIQUPARZDIST.SetFieldValidation(PFL_LIQUPARZDIST_IMPOIVADAPAG, (new IDVariant(-1)).booleanValue()); 
      PAN_LIQUPARZDIST.SetFieldValidation(PFL_LIQUPARZDIST_IMPOIVAIPAGA, (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELDISDILIQ)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA, 0, IMDB.Value(IMDBDef7.PQRY_DISTINLIQUI7, IMDBDef7.PQSL_DISTINLIQUI7_ANNO_DISTINTA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA, 0, IMDB.Value(IMDBDef7.PQRY_DISTINLIQUI7, IMDBDef7.PQSL_DISTINLIQUI7_NUMERO_DISTINTA, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "EndModalEvent", _e);
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
      if (new IDVariant(PAN_LIQUPARZDIST.Status()).compareTo((new IDVariant(3)), true)!=0)
      {
        UNLOADEVENT_PARAMEDELETE();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_ANNO_DISTINTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_NUMERO_DISTINTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_PARAMESTERNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_PARAMLIQUIDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_PARACAMPCHIA, 0, new IDVariant());
  }

  // **********************************************************************
  // Liquidazione Parziale Distinta On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUPARZDIST_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUPARZDIST);
      // 
      // Liquidazione Parziale Distinta On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaTooltip();
      if (IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_LIQ_PARZ, 0).equals((new IDVariant("SI")), true))
      {
        PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if ((new IDVariant(PAN_LIQUPARZDIST.FieldText(PFL_LIQUPARZDIST_FATTRATTAIVA))).equals((new IDVariant("SP")), true) || (new IDVariant(PAN_LIQUPARZDIST.FieldText(PFL_LIQUPARZDIST_FATTRATTAIVA))).equals((new IDVariant("RC")), true))
        {
          PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO_IVA_IST, 0))))
        {
          PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_LIQUPARZDIST.SetFlags (Glb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "LiquidazioneParzialeDistintaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Parziale Distinta On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUPARZDIST_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Parziale Distinta On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_LIQUPARZDIST_LIQPARZ)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_LIQ_PARZ, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPODAPAGOLD, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0, (new IDVariant()));
        }
        else
        {
          if ((new IDVariant(PAN_LIQUPARZDIST.FieldText(PFL_LIQUPARZDIST_FATTRATTAIVA))).equals((new IDVariant("SP")), true) || (new IDVariant(PAN_LIQUPARZDIST.FieldText(PFL_LIQUPARZDIST_FATTRATTAIVA))).equals((new IDVariant("RC")), true))
          {
            // if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0)))
            // {
              // IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0, new IDVariant(MainFrm.Calcolaivaliq(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_ANNO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_NUMERO_PROG, 0)),IDVariant.FLOAT));
            // }
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUPARZDIST_IMPORDAPAGAR)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPODAPAGOLD, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO, 0), true)>0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Importo da Pagare superiore all'importo della liquidazione"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, 0, ((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO, 0),(new IDVariant(0))).equals((new IDVariant(0))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO, 0)));
          }
          else
          {
            IDVariant v_VCALCIMPOIVA = new IDVariant(0,IDVariant.DECIMAL);
            v_VCALCIMPOIVA = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  CALCOLA_IMPORTO_IVA(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CIILFAPLPDLP ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCALCIMPOIVA = QV.Get("CIILFAPLPDLP", IDVariant.DECIMAL) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0, IDL.NullValue(v_VCALCIMPOIVA,IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0)));
            if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0))))
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Attenzione: verificare importo iva da pagare"));
              MainFrm.set_AlertMessage(S); 
            }
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPODAPAGOLD, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORDAPAGAR, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUPARZDIST_IMPOIVADAPAG)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO_IVA, 0), true)>0 && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO_IVA, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Importo IVA da Pagare superiore all'importo IVA"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPOIVADAPAG, 0, ((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO_IVA, 0),(new IDVariant(0))).equals((new IDVariant(0))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_IMPORTO_IVA, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "LiquidazioneParzialeDistintaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Parziale Distinta On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_LIQUPARZDIST_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_LIQUPARZDIST, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Liquidazione Parziale Distinta On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "LiquidazioneParzialeDistintaOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Parziale Distinta On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUPARZDIST_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Parziale Distinta On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_LIQUPARZDIST.PanelCommand(Glb.PCM_REQUERY);
      }
      if (Command.equals((new IDVariant(128)), true))
      {
        IDVariant I = new IDVariant(0,IDVariant.INTEGER);
        for (I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_LIQUPARZDIST.NumRows)), true)<=0; I = IDL.Add(I, (new IDVariant(1))))
        {
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            IDVariant v_IMPORTO = null;
            v_IMPORTO = new IDVariant(IDL.ToFloat(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPORTO,I.intValue())),IDVariant.DECIMAL);
            IDVariant v_IMPORDAPAGAR = null;
            v_IMPORDAPAGAR = new IDVariant(IDL.ToFloat(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPORDAPAGAR,I.intValue())),IDVariant.DECIMAL);
            IDVariant v_IVA = null;
            v_IVA = new IDVariant(IDL.ToFloat(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPORTOIVA,I.intValue())),IDVariant.DECIMAL);
            IDVariant v_IVAIST = null;
            v_IVAIST = new IDVariant(IDL.ToFloat(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPORTIVAIST,I.intValue())),IDVariant.DECIMAL);
            IDVariant v_IVADAPAGARE = null;
            v_IVADAPAGARE = new IDVariant(IDL.ToFloat(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPOIVADAPAG,I.intValue())),IDVariant.DECIMAL);
            IDVariant v_IVAISDAPAGAR = null;
            v_IVAISDAPAGAR = new IDVariant(((IDL.NullValue(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPOIVAIPAGA,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToFloat(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_IMPOIVAIPAGA,I.intValue())):(new IDVariant())),IDVariant.DECIMAL);
            IDVariant v_ANNOLIQ = null;
            v_ANNOLIQ = IDL.ToInteger(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_ANNOLIQ,I.intValue()));
            IDVariant v_NUMEROLIQ = null;
            v_NUMEROLIQ = IDL.ToInteger(PAN_LIQUPARZDIST.GetValueAt(PFL_LIQUPARZDIST_NUMEROLIQ,I.intValue()));
            if (IDL.NullValue(v_IMPORDAPAGAR,v_IMPORTO).compareTo(v_IMPORTO, true)!=0 && IDL.NullValue(v_IMPORDAPAGAR,(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
            {
              IDVariant v_VCOUNTIMPECO = new IDVariant(0,IDVariant.INTEGER);
              IDVariant v_VIMPECOFATTO = new IDVariant(0,IDVariant.STRING);
              IDVariant v_VIMPECOCENTR = new IDVariant(0,IDVariant.STRING);
              IDVariant v_VIMPECOCOMDA = new IDVariant(0,IDVariant.DATETIME);
              IDVariant v_VIMPECOCOMAL = new IDVariant(0,IDVariant.DATETIME);
              v_VIMPECOFATTO = (new IDVariant());
              v_VIMPECOCENTR = (new IDVariant());
              v_VIMPECOCOMDA = (new IDVariant());
              v_VIMPECOCOMAL = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1, ");
              SQL.append("  MAX(A.FATTORE) as MAXIMPECOFAT, ");
              SQL.append("  MAX(A.CENTRO) as MAXIMPECOCEN, ");
              SQL.append("  MAX(A.COMPETENZA_DAL) as MAXIMPECCODA, ");
              SQL.append("  MAX(A.COMPETENZA_AL) as MAXIMPECCOAL ");
              SQL.append("from ");
              SQL.append("  IMP_ECO A ");
              SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNTIMPECO = QV.Get("COUNT1", IDVariant.INTEGER) ;
                v_VIMPECOFATTO = QV.Get("MAXIMPECOFAT", IDVariant.STRING) ;
                v_VIMPECOCENTR = QV.Get("MAXIMPECOCEN", IDVariant.STRING) ;
                v_VIMPECOCOMDA = QV.Get("MAXIMPECCODA", IDVariant.DATETIME) ;
                v_VIMPECOCOMAL = QV.Get("MAXIMPECCOAL", IDVariant.DATETIME) ;
              }
              QV.Close();
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  IMPORTO = " + IDL.CSql(v_IMPORDAPAGAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  LIQ_PARZ = 'SI', ");
              SQL.append("  IMPORTO_IVA = " + IDL.CSql(v_IVADAPAGARE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  IMPORTO_IVA_IST = " + IDL.CSql(v_IVAISDAPAGAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              if (v_VCOUNTIMPECO.compareTo((new IDVariant(0)), true)>0)
              {
                SQL = new StringBuffer();
                SQL.append("update IMP_ECO set ");
                SQL.append("  IMPORTO = " + IDL.CSql(v_IMPORDAPAGAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              IDVariant v_NEWNUMEROLIQ = null;
              v_NEWNUMEROLIQ = (new IDVariant());
              MainFrm.Cf4armDBObject.ACHKNUMERAZIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("LIQ")), v_NEWNUMEROLIQ);
              SQL = new StringBuffer();
              SQL.append("insert into LIQ ");
              SQL.append("( ");
              SQL.append("  CAPITOLO, ");
              SQL.append("  ARTICOLO, ");
              SQL.append("  ANNO_LIQ, ");
              SQL.append("  NUMERO_LIQ, ");
              SQL.append("  ANNO_IMP, ");
              SQL.append("  NUMERO_IMP, ");
              SQL.append("  ANNO_SUBIMP, ");
              SQL.append("  NUMERO_SUBIMP, ");
              SQL.append("  ANNO_DEL, ");
              SQL.append("  NUMERO_DEL, ");
              SQL.append("  SEDE_DEL, ");
              SQL.append("  IMPORTO, ");
              SQL.append("  IMPORTO_IVA, ");
              SQL.append("  IMPORTO_IVA_IST, ");
              SQL.append("  RITENUTE, ");
              SQL.append("  DESCRIZIONE, ");
              SQL.append("  DIVERSO_BEN, ");
              SQL.append("  BENEFICIARIO, ");
              SQL.append("  ANNO_DOC, ");
              SQL.append("  NUMERO_DOC, ");
              SQL.append("  NUM_QUIETANZA, ");
              SQL.append("  CAUSALE, ");
              SQL.append("  BOLLO, ");
              SQL.append("  ANNO_MAND, ");
              SQL.append("  NUMERO_MAND, ");
              SQL.append("  DATA_PAGAM, ");
              SQL.append("  IMPORTO_PAGAM, ");
              SQL.append("  CODICE, ");
              SQL.append("  CAUSALE_IRPEF, ");
              SQL.append("  IMPONIBILE, ");
              SQL.append("  ALIQUOTA, ");
              SQL.append("  TIPO_VINCOLO, ");
              SQL.append("  RITENUTE_IRPEF, ");
              SQL.append("  IMPORTO_NON_SOG, ");
              SQL.append("  NUMERO_PAGAM, ");
              SQL.append("  NUM_QUIETANZA_DIV_BEN, ");
              SQL.append("  UFFICIO, ");
              SQL.append("  ANNO_PROPOSTA, ");
              SQL.append("  UNITA_PROPONENTE, ");
              SQL.append("  NUMERO_PROPOSTA, ");
              SQL.append("  CODICE_SSN, ");
              SQL.append("  ALIQ_SSN_CD, ");
              SQL.append("  ALIQ_SSN_CE, ");
              SQL.append("  IMPONIBILE_SSN, ");
              SQL.append("  RITENUTE_SSN, ");
              SQL.append("  RITENUTE_SSN_CE, ");
              SQL.append("  CASSA, ");
              SQL.append("  IMPONIBILE_INPS, ");
              SQL.append("  ALIQUOTA_INPS, ");
              SQL.append("  RITENUTE_INPS, ");
              SQL.append("  RITENUTE_INPS_CE, ");
              SQL.append("  VOCE_ECON, ");
              SQL.append("  CODICE_PTC, ");
              SQL.append("  FAT_ANNO_PROG, ");
              SQL.append("  FAT_NUMERO_PROG, ");
              SQL.append("  S, ");
              SQL.append("  D_DATA_REG, ");
              SQL.append("  D_DATA_PAGAM, ");
              SQL.append("  NUMERO_CONTABILE, ");
              SQL.append("  DATA_CONTABILE, ");
              SQL.append("  PROGRESSIVO_TESO, ");
              SQL.append("  ANNO_DISTINTA, ");
              SQL.append("  NUMERO_DISTINTA, ");
              SQL.append("  ALIQUOTA_ADD, ");
              SQL.append("  RITENUTE_ADD, ");
              SQL.append("  LIRE_EURO, ");
              SQL.append("  PAGAMENTO_IN_EURO, ");
              SQL.append("  IMPORTO_EURO, ");
              SQL.append("  RITENUTE_EURO, ");
              SQL.append("  IMPONIBILE_EURO, ");
              SQL.append("  IMPORTO_NON_SOG_EURO, ");
              SQL.append("  RITENUTE_IRPEF_EURO, ");
              SQL.append("  IMPONIBILE_SSN_EURO, ");
              SQL.append("  RITENUTE_SSN_EURO, ");
              SQL.append("  RITENUTE_SSN_CE_EURO, ");
              SQL.append("  IMPONIBILE_INPS_EURO, ");
              SQL.append("  RITENUTE_INPS_EURO, ");
              SQL.append("  RITENUTE_INPS_CE_EURO, ");
              SQL.append("  RITENUTE_ADD_EURO, ");
              SQL.append("  RITENUTE_CASSE_PROF, ");
              SQL.append("  RITENUTE_CASSE_PROF_EURO, ");
              SQL.append("  ALIQUOTA_ADD_COM, ");
              SQL.append("  RITENUTE_ADD_COM_EURO, ");
              SQL.append("  RITENUTE_ADD_COM, ");
              SQL.append("  COD_IMP_ECO, ");
              SQL.append("  CODICE_INAIL, ");
              SQL.append("  ALIQUOTA_INAIL, ");
              SQL.append("  IMPONIBILE_INAIL, ");
              SQL.append("  RITENUTE_INAIL, ");
              SQL.append("  RITENUTE_INAIL_CE, ");
              SQL.append("  IMPONIBILE_INAIL_EURO, ");
              SQL.append("  RITENUTE_INAIL_EURO, ");
              SQL.append("  RITENUTE_INAIL_CE_EURO, ");
              SQL.append("  TIPO_DISTINTA, ");
              SQL.append("  FINANZIAMENTO, ");
              SQL.append("  SPESE, ");
              SQL.append("  SCADENZA, ");
              SQL.append("  ALLEGATI, ");
              SQL.append("  COMMISSIONI, ");
              SQL.append("  INFO_TESORIERE, ");
              SQL.append("  CODICE_GESTIONALE, ");
              SQL.append("  NOTE, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  UTENTE_ULTIMO_AGG, ");
              SQL.append("  DATA_ULTIMO_AGG, ");
              SQL.append("  CIG, ");
              SQL.append("  CUP, ");
              SQL.append("  CODICE_COFOG, ");
              SQL.append("  COD_LIVELLO_5, ");
              SQL.append("  CODICE_EUROPEO, ");
              SQL.append("  LIQ_PARZ ");
              SQL.append(") ");
              SQL.append("select ");
              SQL.append("  A.CAPITOLO, ");
              SQL.append("  A.ARTICOLO, ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_NEWNUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  A.ANNO_IMP, ");
              SQL.append("  A.NUMERO_IMP, ");
              SQL.append("  A.ANNO_SUBIMP, ");
              SQL.append("  A.NUMERO_SUBIMP, ");
              SQL.append("  A.ANNO_DEL, ");
              SQL.append("  A.NUMERO_DEL, ");
              SQL.append("  A.SEDE_DEL, ");
              SQL.append("  " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - " + IDL.CSql(v_IMPORDAPAGAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  CASE WHEN NVL(" + IDL.CSql(v_IVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 THEN " + IDL.CSql(v_IVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - " + IDL.CSql(v_IVADAPAGARE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE to_number(NULL) END, ");
              SQL.append("  CASE WHEN NVL(" + IDL.CSql(v_IVAIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 THEN " + IDL.CSql(v_IVAIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - " + IDL.CSql(v_IVAISDAPAGAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE to_number(NULL) END, ");
              SQL.append("  A.RITENUTE, ");
              SQL.append("  A.DESCRIZIONE, ");
              SQL.append("  A.DIVERSO_BEN, ");
              SQL.append("  A.BENEFICIARIO, ");
              SQL.append("  A.ANNO_DOC, ");
              SQL.append("  A.NUMERO_DOC, ");
              SQL.append("  A.NUM_QUIETANZA, ");
              SQL.append("  A.CAUSALE, ");
              SQL.append("  A.BOLLO, ");
              SQL.append("  A.ANNO_MAND, ");
              SQL.append("  A.NUMERO_MAND, ");
              SQL.append("  A.DATA_PAGAM, ");
              SQL.append("  A.IMPORTO_PAGAM, ");
              SQL.append("  A.CODICE, ");
              SQL.append("  A.CAUSALE_IRPEF, ");
              SQL.append("  A.IMPONIBILE, ");
              SQL.append("  A.ALIQUOTA, ");
              SQL.append("  A.TIPO_VINCOLO, ");
              SQL.append("  A.RITENUTE_IRPEF, ");
              SQL.append("  A.IMPORTO_NON_SOG, ");
              SQL.append("  A.NUMERO_PAGAM, ");
              SQL.append("  A.NUM_QUIETANZA_DIV_BEN, ");
              SQL.append("  A.UFFICIO, ");
              SQL.append("  A.ANNO_PROPOSTA, ");
              SQL.append("  A.UNITA_PROPONENTE, ");
              SQL.append("  A.NUMERO_PROPOSTA, ");
              SQL.append("  A.CODICE_SSN, ");
              SQL.append("  A.ALIQ_SSN_CD, ");
              SQL.append("  A.ALIQ_SSN_CE, ");
              SQL.append("  A.IMPONIBILE_SSN, ");
              SQL.append("  A.RITENUTE_SSN, ");
              SQL.append("  A.RITENUTE_SSN_CE, ");
              SQL.append("  A.CASSA, ");
              SQL.append("  A.IMPONIBILE_INPS, ");
              SQL.append("  A.ALIQUOTA_INPS, ");
              SQL.append("  A.RITENUTE_INPS, ");
              SQL.append("  A.RITENUTE_INPS_CE, ");
              SQL.append("  DECODE(" + IDL.CSql(MainFrm.SIOPEATTIARM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', to_number(NULL), A.VOCE_ECON), ");
              SQL.append("  A.CODICE_PTC, ");
              SQL.append("  A.FAT_ANNO_PROG, ");
              SQL.append("  A.FAT_NUMERO_PROG, ");
              SQL.append("  A.S, ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  A.D_DATA_PAGAM, ");
              SQL.append("  A.NUMERO_CONTABILE, ");
              SQL.append("  A.DATA_CONTABILE, ");
              SQL.append("  A.PROGRESSIVO_TESO, ");
              SQL.append("  A.ANNO_DISTINTA, ");
              SQL.append("  A.NUMERO_DISTINTA, ");
              SQL.append("  A.ALIQUOTA_ADD, ");
              SQL.append("  A.RITENUTE_ADD, ");
              SQL.append("  A.LIRE_EURO, ");
              SQL.append("  A.PAGAMENTO_IN_EURO, ");
              SQL.append("  A.IMPORTO_EURO, ");
              SQL.append("  A.RITENUTE_EURO, ");
              SQL.append("  A.IMPONIBILE_EURO, ");
              SQL.append("  A.IMPORTO_NON_SOG_EURO, ");
              SQL.append("  A.RITENUTE_IRPEF_EURO, ");
              SQL.append("  A.IMPONIBILE_SSN_EURO, ");
              SQL.append("  A.RITENUTE_SSN_EURO, ");
              SQL.append("  A.RITENUTE_SSN_CE_EURO, ");
              SQL.append("  A.IMPONIBILE_INPS_EURO, ");
              SQL.append("  A.RITENUTE_INPS_EURO, ");
              SQL.append("  A.RITENUTE_INPS_CE_EURO, ");
              SQL.append("  A.RITENUTE_ADD_EURO, ");
              SQL.append("  A.RITENUTE_CASSE_PROF, ");
              SQL.append("  A.RITENUTE_CASSE_PROF_EURO, ");
              SQL.append("  A.ALIQUOTA_ADD_COM, ");
              SQL.append("  A.RITENUTE_ADD_COM_EURO, ");
              SQL.append("  A.RITENUTE_ADD_COM, ");
              SQL.append("  A.COD_IMP_ECO, ");
              SQL.append("  A.CODICE_INAIL, ");
              SQL.append("  A.ALIQUOTA_INAIL, ");
              SQL.append("  A.IMPONIBILE_INAIL, ");
              SQL.append("  A.RITENUTE_INAIL, ");
              SQL.append("  A.RITENUTE_INAIL_CE, ");
              SQL.append("  A.IMPONIBILE_INAIL_EURO, ");
              SQL.append("  A.RITENUTE_INAIL_EURO, ");
              SQL.append("  A.RITENUTE_INAIL_CE_EURO, ");
              SQL.append("  A.TIPO_DISTINTA, ");
              SQL.append("  A.FINANZIAMENTO, ");
              SQL.append("  A.SPESE, ");
              SQL.append("  A.SCADENZA, ");
              SQL.append("  A.ALLEGATI, ");
              SQL.append("  A.COMMISSIONI, ");
              SQL.append("  A.INFO_TESORIERE, ");
              SQL.append("  DECODE(" + IDL.CSql(MainFrm.SIOPEATTIARM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', to_number(NULL), A.CODICE_GESTIONALE), ");
              SQL.append("  A.NOTE, ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  NULL, ");
              SQL.append("  to_date(NULL), ");
              SQL.append("  A.CIG, ");
              SQL.append("  A.CUP, ");
              SQL.append("  A.CODICE_COFOG, ");
              SQL.append("  A.COD_LIVELLO_5, ");
              SQL.append("  A.CODICE_EUROPEO, ");
              SQL.append("  'SI' ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              if (v_VCOUNTIMPECO.compareTo((new IDVariant(0)), true)>0)
              {
                SQL = new StringBuffer();
                SQL.append("insert into IMP_ECO ");
                SQL.append("( ");
                SQL.append("  ESERCIZIO, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  FATTORE, ");
                SQL.append("  CENTRO, ");
                SQL.append("  COMPETENZA_DAL, ");
                SQL.append("  COMPETENZA_AL, ");
                SQL.append("  IMPORTO, ");
                SQL.append("  ANNO_LIQ, ");
                SQL.append("  NUMERO_LIQ ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  to_number(NULL), ");
                SQL.append("  " + IDL.CSql(v_VIMPECOFATTO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_VIMPECOCENTR, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_VIMPECOCOMDA, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_VIMPECOCOMAL, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - " + IDL.CSql(v_IMPORDAPAGAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_NEWNUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
          }
          catch (Exception e9)
          {
            MainFrm.Cf4armDBObject.RollbackTrans();
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
          }
          MainFrm.Cf4armDBObject.CommitTrans();
        }
        PAN_LIQUPARZDIST.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "LiquidazioneParzialeDistintaOnCommand", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
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
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ANNODISTINT1)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODISTI1)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA, 0))))
        {
          if (!(ControlloValiditaDistinta(IMDB.Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA, 0))))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_ANNO_DISTINTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_NUMERO_DISTINTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Distinte
  // **********************************************************************
  public int ApriSceltaDistinte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Distinte Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, 0).equals((new IDVariant("L")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, 0));
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARAMLIQUIDA, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELDISDILIQ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "ApriSceltaDistinte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_NUMERO_SUBIMP, 0));
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Beneficiario
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Beneficiario Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_BENEFICIARIO, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_BENEFICIARIO, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "InfoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_NUMERO_IMP, 0));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tooltip
  // **********************************************************************
  public int SettaTooltip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tooltip Body
      // Procedure Body
      // 
      PAN_LIQUPARZDIST.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUPARZDIST_BENEFICIARIO,(new IDVariant(PAN_LIQUPARZDIST.FieldText(PFL_LIQUPARZDIST_BENEFICIARIO))).stringValue()); 
      PAN_LIQUPARZDIST.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUPARZDIST_NUMERODOC,(new IDVariant(PAN_LIQUPARZDIST.FieldText(PFL_LIQUPARZDIST_NUMERODOC))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "SettaTooltip", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Validita Distinta
  // Anno Distinta:  - Input
  // Numero Distinta:  - Input
  // **********************************************************************
  public boolean ControlloValiditaDistinta (IDVariant AnnoDistinta, IDVariant NumeroDistinta)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STATO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_LIQUIDATO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DATADISTINTA = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_TIPODISTINTA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controllo Validita Distinta Body
      // Procedure Body
      // 
      v_NUMREC = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(A.STATO) as MINDISLIQSTA, ");
      SQL.append("  MIN(A.FLAG_LIQUIDATO) as MINDISLIFLLI, ");
      SQL.append("  MIN(A.DATA_DISTINTA) as MINDISLIDADI, ");
      SQL.append("  MIN(A.TIPO_DIST) as MINDISLITIDI ");
      SQL.append("from ");
      SQL.append("  DISTINTE_LIQUIDAZIONE A ");
      SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(AnnoDistinta, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(NumeroDistinta, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_STATO = QV.Get("MINDISLIQSTA", IDVariant.INTEGER) ;
        v_LIQUIDATO = QV.Get("MINDISLIFLLI", IDVariant.STRING) ;
        v_DATADISTINTA = QV.Get("MINDISLIDADI", IDVariant.DATETIME) ;
        v_TIPODISTINTA = QV.Get("MINDISLITIDI", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_NUMREC.equals((new IDVariant(0)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Distinta non presente", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return (new IDVariant(0)).booleanValue();
      }
      // 
      // 
      // 
      // 
      if (IDL.NullValue(v_LIQUIDATO,(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Distinta non ancora liquidata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return (new IDVariant(0)).booleanValue();
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA, 0, new IDVariant(v_DATADISTINTA));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA, 0, new IDVariant(v_DATADISTINTA));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, 0, new IDVariant(v_TIPODISTINTA));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST, 0, new IDVariant(v_TIPODISTINTA));
      if (!(AnnoDistinta.booleanValue()))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_DATA_DISTINTA, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI376, IMDBDef14.PQSL_PARAMETRI376_TIPO_DIST, 0, (new IDVariant()));
        return (new IDVariant(0)).booleanValue();
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "ControlloValiditaDistinta", _e);
      return false;
    }
  }

  // **********************************************************************
  // Info Documento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDocumento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Documento Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "InfoDocumento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Documento 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDocumento1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Documento 1 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ36, IMDBDef14.PQSL_LIQ36_FAT_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_RIEPILOGOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneParzialeDistinta", "InfoDocumento1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUPARZDIST_PARAMETRI376() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI376_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI507, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI507, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI376_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI376_RS, 0, IMDBDef5.TBL_PARAMETRI507, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI376_RS, 0, 0, IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_ANNO_DISTINTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI376_RS, 1, 0, IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_NUMERO_DISTINTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI376_RS, 2, 0, IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI376_RS, 3, 0, IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI376_RS, 4, 0, IMDBDef5.TBL_PARAMETRI507, IMDBDef5.FLD_PARAMETRI507_PARAMLIQUIDA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI507, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI507, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI507, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI376_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELDISTLABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaDistinte();
      Cancel.set(IDVariant.TRUE);
    }
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

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUPARZDIST_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUPARZDIST, Cancel);
    // Stub
  }

  private void PAN_LIQUPARZDIST_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUPARZDIST_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_LIQUPARZDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUPARZDIST_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_LIQUPARZDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUPARZDIST_INFOBENEFICI)
    {
      this.IdxPanelActived = this.PAN_LIQUPARZDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUPARZDIST_INFODOCUMENT)
    {
      this.IdxPanelActived = this.PAN_LIQUPARZDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDocumento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUPARZDIST_INFODOCUMEN1)
    {
      this.IdxPanelActived = this.PAN_LIQUPARZDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDocumento1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUPARZDIST_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUPARZDIST_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUPARZDIST_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUPARZDIST_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, "EB546CD5-153F-4B8A-99B8-C884FD5EBCB4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, "Distinta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, "3850F404-955C-4CEE-B4D9-84901743E00E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, "NUMERO DISTINTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, "042D02E5-CBAD-48F5-8EDB-33FB03F1F4A5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, "ANNO DISTINTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "DE1EC6D7-DBB1-4BBF-8268-A0CED22934BA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, "94864EB6-8683-48E0-821D-A4596DC55F84");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, "E9935AF8-986D-4C38-BF21-A2C287BE2BDD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, "del");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, "3C314D63-04F8-441E-BBA8-396CBD17DBE6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, "DATA DISTINTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, "097E57C7-27D8-4579-B717-13A1062B7424");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, "TIPO DIST");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 12, 16, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 8, 8, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_LIST, "NUM. DIST.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_FORM, 64, 8, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTI1, MyGlb.PANEL_FORM, "NUMERO DISTINTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODISTI1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODISTI1, PPQRY_PARAMETRI376, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_LIST, "ANN. DIST.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_FORM, 132, 8, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINT1, MyGlb.PANEL_FORM, "ANNO DISTINTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODISTINT1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODISTINT1, PPQRY_PARAMETRI376, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 20, 24, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 112, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRALABEL, -1, "", "BARRALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_LIST, 172, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_FORM, 180, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELDISTLABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELDISTLABE, -1, "", "SCELDISTLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.PANEL_LIST, 20, 24, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.PANEL_FORM, 212, 8, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELLABEL, -1, "", "DELLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, "DATA DISTINTA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, 244, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, "DT. DISTINTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATADISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATADISTINTA, PPQRY_PARAMETRI376, "A.DATA_DISTINTA", "DATA_DISTINTA", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_LIST, "TIPO DIST");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_FORM, 324, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODIST, MyGlb.PANEL_FORM, "TP. DIST");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPODIST, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPODIST, PPQRY_PARAMETRI376, "A.TIPO_DIST", "TIPO_DIST", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODIST, (new IDVariant("B")), "Ordini", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODIST, (new IDVariant("D")), "Disposizioni", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODIST, (new IDVariant("L")), "Liquidazioni", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI376", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI376, IMDBDef14.PQRY_PARAMETRI376_RS, IMDBDef5.TBL_PARAMETRI507);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODISTI1, IMDBDef5.FLD_PARAMETRI507_NUMERO_DISTINTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODISTINT1, IMDBDef5.FLD_PARAMETRI507_ANNO_DISTINTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATADISTINTA, IMDBDef5.FLD_PARAMETRI507_DATA_DISTINTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPODIST, IMDBDef5.FLD_PARAMETRI507_TIPO_DIST);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI507");
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

  private void PAN_LIQUPARZDIST_Init()
  {

    PAN_LIQUPARZDIST.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUPARZDIST.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUPARZDIST.SetSize(MyGlb.OBJ_FIELD, 46);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, "C2C543ED-0BD9-4F4E-BAAF-E78CA7664050");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, " ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, "D5662EA6-9357-4B75-BE9B-96789F0DE9A9");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, "5B952C8E-06BB-477B-A3C5-B107CD5665B9");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, "D31ECA1A-1AF5-4972-9F78-108B4F2602D2");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, "Data Reg.");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, "FA5C5FEC-A2E9-4BEA-93F1-C686D826A892");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, "Capitolo/Art.");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, "E24FE803-A224-47B3-AA0D-8D61788EAC85");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, " ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, "FD2AAA04-5F80-45D1-84BA-E0178234DA9C");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, "NUMERO IMP");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, "3D54A00E-DFE2-497B-A077-36AAD5A59C6E");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, "ANNO IMP");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, "E9884C47-B7A8-4E48-B7F3-5CE6A917726F");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, "Info Impegno");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, "C8A205DD-D777-47B5-9248-C4F2998E0B0D");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, "Impegno");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, "5B73D492-57F4-4F5F-A0E0-89407628819F");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, "56E5F0C7-805A-490B-A33F-3C5A9D1FA1F4");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, "CC887C37-B5B0-4961-82FE-793E1E2A410E");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, "Info Sub Impegno");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, "D48478CD-36E1-4D78-B8F5-6A9C2DFA8FA7");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, "Sub-Impegno");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, "F4F1A1A3-4724-4E9F-ABAB-2950F5BB0A4A");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, "Importo");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, "0E034FB7-F4E4-435B-B9B5-1650D53B686B");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, "Importo IVA");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, "383610F5-52C3-4C93-A3D4-1B160C1BF627");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, "Importo Da Pagare");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, "68E399C6-3CC3-4952-8060-D486383815F2");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, "Importo IVA Da Pagare");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, "417B4B3A-2768-453C-97FC-5DE28410EB70");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, "di cui IVA Ist.");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, "E04B0FEB-7262-4263-9EAD-9416DECAC4AC");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, "di cui  IVA Ist. da Pagare");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, "C023E298-E2C9-4938-ABBD-C42DA26C604B");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, "Codice Beneficiario");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, "073ABEBC-0DD3-4E15-BAB7-D03E238514B9");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, "Beneficiario");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, "3A33C646-CC16-42C3-9ABB-9EA1F8938FB6");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, " ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.VIS_HYLIIMNOBOVH);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, "A4BA7C58-5280-4693-895C-0AB0BE3DA3EF");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, "Documento");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, "F7BD88D6-220C-4EE6-8FDF-0AD3885C6311");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, " ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.VIS_NOFINOBOVEHE);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, "F0B90C4B-42D5-4C1C-A44B-05CF99FDFB4B");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, "ANNO DISTINTA");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, "F07DC49C-35E7-46A5-AFF2-5B1CD62B1598");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, "NUMERO DISTINTA");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, "97717AC4-AF8C-48AC-9916-B60E91C36F99");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, "TIPO DISTINTA");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, "21AB8506-20CB-495C-8B65-1AFE332A2BD5");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, "ANNO MAND");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, "82E4599A-6BDC-4CC5-97B5-7083CE97724E");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, "ANNO DOC");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, "46495DED-09C1-48C4-A320-14CE7EB6DCAE");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, "8428E686-4A8D-447F-9A51-B34E8AF42E0A");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, "DATA INSERIMENTO");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, "EED94108-7582-4E19-8865-13A997EE354D");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, "9A96CE0A-F483-4547-A7FC-652851A345AB");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, "F51408E5-7361-4BF5-8C30-75E4AFBEB5B5");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, "CAP TITOLO");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, "5E0E36D3-2CB9-453C-8E54-3E1CBE4B829E");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, "CAP CATEGORIA");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, "65A1B7A6-2C9C-48BE-942E-D79AFC3D8E24");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, "CAP COD INTERVENTO");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, "27D95C04-355D-403F-A8F0-660DD0805D86");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, "CAP COD TERZI");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, "D8B12834-6FB2-4074-B9EB-9CF319AE222D");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, "Liquidazione");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, "37BF0CED-FD92-4B84-B6E2-D5241B2B76DF");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, "FAT ANNO PROG");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, "A6EED3B4-E283-4325-ACFE-1EFB2AEFB24D");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, "B663478A-0F01-4ED6-93E3-433A3694CE20");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, " ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, "99CB1B9A-C0F9-46C5-8D14-DCFCABE0A3C1");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, " ");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, "32C7D45D-156E-43B3-BB15-144A4D478863");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, "TRATTAMENTO_IVA");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, "D6DEC3C4-9B76-416F-9C7D-AC62419E5627");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, "Importo Da Pagare OLD");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUPARZDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, "F60D9464-ED95-454C-9B97-D23FFC74760D");
    PAN_LIQUPARZDIST.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, "FAT Attivita DOC");
    PAN_LIQUPARZDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, "");
    PAN_LIQUPARZDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUPARZDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUPARZDIST_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_LIST, 0, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_LIST, " ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_FORM, 4, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQPARZ, MyGlb.PANEL_FORM, " ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_LIQPARZ, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_LIQPARZ, PPQRY_LIQ36, "A.LIQ_PARZ", "LIQ_PARZ", 5, 2, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_LIQPARZ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_LIQPARZ, (new IDVariant()), "Null", "", "", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_LIST, 20, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_FORM, 124, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_NUMEROLIQ, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_NUMEROLIQ, PPQRY_LIQ36, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_LIST, 64, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_FORM, 124, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNOLIQ, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNOLIQ, PPQRY_LIQ36, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_LIST, 100, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_FORM, 32, 320, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_DATAREG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_DATAREG, PPQRY_LIQ36, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_LIST, 180, 40, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_FORM, 176, 32, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPITOLO, MyGlb.PANEL_FORM, "Capit. Art");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_CAPITOLO, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_CAPITOLO, PPQRY_LIQ36, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_LIST, 288, 40, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_FORM, 248, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ARTICOLO, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ARTICOLO, PPQRY_LIQ36, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_LIST, 312, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_FORM, 364, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_NUMEROIMP, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_NUMEROIMP, PPQRY_LIQ36, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_LIST, 356, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_FORM, 432, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNOIMP, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNOIMP, PPQRY_LIQ36, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_LIST, 392, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_FORM, 364, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOIMPEGNO, MyGlb.PANEL_FORM, "Inf. Imp.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_INFOIMPEGNO, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_INFOIMPEGNO, PPQRY_INFOAPRI, "DECODE(~~ANNO_IMP~~, to_number(NULL), NULL, 'I')", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.PANEL_LIST, 312, 4, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.PANEL_LIST, 0);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.PANEL_LIST, 2);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.PANEL_FORM, 96, 8, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.PANEL_FORM, 0);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPELABELIST, MyGlb.PANEL_FORM, 2);
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPELABELIST, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPELABELIST, -1, "", "IMPELABELIST", 0, 0, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_LIST, 412, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_FORM, 604, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUB.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_NUMEROSUBIMP, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_NUMEROSUBIMP, PPQRY_LIQ36, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_LIST, 452, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_FORM, 672, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUB.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNOSUBIMP, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNOSUBIMP, PPQRY_LIQ36, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_LIST, 492, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_LIST, 96);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_FORM, 560, 32, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_FORM, 96);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Inf. Sub Imp.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_INFOSUBIMPEG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_INFOSUBIMPEG, PPQRY_INFOAPRI, "DECODE(~~ANNO_SUBIMP~~, to_number(NULL), NULL, DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I'))", "INFOSUBIMPEG", 5, 99, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.PANEL_LIST, 412, 4, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.PANEL_LIST, 0);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.PANEL_LIST, 2);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.PANEL_FORM, 104, 16, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.PANEL_FORM, 0);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_SUBIMPLABLIS, MyGlb.PANEL_FORM, 2);
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_SUBIMPLABLIS, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_SUBIMPLABLIS, -1, "", "SUBIMPLABLIS", 0, 0, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_LIST, 512, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_FORM, 32, 8, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPORTO, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPORTO, PPQRY_LIQ36, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_LIST, 616, 40, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 588, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPORTOIVA, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPORTOIVA, PPQRY_LIQ36, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_LIST, 700, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_LIST, 116);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_LIST, "Importo Da Pagare");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_FORM, 4, 564, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_FORM, 116);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORDAPAGAR, MyGlb.PANEL_FORM, "Importo Da Pagare");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPORDAPAGAR, -1, -1);
    PAN_LIQUPARZDIST.SetFieldUnbound(PFL_LIQUPARZDIST_IMPORDAPAGAR, true);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPORDAPAGAR, PPQRY_LIQ36, "to_number(NULL)", "IMPORDAPAGAR", 2, 19, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_LIST, 804, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_LIST, 140);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_LIST, "Importo IVA Da Pagare");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_FORM, 4, 612, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_FORM, 140);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVADAPAG, MyGlb.PANEL_FORM, "Importo IVA Da Pagare");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPOIVADAPAG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldUnbound(PFL_LIQUPARZDIST_IMPOIVADAPAG, true);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPOIVADAPAG, PPQRY_LIQ36, "to_number(NULL)", "IMPOIVADAPAG", 2, 19, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_LIST, 908, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_LIST, 108);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_LIST, "di cui IVA Ist.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_FORM, 4, 708, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_FORM, 108);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPORTIVAIST, MyGlb.PANEL_FORM, "di cui IVA Ist.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPORTIVAIST, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPORTIVAIST, PPQRY_LIQ36, "A.IMPORTO_IVA_IST", "IMPORTO_IVA_IST", 3, 14, 2, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_LIST, 1012, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_LIST, 156);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_LIST, "di cui  IVA Ist. da Pagare");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_FORM, 4, 684, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_FORM, 156);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPOIVAIPAGA, MyGlb.PANEL_FORM, "di cui  IVA Ist. da Pagare");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPOIVAIPAGA, -1, -1);
    PAN_LIQUPARZDIST.SetFieldUnbound(PFL_LIQUPARZDIST_IMPOIVAIPAGA, true);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPOIVAIPAGA, PPQRY_LIQ36, "to_number(NULL)", "IMPOIVAIPAGA", 2, 19, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_LIST, 372, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_LIST, 80);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_LIST, "Cod. Ben.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_FORM, 244, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CODICEBENEFI, MyGlb.PANEL_FORM, "Cod. Ben.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_CODICEBENEFI, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_CODICEBENEFI, PPQRY_LIQ36, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_LIST, 1116, 40, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_LIST, 124);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_FORM, 20, 56, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_BENEFICIARIO, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_BENEFICIARIO, PPQRY_BEN, "A.RAGIONE_SOCIALE", "BENRAGIOSOCI", 5, 40, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_LIST, 1240, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_LIST, 88);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_LIST, " ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_FORM, 236, 56, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_FORM, 88);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFOBENEFICI, MyGlb.PANEL_FORM, " ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_INFOBENEFICI, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_INFOBENEFICI, PPQRY_INFOAPRI, "DECODE(~~BENEFICIARIO~~, to_number(NULL), NULL, 'I')", "INFOBENEFICI", 5, 99, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFOBENEFICI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_LIST, 1260, 40, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_LIST, "Documento");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_FORM, 420, 80, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODOC, MyGlb.PANEL_FORM, "Docum.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_NUMERODOC, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_NUMERODOC, PPQRY_LIQ36, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_LIST, 1356, 40, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_LIST, 92);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_LIST, " ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_FORM, 568, 80, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_FORM, 92);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC1, MyGlb.PANEL_FORM, " ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNODOC1, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNODOC1, PPQRY_FAT, "A.D_DATA_DOC", "FATDDATADOC", 6, 10, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_LIST, 1304, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_LIST, "ANN. DIST.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODISTINTA, MyGlb.PANEL_FORM, "ANN. DIST.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNODISTINTA, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNODISTINTA, PPQRY_LIQ36, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_LIST, 1304, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_LIST, "NUM. DIST.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_NUMERODISTIN, MyGlb.PANEL_FORM, "NUM. DST.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_NUMERODISTIN, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_NUMERODISTIN, PPQRY_LIQ36, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_LIST, 1304, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_LIST, "TP. DIST.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_TIPODISTINTA, MyGlb.PANEL_FORM, "TP. DIST.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_TIPODISTINTA, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_TIPODISTINTA, PPQRY_LIQ36, "A.TIPO_DISTINTA", "TIPO_DISTINTA", 5, 1, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_LIST, 1304, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_FORM, 124, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNOMAND, MyGlb.PANEL_FORM, "ANN. MND.");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNOMAND, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNOMAND, PPQRY_LIQ36, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_LIST, 1304, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_FORM, 244, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_ANNODOC, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_ANNODOC, PPQRY_LIQ36, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_LIST, 1344, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 1168, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_UTENTEINSERI, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_UTENTEINSERI, PPQRY_LIQ36, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_LIST, 1344, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_FORM, 4, 1192, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_DATAINSERIME, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_DATAINSERIME, PPQRY_LIQ36, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_LIST, 1344, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 1216, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_UTENTULTIAGG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_UTENTULTIAGG, PPQRY_LIQ36, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_LIST, 1344, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 1240, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_DATAULTIMAGG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_DATAULTIMAGG, PPQRY_LIQ36, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_LIST, "CAP TITOLO");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_FORM, 4, 590, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPTITOLO, MyGlb.PANEL_FORM, "CAP TITOLO");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_CAPTITOLO, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_CAPTITOLO, PPQRY_CAP, "A.TITOLO", "CAPTITOLO", 1, 2, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_LIST, 100);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_LIST, "CAP CATEGORIA");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_FORM, 4, 614, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_FORM, 100);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCATEGORIA, MyGlb.PANEL_FORM, "CAP CATEGORIA");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_CAPCATEGORIA, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_CAPCATEGORIA, PPQRY_CAP, "A.CATEGORIA", "CAPCATEGORIA", 1, 2, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_LIST, 128);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_LIST, "CAP COD INTERVENTO");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_FORM, 4, 638, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_FORM, 128);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODINTERV, MyGlb.PANEL_FORM, "CAP COD INTERVENTO");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_CAPCODINTERV, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_CAPCODINTERV, PPQRY_CAP, "A.COD_INTERVENTO", "CAPCODINTERV", 1, 2, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_LIST, 92);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_LIST, "CAP COD TERZI");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_FORM, 4, 662, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_FORM, 92);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_CAPCODTERZI, MyGlb.PANEL_FORM, "CAP COD TERZI");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_CAPCODTERZI, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_CAPCODTERZI, PPQRY_CAP, "A.COD_TERZI", "CAPCODTERZI", 1, 2, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.PANEL_LIST, 20, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.PANEL_FORM, 104, 16, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_LIQUIDALABEL, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_LIST, 1028, 40, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_LIST, 96);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_FORM, 4, 588, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_FORM, 96);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANNO PROG");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_FATANNOPROG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_FATANNOPROG, PPQRY_LIQ36, "A.FAT_ANNO_PROG", "FAT_ANNO_PROG", 1, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_LIST, 1124, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_LIST, 116);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 612, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_FORM, 116);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUMERO PROG");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_FATNUMERPROG, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_FATNUMERPROG, PPQRY_LIQ36, "A.FAT_NUMERO_PROG", "FAT_NUMERO_PROG", 1, 5, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_LIST, 1432, 40, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_LIST, 100);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_LIST, " ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_FORM, 4, 636, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_FORM, 100);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMENT, MyGlb.PANEL_FORM, " ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_INFODOCUMENT, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_INFODOCUMENT, PPQRY_INFOAPRI, "DECODE(~~NUMERO_DOC~~, NULL, NULL, DECODE(~~ANNO_DOC~~, NULL, NULL, 'I'))", "INFODOCUMENT", 5, 99, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMENT, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_LIST, 1452, 40, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_LIST, 112);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_LIST, " ");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_FORM, 4, 660, 620, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_FORM, 112);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_INFODOCUMEN1, MyGlb.PANEL_FORM, " ");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_INFODOCUMEN1, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_INFODOCUMEN1, PPQRY_INFOAPRI, "DECODE(~~NUMERO_DOC~~, NULL, NULL, DECODE(~~ANNO_DOC~~, NULL, NULL, 'F'))", "INFODOCUMEN1", 5, 99, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_INFODOCUMEN1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_LIST, 1244, 40, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_LIST, 140);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_LIST, "TRATTAMENTO_IVA");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_FORM, 4, 636, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_FORM, 140);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATTRATTAIVA, MyGlb.PANEL_FORM, "TRATTAMENTO_IVA");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_FATTRATTAIVA, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_FATTRATTAIVA, PPQRY_FAT, "A.TRATTAMENTO_IVA", "FATTRATTAIVA", 5, 4, 0, -13997);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_FATTRATTAIVA, (new IDVariant("SP")), "Split Payment", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_FATTRATTAIVA, (new IDVariant("RC")), "Reverse Charge", "", "", -1);
    PAN_LIQUPARZDIST.SetValueListItem(PFL_LIQUPARZDIST_FATTRATTAIVA, (new IDVariant()), "Standard", "", "", -1);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_LIST, 144);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_LIST, "Importo Da Pagare OLD");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_FORM, 4, 636, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_FORM, 144);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_IMPODAPAGOLD, MyGlb.PANEL_FORM, "Importo Da Pagare OLD");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_IMPODAPAGOLD, -1, -1);
    PAN_LIQUPARZDIST.SetFieldUnbound(PFL_LIQUPARZDIST_IMPODAPAGOLD, true);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_IMPODAPAGOLD, PPQRY_LIQ36, "to_number(NULL)", "IMPODAPAGOLD", 2, 19, 0, -13997);
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_LIST, 1420, 40, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_LIST, 104);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_LIST, "FAT Attivita DOC");
    PAN_LIQUPARZDIST.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_FORM, 4, 708, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUPARZDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_FORM, 104);
    PAN_LIQUPARZDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUPARZDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUPARZDIST_FATATTIVIDOC, MyGlb.PANEL_FORM, "FAT Attivita DOC");
    PAN_LIQUPARZDIST.SetFieldPage(PFL_LIQUPARZDIST_FATATTIVIDOC, -1, -1);
    PAN_LIQUPARZDIST.SetFieldPanel(PFL_LIQUPARZDIST_FATATTIVIDOC, PPQRY_FAT, "GET_ATTIVITA_DOC(A.ANNO_PROG,A.NUMERO_PROG)", "ATTIVITADOC", 5, 99, 0, -13997);
  }

  private void PAN_LIQUPARZDIST_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUPARZDIST.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~BENEFICIARIO~~) ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_LIQUPARZDIST.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUPARZDIST.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~ANNO_IMP~~, to_number(NULL), NULL, 'I') as INFOIMPEGNO, ");
    SQL.append("  DECODE(~~ANNO_SUBIMP~~, to_number(NULL), NULL, DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I')) as INFOSUBIMPEG, ");
    SQL.append("  DECODE(~~BENEFICIARIO~~, to_number(NULL), NULL, 'I') as INFOBENEFICI, ");
    SQL.append("  DECODE(~~NUMERO_DOC~~, NULL, NULL, DECODE(~~ANNO_DOC~~, NULL, NULL, 'I')) as INFODOCUMENT, ");
    SQL.append("  DECODE(~~NUMERO_DOC~~, NULL, NULL, DECODE(~~ANNO_DOC~~, NULL, NULL, 'F')) as INFODOCUMEN1 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_INFOAPRI, 0, SQL, -1, "");
    PAN_LIQUPARZDIST.SetQueryDB(PPQRY_INFOAPRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUPARZDIST.SetMasterTable(PPQRY_INFOAPRI, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.D_DATA_DOC as FATDDATADOC, ");
    SQL.append("  A.TRATTAMENTO_IVA as FATTRATTAIVA, ");
    SQL.append("  GET_ATTIVITA_DOC(A.ANNO_PROG,A.NUMERO_PROG) as ATTIVITADOC ");
    SQL.append("from ");
    SQL.append("  FAT A ");
    SQL.append("where (A.ANNO_PROG = ~~FAT_ANNO_PROG~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~FAT_NUMERO_PROG~~) ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_FAT, 0, SQL, -1, "");
    PAN_LIQUPARZDIST.SetQueryDB(PPQRY_FAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUPARZDIST.SetMasterTable(PPQRY_FAT, "FAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as CAPTITOLO, ");
    SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
    SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
    SQL.append("  A.COD_TERZI as CAPCODTERZI ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_LIQUPARZDIST.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUPARZDIST.SetMasterTable(PPQRY_CAP, "CAP");
    PAN_LIQUPARZDIST.SetIMDB(IMDB, "PQRY_LIQ36", true);
    PAN_LIQUPARZDIST.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.TIPO_DISTINTA as TIPO_DISTINTA, ");
    SQL.append("  A.LIQ_PARZ as LIQ_PARZ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  to_number(NULL) as IMPORDAPAGAR, ");
    SQL.append("  to_number(NULL) as IMPOIVADAPAG, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  to_number(NULL) as IMPODAPAGOLD, ");
    SQL.append("  to_number(NULL) as IMPOIVAIPAGA, ");
    SQL.append("  A.IMPORTO_IVA_IST as IMPORTO_IVA_IST ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_LIQ36, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_LIQ36, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ANNO_MAND IS NULL)) ");
    SQL.append("and   (A.ANNO_DISTINTA = ~~PQRY_PARAMETRI376.ANNO_DISTINTA~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA = ~~PQRY_PARAMETRI376.NUMERO_DISTINTA~~) ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_LIQ36, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUPARZDIST.SetQuery(PPQRY_LIQ36, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUPARZDIST.SetQuery(PPQRY_LIQ36, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_LIQUPARZDIST.SetQuery(PPQRY_LIQ36, 5, SQL, -1, "");
    PAN_LIQUPARZDIST.SetQueryDB(PPQRY_LIQ36, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUPARZDIST.SetMasterTable(0, "LIQ");
    PAN_LIQUPARZDIST.AddToSortList(PFL_LIQUPARZDIST_ANNOLIQ, true);
    PAN_LIQUPARZDIST.AddToSortList(PFL_LIQUPARZDIST_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUPARZDIST.Status() == 2)
    {
      int oldListQBE = PAN_LIQUPARZDIST.iUseListQBE;
      PAN_LIQUPARZDIST.iUseListQBE = 0;
      PAN_LIQUPARZDIST.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUPARZDIST.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUPARZDIST.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUPARZDIST) PAN_LIQUPARZDIST_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUPARZDIST) PAN_LIQUPARZDIST_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_LIQUPARZDIST) PAN_LIQUPARZDIST_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQUPARZDIST) PAN_LIQUPARZDIST_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUPARZDIST) PAN_LIQUPARZDIST_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_LIQUPARZDIST) PAN_LIQUPARZDIST_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
