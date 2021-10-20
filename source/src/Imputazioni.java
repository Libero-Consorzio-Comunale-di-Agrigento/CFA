// **********************************************
// Imputazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Imputazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_IMPUTAZIONI_CAPITOLO = 0;
  private static int GRP_IMPUTAZIONI_INSERIMENTO = 1;
  private static int GRP_IMPUTAZIONI_AGGIORNAMENT = 2;

  private static int PFL_IMPUTAZIONI_CAPITOLO1 = 0;
  private static int PFL_IMPUTAZIONI_ARTICOLO1 = 1;
  private static int PFL_IMPUTAZIONI_INFOPEG = 2;
  private static int PFL_IMPUTAZIONI_APRIVOCEPEG = 3;
  private static int PFL_IMPUTAZIONI_NUMEROIMP = 4;
  private static int PFL_IMPUTAZIONI_ANNOIMP = 5;
  private static int PFL_IMPUTAZIONI_INFOIMPEGNO = 6;
  private static int PFL_IMPUTAZIONI_APRIIMP = 7;
  private static int PFL_IMPUTAZIONI_NUMEROSUBIMP = 8;
  private static int PFL_IMPUTAZIONI_ANNOSUBIMP = 9;
  private static int PFL_IMPUTAZIONI_INFOSUBIMPEG = 10;
  private static int PFL_IMPUTAZIONI_APRISUBIMP = 11;
  private static int PFL_IMPUTAZIONI_NUMEROACC = 12;
  private static int PFL_IMPUTAZIONI_ANNOACC = 13;
  private static int PFL_IMPUTAZIONI_INFOACCERTAM = 14;
  private static int PFL_IMPUTAZIONI_APRIACC = 15;
  private static int PFL_IMPUTAZIONI_IMPORTO = 16;
  private static int PFL_IMPUTAZIONI_IMPORTOIVA = 17;
  private static int PFL_IMPUTAZIONI_IMPORTIVAIST = 18;
  private static int PFL_IMPUTAZIONI_DATAREG = 19;
  private static int PFL_IMPUTAZIONI_LIQTO = 20;
  private static int PFL_IMPUTAZIONI_ANNOPROG = 21;
  private static int PFL_IMPUTAZIONI_NUMEROPROG = 22;
  private static int PFL_IMPUTAZIONI_ES = 23;
  private static int PFL_IMPUTAZIONI_ESERCIZIO = 24;
  private static int PFL_IMPUTAZIONI_CAPITOLO2 = 25;
  private static int PFL_IMPUTAZIONI_IMPEGNO1 = 26;
  private static int PFL_IMPUTAZIONI_SUBIMPEGNO1 = 27;
  private static int PFL_IMPUTAZIONI_ACCERTAMENT1 = 28;
  private static int PFL_IMPUTAZIONI_TOTAIMPUENTR = 29;
  private static int PFL_IMPUTAZIONI_TOTENTRATA = 30;
  private static int PFL_IMPUTAZIONI_ESTREMFATTUR = 31;
  private static int PFL_IMPUTAZIONI_CAPITOLO = 32;
  private static int PFL_IMPUTAZIONI_ARTICOLO = 33;
  private static int PFL_IMPUTAZIONI_IMPEGNO = 34;
  private static int PFL_IMPUTAZIONI_ACCERTAMENTO = 35;
  private static int PFL_IMPUTAZIONI_SUBIMPEGNO = 36;
  private static int PFL_IMPUTAZIONI_TOTAIMPUSPES = 37;
  private static int PFL_IMPUTAZIONI_TOTSPESA = 38;
  private static int PFL_IMPUTAZIONI_UTENTE1 = 39;
  private static int PFL_IMPUTAZIONI_DATA1 = 40;
  private static int PFL_IMPUTAZIONI_UTENTE = 41;
  private static int PFL_IMPUTAZIONI_DATA = 42;
  private static int PFL_IMPUTAZIONI_PROGRESSIVO = 43;
  private static int PFL_IMPUTAZIONI_NUMEROCONTAB = 44;
  private static int PFL_IMPUTAZIONI_DATACONTABIL = 45;
  private static int PFL_IMPUTAZIONI_CONTABILE = 46;
  private static int PFL_IMPUTAZIONI_T04DESC = 47;
  private static int PFL_IMPUTAZIONI_TIPOREGISTRO = 48;
  private static int PFL_IMPUTAZIONI_TIPOBOLLATO = 49;
  private static int PFL_IMPUTAZIONI_T04ATTISBODE = 50;
  private static int PFL_IMPUTAZIONI_TOTIMPORTIVA = 51;
  private static int PFL_IMPUTAZIONI_TOTIMPORIVA1 = 52;

  private static int PPQRY_CFA5 = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_IMP1 = 2;
  private static int PPQRY_ACC = 3;
  private static int PPQRY_SUBIMP = 4;
  private static int PPQRY_DUAL = 5;
  private static int PPQRY_T04 = 6;

  private static int PPQRY_DUAL1 = 7;
  private static int PPQRY_DUAL2 = 8;


  IDPanel PAN_IMPUTAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM14(IMDB);
    //
    //
    Init_PQRY_CFA5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM14, 16);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM14, "TBL_PARAM14");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEFORNI, "ROWNAMEFORNI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEFORNI,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMTOTRET, "ROWNAMTOTRET");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMTOTRET,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEPROPO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEINFO, "ROWNAMEINFO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEINFO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, "ROWNAMCODDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMCODDOC,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC, "ROWNAMNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMANNDOC, "ROWNAMANNDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMANNDOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMDATDOC, "ROWNAMDATDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMDATDOC,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMCODFOR, "ROWNAMCODFOR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMCODFOR,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEQUIET, "ROWNAMEQUIET");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEQUIET,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, "ROWNAMTRAIVA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM14,IMDBDef2.FLD_PARAM14_ROWNAMEATTIV,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM14, 0);
  }

  private static void Init_PQRY_CFA5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CFA5, 30);
    IMDB.set_TblCode(IMDBDef10.PQRY_CFA5, "PQRY_CFA5");
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_FLAG_LIQUIDATO, "FLAG_LIQUIDATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_FLAG_LIQUIDATO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFOIMPEG, "CFAINFOIMPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFOIMPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFSUBIMP, "CFAINFSUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFSUBIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFOACCER, "CFAINFOACCER");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFOACCER,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFOPEG, "CFAINFOPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_CFAINFOPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFA5,IMDBDef10.PQSL_CFA5_TIPO_BOLLATO,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CFA5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Imputazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Imputazioni()
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
    FormIdx = MyGlb.FRM_IMPUTAZIONI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "35BD072F-9100-4500-80B5-4C3D0C7D4303";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1020;
    DesignHeight = 678;
    set_Caption(new IDVariant("Imputazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1020;
    Frames[1].Height = 652;
    Frames[1].Caption = "Imputazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 652;
    PAN_IMPUTAZIONI = new IDPanel(w, this, 1, "PAN_IMPUTAZIONI");
    Frames[1].Content = PAN_IMPUTAZIONI;
    PAN_IMPUTAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPUTAZIONI.VS = MainFrm.VisualStyleList;
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1020-MyGlb.PAN_OFFS_X, 652-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1530D03E-FA8F-4DFA-A86F-80947EFB0103");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 40, 1324, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPUTAZIONI.InitStatus = 2;
    PAN_IMPUTAZIONI_Init();
    PAN_IMPUTAZIONI_InitFields();
    PAN_IMPUTAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_LIQUIDAZIONI+BaseCmdLinIdx)
      {
        ApriLiquidazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ORDINATIVI+BaseCmdLinIdx)
      {
        ApriOrdinativi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVO5+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI18+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI10+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI18+BaseCmdLinIdx), FormIdx, 1);
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
      PAN_IMPUTAZIONI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_IMPUTAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPUTAZIONI_APRIVOCEPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_IMPUTAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPUTAZIONI_APRIIMP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUT && flRis && IdxPanelActived == PAN_IMPUTAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPUTAZIONI_APRISUBIMP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_IMPUTAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPUTAZIONI_APRIACC) {
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
    return (obj instanceof Imputazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Imputazioni.class.getName() : (Glb.ClassWithPackage(Imputazioni.class) ? Imputazioni.class.getName().substring(Imputazioni.class.getPackage().getName().length() + 1) : Imputazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriInfoVociBilancio", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0));
        if (IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        }
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "InfoImpegno", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0));
        if (IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Capitolo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSceltaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("O")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      }
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriSceltaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Impegno
  // **********************************************************************
  public int ApriSceltaImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriSceltaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Sub Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSceltaSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriSceltaSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Accertamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSceltaAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMPROUNI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriSceltaAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazioni
  // **********************************************************************
  public int ApriLiquidazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PROGRESSIVI = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      v_PROGRESSIVI = (new IDVariant("@", IDVariant.STRING));
      // 
      // Apri Liquidazioni Body
      // Procedure Body
      // 
      IDVariant v_SALDOFATTURA = new IDVariant(0,IDVariant.STRING);
      v_SALDOFATTURA = (new IDVariant("Saldo Fattura"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CFA A ");
      SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Non è possibile liquidare il documento: non sono presenti imputazioni contabili.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      else
      {
        if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true))
        {
          return 0;
        }
        // 
        // folder
        // 
        {
          IDVariant v_QUANTIIMPACC = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_QUANTIFLAG = new IDVariant(0,IDVariant.INTEGER);
          C8 = PAN_IMPUTAZIONI.MasterRS();
          if (C8.size()>0) CurPos = C8.getRow(); else CurPos = 0;
          if (!C8.Bof()) PAN_IMPUTAZIONI.GotoFirst();
          while (!PAN_IMPUTAZIONI.RSEOF())
          {
            if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("E")), true))
            {
              if (IDL.IsNull(C8.Get("ANNO_ACC")))
              {
                v_QUANTIIMPACC = IDL.Add(v_QUANTIIMPACC, (new IDVariant(1)));
              }
            }
            else
            {
              if (IDL.IsNull(C8.Get("ANNO_IMP")))
              {
                v_QUANTIIMPACC = IDL.Add(v_QUANTIIMPACC, (new IDVariant(1)));
              }
            }
            if (C8.Get("FLAG_LIQUIDATO").equals((new IDVariant(1)), true))
            {
              v_QUANTIFLAG = IDL.Add(v_QUANTIFLAG, (new IDVariant(1)));
            }
            v_PROGRESSIVI = IDL.Add(IDL.Add(v_PROGRESSIVI, (new IDVariant("@"))), IDL.ToString(C8.Get("PROGRESSIVO")));
            PAN_IMPUTAZIONI.GotoNext();
          }
          if (CurPos>0) C8.absolute(CurPos);
          v_PROGRESSIVI = IDL.Add(v_PROGRESSIVI, (new IDVariant("@")));
          if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("E")), true))
          {
            // if (v_QUANTIIMPACC.compareTo((new IDVariant(0)), true)>0)
            // {
              // MainFrm.set_AlertMessage(v_SMS); 
              // return 0;
            // }
          }
          else
          {
            if (v_QUANTIIMPACC.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Non è possibile liquidare il documento.Sono presenti imputazioni contabili senza imputazione.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_SMS); 
              return 0;
            }
          }
          if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(7)), true))
          {
            if (v_QUANTIFLAG.equals((new IDVariant(PAN_IMPUTAZIONI.GetNumRows())), true))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Non è possibile liquidare il documento.Imputazioni gia liquidate.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_SMS); 
              return 0;
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(6)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
            {
              if (v_QUANTIFLAG.equals((new IDVariant(PAN_IMPUTAZIONI.GetNumRows())), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Non è possibile incassare il documento.Imputazioni gia incassate.", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_SMS); 
                return 0;
              }
            }
          }
        }
      }
      IDVariant v_CODICE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
      v_NUMREC = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINT60CODICE, ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  T60 A ");
      SQL.append("where (A.TIPO = 'F') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICE = QV.Get("MINT60CODICE", IDVariant.INTEGER) ;
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMREC.compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEBOLLO, 0, new IDVariant(v_CODICE));
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEPROGR, 0, new IDVariant(v_PROGRESSIVI));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEDESCR, 0, new IDVariant(v_SALDOFATTURA));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMCODDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMNUMDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMDATDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMDATDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMANNDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMCODFOR, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODFOR, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEQUIET, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEQUIET, 0));
      MainFrm.Show(MyGlb.FRM_LIQUIDAZIONI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriLiquidazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi
  // **********************************************************************
  public int ApriOrdinativi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PROGRESSIVI = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CFA A ");
      SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Non è possibile liquidare il documento: non sono presenti imputazioni contabili.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      else
      {
        if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true))
        {
          return 0;
        }
        // 
        // folder
        // 
        {
          IDVariant v_QUANTIACC = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_QUANTIFLAG = new IDVariant(0,IDVariant.INTEGER);
          C8 = PAN_IMPUTAZIONI.MasterRS();
          if (C8.size()>0) CurPos = C8.getRow(); else CurPos = 0;
          if (!C8.Bof()) PAN_IMPUTAZIONI.GotoFirst();
          while (!PAN_IMPUTAZIONI.RSEOF())
          {
            // if (IDL.IsNull(C8.Get("ANNO_ACC")))
            // {
              // v_QUANTIACC = IDL.Add(v_QUANTIACC, (new IDVariant(1)));
            // }
            if (C8.Get("FLAG_LIQUIDATO").equals((new IDVariant(1)), true))
            {
              v_QUANTIFLAG = IDL.Add(v_QUANTIFLAG, (new IDVariant(1)));
            }
            v_PROGRESSIVI = IDL.Add(IDL.Add(v_PROGRESSIVI, (new IDVariant("@"))), IDL.ToString(C8.Get("PROGRESSIVO")));
            PAN_IMPUTAZIONI.GotoNext();
          }
          if (CurPos>0) C8.absolute(CurPos);
          v_PROGRESSIVI = IDL.Add(v_PROGRESSIVI, (new IDVariant("@")));
          // if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0)) || v_QUANTIACC.compareTo((new IDVariant(0)), true)>0)
          // {
            // MainFrm.set_AlertMessage(v_SMS); 
            // return 0;
          // }
          if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(7)), true))
          {
            if (v_QUANTIFLAG.equals((new IDVariant(PAN_IMPUTAZIONI.GetNumRows())), true))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Non è possibile liquidare il documento.Imputazioni gia liquidate.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_SMS); 
              return 0;
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(6)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
            {
              if (v_QUANTIFLAG.equals((new IDVariant(PAN_IMPUTAZIONI.GetNumRows())), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Non è possibile incassare il documento.Imputazioni gia incassate.", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_SMS); 
                return 0;
              }
            }
          }
        }
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEPROGR, 0, new IDVariant(v_PROGRESSIVI));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDATDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMDATDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNDOC, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODFOR, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODFOR, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUIET, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEQUIET, 0));
      MainFrm.Show(MyGlb.FRM_ORDINATIVI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ApriOrdinativi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DisabilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Campi Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEINFO, 0).equals((new IDVariant("I")), true))
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_IMPUTAZIONI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO5+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_IMPUTAZIONI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO5+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "DisabilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Nuova Imputazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ProponiNuovaImputazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTORETTI = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Proponi Nuova Imputazione Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_E_S, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_PROG, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_PROG, 0, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_D_DATA_REG, 0, IDL.Today());
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0)))
      {
        if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(2)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(7)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(A.IMPORTO) as SUMRETFAIMPO ");
          SQL.append("from ");
          SQL.append("  RETFAT A ");
          SQL.append("where (A.FAT_ANNO_PROG_NAC = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.FAT_NUMERO_PROG_NAC = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTORETTI = QV.Get("SUMRETFAIMPO", IDVariant.DECIMAL) ;
          }
          QV.Close();
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(A.IMPORTO) as SUMRETFAIMPO ");
          SQL.append("from ");
          SQL.append("  RETFAT A ");
          SQL.append("where (A.FAT_ANNO_PROG_FAT = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.FAT_NUMERO_PROG_FAT = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTORETTI = QV.Get("SUMRETFAIMPO", IDVariant.DECIMAL) ;
          }
          QV.Close();
        }
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0, IDL.Sub(IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEIMPOR, 0), IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTOTRET, 0)), PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTO)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ProponiNuovaImputazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inserisci
  // **********************************************************************
  public int Inserisci ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Body
      // Corpo Procedura
      // 
      PAN_IMPUTAZIONI.PanelCommand(Glb.PCM_INSERT);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "Inserisci", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imputazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_IMPUTAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni After Find Event Body
      // Procedure Body
      // 
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTENTRATA, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTO),(new IDVariant(0)))).stringValue());
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTSPESA, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTO),(new IDVariant(0)))).stringValue());
      PAN_IMPUTAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_IMPUTAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTIMPORTIVA, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTOIVA),(new IDVariant(0)))).stringValue());
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTIMPORIVA1, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTIVAIST),(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IMPUTAZIONI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_IMPUTAZIONI, Cancel);
      // 
      // Imputazioni On Validate Row Event Body
      // Procedure Body
      // 
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTENTRATA, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTO),(new IDVariant(0)))).stringValue());
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTSPESA, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTO),(new IDVariant(0)))).stringValue());
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTIMPORTIVA, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTOIVA),(new IDVariant(0)))).stringValue());
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_TOTIMPORIVA1, IDL.ToString(IDL.NullValue(PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTIVAIST),(new IDVariant(0)))).stringValue());
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFOPEG, 0, (new IDVariant("I")));
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0))))
        {
          IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
          v_CAPITOLO = (new IDVariant());
          v_ARTICOLO = (new IDVariant());
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFOIMPEG, 0, (new IDVariant("I")));
          if (!(MainFrm.ImpEseimp(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0), IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0), v_CAPITOLO, v_ARTICOLO)))
          {
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, new IDVariant(new IDVariant(v_CAPITOLO),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
            // IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0, (new IDVariant()));
            // IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0, (new IDVariant()));
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0))))
        {
          IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
          v_CAPITOLO = (new IDVariant());
          v_ARTICOLO = (new IDVariant());
          v_ANNOIMP = (new IDVariant());
          v_NUMEROIMP = (new IDVariant());
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFSUBIMP, 0, (new IDVariant("I")));
          if (!(MainFrm.SubEsesub(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0), v_CAPITOLO, v_ARTICOLO, v_ANNOIMP, v_NUMEROIMP)))
          {
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, new IDVariant(new IDVariant(v_CAPITOLO),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0, new IDVariant(v_ANNOIMP));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0, (new IDVariant()));
          }
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0))))
        {
          IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
          v_CAPITOLO = (new IDVariant());
          v_ARTICOLO = (new IDVariant());
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFOACCER, 0, (new IDVariant("I")));
          if (!(MainFrm.AccEseacc(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0), IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0), v_CAPITOLO, v_ARTICOLO)))
          {
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, new IDVariant(new IDVariant(v_CAPITOLO),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_IMPUTAZIONI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0))))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFOIMPEG, 0, (new IDVariant("I")));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0))))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFSUBIMP, 0, (new IDVariant("I")));
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0))))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CFAINFOACCER, 0, (new IDVariant("I")));
        }
      }
      if (IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IMPUTAZIONI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ESERCIZIO, 0)))
        {
          ProponiNuovaImputazione();
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_UTENTE_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_UTENTE_ULTIMO_AGG, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_DATA_ULTIMO_AGG, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_IMPUTAZIONI_IMPORTO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0))))
        {
          if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("S")), true) && (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0).equals((new IDVariant("SP")), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0).equals((new IDVariant("RC")), true)))
          {
            IDVariant v_VCALCIMPOIVA = new IDVariant(0,IDVariant.DECIMAL);
            v_VCALCIMPOIVA = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  CALCOLA_IMPORTO_IVA(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CIIRNAPRNNPC ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCALCIMPOIVA = QV.Get("CIIRNAPRNNPC", IDVariant.DECIMAL) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0, IDL.NullValue(v_VCALCIMPOIVA,IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0)));
            if (IDL.NullValue(PAN_IMPUTAZIONI.GetLastValue(PFL_IMPUTAZIONI_IMPORTOIVA),(new IDVariant("0"))).compareTo((new IDVariant("0")), true)!=0)
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Attenzione: verificare importo iva"));
              MainFrm.set_AlertMessage(S); 
            }
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_IMPUTAZIONI_TIPOREGISTRO)), true) || Column.equals((new IDVariant(PFL_IMPUTAZIONI_TIPOBOLLATO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_REGISTRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_BOLLATO, 0))))
        {
          if ((new IDVariant(PAN_IMPUTAZIONI.FieldText(PFL_IMPUTAZIONI_T04ATTISBODE))).equals((new IDVariant("SI")), true))
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0))))
            {
              IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0, IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0));
            }
          }
          else
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0))))
            {
              IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0, (new IDVariant()));
            }
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_IMPUTAZIONI_IMPORTIVAIST)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0))))
        {
          if (IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'importo Iva Ist. non può essere maggiore dell'importo"));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0, (new IDVariant()));
            MainFrm.set_AlertMessage(S); 
          }
          if (IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'importo Iva Ist. non può essere maggiore dell'importo IVA"));
            IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_IMPUTAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        PAN_IMPUTAZIONI.UpdatePanel(MainFrm);
        if (PAN_IMPUTAZIONI.GetFieldSum(PFL_IMPUTAZIONI_IMPORTO).compareTo(IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEIMPOR, 0), IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTOTRET, 0)), true)>0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Totale Imputazioni superiore all'importo della Fattura!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        IDVariant v_VFATTOTIMPOR = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO + NVL(A.VARIAZIONI, 0) as FAIMNUVAFAV0 ");
        SQL.append("from ");
        SQL.append("  FAT A ");
        SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFATTOTIMPOR = QV.Get("FAIMNUVAFAV0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        if (!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, 0).equals((new IDVariant("P")), true))
        {
          IDVariant I = null;
          I = (new IDVariant(1));
          for (I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_IMPUTAZIONI.NumRows)), true)<0; I = IDL.Add(I, (new IDVariant(1))))
          {
            IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
            v_IMPORTO = new IDVariant(IDL.ToFloat(PAN_IMPUTAZIONI.GetValueAt(PFL_IMPUTAZIONI_IMPORTO,I.intValue())),IDVariant.DECIMAL);
            if (IDL.NullValue(v_IMPORTO,(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
            {
              IDVariant v_TIPOBOLLADEF = null;
              v_TIPOBOLLADEF = ((IDL.NullValue(PAN_IMPUTAZIONI.GetValueAt(PFL_IMPUTAZIONI_TIPOBOLLATO,I.intValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(PAN_IMPUTAZIONI.GetValueAt(PFL_IMPUTAZIONI_TIPOBOLLATO,I.intValue())):(new IDVariant()));
              if (v_IMPORTO.compareTo(v_VFATTOTIMPOR, true)<0)
              {
                if (IDL.IsNull(v_TIPOBOLLADEF))
                {
                  IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                  v_SMS = (new IDVariant("Tipo Bollato Definitivo obbligatorio per la Fattura promiscua "));
                  MainFrm.set_AlertMessage(IDL.Add(v_SMS, IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC, 0))); 
                  Cancel.set((new IDVariant(-1)));
                  return;
                }
              }
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni On Database Error Event
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
  private void PAN_IMPUTAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMPUTAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Imputazioni On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_IMPUTAZIONI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_IMPUTAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniAfterCommit", _e);
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
    IDVariant v_TESTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPORTORETTI = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      v_TESTO = (new IDVariant("Fattura: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Accertamento", IDVariant.STRING));
        IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);
        v_CAPTION1 = (new IDVariant("Inc.to", IDVariant.STRING));
        IDVariant v_CAPTION2 = new IDVariant(0,IDVariant.STRING);
        v_CAPTION2 = (new IDVariant("Risorsa", IDVariant.STRING));
        PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_IMPEGNO1, new IDVariant(v_CAPTION).stringValue());
        PAN_IMPUTAZIONI.set_Header(Glb.OBJ_FIELD,PFL_IMPUTAZIONI_LIQTO, new IDVariant(v_CAPTION1).stringValue());
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ORDINATIVI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDAZIONI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDAZIONI+BaseCmdLinIdx, ((IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).compareTo((new IDVariant(2)), true)!=0)?(new IDVariant(-1)).booleanValue():(new IDVariant(0)).booleanValue()));
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ORDINATIVI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0).equals((new IDVariant("SP")), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0).equals((new IDVariant("RC")), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, 0, (new IDVariant()));
          PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          IDVariant v_VGETATTIVDOC = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  GET_ATTIVITA_DOC(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GEADRNAPRNNP ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VGETATTIVDOC = QV.Get("GEADRNAPRNNP", IDVariant.STRING) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, 0, new IDVariant(v_VGETATTIVDOC));
          if (v_VGETATTIVDOC.equals((new IDVariant("P")), true))
          {
            PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
        else
        {
          PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_ESTREMFATTUR, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_TESTO, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC, 0))), (new IDVariant(" "))), (new IDVariant("del "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMDATDOC, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEFORNI, 0)).stringValue());
      PAN_IMPUTAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_IMPUTAZIONI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(2)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(7)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(A.IMPORTO) as SUMRETFAIMPO ");
        SQL.append("from ");
        SQL.append("  RETFAT A ");
        SQL.append("where (A.FAT_ANNO_PROG_NAC = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FAT_NUMERO_PROG_NAC = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTORETTI = QV.Get("SUMRETFAIMPO", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(A.IMPORTO) as SUMRETFAIMPO ");
        SQL.append("from ");
        SQL.append("  RETFAT A ");
        SQL.append("where (A.FAT_ANNO_PROG_FAT = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FAT_NUMERO_PROG_FAT = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTORETTI = QV.Get("SUMRETFAIMPO", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTOTRET, 0, new IDVariant(v_IMPORTORETTI));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEPROPO, 0, (new IDVariant("SI")));
      DisabilitaCampi();
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(6)), true) || IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_IMPUTAZIONI.set_FieldText(PFL_IMPUTAZIONI_NUMEROCONTAB, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_TESTO, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMDOC, 0))), (new IDVariant(" "))), (new IDVariant("del "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMDATDOC, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEFORNI, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEFORNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEPROPO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEINFO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPUTAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPUTAZIONI);
      // 
      // Imputazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("S")), true) && IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, 0).equals((new IDVariant("P")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0))))
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if ((new IDVariant(PAN_IMPUTAZIONI.FieldText(PFL_IMPUTAZIONI_T04ATTISBODE))).equals((new IDVariant("SI")), true) || (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_REGISTRO, 0)) || IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_BOLLATO, 0).booleanValue()))
        {
          PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMPUTAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_IMPUTAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_IMPUTAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_IMPUTAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_IMPUTAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Imputazioni Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_IMPUTAZIONI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni Before Insert Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("S")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, 0).equals((new IDVariant("P")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_REGISTRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_BOLLATO, 0)))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0))) && IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0).compareTo(IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEIMPOR, 0), IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTOTRET, 0)), true)<0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("E' obbligatorio indicare il Tipo Bollato Definitivo per la Fattura promiscua che si sta trattando - Capitolo: "));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(S, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0))), (new IDVariant(" "))), (new IDVariant("Impegno"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0))), ((!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))))?IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("SubImpegno")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))):(new IDVariant(""))))); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Imputazioni Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_IMPUTAZIONI_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni Before Update Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEES, 0).equals((new IDVariant("S")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTRAIVA, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEATTIV, 0).equals((new IDVariant("P")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_REGISTRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_TIPO_BOLLATO, 0)))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO_IVA_IST, 0))) && IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_IMPORTO, 0).compareTo(IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMEIMPOR, 0), IMDB.Value(IMDBDef2.TBL_PARAM14, IMDBDef2.FLD_PARAM14_ROWNAMTOTRET, 0)), true)<0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("E' obbligatorio indicare il Tipo Bollato Definitivo per la Fattura promiscua che si sta trattando - Capitolo: "));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(S, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_CAPITOLO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ARTICOLO, 0))), (new IDVariant(" "))), (new IDVariant("Impegno"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_IMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_IMP, 0))), ((!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))))?IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("SubImpegno")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_NUMERO_SUBIMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CFA5, IMDBDef10.PQSL_CFA5_ANNO_SUBIMP, 0))):(new IDVariant(""))))); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Imputazioni", "ImputazioniBeforeUpdate", _e);
    }
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
  private void PAN_IMPUTAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_APRIVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_APRIIMP)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_APRISUBIMP)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPUTAZIONI_APRIACC)
    {
      this.IdxPanelActived = this.PAN_IMPUTAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPUTAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_IMPUTAZIONI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_IMPUTAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPUTAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPUTAZIONI_Init()
  {

    PAN_IMPUTAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPUTAZIONI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, "C97AD4B1-E719-4186-BE34-0893FA3F1E6F");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, "Capitolo");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 36, 339, 504, 73, 0, 0);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 0, 555, 512, 121, 0, 0);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, 0, 46);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, 1, 13);
    PAN_IMPUTAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, 0, 4);
    PAN_IMPUTAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, 1, 4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, "0145BCAE-80CD-44F2-8447-5810B1581BE5");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, "Inserimento");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, MyGlb.PANEL_LIST, 80, 487, 292, 49, 0, 0);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, MyGlb.PANEL_FORM, 0, 759, 224, 73, 0, 0);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, 0, 70);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, 1, 13);
    PAN_IMPUTAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, 0, 4);
    PAN_IMPUTAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, 1, 4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, "AF06BD93-56AD-44D5-9B33-4B0F3B3BC42C");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, "Aggiornamento");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, MyGlb.PANEL_LIST, 460, 487, 292, 49, 0, 0);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 807, 216, 73, 0, 0);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, 0, 88);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, 1, 13);
    PAN_IMPUTAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, 0, 4);
    PAN_IMPUTAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, 1, 4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPUTAZIONI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPUTAZIONI.SetSize(MyGlb.OBJ_FIELD, 53);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, "78625116-74F0-4889-90F7-29016C10FE35");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, "CAPITOLO");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, "7A5E67E6-63C3-4B87-8803-7C3C8F1949B8");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, "ARTICOLO");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, "1E8D4DC1-6360-4906-8683-A7495389336D");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, "Info Peg");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, "If (not (Is Null (CFA CAPITOLO)) and not (Is Null (CFA ARTICOLO)), Info, \"\")");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, "8C969176-FC30-40DE-B1B2-7972F33126B2");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, "Apri Voce Peg");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, "1F1BB979-F49F-491D-87B6-BF5249249E54");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, "NUMERO IMP");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, "FD12E9C8-5D8B-4883-8E6C-25152B862D96");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, "ANNO IMP");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, "9A24E607-C629-4C1E-BEDD-A7A4265797FC");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, "Info Impegno");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, "If (not (Is Null (CFA ANNO IMP)) and not (Is Null (CFA NUMERO IMP)), Info, \"\")");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, "9EA613C7-A430-4958-A5EC-72F427B1186E");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, "Apri Imp");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, "DF7F557C-C337-490E-BE78-C4AFB3A2FC70");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, "E3BD74B9-118D-4730-A179-9D5986513A3F");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, "374B5650-9395-465C-9F49-FDF3E3EC41C4");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, "Info Sub Impegno");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, "If (not (Is Null (CFA ANNO SUBIMP)) and not (Is Null (CFA NUMERO SUBIMP)), Info, \"\")");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, "35735C36-9AF6-4FFE-9D34-D8925E0E477D");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, "Apri Sub Imp");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, "AE8A54D9-5889-492C-A1B7-CF8FA2305344");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, "NUMERO ACC");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, "5F0EDD45-8129-4905-AA4C-50CDD265F07C");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, "ANNO ACC");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, "AEE36FD7-125E-4957-A8F1-EA5B98C8387D");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, "Info Accertamento");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, "\n");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, "03D6BABD-CDF1-4472-B0A6-142A4B7DF6A6");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, "Apri Acc");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, "DCD0DF07-B916-43A9-A47C-299D8632AD95");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, "Importo");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, "6835C024-80FB-4487-9E10-426EE9A638E2");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, "Importo I.V.A.");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, "8F6C4CFE-AA51-4A15-BA04-5D7E63ADD393");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, "di cui IVA Ist.");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, "98F5DEF8-DEB8-473F-9955-BF4F6BC64259");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, "Data Reg.");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, "D7BBB828-B2A4-42CD-8FCA-258F73768EED");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, "Liq.to");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, "F99A6E71-5A28-4C69-A313-0326F7EA8CC2");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, "ANNO PROG");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, 0, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, "E88E55A8-8785-43DB-B9FB-7479245A1D4A");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, "NUMERO PROG");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, 0, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, "12A28DB3-9662-478C-90C4-F8C97065F612");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, "E S");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, 0, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, "28B48A8C-7977-43B8-ABB7-7F9DB3CB8953");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, "ESERCIZIO");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, 0, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, "2DB599D2-CF12-4A78-88B2-430FF5810298");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, "Capitolo");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, "BE879955-8612-4901-B85A-7065EE8F7BA4");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, "Impegno");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, "0D2C45B3-3546-4D01-8F44-C66644D9BA19");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, "Sub-Impegno");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, "05C5DBAD-0162-498C-AE46-CB315757B504");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, "Accertamento");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, "2CFF25B0-BA82-4E9E-872B-859F83B598AC");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, "Totale Imputato:");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.VIS_VUOGRAALILEF);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, "6CD59823-58D2-411B-91E5-D9C4684CDA09");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.VIS_CAMPTOTADISA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, "1B5CF679-B1E6-4CAE-AEAA-600E2F37991F");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.VIS_ETICHEGRASSE);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, "A1F6377A-4637-4F6D-91EE-B28AD89DE971");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, "Capitolo");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, "C76E0B97-D9B8-4860-A964-68D84261C67B");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, "Articolo");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, "14C7720E-2041-43B2-93D6-B24D66884A74");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, "Impegno ");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, "3D935BDD-A65D-451F-90AD-63BB255EA895");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, "Accertamento ");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, "FF22F9A5-9C32-41DF-A512-5E2FFB951776");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, "Subimpegno");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, "2D0FD1B9-B6C1-46A9-A6B9-A46EFF984D7D");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, "Totale Imputato:");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.VIS_VUOGRAALILEF);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, "318325E8-291D-43F8-9550-0C568F8ABBE0");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.VIS_CAMPTOTADISA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, "027140EE-A98A-4F4C-B9FB-22F2DAB7C7C8");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, "Utente");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, "10918F9F-0D71-4A12-B4DD-336DF4A549B8");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, "Data");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, "0D179661-4359-4682-8B54-DF8191CEFF62");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, "Utente ");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, "0DCDF353-E1CD-4CBF-8FAE-4CD3372AA4B2");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, "Data ");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, "F5E4C19E-B2AD-45FE-8FA2-42E324279F7A");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, "F4ECFA8C-0BE0-45B2-BC70-4F0ADD97024F");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, "NUMERO CONTABILE");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, "EDD1B280-9691-4906-AE0F-5514BFE51EDC");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, "DATA CONTABILE");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, "CF7F1E2E-EB98-4D4E-A000-A6103B02328D");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, "Contabile");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, "AB941151-A9CB-49B5-AC2D-F43E2A903FC7");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, "Tipo Bollato Def.");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, "091AA655-0107-4B82-803B-247B6EEA2D8C");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, "A281FD86-B7C5-43F6-97CB-CD193A3069BA");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, "5039E280-7B12-4111-B7A9-7D05ADEFBA3D");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, "T04 Attivita Ist Bollato Def");
    PAN_IMPUTAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, "5B2EE9AD-AECB-4152-A251-A07E6A4B602B");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.VIS_CAMPTOTADISA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, "A0DE5539-E210-4AD1-BB1A-20A2534A4293");
    PAN_IMPUTAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, "");
    PAN_IMPUTAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.VIS_CAMPTOTADISA);
    PAN_IMPUTAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_IMPUTAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 0, 76, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 340, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 72);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_CAPITOLO1, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_CAPITOLO1, PPQRY_CFA5, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, 108, 76, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, "AR.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, 136);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ARTICOLO1, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ARTICOLO1, PPQRY_CFA5, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_LIST, 136, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_LIST, 52);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_LIST, "In. Pg.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_FORM, 4, 484, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_FORM, 52);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOPEG, MyGlb.PANEL_FORM, "Info Peg");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_INFOPEG, -1, -1);
    PAN_IMPUTAZIONI.SetFieldUnbound(PFL_IMPUTAZIONI_INFOPEG, true);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_INFOPEG, PPQRY_CFA5, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) AND NOT ((A.ARTICOLO IS NULL)) THEN 'I' ELSE NULL END", "CFAINFOPEG", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_LIST, 160, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_LIST, 128);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_LIST, "A. V. P.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_FORM, 4, 976, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_FORM, 128);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIVOCEPEG, MyGlb.PANEL_FORM, "Apri Voce Peg");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_APRIVOCEPEG, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_APRIVOCEPEG, PPQRY_DUAL, "'A'", "DUAAPRVOCPEG", 5, 1, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 184, 76, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 332, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 88);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "NUMERO IMP");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_NUMEROIMP, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_NUMEROIMP, PPQRY_CFA5, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 228, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 204, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ANNOIMP, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ANNOIMP, PPQRY_CFA5, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 268, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 244, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_INFOIMPEGNO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldUnbound(PFL_IMPUTAZIONI_INFOIMPEGNO, true);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_INFOIMPEGNO, PPQRY_CFA5, "CASE WHEN NOT ((A.ANNO_IMP IS NULL)) AND NOT ((A.NUMERO_IMP IS NULL)) THEN 'I' ELSE NULL END", "CFAINFOIMPEG", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_LIST, 292, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_LIST, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_LIST, "Ap. I.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_FORM, 4, 880, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_FORM, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIIMP, MyGlb.PANEL_FORM, "Apri Imp");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_APRIIMP, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_APRIIMP, PPQRY_DUAL, "'A'", "DUALAPRIIMP", 5, 1, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 316, 76, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 204, 76, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUB.");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_NUMEROSUBIMP, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_NUMEROSUBIMP, PPQRY_CFA5, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 360, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 136);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANNO SUBIMP");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ANNOSUBIMP, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ANNOSUBIMP, PPQRY_CFA5, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 400, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 96);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 292, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 96);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegno");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_INFOSUBIMPEG, -1, -1);
    PAN_IMPUTAZIONI.SetFieldUnbound(PFL_IMPUTAZIONI_INFOSUBIMPEG, true);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_INFOSUBIMPEG, PPQRY_CFA5, "CASE WHEN NOT ((A.ANNO_SUBIMP IS NULL)) AND NOT ((A.NUMERO_SUBIMP IS NULL)) THEN 'I' ELSE NULL END", "CFAINFSUBIMP", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_LIST, 424, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_LIST, 124);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_LIST, "A. S. I.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_FORM, 4, 928, 556, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_FORM, 124);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRISUBIMP, MyGlb.PANEL_FORM, "Apri Sub Imp");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_APRISUBIMP, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_APRISUBIMP, PPQRY_DUAL, "'A'", "DUAAPRSUBIMP", 5, 1, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRISUBIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 448, 76, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 136);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROACC, MyGlb.PANEL_FORM, "NUMERO ACC");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_NUMEROACC, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_NUMEROACC, PPQRY_CFA5, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_LIST, 492, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_FORM, 332, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_FORM, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ANNOACC, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ANNOACC, PPQRY_CFA5, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, 532, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, 100);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, "I. Ac.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 340, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, 100);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, "Info Accertamento");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_INFOACCERTAM, -1, -1);
    PAN_IMPUTAZIONI.SetFieldUnbound(PFL_IMPUTAZIONI_INFOACCERTAM, true);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_INFOACCERTAM, PPQRY_CFA5, "CASE WHEN NOT ((A.ANNO_ACC IS NULL)) AND NOT ((A.NUMERO_ACC IS NULL)) THEN 'I' ELSE NULL END", "CFAINFOACCER", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_LIST, 556, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_LIST, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_LIST, "Ap. Ac.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_FORM, 12, 1032, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_FORM, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_APRIACC, MyGlb.PANEL_FORM, "Apri Acc");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_APRIACC, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_APRIACC, PPQRY_DUAL, "'A'", "DUALAPRIACC", 5, 1, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_APRIACC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_LIST, 580, 76, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_FORM, 204, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_FORM, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_IMPORTO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_IMPORTO, PPQRY_CFA5, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 668, 76, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo I.V.A.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 1128, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo I V A");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_IMPORTOIVA, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_IMPORTOIVA, PPQRY_CFA5, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, 752, 76, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, 108);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, "di cui IVA Ist.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, 4, 1152, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, 108);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, "di cui IVA Ist.");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_IMPORTIVAIST, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_IMPORTIVAIST, PPQRY_CFA5, "A.IMPORTO_IVA_IST", "IMPORTO_IVA_IST", 3, 14, 2, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_LIST, 836, 76, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_FORM, 4, 124, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_FORM, 136);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_DATAREG, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_DATAREG, PPQRY_CFA5, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_LIST, 916, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_LIST, 92);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_LIST, "Liq.to");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_FORM, 316, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_FORM, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_LIQTO, MyGlb.PANEL_FORM, "Liq.to");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_LIQTO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_LIQTO, PPQRY_CFA5, "A.FLAG_LIQUIDATO", "FLAG_LIQUIDATO", 1, 1, 0, -13997);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_LIQTO, (new IDVariant(1)), "1", "", "", -1);
    PAN_IMPUTAZIONI.SetValueListItem(PFL_IMPUTAZIONI_LIQTO, (new IDVariant()), "Null", "", "", -1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_FORM, 204, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_FORM, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ANNOPROG, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ANNOPROG, PPQRY_CFA5, "A.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_LIST, 84);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_LIST, "NUM. PROG");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_FORM, 332, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_FORM, 96);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_NUMEROPROG, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_NUMEROPROG, PPQRY_CFA5, "A.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_LIST, 24);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_LIST, "E S");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_FORM, 484, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_FORM, 40);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ES, MyGlb.PANEL_FORM, "E S");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ES, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ES, PPQRY_CFA5, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, 136);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ESERCIZIO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ESERCIZIO, PPQRY_CFA5, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.PANEL_LIST, 0, 40, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.PANEL_FORM, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO2, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_CAPITOLO2, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_CAPITOLO2, -1, "", "CAPITOLO2", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.PANEL_LIST, 184, 40, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.PANEL_FORM, 136, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO1, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_IMPEGNO1, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_IMPEGNO1, -1, "", "IMPEGNO1", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.PANEL_LIST, 316, 40, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.PANEL_FORM, 144, 8, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO1, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_SUBIMPEGNO1, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_SUBIMPEGNO1, -1, "", "SUBIMPEGNO1", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.PANEL_LIST, 184, 40, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.PANEL_FORM, 152, 16, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENT1, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ACCERTAMENT1, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ACCERTAMENT1, -1, "", "ACCERTAMENT1", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.PANEL_LIST, 208, 288, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.PANEL_FORM, 156, 264, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUENTR, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TOTAIMPUENTR, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TOTAIMPUENTR, -1, "", "TOTAIMPUENTR", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.PANEL_LIST, 316, 288, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.PANEL_FORM, 260, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TOTENTRATA, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TOTENTRATA, -1, "", "TOTENTRATA", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.PANEL_LIST, 0, 4, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.PANEL_FORM, 0, 4, 532, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ESTREMFATTUR, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ESTREMFATTUR, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ESTREMFATTUR, -1, "", "ESTREMFATTUR", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 40, 364, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 580, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_CAPITOLO, -1, GRP_IMPUTAZIONI_CAPITOLO);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_CAPITOLO, PPQRY_CAP, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAM14.ROWNAMEES~~,~~CAPITOLO~~,0)", "CAPCAPITOLO", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 44, 388, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 628, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ARTICOLO, -1, GRP_IMPUTAZIONI_CAPITOLO);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ARTICOLO, PPQRY_CAP, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAM14.ROWNAMEES~~,~~CAPITOLO~~,~~ARTICOLO~~)", "CAPARTICOLO", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 40, 416, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 64);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno ");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 4, 676, 460, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 100);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_IMPEGNO, MyGlb.PANEL_FORM, "Impegno ");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_IMPEGNO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_IMPEGNO, PPQRY_IMP1, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, 12, 416, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, 92);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento ");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 712, 460, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, 100);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accertamento ");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_ACCERTAMENTO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_ACCERTAMENTO, PPQRY_ACC, "A.DESCRIZIONE", "ACCDESCRIZIO", 5, 140, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 24, 440, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, "Subimpegno");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 748, 476, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 116);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, "Subimpegno");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_SUBIMPEGNO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_SUBIMPEGNO, PPQRY_SUBIMP, "A.DESCRIZIONE", "SUBIMPDESCRI", 5, 140, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.PANEL_LIST, 340, 288, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.PANEL_FORM, 164, 272, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTAIMPUSPES, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TOTAIMPUSPES, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TOTAIMPUSPES, -1, "", "TOTAIMPUSPES", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.PANEL_LIST, 448, 288, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.PANEL_FORM, 268, 268, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTSPESA, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TOTSPESA, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TOTSPESA, -1, "", "TOTSPESA", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_LIST, 84, 512, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_LIST, 48);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_FORM, 4, 784, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_FORM, 120);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_UTENTE1, -1, GRP_IMPUTAZIONI_INSERIMENTO);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_UTENTE1, PPQRY_CFA5, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_LIST, 252, 512, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_LIST, 36);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_FORM, 4, 808, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_FORM, 108);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_DATA1, -1, GRP_IMPUTAZIONI_INSERIMENTO);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_DATA1, PPQRY_CFA5, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_LIST, 464, 512, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_LIST, 48);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_FORM, 4, 832, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_FORM, 112);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_UTENTE, -1, GRP_IMPUTAZIONI_AGGIORNAMENT);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_UTENTE, PPQRY_CFA5, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_LIST, 632, 512, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_FORM, 4, 856, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_FORM, 100);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_DATA, -1, GRP_IMPUTAZIONI_AGGIORNAMENT);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_DATA, PPQRY_CFA5, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 880, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_PROGRESSIVO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_PROGRESSIVO, PPQRY_CFA5, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_LIST, 956, 76, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_LIST, 120);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_LIST, "NUMERO CONTABILE");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_FORM, 4, 1080, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_FORM, 120);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_NUMEROCONTAB, MyGlb.PANEL_FORM, "NUMERO CONTABILE");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_NUMEROCONTAB, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_NUMEROCONTAB, PPQRY_CFA5, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_LIST, 1024, 76, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_LIST, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_LIST, "DATA CONTABILE");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_FORM, 4, 1104, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_FORM, 104);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_DATACONTABIL, MyGlb.PANEL_FORM, "DATA CONTABILE");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_DATACONTABIL, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_DATACONTABIL, PPQRY_CFA5, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.PANEL_LIST, 956, 40, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.PANEL_FORM, 152, 16, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_CONTABILE, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_CONTABILE, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_CONTABILE, -1, "", "CONTABILE", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_LIST, 1108, 76, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_LIST, 124);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_LIST, "Tipo Bollato Def.");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_FORM, 4, 1176, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_FORM, 124);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04DESC, MyGlb.PANEL_FORM, "Tipo Bollato Def.");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_T04DESC, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_T04DESC, PPQRY_T04, "TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "T04DESC", 5, 142, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_LIST, 1108, 76, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_LIST, 120);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 1176, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_FORM, 120);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOREGISTRO, MyGlb.PANEL_FORM, "TIPO REGISTRO");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TIPOREGISTRO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TIPOREGISTRO, PPQRY_CFA5, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_LIST, 1228, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_LIST, 112);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 1200, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_FORM, 112);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TIPOBOLLATO, MyGlb.PANEL_FORM, "TIPO BOLLATO");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TIPOBOLLATO, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TIPOBOLLATO, PPQRY_CFA5, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_LIST, 160);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_LIST, "T04 Attivita Ist Bollato Def");
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_FORM, 4, 1212, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_FORM, 160);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_T04ATTISBODE, MyGlb.PANEL_FORM, "T04 Attivita Ist Bollato Def");
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_T04ATTISBODE, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_T04ATTISBODE, PPQRY_T04, "SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.TIPO_BOLLATO)", "ATTISTBOLDEF", 5, 99, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.PANEL_LIST, 536, 288, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.PANEL_FORM, 276, 276, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORTIVA, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TOTIMPORTIVA, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TOTIMPORTIVA, -1, "", "TOTIMPORTIVA", 0, 0, 0, -13997);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.PANEL_LIST, 624, 288, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.PANEL_FORM, 284, 284, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTAZIONI_TOTIMPORIVA1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTAZIONI.SetFieldPage(PFL_IMPUTAZIONI_TOTIMPORIVA1, -1, -1);
    PAN_IMPUTAZIONI.SetFieldPanel(PFL_IMPUTAZIONI_TOTIMPORIVA1, -1, "", "TOTIMPORIVA1", 0, 0, 0, -13997);
  }

  private void PAN_IMPUTAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPUTAZIONI.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAM14.ROWNAMEES~~,~~CAPITOLO~~,0) as CAPCAPITOLO, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAM14.ROWNAMEES~~,~~CAPITOLO~~,~~ARTICOLO~~) as CAPARTICOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(PPQRY_CAP, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(PPQRY_IMP1, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ACCDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.ANNO_ACC = ~~ANNO_ACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~NUMERO_ACC~~) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as SUBIMPDESCRI ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (A.ANNO_SUBIMP = ~~ANNO_SUBIMP~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~NUMERO_SUBIMP~~) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_SUBIMP, 0, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_SUBIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(PPQRY_SUBIMP, "SUBIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as DUALAPRIIMP, ");
    SQL.append("  'A' as DUAAPRSUBIMP, ");
    SQL.append("  'A' as DUAAPRVOCPEG, ");
    SQL.append("  'A' as DUALAPRIACC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ANNO_PROG~~ IS NULL))) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.TIPO_BOLLATO) as ATTISTBOLDEF, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESC ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.SERVIZIO ");
    SQL.append("from ");
    SQL.append("  IVA B ");
    SQL.append("where (B.ANNO_PROG = ~~ANNO_PROG~~) ");
    SQL.append("and   (B.NUMERO_PROG = ~~NUMERO_PROG~~) ");
    SQL.append("and   (B.TIPO_REGISTRO = 1) ");
    SQL.append(")) ");
    SQL.append("and   (A.TIPO_REGISTRO = 1) ");
    SQL.append("order by 2, 4 ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(PPQRY_T04, "T04");
    PAN_IMPUTAZIONI.SetQueryLKE(PPQRY_T04, PFL_IMPUTAZIONI_TIPOREGISTRO, "T04TIPOREGIS");
    PAN_IMPUTAZIONI.SetQueryLKE(PPQRY_T04, PFL_IMPUTAZIONI_TIPOBOLLATO, "T04TIPOBOLLA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.TIPO_BOLLATO) as ATTISTBOLDEF, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESC ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.SERVIZIO ");
    SQL.append("from ");
    SQL.append("  IVA B ");
    SQL.append("where (B.ANNO_PROG = ~~ANNO_PROG~~) ");
    SQL.append("and   (B.NUMERO_PROG = ~~NUMERO_PROG~~) ");
    SQL.append("and   (B.TIPO_REGISTRO = 1) ");
    SQL.append(")) ");
    SQL.append("and   (A.TIPO_REGISTRO = 1) ");
    SQL.append("order by 2, 4 ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_T04, 1, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryHeaderColumn(PPQRY_T04, "ATTISTBOLDEF", "Attivita Ist Bollato Def");
    PAN_IMPUTAZIONI.SetQueryHeaderColumn(PPQRY_T04, "T04DESC", "Desc");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as CFAUTEIMPIM1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as CFAUTEIMPIMP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_IMPUTAZIONI_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as CFAUTEIMPIM1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as CFAUTEIMPIMP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_IMPUTAZIONI_UTENTE1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as CFAUTE1IMPI1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as CFAUTE1IMPIM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_IMPUTAZIONI_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as CFAUTE1IMPI1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as CFAUTE1IMPIM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_IMPUTAZIONI_UTENTE, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetIMDB(IMDB, "PQRY_CFA5", true);
    PAN_IMPUTAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "CFA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  A.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.FLAG_LIQUIDATO as FLAG_LIQUIDATO, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_IMP IS NULL)) AND NOT ((A.NUMERO_IMP IS NULL)) THEN 'I' ELSE NULL END as CFAINFOIMPEG, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_SUBIMP IS NULL)) AND NOT ((A.NUMERO_SUBIMP IS NULL)) THEN 'I' ELSE NULL END as CFAINFSUBIMP, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_ACC IS NULL)) AND NOT ((A.NUMERO_ACC IS NULL)) THEN 'I' ELSE NULL END as CFAINFOACCER, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) AND NOT ((A.ARTICOLO IS NULL)) THEN 'I' ELSE NULL END as CFAINFOPEG, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.NUMERO_CONTABILE as NUMERO_CONTABILE, ");
    SQL.append("  A.DATA_CONTABILE as DATA_CONTABILE, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  A.IMPORTO_IVA_IST as IMPORTO_IVA_IST, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CFA5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFA A ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CFA5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~TBL_PARAM14.ROWNAMANNPRO~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARAM14.ROWNAMNUMPRO~~) ");
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CFA5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CFA5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CFA5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTAZIONI.SetQuery(PPQRY_CFA5, 5, SQL, -1, "");
    PAN_IMPUTAZIONI.SetQueryDB(PPQRY_CFA5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTAZIONI.SetMasterTable(0, "CFA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPUTAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_IMPUTAZIONI.iUseListQBE;
      PAN_IMPUTAZIONI.iUseListQBE = 0;
      PAN_IMPUTAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPUTAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_IMPUTAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_OnChangeRow();
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
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_IMPUTAZIONI) PAN_IMPUTAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
