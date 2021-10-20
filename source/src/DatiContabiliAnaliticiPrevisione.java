// **********************************************
// Dati Contabili Analitici Previsione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DatiContabiliAnaliticiPrevisione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_DCATABBEVIEW;
  private static int PFL_DATCONFINUSC_ESERCIZIO1 = 0;
  private static int PFL_DATCONFINUSC_MISSIONE = 1;
  private static int PFL_DATCONFINUSC_PROGRAMMA = 2;
  private static int PFL_DATCONFINUSC_APRIMISPROG = 3;
  private static int PFL_DATCONFINUSC_LIVELLO5 = 4;
  private static int PFL_DATCONFINUSC_RESIDUPRESU1 = 5;
  private static int PFL_DATCONFINUSC_PREVISIONE = 6;
  private static int PFL_DATCONFINUSC_STNINICAM2 = 7;
  private static int PFL_DATCONFINUSC_GIAIMPEGNAM1 = 8;
  private static int PFL_DATCONFINUSC_FPVM1 = 9;
  private static int PFL_DATCONFINUSC_STNINICO1 = 10;
  private static int PFL_DATCONFINUSC_STNINICA1 = 11;
  private static int PFL_DATCONFINUSC_GIAIMPEGNATO = 12;
  private static int PFL_DATCONFINUSC_FPV = 13;
  private static int PFL_DATCONFINUSC_STNINICOP3 = 14;
  private static int PFL_DATCONFINUSC_STNINICAP1 = 15;
  private static int PFL_DATCONFINUSC_GIAIMPEGNAP1 = 16;
  private static int PFL_DATCONFINUSC_FPVP1 = 17;
  private static int PFL_DATCONFINUSC_STNINICOP4 = 18;
  private static int PFL_DATCONFINUSC_STNINICAP2 = 19;
  private static int PFL_DATCONFINUSC_GIAIMPEGNAP2 = 20;
  private static int PFL_DATCONFINUSC_FPVP2 = 21;
  private static int PFL_DATCONFINUSC_UTENTEINSER1 = 22;
  private static int PFL_DATCONFINUSC_DATAINSERIM1 = 23;
  private static int PFL_DATCONFINUSC_UTENTULTIAG1 = 24;
  private static int PFL_DATCONFINUSC_DATAULTIMAG1 = 25;
  private static int PFL_DATCONFINUSC_SOMMDIRESPR1 = 26;
  private static int PFL_DATCONFINUSC_SOMMADIPREV1 = 27;
  private static int PFL_DATCONFINUSC_SODISTINCAM2 = 28;
  private static int PFL_DATCONFINUSC_SOMDIGIAIMM1 = 29;
  private static int PFL_DATCONFINUSC_SOMMADIFPVM1 = 30;
  private static int PFL_DATCONFINUSC_SOMDISTNINC1 = 31;
  private static int PFL_DATCONFINUSC_SOMDISTNINC2 = 32;
  private static int PFL_DATCONFINUSC_SOMMDIGIAIMP = 33;
  private static int PFL_DATCONFINUSC_SOMMADIFPV = 34;
  private static int PFL_DATCONFINUSC_SODISTINCOP3 = 35;
  private static int PFL_DATCONFINUSC_SODISTINCAP1 = 36;
  private static int PFL_DATCONFINUSC_SOMDIGIAIMP1 = 37;
  private static int PFL_DATCONFINUSC_SOMMADIFPVP1 = 38;
  private static int PFL_DATCONFINUSC_SODISTINCOP4 = 39;
  private static int PFL_DATCONFINUSC_SODISTINCAP2 = 40;
  private static int PFL_DATCONFINUSC_SOMDIGIAIMP2 = 41;
  private static int PFL_DATCONFINUSC_SOMMADIFPVP2 = 42;

  private static int PPQRY_BDAPDCARSPRE = 0;

  private static int PPQRY_APRI = 1;


  IDPanel PAN_DATCONFINUSC;
  private static int PFL_DATCONFINENT_ESERCIZIO = 0;
  private static int PFL_DATCONFINENT_LIVELLO4 = 1;
  private static int PFL_DATCONFINENT_RESIDUPRESUN = 2;
  private static int PFL_DATCONFINENT_PREVISIONI = 3;
  private static int PFL_DATCONFINENT_STNINICAM1 = 4;
  private static int PFL_DATCONFINENT_STNINICO = 5;
  private static int PFL_DATCONFINENT_STNINICA = 6;
  private static int PFL_DATCONFINENT_STNINICOP1 = 7;
  private static int PFL_DATCONFINENT_STNINICOP2 = 8;
  private static int PFL_DATCONFINENT_UTENTEINSERI = 9;
  private static int PFL_DATCONFINENT_DATAINSERIME = 10;
  private static int PFL_DATCONFINENT_UTENTULTIAGG = 11;
  private static int PFL_DATCONFINENT_DATAULTIMAGG = 12;
  private static int PFL_DATCONFINENT_SOMMDIRESPRE = 13;
  private static int PFL_DATCONFINENT_SOMMADIPREVI = 14;
  private static int PFL_DATCONFINENT_SODISTINCAM1 = 15;
  private static int PFL_DATCONFINENT_SOMDISTNINCO = 16;
  private static int PFL_DATCONFINENT_SOMDISTNINCA = 17;
  private static int PFL_DATCONFINENT_SODISTINCOP1 = 18;
  private static int PFL_DATCONFINENT_SODISTINCOP2 = 19;

  private static int PPQRY_BDAPDCAPREVE = 0;


  IDPanel PAN_DATCONFINENT;
  private static int PFL_PANNELELABOR_ETICGENEXBRL = 0;

  private static int PPQRY_PARAMETRI579 = 0;


  IDPanel PAN_PANNELELABOR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_BDAPDCARSPRE(IMDB);
    Init_PQRY_BDAPDCAPREVE(IMDB);
    Init_PQRY_PARAMETRI579(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_BDAPDCARSPRE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_BDAPDCARSPRE, 25);
    IMDB.set_TblCode(IMDBDef13.PQRY_BDAPDCARSPRE, "PQRY_BDAPDCARSPRE");
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_LIVELLO_4, "LIVELLO_4");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_LIVELLO_4,1,7,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, "MISSIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_RESIDUI_PRESUNTI, "RESIDUI_PRESUNTI");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_RESIDUI_PRESUNTI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA_M1, "STN_INI_CA_M1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_M1, "GIA_IMPEGNATO_M1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV_M1, "FPV_M1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA, "STN_INI_CA");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO, "GIA_IMPEGNATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV, "FPV");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CO_P1, "STN_INI_CO_P1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CO_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA_P1, "STN_INI_CA_P1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_P1, "GIA_IMPEGNATO_P1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV_P1, "FPV_P1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CO_P2, "STN_INI_CO_P2");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CO_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA_P2, "STN_INI_CA_P2");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_STN_INI_CA_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_P2, "GIA_IMPEGNATO_P2");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV_P2, "FPV_P2");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_FPV_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCARSPRE,IMDBDef13.PQSL_BDAPDCARSPRE_DATA_ULTIMO_AGG,8,19,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_BDAPDCARSPRE, 0);
  }

  private static void Init_PQRY_BDAPDCAPREVE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_BDAPDCAPREVE, 13);
    IMDB.set_TblCode(IMDBDef13.PQRY_BDAPDCAPREVE, "PQRY_BDAPDCAPREVE");
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_LIVELLO_4, "LIVELLO_4");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_LIVELLO_4,1,7,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_RESIDUI_PRESUNTI, "RESIDUI_PRESUNTI");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_RESIDUI_PRESUNTI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CA_M1, "STN_INI_CA_M1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CA_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CA, "STN_INI_CA");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CO_P1, "STN_INI_CO_P1");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CO_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CO_P2, "STN_INI_CO_P2");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_STN_INI_CO_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPDCAPREVE,IMDBDef13.PQSL_BDAPDCAPREVE_DATA_ULTIMO_AGG,8,19,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_BDAPDCAPREVE, 0);
  }

  private static void Init_PQRY_PARAMETRI579(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI579, 0);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI579, "PQRY_PARAMETRI579");
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI579, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DatiContabiliAnaliticiPrevisione(MyWebEntryPoint w, IMDBObj imdb)
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
  public DatiContabiliAnaliticiPrevisione()
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
    FormIdx = MyGlb.FRM_DATCONANAPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "669E1B3C-32FD-4083-86DC-EBA1CFFE2F8A";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 964;
    DesignHeight = 450;
    set_Caption(new IDVariant("Dati Contabili Analitici"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 964;
    Frames[1].Height = 424;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.867925;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 964;
    Frames[2].Height = 368;
    Frames[2].Caption = "DCA Tabbed View";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 368;
    TAB_DCATABBEVIEW = new OTabView(this);
    Frames[2].Content = TAB_DCATABBEVIEW;
    TAB_DCATABBEVIEW.iGuid = "494EE238-9279-42AF-BFBD-FAE3B8E528EB";
    TAB_DCATABBEVIEW.SetItemCount(2);
    TAB_DCATABBEVIEW.Placement = 1;
    TAB_DCATABBEVIEW.FrIndex = 2;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Dati Contabili Finanziari - Uscite";
    Frames[3].Parent = this;
    PAN_DATCONFINUSC = new IDPanel(w, this, 3, "PAN_DATCONFINUSC");
    Frames[3].Content = PAN_DATCONFINUSC;
    PAN_DATCONFINUSC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATCONFINUSC.VS = MainFrm.VisualStyleList;
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 964-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3FEA1274-97C7-4341-AC61-F159BBB5707F");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2552, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATCONFINUSC.InitStatus = 2;
    PAN_DATCONFINUSC_Init();
    PAN_DATCONFINUSC_InitFields();
    PAN_DATCONFINUSC_InitQueries();
    TAB_DCATABBEVIEW.SetItem(1, Frames[3], 0, "", "Dati Contabili Finanziari - Uscite", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Dati Contabili Finanziari - Entrate";
    Frames[4].Parent = this;
    PAN_DATCONFINENT = new IDPanel(w, this, 4, "PAN_DATCONFINENT");
    Frames[4].Content = PAN_DATCONFINENT;
    PAN_DATCONFINENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATCONFINENT.VS = MainFrm.VisualStyleList;
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 964-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C8E494E6-320D-4329-804F-55A455FB1E89");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1032, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATCONFINENT.InitStatus = 2;
    PAN_DATCONFINENT_Init();
    PAN_DATCONFINENT_InitFields();
    PAN_DATCONFINENT_InitQueries();
    TAB_DCATABBEVIEW.SetItem(2, Frames[4], 0, "", "Dati Contabili Finanziari - Entrate", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 964;
    Frames[5].Height = 56;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Pannello Elabora";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 56;
    Frames[5].MinHeight = Frames[5].Height;
    Frames[5].MaxHeight = Frames[5].Height;
    PAN_PANNELELABOR = new IDPanel(w, this, 5, "PAN_PANNELELABOR");
    Frames[5].Content = PAN_PANNELELABOR;
    PAN_PANNELELABOR.Lockable = false;
    PAN_PANNELELABOR.iLocked = false;
    PAN_PANNELELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELELABOR.VS = MainFrm.VisualStyleList;
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 964-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3452A0B6-DAC1-4D76-9DAF-462E5C7E7B2A");
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 136, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELELABOR.InitStatus = 2;
    PAN_PANNELELABOR_Init();
    PAN_PANNELELABOR_InitFields();
    PAN_PANNELELABOR_InitQueries();
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
      PAN_DATCONFINUSC.UpdatePanel(MainFrm);
      PAN_DATCONFINENT.UpdatePanel(MainFrm);
      PAN_PANNELELABOR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELMISSPROG && flRis && IdxPanelActived == PAN_DATCONFINUSC.FrIndex)
    {
      if (IdxFieldActived ==PFL_DATCONFINUSC_APRIMISPROG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELMACRLIV4 && flRis && IdxPanelActived == PAN_DATCONFINUSC.FrIndex)
    {
      if (IdxFieldActived ==PFL_DATCONFINUSC_LIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCMALI4SEMIP && flRis && IdxPanelActived == PAN_DATCONFINENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_DATCONFINENT_LIVELLO4) {
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
    return (obj instanceof DatiContabiliAnaliticiPrevisione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DatiContabiliAnaliticiPrevisione.class.getName() : (Glb.ClassWithPackage(DatiContabiliAnaliticiPrevisione.class) ? DatiContabiliAnaliticiPrevisione.class.getName().substring(DatiContabiliAnaliticiPrevisione.class.getPackage().getName().length() + 1) : DatiContabiliAnaliticiPrevisione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Seleziona Miss Prog
  // **********************************************************************
  public int SelezionaMissProg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Miss Prog Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELMISSPROG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "SelezionaMissProg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Livello 4 Spesa
  // **********************************************************************
  public int SelezionaLivello4Spesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Livello 4 Spesa Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARS36, IMDBDef1.FLD_PARS36_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARS36, IMDBDef1.FLD_PARS36_NOMEOGGETTES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARS36, IMDBDef1.FLD_PARS36_NOMOGGMISTIT, 0, IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARS36, IMDBDef1.FLD_PARS36_NOMOGGPROTIP, 0, IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0));
        MainFrm.Show(MyGlb.FRM_SCELMACRLIV4, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "SelezionaLivello4Spesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Livello 4 Entrata
  // **********************************************************************
  public int SelezionaLivello4Entrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Livello 4 Entrata Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS94, IMDBDef1.FLD_PARS94_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS94, IMDBDef1.FLD_PARS94_NOMEOGGETTES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCMALI4SEMIP, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "SelezionaLivello4Entrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imposta Caption
  // **********************************************************************
  public int ImpostaCaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imposta Caption Body
      // Corpo Procedura
      // 
      // 
      // folder uscite
      // 
      {
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_RESIDUPRESU1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_RESIDUPRESU1))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_PREVISIONE, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_PREVISIONE))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICAM2, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICAM2))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNAM1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNAM1))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPVM1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPVM1))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICO1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICO1))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICA1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICA1))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNATO, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNATO))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPV, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPV))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICOP3, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICOP3))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICAP1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICAP1))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNAP1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNAP1))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPVP1, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPVP1))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICOP4, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICOP4))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICAP2, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_STNINICAP2))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNAP2, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_GIAIMPEGNAP2))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_DATCONFINUSC.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPVP2, IDL.Add((new IDVariant(PAN_DATCONFINUSC.Header(Glb.OBJ_FIELD,PFL_DATCONFINUSC_FPVP2))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      }
      // 
      // folder entrate
      // 
      {
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_RESIDUPRESUN, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_RESIDUPRESUN))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_PREVISIONI, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_PREVISIONI))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICAM1, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICAM1))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICO, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICO))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICA, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICA))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICOP1, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICOP1))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_DATCONFINENT.set_Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICOP2, IDL.Add((new IDVariant(PAN_DATCONFINENT.Header(Glb.OBJ_FIELD,PFL_DATCONFINENT_STNINICOP2))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "ImpostaCaption", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_PROGRESSIVO = null;
      v_PROGRESSIVO = (new IDVariant());
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BDAPPREVDATICONTABILIPREV((new IDVariant("PREVDCA")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), MainFrm.PROGRESESSIO, v_PROGRESSIVO, (new IDVariant("SI")));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NOMEFILEXML = null;
        v_NOMEFILEXML = IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATENTCODBDA, 0)), (new IDVariant("PREVDCA"))), (new IDVariant(".xbrl")));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FILE_DATI as WOREXPIDFIDA ");
        SQL.append("from ");
        SQL.append("  WORK_EXPORT_ID A ");
        SQL.append("where (A.PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C4 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C4.EOF()) C4.MoveNext();
        while (!C4.EOF())
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C4.Get("WOREXPIDFIDA"),IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))),v_NOMEFILEXML);
          C4.MoveNext();
        }
        C4.Close();
        if (v_PERCORSO.compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.AddTempFile(v_PERCORSO.stringValue()); 
          MainFrm.set_RedirectTo(IDL.Add((new IDVariant("temp/")), v_NOMEFILEXML));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant("save"))); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "Elabora", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELMISSPROG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0, IDL.ToInteger(IMDB.Value(IMDBDef7.PQRY_VISTATITOLIT, IMDBDef7.PQSL_VISTATITOLIT_VISTATMISSIO, 0)));
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0, IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef7.PQRY_VISTATITOLIT, IMDBDef7.PQSL_VISTATITOLIT_VISTATPROGRA, 0), (new IDVariant(3)), (new IDVariant(2)))));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELMACRLIV4)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_LIVELLO_4, 0, IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC4, IMDBDef7.PQSL_VISTSTRURIC4_VISSTRRICCOD, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCMALI4SEMIP)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_LIVELLO_4, 0, IMDB.Value(IMDBDef8.PQRY_VISTSTRURIC1, IMDBDef8.PQSL_VISTSTRURIC1_VISSTRRICCOD, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "EndModal", _e);
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
      ImpostaCaption();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "Load", _e);
    }
  }

  // **********************************************************************
  // DCA Tabbed View Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_DCATABBEVIEW_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DCA Tabbed View Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DATCONFINUSC.Status()).equals((new IDVariant(3)), true) || new IDVariant(PAN_DATCONFINENT.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Confermare o annulare le modifiche prima di cambia"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DCATabbedViewChangePage", _e);
    }
  }

  // **********************************************************************
  // Dati Contabili Finanziari - Uscite On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DATCONFINUSC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Contabili Finanziari - Uscite On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
      if ((Column.equals((new IDVariant(PFL_DATCONFINUSC_MISSIONE)), true) || Column.equals((new IDVariant(PFL_DATCONFINUSC_PROGRAMMA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_MISSIONE = null;
          v_MISSIONE = IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0)), (new IDVariant(2)), (new IDVariant("0")), true);
          IDVariant v_PROGRAMMA = null;
          v_PROGRAMMA = IDL.Add(IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0)), (new IDVariant(2)), (new IDVariant("0")), true), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0)), (new IDVariant(2)), (new IDVariant("0")), true));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.MISSIONE = " + IDL.CSql(v_MISSIONE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.PROGRAMMA = " + IDL.CSql(v_PROGRAMMA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Missione/Programma non presente in Bilancio"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0, (new IDVariant()));
            return;
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINUSC_LIVELLO5)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_LIVELLO_4, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VISTA_STRUTTURA_RICL A ");
          SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO') ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.LIVELLO = 4) ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
          SQL.append("and   (CONTROLLA_COD_STRUTT_MACRO4(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S',A.CODICE," + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_MISSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_PROGRAMMA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") = 'SI') ");
          SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_LIVELLO_4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Codice Livello IV non esistente o non compatibile con la Missione/Programma."));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef13.PQRY_BDAPDCARSPRE, IMDBDef13.PQSL_BDAPDCARSPRE_LIVELLO_4, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINUSC_RESIDUPRESU1)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SOMMDIRESPR1, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_RESIDUPRESU1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINUSC_PREVISIONE)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SOMMADIPREV1, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_PREVISIONE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINUSC_STNINICO1)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SODISTINCAM2, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_STNINICO1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINUSC_STNINICA1)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SOMDIGIAIMM1, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_STNINICA1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DatiContabiliFinanziari-UsciteOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Dati Contabili Finanziari - Uscite After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_DATCONFINUSC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Contabili Finanziari - Uscite After Find Body
      // Corpo Procedura
      // 
      PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SOMMDIRESPR1, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_RESIDUPRESU1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SOMMADIPREV1, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_PREVISIONE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SODISTINCAM2, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_STNINICO1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_DATCONFINUSC.set_FieldText(PFL_DATCONFINUSC_SOMDIGIAIMM1, IDL.Format(PAN_DATCONFINUSC.GetFieldSum(PFL_DATCONFINUSC_STNINICA1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DatiContabiliFinanziari-UsciteAfterFind", _e);
    }
  }

  // **********************************************************************
  // Dati Contabili Finanziari - Uscite On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DATCONFINUSC_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Contabili Finanziari - Uscite On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_DATCONFINUSC.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DatiContabiliFinanziari-UsciteOnCommand", _e);
    }
  }

  // **********************************************************************
  // Dati Contabili Finanziari - Entrate On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DATCONFINENT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Contabili Finanziari - Entrate On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINENT_LIVELLO4)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_LIVELLO_4, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VISTA_STRUTTURA_RICL A ");
          SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO') ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.LIVELLO = 4) ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
          SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_LIVELLO_4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Codice Livello IV non esistente."));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef13.PQRY_BDAPDCAPREVE, IMDBDef13.PQSL_BDAPDCAPREVE_LIVELLO_4, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINENT_RESIDUPRESUN)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINENT.set_FieldText(PFL_DATCONFINENT_SOMMDIRESPRE, IDL.Format(PAN_DATCONFINENT.GetFieldSum(PFL_DATCONFINENT_RESIDUPRESUN), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINENT_PREVISIONI)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINENT.set_FieldText(PFL_DATCONFINENT_SOMMADIPREVI, IDL.Format(PAN_DATCONFINENT.GetFieldSum(PFL_DATCONFINENT_PREVISIONI), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Column.equals((new IDVariant(PFL_DATCONFINENT_STNINICAM1)), true) && FieldWasModified.booleanValue())
      {
        PAN_DATCONFINENT.set_FieldText(PFL_DATCONFINENT_SODISTINCAM1, IDL.Format(PAN_DATCONFINENT.GetFieldSum(PFL_DATCONFINENT_STNINICAM1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DatiContabiliFinanziari-EntrateOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Dati Contabili Finanziari - Entrate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_DATCONFINENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Contabili Finanziari - Entrate After Find Body
      // Corpo Procedura
      // 
      PAN_DATCONFINENT.set_FieldText(PFL_DATCONFINENT_SOMMDIRESPRE, IDL.Format(PAN_DATCONFINENT.GetFieldSum(PFL_DATCONFINENT_RESIDUPRESUN), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_DATCONFINENT.set_FieldText(PFL_DATCONFINENT_SOMMADIPREVI, IDL.Format(PAN_DATCONFINENT.GetFieldSum(PFL_DATCONFINENT_PREVISIONI), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_DATCONFINENT.set_FieldText(PFL_DATCONFINENT_SODISTINCAM1, IDL.Format(PAN_DATCONFINENT.GetFieldSum(PFL_DATCONFINENT_STNINICAM1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DatiContabiliFinanziari-EntrateAfterFind", _e);
    }
  }

  // **********************************************************************
  // Dati Contabili Finanziari - Entrate On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DATCONFINENT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Contabili Finanziari - Entrate On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_DATCONFINENT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiContabiliAnaliticiPrevisione", "DatiContabiliFinanziari-EntrateOnCommand", _e);
    }
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
  private void TAB_DCATABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_DCATABBEVIEW_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DATCONFINUSC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATCONFINUSC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATCONFINUSC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATCONFINUSC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATCONFINUSC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATCONFINUSC);
    // Stub
  }

  private void PAN_DATCONFINUSC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DATCONFINUSC_APRIMISPROG)
    {
      this.IdxPanelActived = this.PAN_DATCONFINUSC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaMissProg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DATCONFINUSC_LIVELLO5)
    {
      this.IdxPanelActived = this.PAN_DATCONFINUSC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaLivello4Spesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DATCONFINUSC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DATCONFINUSC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DATCONFINUSC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATCONFINUSC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DATCONFINENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATCONFINENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATCONFINENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATCONFINENT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATCONFINENT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATCONFINENT);
    // Stub
  }

  private void PAN_DATCONFINENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DATCONFINENT_LIVELLO4)
    {
      this.IdxPanelActived = this.PAN_DATCONFINENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaLivello4Entrata();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DATCONFINENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DATCONFINENT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DATCONFINENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATCONFINENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PANNELELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELELABOR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELELABOR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELELABOR);
    // Stub
  }

  private void PAN_PANNELELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANNELELABOR_ETICGENEXBRL)
    {
      this.IdxPanelActived = this.PAN_PANNELELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANNELELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DATCONFINUSC_Init()
  {

    PAN_DATCONFINUSC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATCONFINUSC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DATCONFINUSC.SetSize(MyGlb.OBJ_FIELD, 43);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, "5911CE14-CA46-4922-99B9-C9DC6ABEBF31");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, "Esercizio");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, "4F354A53-2EAC-4A78-9D0B-CE8ED9C311A0");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, "Missione");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, "422601E2-A4A0-4D67-9A0D-C1ADC47C0F8A");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, "Programma");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, "04211653-4A80-4AD1-8411-60527BB095F0");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, " ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.VIS_HYPELINKIMMA);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, "C990778D-8A4F-4DA1-9DCC-B0941772CF4E");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, "Livello IV");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, "D222A52B-8310-481F-9438-87BFEACAB5ED");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, "Residui Presunti ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, "2BAF27E2-C9BE-4E73-AD3D-5CDA6FD230E0");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, "Previsioni ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, "6B6E7677-B8C8-4984-95EB-6281B3E58F42");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, "79C7A22D-D5ED-467B-95A4-A1A8192FCB30");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, "Già Impegnato ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, "FAC05618-7413-4F25-829F-84D1D30E43FF");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, "FPV ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, "88DB48D0-6FDE-4AAF-9A4A-6F39756B1A8E");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, "3471D0D6-84DE-4963-9F00-0C2470EAC489");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, "D85382BC-1F5F-4E41-86E8-DB2BCACDA4B6");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, "Già Impegnato ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, "B575494A-94B8-4BB8-83FD-D5474DE1CCCC");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, "FPV ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, "F7C64F14-64B3-416E-9060-306B21E89D24");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, "103F403A-F7B7-4BCB-AC48-915AAA0987A2");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, "FF79B21F-1909-44B1-B7CC-BB7DCDC09B14");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, "Già Impegnato ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, "15D4BFF0-E399-45DF-A2CB-22FF8F3CB85A");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, "FPV ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, "FACB5A44-D391-40EC-9A90-C522B3F912D6");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, "C72869C5-FF57-4709-88E7-6F1830A44335");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, "9B53967A-D09E-4880-BD25-51A6F035AC7E");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, "Già Impegnato ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, "8B7DEC28-FF07-4846-9A1D-4A17978442BA");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, "FPV ");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, "8F22CE5F-8150-4BDE-99EA-8DD6AFEF9EC1");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, "99E0D0F6-5C0C-43E1-8C91-96D59831A221");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, "6E4B0C89-0949-4ECF-AE0A-28499EB39999");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, "B2151E71-38EE-4207-9FFD-BC113835A33E");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_DATCONFINUSC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, "0B710FBC-0913-4097-BE4D-1A25CBC6A184");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMDIRESPR1, PFL_DATCONFINUSC_RESIDUPRESU1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, "525324B7-5475-4C5A-A9B4-30EA2B027F1E");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMADIPREV1, PFL_DATCONFINUSC_PREVISIONE);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, "5B8F540A-946A-4D16-BD37-B535E73AADA6");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SODISTINCAM2, PFL_DATCONFINUSC_STNINICAM2);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, "77FCF1F1-D657-4348-A561-59B53EF846EB");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMDIGIAIMM1, PFL_DATCONFINUSC_GIAIMPEGNAM1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, "20C3F305-6326-4D59-8B0D-400955880704");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMADIFPVM1, PFL_DATCONFINUSC_FPVM1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, "EB3B078F-E879-42B6-80AF-4A3C9838407B");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMDISTNINC1, PFL_DATCONFINUSC_STNINICO1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, "C634A4F0-21F5-4166-8847-3401793BF131");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMDISTNINC2, PFL_DATCONFINUSC_STNINICA1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, "FA3615C3-08D0-49E4-B60B-2493F3E9E32D");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMDIGIAIMP, PFL_DATCONFINUSC_GIAIMPEGNATO);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, "4DAFE2B3-3BFB-4F16-953F-769A82C55ECF");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMADIFPV, PFL_DATCONFINUSC_FPV);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, "81551263-FC90-4009-97B6-8B5CDC217F47");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SODISTINCOP3, PFL_DATCONFINUSC_STNINICOP3);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, "BAE99B86-49CE-4EE6-BB8A-8770F91CFCD0");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SODISTINCAP1, PFL_DATCONFINUSC_STNINICAP1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, "21FEBE9E-B6B1-47A7-9039-83E3CF233D63");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMDIGIAIMP1, PFL_DATCONFINUSC_GIAIMPEGNAP1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, "9B62AA5D-99A8-4BEE-943D-45E4A5D8B32E");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMADIFPVP1, PFL_DATCONFINUSC_FPVP1);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, "2FD96A5C-A81A-4394-81A3-248832CA5F86");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SODISTINCOP4, PFL_DATCONFINUSC_STNINICOP4);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, "C07CFA81-F93B-479F-BCF7-2FA4D42BA619");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SODISTINCAP2, PFL_DATCONFINUSC_STNINICAP2);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, "EBBCC985-BBEC-48E7-A3A3-32AA50283625");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMDIGIAIMP2, PFL_DATCONFINUSC_GIAIMPEGNAP2);
    PAN_DATCONFINUSC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, "766763CE-6938-411B-B61B-819615448F24");
    PAN_DATCONFINUSC.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, "");
    PAN_DATCONFINUSC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINUSC.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINUSC.SetSumField(PFL_DATCONFINUSC_SOMMADIFPVP2, PFL_DATCONFINUSC_FPVP2);
  }

  private void PAN_DATCONFINUSC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_LIST, "Esercizio");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_ESERCIZIO1, MyGlb.PANEL_FORM, "Esercizio");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_ESERCIZIO1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_ESERCIZIO1, PPQRY_BDAPDCARSPRE, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_LIST, 64);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_MISSIONE, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_MISSIONE, PPQRY_BDAPDCARSPRE, "A.MISSIONE", "MISSIONE", 1, 3, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_LIST, 60, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_PROGRAMMA, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_PROGRAMMA, PPQRY_BDAPDCARSPRE, "A.PROGRAMMA", "PROGRAMMA", 1, 3, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_LIST, 136, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_LIST, " ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_FORM, 4, 196, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_APRIMISPROG, MyGlb.PANEL_FORM, " ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_APRIMISPROG, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_APRIMISPROG, PPQRY_APRI, "'A'", "APRIMISPROG", 5, 1, 0, -13997);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DATCONFINUSC.SetValueListItem(PFL_DATCONFINUSC_APRIMISPROG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_LIST, 160, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_LIST, 64);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_LIST, "Livello IV");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_FORM, 4, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_LIVELLO5, MyGlb.PANEL_FORM, "Livello IV");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_LIVELLO5, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_LIVELLO5, PPQRY_BDAPDCARSPRE, "A.LIVELLO_4", "LIVELLO_4", 1, 7, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_LIVELLO5, 2);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_LIST, 240, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_LIST, 124);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_LIST, "Residui Presunti ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_FORM, 4, 100, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_RESIDUPRESU1, MyGlb.PANEL_FORM, "Residui Presunti ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_RESIDUPRESU1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_RESIDUPRESU1, PPQRY_BDAPDCARSPRE, "A.RESIDUI_PRESUNTI", "RESIDUI_PRESUNTI", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_LIST, 376, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_LIST, 136);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_LIST, "Previsioni ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_FORM, 4, 124, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_PREVISIONE, MyGlb.PANEL_FORM, "Previsioni ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_PREVISIONE, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_PREVISIONE, PPQRY_BDAPDCARSPRE, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_LIST, 512, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_LIST, 88);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_LIST, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_FORM, 88);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAM2, MyGlb.PANEL_FORM, "Stanziam. Cas.");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICAM2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICAM2, PPQRY_BDAPDCARSPRE, "A.STN_INI_CA_M1", "STN_INI_CA_M1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_LIST, 648, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_LIST, 120);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_LIST, "Già Impegnato ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_FORM, 4, 244, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_FORM, 120);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAM1, MyGlb.PANEL_FORM, "Già Impegnato ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_GIAIMPEGNAM1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_GIAIMPEGNAM1, PPQRY_BDAPDCARSPRE, "A.GIA_IMPEGNATO_M1", "GIA_IMPEGNATO_M1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_LIST, 784, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_LIST, 48);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_LIST, "FPV ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_FORM, 4, 268, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_FORM, 48);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVM1, MyGlb.PANEL_FORM, "FPV ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_FPVM1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_FPVM1, PPQRY_BDAPDCARSPRE, "A.FPV_M1", "FPV_M1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_LIST, 920, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_LIST, 100);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_LIST, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_FORM, 4, 148, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICO1, MyGlb.PANEL_FORM, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICO1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICO1, PPQRY_BDAPDCARSPRE, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_LIST, 1056, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_LIST, 144);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_LIST, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_FORM, 4, 172, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICA1, MyGlb.PANEL_FORM, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICA1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICA1, PPQRY_BDAPDCARSPRE, "A.STN_INI_CA", "STN_INI_CA", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1192, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_LIST, 100);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Già Impegnato ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_FORM, 4, 292, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_FORM, 100);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Già Impegnato ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_GIAIMPEGNATO, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_GIAIMPEGNATO, PPQRY_BDAPDCARSPRE, "A.GIA_IMPEGNATO", "GIA_IMPEGNATO", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_LIST, 1328, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_LIST, 28);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_LIST, "FPV ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_FORM, 28);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPV, MyGlb.PANEL_FORM, "FPV ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_FPV, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_FPV, PPQRY_BDAPDCARSPRE, "A.FPV", "FPV", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_LIST, 1464, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_LIST, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_FORM, 4, 340, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP3, MyGlb.PANEL_FORM, "Stanz. Comp.");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICOP3, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICOP3, PPQRY_BDAPDCARSPRE, "A.STN_INI_CO_P1", "STN_INI_CO_P1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_LIST, 1600, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_LIST, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_FORM, 4, 364, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP1, MyGlb.PANEL_FORM, "Stanz. Cas.");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICAP1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICAP1, PPQRY_BDAPDCARSPRE, "A.STN_INI_CA_P1", "STN_INI_CA_P1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_LIST, 1736, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_LIST, 116);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_LIST, "Già Impegnato ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_FORM, 4, 388, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_FORM, 116);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP1, MyGlb.PANEL_FORM, "Già Impegnato ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_GIAIMPEGNAP1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_GIAIMPEGNAP1, PPQRY_BDAPDCARSPRE, "A.GIA_IMPEGNATO_P1", "GIA_IMPEGNATO_P1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_LIST, 1872, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_LIST, 48);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_LIST, "FPV ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_FORM, 4, 412, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_FORM, 48);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP1, MyGlb.PANEL_FORM, "FPV ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_FPVP1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_FPVP1, PPQRY_BDAPDCARSPRE, "A.FPV_P1", "FPV_P1", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_LIST, 2008, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_LIST, "Stanziamento Competenza ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_FORM, 4, 436, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICOP4, MyGlb.PANEL_FORM, "Stanz. Comp.");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICOP4, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICOP4, PPQRY_BDAPDCARSPRE, "A.STN_INI_CO_P2", "STN_INI_CO_P2", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_LIST, 2144, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_LIST, "Stanziamento Cassa ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_FORM, 4, 460, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_STNINICAP2, MyGlb.PANEL_FORM, "Stanz. Cas.");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_STNINICAP2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_STNINICAP2, PPQRY_BDAPDCARSPRE, "A.STN_INI_CA_P2", "STN_INI_CA_P2", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_LIST, 2280, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_LIST, 116);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_LIST, "Già Impegnato ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_FORM, 4, 484, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_FORM, 116);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_GIAIMPEGNAP2, MyGlb.PANEL_FORM, "Già Impegnato ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_GIAIMPEGNAP2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_GIAIMPEGNAP2, PPQRY_BDAPDCARSPRE, "A.GIA_IMPEGNATO_P2", "GIA_IMPEGNATO_P2", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_LIST, 2416, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_LIST, 48);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_LIST, "FPV ");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_FORM, 4, 508, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_FORM, 48);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_FPVP2, MyGlb.PANEL_FORM, "FPV ");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_FPVP2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_FPVP2, PPQRY_BDAPDCARSPRE, "A.FPV_P2", "FPV_P2", 3, 14, 2, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_LIST, 628, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_LIST, 128);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 196, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTEINSER1, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_UTENTEINSER1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_UTENTEINSER1, PPQRY_BDAPDCARSPRE, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_LIST, 692, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_LIST, 120);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 220, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAINSERIM1, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_DATAINSERIM1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_DATAINSERIM1, PPQRY_BDAPDCARSPRE, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_LIST, 780, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_LIST, 124);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_UTENTULTIAG1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_UTENTULTIAG1, PPQRY_BDAPDCARSPRE, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_LIST, 852, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_LIST, 116);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 268, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_DATAULTIMAG1, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_DATAULTIMAG1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_DATAULTIMAG1, PPQRY_BDAPDCARSPRE, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.PANEL_LIST, 240, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.PANEL_FORM, 356, 248, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIRESPR1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMDIRESPR1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMDIRESPR1, -1, "", "SOMMDIRESPR1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMDIRESPR1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.PANEL_LIST, 376, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.PANEL_FORM, 364, 256, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIPREV1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMADIPREV1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMADIPREV1, -1, "", "SOMMADIPREV1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMADIPREV1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.PANEL_LIST, 512, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.PANEL_FORM, 372, 264, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SODISTINCAM2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SODISTINCAM2, -1, "", "SODISTINCAM2", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SODISTINCAM2, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.PANEL_LIST, 648, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.PANEL_FORM, 380, 272, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMDIGIAIMM1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMDIGIAIMM1, -1, "", "SOMDIGIAIMM1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMDIGIAIMM1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.PANEL_LIST, 784, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.PANEL_FORM, 388, 280, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMADIFPVM1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMADIFPVM1, -1, "", "SOMMADIFPVM1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMADIFPVM1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.PANEL_LIST, 920, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.PANEL_FORM, 396, 288, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMDISTNINC1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMDISTNINC1, -1, "", "SOMDISTNINC1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMDISTNINC1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.PANEL_LIST, 1056, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.PANEL_FORM, 404, 296, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDISTNINC2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMDISTNINC2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMDISTNINC2, -1, "", "SOMDISTNINC2", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMDISTNINC2, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.PANEL_LIST, 1192, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.PANEL_FORM, 412, 304, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMDIGIAIMP, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMDIGIAIMP, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMDIGIAIMP, -1, "", "SOMMDIGIAIMP", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMDIGIAIMP, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.PANEL_LIST, 1328, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.PANEL_FORM, 420, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPV, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMADIFPV, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMADIFPV, -1, "", "SOMMADIFPV", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMADIFPV, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.PANEL_LIST, 1464, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.PANEL_FORM, 404, 296, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP3, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SODISTINCOP3, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SODISTINCOP3, -1, "", "SODISTINCOP3", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SODISTINCOP3, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.PANEL_LIST, 1600, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.PANEL_FORM, 412, 304, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SODISTINCAP1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SODISTINCAP1, -1, "", "SODISTINCAP1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SODISTINCAP1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.PANEL_LIST, 1736, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.PANEL_FORM, 420, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMDIGIAIMP1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMDIGIAIMP1, -1, "", "SOMDIGIAIMP1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMDIGIAIMP1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.PANEL_LIST, 1872, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.PANEL_FORM, 428, 320, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMADIFPVP1, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMADIFPVP1, -1, "", "SOMMADIFPVP1", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMADIFPVP1, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.PANEL_LIST, 2008, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.PANEL_FORM, 412, 304, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCOP4, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SODISTINCOP4, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SODISTINCOP4, -1, "", "SODISTINCOP4", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SODISTINCOP4, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.PANEL_LIST, 2144, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.PANEL_FORM, 420, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SODISTINCAP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SODISTINCAP2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SODISTINCAP2, -1, "", "SODISTINCAP2", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SODISTINCAP2, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.PANEL_LIST, 2280, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.PANEL_FORM, 428, 320, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMDIGIAIMP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMDIGIAIMP2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMDIGIAIMP2, -1, "", "SOMDIGIAIMP2", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMDIGIAIMP2, 4);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.PANEL_LIST, 2416, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINUSC.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.PANEL_FORM, 436, 328, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINUSC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINUSC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINUSC_SOMMADIFPVP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINUSC.SetFieldPage(PFL_DATCONFINUSC_SOMMADIFPVP2, -1, -1);
    PAN_DATCONFINUSC.SetFieldPanel(PFL_DATCONFINUSC_SOMMADIFPVP2, -1, "", "SOMMADIFPVP2", 0, 0, 0, -13997);
    PAN_DATCONFINUSC.set_Alignment(PFL_DATCONFINUSC_SOMMADIFPVP2, 4);
  }

  private void PAN_DATCONFINUSC_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATCONFINUSC.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as APRIMISPROG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where ((NOT (~~ESERCIZIO~~) IS NULL)) ");
    PAN_DATCONFINUSC.SetQuery(PPQRY_APRI, 0, SQL, -1, "");
    PAN_DATCONFINUSC.SetQueryDB(PPQRY_APRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATCONFINUSC.SetMasterTable(PPQRY_APRI, "DUAL");
    PAN_DATCONFINUSC.SetIMDB(IMDB, "PQRY_BDAPDCARSPRE", true);
    PAN_DATCONFINUSC.set_SetString(MyGlb.MASTER_ROWNAME, "BDAP DCAREND S PREV");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.LIVELLO_4 as LIVELLO_4, ");
    SQL.append("  A.MISSIONE as MISSIONE, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.RESIDUI_PRESUNTI as RESIDUI_PRESUNTI, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.STN_INI_CA_M1 as STN_INI_CA_M1, ");
    SQL.append("  A.GIA_IMPEGNATO_M1 as GIA_IMPEGNATO_M1, ");
    SQL.append("  A.FPV_M1 as FPV_M1, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.STN_INI_CA as STN_INI_CA, ");
    SQL.append("  A.GIA_IMPEGNATO as GIA_IMPEGNATO, ");
    SQL.append("  A.FPV as FPV, ");
    SQL.append("  A.STN_INI_CO_P1 as STN_INI_CO_P1, ");
    SQL.append("  A.STN_INI_CA_P1 as STN_INI_CA_P1, ");
    SQL.append("  A.GIA_IMPEGNATO_P1 as GIA_IMPEGNATO_P1, ");
    SQL.append("  A.FPV_P1 as FPV_P1, ");
    SQL.append("  A.STN_INI_CO_P2 as STN_INI_CO_P2, ");
    SQL.append("  A.STN_INI_CA_P2 as STN_INI_CA_P2, ");
    SQL.append("  A.GIA_IMPEGNATO_P2 as GIA_IMPEGNATO_P2, ");
    SQL.append("  A.FPV_P2 as FPV_P2, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_DATCONFINUSC.SetQuery(PPQRY_BDAPDCARSPRE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BDAP_DCAPREV_S A ");
    PAN_DATCONFINUSC.SetQuery(PPQRY_BDAPDCARSPRE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DATCONFINUSC.SetQuery(PPQRY_BDAPDCARSPRE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCONFINUSC.SetQuery(PPQRY_BDAPDCARSPRE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCONFINUSC.SetQuery(PPQRY_BDAPDCARSPRE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.MISSIONE, ");
    SQL.append("  A.PROGRAMMA, ");
    SQL.append("  A.LIVELLO_4 ");
    PAN_DATCONFINUSC.SetQuery(PPQRY_BDAPDCARSPRE, 5, SQL, -1, "");
    PAN_DATCONFINUSC.SetQueryDB(PPQRY_BDAPDCARSPRE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATCONFINUSC.SetMasterTable(0, "BDAP_DCAPREV_S");
    PAN_DATCONFINUSC.AddToSortList(PFL_DATCONFINUSC_MISSIONE, true);
    PAN_DATCONFINUSC.AddToSortList(PFL_DATCONFINUSC_PROGRAMMA, true);
    PAN_DATCONFINUSC.AddToSortList(PFL_DATCONFINUSC_LIVELLO5, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATCONFINUSC.Status() == 2)
    {
      int oldListQBE = PAN_DATCONFINUSC.iUseListQBE;
      PAN_DATCONFINUSC.iUseListQBE = 0;
      PAN_DATCONFINUSC.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATCONFINUSC.PanelCommand(Glb.PCM_FIND);
      PAN_DATCONFINUSC.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DATCONFINENT_Init()
  {

    PAN_DATCONFINENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATCONFINENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DATCONFINENT.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, "9FDF15E0-5F3E-4CFE-916F-5DF6226C78C1");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, "Esercizio");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, "2341189D-B53C-4D66-9F91-D829B8F51D0F");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, "Livello IV");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, "3519D321-78A0-4F8C-9E02-7A953C453BE2");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, "Residui Presunti");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, "92E46DF5-923C-4D23-AAEB-8D7BDC7C48BE");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, "Previsioni ");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, "E7BA6FCA-BD89-4FD2-991A-6F688FA558CC");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, "Stanziamento Cassa ");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, "363787FD-2BB5-4A3E-B4C3-19AE7ED0CA7B");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, "Stanziamento Competenza ");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, "010AD4C9-F4DD-4A73-AB85-9DB7BA9E2836");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, "Stanziamento Cassa");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, "DA7845B9-5712-40CD-B1A0-E4CD29343368");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, "Stanziamento Competenza ");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, "1D1904B6-372B-4CF6-B82F-BBCE19EA08A0");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, "Stanziamento Competenza ");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, "B9A41B0B-8C8A-4173-A494-C65965B0D580");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, "8CC60C41-5FF8-495B-A950-9561B1653DBE");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, "561913FA-9D0E-4452-A99B-3A1E135CB8C6");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, "073815B8-0519-4955-A79D-8394B26790A1");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DATCONFINENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, "8EB281D7-56D2-4CDD-85D6-893300C21115");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SOMMDIRESPRE, PFL_DATCONFINENT_RESIDUPRESUN);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, "9F5FEFDC-791E-4891-9CAD-7391DD7FF409");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SOMMADIPREVI, PFL_DATCONFINENT_PREVISIONI);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, "7DD85D0B-C7EB-4FF7-8C5E-A2F2910E0FF3");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SODISTINCAM1, PFL_DATCONFINENT_STNINICAM1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, "F251DB6D-AC43-4FBF-9405-5D88975F5F1B");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SOMDISTNINCO, PFL_DATCONFINENT_STNINICO);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, "572742DF-908F-4AAB-BD7E-015BB3671BEB");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SOMDISTNINCA, PFL_DATCONFINENT_STNINICA);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, "CF51FB77-9427-4C4F-8B66-F586922EF41D");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SODISTINCOP1, PFL_DATCONFINENT_STNINICOP1);
    PAN_DATCONFINENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, "F13D64D7-39FF-4B63-B7C0-73F63AB6FEBF");
    PAN_DATCONFINENT.set_Header(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, "");
    PAN_DATCONFINENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCONFINENT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DATCONFINENT.SetSumField(PFL_DATCONFINENT_SODISTINCOP2, PFL_DATCONFINENT_STNINICOP2);
  }

  private void PAN_DATCONFINENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_ESERCIZIO, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_ESERCIZIO, PPQRY_BDAPDCAPREVE, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_LIST, 64);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_LIST, "Livello IV");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_FORM, 4, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_LIVELLO4, MyGlb.PANEL_FORM, "Livello IV");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_LIVELLO4, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_LIVELLO4, PPQRY_BDAPDCAPREVE, "A.LIVELLO_4", "LIVELLO_4", 1, 7, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_LIVELLO4, 2);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_LIST, 80, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_LIST, 136);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_LIST, "Residui Presunti");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_FORM, 4, 124, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_RESIDUPRESUN, MyGlb.PANEL_FORM, "Residui Presunti");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_RESIDUPRESUN, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_RESIDUPRESUN, PPQRY_BDAPDCAPREVE, "A.RESIDUI_PRESUNTI", "RESIDUI_PRESUNTI", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_LIST, 216, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_LIST, 100);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_LIST, "Previsioni ");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_FORM, 4, 148, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_PREVISIONI, MyGlb.PANEL_FORM, "Previsioni ");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_PREVISIONI, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_PREVISIONI, PPQRY_BDAPDCAPREVE, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_LIST, 352, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_LIST, 144);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_LIST, "Stanziamento Cassa ");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_FORM, 4, 172, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICAM1, MyGlb.PANEL_FORM, "Stanziamento Cassa ");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_STNINICAM1, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_STNINICAM1, PPQRY_BDAPDCAPREVE, "A.STN_INI_CA_M1", "STN_INI_CA_M1", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_LIST, 488, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_LIST, 68);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_LIST, "Stanziamento Competenza ");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_FORM, 68);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICO, MyGlb.PANEL_FORM, "Stan. Cmp.");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_STNINICO, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_STNINICO, PPQRY_BDAPDCAPREVE, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_LIST, 624, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_LIST, 68);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_LIST, "Stanziamento Cassa");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_FORM, 68);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICA, MyGlb.PANEL_FORM, "Stanz. Cas.");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_STNINICA, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_STNINICA, PPQRY_BDAPDCAPREVE, "A.STN_INI_CA", "STN_INI_CA", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_LIST, 760, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_LIST, "Stanziamento Competenza ");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_FORM, 4, 244, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP1, MyGlb.PANEL_FORM, "Stanz. Comp.");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_STNINICOP1, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_STNINICOP1, PPQRY_BDAPDCAPREVE, "A.STN_INI_CO_P1", "STN_INI_CO_P1", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_LIST, 896, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_LIST, 84);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_LIST, "Stanziamento Competenza ");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_FORM, 4, 268, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_FORM, 84);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_STNINICOP2, MyGlb.PANEL_FORM, "Stanz. Comp.");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_STNINICOP2, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_STNINICOP2, PPQRY_BDAPDCAPREVE, "A.STN_INI_CO_P2", "STN_INI_CO_P2", 3, 14, 2, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_LIST, 628, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 196, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_UTENTEINSERI, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_UTENTEINSERI, PPQRY_BDAPDCAPREVE, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_LIST, 692, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_DATAINSERIME, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_DATAINSERIME, PPQRY_BDAPDCAPREVE, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 780, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_UTENTULTIAGG, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_UTENTULTIAGG, PPQRY_BDAPDCAPREVE, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 852, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 160);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_DATAULTIMAGG, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_DATAULTIMAGG, PPQRY_BDAPDCAPREVE, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.PANEL_LIST, 80, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.PANEL_FORM, 364, 256, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMDIRESPRE, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SOMMDIRESPRE, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SOMMDIRESPRE, -1, "", "SOMMDIRESPRE", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SOMMDIRESPRE, 4);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.PANEL_LIST, 216, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.PANEL_FORM, 372, 264, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMMADIPREVI, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SOMMADIPREVI, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SOMMADIPREVI, -1, "", "SOMMADIPREVI", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SOMMADIPREVI, 4);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.PANEL_LIST, 352, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.PANEL_FORM, 380, 272, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCAM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SODISTINCAM1, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SODISTINCAM1, -1, "", "SODISTINCAM1", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SODISTINCAM1, 4);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.PANEL_LIST, 488, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.PANEL_FORM, 388, 280, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCO, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SOMDISTNINCO, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SOMDISTNINCO, -1, "", "SOMDISTNINCO", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SOMDISTNINCO, 4);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.PANEL_LIST, 624, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.PANEL_FORM, 396, 288, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SOMDISTNINCA, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SOMDISTNINCA, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SOMDISTNINCA, -1, "", "SOMDISTNINCA", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SOMDISTNINCA, 4);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.PANEL_LIST, 760, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.PANEL_FORM, 404, 296, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP1, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SODISTINCOP1, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SODISTINCOP1, -1, "", "SODISTINCOP1", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SODISTINCOP1, 4);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.PANEL_LIST, 896, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.PANEL_LIST, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCONFINENT.SetRect(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.PANEL_FORM, 412, 304, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCONFINENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.PANEL_FORM, 0);
    PAN_DATCONFINENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCONFINENT_SODISTINCOP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCONFINENT.SetFieldPage(PFL_DATCONFINENT_SODISTINCOP2, -1, -1);
    PAN_DATCONFINENT.SetFieldPanel(PFL_DATCONFINENT_SODISTINCOP2, -1, "", "SODISTINCOP2", 0, 0, 0, -13997);
    PAN_DATCONFINENT.set_Alignment(PFL_DATCONFINENT_SODISTINCOP2, 4);
  }

  private void PAN_DATCONFINENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATCONFINENT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATCONFINENT.SetIMDB(IMDB, "PQRY_BDAPDCAPREVE", true);
    PAN_DATCONFINENT.set_SetString(MyGlb.MASTER_ROWNAME, "BDAP DCAPREV E");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.LIVELLO_4 as LIVELLO_4, ");
    SQL.append("  A.RESIDUI_PRESUNTI as RESIDUI_PRESUNTI, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.STN_INI_CA_M1 as STN_INI_CA_M1, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.STN_INI_CA as STN_INI_CA, ");
    SQL.append("  A.STN_INI_CO_P1 as STN_INI_CO_P1, ");
    SQL.append("  A.STN_INI_CO_P2 as STN_INI_CO_P2, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_DATCONFINENT.SetQuery(PPQRY_BDAPDCAPREVE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BDAP_DCAPREV_E A ");
    PAN_DATCONFINENT.SetQuery(PPQRY_BDAPDCAPREVE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DATCONFINENT.SetQuery(PPQRY_BDAPDCAPREVE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCONFINENT.SetQuery(PPQRY_BDAPDCAPREVE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCONFINENT.SetQuery(PPQRY_BDAPDCAPREVE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.LIVELLO_4 ");
    PAN_DATCONFINENT.SetQuery(PPQRY_BDAPDCAPREVE, 5, SQL, -1, "");
    PAN_DATCONFINENT.SetQueryDB(PPQRY_BDAPDCAPREVE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATCONFINENT.SetMasterTable(0, "BDAP_DCAPREV_E");
    PAN_DATCONFINENT.AddToSortList(PFL_DATCONFINENT_LIVELLO4, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATCONFINENT.Status() == 2)
    {
      int oldListQBE = PAN_DATCONFINENT.iUseListQBE;
      PAN_DATCONFINENT.iUseListQBE = 0;
      PAN_DATCONFINENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATCONFINENT.PanelCommand(Glb.PCM_FIND);
      PAN_DATCONFINENT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PANNELELABOR_Init()
  {

    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, "1C7881DF-7E05-4D59-B9FD-8E942CE3F826");
    PAN_PANNELELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, "Genera XBRL");
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, 0, "button1.gif", false);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PANNELELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.PANEL_LIST, 688, 264, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.PANEL_LIST, 0);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.PANEL_LIST, 1);
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.PANEL_FORM, 724, 12, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.PANEL_FORM, 0);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICGENEXBRL, MyGlb.PANEL_FORM, 1);
    PAN_PANNELELABOR.SetFieldPage(PFL_PANNELELABOR_ETICGENEXBRL, -1, -1);
    PAN_PANNELELABOR.SetFieldPanel(PFL_PANNELELABOR_ETICGENEXBRL, -1, "", "ETICGENEXBRL", 0, 0, 0, -13997);
  }

  private void PAN_PANNELELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELELABOR.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELELABOR.Status() == 2)
    {
      int oldListQBE = PAN_PANNELELABOR.iUseListQBE;
      PAN_PANNELELABOR.iUseListQBE = 0;
      PAN_PANNELELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELELABOR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_ValidateRow(Cancel);
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_ValidateRow(Cancel);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_DynamicProperties();
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_DynamicProperties();
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_AfterFind(CmdFind);
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DATCONFINUSC) PAN_DATCONFINUSC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DATCONFINENT) PAN_DATCONFINENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_DCATABBEVIEW) TAB_DCATABBEVIEW_Click(PreviousPage, Cancel);
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
